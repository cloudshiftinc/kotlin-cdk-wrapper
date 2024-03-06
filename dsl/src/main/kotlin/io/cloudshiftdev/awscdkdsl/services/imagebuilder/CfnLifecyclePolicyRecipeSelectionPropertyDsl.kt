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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Specifies an Image Builder recipe that the lifecycle policy uses for resource selection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * RecipeSelectionProperty recipeSelectionProperty = RecipeSelectionProperty.builder()
 * .name("name")
 * .semanticVersion("semanticVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyRecipeSelectionPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.RecipeSelectionProperty.Builder =
        CfnLifecyclePolicy.RecipeSelectionProperty.builder()

    /**
     * @param name The name of an Image Builder recipe that the lifecycle policy uses for resource
     *   selection.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param semanticVersion The version of the Image Builder recipe specified by the `name` field.
     */
    public fun semanticVersion(semanticVersion: String) {
        cdkBuilder.semanticVersion(semanticVersion)
    }

    public fun build(): CfnLifecyclePolicy.RecipeSelectionProperty = cdkBuilder.build()
}
