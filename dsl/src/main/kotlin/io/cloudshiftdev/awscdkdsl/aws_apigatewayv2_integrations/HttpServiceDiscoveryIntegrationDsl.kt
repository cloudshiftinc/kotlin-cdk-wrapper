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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.IVpcLink
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.servicediscovery.IService

/**
 * The Service Discovery integration resource for HTTP API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.servicediscovery.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "Namespace")
 * .name("boobar.com")
 * .vpc(vpc)
 * .build();
 * Service service = namespace.createService("Service");
 * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
 * .defaultIntegration(HttpServiceDiscoveryIntegration.Builder.create("DefaultIntegration", service)
 * .vpcLink(vpcLink)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpServiceDiscoveryIntegrationDsl(
    id: String,
    service: IService,
) {
    private val cdkBuilder: HttpServiceDiscoveryIntegration.Builder =
        HttpServiceDiscoveryIntegration.Builder.create(id, service)

    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    public fun method(method: HttpMethod) {
        cdkBuilder.method(method)
    }

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     *
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     *
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     *   backend integration.
     */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     *
     * @param vpcLink The vpc link to be used for the private integration.
     */
    public fun vpcLink(vpcLink: IVpcLink) {
        cdkBuilder.vpcLink(vpcLink)
    }

    public fun build(): HttpServiceDiscoveryIntegration = cdkBuilder.build()
}
