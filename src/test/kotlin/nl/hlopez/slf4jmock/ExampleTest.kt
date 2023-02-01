package nl.hlopez.slf4jmock

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.slf4j.Logger

@ExtendWith(MockitoExtension::class)
class ExampleTest {

    @Mock
    lateinit var logger: Logger

    @InjectMocks
    lateinit var sut: Example

    private val info_test_message = "info log test message"

    @Test
    fun methodWithLogInfo() {
        // when
        sut.methodWithLogInfo(info_test_message)

        // then
        Mockito.verify(logger).info(info_test_message)
        Mockito.verifyNoMoreInteractions(logger)
    }
}
