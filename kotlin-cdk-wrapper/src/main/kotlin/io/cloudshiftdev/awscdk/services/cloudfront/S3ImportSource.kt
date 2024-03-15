@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String

/**
 * An import source from an S3 object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3ImportSource s3ImportSource = new S3ImportSource(bucket, "key");
 * ```
 */
public open class S3ImportSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.S3ImportSource,
) : ImportSource(cdkObject) {
  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.cloudfront.S3ImportSource(bucket.let(IBucket::unwrap),
      key)
  )

  /**
   * the S3 bucket that contains the data.
   */
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * the key within the S3 bucket that contains the data.
   */
  public open fun key(): String = unwrap(this).getKey()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3ImportSource):
        S3ImportSource = S3ImportSource(cdkObject)

    internal fun unwrap(wrapped: S3ImportSource):
        software.amazon.awscdk.services.cloudfront.S3ImportSource = wrapped.cdkObject
  }
}
