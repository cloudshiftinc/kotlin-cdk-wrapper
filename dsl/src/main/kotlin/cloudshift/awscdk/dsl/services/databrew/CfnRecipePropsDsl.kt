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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipeProps

/**
 * Properties for defining a `CfnRecipe`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnRecipeProps cfnRecipeProps = CfnRecipeProps.builder()
 * .name("name")
 * .steps(List.of(RecipeStepProperty.builder()
 * .action(ActionProperty.builder()
 * .operation("operation")
 * // the properties below are optional
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .build())
 * // the properties below are optional
 * .conditionExpressions(List.of(ConditionExpressionProperty.builder()
 * .condition("condition")
 * .targetColumn("targetColumn")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html)
 */
@CdkDslMarker
public class CfnRecipePropsDsl {
    private val cdkBuilder: CfnRecipeProps.Builder = CfnRecipeProps.builder()

    private val _steps: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the recipe. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The unique name for the recipe. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param steps A list of steps that are defined by the recipe. */
    public fun steps(vararg steps: Any) {
        _steps.addAll(listOf(*steps))
    }

    /** @param steps A list of steps that are defined by the recipe. */
    public fun steps(steps: Collection<Any>) {
        _steps.addAll(steps)
    }

    /** @param steps A list of steps that are defined by the recipe. */
    public fun steps(steps: IResolvable) {
        cdkBuilder.steps(steps)
    }

    /** @param tags Metadata tags that have been applied to the recipe. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata tags that have been applied to the recipe. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRecipeProps {
        if (_steps.isNotEmpty()) cdkBuilder.steps(_steps)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
