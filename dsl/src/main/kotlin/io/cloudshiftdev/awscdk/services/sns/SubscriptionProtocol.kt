package io.cloudshiftdev.awscdk.services.sns

public enum class SubscriptionProtocol(
  private val cdkObject: software.amazon.awscdk.services.sns.SubscriptionProtocol,
) {
  HTTP(software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTP),
  HTTPS(software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTPS),
  EMAIL(software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL),
  EMAIL_JSON(software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL_JSON),
  SMS(software.amazon.awscdk.services.sns.SubscriptionProtocol.SMS),
  SQS(software.amazon.awscdk.services.sns.SubscriptionProtocol.SQS),
  APPLICATION(software.amazon.awscdk.services.sns.SubscriptionProtocol.APPLICATION),
  LAMBDA(software.amazon.awscdk.services.sns.SubscriptionProtocol.LAMBDA),
  FIREHOSE(software.amazon.awscdk.services.sns.SubscriptionProtocol.FIREHOSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.SubscriptionProtocol):
        SubscriptionProtocol = when (cdkObject) {
      software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTP -> SubscriptionProtocol.HTTP
      software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTPS -> SubscriptionProtocol.HTTPS
      software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL -> SubscriptionProtocol.EMAIL
      software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL_JSON ->
          SubscriptionProtocol.EMAIL_JSON
      software.amazon.awscdk.services.sns.SubscriptionProtocol.SMS -> SubscriptionProtocol.SMS
      software.amazon.awscdk.services.sns.SubscriptionProtocol.SQS -> SubscriptionProtocol.SQS
      software.amazon.awscdk.services.sns.SubscriptionProtocol.APPLICATION ->
          SubscriptionProtocol.APPLICATION
      software.amazon.awscdk.services.sns.SubscriptionProtocol.LAMBDA -> SubscriptionProtocol.LAMBDA
      software.amazon.awscdk.services.sns.SubscriptionProtocol.FIREHOSE ->
          SubscriptionProtocol.FIREHOSE
    }

    internal fun unwrap(wrapped: SubscriptionProtocol):
        software.amazon.awscdk.services.sns.SubscriptionProtocol = wrapped.cdkObject
  }
}
