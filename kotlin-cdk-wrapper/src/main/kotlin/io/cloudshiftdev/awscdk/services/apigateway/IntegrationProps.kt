@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .build();
 * VpcLink link = VpcLink.Builder.create(this, "link")
 * .targets(List.of(nlb))
 * .build();
 * Integration integration = Integration.Builder.create()
 * .type(IntegrationType.HTTP_PROXY)
 * .integrationHttpMethod("ANY")
 * .options(IntegrationOptions.builder()
 * .connectionType(ConnectionType.VPC_LINK)
 * .vpcLink(link)
 * .build())
 * .build();
 * ```
 */
public interface IntegrationProps {
  /**
   * The integration's HTTP method type.
   *
   * Required unless you use a MOCK integration.
   */
  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  /**
   * Integration options.
   */
  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  /**
   * Specifies an API method integration type.
   */
  public fun type(): IntegrationType

  /**
   * The Uniform Resource Identifier (URI) for the integration.
   *
   * * If you specify HTTP for the `type` property, specify the API endpoint URL.
   * * If you specify MOCK for the `type` property, don't specify this property.
   * * If you specify AWS for the `type` property, specify an AWS service that
   * follows this form:
   * `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
   * For example, a Lambda function URI follows this form:
   * arn:partition:apigateway:region:lambda:path/path. The path is usually in the
   * form /2015-03-31/functions/LambdaFunctionARN/invocations.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
   */
  public fun uri(): Any? = unwrap(this).getUri()

  /**
   * A builder for [IntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     * Required unless you use a MOCK integration.
     */
    public fun integrationHttpMethod(integrationHttpMethod: String)

    /**
     * @param options Integration options.
     */
    public fun options(options: IntegrationOptions)

    /**
     * @param options Integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4fac92f4a9aa5b65ea57600909a6aa5492fafabb69a418b0e4f4512cec2aaeb")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * @param type Specifies an API method integration type. 
     */
    public fun type(type: IntegrationType)

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     * * If you specify HTTP for the `type` property, specify the API endpoint URL.
     * * If you specify MOCK for the `type` property, don't specify this property.
     * * If you specify AWS for the `type` property, specify an AWS service that
     * follows this form:
     * `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
     * For example, a Lambda function URI follows this form:
     * arn:partition:apigateway:region:lambda:path/path. The path is usually in the
     * form /2015-03-31/functions/LambdaFunctionARN/invocations.
     */
    public fun uri(uri: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationProps.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationProps.builder()

    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     * Required unless you use a MOCK integration.
     */
    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /**
     * @param options Integration options.
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    /**
     * @param options Integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4fac92f4a9aa5b65ea57600909a6aa5492fafabb69a418b0e4f4512cec2aaeb")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * @param type Specifies an API method integration type. 
     */
    override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     * * If you specify HTTP for the `type` property, specify the API endpoint URL.
     * * If you specify MOCK for the `type` property, don't specify this property.
     * * If you specify AWS for the `type` property, specify an AWS service that
     * follows this form:
     * `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
     * For example, a Lambda function URI follows this form:
     * arn:partition:apigateway:region:lambda:path/path. The path is usually in the
     * form /2015-03-31/functions/LambdaFunctionARN/invocations.
     */
    override fun uri(uri: Any) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationProps,
  ) : CdkObject(cdkObject), IntegrationProps {
    /**
     * The integration's HTTP method type.
     *
     * Required unless you use a MOCK integration.
     */
    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    /**
     * Integration options.
     */
    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    /**
     * Specifies an API method integration type.
     */
    override fun type(): IntegrationType = unwrap(this).getType().let(IntegrationType::wrap)

    /**
     * The Uniform Resource Identifier (URI) for the integration.
     *
     * * If you specify HTTP for the `type` property, specify the API endpoint URL.
     * * If you specify MOCK for the `type` property, don't specify this property.
     * * If you specify AWS for the `type` property, specify an AWS service that
     * follows this form:
     * `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
     * For example, a Lambda function URI follows this form:
     * arn:partition:apigateway:region:lambda:path/path. The path is usually in the
     * form /2015-03-31/functions/LambdaFunctionARN/invocations.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
     */
    override fun uri(): Any? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationProps):
        IntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? IntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationProps):
        software.amazon.awscdk.services.apigateway.IntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IntegrationProps
  }
}
