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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnTaskDefinitionFirelensConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.FirelensConfigurationProperty.Builder =
        CfnTaskDefinition.FirelensConfigurationProperty.builder()

    public fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
    }

    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskDefinition.FirelensConfigurationProperty = cdkBuilder.build()
}
