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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents one or more actions to be performed on a DataBrew dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * RecipeProperty recipeProperty = RecipeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html)
 */
@CdkDslMarker
public class CfnJobRecipePropertyDsl {
    private val cdkBuilder: CfnJob.RecipeProperty.Builder = CfnJob.RecipeProperty.builder()

    /** @param name The unique name for the recipe. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param version The identifier for the version for the recipe. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnJob.RecipeProperty = cdkBuilder.build()
}
