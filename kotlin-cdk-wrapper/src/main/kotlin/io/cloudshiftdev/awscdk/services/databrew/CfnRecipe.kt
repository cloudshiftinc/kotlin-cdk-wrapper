@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a new AWS Glue DataBrew transformation recipe.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
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
public open class CfnRecipe internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The description of the recipe.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the recipe.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The unique name for the recipe.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name for the recipe.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of steps that are defined by the recipe.
   */
  public open fun steps(): Any = unwrap(this).getSteps()

  /**
   * A list of steps that are defined by the recipe.
   */
  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of steps that are defined by the recipe.
   */
  public open fun steps(__idx_ac66f0: List<Any>) {
    unwrap(this).setSteps(__idx_ac66f0)
  }

  /**
   * A list of steps that are defined by the recipe.
   */
  public open fun steps(vararg __idx_ac66f0: Any): Unit = steps(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata tags that have been applied to the recipe.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata tags that have been applied to the recipe.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata tags that have been applied to the recipe.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnRecipe].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-description)
     * @param description The description of the recipe. 
     */
    public fun description(description: String)

    /**
     * The unique name for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-name)
     * @param name The unique name for the recipe. 
     */
    public fun name(name: String)

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(steps: IResolvable)

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(steps: List<Any>)

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    public fun steps(vararg steps: Any)

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     * @param tags Metadata tags that have been applied to the recipe. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     * @param tags Metadata tags that have been applied to the recipe. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRecipe.Builder =
        software.amazon.awscdk.services.databrew.CfnRecipe.Builder.create(scope, id)

    /**
     * The description of the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-description)
     * @param description The description of the recipe. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique name for the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-name)
     * @param name The unique name for the recipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    /**
     * A list of steps that are defined by the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-steps)
     * @param steps A list of steps that are defined by the recipe. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     * @param tags Metadata tags that have been applied to the recipe. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata tags that have been applied to the recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html#cfn-databrew-recipe-tags)
     * @param tags Metadata tags that have been applied to the recipe. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnRecipe.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe): CfnRecipe =
        CfnRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnRecipe): software.amazon.awscdk.services.databrew.CfnRecipe =
        wrapped.cdkObject
  }

  /**
   * Represents an individual condition that evaluates to true or false.
   *
   * Conditions are used with recipe actions. The action is only performed for column values where
   * the condition evaluates to true.
   *
   * If a recipe requires more than one condition, then the recipe must specify multiple
   * `ConditionExpression` elements. Each condition is applied to the rows in a dataset first, before
   * the recipe action is performed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
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
  public interface ConditionExpressionProperty {
    /**
     * A specific condition to apply to a recipe action.
     *
     * For more information, see [Recipe
     * structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in the *AWS
     * Glue DataBrew Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-condition)
     */
    public fun condition(): String

    /**
     * A column to apply this condition to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-targetcolumn)
     */
    public fun targetColumn(): String

    /**
     * A value that the condition must evaluate to for the condition to succeed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ConditionExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition A specific condition to apply to a recipe action. 
       * For more information, see [Recipe
       * structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in the *AWS
       * Glue DataBrew Developer Guide* .
       */
      public fun condition(condition: String)

      /**
       * @param targetColumn A column to apply this condition to. 
       */
      public fun targetColumn(targetColumn: String)

      /**
       * @param value A value that the condition must evaluate to for the condition to succeed.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.builder()

      /**
       * @param condition A specific condition to apply to a recipe action. 
       * For more information, see [Recipe
       * structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in the *AWS
       * Glue DataBrew Developer Guide* .
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param targetColumn A column to apply this condition to. 
       */
      override fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
      }

      /**
       * @param value A value that the condition must evaluate to for the condition to succeed.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty,
    ) : CdkObject(cdkObject), ConditionExpressionProperty {
      /**
       * A specific condition to apply to a recipe action.
       *
       * For more information, see [Recipe
       * structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in the *AWS
       * Glue DataBrew Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()

      /**
       * A column to apply this condition to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-targetcolumn)
       */
      override fun targetColumn(): String = unwrap(this).getTargetColumn()

      /**
       * A value that the condition must evaluate to for the condition to succeed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html#cfn-databrew-recipe-conditionexpression-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty):
          ConditionExpressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionExpressionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty
    }
  }

  /**
   * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DataCatalogInputDefinitionProperty dataCatalogInputDefinitionProperty =
   * DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html)
   */
  public interface DataCatalogInputDefinitionProperty {
    /**
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of a database in the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of a database table in the Data Catalog.
     *
     * This table corresponds to a DataBrew dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-tablename)
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * Represents an Amazon location where DataBrew can store intermediate results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-tempdirectory)
     */
    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    /**
     * A builder for [DataCatalogInputDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of a database in the Data Catalog.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName The name of a database table in the Data Catalog.
       * This table corresponds to a DataBrew dataset.
       */
      public fun tableName(tableName: String)

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      public fun tempDirectory(tempDirectory: IResolvable)

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      public fun tempDirectory(tempDirectory: S3LocationProperty)

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01216e0c153f2b5ef6cea931fd5433362f7c657921c3971f3f891c489dd4bd77")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty.builder()

      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of a database in the Data Catalog.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName The name of a database table in the Data Catalog.
       * This table corresponds to a DataBrew dataset.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      /**
       * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
       * results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01216e0c153f2b5ef6cea931fd5433362f7c657921c3971f3f891c489dd4bd77")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty,
    ) : CdkObject(cdkObject), DataCatalogInputDefinitionProperty {
      /**
       * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of a database in the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of a database table in the Data Catalog.
       *
       * This table corresponds to a DataBrew dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()

      /**
       * Represents an Amazon location where DataBrew can store intermediate results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html#cfn-databrew-recipe-datacataloginputdefinition-tempdirectory)
       */
      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty):
          DataCatalogInputDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty
    }
  }

  /**
   * Represents a transformation and associated parameters that are used to apply a change to an AWS
   * Glue DataBrew dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .operation("operation")
   * // the properties below are optional
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html)
   */
  public interface ActionProperty {
    /**
     * The name of a valid DataBrew transformation to be performed on the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html#cfn-databrew-recipe-action-operation)
     */
    public fun operation(): String

    /**
     * Contextual parameters for the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html#cfn-databrew-recipe-action-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param operation The name of a valid DataBrew transformation to be performed on the data. 
       */
      public fun operation(operation: String)

      /**
       * @param parameters Contextual parameters for the transformation.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Contextual parameters for the transformation.
       */
      public fun parameters(parameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty.builder()

      /**
       * @param operation The name of a valid DataBrew transformation to be performed on the data. 
       */
      override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      /**
       * @param parameters Contextual parameters for the transformation.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters Contextual parameters for the transformation.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * The name of a valid DataBrew transformation to be performed on the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html#cfn-databrew-recipe-action-operation)
       */
      override fun operation(): String = unwrap(this).getOperation()

      /**
       * Contextual parameters for the transformation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html#cfn-databrew-recipe-action-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty
    }
  }

  /**
   * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can
   * read input data, or write output from a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html#cfn-databrew-recipe-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The unique name of the object in the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html#cfn-databrew-recipe-s3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The unique name of the object in the bucket.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The unique name of the object in the bucket.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html#cfn-databrew-recipe-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The unique name of the object in the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html#cfn-databrew-recipe-s3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty
    }
  }

  /**
   * Represents information on how DataBrew can find data, in either the AWS Glue Data Catalog or
   * Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * InputProperty inputProperty = InputProperty.builder()
   * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build())
   * .s3InputDefinition(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html)
   */
  public interface InputProperty {
    /**
     * The AWS Glue Data Catalog parameters for the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html#cfn-databrew-recipe-input-datacataloginputdefinition)
     */
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    /**
     * The Amazon S3 location where the data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html#cfn-databrew-recipe-input-s3inputdefinition)
     */
    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    /**
     * A builder for [InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c21a754f4292a4b713afb47e3f71ac9cb708e299806e2c7fc389941ea9360f")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d517f601e5d45fdc63b581e9a751819142d30d11fe69aef4b2e454711a7daa9")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty.builder()

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c21a754f4292a4b713afb47e3f71ac9cb708e299806e2c7fc389941ea9360f")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d517f601e5d45fdc63b581e9a751819142d30d11fe69aef4b2e454711a7daa9")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty,
    ) : CdkObject(cdkObject), InputProperty {
      /**
       * The AWS Glue Data Catalog parameters for the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html#cfn-databrew-recipe-input-datacataloginputdefinition)
       */
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      /**
       * The Amazon S3 location where the data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html#cfn-databrew-recipe-input-s3inputdefinition)
       */
      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty
    }
  }

  /**
   * Parameters that are used as inputs for various recipe actions.
   *
   * The parameters are specific to the context in which they're used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * Object input;
   * RecipeParametersProperty recipeParametersProperty = RecipeParametersProperty.builder()
   * .aggregateFunction("aggregateFunction")
   * .base("base")
   * .caseStatement("caseStatement")
   * .categoryMap("categoryMap")
   * .charsToRemove("charsToRemove")
   * .collapseConsecutiveWhitespace("collapseConsecutiveWhitespace")
   * .columnDataType("columnDataType")
   * .columnRange("columnRange")
   * .count("count")
   * .customCharacters("customCharacters")
   * .customStopWords("customStopWords")
   * .customValue("customValue")
   * .datasetsColumns("datasetsColumns")
   * .dateAddValue("dateAddValue")
   * .dateTimeFormat("dateTimeFormat")
   * .dateTimeParameters("dateTimeParameters")
   * .deleteOtherRows("deleteOtherRows")
   * .delimiter("delimiter")
   * .endPattern("endPattern")
   * .endPosition("endPosition")
   * .endValue("endValue")
   * .expandContractions("expandContractions")
   * .exponent("exponent")
   * .falseString("falseString")
   * .groupByAggFunctionOptions("groupByAggFunctionOptions")
   * .groupByColumns("groupByColumns")
   * .hiddenColumns("hiddenColumns")
   * .ignoreCase("ignoreCase")
   * .includeInSplit("includeInSplit")
   * .input(input)
   * .interval("interval")
   * .isText("isText")
   * .joinKeys("joinKeys")
   * .joinType("joinType")
   * .leftColumns("leftColumns")
   * .limit("limit")
   * .lowerBound("lowerBound")
   * .mapType("mapType")
   * .modeType("modeType")
   * .multiLine(false)
   * .numRows("numRows")
   * .numRowsAfter("numRowsAfter")
   * .numRowsBefore("numRowsBefore")
   * .orderByColumn("orderByColumn")
   * .orderByColumns("orderByColumns")
   * .other("other")
   * .pattern("pattern")
   * .patternOption1("patternOption1")
   * .patternOption2("patternOption2")
   * .patternOptions("patternOptions")
   * .period("period")
   * .position("position")
   * .removeAllPunctuation("removeAllPunctuation")
   * .removeAllQuotes("removeAllQuotes")
   * .removeAllWhitespace("removeAllWhitespace")
   * .removeCustomCharacters("removeCustomCharacters")
   * .removeCustomValue("removeCustomValue")
   * .removeLeadingAndTrailingPunctuation("removeLeadingAndTrailingPunctuation")
   * .removeLeadingAndTrailingQuotes("removeLeadingAndTrailingQuotes")
   * .removeLeadingAndTrailingWhitespace("removeLeadingAndTrailingWhitespace")
   * .removeLetters("removeLetters")
   * .removeNumbers("removeNumbers")
   * .removeSourceColumn("removeSourceColumn")
   * .removeSpecialCharacters("removeSpecialCharacters")
   * .rightColumns("rightColumns")
   * .sampleSize("sampleSize")
   * .sampleType("sampleType")
   * .secondaryInputs(List.of(SecondaryInputProperty.builder()
   * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build())
   * .s3InputDefinition(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build()))
   * .secondInput("secondInput")
   * .sheetIndexes(List.of(123))
   * .sheetNames(List.of("sheetNames"))
   * .sourceColumn("sourceColumn")
   * .sourceColumn1("sourceColumn1")
   * .sourceColumn2("sourceColumn2")
   * .sourceColumns("sourceColumns")
   * .startColumnIndex("startColumnIndex")
   * .startPattern("startPattern")
   * .startPosition("startPosition")
   * .startValue("startValue")
   * .stemmingMode("stemmingMode")
   * .stepCount("stepCount")
   * .stepIndex("stepIndex")
   * .stopWordsMode("stopWordsMode")
   * .strategy("strategy")
   * .targetColumn("targetColumn")
   * .targetColumnNames("targetColumnNames")
   * .targetDateFormat("targetDateFormat")
   * .targetIndex("targetIndex")
   * .timeZone("timeZone")
   * .tokenizerPattern("tokenizerPattern")
   * .trueString("trueString")
   * .udfLang("udfLang")
   * .units("units")
   * .unpivotColumn("unpivotColumn")
   * .upperBound("upperBound")
   * .useNewDataFrame("useNewDataFrame")
   * .value("value")
   * .value1("value1")
   * .value2("value2")
   * .valueColumn("valueColumn")
   * .viewFrame("viewFrame")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html)
   */
  public interface RecipeParametersProperty {
    /**
     * The name of an aggregation function to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-aggregatefunction)
     */
    public fun aggregateFunction(): String? = unwrap(this).getAggregateFunction()

    /**
     * The number of digits used in a counting system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-base)
     */
    public fun base(): String? = unwrap(this).getBase()

    /**
     * A case statement associated with a recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-casestatement)
     */
    public fun caseStatement(): String? = unwrap(this).getCaseStatement()

    /**
     * A category map used for one-hot encoding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-categorymap)
     */
    public fun categoryMap(): String? = unwrap(this).getCategoryMap()

    /**
     * Characters to remove from a step that applies one-hot encoding or tokenization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-charstoremove)
     */
    public fun charsToRemove(): String? = unwrap(this).getCharsToRemove()

    /**
     * Remove any non-word non-punctuation character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-collapseconsecutivewhitespace)
     */
    public fun collapseConsecutiveWhitespace(): String? =
        unwrap(this).getCollapseConsecutiveWhitespace()

    /**
     * The data type of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-columndatatype)
     */
    public fun columnDataType(): String? = unwrap(this).getColumnDataType()

    /**
     * A range of columns to which a step is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-columnrange)
     */
    public fun columnRange(): String? = unwrap(this).getColumnRange()

    /**
     * The number of times a string needs to be repeated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-count)
     */
    public fun count(): String? = unwrap(this).getCount()

    /**
     * One or more characters that can be substituted or removed, depending on the context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customcharacters)
     */
    public fun customCharacters(): String? = unwrap(this).getCustomCharacters()

    /**
     * A list of words to ignore in a step that applies word tokenization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customstopwords)
     */
    public fun customStopWords(): String? = unwrap(this).getCustomStopWords()

    /**
     * A list of custom values to use in a step that requires that you provide a value to finish the
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customvalue)
     */
    public fun customValue(): String? = unwrap(this).getCustomValue()

    /**
     * A list of the dataset columns included in a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datasetscolumns)
     */
    public fun datasetsColumns(): String? = unwrap(this).getDatasetsColumns()

    /**
     * A value that specifies how many units of time to add or subtract for a date math operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-dateaddvalue)
     */
    public fun dateAddValue(): String? = unwrap(this).getDateAddValue()

    /**
     * A date format to apply to a date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datetimeformat)
     */
    public fun dateTimeFormat(): String? = unwrap(this).getDateTimeFormat()

    /**
     * A set of parameters associated with a datetime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datetimeparameters)
     */
    public fun dateTimeParameters(): String? = unwrap(this).getDateTimeParameters()

    /**
     * Determines whether unmapped rows in a categorical mapping should be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-deleteotherrows)
     */
    public fun deleteOtherRows(): String? = unwrap(this).getDeleteOtherRows()

    /**
     * The delimiter to use when parsing separated values in a text file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * The end pattern to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endpattern)
     */
    public fun endPattern(): String? = unwrap(this).getEndPattern()

    /**
     * The end position to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endposition)
     */
    public fun endPosition(): String? = unwrap(this).getEndPosition()

    /**
     * The end value to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endvalue)
     */
    public fun endValue(): String? = unwrap(this).getEndValue()

    /**
     * A list of word contractions and what they expand to.
     *
     * For eample: *can't* ; *cannot* ; *can not* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-expandcontractions)
     */
    public fun expandContractions(): String? = unwrap(this).getExpandContractions()

    /**
     * The exponent to apply in an exponential operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-exponent)
     */
    public fun exponent(): String? = unwrap(this).getExponent()

    /**
     * A value that represents `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-falsestring)
     */
    public fun falseString(): String? = unwrap(this).getFalseString()

    /**
     * Specifies options to apply to the `GROUP BY` used in an aggregation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-groupbyaggfunctionoptions)
     */
    public fun groupByAggFunctionOptions(): String? = unwrap(this).getGroupByAggFunctionOptions()

    /**
     * The columns to use in the `GROUP BY` clause.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-groupbycolumns)
     */
    public fun groupByColumns(): String? = unwrap(this).getGroupByColumns()

    /**
     * A list of columns to hide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-hiddencolumns)
     */
    public fun hiddenColumns(): String? = unwrap(this).getHiddenColumns()

    /**
     * Indicates that lower and upper case letters are treated equally.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-ignorecase)
     */
    public fun ignoreCase(): String? = unwrap(this).getIgnoreCase()

    /**
     * Indicates if this column is participating in a split transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-includeinsplit)
     */
    public fun includeInSplit(): String? = unwrap(this).getIncludeInSplit()

    /**
     * The input location to load the dataset from - Amazon S3 or AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-input)
     */
    public fun input(): Any? = unwrap(this).getInput()

    /**
     * The number of characters to split by.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-interval)
     */
    public fun interval(): String? = unwrap(this).getInterval()

    /**
     * Indicates if the content is text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-istext)
     */
    public fun isText(): String? = unwrap(this).getIsText()

    /**
     * The keys or columns involved in a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-joinkeys)
     */
    public fun joinKeys(): String? = unwrap(this).getJoinKeys()

    /**
     * The type of join to use, for example, `INNER JOIN` , `OUTER JOIN` , and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-jointype)
     */
    public fun joinType(): String? = unwrap(this).getJoinType()

    /**
     * The columns on the left side of the join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-leftcolumns)
     */
    public fun leftColumns(): String? = unwrap(this).getLeftColumns()

    /**
     * The number of times to perform `split` or `replaceBy` in a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-limit)
     */
    public fun limit(): String? = unwrap(this).getLimit()

    /**
     * The lower boundary for a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-lowerbound)
     */
    public fun lowerBound(): String? = unwrap(this).getLowerBound()

    /**
     * The type of mappings to apply to construct a new dynamic frame.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-maptype)
     */
    public fun mapType(): String? = unwrap(this).getMapType()

    /**
     * Determines the manner in which mode value is calculated, in case there is more than one mode
     * value.
     *
     * Valid values: `NONE` | `AVERAGE` | `MINIMUM` | `MAXIMUM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-modetype)
     */
    public fun modeType(): String? = unwrap(this).getModeType()

    /**
     * Specifies whether JSON input contains embedded new line characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-multiline)
     */
    public fun multiLine(): Any? = unwrap(this).getMultiLine()

    /**
     * The number of rows to consider in a window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrows)
     */
    public fun numRows(): String? = unwrap(this).getNumRows()

    /**
     * The number of rows to consider after the current row in a window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrowsafter)
     */
    public fun numRowsAfter(): String? = unwrap(this).getNumRowsAfter()

    /**
     * The number of rows to consider before the current row in a window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrowsbefore)
     */
    public fun numRowsBefore(): String? = unwrap(this).getNumRowsBefore()

    /**
     * A column to sort the results by.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-orderbycolumn)
     */
    public fun orderByColumn(): String? = unwrap(this).getOrderByColumn()

    /**
     * The columns to sort the results by.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-orderbycolumns)
     */
    public fun orderByColumns(): String? = unwrap(this).getOrderByColumns()

    /**
     * The value to assign to unmapped cells, in categorical mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-other)
     */
    public fun other(): String? = unwrap(this).getOther()

    /**
     * The pattern to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-pattern)
     */
    public fun pattern(): String? = unwrap(this).getPattern()

    /**
     * The starting pattern to split between.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoption1)
     */
    public fun patternOption1(): String? = unwrap(this).getPatternOption1()

    /**
     * The ending pattern to split between.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoption2)
     */
    public fun patternOption2(): String? = unwrap(this).getPatternOption2()

    /**
     * For splitting by multiple delimiters: A JSON-encoded string that lists the patterns in the
     * format.
     *
     * For example: `[{\"pattern\":\"1\",\"includeInSplit\":true}]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoptions)
     */
    public fun patternOptions(): String? = unwrap(this).getPatternOptions()

    /**
     * The size of the rolling window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-period)
     */
    public fun period(): String? = unwrap(this).getPeriod()

    /**
     * The character index within a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-position)
     */
    public fun position(): String? = unwrap(this).getPosition()

    /**
     * If `true` , removes all of the following characters: `.` `.!` `.,` `.?`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallpunctuation)
     */
    public fun removeAllPunctuation(): String? = unwrap(this).getRemoveAllPunctuation()

    /**
     * If `true` , removes all single quotes and double quotes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallquotes)
     */
    public fun removeAllQuotes(): String? = unwrap(this).getRemoveAllQuotes()

    /**
     * If `true` , removes all whitespaces from the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallwhitespace)
     */
    public fun removeAllWhitespace(): String? = unwrap(this).getRemoveAllWhitespace()

    /**
     * If `true` , removes all chraracters specified by `CustomCharacters` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removecustomcharacters)
     */
    public fun removeCustomCharacters(): String? = unwrap(this).getRemoveCustomCharacters()

    /**
     * If `true` , removes all chraracters specified by `CustomValue` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removecustomvalue)
     */
    public fun removeCustomValue(): String? = unwrap(this).getRemoveCustomValue()

    /**
     * If `true` , removes the following characters if they occur at the start or end of the value:
     * `.` `!` `,` `?`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingpunctuation)
     */
    public fun removeLeadingAndTrailingPunctuation(): String? =
        unwrap(this).getRemoveLeadingAndTrailingPunctuation()

    /**
     * If `true` , removes single quotes and double quotes from the beginning and end of the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingquotes)
     */
    public fun removeLeadingAndTrailingQuotes(): String? =
        unwrap(this).getRemoveLeadingAndTrailingQuotes()

    /**
     * If `true` , removes all whitespaces from the beginning and end of the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingwhitespace)
     */
    public fun removeLeadingAndTrailingWhitespace(): String? =
        unwrap(this).getRemoveLeadingAndTrailingWhitespace()

    /**
     * If `true` , removes all uppercase and lowercase alphabetic characters (A through Z;
     *
     * a through z).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeletters)
     */
    public fun removeLetters(): String? = unwrap(this).getRemoveLetters()

    /**
     * If `true` , removes all numeric characters (0 through 9).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removenumbers)
     */
    public fun removeNumbers(): String? = unwrap(this).getRemoveNumbers()

    /**
     * If `true` , the source column will be removed after un-nesting that column.
     *
     * (Used with nested column types, such as Map, Struct, or Array.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removesourcecolumn)
     */
    public fun removeSourceColumn(): String? = unwrap(this).getRemoveSourceColumn()

    /**
     * If `true` , removes all of the following characters: `!
     *
     * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removespecialcharacters)
     */
    public fun removeSpecialCharacters(): String? = unwrap(this).getRemoveSpecialCharacters()

    /**
     * The columns on the right side of a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-rightcolumns)
     */
    public fun rightColumns(): String? = unwrap(this).getRightColumns()

    /**
     * The number of rows in the sample.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-samplesize)
     */
    public fun sampleSize(): String? = unwrap(this).getSampleSize()

    /**
     * The sampling type to apply to the dataset.
     *
     * Valid values: `FIRST_N` | `LAST_N` | `RANDOM`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sampletype)
     */
    public fun sampleType(): String? = unwrap(this).getSampleType()

    /**
     * A object value to indicate the second dataset used in a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-secondinput)
     */
    public fun secondInput(): String? = unwrap(this).getSecondInput()

    /**
     * A list of secondary inputs in a UNION transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-secondaryinputs)
     */
    public fun secondaryInputs(): Any? = unwrap(this).getSecondaryInputs()

    /**
     * One or more sheet numbers in the Excel file, which will be included in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sheetindexes)
     */
    public fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

    /**
     * Oone or more named sheets in the Excel file, which will be included in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sheetnames)
     */
    public fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

    /**
     * A source column needed for an operation, step, or transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn)
     */
    public fun sourceColumn(): String? = unwrap(this).getSourceColumn()

    /**
     * A source column needed for an operation, step, or transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn1)
     */
    public fun sourceColumn1(): String? = unwrap(this).getSourceColumn1()

    /**
     * A source column needed for an operation, step, or transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn2)
     */
    public fun sourceColumn2(): String? = unwrap(this).getSourceColumn2()

    /**
     * A list of source columns needed for an operation, step, or transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumns)
     */
    public fun sourceColumns(): String? = unwrap(this).getSourceColumns()

    /**
     * The index number of the first column used by an operation, step, or transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startcolumnindex)
     */
    public fun startColumnIndex(): String? = unwrap(this).getStartColumnIndex()

    /**
     * The starting pattern to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startpattern)
     */
    public fun startPattern(): String? = unwrap(this).getStartPattern()

    /**
     * The starting position to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startposition)
     */
    public fun startPosition(): String? = unwrap(this).getStartPosition()

    /**
     * The starting value to locate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startvalue)
     */
    public fun startValue(): String? = unwrap(this).getStartValue()

    /**
     * Indicates this operation uses stems and lemmas (base words) for word tokenization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stemmingmode)
     */
    public fun stemmingMode(): String? = unwrap(this).getStemmingMode()

    /**
     * The total number of transforms in this recipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stepcount)
     */
    public fun stepCount(): String? = unwrap(this).getStepCount()

    /**
     * The index ID of a step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stepindex)
     */
    public fun stepIndex(): String? = unwrap(this).getStepIndex()

    /**
     * Indicates this operation uses stop words as part of word tokenization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stopwordsmode)
     */
    public fun stopWordsMode(): String? = unwrap(this).getStopWordsMode()

    /**
     * The resolution strategy to apply in resolving ambiguities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-strategy)
     */
    public fun strategy(): String? = unwrap(this).getStrategy()

    /**
     * The column targeted by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetcolumn)
     */
    public fun targetColumn(): String? = unwrap(this).getTargetColumn()

    /**
     * The names to give columns altered by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetcolumnnames)
     */
    public fun targetColumnNames(): String? = unwrap(this).getTargetColumnNames()

    /**
     * The date format to convert to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetdateformat)
     */
    public fun targetDateFormat(): String? = unwrap(this).getTargetDateFormat()

    /**
     * The index number of an object that is targeted by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetindex)
     */
    public fun targetIndex(): String? = unwrap(this).getTargetIndex()

    /**
     * The current timezone that you want to use for dates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-timezone)
     */
    public fun timeZone(): String? = unwrap(this).getTimeZone()

    /**
     * A regex expression to use when splitting text into terms, also called words or tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-tokenizerpattern)
     */
    public fun tokenizerPattern(): String? = unwrap(this).getTokenizerPattern()

    /**
     * A value to use to represent `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-truestring)
     */
    public fun trueString(): String? = unwrap(this).getTrueString()

    /**
     * The language that's used in the user-defined function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-udflang)
     */
    public fun udfLang(): String? = unwrap(this).getUdfLang()

    /**
     * Specifies a unit of time.
     *
     * For example: `MINUTES` ; `SECONDS` ; `HOURS` ; etc.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-units)
     */
    public fun units(): String? = unwrap(this).getUnits()

    /**
     * Cast columns as rows, so that each value is a different row in a single column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-unpivotcolumn)
     */
    public fun unpivotColumn(): String? = unwrap(this).getUnpivotColumn()

    /**
     * The upper boundary for a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-upperbound)
     */
    public fun upperBound(): String? = unwrap(this).getUpperBound()

    /**
     * Create a new container to hold a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-usenewdataframe)
     */
    public fun useNewDataFrame(): String? = unwrap(this).getUseNewDataFrame()

    /**
     * A static value that can be used in a comparison, a substitution, or in another
     * context-specific way.
     *
     * A `Value` can be a number, string, or other datatype, depending on the recipe action in which
     * it's used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A value that's used by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value1)
     */
    public fun value1(): String? = unwrap(this).getValue1()

    /**
     * A value that's used by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value2)
     */
    public fun value2(): String? = unwrap(this).getValue2()

    /**
     * The column that is provided as a value that's used by this operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-valuecolumn)
     */
    public fun valueColumn(): String? = unwrap(this).getValueColumn()

    /**
     * The subset of rows currently available for viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-viewframe)
     */
    public fun viewFrame(): String? = unwrap(this).getViewFrame()

    /**
     * A builder for [RecipeParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregateFunction The name of an aggregation function to apply.
       */
      public fun aggregateFunction(aggregateFunction: String)

      /**
       * @param base The number of digits used in a counting system.
       */
      public fun base(base: String)

      /**
       * @param caseStatement A case statement associated with a recipe.
       */
      public fun caseStatement(caseStatement: String)

      /**
       * @param categoryMap A category map used for one-hot encoding.
       */
      public fun categoryMap(categoryMap: String)

      /**
       * @param charsToRemove Characters to remove from a step that applies one-hot encoding or
       * tokenization.
       */
      public fun charsToRemove(charsToRemove: String)

      /**
       * @param collapseConsecutiveWhitespace Remove any non-word non-punctuation character.
       */
      public fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String)

      /**
       * @param columnDataType The data type of the column.
       */
      public fun columnDataType(columnDataType: String)

      /**
       * @param columnRange A range of columns to which a step is applied.
       */
      public fun columnRange(columnRange: String)

      /**
       * @param count The number of times a string needs to be repeated.
       */
      public fun count(count: String)

      /**
       * @param customCharacters One or more characters that can be substituted or removed,
       * depending on the context.
       */
      public fun customCharacters(customCharacters: String)

      /**
       * @param customStopWords A list of words to ignore in a step that applies word tokenization.
       */
      public fun customStopWords(customStopWords: String)

      /**
       * @param customValue A list of custom values to use in a step that requires that you provide
       * a value to finish the operation.
       */
      public fun customValue(customValue: String)

      /**
       * @param datasetsColumns A list of the dataset columns included in a project.
       */
      public fun datasetsColumns(datasetsColumns: String)

      /**
       * @param dateAddValue A value that specifies how many units of time to add or subtract for a
       * date math operation.
       */
      public fun dateAddValue(dateAddValue: String)

      /**
       * @param dateTimeFormat A date format to apply to a date.
       */
      public fun dateTimeFormat(dateTimeFormat: String)

      /**
       * @param dateTimeParameters A set of parameters associated with a datetime.
       */
      public fun dateTimeParameters(dateTimeParameters: String)

      /**
       * @param deleteOtherRows Determines whether unmapped rows in a categorical mapping should be
       * deleted.
       */
      public fun deleteOtherRows(deleteOtherRows: String)

      /**
       * @param delimiter The delimiter to use when parsing separated values in a text file.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param endPattern The end pattern to locate.
       */
      public fun endPattern(endPattern: String)

      /**
       * @param endPosition The end position to locate.
       */
      public fun endPosition(endPosition: String)

      /**
       * @param endValue The end value to locate.
       */
      public fun endValue(endValue: String)

      /**
       * @param expandContractions A list of word contractions and what they expand to.
       * For eample: *can't* ; *cannot* ; *can not* .
       */
      public fun expandContractions(expandContractions: String)

      /**
       * @param exponent The exponent to apply in an exponential operation.
       */
      public fun exponent(exponent: String)

      /**
       * @param falseString A value that represents `FALSE` .
       */
      public fun falseString(falseString: String)

      /**
       * @param groupByAggFunctionOptions Specifies options to apply to the `GROUP BY` used in an
       * aggregation.
       */
      public fun groupByAggFunctionOptions(groupByAggFunctionOptions: String)

      /**
       * @param groupByColumns The columns to use in the `GROUP BY` clause.
       */
      public fun groupByColumns(groupByColumns: String)

      /**
       * @param hiddenColumns A list of columns to hide.
       */
      public fun hiddenColumns(hiddenColumns: String)

      /**
       * @param ignoreCase Indicates that lower and upper case letters are treated equally.
       */
      public fun ignoreCase(ignoreCase: String)

      /**
       * @param includeInSplit Indicates if this column is participating in a split transform.
       */
      public fun includeInSplit(includeInSplit: String)

      /**
       * @param input The input location to load the dataset from - Amazon S3 or AWS Glue Data
       * Catalog .
       */
      public fun input(input: Any)

      /**
       * @param interval The number of characters to split by.
       */
      public fun interval(interval: String)

      /**
       * @param isText Indicates if the content is text.
       */
      public fun isText(isText: String)

      /**
       * @param joinKeys The keys or columns involved in a join.
       */
      public fun joinKeys(joinKeys: String)

      /**
       * @param joinType The type of join to use, for example, `INNER JOIN` , `OUTER JOIN` , and so
       * on.
       */
      public fun joinType(joinType: String)

      /**
       * @param leftColumns The columns on the left side of the join.
       */
      public fun leftColumns(leftColumns: String)

      /**
       * @param limit The number of times to perform `split` or `replaceBy` in a string.
       */
      public fun limit(limit: String)

      /**
       * @param lowerBound The lower boundary for a value.
       */
      public fun lowerBound(lowerBound: String)

      /**
       * @param mapType The type of mappings to apply to construct a new dynamic frame.
       */
      public fun mapType(mapType: String)

      /**
       * @param modeType Determines the manner in which mode value is calculated, in case there is
       * more than one mode value.
       * Valid values: `NONE` | `AVERAGE` | `MINIMUM` | `MAXIMUM`
       */
      public fun modeType(modeType: String)

      /**
       * @param multiLine Specifies whether JSON input contains embedded new line characters.
       */
      public fun multiLine(multiLine: Boolean)

      /**
       * @param multiLine Specifies whether JSON input contains embedded new line characters.
       */
      public fun multiLine(multiLine: IResolvable)

      /**
       * @param numRows The number of rows to consider in a window.
       */
      public fun numRows(numRows: String)

      /**
       * @param numRowsAfter The number of rows to consider after the current row in a window.
       */
      public fun numRowsAfter(numRowsAfter: String)

      /**
       * @param numRowsBefore The number of rows to consider before the current row in a window.
       */
      public fun numRowsBefore(numRowsBefore: String)

      /**
       * @param orderByColumn A column to sort the results by.
       */
      public fun orderByColumn(orderByColumn: String)

      /**
       * @param orderByColumns The columns to sort the results by.
       */
      public fun orderByColumns(orderByColumns: String)

      /**
       * @param other The value to assign to unmapped cells, in categorical mapping.
       */
      public fun other(other: String)

      /**
       * @param pattern The pattern to locate.
       */
      public fun pattern(pattern: String)

      /**
       * @param patternOption1 The starting pattern to split between.
       */
      public fun patternOption1(patternOption1: String)

      /**
       * @param patternOption2 The ending pattern to split between.
       */
      public fun patternOption2(patternOption2: String)

      /**
       * @param patternOptions For splitting by multiple delimiters: A JSON-encoded string that
       * lists the patterns in the format.
       * For example: `[{\"pattern\":\"1\",\"includeInSplit\":true}]`
       */
      public fun patternOptions(patternOptions: String)

      /**
       * @param period The size of the rolling window.
       */
      public fun period(period: String)

      /**
       * @param position The character index within a string.
       */
      public fun position(position: String)

      /**
       * @param removeAllPunctuation If `true` , removes all of the following characters: `.` `.!`
       * `.,` `.?`.
       */
      public fun removeAllPunctuation(removeAllPunctuation: String)

      /**
       * @param removeAllQuotes If `true` , removes all single quotes and double quotes.
       */
      public fun removeAllQuotes(removeAllQuotes: String)

      /**
       * @param removeAllWhitespace If `true` , removes all whitespaces from the value.
       */
      public fun removeAllWhitespace(removeAllWhitespace: String)

      /**
       * @param removeCustomCharacters If `true` , removes all chraracters specified by
       * `CustomCharacters` .
       */
      public fun removeCustomCharacters(removeCustomCharacters: String)

      /**
       * @param removeCustomValue If `true` , removes all chraracters specified by `CustomValue` .
       */
      public fun removeCustomValue(removeCustomValue: String)

      /**
       * @param removeLeadingAndTrailingPunctuation If `true` , removes the following characters if
       * they occur at the start or end of the value: `.` `!` `,` `?`.
       */
      public fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String)

      /**
       * @param removeLeadingAndTrailingQuotes If `true` , removes single quotes and double quotes
       * from the beginning and end of the value.
       */
      public fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String)

      /**
       * @param removeLeadingAndTrailingWhitespace If `true` , removes all whitespaces from the
       * beginning and end of the value.
       */
      public fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String)

      /**
       * @param removeLetters If `true` , removes all uppercase and lowercase alphabetic characters
       * (A through Z;.
       * a through z).
       */
      public fun removeLetters(removeLetters: String)

      /**
       * @param removeNumbers If `true` , removes all numeric characters (0 through 9).
       */
      public fun removeNumbers(removeNumbers: String)

      /**
       * @param removeSourceColumn If `true` , the source column will be removed after un-nesting
       * that column.
       * (Used with nested column types, such as Map, Struct, or Array.)
       */
      public fun removeSourceColumn(removeSourceColumn: String)

      /**
       * @param removeSpecialCharacters If `true` , removes all of the following characters: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~`
       */
      public fun removeSpecialCharacters(removeSpecialCharacters: String)

      /**
       * @param rightColumns The columns on the right side of a join.
       */
      public fun rightColumns(rightColumns: String)

      /**
       * @param sampleSize The number of rows in the sample.
       */
      public fun sampleSize(sampleSize: String)

      /**
       * @param sampleType The sampling type to apply to the dataset.
       * Valid values: `FIRST_N` | `LAST_N` | `RANDOM`
       */
      public fun sampleType(sampleType: String)

      /**
       * @param secondInput A object value to indicate the second dataset used in a join.
       */
      public fun secondInput(secondInput: String)

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      public fun secondaryInputs(secondaryInputs: IResolvable)

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      public fun secondaryInputs(secondaryInputs: List<Any>)

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      public fun secondaryInputs(vararg secondaryInputs: Any)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      public fun sheetIndexes(sheetIndexes: IResolvable)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      public fun sheetIndexes(sheetIndexes: List<Number>)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      public fun sheetIndexes(vararg sheetIndexes: Number)

      /**
       * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
       * dataset.
       */
      public fun sheetNames(sheetNames: List<String>)

      /**
       * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
       * dataset.
       */
      public fun sheetNames(vararg sheetNames: String)

      /**
       * @param sourceColumn A source column needed for an operation, step, or transform.
       */
      public fun sourceColumn(sourceColumn: String)

      /**
       * @param sourceColumn1 A source column needed for an operation, step, or transform.
       */
      public fun sourceColumn1(sourceColumn1: String)

      /**
       * @param sourceColumn2 A source column needed for an operation, step, or transform.
       */
      public fun sourceColumn2(sourceColumn2: String)

      /**
       * @param sourceColumns A list of source columns needed for an operation, step, or transform.
       */
      public fun sourceColumns(sourceColumns: String)

      /**
       * @param startColumnIndex The index number of the first column used by an operation, step, or
       * transform.
       */
      public fun startColumnIndex(startColumnIndex: String)

      /**
       * @param startPattern The starting pattern to locate.
       */
      public fun startPattern(startPattern: String)

      /**
       * @param startPosition The starting position to locate.
       */
      public fun startPosition(startPosition: String)

      /**
       * @param startValue The starting value to locate.
       */
      public fun startValue(startValue: String)

      /**
       * @param stemmingMode Indicates this operation uses stems and lemmas (base words) for word
       * tokenization.
       */
      public fun stemmingMode(stemmingMode: String)

      /**
       * @param stepCount The total number of transforms in this recipe.
       */
      public fun stepCount(stepCount: String)

      /**
       * @param stepIndex The index ID of a step.
       */
      public fun stepIndex(stepIndex: String)

      /**
       * @param stopWordsMode Indicates this operation uses stop words as part of word tokenization.
       */
      public fun stopWordsMode(stopWordsMode: String)

      /**
       * @param strategy The resolution strategy to apply in resolving ambiguities.
       */
      public fun strategy(strategy: String)

      /**
       * @param targetColumn The column targeted by this operation.
       */
      public fun targetColumn(targetColumn: String)

      /**
       * @param targetColumnNames The names to give columns altered by this operation.
       */
      public fun targetColumnNames(targetColumnNames: String)

      /**
       * @param targetDateFormat The date format to convert to.
       */
      public fun targetDateFormat(targetDateFormat: String)

      /**
       * @param targetIndex The index number of an object that is targeted by this operation.
       */
      public fun targetIndex(targetIndex: String)

      /**
       * @param timeZone The current timezone that you want to use for dates.
       */
      public fun timeZone(timeZone: String)

      /**
       * @param tokenizerPattern A regex expression to use when splitting text into terms, also
       * called words or tokens.
       */
      public fun tokenizerPattern(tokenizerPattern: String)

      /**
       * @param trueString A value to use to represent `TRUE` .
       */
      public fun trueString(trueString: String)

      /**
       * @param udfLang The language that's used in the user-defined function.
       */
      public fun udfLang(udfLang: String)

      /**
       * @param units Specifies a unit of time.
       * For example: `MINUTES` ; `SECONDS` ; `HOURS` ; etc.
       */
      public fun units(units: String)

      /**
       * @param unpivotColumn Cast columns as rows, so that each value is a different row in a
       * single column.
       */
      public fun unpivotColumn(unpivotColumn: String)

      /**
       * @param upperBound The upper boundary for a value.
       */
      public fun upperBound(upperBound: String)

      /**
       * @param useNewDataFrame Create a new container to hold a dataset.
       */
      public fun useNewDataFrame(useNewDataFrame: String)

      /**
       * @param value A static value that can be used in a comparison, a substitution, or in another
       * context-specific way.
       * A `Value` can be a number, string, or other datatype, depending on the recipe action in
       * which it's used.
       */
      public fun `value`(`value`: String)

      /**
       * @param value1 A value that's used by this operation.
       */
      public fun value1(value1: String)

      /**
       * @param value2 A value that's used by this operation.
       */
      public fun value2(value2: String)

      /**
       * @param valueColumn The column that is provided as a value that's used by this operation.
       */
      public fun valueColumn(valueColumn: String)

      /**
       * @param viewFrame The subset of rows currently available for viewing.
       */
      public fun viewFrame(viewFrame: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty.builder()

      /**
       * @param aggregateFunction The name of an aggregation function to apply.
       */
      override fun aggregateFunction(aggregateFunction: String) {
        cdkBuilder.aggregateFunction(aggregateFunction)
      }

      /**
       * @param base The number of digits used in a counting system.
       */
      override fun base(base: String) {
        cdkBuilder.base(base)
      }

      /**
       * @param caseStatement A case statement associated with a recipe.
       */
      override fun caseStatement(caseStatement: String) {
        cdkBuilder.caseStatement(caseStatement)
      }

      /**
       * @param categoryMap A category map used for one-hot encoding.
       */
      override fun categoryMap(categoryMap: String) {
        cdkBuilder.categoryMap(categoryMap)
      }

      /**
       * @param charsToRemove Characters to remove from a step that applies one-hot encoding or
       * tokenization.
       */
      override fun charsToRemove(charsToRemove: String) {
        cdkBuilder.charsToRemove(charsToRemove)
      }

      /**
       * @param collapseConsecutiveWhitespace Remove any non-word non-punctuation character.
       */
      override fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String) {
        cdkBuilder.collapseConsecutiveWhitespace(collapseConsecutiveWhitespace)
      }

      /**
       * @param columnDataType The data type of the column.
       */
      override fun columnDataType(columnDataType: String) {
        cdkBuilder.columnDataType(columnDataType)
      }

      /**
       * @param columnRange A range of columns to which a step is applied.
       */
      override fun columnRange(columnRange: String) {
        cdkBuilder.columnRange(columnRange)
      }

      /**
       * @param count The number of times a string needs to be repeated.
       */
      override fun count(count: String) {
        cdkBuilder.count(count)
      }

      /**
       * @param customCharacters One or more characters that can be substituted or removed,
       * depending on the context.
       */
      override fun customCharacters(customCharacters: String) {
        cdkBuilder.customCharacters(customCharacters)
      }

      /**
       * @param customStopWords A list of words to ignore in a step that applies word tokenization.
       */
      override fun customStopWords(customStopWords: String) {
        cdkBuilder.customStopWords(customStopWords)
      }

      /**
       * @param customValue A list of custom values to use in a step that requires that you provide
       * a value to finish the operation.
       */
      override fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
      }

      /**
       * @param datasetsColumns A list of the dataset columns included in a project.
       */
      override fun datasetsColumns(datasetsColumns: String) {
        cdkBuilder.datasetsColumns(datasetsColumns)
      }

      /**
       * @param dateAddValue A value that specifies how many units of time to add or subtract for a
       * date math operation.
       */
      override fun dateAddValue(dateAddValue: String) {
        cdkBuilder.dateAddValue(dateAddValue)
      }

      /**
       * @param dateTimeFormat A date format to apply to a date.
       */
      override fun dateTimeFormat(dateTimeFormat: String) {
        cdkBuilder.dateTimeFormat(dateTimeFormat)
      }

      /**
       * @param dateTimeParameters A set of parameters associated with a datetime.
       */
      override fun dateTimeParameters(dateTimeParameters: String) {
        cdkBuilder.dateTimeParameters(dateTimeParameters)
      }

      /**
       * @param deleteOtherRows Determines whether unmapped rows in a categorical mapping should be
       * deleted.
       */
      override fun deleteOtherRows(deleteOtherRows: String) {
        cdkBuilder.deleteOtherRows(deleteOtherRows)
      }

      /**
       * @param delimiter The delimiter to use when parsing separated values in a text file.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param endPattern The end pattern to locate.
       */
      override fun endPattern(endPattern: String) {
        cdkBuilder.endPattern(endPattern)
      }

      /**
       * @param endPosition The end position to locate.
       */
      override fun endPosition(endPosition: String) {
        cdkBuilder.endPosition(endPosition)
      }

      /**
       * @param endValue The end value to locate.
       */
      override fun endValue(endValue: String) {
        cdkBuilder.endValue(endValue)
      }

      /**
       * @param expandContractions A list of word contractions and what they expand to.
       * For eample: *can't* ; *cannot* ; *can not* .
       */
      override fun expandContractions(expandContractions: String) {
        cdkBuilder.expandContractions(expandContractions)
      }

      /**
       * @param exponent The exponent to apply in an exponential operation.
       */
      override fun exponent(exponent: String) {
        cdkBuilder.exponent(exponent)
      }

      /**
       * @param falseString A value that represents `FALSE` .
       */
      override fun falseString(falseString: String) {
        cdkBuilder.falseString(falseString)
      }

      /**
       * @param groupByAggFunctionOptions Specifies options to apply to the `GROUP BY` used in an
       * aggregation.
       */
      override fun groupByAggFunctionOptions(groupByAggFunctionOptions: String) {
        cdkBuilder.groupByAggFunctionOptions(groupByAggFunctionOptions)
      }

      /**
       * @param groupByColumns The columns to use in the `GROUP BY` clause.
       */
      override fun groupByColumns(groupByColumns: String) {
        cdkBuilder.groupByColumns(groupByColumns)
      }

      /**
       * @param hiddenColumns A list of columns to hide.
       */
      override fun hiddenColumns(hiddenColumns: String) {
        cdkBuilder.hiddenColumns(hiddenColumns)
      }

      /**
       * @param ignoreCase Indicates that lower and upper case letters are treated equally.
       */
      override fun ignoreCase(ignoreCase: String) {
        cdkBuilder.ignoreCase(ignoreCase)
      }

      /**
       * @param includeInSplit Indicates if this column is participating in a split transform.
       */
      override fun includeInSplit(includeInSplit: String) {
        cdkBuilder.includeInSplit(includeInSplit)
      }

      /**
       * @param input The input location to load the dataset from - Amazon S3 or AWS Glue Data
       * Catalog .
       */
      override fun input(input: Any) {
        cdkBuilder.input(input)
      }

      /**
       * @param interval The number of characters to split by.
       */
      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param isText Indicates if the content is text.
       */
      override fun isText(isText: String) {
        cdkBuilder.isText(isText)
      }

      /**
       * @param joinKeys The keys or columns involved in a join.
       */
      override fun joinKeys(joinKeys: String) {
        cdkBuilder.joinKeys(joinKeys)
      }

      /**
       * @param joinType The type of join to use, for example, `INNER JOIN` , `OUTER JOIN` , and so
       * on.
       */
      override fun joinType(joinType: String) {
        cdkBuilder.joinType(joinType)
      }

      /**
       * @param leftColumns The columns on the left side of the join.
       */
      override fun leftColumns(leftColumns: String) {
        cdkBuilder.leftColumns(leftColumns)
      }

      /**
       * @param limit The number of times to perform `split` or `replaceBy` in a string.
       */
      override fun limit(limit: String) {
        cdkBuilder.limit(limit)
      }

      /**
       * @param lowerBound The lower boundary for a value.
       */
      override fun lowerBound(lowerBound: String) {
        cdkBuilder.lowerBound(lowerBound)
      }

      /**
       * @param mapType The type of mappings to apply to construct a new dynamic frame.
       */
      override fun mapType(mapType: String) {
        cdkBuilder.mapType(mapType)
      }

      /**
       * @param modeType Determines the manner in which mode value is calculated, in case there is
       * more than one mode value.
       * Valid values: `NONE` | `AVERAGE` | `MINIMUM` | `MAXIMUM`
       */
      override fun modeType(modeType: String) {
        cdkBuilder.modeType(modeType)
      }

      /**
       * @param multiLine Specifies whether JSON input contains embedded new line characters.
       */
      override fun multiLine(multiLine: Boolean) {
        cdkBuilder.multiLine(multiLine)
      }

      /**
       * @param multiLine Specifies whether JSON input contains embedded new line characters.
       */
      override fun multiLine(multiLine: IResolvable) {
        cdkBuilder.multiLine(multiLine.let(IResolvable::unwrap))
      }

      /**
       * @param numRows The number of rows to consider in a window.
       */
      override fun numRows(numRows: String) {
        cdkBuilder.numRows(numRows)
      }

      /**
       * @param numRowsAfter The number of rows to consider after the current row in a window.
       */
      override fun numRowsAfter(numRowsAfter: String) {
        cdkBuilder.numRowsAfter(numRowsAfter)
      }

      /**
       * @param numRowsBefore The number of rows to consider before the current row in a window.
       */
      override fun numRowsBefore(numRowsBefore: String) {
        cdkBuilder.numRowsBefore(numRowsBefore)
      }

      /**
       * @param orderByColumn A column to sort the results by.
       */
      override fun orderByColumn(orderByColumn: String) {
        cdkBuilder.orderByColumn(orderByColumn)
      }

      /**
       * @param orderByColumns The columns to sort the results by.
       */
      override fun orderByColumns(orderByColumns: String) {
        cdkBuilder.orderByColumns(orderByColumns)
      }

      /**
       * @param other The value to assign to unmapped cells, in categorical mapping.
       */
      override fun other(other: String) {
        cdkBuilder.other(other)
      }

      /**
       * @param pattern The pattern to locate.
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      /**
       * @param patternOption1 The starting pattern to split between.
       */
      override fun patternOption1(patternOption1: String) {
        cdkBuilder.patternOption1(patternOption1)
      }

      /**
       * @param patternOption2 The ending pattern to split between.
       */
      override fun patternOption2(patternOption2: String) {
        cdkBuilder.patternOption2(patternOption2)
      }

      /**
       * @param patternOptions For splitting by multiple delimiters: A JSON-encoded string that
       * lists the patterns in the format.
       * For example: `[{\"pattern\":\"1\",\"includeInSplit\":true}]`
       */
      override fun patternOptions(patternOptions: String) {
        cdkBuilder.patternOptions(patternOptions)
      }

      /**
       * @param period The size of the rolling window.
       */
      override fun period(period: String) {
        cdkBuilder.period(period)
      }

      /**
       * @param position The character index within a string.
       */
      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      /**
       * @param removeAllPunctuation If `true` , removes all of the following characters: `.` `.!`
       * `.,` `.?`.
       */
      override fun removeAllPunctuation(removeAllPunctuation: String) {
        cdkBuilder.removeAllPunctuation(removeAllPunctuation)
      }

      /**
       * @param removeAllQuotes If `true` , removes all single quotes and double quotes.
       */
      override fun removeAllQuotes(removeAllQuotes: String) {
        cdkBuilder.removeAllQuotes(removeAllQuotes)
      }

      /**
       * @param removeAllWhitespace If `true` , removes all whitespaces from the value.
       */
      override fun removeAllWhitespace(removeAllWhitespace: String) {
        cdkBuilder.removeAllWhitespace(removeAllWhitespace)
      }

      /**
       * @param removeCustomCharacters If `true` , removes all chraracters specified by
       * `CustomCharacters` .
       */
      override fun removeCustomCharacters(removeCustomCharacters: String) {
        cdkBuilder.removeCustomCharacters(removeCustomCharacters)
      }

      /**
       * @param removeCustomValue If `true` , removes all chraracters specified by `CustomValue` .
       */
      override fun removeCustomValue(removeCustomValue: String) {
        cdkBuilder.removeCustomValue(removeCustomValue)
      }

      /**
       * @param removeLeadingAndTrailingPunctuation If `true` , removes the following characters if
       * they occur at the start or end of the value: `.` `!` `,` `?`.
       */
      override
          fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String) {
        cdkBuilder.removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation)
      }

      /**
       * @param removeLeadingAndTrailingQuotes If `true` , removes single quotes and double quotes
       * from the beginning and end of the value.
       */
      override fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String) {
        cdkBuilder.removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes)
      }

      /**
       * @param removeLeadingAndTrailingWhitespace If `true` , removes all whitespaces from the
       * beginning and end of the value.
       */
      override fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String) {
        cdkBuilder.removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace)
      }

      /**
       * @param removeLetters If `true` , removes all uppercase and lowercase alphabetic characters
       * (A through Z;.
       * a through z).
       */
      override fun removeLetters(removeLetters: String) {
        cdkBuilder.removeLetters(removeLetters)
      }

      /**
       * @param removeNumbers If `true` , removes all numeric characters (0 through 9).
       */
      override fun removeNumbers(removeNumbers: String) {
        cdkBuilder.removeNumbers(removeNumbers)
      }

      /**
       * @param removeSourceColumn If `true` , the source column will be removed after un-nesting
       * that column.
       * (Used with nested column types, such as Map, Struct, or Array.)
       */
      override fun removeSourceColumn(removeSourceColumn: String) {
        cdkBuilder.removeSourceColumn(removeSourceColumn)
      }

      /**
       * @param removeSpecialCharacters If `true` , removes all of the following characters: `!.
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~`
       */
      override fun removeSpecialCharacters(removeSpecialCharacters: String) {
        cdkBuilder.removeSpecialCharacters(removeSpecialCharacters)
      }

      /**
       * @param rightColumns The columns on the right side of a join.
       */
      override fun rightColumns(rightColumns: String) {
        cdkBuilder.rightColumns(rightColumns)
      }

      /**
       * @param sampleSize The number of rows in the sample.
       */
      override fun sampleSize(sampleSize: String) {
        cdkBuilder.sampleSize(sampleSize)
      }

      /**
       * @param sampleType The sampling type to apply to the dataset.
       * Valid values: `FIRST_N` | `LAST_N` | `RANDOM`
       */
      override fun sampleType(sampleType: String) {
        cdkBuilder.sampleType(sampleType)
      }

      /**
       * @param secondInput A object value to indicate the second dataset used in a join.
       */
      override fun secondInput(secondInput: String) {
        cdkBuilder.secondInput(secondInput)
      }

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      override fun secondaryInputs(secondaryInputs: IResolvable) {
        cdkBuilder.secondaryInputs(secondaryInputs.let(IResolvable::unwrap))
      }

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      override fun secondaryInputs(secondaryInputs: List<Any>) {
        cdkBuilder.secondaryInputs(secondaryInputs)
      }

      /**
       * @param secondaryInputs A list of secondary inputs in a UNION transform.
       */
      override fun secondaryInputs(vararg secondaryInputs: Any): Unit =
          secondaryInputs(secondaryInputs.toList())

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      override fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes.let(IResolvable::unwrap))
      }

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      override fun sheetIndexes(sheetIndexes: List<Number>) {
        cdkBuilder.sheetIndexes(sheetIndexes)
      }

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file, which will be included in
       * a dataset.
       */
      override fun sheetIndexes(vararg sheetIndexes: Number): Unit =
          sheetIndexes(sheetIndexes.toList())

      /**
       * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
       * dataset.
       */
      override fun sheetNames(sheetNames: List<String>) {
        cdkBuilder.sheetNames(sheetNames)
      }

      /**
       * @param sheetNames Oone or more named sheets in the Excel file, which will be included in a
       * dataset.
       */
      override fun sheetNames(vararg sheetNames: String): Unit = sheetNames(sheetNames.toList())

      /**
       * @param sourceColumn A source column needed for an operation, step, or transform.
       */
      override fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
      }

      /**
       * @param sourceColumn1 A source column needed for an operation, step, or transform.
       */
      override fun sourceColumn1(sourceColumn1: String) {
        cdkBuilder.sourceColumn1(sourceColumn1)
      }

      /**
       * @param sourceColumn2 A source column needed for an operation, step, or transform.
       */
      override fun sourceColumn2(sourceColumn2: String) {
        cdkBuilder.sourceColumn2(sourceColumn2)
      }

      /**
       * @param sourceColumns A list of source columns needed for an operation, step, or transform.
       */
      override fun sourceColumns(sourceColumns: String) {
        cdkBuilder.sourceColumns(sourceColumns)
      }

      /**
       * @param startColumnIndex The index number of the first column used by an operation, step, or
       * transform.
       */
      override fun startColumnIndex(startColumnIndex: String) {
        cdkBuilder.startColumnIndex(startColumnIndex)
      }

      /**
       * @param startPattern The starting pattern to locate.
       */
      override fun startPattern(startPattern: String) {
        cdkBuilder.startPattern(startPattern)
      }

      /**
       * @param startPosition The starting position to locate.
       */
      override fun startPosition(startPosition: String) {
        cdkBuilder.startPosition(startPosition)
      }

      /**
       * @param startValue The starting value to locate.
       */
      override fun startValue(startValue: String) {
        cdkBuilder.startValue(startValue)
      }

      /**
       * @param stemmingMode Indicates this operation uses stems and lemmas (base words) for word
       * tokenization.
       */
      override fun stemmingMode(stemmingMode: String) {
        cdkBuilder.stemmingMode(stemmingMode)
      }

      /**
       * @param stepCount The total number of transforms in this recipe.
       */
      override fun stepCount(stepCount: String) {
        cdkBuilder.stepCount(stepCount)
      }

      /**
       * @param stepIndex The index ID of a step.
       */
      override fun stepIndex(stepIndex: String) {
        cdkBuilder.stepIndex(stepIndex)
      }

      /**
       * @param stopWordsMode Indicates this operation uses stop words as part of word tokenization.
       */
      override fun stopWordsMode(stopWordsMode: String) {
        cdkBuilder.stopWordsMode(stopWordsMode)
      }

      /**
       * @param strategy The resolution strategy to apply in resolving ambiguities.
       */
      override fun strategy(strategy: String) {
        cdkBuilder.strategy(strategy)
      }

      /**
       * @param targetColumn The column targeted by this operation.
       */
      override fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
      }

      /**
       * @param targetColumnNames The names to give columns altered by this operation.
       */
      override fun targetColumnNames(targetColumnNames: String) {
        cdkBuilder.targetColumnNames(targetColumnNames)
      }

      /**
       * @param targetDateFormat The date format to convert to.
       */
      override fun targetDateFormat(targetDateFormat: String) {
        cdkBuilder.targetDateFormat(targetDateFormat)
      }

      /**
       * @param targetIndex The index number of an object that is targeted by this operation.
       */
      override fun targetIndex(targetIndex: String) {
        cdkBuilder.targetIndex(targetIndex)
      }

      /**
       * @param timeZone The current timezone that you want to use for dates.
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      /**
       * @param tokenizerPattern A regex expression to use when splitting text into terms, also
       * called words or tokens.
       */
      override fun tokenizerPattern(tokenizerPattern: String) {
        cdkBuilder.tokenizerPattern(tokenizerPattern)
      }

      /**
       * @param trueString A value to use to represent `TRUE` .
       */
      override fun trueString(trueString: String) {
        cdkBuilder.trueString(trueString)
      }

      /**
       * @param udfLang The language that's used in the user-defined function.
       */
      override fun udfLang(udfLang: String) {
        cdkBuilder.udfLang(udfLang)
      }

      /**
       * @param units Specifies a unit of time.
       * For example: `MINUTES` ; `SECONDS` ; `HOURS` ; etc.
       */
      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      /**
       * @param unpivotColumn Cast columns as rows, so that each value is a different row in a
       * single column.
       */
      override fun unpivotColumn(unpivotColumn: String) {
        cdkBuilder.unpivotColumn(unpivotColumn)
      }

      /**
       * @param upperBound The upper boundary for a value.
       */
      override fun upperBound(upperBound: String) {
        cdkBuilder.upperBound(upperBound)
      }

      /**
       * @param useNewDataFrame Create a new container to hold a dataset.
       */
      override fun useNewDataFrame(useNewDataFrame: String) {
        cdkBuilder.useNewDataFrame(useNewDataFrame)
      }

      /**
       * @param value A static value that can be used in a comparison, a substitution, or in another
       * context-specific way.
       * A `Value` can be a number, string, or other datatype, depending on the recipe action in
       * which it's used.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value1 A value that's used by this operation.
       */
      override fun value1(value1: String) {
        cdkBuilder.value1(value1)
      }

      /**
       * @param value2 A value that's used by this operation.
       */
      override fun value2(value2: String) {
        cdkBuilder.value2(value2)
      }

      /**
       * @param valueColumn The column that is provided as a value that's used by this operation.
       */
      override fun valueColumn(valueColumn: String) {
        cdkBuilder.valueColumn(valueColumn)
      }

      /**
       * @param viewFrame The subset of rows currently available for viewing.
       */
      override fun viewFrame(viewFrame: String) {
        cdkBuilder.viewFrame(viewFrame)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty,
    ) : CdkObject(cdkObject), RecipeParametersProperty {
      /**
       * The name of an aggregation function to apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-aggregatefunction)
       */
      override fun aggregateFunction(): String? = unwrap(this).getAggregateFunction()

      /**
       * The number of digits used in a counting system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-base)
       */
      override fun base(): String? = unwrap(this).getBase()

      /**
       * A case statement associated with a recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-casestatement)
       */
      override fun caseStatement(): String? = unwrap(this).getCaseStatement()

      /**
       * A category map used for one-hot encoding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-categorymap)
       */
      override fun categoryMap(): String? = unwrap(this).getCategoryMap()

      /**
       * Characters to remove from a step that applies one-hot encoding or tokenization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-charstoremove)
       */
      override fun charsToRemove(): String? = unwrap(this).getCharsToRemove()

      /**
       * Remove any non-word non-punctuation character.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-collapseconsecutivewhitespace)
       */
      override fun collapseConsecutiveWhitespace(): String? =
          unwrap(this).getCollapseConsecutiveWhitespace()

      /**
       * The data type of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-columndatatype)
       */
      override fun columnDataType(): String? = unwrap(this).getColumnDataType()

      /**
       * A range of columns to which a step is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-columnrange)
       */
      override fun columnRange(): String? = unwrap(this).getColumnRange()

      /**
       * The number of times a string needs to be repeated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-count)
       */
      override fun count(): String? = unwrap(this).getCount()

      /**
       * One or more characters that can be substituted or removed, depending on the context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customcharacters)
       */
      override fun customCharacters(): String? = unwrap(this).getCustomCharacters()

      /**
       * A list of words to ignore in a step that applies word tokenization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customstopwords)
       */
      override fun customStopWords(): String? = unwrap(this).getCustomStopWords()

      /**
       * A list of custom values to use in a step that requires that you provide a value to finish
       * the operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-customvalue)
       */
      override fun customValue(): String? = unwrap(this).getCustomValue()

      /**
       * A list of the dataset columns included in a project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datasetscolumns)
       */
      override fun datasetsColumns(): String? = unwrap(this).getDatasetsColumns()

      /**
       * A value that specifies how many units of time to add or subtract for a date math operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-dateaddvalue)
       */
      override fun dateAddValue(): String? = unwrap(this).getDateAddValue()

      /**
       * A date format to apply to a date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datetimeformat)
       */
      override fun dateTimeFormat(): String? = unwrap(this).getDateTimeFormat()

      /**
       * A set of parameters associated with a datetime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-datetimeparameters)
       */
      override fun dateTimeParameters(): String? = unwrap(this).getDateTimeParameters()

      /**
       * Determines whether unmapped rows in a categorical mapping should be deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-deleteotherrows)
       */
      override fun deleteOtherRows(): String? = unwrap(this).getDeleteOtherRows()

      /**
       * The delimiter to use when parsing separated values in a text file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * The end pattern to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endpattern)
       */
      override fun endPattern(): String? = unwrap(this).getEndPattern()

      /**
       * The end position to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endposition)
       */
      override fun endPosition(): String? = unwrap(this).getEndPosition()

      /**
       * The end value to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-endvalue)
       */
      override fun endValue(): String? = unwrap(this).getEndValue()

      /**
       * A list of word contractions and what they expand to.
       *
       * For eample: *can't* ; *cannot* ; *can not* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-expandcontractions)
       */
      override fun expandContractions(): String? = unwrap(this).getExpandContractions()

      /**
       * The exponent to apply in an exponential operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-exponent)
       */
      override fun exponent(): String? = unwrap(this).getExponent()

      /**
       * A value that represents `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-falsestring)
       */
      override fun falseString(): String? = unwrap(this).getFalseString()

      /**
       * Specifies options to apply to the `GROUP BY` used in an aggregation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-groupbyaggfunctionoptions)
       */
      override fun groupByAggFunctionOptions(): String? =
          unwrap(this).getGroupByAggFunctionOptions()

      /**
       * The columns to use in the `GROUP BY` clause.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-groupbycolumns)
       */
      override fun groupByColumns(): String? = unwrap(this).getGroupByColumns()

      /**
       * A list of columns to hide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-hiddencolumns)
       */
      override fun hiddenColumns(): String? = unwrap(this).getHiddenColumns()

      /**
       * Indicates that lower and upper case letters are treated equally.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-ignorecase)
       */
      override fun ignoreCase(): String? = unwrap(this).getIgnoreCase()

      /**
       * Indicates if this column is participating in a split transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-includeinsplit)
       */
      override fun includeInSplit(): String? = unwrap(this).getIncludeInSplit()

      /**
       * The input location to load the dataset from - Amazon S3 or AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-input)
       */
      override fun input(): Any? = unwrap(this).getInput()

      /**
       * The number of characters to split by.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-interval)
       */
      override fun interval(): String? = unwrap(this).getInterval()

      /**
       * Indicates if the content is text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-istext)
       */
      override fun isText(): String? = unwrap(this).getIsText()

      /**
       * The keys or columns involved in a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-joinkeys)
       */
      override fun joinKeys(): String? = unwrap(this).getJoinKeys()

      /**
       * The type of join to use, for example, `INNER JOIN` , `OUTER JOIN` , and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-jointype)
       */
      override fun joinType(): String? = unwrap(this).getJoinType()

      /**
       * The columns on the left side of the join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-leftcolumns)
       */
      override fun leftColumns(): String? = unwrap(this).getLeftColumns()

      /**
       * The number of times to perform `split` or `replaceBy` in a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-limit)
       */
      override fun limit(): String? = unwrap(this).getLimit()

      /**
       * The lower boundary for a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-lowerbound)
       */
      override fun lowerBound(): String? = unwrap(this).getLowerBound()

      /**
       * The type of mappings to apply to construct a new dynamic frame.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-maptype)
       */
      override fun mapType(): String? = unwrap(this).getMapType()

      /**
       * Determines the manner in which mode value is calculated, in case there is more than one
       * mode value.
       *
       * Valid values: `NONE` | `AVERAGE` | `MINIMUM` | `MAXIMUM`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-modetype)
       */
      override fun modeType(): String? = unwrap(this).getModeType()

      /**
       * Specifies whether JSON input contains embedded new line characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-multiline)
       */
      override fun multiLine(): Any? = unwrap(this).getMultiLine()

      /**
       * The number of rows to consider in a window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrows)
       */
      override fun numRows(): String? = unwrap(this).getNumRows()

      /**
       * The number of rows to consider after the current row in a window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrowsafter)
       */
      override fun numRowsAfter(): String? = unwrap(this).getNumRowsAfter()

      /**
       * The number of rows to consider before the current row in a window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-numrowsbefore)
       */
      override fun numRowsBefore(): String? = unwrap(this).getNumRowsBefore()

      /**
       * A column to sort the results by.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-orderbycolumn)
       */
      override fun orderByColumn(): String? = unwrap(this).getOrderByColumn()

      /**
       * The columns to sort the results by.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-orderbycolumns)
       */
      override fun orderByColumns(): String? = unwrap(this).getOrderByColumns()

      /**
       * The value to assign to unmapped cells, in categorical mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-other)
       */
      override fun other(): String? = unwrap(this).getOther()

      /**
       * The pattern to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-pattern)
       */
      override fun pattern(): String? = unwrap(this).getPattern()

      /**
       * The starting pattern to split between.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoption1)
       */
      override fun patternOption1(): String? = unwrap(this).getPatternOption1()

      /**
       * The ending pattern to split between.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoption2)
       */
      override fun patternOption2(): String? = unwrap(this).getPatternOption2()

      /**
       * For splitting by multiple delimiters: A JSON-encoded string that lists the patterns in the
       * format.
       *
       * For example: `[{\"pattern\":\"1\",\"includeInSplit\":true}]`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-patternoptions)
       */
      override fun patternOptions(): String? = unwrap(this).getPatternOptions()

      /**
       * The size of the rolling window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-period)
       */
      override fun period(): String? = unwrap(this).getPeriod()

      /**
       * The character index within a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-position)
       */
      override fun position(): String? = unwrap(this).getPosition()

      /**
       * If `true` , removes all of the following characters: `.` `.!` `.,` `.?`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallpunctuation)
       */
      override fun removeAllPunctuation(): String? = unwrap(this).getRemoveAllPunctuation()

      /**
       * If `true` , removes all single quotes and double quotes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallquotes)
       */
      override fun removeAllQuotes(): String? = unwrap(this).getRemoveAllQuotes()

      /**
       * If `true` , removes all whitespaces from the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeallwhitespace)
       */
      override fun removeAllWhitespace(): String? = unwrap(this).getRemoveAllWhitespace()

      /**
       * If `true` , removes all chraracters specified by `CustomCharacters` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removecustomcharacters)
       */
      override fun removeCustomCharacters(): String? = unwrap(this).getRemoveCustomCharacters()

      /**
       * If `true` , removes all chraracters specified by `CustomValue` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removecustomvalue)
       */
      override fun removeCustomValue(): String? = unwrap(this).getRemoveCustomValue()

      /**
       * If `true` , removes the following characters if they occur at the start or end of the
       * value: `.` `!` `,` `?`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingpunctuation)
       */
      override fun removeLeadingAndTrailingPunctuation(): String? =
          unwrap(this).getRemoveLeadingAndTrailingPunctuation()

      /**
       * If `true` , removes single quotes and double quotes from the beginning and end of the
       * value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingquotes)
       */
      override fun removeLeadingAndTrailingQuotes(): String? =
          unwrap(this).getRemoveLeadingAndTrailingQuotes()

      /**
       * If `true` , removes all whitespaces from the beginning and end of the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeleadingandtrailingwhitespace)
       */
      override fun removeLeadingAndTrailingWhitespace(): String? =
          unwrap(this).getRemoveLeadingAndTrailingWhitespace()

      /**
       * If `true` , removes all uppercase and lowercase alphabetic characters (A through Z;
       *
       * a through z).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removeletters)
       */
      override fun removeLetters(): String? = unwrap(this).getRemoveLetters()

      /**
       * If `true` , removes all numeric characters (0 through 9).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removenumbers)
       */
      override fun removeNumbers(): String? = unwrap(this).getRemoveNumbers()

      /**
       * If `true` , the source column will be removed after un-nesting that column.
       *
       * (Used with nested column types, such as Map, Struct, or Array.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removesourcecolumn)
       */
      override fun removeSourceColumn(): String? = unwrap(this).getRemoveSourceColumn()

      /**
       * If `true` , removes all of the following characters: `!
       *
       * " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? &#64; [ \ ] ^ _ ` { | } ~`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-removespecialcharacters)
       */
      override fun removeSpecialCharacters(): String? = unwrap(this).getRemoveSpecialCharacters()

      /**
       * The columns on the right side of a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-rightcolumns)
       */
      override fun rightColumns(): String? = unwrap(this).getRightColumns()

      /**
       * The number of rows in the sample.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-samplesize)
       */
      override fun sampleSize(): String? = unwrap(this).getSampleSize()

      /**
       * The sampling type to apply to the dataset.
       *
       * Valid values: `FIRST_N` | `LAST_N` | `RANDOM`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sampletype)
       */
      override fun sampleType(): String? = unwrap(this).getSampleType()

      /**
       * A object value to indicate the second dataset used in a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-secondinput)
       */
      override fun secondInput(): String? = unwrap(this).getSecondInput()

      /**
       * A list of secondary inputs in a UNION transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-secondaryinputs)
       */
      override fun secondaryInputs(): Any? = unwrap(this).getSecondaryInputs()

      /**
       * One or more sheet numbers in the Excel file, which will be included in a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sheetindexes)
       */
      override fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

      /**
       * Oone or more named sheets in the Excel file, which will be included in a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sheetnames)
       */
      override fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

      /**
       * A source column needed for an operation, step, or transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn)
       */
      override fun sourceColumn(): String? = unwrap(this).getSourceColumn()

      /**
       * A source column needed for an operation, step, or transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn1)
       */
      override fun sourceColumn1(): String? = unwrap(this).getSourceColumn1()

      /**
       * A source column needed for an operation, step, or transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumn2)
       */
      override fun sourceColumn2(): String? = unwrap(this).getSourceColumn2()

      /**
       * A list of source columns needed for an operation, step, or transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-sourcecolumns)
       */
      override fun sourceColumns(): String? = unwrap(this).getSourceColumns()

      /**
       * The index number of the first column used by an operation, step, or transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startcolumnindex)
       */
      override fun startColumnIndex(): String? = unwrap(this).getStartColumnIndex()

      /**
       * The starting pattern to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startpattern)
       */
      override fun startPattern(): String? = unwrap(this).getStartPattern()

      /**
       * The starting position to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startposition)
       */
      override fun startPosition(): String? = unwrap(this).getStartPosition()

      /**
       * The starting value to locate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-startvalue)
       */
      override fun startValue(): String? = unwrap(this).getStartValue()

      /**
       * Indicates this operation uses stems and lemmas (base words) for word tokenization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stemmingmode)
       */
      override fun stemmingMode(): String? = unwrap(this).getStemmingMode()

      /**
       * The total number of transforms in this recipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stepcount)
       */
      override fun stepCount(): String? = unwrap(this).getStepCount()

      /**
       * The index ID of a step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stepindex)
       */
      override fun stepIndex(): String? = unwrap(this).getStepIndex()

      /**
       * Indicates this operation uses stop words as part of word tokenization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-stopwordsmode)
       */
      override fun stopWordsMode(): String? = unwrap(this).getStopWordsMode()

      /**
       * The resolution strategy to apply in resolving ambiguities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-strategy)
       */
      override fun strategy(): String? = unwrap(this).getStrategy()

      /**
       * The column targeted by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetcolumn)
       */
      override fun targetColumn(): String? = unwrap(this).getTargetColumn()

      /**
       * The names to give columns altered by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetcolumnnames)
       */
      override fun targetColumnNames(): String? = unwrap(this).getTargetColumnNames()

      /**
       * The date format to convert to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetdateformat)
       */
      override fun targetDateFormat(): String? = unwrap(this).getTargetDateFormat()

      /**
       * The index number of an object that is targeted by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-targetindex)
       */
      override fun targetIndex(): String? = unwrap(this).getTargetIndex()

      /**
       * The current timezone that you want to use for dates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-timezone)
       */
      override fun timeZone(): String? = unwrap(this).getTimeZone()

      /**
       * A regex expression to use when splitting text into terms, also called words or tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-tokenizerpattern)
       */
      override fun tokenizerPattern(): String? = unwrap(this).getTokenizerPattern()

      /**
       * A value to use to represent `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-truestring)
       */
      override fun trueString(): String? = unwrap(this).getTrueString()

      /**
       * The language that's used in the user-defined function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-udflang)
       */
      override fun udfLang(): String? = unwrap(this).getUdfLang()

      /**
       * Specifies a unit of time.
       *
       * For example: `MINUTES` ; `SECONDS` ; `HOURS` ; etc.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-units)
       */
      override fun units(): String? = unwrap(this).getUnits()

      /**
       * Cast columns as rows, so that each value is a different row in a single column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-unpivotcolumn)
       */
      override fun unpivotColumn(): String? = unwrap(this).getUnpivotColumn()

      /**
       * The upper boundary for a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-upperbound)
       */
      override fun upperBound(): String? = unwrap(this).getUpperBound()

      /**
       * Create a new container to hold a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-usenewdataframe)
       */
      override fun useNewDataFrame(): String? = unwrap(this).getUseNewDataFrame()

      /**
       * A static value that can be used in a comparison, a substitution, or in another
       * context-specific way.
       *
       * A `Value` can be a number, string, or other datatype, depending on the recipe action in
       * which it's used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()

      /**
       * A value that's used by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value1)
       */
      override fun value1(): String? = unwrap(this).getValue1()

      /**
       * A value that's used by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-value2)
       */
      override fun value2(): String? = unwrap(this).getValue2()

      /**
       * The column that is provided as a value that's used by this operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-valuecolumn)
       */
      override fun valueColumn(): String? = unwrap(this).getValueColumn()

      /**
       * The subset of rows currently available for viewing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html#cfn-databrew-recipe-recipeparameters-viewframe)
       */
      override fun viewFrame(): String? = unwrap(this).getViewFrame()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty):
          RecipeParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeParametersProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty
    }
  }

  /**
   * Represents secondary inputs in a UNION transform.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * SecondaryInputProperty secondaryInputProperty = SecondaryInputProperty.builder()
   * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build())
   * .s3InputDefinition(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html)
   */
  public interface SecondaryInputProperty {
    /**
     * The AWS Glue Data Catalog parameters for the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html#cfn-databrew-recipe-secondaryinput-datacataloginputdefinition)
     */
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    /**
     * The Amazon S3 location where the data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html#cfn-databrew-recipe-secondaryinput-s3inputdefinition)
     */
    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    /**
     * A builder for [SecondaryInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07da4ac2449a81015b910b3e9adc3ab24c1dc9965866359eb1600c78a9eda524")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4ac9f8d0cc6f72eaea2c632b63ce2f084a2c189df00c23b3a1ddc4cdc0e152")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty.builder()

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07da4ac2449a81015b910b3e9adc3ab24c1dc9965866359eb1600c78a9eda524")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4ac9f8d0cc6f72eaea2c632b63ce2f084a2c189df00c23b3a1ddc4cdc0e152")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty,
    ) : CdkObject(cdkObject), SecondaryInputProperty {
      /**
       * The AWS Glue Data Catalog parameters for the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html#cfn-databrew-recipe-secondaryinput-datacataloginputdefinition)
       */
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      /**
       * The Amazon S3 location where the data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html#cfn-databrew-recipe-secondaryinput-s3inputdefinition)
       */
      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty):
          SecondaryInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecondaryInputProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty
    }
  }

  /**
   * Represents a single step from a DataBrew recipe to be performed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
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
  public interface RecipeStepProperty {
    /**
     * The particular action to be performed in the recipe step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html#cfn-databrew-recipe-recipestep-action)
     */
    public fun action(): Any

    /**
     * One or more conditions that must be met for the recipe step to succeed.
     *
     *
     * All of the conditions in the array must be met. In other words, all of the conditions must be
     * combined using a logical AND operation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html#cfn-databrew-recipe-recipestep-conditionexpressions)
     */
    public fun conditionExpressions(): Any? = unwrap(this).getConditionExpressions()

    /**
     * A builder for [RecipeStepProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      public fun action(action: ActionProperty)

      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e33849bae2cbbf4f460c44579da2fd3f982b69f92ef618ebb5cbc5a812ea5611")
      public fun action(action: ActionProperty.Builder.() -> Unit)

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      public fun conditionExpressions(conditionExpressions: IResolvable)

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      public fun conditionExpressions(conditionExpressions: List<Any>)

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      public fun conditionExpressions(vararg conditionExpressions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.builder()

      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      /**
       * @param action The particular action to be performed in the recipe step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e33849bae2cbbf4f460c44579da2fd3f982b69f92ef618ebb5cbc5a812ea5611")
      override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      override fun conditionExpressions(conditionExpressions: IResolvable) {
        cdkBuilder.conditionExpressions(conditionExpressions.let(IResolvable::unwrap))
      }

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      override fun conditionExpressions(conditionExpressions: List<Any>) {
        cdkBuilder.conditionExpressions(conditionExpressions)
      }

      /**
       * @param conditionExpressions One or more conditions that must be met for the recipe step to
       * succeed.
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       */
      override fun conditionExpressions(vararg conditionExpressions: Any): Unit =
          conditionExpressions(conditionExpressions.toList())

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty,
    ) : CdkObject(cdkObject), RecipeStepProperty {
      /**
       * The particular action to be performed in the recipe step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html#cfn-databrew-recipe-recipestep-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * One or more conditions that must be met for the recipe step to succeed.
       *
       *
       * All of the conditions in the array must be met. In other words, all of the conditions must
       * be combined using a logical AND operation.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html#cfn-databrew-recipe-recipestep-conditionexpressions)
       */
      override fun conditionExpressions(): Any? = unwrap(this).getConditionExpressions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeStepProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty):
          RecipeStepProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeStepProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty
    }
  }
}
