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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a new ruleset that can be used in a profile job to validate the data quality of a
 * dataset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
 * CfnRuleset cfnRuleset = CfnRuleset.Builder.create(this, "MyCfnRuleset")
 * .name("name")
 * .rules(List.of(RuleProperty.builder()
 * .checkExpression("checkExpression")
 * .name("name")
 * // the properties below are optional
 * .columnSelectors(List.of(ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build()))
 * .disabled(false)
 * .substitutionMap(List.of(SubstitutionValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .threshold(ThresholdProperty.builder()
 * .value(123)
 * // the properties below are optional
 * .type("type")
 * .unit("unit")
 * .build())
 * .build()))
 * .targetArn("targetArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html)
 */
public open class CfnRuleset(
  cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRulesetProps,
  ) :
      this(software.amazon.awscdk.services.databrew.CfnRuleset(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRulesetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRulesetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRulesetProps(props)
  )

  /**
   * The description of the ruleset.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the ruleset.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the ruleset.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the ruleset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains metadata about the ruleset.
   */
  public open fun rules(): Any = unwrap(this).getRules()

  /**
   * Contains metadata about the ruleset.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains metadata about the ruleset.
   */
  public open fun rules(`value`: List<Any>) {
    unwrap(this).setRules(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Contains metadata about the ruleset.
   */
  public open fun rules(vararg `value`: Any): Unit = rules(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnRuleset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-description)
     * @param description The description of the ruleset. 
     */
    public fun description(description: String)

    /**
     * The name of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-name)
     * @param name The name of the ruleset. 
     */
    public fun name(name: String)

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(rules: IResolvable)

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(rules: List<Any>)

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(vararg rules: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is
     * associated with. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRuleset.Builder =
        software.amazon.awscdk.services.databrew.CfnRuleset.Builder.create(scope, id)

    /**
     * The description of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-description)
     * @param description The description of the ruleset. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-name)
     * @param name The name of the ruleset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is
     * associated with. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnRuleset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset): CfnRuleset =
        CfnRuleset(cdkObject)

    internal fun unwrap(wrapped: CfnRuleset): software.amazon.awscdk.services.databrew.CfnRuleset =
        wrapped.cdkObject as software.amazon.awscdk.services.databrew.CfnRuleset
  }

  /**
   * Selector of a column from a dataset for profile job configuration.
   *
   * One selector includes either a column name or a regular expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ColumnSelectorProperty columnSelectorProperty = ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html)
   */
  public interface ColumnSelectorProperty {
    /**
     * The name of a column from a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html#cfn-databrew-ruleset-columnselector-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A regular expression for selecting a column from a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html#cfn-databrew-ruleset-columnselector-regex)
     */
    public fun regex(): String? = unwrap(this).getRegex()

    /**
     * A builder for [ColumnSelectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of a column from a dataset.
       */
      public fun name(name: String)

      /**
       * @param regex A regular expression for selecting a column from a dataset.
       */
      public fun regex(regex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty.builder()

      /**
       * @param name The name of a column from a dataset.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param regex A regular expression for selecting a column from a dataset.
       */
      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty,
    ) : CdkObject(cdkObject), ColumnSelectorProperty {
      /**
       * The name of a column from a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html#cfn-databrew-ruleset-columnselector-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A regular expression for selecting a column from a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html#cfn-databrew-ruleset-columnselector-regex)
       */
      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty):
          ColumnSelectorProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnSelectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnSelectorProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.ColumnSelectorProperty
    }
  }

  /**
   * Represents a single data quality requirement that should be validated in the scope of this
   * dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .checkExpression("checkExpression")
   * .name("name")
   * // the properties below are optional
   * .columnSelectors(List.of(ColumnSelectorProperty.builder()
   * .name("name")
   * .regex("regex")
   * .build()))
   * .disabled(false)
   * .substitutionMap(List.of(SubstitutionValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .threshold(ThresholdProperty.builder()
   * .value(123)
   * // the properties below are optional
   * .type("type")
   * .unit("unit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html)
   */
  public interface RuleProperty {
    /**
     * The expression which includes column references, condition names followed by variable
     * references, possibly grouped and combined with other conditions.
     *
     * For example, `(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1 ends_with
     * :suffix1 or :col1 ends_with :suffix2)` . Column and value references are substitution variables
     * that should start with the ':' symbol. Depending on the context, substitution variables' values
     * can be either an actual value or a column name. These values are defined in the SubstitutionMap.
     * If a CheckExpression starts with a column reference, then ColumnSelectors in the rule should be
     * null. If ColumnSelectors has been defined, then there should be no columnn reference in the left
     * side of a condition, for example, `is_between :val1 and :val2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-checkexpression)
     */
    public fun checkExpression(): String

    /**
     * List of column selectors.
     *
     * Selectors can be used to select columns using a name or regular expression from the dataset.
     * Rule will be applied to selected columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-columnselectors)
     */
    public fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

    /**
     * A value that specifies whether the rule is disabled.
     *
     * Once a rule is disabled, a profile job will not validate it during a job run. Default value
     * is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-disabled)
     */
    public fun disabled(): Any? = unwrap(this).getDisabled()

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-name)
     */
    public fun name(): String

    /**
     * The map of substitution variable names to their values used in a check expression.
     *
     * Variable names should start with a ':' (colon). Variable values can either be actual values
     * or column names. To differentiate between the two, column names should be enclosed in backticks,
     * for example, `":col1": "`Column A`".`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-substitutionmap)
     */
    public fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

    /**
     * The threshold used with a non-aggregate check expression.
     *
     * Non-aggregate check expressions will be applied to each row in a specific column, and the
     * threshold will be used to determine whether the validation succeeds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-threshold)
     */
    public fun threshold(): Any? = unwrap(this).getThreshold()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param checkExpression The expression which includes column references, condition names
       * followed by variable references, possibly grouped and combined with other conditions. 
       * For example, `(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1
       * ends_with :suffix1 or :col1 ends_with :suffix2)` . Column and value references are
       * substitution variables that should start with the ':' symbol. Depending on the context,
       * substitution variables' values can be either an actual value or a column name. These values
       * are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
       * ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there
       * should be no columnn reference in the left side of a condition, for example, `is_between :val1
       * and :val2` .
       */
      public fun checkExpression(checkExpression: String)

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      public fun columnSelectors(columnSelectors: IResolvable)

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      public fun columnSelectors(columnSelectors: List<Any>)

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      public fun columnSelectors(vararg columnSelectors: Any)

      /**
       * @param disabled A value that specifies whether the rule is disabled.
       * Once a rule is disabled, a profile job will not validate it during a job run. Default value
       * is false.
       */
      public fun disabled(disabled: Boolean)

      /**
       * @param disabled A value that specifies whether the rule is disabled.
       * Once a rule is disabled, a profile job will not validate it during a job run. Default value
       * is false.
       */
      public fun disabled(disabled: IResolvable)

      /**
       * @param name The name of the rule. 
       */
      public fun name(name: String)

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      public fun substitutionMap(substitutionMap: IResolvable)

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      public fun substitutionMap(substitutionMap: List<Any>)

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      public fun substitutionMap(vararg substitutionMap: Any)

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      public fun threshold(threshold: IResolvable)

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      public fun threshold(threshold: ThresholdProperty)

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      public fun threshold(threshold: ThresholdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty.builder()

      /**
       * @param checkExpression The expression which includes column references, condition names
       * followed by variable references, possibly grouped and combined with other conditions. 
       * For example, `(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1
       * ends_with :suffix1 or :col1 ends_with :suffix2)` . Column and value references are
       * substitution variables that should start with the ':' symbol. Depending on the context,
       * substitution variables' values can be either an actual value or a column name. These values
       * are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
       * ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there
       * should be no columnn reference in the left side of a condition, for example, `is_between :val1
       * and :val2` .
       */
      override fun checkExpression(checkExpression: String) {
        cdkBuilder.checkExpression(checkExpression)
      }

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      override fun columnSelectors(columnSelectors: IResolvable) {
        cdkBuilder.columnSelectors(columnSelectors.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      override fun columnSelectors(columnSelectors: List<Any>) {
        cdkBuilder.columnSelectors(columnSelectors.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param columnSelectors List of column selectors.
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       */
      override fun columnSelectors(vararg columnSelectors: Any): Unit =
          columnSelectors(columnSelectors.toList())

      /**
       * @param disabled A value that specifies whether the rule is disabled.
       * Once a rule is disabled, a profile job will not validate it during a job run. Default value
       * is false.
       */
      override fun disabled(disabled: Boolean) {
        cdkBuilder.disabled(disabled)
      }

      /**
       * @param disabled A value that specifies whether the rule is disabled.
       * Once a rule is disabled, a profile job will not validate it during a job run. Default value
       * is false.
       */
      override fun disabled(disabled: IResolvable) {
        cdkBuilder.disabled(disabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param name The name of the rule. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      override fun substitutionMap(substitutionMap: IResolvable) {
        cdkBuilder.substitutionMap(substitutionMap.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      override fun substitutionMap(substitutionMap: List<Any>) {
        cdkBuilder.substitutionMap(substitutionMap.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param substitutionMap The map of substitution variable names to their values used in a
       * check expression.
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       */
      override fun substitutionMap(vararg substitutionMap: Any): Unit =
          substitutionMap(substitutionMap.toList())

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      override fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      override fun threshold(threshold: ThresholdProperty) {
        cdkBuilder.threshold(threshold.let(ThresholdProperty.Companion::unwrap))
      }

      /**
       * @param threshold The threshold used with a non-aggregate check expression.
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10f3ea622e386b6e5f6e793d4987d8ed5e432916db51f7cd69d3466eeb1ea208")
      override fun threshold(threshold: ThresholdProperty.Builder.() -> Unit): Unit =
          threshold(ThresholdProperty(threshold))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * The expression which includes column references, condition names followed by variable
       * references, possibly grouped and combined with other conditions.
       *
       * For example, `(:col1 starts_with :prefix1 or :col1 starts_with :prefix2) and (:col1
       * ends_with :suffix1 or :col1 ends_with :suffix2)` . Column and value references are
       * substitution variables that should start with the ':' symbol. Depending on the context,
       * substitution variables' values can be either an actual value or a column name. These values
       * are defined in the SubstitutionMap. If a CheckExpression starts with a column reference, then
       * ColumnSelectors in the rule should be null. If ColumnSelectors has been defined, then there
       * should be no columnn reference in the left side of a condition, for example, `is_between :val1
       * and :val2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-checkexpression)
       */
      override fun checkExpression(): String = unwrap(this).getCheckExpression()

      /**
       * List of column selectors.
       *
       * Selectors can be used to select columns using a name or regular expression from the
       * dataset. Rule will be applied to selected columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-columnselectors)
       */
      override fun columnSelectors(): Any? = unwrap(this).getColumnSelectors()

      /**
       * A value that specifies whether the rule is disabled.
       *
       * Once a rule is disabled, a profile job will not validate it during a job run. Default value
       * is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-disabled)
       */
      override fun disabled(): Any? = unwrap(this).getDisabled()

      /**
       * The name of the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The map of substitution variable names to their values used in a check expression.
       *
       * Variable names should start with a ':' (colon). Variable values can either be actual values
       * or column names. To differentiate between the two, column names should be enclosed in
       * backticks, for example, `":col1": "`Column A`".`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-substitutionmap)
       */
      override fun substitutionMap(): Any? = unwrap(this).getSubstitutionMap()

      /**
       * The threshold used with a non-aggregate check expression.
       *
       * Non-aggregate check expressions will be applied to each row in a specific column, and the
       * threshold will be used to determine whether the validation succeeds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html#cfn-databrew-ruleset-rule-threshold)
       */
      override fun threshold(): Any? = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnRuleset.RuleProperty
    }
  }

  /**
   * A key-value pair to associate an expression's substitution variable names with their values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * SubstitutionValueProperty substitutionValueProperty = SubstitutionValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html)
   */
  public interface SubstitutionValueProperty {
    /**
     * Value or column name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html#cfn-databrew-ruleset-substitutionvalue-value)
     */
    public fun `value`(): String

    /**
     * Variable name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html#cfn-databrew-ruleset-substitutionvalue-valuereference)
     */
    public fun valueReference(): String

    /**
     * A builder for [SubstitutionValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value Value or column name. 
       */
      public fun `value`(`value`: String)

      /**
       * @param valueReference Variable name. 
       */
      public fun valueReference(valueReference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty.builder()

      /**
       * @param value Value or column name. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param valueReference Variable name. 
       */
      override fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty,
    ) : CdkObject(cdkObject), SubstitutionValueProperty {
      /**
       * Value or column name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html#cfn-databrew-ruleset-substitutionvalue-value)
       */
      override fun `value`(): String = unwrap(this).getValue()

      /**
       * Variable name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html#cfn-databrew-ruleset-substitutionvalue-valuereference)
       */
      override fun valueReference(): String = unwrap(this).getValueReference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubstitutionValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty):
          SubstitutionValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubstitutionValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubstitutionValueProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.SubstitutionValueProperty
    }
  }

  /**
   * The threshold used with a non-aggregate check expression.
   *
   * The non-aggregate check expression will be applied to each row in a specific column. Then the
   * threshold will be used to determine whether the validation succeeds.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
   * .value(123)
   * // the properties below are optional
   * .type("type")
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html)
   */
  public interface ThresholdProperty {
    /**
     * The type of a threshold.
     *
     * Used for comparison of an actual count of rows that satisfy the rule to the threshold value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * Unit of threshold value.
     *
     * Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * The value of a threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [ThresholdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of a threshold.
       * Used for comparison of an actual count of rows that satisfy the rule to the threshold
       * value.
       */
      public fun type(type: String)

      /**
       * @param unit Unit of threshold value.
       * Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
       */
      public fun unit(unit: String)

      /**
       * @param value The value of a threshold. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.builder()

      /**
       * @param type The type of a threshold.
       * Used for comparison of an actual count of rows that satisfy the rule to the threshold
       * value.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param unit Unit of threshold value.
       * Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The value of a threshold. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty,
    ) : CdkObject(cdkObject), ThresholdProperty {
      /**
       * The type of a threshold.
       *
       * Used for comparison of an actual count of rows that satisfy the rule to the threshold
       * value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * Unit of threshold value.
       *
       * Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()

      /**
       * The value of a threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html#cfn-databrew-ruleset-threshold-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty):
          ThresholdProperty = CdkObjectWrappers.wrap(cdkObject) as? ThresholdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThresholdProperty):
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty
    }
  }
}
