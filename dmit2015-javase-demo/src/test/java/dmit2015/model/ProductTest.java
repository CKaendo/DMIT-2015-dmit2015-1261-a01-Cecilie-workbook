package dmit2015.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
      void getPrice_whenProductCreated_shouldReturnCorrectPrice() {
        // Arrange
        Product currentProduct = new Product("Java Fundamentals", 59.99);
        // Act
        double actualPrice = currentProduct.getPrice();
        // Assert
        assertThat(actualPrice)
                .isCloseTo(59.99, within (0.01));
    }

    @Test
       void constructor_whenPriceIsNegative_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("InvalidPrice", -1.49)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}