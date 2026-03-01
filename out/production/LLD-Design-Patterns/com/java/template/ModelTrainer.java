abstract class ModelTrainer{

  public load_data();
  public preprocess_data();
  public train_model();
  public eval_model();
  public save_model();

  public trainerTemplate(){

        load_data();
        preprocess_data();
        train_model();
        eval_model();
        save_model();
  }
  

}
