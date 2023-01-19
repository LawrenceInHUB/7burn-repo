package student.raveenlawrence.a7burn

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.transparent_jumping_jacks_background_52650_149239,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val highKnees = ExerciseModel(
            2,"High Knees",R.drawable.__high_knees,false,false
        )
        exerciseList.add(highKnees)

        val lunges = ExerciseModel(
            3,"Lunges",R.drawable.lunge_600x600_png,false,false
        )
        exerciseList.add(lunges)

        val pushups = ExerciseModel(4,"Push-Ups",R.drawable.boy_doing_push_up_exercise_on_a_floor_mat_vector_illustration_man_doing_push_ups_for_body_strength_and_muscle_buildup_bodybuilder_flat_character_design_doing_push_up_exercise_vector_free_png,
            false,false)
        exerciseList.add(pushups)

        val plank = ExerciseModel(5,"Plank",R.drawable.image_asset,false,false)
        exerciseList.add(plank)

        val sidePlankRight = ExerciseModel(6,"Side Plank-Right",R.drawable.side_plank,false,false)
        exerciseList.add(sidePlankRight)

        val sidePlankLeft = ExerciseModel(7,"Side Plank-Left",R.drawable.forearm_side_plank,false,false)
        exerciseList.add(sidePlankLeft)

        val crunches = ExerciseModel(8,"Crunches",R.drawable.encogimientos_init_pos_6692,false,false)
        exerciseList.add(crunches)

        val bicycleCrunches = ExerciseModel(9,"Bicycle Crunches",R.drawable.exercise_03,false,false)
        exerciseList.add(bicycleCrunches)

        val obliqueSideCrunches = ExerciseModel(10,"Oblique Side Crunches",R.drawable._6_lying_windshield_wipers_1,false,
        false)
        exerciseList.add(obliqueSideCrunches)

        val squats = ExerciseModel(11,"Squats",R.drawable.bodyweight_squat_600x600_png,false,false)
        exerciseList.add(squats)

        val wallSquats = ExerciseModel(12,"Wall Squats",R.drawable.media_sentadilla_isometrica_init_pos_7734,false,false)
        exerciseList.add(wallSquats)

        return exerciseList
    }
}