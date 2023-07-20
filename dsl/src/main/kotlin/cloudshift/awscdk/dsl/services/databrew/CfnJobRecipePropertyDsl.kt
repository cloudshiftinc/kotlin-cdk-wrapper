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
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String

@CdkDslMarker
public class CfnJobRecipePropertyDsl {
    private val cdkBuilder: CfnJob.RecipeProperty.Builder = CfnJob.RecipeProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnJob.RecipeProperty = cdkBuilder.build()
}
