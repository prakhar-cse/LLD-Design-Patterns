
class LLMTrainer extends ModelTrainer{

        public void preprocess_data(){
             System.out.println("---Preprocess Data for LLM---");
        }
        public void train_model(){
             System.out.println("---Train Model for LLM---");
        }
        public void eval_model(){
             System.out.println("---Evaluate Model for LLM---");
        }
        public void save_model(){
             System.out.println("---Save Model for LLM---");
        }
}