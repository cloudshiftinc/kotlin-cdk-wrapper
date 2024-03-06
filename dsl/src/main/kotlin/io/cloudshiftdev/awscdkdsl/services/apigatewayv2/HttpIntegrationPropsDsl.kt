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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.HttpConnectionType
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion

/**
 * The integration properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * IntegrationCredentials integrationCredentials;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
 * .httpApi(httpApi)
 * .integrationType(HttpIntegrationType.HTTP_PROXY)
 * // the properties below are optional
 * .connectionId("connectionId")
 * .connectionType(HttpConnectionType.VPC_LINK)
 * .credentials(integrationCredentials)
 * .integrationSubtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
 * .integrationUri("integrationUri")
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .payloadFormatVersion(payloadFormatVersion)
 * .secureServerName("secureServerName")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpIntegrationPropsDsl {
    private val cdkBuilder: HttpIntegrationProps.Builder = HttpIntegrationProps.builder()

    /**
     * @param connectionId The ID of the VPC link for a private integration. Supported only for HTTP
     *   APIs.
     */
    public fun connectionId(connectionId: String) {
        cdkBuilder.connectionId(connectionId)
    }

    /** @param connectionType The type of the network connection to the integration endpoint. */
    public fun connectionType(connectionType: HttpConnectionType) {
        cdkBuilder.connectionType(connectionType)
    }

    /** @param credentials The credentials with which to invoke the integration. */
    public fun credentials(credentials: IntegrationCredentials) {
        cdkBuilder.credentials(credentials)
    }

    /** @param httpApi The HTTP API to which this integration should be bound. */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /**
     * @param integrationSubtype Integration subtype. Used for AWS Service integrations, specifies
     *   the target of the integration.
     */
    public fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype) {
        cdkBuilder.integrationSubtype(integrationSubtype)
    }

    /** @param integrationType Integration type. */
    public fun integrationType(integrationType: HttpIntegrationType) {
        cdkBuilder.integrationType(integrationType)
    }

    /**
     * @param integrationUri Integration URI. This will be the function ARN in the case of
     *   `HttpIntegrationType.AWS_PROXY`, or HTTP URL in the case of
     *   `HttpIntegrationType.HTTP_PROXY`.
     */
    public fun integrationUri(integrationUri: String) {
        cdkBuilder.integrationUri(integrationUri)
    }

    /** @param method The HTTP method to use when calling the underlying HTTP proxy. */
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

    /** @param payloadFormatVersion The version of the payload format. */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /** @param secureServerName Specifies the TLS configuration for a private integration. */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    public fun build(): HttpIntegrationProps = cdkBuilder.build()
}
