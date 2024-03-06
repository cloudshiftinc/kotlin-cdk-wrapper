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
import software.amazon.awscdk.services.apigatewayv2.ApiMapping
import software.amazon.awscdk.services.apigatewayv2.IApi
import software.amazon.awscdk.services.apigatewayv2.IDomainName
import software.amazon.awscdk.services.apigatewayv2.IStage
import software.constructs.Construct

/**
 * Create a new API mapping for API Gateway API endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * IApi api;
 * DomainName domainName;
 * IStage stage;
 * ApiMapping apiMapping = ApiMapping.Builder.create(this, "MyApiMapping")
 * .api(api)
 * .domainName(domainName)
 * // the properties below are optional
 * .apiMappingKey("apiMappingKey")
 * .stage(stage)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApiMapping.Builder = ApiMapping.Builder.create(scope, id)

    /**
     * The Api to which this mapping is applied.
     *
     * @param api The Api to which this mapping is applied.
     */
    public fun api(api: IApi) {
        cdkBuilder.api(api)
    }

    /**
     * Api mapping key.
     *
     * The path where this stage should be mapped to on the domain
     *
     * Default: - undefined for the root path mapping.
     *
     * @param apiMappingKey Api mapping key.
     */
    public fun apiMappingKey(apiMappingKey: String) {
        cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /**
     * custom domain name of the mapping target.
     *
     * @param domainName custom domain name of the mapping target.
     */
    public fun domainName(domainName: IDomainName) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * stage for the ApiMapping resource required for WebSocket API defaults to default stage of an
     * HTTP API.
     *
     * Default: - Default stage of the passed API for HTTP API, required for WebSocket API
     *
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     *   stage of an HTTP API.
     */
    public fun stage(stage: IStage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): ApiMapping = cdkBuilder.build()
}
