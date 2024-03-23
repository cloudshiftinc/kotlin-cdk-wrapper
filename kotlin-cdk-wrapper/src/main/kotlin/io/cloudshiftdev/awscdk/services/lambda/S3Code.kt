@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String

/**
 * Lambda code from an S3 archive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3Code s3Code = new S3Code(bucket, "key", "objectVersion");
 * ```
 */
public open class S3Code(
  cdkObject: software.amazon.awscdk.services.lambda.S3Code,
) : Code(cdkObject) {
  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.lambda.S3Code(bucket.let(IBucket::unwrap), key)
  )

  public constructor(
    bucket: IBucket,
    key: String,
    objectVersion: String,
  ) : this(software.amazon.awscdk.services.lambda.S3Code(bucket.let(IBucket::unwrap), key,
      objectVersion)
  )

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.lambda.S3Code =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.S3Code
  }
}
