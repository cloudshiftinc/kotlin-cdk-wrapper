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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import kotlin.String

@CdkDslMarker
public class CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder =
        CfnImageRecipe.AdditionalInstanceConfigurationProperty.builder()

    public fun systemsManagerAgent(systemsManagerAgent: IResolvable) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent)
    }

    public fun systemsManagerAgent(systemsManagerAgent: CfnImageRecipe.SystemsManagerAgentProperty) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent)
    }

    public fun userDataOverride(userDataOverride: String) {
        cdkBuilder.userDataOverride(userDataOverride)
    }

    public fun build(): CfnImageRecipe.AdditionalInstanceConfigurationProperty = cdkBuilder.build()
}
