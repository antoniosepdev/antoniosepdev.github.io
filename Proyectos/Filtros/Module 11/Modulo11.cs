/*--------Autor: Antonio Sepúlveda--------*/
/*-----TODOS LOS DERECHOS RESERVADOS-----*/

    public class Modulo11 : ValidationAttribute
    {
        protected override ValidationResult IsValid(object value, ValidationContext validationContext)
        {
            string id = Convert.ToString(value);

            List<string> Listarid = new List<string>();
            //Se guarda dentro de una lista [1,2,3,4,5,6,7,8,-,9]
            for (int i = 0; i < id.Length; i++)
            {
                Listarid.Add(Convert.ToString(id[i]));
            }

            //Nuevo array guardando elementos antes del guión.
            List<int> Antesdelguion = new List<int>();
            for (int i = 0; i < Listarid.Count; i++)
            {
                if (Listarid[i].ToString() == "-")
                {
                    break;
                }
                else
                {
                    Antesdelguion.Add(Convert.ToInt32(Listarid[i]));
                }
            }
            //Ordenado de derecha a izquierda
            Antesdelguion.Reverse();
            //Multiplicar cada elemento
            List<int> Multiplicacion = new List<int>();
            int aux = 2;
            int multiplicar;
            for (int i = 0; i < Antesdelguion.Count; i++)
            {
                if (i >= 6)
                {
                    multiplicar = (Antesdelguion[i] * (aux));
                    Multiplicacion.Add(multiplicar);
                    aux++;
                }
                else
                {
                    multiplicar = (Antesdelguion[i] * (i + 2));
                    Multiplicacion.Add(multiplicar);
                }
            }
            //Sumatoria
            int Sumatoria = Multiplicacion.Sum();
            //División por 11
            int Division = Sumatoria / 11;
            int Resto = Sumatoria - (Division * 11);
            string Digito_verificador = Convert.ToString(11 - Resto);
            if (Digito_verificador == "10")
            {
                Digito_verificador = "K";
            }
            if (Digito_verificador == "11")
            {
                Digito_verificador = "0";
            }
            //Validación
            List<string> Validar = new List<string>();
            Antesdelguion.Reverse();
            for (int i = 0; i < Antesdelguion.Count; i++)
            {
                Validar.Add(Convert.ToString(Antesdelguion[i]));
            }
            Validar.Add("-");
            Validar.Add(Convert.ToString(Digito_verificador));
            string id_para_validar = string.Join(",", Validar).Replace(",", "");

            if (id == id_para_validar)
            {
                return ValidationResult.Success;
            }
            else
            {
                return new ValidationResult("ID no válido.");
            }
        }
    }