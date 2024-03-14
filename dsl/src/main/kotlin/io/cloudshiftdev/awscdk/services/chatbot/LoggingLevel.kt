package io.cloudshiftdev.awscdk.services.chatbot

public enum class LoggingLevel(
  private val cdkObject: software.amazon.awscdk.services.chatbot.LoggingLevel,
) {
  ERROR(software.amazon.awscdk.services.chatbot.LoggingLevel.ERROR),
  INFO(software.amazon.awscdk.services.chatbot.LoggingLevel.INFO),
  NONE(software.amazon.awscdk.services.chatbot.LoggingLevel.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.LoggingLevel): LoggingLevel
        = when (cdkObject) {
      software.amazon.awscdk.services.chatbot.LoggingLevel.ERROR -> LoggingLevel.ERROR
      software.amazon.awscdk.services.chatbot.LoggingLevel.INFO -> LoggingLevel.INFO
      software.amazon.awscdk.services.chatbot.LoggingLevel.NONE -> LoggingLevel.NONE
    }

    internal fun unwrap(wrapped: LoggingLevel): software.amazon.awscdk.services.chatbot.LoggingLevel
        = wrapped.cdkObject
  }
}
