@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * The default retention settings for an S3 Object Lock configuration.
 *
 * Example:
 *
 * ```
 * // Configure for governance mode with a duration of 7 years
 * // Configure for governance mode with a duration of 7 years
 * Bucket.Builder.create(this, "Bucket1")
 * .objectLockDefaultRetention(ObjectLockRetention.governance(Duration.days(7 * 365)))
 * .build();
 * // Configure for compliance mode with a duration of 1 year
 * // Configure for compliance mode with a duration of 1 year
 * Bucket.Builder.create(this, "Bucket2")
 * .objectLockDefaultRetention(ObjectLockRetention.compliance(Duration.days(365)))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html)
 */
public open class ObjectLockRetention internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention,
) : CdkObject(cdkObject) {
  /**
   * The default period for which objects should be retained.
   */
  public open fun duration(): Duration = unwrap(this).getDuration().let(Duration::wrap)

  /**
   * The retention mode to use for the object lock configuration.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-retention-modes)
   */
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
