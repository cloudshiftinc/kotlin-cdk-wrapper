@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationType

/**
 * Example:
 * ```
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .build();
 * VpcLink link = VpcLink.Builder.create(this, "link")
 * .targets(List.of(nlb))
 * .build();
 * Integration integration = Integration.Builder.create()
 * .type(IntegrationType.HTTP_PROXY)
 * .options(IntegrationOptions.builder()
 * .connectionType(ConnectionType.VPC_LINK)
 * .vpcLink(link)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class IntegrationPropsDsl {
    private val cdkBuilder: IntegrationProps.Builder = IntegrationProps.builder()

    /**
     * @param integrationHttpMethod The integration's HTTP method type. Required unless you use a
     *   MOCK integration.
     */
    public fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /** @param options Integration options. */
    public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(options)
        cdkBuilder.options(builder.build())
    }

    /** @param options Integration options. */
    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    /** @param type Specifies an API method integration type. */
    public fun type(type: IntegrationType) {
        cdkBuilder.type(type)
    }

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     * * If you specify HTTP for the `type` property, specify the API endpoint URL.
     * * If you specify MOCK for the `type` property, don't specify this property.
     * * If you specify AWS for the `type` property, specify an AWS service that follows this form:
     *   `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.` For
     *   example, a Lambda function URI follows this form:
     *   arn:partition:apigateway:region:lambda:path/path. The path is usually in the form
     *   /2015-03-31/functions/LambdaFunctionARN/invocations.
     */
    public fun uri(uri: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(uri)
        cdkBuilder.uri(builder.map)
    }

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     * * If you specify HTTP for the `type` property, specify the API endpoint URL.
     * * If you specify MOCK for the `type` property, don't specify this property.
     * * If you specify AWS for the `type` property, specify an AWS service that follows this form:
     *   `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.` For
     *   example, a Lambda function URI follows this form:
     *   arn:partition:apigateway:region:lambda:path/path. The path is usually in the form
     *   /2015-03-31/functions/LambdaFunctionARN/invocations.
     */
    public fun uri(uri: Any) {
        cdkBuilder.uri(uri)
    }

    public fun build(): IntegrationProps = cdkBuilder.build()
}
