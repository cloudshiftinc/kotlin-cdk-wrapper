package io.cloudshiftdev.awscdk.services.s3

public enum class BucketNotificationDestinationType(
  private val cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationType,
) {
  LAMBDA(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.LAMBDA),
  QUEUE(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.QUEUE),
  TOPIC(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.TOPIC),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketNotificationDestinationType):
        BucketNotificationDestinationType = when (cdkObject) {
      software.amazon.awscdk.services.s3.BucketNotificationDestinationType.LAMBDA ->
          BucketNotificationDestinationType.LAMBDA
      software.amazon.awscdk.services.s3.BucketNotificationDestinationType.QUEUE ->
          BucketNotificationDestinationType.QUEUE
      software.amazon.awscdk.services.s3.BucketNotificationDestinationType.TOPIC ->
          BucketNotificationDestinationType.TOPIC
    }

    internal fun unwrap(wrapped: BucketNotificationDestinationType):
        software.amazon.awscdk.services.s3.BucketNotificationDestinationType = wrapped.cdkObject
  }
}
