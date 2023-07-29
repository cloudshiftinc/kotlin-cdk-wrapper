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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Represents a single step from a DataBrew recipe to be performed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * RecipeStepProperty recipeStepProperty = RecipeStepProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html)
 */
@CdkDslMarker
public class CfnRecipeRecipeStepPropertyDsl {
    private val cdkBuilder: CfnRecipe.RecipeStepProperty.Builder =
        CfnRecipe.RecipeStepProperty.builder()

    private val _conditionExpressions: MutableList<Any> = mutableListOf()

    /** @param action The particular action to be performed in the recipe step. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action The particular action to be performed in the recipe step. */
    public fun action(action: CfnRecipe.ActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * @param conditionExpressions One or more conditions that must be met for the recipe step to
     *   succeed.
     *
     * All of the conditions in the array must be met. In other words, all of the conditions must be
     * combined using a logical AND operation.
     */
    public fun conditionExpressions(vararg conditionExpressions: Any) {
        _conditionExpressions.addAll(listOf(*conditionExpressions))
    }

    /**
     * @param conditionExpressions One or more conditions that must be met for the recipe step to
     *   succeed.
     *
     * All of the conditions in the array must be met. In other words, all of the conditions must be
     * combined using a logical AND operation.
     */
    public fun conditionExpressions(conditionExpressions: Collection<Any>) {
        _conditionExpressions.addAll(conditionExpressions)
    }

    /**
     * @param conditionExpressions One or more conditions that must be met for the recipe step to
     *   succeed.
     *
     * All of the conditions in the array must be met. In other words, all of the conditions must be
     * combined using a logical AND operation.
     */
    public fun conditionExpressions(conditionExpressions: IResolvable) {
        cdkBuilder.conditionExpressions(conditionExpressions)
    }

    public fun build(): CfnRecipe.RecipeStepProperty {
        if (_conditionExpressions.isNotEmpty())
            cdkBuilder.conditionExpressions(_conditionExpressions)
        return cdkBuilder.build()
    }
}
