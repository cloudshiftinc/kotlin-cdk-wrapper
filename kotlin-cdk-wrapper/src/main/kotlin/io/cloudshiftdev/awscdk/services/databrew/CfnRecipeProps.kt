@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRecipe`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
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
public interface CfnRecipeProps {
  /**
   * The description of the recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique name for the recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-name)
   */
  public fun name(): String

  /**
   * A list of steps that are defined by the recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
   */
  public fun steps(): Any

  /**
   * Metadata tags that have been applied to the recipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRecipeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the recipe.
     */
    public fun description(description: String)

    /**
     * @param name The unique name for the recipe. 
     */
    public fun name(name: String)

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(steps: IResolvable)

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(steps: List<Any>)

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(vararg steps: Any)

    /**
     * @param tags Metadata tags that have been applied to the recipe.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata tags that have been applied to the recipe.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRecipeProps.Builder =
        software.amazon.awscdk.services.databrew.CfnRecipeProps.builder()

    /**
     * @param description The description of the recipe.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The unique name for the recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    /**
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * @param tags Metadata tags that have been applied to the recipe.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata tags that have been applied to the recipe.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnRecipeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipeProps,
  ) : CdkObject(cdkObject), CfnRecipeProps {
    /**
     * The description of the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique name for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     */
    override fun steps(): Any = unwrap(this).getSteps()

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipeProps):
        CfnRecipeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecipeProps):
        software.amazon.awscdk.services.databrew.CfnRecipeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnRecipeProps
  }
}
