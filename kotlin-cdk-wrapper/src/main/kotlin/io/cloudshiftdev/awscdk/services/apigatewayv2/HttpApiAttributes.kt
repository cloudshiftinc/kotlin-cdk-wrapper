@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes for importing an HttpApi into the CDK.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApiAttributes httpApiAttributes = HttpApiAttributes.builder()
 * .httpApiId("httpApiId")
 * // the properties below are optional
 * .apiEndpoint("apiEndpoint")
 * .build();
 * ```
 */
public interface HttpApiAttributes {
  /**
   * The endpoint URL of the HttpApi.
   *
   * Default: - throws an error if apiEndpoint is accessed.
   */
  public fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

  /**
   * The identifier of the HttpApi.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#aws-resource-apigatewayv2-api-return-values)
   */
  public fun httpApiId(): String

  /**
   * A builder for [HttpApiAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiEndpoint The endpoint URL of the HttpApi.
     */
    public fun apiEndpoint(apiEndpoint: String)

    /**
     * @param httpApiId The identifier of the HttpApi. 
     */
    public fun httpApiId(httpApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes.builder()

    /**
     * @param apiEndpoint The endpoint URL of the HttpApi.
     */
    override fun apiEndpoint(apiEndpoint: String) {
      cdkBuilder.apiEndpoint(apiEndpoint)
    }

    /**
     * @param httpApiId The identifier of the HttpApi. 
     */
    override fun httpApiId(httpApiId: String) {
      cdkBuilder.httpApiId(httpApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes,
  ) : CdkObject(cdkObject), HttpApiAttributes {
    /**
     * The endpoint URL of the HttpApi.
     *
     * Default: - throws an error if apiEndpoint is accessed.
     */
    override fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

    /**
     * The identifier of the HttpApi.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#aws-resource-apigatewayv2-api-return-values)
     */
    override fun httpApiId(): String = unwrap(this).getHttpApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes):
        HttpApiAttributes = CdkObjectWrappers.wrap(cdkObject) as HttpApiAttributes

    internal fun unwrap(wrapped: HttpApiAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes
  }
}
