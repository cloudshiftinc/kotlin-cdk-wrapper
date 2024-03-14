package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration

public open class ObjectLockRetention internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention,
) {
  public open fun duration(): Duration = unwrap(this).getDuration().let(Duration::wrap)

  public open fun mode(): ObjectLockMode = unwrap(this).getMode().let(ObjectLockMode::wrap)

  public companion object {
    public open fun compliance(duration: Duration): ObjectLockRetention =
        software.amazon.awscdk.services.s3.ObjectLockRetention.compliance(duration.let(Duration::unwrap)).let(ObjectLockRetention::wrap)

    public open fun governance(duration: Duration): ObjectLockRetention =
        software.amazon.awscdk.services.s3.ObjectLockRetention.governance(duration.let(Duration::unwrap)).let(ObjectLockRetention::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention):
        ObjectLockRetention = ObjectLockRetention(cdkObject)

    internal fun unwrap(wrapped: ObjectLockRetention):
        software.amazon.awscdk.services.s3.ObjectLockRetention = wrapped.cdkObject
  }
}
