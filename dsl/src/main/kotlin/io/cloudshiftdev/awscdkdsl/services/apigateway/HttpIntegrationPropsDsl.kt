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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
 * .httpMethod("httpMethod")
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
 * .proxy(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpIntegrationPropsDsl {
    private val cdkBuilder: HttpIntegrationProps.Builder = HttpIntegrationProps.builder()

    /** @param httpMethod HTTP method to use when invoking the backend URL. */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(options)
        cdkBuilder.options(builder.build())
    }

    /**
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    /** @param proxy Determines whether to use proxy integration or custom integration. */
    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    public fun build(): HttpIntegrationProps = cdkBuilder.build()
}
