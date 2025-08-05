@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CE::CostCategory` resource creates groupings of cost that you can use across products
 * in the Billing and Cost Management console, such as Cost Explorer and AWS Budgets.
 *
 * For more information, see [Managing Your Costs with Cost
 * Categories](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html)
 * in the *Billing and Cost Management User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ce.*;
 * CfnCostCategory cfnCostCategory = CfnCostCategory.Builder.create(this, "MyCfnCostCategory")
 * .name("name")
 * .rules("rules")
 * .ruleVersion("ruleVersion")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .splitChargeRules("splitChargeRules")
 * .tags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html)
 */
public open class CfnCostCategory(
  cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCostCategoryProps,
  ) :
      this(software.amazon.awscdk.services.ce.CfnCostCategory(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCostCategoryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCostCategoryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCostCategoryProps(props)
  )

  /**
   * The unique identifier for your Cost Category.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Cost Category's effective start date.
   */
  public open fun attrEffectiveStart(): String = unwrap(this).getAttrEffectiveStart()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The default value for the cost category.
   */
  public open fun defaultValue(): String? = unwrap(this).getDefaultValue()

  /**
   * The default value for the cost category.
   */
  public open fun defaultValue(`value`: String) {
    unwrap(this).setDefaultValue(`value`)
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
   * The unique name of the Cost Category.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name of the Cost Category.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The rule schema version in this particular Cost Category.
   */
  public open fun ruleVersion(): String = unwrap(this).getRuleVersion()

  /**
   * The rule schema version in this particular Cost Category.
   */
  public open fun ruleVersion(`value`: String) {
    unwrap(this).setRuleVersion(`value`)
  }

  /**
   * The array of CostCategoryRule in JSON array format.
   */
  public open fun rules(): String = unwrap(this).getRules()

  /**
   * The array of CostCategoryRule in JSON array format.
   */
  public open fun rules(`value`: String) {
    unwrap(this).setRules(`value`)
  }

  /**
   * The split charge rules that are used to allocate your charges between your Cost Category
   * values.
   */
  public open fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()

  /**
   * The split charge rules that are used to allocate your charges between your Cost Category
   * values.
   */
  public open fun splitChargeRules(`value`: String) {
    unwrap(this).setSplitChargeRules(`value`)
  }

  /**
   * Tags to assign to the cost category.
   */
  public open fun tags(): List<ResourceTagProperty> =
      unwrap(this).getTags()?.map(ResourceTagProperty::wrap) ?: emptyList()

  /**
   * Tags to assign to the cost category.
   */
  public open fun tags(`value`: List<ResourceTagProperty>) {
    unwrap(this).setTags(`value`.map(ResourceTagProperty.Companion::unwrap))
  }

  /**
   * Tags to assign to the cost category.
   */
  public open fun tags(vararg `value`: ResourceTagProperty): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ce.CfnCostCategory].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The default value for the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-defaultvalue)
     * @param defaultValue The default value for the cost category. 
     */
    public fun defaultValue(defaultValue: String)

    /**
     * The unique name of the Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-name)
     * @param name The unique name of the Cost Category. 
     */
    public fun name(name: String)

    /**
     * The rule schema version in this particular Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-ruleversion)
     * @param ruleVersion The rule schema version in this particular Cost Category. 
     */
    public fun ruleVersion(ruleVersion: String)

    /**
     * The array of CostCategoryRule in JSON array format.
     *
     *
     * Rules are processed in order. If there are multiple rules that match the line item, then the
     * first rule to match is used to determine that Cost Category value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-rules)
     * @param rules The array of CostCategoryRule in JSON array format. 
     */
    public fun rules(rules: String)

    /**
     * The split charge rules that are used to allocate your charges between your Cost Category
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-splitchargerules)
     * @param splitChargeRules The split charge rules that are used to allocate your charges between
     * your Cost Category values. 
     */
    public fun splitChargeRules(splitChargeRules: String)

    /**
     * Tags to assign to the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-tags)
     * @param tags Tags to assign to the cost category. 
     */
    public fun tags(tags: List<ResourceTagProperty>)

    /**
     * Tags to assign to the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-tags)
     * @param tags Tags to assign to the cost category. 
     */
    public fun tags(vararg tags: ResourceTagProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnCostCategory.Builder =
        software.amazon.awscdk.services.ce.CfnCostCategory.Builder.create(scope, id)

    /**
     * The default value for the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-defaultvalue)
     * @param defaultValue The default value for the cost category. 
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * The unique name of the Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-name)
     * @param name The unique name of the Cost Category. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The rule schema version in this particular Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-ruleversion)
     * @param ruleVersion The rule schema version in this particular Cost Category. 
     */
    override fun ruleVersion(ruleVersion: String) {
      cdkBuilder.ruleVersion(ruleVersion)
    }

    /**
     * The array of CostCategoryRule in JSON array format.
     *
     *
     * Rules are processed in order. If there are multiple rules that match the line item, then the
     * first rule to match is used to determine that Cost Category value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-rules)
     * @param rules The array of CostCategoryRule in JSON array format. 
     */
    override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    /**
     * The split charge rules that are used to allocate your charges between your Cost Category
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-splitchargerules)
     * @param splitChargeRules The split charge rules that are used to allocate your charges between
     * your Cost Category values. 
     */
    override fun splitChargeRules(splitChargeRules: String) {
      cdkBuilder.splitChargeRules(splitChargeRules)
    }

    /**
     * Tags to assign to the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-tags)
     * @param tags Tags to assign to the cost category. 
     */
    override fun tags(tags: List<ResourceTagProperty>) {
      cdkBuilder.tags(tags.map(ResourceTagProperty.Companion::unwrap))
    }

    /**
     * Tags to assign to the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-tags)
     * @param tags Tags to assign to the cost category. 
     */
    override fun tags(vararg tags: ResourceTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ce.CfnCostCategory = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ce.CfnCostCategory.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCostCategory {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCostCategory(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory):
        CfnCostCategory = CfnCostCategory(cdkObject)

    internal fun unwrap(wrapped: CfnCostCategory):
        software.amazon.awscdk.services.ce.CfnCostCategory = wrapped.cdkObject as
        software.amazon.awscdk.services.ce.CfnCostCategory
  }

  /**
   * The tag structure that contains a tag key and value.
   *
   *
   * Tagging is supported only for the following Cost Explorer resource types:
   * [`AnomalyMonitor`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalyMonitor.html)
   * ,
   * [`AnomalySubscription`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalySubscription.html)
   * ,
   * [`CostCategory`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategory.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ce.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-costcategory-resourcetag.html)
   */
  public interface ResourceTagProperty {
    /**
     * The key that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-costcategory-resourcetag.html#cfn-ce-costcategory-resourcetag-key)
     */
    public fun key(): String

    /**
     * The value that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-costcategory-resourcetag.html#cfn-ce-costcategory-resourcetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that's associated with the tag. 
       */
      public fun key(key: String)

      /**
       * @param value The value that's associated with the tag. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty.builder()

      /**
       * @param key The key that's associated with the tag. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value that's associated with the tag. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty,
    ) : CdkObject(cdkObject),
        ResourceTagProperty {
      /**
       * The key that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-costcategory-resourcetag.html#cfn-ce-costcategory-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-costcategory-resourcetag.html#cfn-ce-costcategory-resourcetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty):
          ResourceTagProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ce.CfnCostCategory.ResourceTagProperty
    }
  }
}
