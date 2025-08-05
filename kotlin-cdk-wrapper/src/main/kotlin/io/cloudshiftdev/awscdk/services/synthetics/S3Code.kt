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
public open class S3Code(
  cdkObject: software.amazon.awscdk.services.synthetics.S3Code,
) : Code(cdkObject) {
  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.synthetics.S3Code(bucket.let(IBucket.Companion::unwrap),
      key)
  )

  public constructor(
    bucket: IBucket,
    key: String,
    objectVersion: String,
  ) : this(software.amazon.awscdk.services.synthetics.S3Code(bucket.let(IBucket.Companion::unwrap),
      key, objectVersion)
  )

  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @param _scope 
   * @param _handler 
   * @param _family 
   * @param _runtimeName
   */
  public override fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap), handler,
      family.let(RuntimeFamily.Companion::unwrap)).let(CodeConfig::wrap)

  /**
   * Called when the canary is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @param _scope 
   * @param _handler 
   * @param _family 
   * @param _runtimeName
   */
  public override fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
    runtimeName: String,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap), handler,
      family.let(RuntimeFamily.Companion::unwrap), runtimeName).let(CodeConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.synthetics.S3Code =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.S3Code
  }
}
