@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Queue myQueue;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.addEventNotification(EventType.OBJECT_REMOVED, new SqsDestination(myQueue),
 * NotificationKeyFilter.builder()
 * .prefix("foo/")
 * .suffix(".jpg")
 * .build());
 * ```
 */
public interface NotificationKeyFilter {
  /**
   * S3 keys must have the specified prefix.
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * S3 keys must have the specified suffix.
   */
  public fun suffix(): String? = unwrap(this).getSuffix()

  /**
   * A builder for [NotificationKeyFilter]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param prefix S3 keys must have the specified prefix.
     */
    public fun prefix(prefix: String)

    /**
     * @param suffix S3 keys must have the specified suffix.
     */
    public fun suffix(suffix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder =
        software.amazon.awscdk.services.s3.NotificationKeyFilter.builder()

    /**
     * @param prefix S3 keys must have the specified prefix.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param suffix S3 keys must have the specified suffix.
     */
    override fun suffix(suffix: String) {
      cdkBuilder.suffix(suffix)
    }

    public fun build(): software.amazon.awscdk.services.s3.NotificationKeyFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.NotificationKeyFilter,
  ) : CdkObject(cdkObject), NotificationKeyFilter {
    /**
     * S3 keys must have the specified prefix.
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * S3 keys must have the specified suffix.
     */
    override fun suffix(): String? = unwrap(this).getSuffix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationKeyFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.NotificationKeyFilter):
        NotificationKeyFilter = CdkObjectWrappers.wrap(cdkObject) as NotificationKeyFilter

    internal fun unwrap(wrapped: NotificationKeyFilter):
        software.amazon.awscdk.services.s3.NotificationKeyFilter = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.NotificationKeyFilter
  }
}
