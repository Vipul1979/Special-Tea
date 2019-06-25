package Interface;

    public class RBIindia implements USbank, UKbank {

       //create class and to interface write implements and interface class name
        //right click Generat - implements method
        @Override
        public void bankaccount() {
            System.out.println("US Bank - Bank account method added later");
        }
        @Override
        public void personalloan() {
            System.out.print("US Bank - perosnalloan provide good interest rate");
        }
        public void bankinterest(){
            System.out.println("RBI Bank intereset is affordable - this mathos also created later");
        }
        @Override
        public void mortgage() {
            System.out.println("UK Bank - mortgae repayment is very flexible");
        }
        public void overdraft(){
            System.out.println("RBI - overdraft fecilities are good");
        }

    }
