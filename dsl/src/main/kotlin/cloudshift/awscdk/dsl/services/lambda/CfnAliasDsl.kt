@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnAlias
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty) {
        cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig)
    }

    public fun routingConfig(routingConfig: IResolvable) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
        cdkBuilder.routingConfig(routingConfig)
    }

    public fun build(): CfnAlias = cdkBuilder.build()
}
