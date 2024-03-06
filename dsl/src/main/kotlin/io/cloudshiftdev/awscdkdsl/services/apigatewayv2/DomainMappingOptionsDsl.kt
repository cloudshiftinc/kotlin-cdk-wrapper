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
import software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
import software.amazon.awscdk.services.apigatewayv2.IDomainName

/**
 * Options for DomainMapping.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function handler;
 * DomainName dn;
 * HttpApi apiDemo = HttpApi.Builder.create(this, "DemoApi")
 * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
 * // https://${dn.domainName}/demo goes to apiDemo $default stage
 * .defaultDomainMapping(DomainMappingOptions.builder()
 * .domainName(dn)
 * .mappingKey("demo")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DomainMappingOptionsDsl {
    private val cdkBuilder: DomainMappingOptions.Builder = DomainMappingOptions.builder()

    /** @param domainName The domain name for the mapping. */
    public fun domainName(domainName: IDomainName) {
        cdkBuilder.domainName(domainName)
    }

    /** @param mappingKey The API mapping key. Leave it undefined for the root path mapping. */
    public fun mappingKey(mappingKey: String) {
        cdkBuilder.mappingKey(mappingKey)
    }

    public fun build(): DomainMappingOptions = cdkBuilder.build()
}
