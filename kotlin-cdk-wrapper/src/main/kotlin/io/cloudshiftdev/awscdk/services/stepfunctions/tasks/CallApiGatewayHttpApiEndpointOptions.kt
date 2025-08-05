@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Base properties for calling an HTTP API Endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Stack stack;
 * CallApiGatewayHttpApiEndpointOptions callApiGatewayHttpApiEndpointOptions =
 * CallApiGatewayHttpApiEndpointOptions.builder()
 * .apiId("apiId")
 * .apiStack(stack)
 * // the properties below are optional
 * .stageName("stageName")
 * .build();
 * ```
 */
public interface CallApiGatewayHttpApiEndpointOptions {
  /**
   * The Id of the API to call.
   */
  public fun apiId(): String

  /**
   * The Stack in which the API is defined.
   */
  public fun apiStack(): Stack

  /**
   * Name of the stage where the API is deployed to in API Gateway.
   *
   * Default: '$default'
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [CallApiGatewayHttpApiEndpointOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The Id of the API to call. 
     */
    public fun apiId(apiId: String)

    /**
     * @param apiStack The Stack in which the API is defined. 
     */
    public fun apiStack(apiStack: Stack)

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions.builder()

    /**
     * @param apiId The Id of the API to call. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param apiStack The Stack in which the API is defined. 
     */
    override fun apiStack(apiStack: Stack) {
      cdkBuilder.apiStack(apiStack.let(Stack.Companion::unwrap))
    }

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions,
  ) : CdkObject(cdkObject),
      CallApiGatewayHttpApiEndpointOptions {
    /**
     * The Id of the API to call.
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The Stack in which the API is defined.
     */
    override fun apiStack(): Stack = unwrap(this).getApiStack().let(Stack::wrap)

    /**
     * Name of the stage where the API is deployed to in API Gateway.
     *
     * Default: '$default'
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CallApiGatewayHttpApiEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions):
        CallApiGatewayHttpApiEndpointOptions = CdkObjectWrappers.wrap(cdkObject) as?
        CallApiGatewayHttpApiEndpointOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayHttpApiEndpointOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointOptions
  }
}
