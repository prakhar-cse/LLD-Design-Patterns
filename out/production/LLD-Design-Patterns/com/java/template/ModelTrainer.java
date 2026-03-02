abstract class ModelTrainer {


	public void load_data() {
		System.out.println("---Loading Data General---");
	}
	abstract void preprocess_data();
	abstract void train_model();
	abstract void eval_model();
	abstract void save_model();

	public final void trainerTemplate() {

		load_data();
		preprocess_data();
		train_model();
		eval_model();
		save_model();
	}


}
