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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Resource selection criteria for the lifecycle policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ResourceSelectionProperty resourceSelectionProperty = ResourceSelectionProperty.builder()
 * .recipes(List.of(RecipeSelectionProperty.builder()
 * .name("name")
 * .semanticVersion("semanticVersion")
 * .build()))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyResourceSelectionPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ResourceSelectionProperty.Builder =
        CfnLifecyclePolicy.ResourceSelectionProperty.builder()

    private val _recipes: MutableList<Any> = mutableListOf()

    /**
     * @param recipes A list of recipes that are used as selection criteria for the output images
     *   that the lifecycle policy applies to.
     */
    public fun recipes(vararg recipes: Any) {
        _recipes.addAll(listOf(*recipes))
    }

    /**
     * @param recipes A list of recipes that are used as selection criteria for the output images
     *   that the lifecycle policy applies to.
     */
    public fun recipes(recipes: Collection<Any>) {
        _recipes.addAll(recipes)
    }

    /**
     * @param recipes A list of recipes that are used as selection criteria for the output images
     *   that the lifecycle policy applies to.
     */
    public fun recipes(recipes: IResolvable) {
        cdkBuilder.recipes(recipes)
    }

    /**
     * @param tagMap A list of tags that are used as selection criteria for the Image Builder image
     *   resources that the lifecycle policy applies to.
     */
    public fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
    }

    /**
     * @param tagMap A list of tags that are used as selection criteria for the Image Builder image
     *   resources that the lifecycle policy applies to.
     */
    public fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap)
    }

    public fun build(): CfnLifecyclePolicy.ResourceSelectionProperty {
        if (_recipes.isNotEmpty()) cdkBuilder.recipes(_recipes)
        return cdkBuilder.build()
    }
}
