@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Model model;
 * MethodResponse methodResponse = MethodResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", model))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build();
 * ```
 */
public interface MethodResponse {
  /**
   * The resources used for the response's content type.
   *
   * Specify response models as
   * key-value pairs (string-to-string maps), with a content type as the key and a Model
   * resource name as the value.
   *
   * Default: None
   */
  public fun responseModels(): Map<String, IModel> =
      unwrap(this).getResponseModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

  /**
   * Response parameters that API Gateway sends to the client that called a method.
   *
   * Specify response parameters as key-value pairs (string-to-Boolean maps), with
   * a destination as the key and a Boolean as the value. Specify the destination
   * using the following pattern: method.response.header.name, where the name is a
   * valid, unique header name. The Boolean specifies whether a parameter is required.
   *
   * Default: None
   */
  public fun responseParameters(): Map<String, Boolean> = unwrap(this).getResponseParameters() ?:
      emptyMap()

  /**
   * The method response's status code, which you map to an IntegrationResponse.
   *
   * Required.
   */
  public fun statusCode(): String

  /**
   * A builder for [MethodResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseModels The resources used for the response's content type.
     * Specify response models as
     * key-value pairs (string-to-string maps), with a content type as the key and a Model
     * resource name as the value.
     */
    public fun responseModels(responseModels: Map<String, IModel>)

    /**
     * @param responseParameters Response parameters that API Gateway sends to the client that
     * called a method.
     * Specify response parameters as key-value pairs (string-to-Boolean maps), with
     * a destination as the key and a Boolean as the value. Specify the destination
     * using the following pattern: method.response.header.name, where the name is a
     * valid, unique header name. The Boolean specifies whether a parameter is required.
     */
    public fun responseParameters(responseParameters: Map<String, Boolean>)

    /**
     * @param statusCode The method response's status code, which you map to an IntegrationResponse.
     * 
     * Required.
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodResponse.Builder =
        software.amazon.awscdk.services.apigateway.MethodResponse.builder()

    /**
     * @param responseModels The resources used for the response's content type.
     * Specify response models as
     * key-value pairs (string-to-string maps), with a content type as the key and a Model
     * resource name as the value.
     */
    override fun responseModels(responseModels: Map<String, IModel>) {
      cdkBuilder.responseModels(responseModels.mapValues{IModel.unwrap(it.value)})
    }

    /**
     * @param responseParameters Response parameters that API Gateway sends to the client that
     * called a method.
     * Specify response parameters as key-value pairs (string-to-Boolean maps), with
     * a destination as the key and a Boolean as the value. Specify the destination
     * using the following pattern: method.response.header.name, where the name is a
     * valid, unique header name. The Boolean specifies whether a parameter is required.
     */
    override fun responseParameters(responseParameters: Map<String, Boolean>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param statusCode The method response's status code, which you map to an IntegrationResponse.
     * 
     * Required.
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodResponse,
  ) : CdkObject(cdkObject), MethodResponse {
    /**
     * The resources used for the response's content type.
     *
     * Specify response models as
     * key-value pairs (string-to-string maps), with a content type as the key and a Model
     * resource name as the value.
     *
     * Default: None
     */
    override fun responseModels(): Map<String, IModel> =
        unwrap(this).getResponseModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

    /**
     * Response parameters that API Gateway sends to the client that called a method.
     *
     * Specify response parameters as key-value pairs (string-to-Boolean maps), with
     * a destination as the key and a Boolean as the value. Specify the destination
     * using the following pattern: method.response.header.name, where the name is a
     * valid, unique header name. The Boolean specifies whether a parameter is required.
     *
     * Default: None
     */
    override fun responseParameters(): Map<String, Boolean> = unwrap(this).getResponseParameters()
        ?: emptyMap()

    /**
     * The method response's status code, which you map to an IntegrationResponse.
     *
     * Required.
     */
    override fun statusCode(): String = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodResponse):
        MethodResponse = CdkObjectWrappers.wrap(cdkObject) as MethodResponse

    internal fun unwrap(wrapped: MethodResponse):
        software.amazon.awscdk.services.apigateway.MethodResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.MethodResponse
  }
}
