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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnRecipeActionPropertyDsl {
    private val cdkBuilder: CfnRecipe.ActionProperty.Builder = CfnRecipe.ActionProperty.builder()

    public fun operation(operation: String) {
        cdkBuilder.operation(operation)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnRecipe.ActionProperty = cdkBuilder.build()
}
