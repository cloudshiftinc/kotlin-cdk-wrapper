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
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.IVpcLink
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping

/**
 * Properties to initialize `HttpServiceDiscoveryIntegration`.
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
public class HttpServiceDiscoveryIntegrationPropsDsl {
    private val cdkBuilder: HttpServiceDiscoveryIntegrationProps.Builder =
        HttpServiceDiscoveryIntegrationProps.builder()

    /** @param method The HTTP method that must be used to invoke the underlying HTTP proxy. */
    public fun method(method: HttpMethod) {
        cdkBuilder.method(method)
    }

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     *   backend integration.
     */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    /** @param vpcLink The vpc link to be used for the private integration. */
    public fun vpcLink(vpcLink: IVpcLink) {
        cdkBuilder.vpcLink(vpcLink)
    }

    public fun build(): HttpServiceDiscoveryIntegrationProps = cdkBuilder.build()
}
