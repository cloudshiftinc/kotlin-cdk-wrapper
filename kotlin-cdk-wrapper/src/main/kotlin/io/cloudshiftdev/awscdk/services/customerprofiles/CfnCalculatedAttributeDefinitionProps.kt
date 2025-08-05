@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCalculatedAttributeDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnCalculatedAttributeDefinitionProps cfnCalculatedAttributeDefinitionProps =
 * CfnCalculatedAttributeDefinitionProps.builder()
 * .attributeDetails(AttributeDetailsProperty.builder()
 * .attributes(List.of(AttributeItemProperty.builder()
 * .name("name")
 * .build()))
 * .expression("expression")
 * .build())
 * .calculatedAttributeName("calculatedAttributeName")
 * .domainName("domainName")
 * .statistic("statistic")
 * // the properties below are optional
 * .conditions(ConditionsProperty.builder()
 * .objectCount(123)
 * .range(RangeProperty.builder()
 * .unit("unit")
 * // the properties below are optional
 * .timestampFormat("timestampFormat")
 * .timestampSource("timestampSource")
 * .value(123)
 * .valueRange(ValueRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .build())
 * .threshold(ThresholdProperty.builder()
 * .operator("operator")
 * .value("value")
 * .build())
 * .build())
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useHistoricalData(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html)
 */
public interface CfnCalculatedAttributeDefinitionProps {
  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
   */
  public fun attributeDetails(): Any

  /**
   * The name of an attribute defined in a profile object type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-calculatedattributename)
   */
  public fun calculatedAttributeName(): String

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
   */
  public fun conditions(): Any? = unwrap(this).getConditions()

  /**
   * The description of the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-domainname)
   */
  public fun domainName(): String

  /**
   * The aggregation operation to perform for the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-statistic)
   */
  public fun statistic(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Whether historical data ingested before the Calculated Attribute was created should be included
   * in calculations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-usehistoricaldata)
   */
  public fun useHistoricalData(): Any? = unwrap(this).getUseHistoricalData()

  /**
   * A builder for [CfnCalculatedAttributeDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    public fun attributeDetails(attributeDetails: IResolvable)

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    public
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty)

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90cb636c208c8252fa2f54dab9f112639619a239f735a0e5ac6c44e4f048dede")
    public
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder.() -> Unit)

    /**
     * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
     */
    public fun calculatedAttributeName(calculatedAttributeName: String)

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    public fun conditions(conditions: IResolvable)

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty)

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77092e1f70c06621da546fe82fd4aa9ac153b69d95e7f95814cae16391490f7")
    public
        fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder.() -> Unit)

    /**
     * @param description The description of the calculated attribute.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the calculated attribute.
     */
    public fun displayName(displayName: String)

    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param statistic The aggregation operation to perform for the calculated attribute. 
     */
    public fun statistic(statistic: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param useHistoricalData Whether historical data ingested before the Calculated Attribute was
     * created should be included in calculations.
     */
    public fun useHistoricalData(useHistoricalData: Boolean)

    /**
     * @param useHistoricalData Whether historical data ingested before the Calculated Attribute was
     * created should be included in calculations.
     */
    public fun useHistoricalData(useHistoricalData: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps.Builder
        =
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps.builder()

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    override fun attributeDetails(attributeDetails: IResolvable) {
      cdkBuilder.attributeDetails(attributeDetails.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    override
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty) {
      cdkBuilder.attributeDetails(attributeDetails.let(CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Companion::unwrap))
    }

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     * that expression. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90cb636c208c8252fa2f54dab9f112639619a239f735a0e5ac6c44e4f048dede")
    override
        fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder.() -> Unit):
        Unit =
        attributeDetails(CfnCalculatedAttributeDefinition.AttributeDetailsProperty(attributeDetails))

    /**
     * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
     */
    override fun calculatedAttributeName(calculatedAttributeName: String) {
      cdkBuilder.calculatedAttributeName(calculatedAttributeName)
    }

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    override fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
      cdkBuilder.conditions(conditions.let(CfnCalculatedAttributeDefinition.ConditionsProperty.Companion::unwrap))
    }

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     * calculated attribute.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f77092e1f70c06621da546fe82fd4aa9ac153b69d95e7f95814cae16391490f7")
    override
        fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty.Builder.() -> Unit):
        Unit = conditions(CfnCalculatedAttributeDefinition.ConditionsProperty(conditions))

    /**
     * @param description The description of the calculated attribute.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the calculated attribute.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param statistic The aggregation operation to perform for the calculated attribute. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param useHistoricalData Whether historical data ingested before the Calculated Attribute was
     * created should be included in calculations.
     */
    override fun useHistoricalData(useHistoricalData: Boolean) {
      cdkBuilder.useHistoricalData(useHistoricalData)
    }

    /**
     * @param useHistoricalData Whether historical data ingested before the Calculated Attribute was
     * created should be included in calculations.
     */
    override fun useHistoricalData(useHistoricalData: IResolvable) {
      cdkBuilder.useHistoricalData(useHistoricalData.let(IResolvable.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnCalculatedAttributeDefinitionProps {
    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
     */
    override fun attributeDetails(): Any = unwrap(this).getAttributeDetails()

    /**
     * The name of an attribute defined in a profile object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-calculatedattributename)
     */
    override fun calculatedAttributeName(): String = unwrap(this).getCalculatedAttributeName()

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
     */
    override fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * The description of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The aggregation operation to perform for the calculated attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-statistic)
     */
    override fun statistic(): String = unwrap(this).getStatistic()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Whether historical data ingested before the Calculated Attribute was created should be
     * included in calculations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-usehistoricaldata)
     */
    override fun useHistoricalData(): Any? = unwrap(this).getUseHistoricalData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCalculatedAttributeDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps):
        CfnCalculatedAttributeDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCalculatedAttributeDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCalculatedAttributeDefinitionProps):
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps
  }
}
