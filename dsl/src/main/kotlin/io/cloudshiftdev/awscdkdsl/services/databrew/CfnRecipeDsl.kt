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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe
import software.constructs.Construct

/**
 * Specifies a new AWS Glue DataBrew transformation recipe.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnRecipe cfnRecipe = CfnRecipe.Builder.create(this, "MyCfnRecipe")
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
public class CfnRecipeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRecipe.Builder = CfnRecipe.Builder.create(scope, id)

    private val _steps: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-description)
     *
     * @param description The description of the recipe.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The unique name for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-name)
     *
     * @param name The unique name for the recipe.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     *
     * @param steps A list of steps that are defined by the recipe.
     */
    public fun steps(vararg steps: Any) {
        _steps.addAll(listOf(*steps))
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     *
     * @param steps A list of steps that are defined by the recipe.
     */
    public fun steps(steps: Collection<Any>) {
        _steps.addAll(steps)
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     *
     * @param steps A list of steps that are defined by the recipe.
     */
    public fun steps(steps: IResolvable) {
        cdkBuilder.steps(steps)
    }

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     *
     * @param tags Metadata tags that have been applied to the recipe.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     *
     * @param tags Metadata tags that have been applied to the recipe.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRecipe {
        if (_steps.isNotEmpty()) cdkBuilder.steps(_steps)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
