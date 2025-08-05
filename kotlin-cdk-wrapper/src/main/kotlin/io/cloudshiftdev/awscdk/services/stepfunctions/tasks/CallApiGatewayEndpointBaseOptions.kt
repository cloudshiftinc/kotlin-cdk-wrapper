@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

/**
 * Base CallApiGatewayEdnpoint Task Props.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * TaskInput taskInput;
 * CallApiGatewayEndpointBaseOptions callApiGatewayEndpointBaseOptions =
 * CallApiGatewayEndpointBaseOptions.builder()
 * .method(HttpMethod.GET)
 * // the properties below are optional
 * .apiPath("apiPath")
 * .authType(AuthType.NO_AUTH)
 * .headers(taskInput)
 * .queryParameters(taskInput)
 * .requestBody(taskInput)
 * .build();
 * ```
 */
public interface CallApiGatewayEndpointBaseOptions {
  /**
   * Path parameters appended after API endpoint.
   *
   * Default: - No path
   */
  public fun apiPath(): String? = unwrap(this).getApiPath()

  /**
   * Authentication methods.
   *
   * Default: AuthType.NO_AUTH
   */
  public fun authType(): AuthType? = unwrap(this).getAuthType()?.let(AuthType::wrap)

  /**
   * HTTP request information that does not relate to contents of the request.
   *
   * Default: - No headers
   */
  public fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

  /**
   * Http method for the API.
   */
  public fun method(): HttpMethod

  /**
   * Query strings attatched to end of request.
   *
   * Default: - No query parameters
   */
  public fun queryParameters(): TaskInput? = unwrap(this).getQueryParameters()?.let(TaskInput::wrap)

  /**
   * HTTP Request body.
   *
   * Default: - No request body
   */
  public fun requestBody(): TaskInput? = unwrap(this).getRequestBody()?.let(TaskInput::wrap)

  /**
   * A builder for [CallApiGatewayEndpointBaseOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiPath Path parameters appended after API endpoint.
     */
    public fun apiPath(apiPath: String)

    /**
     * @param authType Authentication methods.
     */
    public fun authType(authType: AuthType)

    /**
     * @param headers HTTP request information that does not relate to contents of the request.
     */
    public fun headers(headers: TaskInput)

    /**
     * @param method Http method for the API. 
     */
    public fun method(method: HttpMethod)

    /**
     * @param queryParameters Query strings attatched to end of request.
     */
    public fun queryParameters(queryParameters: TaskInput)

    /**
     * @param requestBody HTTP Request body.
     */
    public fun requestBody(requestBody: TaskInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions.builder()

    /**
     * @param apiPath Path parameters appended after API endpoint.
     */
    override fun apiPath(apiPath: String) {
      cdkBuilder.apiPath(apiPath)
    }

    /**
     * @param authType Authentication methods.
     */
    override fun authType(authType: AuthType) {
      cdkBuilder.authType(authType.let(AuthType.Companion::unwrap))
    }

    /**
     * @param headers HTTP request information that does not relate to contents of the request.
     */
    override fun headers(headers: TaskInput) {
      cdkBuilder.headers(headers.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param method Http method for the API. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod.Companion::unwrap))
    }

    /**
     * @param queryParameters Query strings attatched to end of request.
     */
    override fun queryParameters(queryParameters: TaskInput) {
      cdkBuilder.queryParameters(queryParameters.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param requestBody HTTP Request body.
     */
    override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions,
  ) : CdkObject(cdkObject),
      CallApiGatewayEndpointBaseOptions {
    /**
     * Path parameters appended after API endpoint.
     *
     * Default: - No path
     */
    override fun apiPath(): String? = unwrap(this).getApiPath()

    /**
     * Authentication methods.
     *
     * Default: AuthType.NO_AUTH
     */
    override fun authType(): AuthType? = unwrap(this).getAuthType()?.let(AuthType::wrap)

    /**
     * HTTP request information that does not relate to contents of the request.
     *
     * Default: - No headers
     */
    override fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

    /**
     * Http method for the API.
     */
    override fun method(): HttpMethod = unwrap(this).getMethod().let(HttpMethod::wrap)

    /**
     * Query strings attatched to end of request.
     *
     * Default: - No query parameters
     */
    override fun queryParameters(): TaskInput? =
        unwrap(this).getQueryParameters()?.let(TaskInput::wrap)

    /**
     * HTTP Request body.
     *
     * Default: - No request body
     */
    override fun requestBody(): TaskInput? = unwrap(this).getRequestBody()?.let(TaskInput::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CallApiGatewayEndpointBaseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions):
        CallApiGatewayEndpointBaseOptions = CdkObjectWrappers.wrap(cdkObject) as?
        CallApiGatewayEndpointBaseOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayEndpointBaseOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseOptions
  }
}
