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
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import kotlin.String

@CdkDslMarker
public class CfnContainerRecipeTargetContainerRepositoryPropertyDsl {
    private val cdkBuilder: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder =
        CfnContainerRecipe.TargetContainerRepositoryProperty.builder()

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): CfnContainerRecipe.TargetContainerRepositoryProperty = cdkBuilder.build()
}
