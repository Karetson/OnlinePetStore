package pl.onlinePetStore.Online.pet.Store.project.model.pets;

/*
 * Breeds class with enums for "breed" field
 */
public abstract class Breeds {
    enum DogBreed {
        HUSKY,
        BORDER_COLLIE,
        CHIHUAHUA,
        POODLE,
        BULLDOG,
        BEAGLE,
        COCKER_SPANIEL,
        GERMAN_SHEPHERD,
        PEKINGESE,
        PIT_BULL
    }

    enum CatBreed {
        BRITISH_SHORTHAIR,
        PERSIAN,
        SIAMESE,
        SCOTTISH_FOLD,
        SIBERIAN,
        SPHYNX
    }

    enum FishBreed {
        ALGAE_EATER,
        AKARA,
        FIGHTER,
        DANIO,
        GUPPY,
        GLADIOLUS,
        NEON,
        SCALAR
    }

    enum ParrotBreed {
        BUDGIE,
        CAROLINA_PARAKEET,
        GREY,
        MOLUCCAN,
        AFROTROPICAL
    }
}
