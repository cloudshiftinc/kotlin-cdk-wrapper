@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnCostCategory`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ce.*;
 * CfnCostCategoryProps cfnCostCategoryProps = CfnCostCategoryProps.builder()
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
public interface CfnCostCategoryProps {
  /**
   * The default value for the cost category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-defaultvalue)
   */
  public fun defaultValue(): String? = unwrap(this).getDefaultValue()

  /**
   * The unique name of the Cost Category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-name)
   */
  public fun name(): String

  /**
   * The rule schema version in this particular Cost Category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-ruleversion)
   */
  public fun ruleVersion(): String

  /**
   * The array of CostCategoryRule in JSON array format.
   *
   *
   * Rules are processed in order. If there are multiple rules that match the line item, then the
   * first rule to match is used to determine that Cost Category value.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-rules)
   */
  public fun rules(): String

  /**
   * The split charge rules that are used to allocate your charges between your Cost Category
   * values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-splitchargerules)
   */
  public fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()

  /**
   * A builder for [CfnCostCategoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultValue The default value for the cost category.
     */
    public fun defaultValue(defaultValue: String)

    /**
     * @param name The unique name of the Cost Category. 
     */
    public fun name(name: String)

    /**
     * @param ruleVersion The rule schema version in this particular Cost Category. 
     */
    public fun ruleVersion(ruleVersion: String)

    /**
     * @param rules The array of CostCategoryRule in JSON array format. 
     *
     * Rules are processed in order. If there are multiple rules that match the line item, then the
     * first rule to match is used to determine that Cost Category value.
     */
    public fun rules(rules: String)

    /**
     * @param splitChargeRules The split charge rules that are used to allocate your charges between
     * your Cost Category values.
     */
    public fun splitChargeRules(splitChargeRules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnCostCategoryProps.Builder =
        software.amazon.awscdk.services.ce.CfnCostCategoryProps.builder()

    /**
     * @param defaultValue The default value for the cost category.
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param name The unique name of the Cost Category. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ruleVersion The rule schema version in this particular Cost Category. 
     */
    override fun ruleVersion(ruleVersion: String) {
      cdkBuilder.ruleVersion(ruleVersion)
    }

    /**
     * @param rules The array of CostCategoryRule in JSON array format. 
     *
     * Rules are processed in order. If there are multiple rules that match the line item, then the
     * first rule to match is used to determine that Cost Category value.
     */
    override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    /**
     * @param splitChargeRules The split charge rules that are used to allocate your charges between
     * your Cost Category values.
     */
    override fun splitChargeRules(splitChargeRules: String) {
      cdkBuilder.splitChargeRules(splitChargeRules)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnCostCategoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ce.CfnCostCategoryProps,
  ) : CdkObject(cdkObject), CfnCostCategoryProps {
    /**
     * The default value for the cost category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-defaultvalue)
     */
    override fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The unique name of the Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The rule schema version in this particular Cost Category.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-ruleversion)
     */
    override fun ruleVersion(): String = unwrap(this).getRuleVersion()

    /**
     * The array of CostCategoryRule in JSON array format.
     *
     *
     * Rules are processed in order. If there are multiple rules that match the line item, then the
     * first rule to match is used to determine that Cost Category value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-rules)
     */
    override fun rules(): String = unwrap(this).getRules()

    /**
     * The split charge rules that are used to allocate your charges between your Cost Category
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-splitchargerules)
     */
    override fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCostCategoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnCostCategoryProps):
        CfnCostCategoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCostCategoryProps):
        software.amazon.awscdk.services.ce.CfnCostCategoryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ce.CfnCostCategoryProps
  }
}
