@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * Object criterion;
 * CfnFilterProps cfnFilterProps = CfnFilterProps.builder()
 * .findingCriteria(FindingCriteriaProperty.builder()
 * .criterion(criterion)
 * .itemType(ConditionProperty.builder()
 * .eq(List.of("eq"))
 * .equalTo(List.of("equalTo"))
 * .greaterThan(123)
 * .greaterThanOrEqual(123)
 * .gt(123)
 * .gte(123)
 * .lessThan(123)
 * .lessThanOrEqual(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .notEquals(List.of("notEquals"))
 * .build())
 * .build())
 * // the properties below are optional
 * .action("action")
 * .description("description")
 * .detectorId("detectorId")
 * .name("name")
 * .rank(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
 */
public interface CfnFilterProps {
  /**
   * Specifies the action that is to be applied to the findings that match the filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
   */
  public fun action(): String? = unwrap(this).getAction()

  /**
   * The description of the filter.
   *
   * Valid characters include alphanumeric characters, and special characters such as hyphen,
   * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
   * tab, vertical tab, newline, form feed, return, and whitespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
   */
  public fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * Represents the criteria to be used in the filter for querying findings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
   */
  public fun findingCriteria(): Any

  /**
   * The name of the filter.
   *
   * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
   * whitespace is considered to be an invalid character.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies the position of the filter in the list of current filters.
   *
   * Also specifies the order in which this filter is applied to the findings. The minimum value for
   * this property is 1 and the maximum is 100.
   *
   * By default, filters may not be created in the same order as they are ranked. To ensure that the
   * filters are created in the expected order, you can use an optional attribute,
   * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * , with the following syntax: `"DependsOn":[ "ObjectName" ]` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank)
   */
  public fun rank(): Number? = unwrap(this).getRank()

  /**
   * The tags to be added to a new filter resource.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Specifies the action that is to be applied to the findings that match the
     * filter.
     */
    public fun action(action: String)

    /**
     * @param description The description of the filter.
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
     * tab, vertical tab, newline, form feed, return, and whitespace.
     */
    public fun description(description: String)

    /**
     * @param detectorId The ID of the detector belonging to the GuardDuty account that you want to
     * create a filter for.
     */
    public fun detectorId(detectorId: String)

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    public fun findingCriteria(findingCriteria: IResolvable)

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    public fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty)

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62b0234b603fd40e27555a85ab249fe4a9281b32d74f52ce2d1a858d42676099")
    public
        fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit)

    /**
     * @param name The name of the filter.
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     */
    public fun name(name: String)

    /**
     * @param rank Specifies the position of the filter in the list of current filters.
     * Also specifies the order in which this filter is applied to the findings. The minimum value
     * for this property is 1 and the maximum is 100.
     *
     * By default, filters may not be created in the same order as they are ranked. To ensure that
     * the filters are created in the expected order, you can use an optional attribute,
     * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * , with the following syntax: `"DependsOn":[ "ObjectName" ]` .
     */
    public fun rank(rank: Number)

    /**
     * @param tags The tags to be added to a new filter resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be added to a new filter resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnFilterProps.builder()

    /**
     * @param action Specifies the action that is to be applied to the findings that match the
     * filter.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param description The description of the filter.
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
     * tab, vertical tab, newline, form feed, return, and whitespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param detectorId The ID of the detector belonging to the GuardDuty account that you want to
     * create a filter for.
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    override fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(CfnFilter.FindingCriteriaProperty::unwrap))
    }

    /**
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62b0234b603fd40e27555a85ab249fe4a9281b32d74f52ce2d1a858d42676099")
    override
        fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit):
        Unit = findingCriteria(CfnFilter.FindingCriteriaProperty(findingCriteria))

    /**
     * @param name The name of the filter.
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rank Specifies the position of the filter in the list of current filters.
     * Also specifies the order in which this filter is applied to the findings. The minimum value
     * for this property is 1 and the maximum is 100.
     *
     * By default, filters may not be created in the same order as they are ranked. To ensure that
     * the filters are created in the expected order, you can use an optional attribute,
     * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * , with the following syntax: `"DependsOn":[ "ObjectName" ]` .
     */
    override fun rank(rank: Number) {
      cdkBuilder.rank(rank)
    }

    /**
     * @param tags The tags to be added to a new filter resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to be added to a new filter resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilterProps,
  ) : CdkObject(cdkObject), CfnFilterProps {
    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
     */
    override fun action(): String? = unwrap(this).getAction()

    /**
     * The description of the filter.
     *
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
     * tab, vertical tab, newline, form feed, return, and whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter
     * for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
     */
    override fun detectorId(): String? = unwrap(this).getDetectorId()

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     */
    override fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

    /**
     * The name of the filter.
     *
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies the position of the filter in the list of current filters.
     *
     * Also specifies the order in which this filter is applied to the findings. The minimum value
     * for this property is 1 and the maximum is 100.
     *
     * By default, filters may not be created in the same order as they are ranked. To ensure that
     * the filters are created in the expected order, you can use an optional attribute,
     * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * , with the following syntax: `"DependsOn":[ "ObjectName" ]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank)
     */
    override fun rank(): Number? = unwrap(this).getRank()

    /**
     * The tags to be added to a new filter resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilterProps):
        CfnFilterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFilterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFilterProps):
        software.amazon.awscdk.services.guardduty.CfnFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnFilterProps
  }
}
