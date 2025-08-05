@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigateway.IRestApi
import kotlin.String
import kotlin.Unit

/**
 * Base properties for calling an REST API Endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * RestApi restApi;
 * CallApiGatewayRestApiEndpointOptions callApiGatewayRestApiEndpointOptions =
 * CallApiGatewayRestApiEndpointOptions.builder()
 * .api(restApi)
 * .stageName("stageName")
 * // the properties below are optional
 * .region("region")
 * .build();
 * ```
 */
public interface CallApiGatewayRestApiEndpointOptions {
  /**
   * API to call.
   */
  public fun api(): IRestApi

  /**
   * Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
   *
   * Default: - Uses the Region of the stack containing the `api`.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Name of the stage where the API is deployed to in API Gateway.
   */
  public fun stageName(): String

  /**
   * A builder for [CallApiGatewayRestApiEndpointOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api API to call. 
     */
    public fun api(api: IRestApi)

    /**
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     */
    public fun region(region: String)

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions.builder()

    /**
     * @param api API to call. 
     */
    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi.Companion::unwrap))
    }

    /**
     * @param region Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param stageName Name of the stage where the API is deployed to in API Gateway. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions,
  ) : CdkObject(cdkObject),
      CallApiGatewayRestApiEndpointOptions {
    /**
     * API to call.
     */
    override fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /**
     * Specify a custom Region where the API is deployed, e.g. 'us-east-1'.
     *
     * Default: - Uses the Region of the stack containing the `api`.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Name of the stage where the API is deployed to in API Gateway.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CallApiGatewayRestApiEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions):
        CallApiGatewayRestApiEndpointOptions = CdkObjectWrappers.wrap(cdkObject) as?
        CallApiGatewayRestApiEndpointOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayRestApiEndpointOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointOptions
  }
}
