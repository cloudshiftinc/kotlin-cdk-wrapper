package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String

public open class S3ImportSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.S3ImportSource,
) : ImportSource(cdkObject) {
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
