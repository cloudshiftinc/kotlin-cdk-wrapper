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
import software.amazon.awscdk.services.apigatewayv2.HttpIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationType
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion
import software.constructs.Construct

/**
 * The integration for an API route.
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
 * HttpIntegration httpIntegration = HttpIntegration.Builder.create(this, "MyHttpIntegration")
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
public class HttpIntegrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpIntegration.Builder = HttpIntegration.Builder.create(scope, id)

    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * Default: - undefined
     *
     * @param connectionId The ID of the VPC link for a private integration.
     */
    public fun connectionId(connectionId: String) {
        cdkBuilder.connectionId(connectionId)
    }

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Default: HttpConnectionType.INTERNET
     *
     * @param connectionType The type of the network connection to the integration endpoint.
     */
    public fun connectionType(connectionType: HttpConnectionType) {
        cdkBuilder.connectionType(connectionType)
    }

    /**
     * The credentials with which to invoke the integration.
     *
     * Default: - no credentials, use resource-based permissions on supported AWS services
     *
     * @param credentials The credentials with which to invoke the integration.
     */
    public fun credentials(credentials: IntegrationCredentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * The HTTP API to which this integration should be bound.
     *
     * @param httpApi The HTTP API to which this integration should be bound.
     */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /**
     * Integration subtype.
     *
     * Used for AWS Service integrations, specifies the target of the integration.
     *
     * Default: - none, required if no `integrationUri` is defined.
     *
     * @param integrationSubtype Integration subtype.
     */
    public fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype) {
        cdkBuilder.integrationSubtype(integrationSubtype)
    }

    /**
     * Integration type.
     *
     * @param integrationType Integration type.
     */
    public fun integrationType(integrationType: HttpIntegrationType) {
        cdkBuilder.integrationType(integrationType)
    }

    /**
     * Integration URI.
     *
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`, or HTTP URL in
     * the case of `HttpIntegrationType.HTTP_PROXY`.
     *
     * Default: - none, required if no `integrationSubtype` is defined.
     *
     * @param integrationUri Integration URI.
     */
    public fun integrationUri(integrationUri: String) {
        cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * The HTTP method to use when calling the underlying HTTP proxy.
     *
     * Default: - none. required if the integration type is `HttpIntegrationType.HTTP_PROXY`.
     *
     * @param method The HTTP method to use when calling the underlying HTTP proxy.
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
     * The version of the payload format.
     *
     * Default: - defaults to latest in the case of HttpIntegrationType.AWS_PROXY`, irrelevant
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     *
     * @param payloadFormatVersion The version of the payload format.
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /**
     * Specifies the TLS configuration for a private integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     *
     * @param secureServerName Specifies the TLS configuration for a private integration.
     */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    public fun build(): HttpIntegration = cdkBuilder.build()
}
