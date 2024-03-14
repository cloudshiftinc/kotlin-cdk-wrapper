package io.cloudshiftdev.awscdk.services.sns

public enum class LoggingProtocol(
  private val cdkObject: software.amazon.awscdk.services.sns.LoggingProtocol,
) {
  HTTP(software.amazon.awscdk.services.sns.LoggingProtocol.HTTP),
  SQS(software.amazon.awscdk.services.sns.LoggingProtocol.SQS),
  LAMBDA(software.amazon.awscdk.services.sns.LoggingProtocol.LAMBDA),
  FIREHOSE(software.amazon.awscdk.services.sns.LoggingProtocol.FIREHOSE),
  APPLICATION(software.amazon.awscdk.services.sns.LoggingProtocol.APPLICATION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.LoggingProtocol):
        LoggingProtocol = when (cdkObject) {
      software.amazon.awscdk.services.sns.LoggingProtocol.HTTP -> LoggingProtocol.HTTP
      software.amazon.awscdk.services.sns.LoggingProtocol.SQS -> LoggingProtocol.SQS
      software.amazon.awscdk.services.sns.LoggingProtocol.LAMBDA -> LoggingProtocol.LAMBDA
      software.amazon.awscdk.services.sns.LoggingProtocol.FIREHOSE -> LoggingProtocol.FIREHOSE
      software.amazon.awscdk.services.sns.LoggingProtocol.APPLICATION -> LoggingProtocol.APPLICATION
    }

    internal fun unwrap(wrapped: LoggingProtocol):
        software.amazon.awscdk.services.sns.LoggingProtocol = wrapped.cdkObject
  }
}
