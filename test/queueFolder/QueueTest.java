package queueFolder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {
    private Queue myQueue;

    @BeforeEach
    public void startWith() {
        myQueue = new Queue();
}

    @Test
    public void testThatTheQueueIsEmpty() {

        assertEquals(true, myQueue.isEmpty());
    }

    @Test
    public void testThatTheQueueIsEmpty_AddOneThingTOTheEmptyQueue() {

        assertEquals(true, myQueue.isEmpty());

        myQueue.add("samuel");
        assertEquals(false, myQueue.isEmpty());
    }

    @Test
    public void testThatIAddMoreElementToTheQueueAndWhenIAddAndExtractOneItThrowAndException(){

        myQueue.add("second");
        myQueue.add("third");
        myQueue.add("fourth");
        myQueue.add("fifth");
        myQueue.add("samuel");
        assertThrows(IllegalArgumentException.class, () -> myQueue.add("mathew"));

    }

//    @Test
//    public void testThatIRemoveAnElementFromTheArray() {
//
//        myQueue.add("second");
//        myQueue.add("third");
//        myQueue.add("fourth");
//
//         myQueue.remove("second");
//        assertEquals(false, myQueue.isEmpty());
//
//    }

//    @Test
//    public void testThatRemoveAnElementFromAnEmptyArrayShouldThroughAnExpection() {
//
//        assertThrows(IllegalArgumentException.class,() -> myQueue.remove("samuel"));
//
//    }
}