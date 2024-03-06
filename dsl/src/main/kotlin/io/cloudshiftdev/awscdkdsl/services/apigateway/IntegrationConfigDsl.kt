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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationConfig
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationType

/**
 * Result of binding an Integration to a Method.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * IntegrationConfig integrationConfig = IntegrationConfig.builder()
 * .type(IntegrationType.AWS)
 * // the properties below are optional
 * .deploymentToken("deploymentToken")
 * .integrationHttpMethod("integrationHttpMethod")
 * .options(IntegrationOptions.builder()
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionType(ConnectionType.INTERNET)
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsPassthrough(false)
 * .credentialsRole(role)
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeout(Duration.minutes(30))
 * .vpcLink(vpcLink)
 * .build())
 * .uri("uri")
 * .build();
 * ```
 */
@CdkDslMarker
public class IntegrationConfigDsl {
    private val cdkBuilder: IntegrationConfig.Builder = IntegrationConfig.builder()

    /**
     * @param deploymentToken This value is included in computing the Deployment's fingerprint. When
     *   the fingerprint changes, a new deployment is triggered. This property should contain values
     *   associated with the Integration that upon changing should trigger a fresh the Deployment
     *   needs to be refreshed.
     */
    public fun deploymentToken(deploymentToken: String) {
        cdkBuilder.deploymentToken(deploymentToken)
    }

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

    /** @param uri The Uniform Resource Identifier (URI) for the integration. */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): IntegrationConfig = cdkBuilder.build()
}
