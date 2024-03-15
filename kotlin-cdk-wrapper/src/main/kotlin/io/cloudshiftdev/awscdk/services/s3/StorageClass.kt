@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Storage class to move an object to.
 *
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyBucket")
 * .lifecycleRules(List.of(LifecycleRule.builder()
 * .abortIncompleteMultipartUploadAfter(Duration.minutes(30))
 * .enabled(false)
 * .expiration(Duration.days(30))
 * .expirationDate(new Date())
 * .expiredObjectDeleteMarker(false)
 * .id("id")
 * .noncurrentVersionExpiration(Duration.days(30))
 * // the properties below are optional
 * .noncurrentVersionsToRetain(123)
 * .noncurrentVersionTransitions(List.of(NoncurrentVersionTransition.builder()
 * .storageClass(StorageClass.GLACIER)
 * .transitionAfter(Duration.days(30))
 * // the properties below are optional
 * .noncurrentVersionsToRetain(123)
 * .build()))
 * .objectSizeGreaterThan(500)
 * .prefix("prefix")
 * .objectSizeLessThan(10000)
 * .transitions(List.of(Transition.builder()
 * .storageClass(StorageClass.GLACIER)
 * // the properties below are optional
 * .transitionAfter(Duration.days(30))
 * .transitionDate(new Date())
 * .build()))
 * .build()))
 * .build();
 * ```
 */
public open class StorageClass internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.StorageClass,
) : CdkObject(cdkObject) {
  public constructor(`value`: String) :
      this(software.amazon.awscdk.services.s3.StorageClass(`value`))

  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val DEEP_ARCHIVE: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.DEEP_ARCHIVE)

    public val GLACIER: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.GLACIER)

    public val GLACIER_INSTANT_RETRIEVAL: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.GLACIER_INSTANT_RETRIEVAL)

    public val INFREQUENT_ACCESS: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.INFREQUENT_ACCESS)

    public val INTELLIGENT_TIERING: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.INTELLIGENT_TIERING)

    public val ONE_ZONE_INFREQUENT_ACCESS: StorageClass =
        StorageClass.wrap(software.amazon.awscdk.services.s3.StorageClass.ONE_ZONE_INFREQUENT_ACCESS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.StorageClass): StorageClass =
        StorageClass(cdkObject)

    internal fun unwrap(wrapped: StorageClass): software.amazon.awscdk.services.s3.StorageClass =
        wrapped.cdkObject
  }
}
