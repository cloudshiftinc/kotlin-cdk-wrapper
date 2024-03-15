@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * S3 bucket path to the code zip file.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * Bucket bucket;
 * S3Code s3Code = new S3Code(bucket, "key", "objectVersion");
 * ```
 */
public open class S3Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.S3Code,
) : Code(cdkObject) {
  public constructor(
    bucket: IBucket,
    key: String,
    objectVersion: String,
  ) : this(software.amazon.awscdk.services.synthetics.S3Code(IBucket.unwrap(bucket), key,
      objectVersion))

  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.synthetics.S3Code(IBucket.unwrap(bucket), key))

  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @param _scope 
   * @param _handler 
   * @param _family 
   */
  public override fun bind(
    _scope: Construct,
    _handler: String,
    _family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(_scope.let(Construct::unwrap), _handler,
      _family.let(RuntimeFamily::unwrap)).let(CodeConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.synthetics.S3Code =
        wrapped.cdkObject
  }
}
