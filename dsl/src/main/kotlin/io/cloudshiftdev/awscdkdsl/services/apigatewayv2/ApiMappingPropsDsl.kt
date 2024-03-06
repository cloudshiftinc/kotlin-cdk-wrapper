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
import software.amazon.awscdk.services.apigatewayv2.ApiMappingProps
import software.amazon.awscdk.services.apigatewayv2.IApi
import software.amazon.awscdk.services.apigatewayv2.IDomainName
import software.amazon.awscdk.services.apigatewayv2.IStage

/**
 * Properties used to create the ApiMapping resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * IApi api;
 * DomainName domainName;
 * IStage stage;
 * ApiMappingProps apiMappingProps = ApiMappingProps.builder()
 * .api(api)
 * .domainName(domainName)
 * // the properties below are optional
 * .apiMappingKey("apiMappingKey")
 * .stage(stage)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiMappingPropsDsl {
    private val cdkBuilder: ApiMappingProps.Builder = ApiMappingProps.builder()

    /** @param api The Api to which this mapping is applied. */
    public fun api(api: IApi) {
        cdkBuilder.api(api)
    }

    /**
     * @param apiMappingKey Api mapping key. The path where this stage should be mapped to on the
     *   domain
     */
    public fun apiMappingKey(apiMappingKey: String) {
        cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /** @param domainName custom domain name of the mapping target. */
    public fun domainName(domainName: IDomainName) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param stage stage for the ApiMapping resource required for WebSocket API defaults to default
     *   stage of an HTTP API.
     */
    public fun stage(stage: IStage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): ApiMappingProps = cdkBuilder.build()
}
