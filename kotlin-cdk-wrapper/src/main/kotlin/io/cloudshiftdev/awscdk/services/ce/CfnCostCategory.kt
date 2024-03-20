@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CE::CostCategory` resource creates groupings of cost that you can use across products
 * in the AWS Billing and Cost Management console, such as Cost Explorer and AWS Budgets.
 *
 * For more information, see [Managing Your Costs with Cost
 * Categories](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html)
 * in the *AWS Billing and Cost Management User Guide* .
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html)
 */
public open class CfnCostCategory internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ce.CfnCostCategory,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCostCategoryProps,
  ) :
      this(software.amazon.awscdk.services.ce.CfnCostCategory(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCostCategoryProps::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
        software.amazon.awscdk.services.ce.CfnCostCategory = wrapped.cdkObject
  }
}
