@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * RestApi restApi;
 * RequestValidatorProps requestValidatorProps = RequestValidatorProps.builder()
 * .restApi(restApi)
 * // the properties below are optional
 * .requestValidatorName("requestValidatorName")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build();
 * ```
 */
public interface RequestValidatorProps : RequestValidatorOptions {
  /**
   * The rest API that this model is part of.
   *
   * The reason we need the RestApi object itself and not just the ID is because the model
   * is being tracked by the top-level RestApi object for the purpose of calculating it's
   * hash to determine the ID of the deployment. This allows us to automatically update
   * the deployment when the model of the REST API changes.
   */
  public fun restApi(): IRestApi

  /**
   * A builder for [RequestValidatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param requestValidatorName The name of this request validator.
     */
    public fun requestValidatorName(requestValidatorName: String)

    /**
     * @param restApi The rest API that this model is part of. 
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    public fun restApi(restApi: IRestApi)

    /**
     * @param validateRequestBody Indicates whether to validate the request body according to the
     * configured schema for the targeted API and method.
     */
    public fun validateRequestBody(validateRequestBody: Boolean)

    /**
     * @param validateRequestParameters Indicates whether to validate request parameters.
     */
    public fun validateRequestParameters(validateRequestParameters: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestValidatorProps.Builder
        = software.amazon.awscdk.services.apigateway.RequestValidatorProps.builder()

    /**
     * @param requestValidatorName The name of this request validator.
     */
    override fun requestValidatorName(requestValidatorName: String) {
      cdkBuilder.requestValidatorName(requestValidatorName)
    }

    /**
     * @param restApi The rest API that this model is part of. 
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi.Companion::unwrap))
    }

    /**
     * @param validateRequestBody Indicates whether to validate the request body according to the
     * configured schema for the targeted API and method.
     */
    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * @param validateRequestParameters Indicates whether to validate request parameters.
     */
    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestValidatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorProps,
  ) : CdkObject(cdkObject), RequestValidatorProps {
    /**
     * The name of this request validator.
     *
     * Default: None
     */
    override fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

    /**
     * The rest API that this model is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    /**
     * Indicates whether to validate the request body according to the configured schema for the
     * targeted API and method.
     *
     * Default: false
     */
    override fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

    /**
     * Indicates whether to validate request parameters.
     *
     * Default: false
     */
    override fun validateRequestParameters(): Boolean? = unwrap(this).getValidateRequestParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestValidatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorProps):
        RequestValidatorProps = CdkObjectWrappers.wrap(cdkObject) as? RequestValidatorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestValidatorProps):
        software.amazon.awscdk.services.apigateway.RequestValidatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RequestValidatorProps
  }
}
