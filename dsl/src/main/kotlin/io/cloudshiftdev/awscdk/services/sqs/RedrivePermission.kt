package io.cloudshiftdev.awscdk.services.sqs

public enum class RedrivePermission(
  private val cdkObject: software.amazon.awscdk.services.sqs.RedrivePermission,
) {
  ALLOW_ALL(software.amazon.awscdk.services.sqs.RedrivePermission.ALLOW_ALL),
  DENY_ALL(software.amazon.awscdk.services.sqs.RedrivePermission.DENY_ALL),
  BY_QUEUE(software.amazon.awscdk.services.sqs.RedrivePermission.BY_QUEUE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.RedrivePermission):
        RedrivePermission = when (cdkObject) {
      software.amazon.awscdk.services.sqs.RedrivePermission.ALLOW_ALL -> RedrivePermission.ALLOW_ALL
      software.amazon.awscdk.services.sqs.RedrivePermission.DENY_ALL -> RedrivePermission.DENY_ALL
      software.amazon.awscdk.services.sqs.RedrivePermission.BY_QUEUE -> RedrivePermission.BY_QUEUE
    }

    internal fun unwrap(wrapped: RedrivePermission):
        software.amazon.awscdk.services.sqs.RedrivePermission = wrapped.cdkObject
  }
}
