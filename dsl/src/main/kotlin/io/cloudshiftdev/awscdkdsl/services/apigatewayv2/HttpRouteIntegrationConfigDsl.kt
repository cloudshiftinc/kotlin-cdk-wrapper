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
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion

/**
 * Config returned back as a result of the bind.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * IntegrationCredentials integrationCredentials;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpRouteIntegrationConfig httpRouteIntegrationConfig = HttpRouteIntegrationConfig.builder()
 * .payloadFormatVersion(payloadFormatVersion)
 * .type(HttpIntegrationType.HTTP_PROXY)
 * // the properties below are optional
 * .connectionId("connectionId")
 * .connectionType(HttpConnectionType.VPC_LINK)
 * .credentials(integrationCredentials)
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .secureServerName("secureServerName")
 * .subtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
 * .uri("uri")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpRouteIntegrationConfigDsl {
    private val cdkBuilder: HttpRouteIntegrationConfig.Builder =
        HttpRouteIntegrationConfig.builder()

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

    /**
     * @param method The HTTP method that must be used to invoke the underlying proxy. Required for
     *   `HttpIntegrationType.HTTP_PROXY`
     */
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
     * @param payloadFormatVersion Payload format version in the case of lambda proxy integration.
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     *   backend integration.
     */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    /** @param subtype Integration subtype. */
    public fun subtype(subtype: HttpIntegrationSubtype) {
        cdkBuilder.subtype(subtype)
    }

    /** @param type Integration type. */
    public fun type(type: HttpIntegrationType) {
        cdkBuilder.type(type)
    }

    /** @param uri Integration URI. */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): HttpRouteIntegrationConfig = cdkBuilder.build()
}
