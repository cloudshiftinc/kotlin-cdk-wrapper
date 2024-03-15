@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject

public open class ObjectLockRetention internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention,
) : CdkObject(cdkObject) {
  public open fun duration(): Duration = unwrap(this).getDuration().let(Duration::wrap)

  public open fun mode(): ObjectLockMode = unwrap(this).getMode().let(ObjectLockMode::wrap)

  public companion object {
    public fun compliance(duration: Duration): ObjectLockRetention =
        software.amazon.awscdk.services.s3.ObjectLockRetention.compliance(duration.let(Duration::unwrap)).let(ObjectLockRetention::wrap)

    public fun governance(duration: Duration): ObjectLockRetention =
        software.amazon.awscdk.services.s3.ObjectLockRetention.governance(duration.let(Duration::unwrap)).let(ObjectLockRetention::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention):
        ObjectLockRetention = ObjectLockRetention(cdkObject)

    internal fun unwrap(wrapped: ObjectLockRetention):
        software.amazon.awscdk.services.s3.ObjectLockRetention = wrapped.cdkObject
  }
}
