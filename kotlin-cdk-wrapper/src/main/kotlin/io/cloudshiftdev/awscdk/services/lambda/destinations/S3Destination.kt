@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Use a S3 bucket as a Lambda destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.destinations.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3Destination s3Destination = new S3Destination(bucket);
 * ```
 */
public open class S3Destination(
  cdkObject: software.amazon.awscdk.services.lambda.destinations.S3Destination,
) : CdkObject(cdkObject),
    IDestination {
  public constructor(bucket: IBucket) :
      this(software.amazon.awscdk.services.lambda.destinations.S3Destination(bucket.let(IBucket.Companion::unwrap))
  )

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(scope: Construct, fn: IFunction): DestinationConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      fn.let(IFunction.Companion::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  public override fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      fn.let(IFunction.Companion::unwrap),
      options.let(DestinationOptions.Companion::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param _scope 
   * @param fn 
   * @param _options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public override fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(scope, fn, DestinationOptions(options))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.S3Destination):
        S3Destination = S3Destination(cdkObject)

    internal fun unwrap(wrapped: S3Destination):
        software.amazon.awscdk.services.lambda.destinations.S3Destination = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.destinations.S3Destination
  }
}
