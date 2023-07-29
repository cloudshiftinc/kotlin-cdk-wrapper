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
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Represents an individual condition that evaluates to true or false.
 *
 * Conditions are used with recipe actions. The action is only performed for column values where the
 * condition evaluates to true.
 *
 * If a recipe requires more than one condition, then the recipe must specify multiple
 * `ConditionExpression` elements. Each condition is applied to the rows in a dataset first, before
 * the recipe action is performed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ConditionExpressionProperty conditionExpressionProperty = ConditionExpressionProperty.builder()
 * .condition("condition")
 * .targetColumn("targetColumn")
 * // the properties below are optional
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html)
 */
@CdkDslMarker
public class CfnRecipeConditionExpressionPropertyDsl {
    private val cdkBuilder: CfnRecipe.ConditionExpressionProperty.Builder =
        CfnRecipe.ConditionExpressionProperty.builder()

    /**
     * @param condition A specific condition to apply to a recipe action. For more information, see
     *   [Recipe structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in
     *   the *AWS Glue DataBrew Developer Guide* .
     */
    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    /** @param targetColumn A column to apply this condition to. */
    public fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
    }

    /** @param value A value that the condition must evaluate to for the condition to succeed. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRecipe.ConditionExpressionProperty = cdkBuilder.build()
}
