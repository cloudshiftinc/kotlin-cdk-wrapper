@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for a Lambda destination.
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
public interface LambdaDestinationOptions {
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
   */
  public fun responseOnly(): Boolean? = unwrap(this).getResponseOnly()

  /**
   * A builder for [LambdaDestinationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseOnly Whether the destination function receives only the `responsePayload` of
     * the source function.
     * When set to `true` and used as `onSuccess` destination, the destination
     * function will be invoked with the payload returned by the source function.
     *
     * When set to `true` and used as `onFailure` destination, the destination
     * function will be invoked with the error object returned by source function.
     *
     * See the README of this module to see a full explanation of this option.
     */
    public fun responseOnly(responseOnly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions.Builder =
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions.builder()

    /**
     * @param responseOnly Whether the destination function receives only the `responsePayload` of
     * the source function.
     * When set to `true` and used as `onSuccess` destination, the destination
     * function will be invoked with the payload returned by the source function.
     *
     * When set to `true` and used as `onFailure` destination, the destination
     * function will be invoked with the error object returned by source function.
     *
     * See the README of this module to see a full explanation of this option.
     */
    override fun responseOnly(responseOnly: Boolean) {
      cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions,
  ) : CdkObject(cdkObject), LambdaDestinationOptions {
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
     */
    override fun responseOnly(): Boolean? = unwrap(this).getResponseOnly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions):
        LambdaDestinationOptions = CdkObjectWrappers.wrap(cdkObject) as? LambdaDestinationOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDestinationOptions):
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions
  }
}
