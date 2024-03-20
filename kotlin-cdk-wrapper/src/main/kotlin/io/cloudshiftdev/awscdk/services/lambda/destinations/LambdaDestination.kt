@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.DestinationOptions
import io.cloudshiftdev.awscdk.services.lambda.IDestination
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Use a Lambda function as a Lambda destination.
 *
 * Example:
 *
 * ```
 * // Auto-extract response payload with a lambda destination
 * Function destinationFn;
 * Function sourceFn = Function.Builder.create(this, "Source")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * // auto-extract on success
 * .onSuccess(LambdaDestination.Builder.create(destinationFn)
 * .responseOnly(true)
 * .build())
 * .build();
 * ```
 */
public open class LambdaDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.destinations.LambdaDestination,
) : CdkObject(cdkObject), IDestination {
  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.services.lambda.destinations.LambdaDestination(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaDestinationOptions) :
      this(software.amazon.awscdk.services.lambda.destinations.LambdaDestination(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap),
      options.let(LambdaDestinationOptions::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaDestinationOptions.Builder.() -> Unit) : this(fn,
      LambdaDestinationOptions(options)
  )

  /**
   * Returns a destination configuration.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public override fun bind(scope: Construct, fn: CloudshiftdevAwscdkServicesLambdaIFunction):
      DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public override fun bind(
    scope: Construct,
    fn: CloudshiftdevAwscdkServicesLambdaIFunction,
    options: DestinationOptions,
  ): DestinationConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap),
      options.let(DestinationOptions::unwrap)).let(DestinationConfig::wrap)

  /**
   * Returns a destination configuration.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public override fun bind(
    scope: Construct,
    fn: CloudshiftdevAwscdkServicesLambdaIFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig = bind(scope, fn, DestinationOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.destinations.LambdaDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the destination function receives only the `responsePayload` of the source function.
     *
     * When set to `true` and used as `onSuccess` destination, the destination
     * function will be invoked with the payload returned by the source function.
     *
     * When set to `true` and used as `onFailure` destination, the destination
     * function will be invoked with the error object returned by source function.
     *
     * See the README of this module to see a full explanation of this option.
     *
     * Default: false The destination function receives the full invocation record.
     *
     * @param responseOnly Whether the destination function receives only the `responsePayload` of
     * the source function. 
     */
    public fun responseOnly(responseOnly: Boolean)
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination.Builder =
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination.Builder.create(fn)

    /**
     * Whether the destination function receives only the `responsePayload` of the source function.
     *
     * When set to `true` and used as `onSuccess` destination, the destination
     * function will be invoked with the payload returned by the source function.
     *
     * When set to `true` and used as `onFailure` destination, the destination
     * function will be invoked with the error object returned by source function.
     *
     * See the README of this module to see a full explanation of this option.
     *
     * Default: false The destination function receives the full invocation record.
     *
     * @param responseOnly Whether the destination function receives only the `responsePayload` of
     * the source function. 
     */
    override fun responseOnly(responseOnly: Boolean) {
      cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): software.amazon.awscdk.services.lambda.destinations.LambdaDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaDestination {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(fn))
      return LambdaDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.lambda.destinations.LambdaDestination = wrapped.cdkObject
  }
}
