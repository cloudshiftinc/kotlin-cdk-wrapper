@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GuardDuty::Filter` resource specifies a new filter defined by the provided
 * `findingCriteria` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * Object criterion;
 * CfnFilter cfnFilter = CfnFilter.Builder.create(this, "MyCfnFilter")
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
public open class CfnFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies the action that is to be applied to the findings that match the filter.
   */
  public open fun action(): String? = unwrap(this).getAction()

  /**
   * Specifies the action that is to be applied to the findings that match the filter.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   * The description of the filter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the filter.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
   */
  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * The ID of the detector belonging to the GuardDuty account that you want to create a filter for.
   */
  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  /**
   * Represents the criteria to be used in the filter for querying findings.
   */
  public open fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

  /**
   * Represents the criteria to be used in the filter for querying findings.
   */
  public open fun findingCriteria(`value`: IResolvable) {
    unwrap(this).setFindingCriteria(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents the criteria to be used in the filter for querying findings.
   */
  public open fun findingCriteria(`value`: FindingCriteriaProperty) {
    unwrap(this).setFindingCriteria(`value`.let(FindingCriteriaProperty::unwrap))
  }

  /**
   * Represents the criteria to be used in the filter for querying findings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("982bc10b504450b13bb6cf50a6b7527c70a0e43fb18969a87a89bfabe1e69df6")
  public open fun findingCriteria(`value`: FindingCriteriaProperty.Builder.() -> Unit): Unit =
      findingCriteria(FindingCriteriaProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the filter.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the filter.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the position of the filter in the list of current filters.
   */
  public open fun rank(): Number? = unwrap(this).getRank()

  /**
   * Specifies the position of the filter in the list of current filters.
   */
  public open fun rank(`value`: Number) {
    unwrap(this).setRank(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be added to a new filter resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be added to a new filter resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to be added to a new filter resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
     * @param action Specifies the action that is to be applied to the findings that match the
     * filter. 
     */
    public fun action(action: String)

    /**
     * The description of the filter.
     *
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
     * tab, vertical tab, newline, form feed, return, and whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
     * @param description The description of the filter. 
     */
    public fun description(description: String)

    /**
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter
     * for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
     * @param detectorId The ID of the detector belonging to the GuardDuty account that you want to
     * create a filter for. 
     */
    public fun detectorId(detectorId: String)

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    public fun findingCriteria(findingCriteria: IResolvable)

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty)

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("931a05aefa29d36a8fd2cb68df3a2abeaf89aabac29d1179200ca079a5c9fc6f")
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit)

    /**
     * The name of the filter.
     *
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
     * @param name The name of the filter. 
     */
    public fun name(name: String)

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
     * @param rank Specifies the position of the filter in the list of current filters. 
     */
    public fun rank(rank: Number)

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
     * @param tags The tags to be added to a new filter resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags The tags to be added to a new filter resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnFilter.Builder =
        software.amazon.awscdk.services.guardduty.CfnFilter.Builder.create(scope, id)

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
     * @param action Specifies the action that is to be applied to the findings that match the
     * filter. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * The description of the filter.
     *
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash, horizontal
     * tab, vertical tab, newline, form feed, return, and whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
     * @param description The description of the filter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter
     * for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
     * @param detectorId The ID of the detector belonging to the GuardDuty account that you want to
     * create a filter for. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(FindingCriteriaProperty::unwrap))
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("931a05aefa29d36a8fd2cb68df3a2abeaf89aabac29d1179200ca079a5c9fc6f")
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit): Unit
        = findingCriteria(FindingCriteriaProperty(findingCriteria))

    /**
     * The name of the filter.
     *
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
     * @param name The name of the filter. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param rank Specifies the position of the filter in the list of current filters. 
     */
    override fun rank(rank: Number) {
      cdkBuilder.rank(rank)
    }

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
     * @param tags The tags to be added to a new filter resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags The tags to be added to a new filter resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnFilter = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter): CfnFilter =
        CfnFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFilter): software.amazon.awscdk.services.guardduty.CfnFilter =
        wrapped.cdkObject
  }

  /**
   * Specifies the condition to apply to a single field when filtering through GuardDuty findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html)
   */
  public interface ConditionProperty {
    /**
     * Represents the equal condition to apply to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
     */
    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    /**
     * Represents an *equal* ** condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-equals)
     */
    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    /**
     * Represents a *greater than* condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-greaterthan)
     */
    public fun greaterThan(): Number? = unwrap(this).getGreaterThan()

    /**
     * Represents a *greater than or equal* condition to be applied to a single field when querying
     * for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-greaterthanorequal)
     */
    public fun greaterThanOrEqual(): Number? = unwrap(this).getGreaterThanOrEqual()

    /**
     * Represents a *greater than* condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gt)
     */
    public fun gt(): Number? = unwrap(this).getGt()

    /**
     * Represents the greater than or equal condition to apply to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
     */
    public fun gte(): Number? = unwrap(this).getGte()

    /**
     * Represents a *less than* condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lessthan)
     */
    public fun lessThan(): Number? = unwrap(this).getLessThan()

    /**
     * Represents a *less than or equal* condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lessthanorequal)
     */
    public fun lessThanOrEqual(): Number? = unwrap(this).getLessThanOrEqual()

    /**
     * Represents the less than condition to apply to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
     */
    public fun lt(): Number? = unwrap(this).getLt()

    /**
     * Represents the less than or equal condition to apply to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
     */
    public fun lte(): Number? = unwrap(this).getLte()

    /**
     * Represents the not equal condition to apply to a single field when querying for findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
     */
    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    /**
     * Represents a *not equal* ** condition to be applied to a single field when querying for
     * findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-notequals)
     */
    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eq Represents the equal condition to apply to a single field when querying for
       * findings.
       */
      public fun eq(eq: List<String>)

      /**
       * @param eq Represents the equal condition to apply to a single field when querying for
       * findings.
       */
      public fun eq(vararg eq: String)

      /**
       * @param equalTo Represents an *equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      public fun equalTo(equalTo: List<String>)

      /**
       * @param equalTo Represents an *equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      public fun equalTo(vararg equalTo: String)

      /**
       * @param greaterThan Represents a *greater than* condition to be applied to a single field
       * when querying for findings.
       */
      public fun greaterThan(greaterThan: Number)

      /**
       * @param greaterThanOrEqual Represents a *greater than or equal* condition to be applied to a
       * single field when querying for findings.
       */
      public fun greaterThanOrEqual(greaterThanOrEqual: Number)

      /**
       * @param gt Represents a *greater than* condition to be applied to a single field when
       * querying for findings.
       */
      public fun gt(gt: Number)

      /**
       * @param gte Represents the greater than or equal condition to apply to a single field when
       * querying for findings.
       */
      public fun gte(gte: Number)

      /**
       * @param lessThan Represents a *less than* condition to be applied to a single field when
       * querying for findings.
       */
      public fun lessThan(lessThan: Number)

      /**
       * @param lessThanOrEqual Represents a *less than or equal* condition to be applied to a
       * single field when querying for findings.
       */
      public fun lessThanOrEqual(lessThanOrEqual: Number)

      /**
       * @param lt Represents the less than condition to apply to a single field when querying for
       * findings.
       */
      public fun lt(lt: Number)

      /**
       * @param lte Represents the less than or equal condition to apply to a single field when
       * querying for findings.
       */
      public fun lte(lte: Number)

      /**
       * @param neq Represents the not equal condition to apply to a single field when querying for
       * findings.
       */
      public fun neq(neq: List<String>)

      /**
       * @param neq Represents the not equal condition to apply to a single field when querying for
       * findings.
       */
      public fun neq(vararg neq: String)

      /**
       * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      public fun notEquals(notEquals: List<String>)

      /**
       * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      public fun notEquals(vararg notEquals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.builder()

      /**
       * @param eq Represents the equal condition to apply to a single field when querying for
       * findings.
       */
      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param eq Represents the equal condition to apply to a single field when querying for
       * findings.
       */
      override fun eq(vararg eq: String): Unit = eq(eq.toList())

      /**
       * @param equalTo Represents an *equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      /**
       * @param equalTo Represents an *equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      /**
       * @param greaterThan Represents a *greater than* condition to be applied to a single field
       * when querying for findings.
       */
      override fun greaterThan(greaterThan: Number) {
        cdkBuilder.greaterThan(greaterThan)
      }

      /**
       * @param greaterThanOrEqual Represents a *greater than or equal* condition to be applied to a
       * single field when querying for findings.
       */
      override fun greaterThanOrEqual(greaterThanOrEqual: Number) {
        cdkBuilder.greaterThanOrEqual(greaterThanOrEqual)
      }

      /**
       * @param gt Represents a *greater than* condition to be applied to a single field when
       * querying for findings.
       */
      override fun gt(gt: Number) {
        cdkBuilder.gt(gt)
      }

      /**
       * @param gte Represents the greater than or equal condition to apply to a single field when
       * querying for findings.
       */
      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      /**
       * @param lessThan Represents a *less than* condition to be applied to a single field when
       * querying for findings.
       */
      override fun lessThan(lessThan: Number) {
        cdkBuilder.lessThan(lessThan)
      }

      /**
       * @param lessThanOrEqual Represents a *less than or equal* condition to be applied to a
       * single field when querying for findings.
       */
      override fun lessThanOrEqual(lessThanOrEqual: Number) {
        cdkBuilder.lessThanOrEqual(lessThanOrEqual)
      }

      /**
       * @param lt Represents the less than condition to apply to a single field when querying for
       * findings.
       */
      override fun lt(lt: Number) {
        cdkBuilder.lt(lt)
      }

      /**
       * @param lte Represents the less than or equal condition to apply to a single field when
       * querying for findings.
       */
      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      /**
       * @param neq Represents the not equal condition to apply to a single field when querying for
       * findings.
       */
      override fun neq(neq: List<String>) {
        cdkBuilder.neq(neq)
      }

      /**
       * @param neq Represents the not equal condition to apply to a single field when querying for
       * findings.
       */
      override fun neq(vararg neq: String): Unit = neq(neq.toList())

      /**
       * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      /**
       * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
       * querying for findings.
       */
      override fun notEquals(vararg notEquals: String): Unit = notEquals(notEquals.toList())

      public fun build(): software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty,
    ) : CdkObject(cdkObject), ConditionProperty {
      /**
       * Represents the equal condition to apply to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
       */
      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      /**
       * Represents an *equal* ** condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-equals)
       */
      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      /**
       * Represents a *greater than* condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-greaterthan)
       */
      override fun greaterThan(): Number? = unwrap(this).getGreaterThan()

      /**
       * Represents a *greater than or equal* condition to be applied to a single field when
       * querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-greaterthanorequal)
       */
      override fun greaterThanOrEqual(): Number? = unwrap(this).getGreaterThanOrEqual()

      /**
       * Represents a *greater than* condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gt)
       */
      override fun gt(): Number? = unwrap(this).getGt()

      /**
       * Represents the greater than or equal condition to apply to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
       */
      override fun gte(): Number? = unwrap(this).getGte()

      /**
       * Represents a *less than* condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lessthan)
       */
      override fun lessThan(): Number? = unwrap(this).getLessThan()

      /**
       * Represents a *less than or equal* condition to be applied to a single field when querying
       * for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lessthanorequal)
       */
      override fun lessThanOrEqual(): Number? = unwrap(this).getLessThanOrEqual()

      /**
       * Represents the less than condition to apply to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
       */
      override fun lt(): Number? = unwrap(this).getLt()

      /**
       * Represents the less than or equal condition to apply to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
       */
      override fun lte(): Number? = unwrap(this).getLte()

      /**
       * Represents the not equal condition to apply to a single field when querying for findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
       */
      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

      /**
       * Represents a *not equal* ** condition to be applied to a single field when querying for
       * findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-notequals)
       */
      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as ConditionProperty

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty
    }
  }

  /**
   * Represents a map of finding properties that match specified conditions and values when querying
   * findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * Object criterion;
   * FindingCriteriaProperty findingCriteriaProperty = FindingCriteriaProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html)
   */
  public interface FindingCriteriaProperty {
    /**
     * Represents a map of finding properties that match specified conditions and values when
     * querying findings.
     *
     * For information about JSON criterion mapping to their console equivalent, see [Finding
     * criteria](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria)
     * . The following are the available criterion:
     *
     * * accountId
     * * id
     * * region
     * * severity
     *
     * To filter on the basis of severity, API and CFN use the following input list for the
     * condition:
     *
     * * *Low* : `["1", "2", "3"]`
     * * *Medium* : `["4", "5", "6"]`
     * * *High* : `["7", "8", "9"]`
     *
     * For more information, see [Severity levels for GuardDuty
     * findings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings.html#guardduty_findings-severity)
     * .
     *
     * * type
     * * updatedAt
     *
     * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on
     * whether the value contains milliseconds.
     *
     * * resource.accessKeyDetails.accessKeyId
     * * resource.accessKeyDetails.principalId
     * * resource.accessKeyDetails.userName
     * * resource.accessKeyDetails.userType
     * * resource.instanceDetails.iamInstanceProfile.id
     * * resource.instanceDetails.imageId
     * * resource.instanceDetails.instanceId
     * * resource.instanceDetails.tags.key
     * * resource.instanceDetails.tags.value
     * * resource.instanceDetails.networkInterfaces.ipv6Addresses
     * * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
     * * resource.instanceDetails.networkInterfaces.publicDnsName
     * * resource.instanceDetails.networkInterfaces.publicIp
     * * resource.instanceDetails.networkInterfaces.securityGroups.groupId
     * * resource.instanceDetails.networkInterfaces.securityGroups.groupName
     * * resource.instanceDetails.networkInterfaces.subnetId
     * * resource.instanceDetails.networkInterfaces.vpcId
     * * resource.instanceDetails.outpostArn
     * * resource.resourceType
     * * resource.s3BucketDetails.publicAccess.effectivePermissions
     * * resource.s3BucketDetails.name
     * * resource.s3BucketDetails.tags.key
     * * resource.s3BucketDetails.tags.value
     * * resource.s3BucketDetails.type
     * * service.action.actionType
     * * service.action.awsApiCallAction.api
     * * service.action.awsApiCallAction.callerType
     * * service.action.awsApiCallAction.errorCode
     * * service.action.awsApiCallAction.remoteIpDetails.city.cityName
     * * service.action.awsApiCallAction.remoteIpDetails.country.countryName
     * * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
     * * service.action.awsApiCallAction.remoteIpDetails.organization.asn
     * * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
     * * service.action.awsApiCallAction.serviceName
     * * service.action.dnsRequestAction.domain
     * * service.action.networkConnectionAction.blocked
     * * service.action.networkConnectionAction.connectionDirection
     * * service.action.networkConnectionAction.localPortDetails.port
     * * service.action.networkConnectionAction.protocol
     * * service.action.networkConnectionAction.remoteIpDetails.city.cityName
     * * service.action.networkConnectionAction.remoteIpDetails.country.countryName
     * * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
     * * service.action.networkConnectionAction.remoteIpDetails.organization.asn
     * * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
     * * service.action.networkConnectionAction.remotePortDetails.port
     * * service.action.awsApiCallAction.remoteAccountDetails.affiliated
     * * service.action.kubernetesApiCallAction.remoteIpDetails.ipAddressV4
     * * service.action.kubernetesApiCallAction.requestUri
     * * service.action.networkConnectionAction.localIpDetails.ipAddressV4
     * * service.action.networkConnectionAction.protocol
     * * service.action.awsApiCallAction.serviceName
     * * service.action.awsApiCallAction.remoteAccountDetails.accountId
     * * service.additionalInfo.threatListName
     * * service.resourceRole
     * * resource.eksClusterDetails.name
     * * resource.kubernetesDetails.kubernetesWorkloadDetails.name
     * * resource.kubernetesDetails.kubernetesWorkloadDetails.namespace
     * * resource.kubernetesDetails.kubernetesUserDetails.username
     * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.image
     * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.imagePrefix
     * * service.ebsVolumeScanDetails.scanId
     * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.name
     * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.severity
     * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.filePaths.hash
     * * resource.ecsClusterDetails.name
     * * resource.ecsClusterDetails.taskDetails.containers.image
     * * resource.ecsClusterDetails.taskDetails.definitionArn
     * * resource.containerDetails.image
     * * resource.rdsDbInstanceDetails.dbInstanceIdentifier
     * * resource.rdsDbInstanceDetails.dbClusterIdentifier
     * * resource.rdsDbInstanceDetails.engine
     * * resource.rdsDbUserDetails.user
     * * resource.rdsDbInstanceDetails.tags.key
     * * resource.rdsDbInstanceDetails.tags.value
     * * service.runtimeDetails.process.executableSha256
     * * service.runtimeDetails.process.name
     * * service.runtimeDetails.process.name
     * * resource.lambdaDetails.functionName
     * * resource.lambdaDetails.functionArn
     * * resource.lambdaDetails.tags.key
     * * resource.lambdaDetails.tags.value
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
     */
    public fun criterion(): Any? = unwrap(this).getCriterion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
     */
    public fun itemType(): Any? = unwrap(this).getItemType()

    /**
     * A builder for [FindingCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criterion Represents a map of finding properties that match specified conditions and
       * values when querying findings.
       * For information about JSON criterion mapping to their console equivalent, see [Finding
       * criteria](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria)
       * . The following are the available criterion:
       *
       * * accountId
       * * id
       * * region
       * * severity
       *
       * To filter on the basis of severity, API and CFN use the following input list for the
       * condition:
       *
       * * *Low* : `["1", "2", "3"]`
       * * *Medium* : `["4", "5", "6"]`
       * * *High* : `["7", "8", "9"]`
       *
       * For more information, see [Severity levels for GuardDuty
       * findings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings.html#guardduty_findings-severity)
       * .
       *
       * * type
       * * updatedAt
       *
       * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on
       * whether the value contains milliseconds.
       *
       * * resource.accessKeyDetails.accessKeyId
       * * resource.accessKeyDetails.principalId
       * * resource.accessKeyDetails.userName
       * * resource.accessKeyDetails.userType
       * * resource.instanceDetails.iamInstanceProfile.id
       * * resource.instanceDetails.imageId
       * * resource.instanceDetails.instanceId
       * * resource.instanceDetails.tags.key
       * * resource.instanceDetails.tags.value
       * * resource.instanceDetails.networkInterfaces.ipv6Addresses
       * * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
       * * resource.instanceDetails.networkInterfaces.publicDnsName
       * * resource.instanceDetails.networkInterfaces.publicIp
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupId
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupName
       * * resource.instanceDetails.networkInterfaces.subnetId
       * * resource.instanceDetails.networkInterfaces.vpcId
       * * resource.instanceDetails.outpostArn
       * * resource.resourceType
       * * resource.s3BucketDetails.publicAccess.effectivePermissions
       * * resource.s3BucketDetails.name
       * * resource.s3BucketDetails.tags.key
       * * resource.s3BucketDetails.tags.value
       * * resource.s3BucketDetails.type
       * * service.action.actionType
       * * service.action.awsApiCallAction.api
       * * service.action.awsApiCallAction.callerType
       * * service.action.awsApiCallAction.errorCode
       * * service.action.awsApiCallAction.remoteIpDetails.city.cityName
       * * service.action.awsApiCallAction.remoteIpDetails.country.countryName
       * * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asn
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
       * * service.action.awsApiCallAction.serviceName
       * * service.action.dnsRequestAction.domain
       * * service.action.networkConnectionAction.blocked
       * * service.action.networkConnectionAction.connectionDirection
       * * service.action.networkConnectionAction.localPortDetails.port
       * * service.action.networkConnectionAction.protocol
       * * service.action.networkConnectionAction.remoteIpDetails.city.cityName
       * * service.action.networkConnectionAction.remoteIpDetails.country.countryName
       * * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asn
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
       * * service.action.networkConnectionAction.remotePortDetails.port
       * * service.action.awsApiCallAction.remoteAccountDetails.affiliated
       * * service.action.kubernetesApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.kubernetesApiCallAction.requestUri
       * * service.action.networkConnectionAction.localIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.protocol
       * * service.action.awsApiCallAction.serviceName
       * * service.action.awsApiCallAction.remoteAccountDetails.accountId
       * * service.additionalInfo.threatListName
       * * service.resourceRole
       * * resource.eksClusterDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.namespace
       * * resource.kubernetesDetails.kubernetesUserDetails.username
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.image
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.imagePrefix
       * * service.ebsVolumeScanDetails.scanId
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.name
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.severity
       * *
       * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.filePaths.hash
       * * resource.ecsClusterDetails.name
       * * resource.ecsClusterDetails.taskDetails.containers.image
       * * resource.ecsClusterDetails.taskDetails.definitionArn
       * * resource.containerDetails.image
       * * resource.rdsDbInstanceDetails.dbInstanceIdentifier
       * * resource.rdsDbInstanceDetails.dbClusterIdentifier
       * * resource.rdsDbInstanceDetails.engine
       * * resource.rdsDbUserDetails.user
       * * resource.rdsDbInstanceDetails.tags.key
       * * resource.rdsDbInstanceDetails.tags.value
       * * service.runtimeDetails.process.executableSha256
       * * service.runtimeDetails.process.name
       * * service.runtimeDetails.process.name
       * * resource.lambdaDetails.functionName
       * * resource.lambdaDetails.functionArn
       * * resource.lambdaDetails.tags.key
       * * resource.lambdaDetails.tags.value
       */
      public fun criterion(criterion: Any)

      /**
       * @param itemType the value to be set.
       */
      public fun itemType(itemType: IResolvable)

      /**
       * @param itemType the value to be set.
       */
      public fun itemType(itemType: ConditionProperty)

      /**
       * @param itemType the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("897a74b3e78942542e7d1b032849a233ae4e0ba8dddd14fdf896c74ee82093a8")
      public fun itemType(itemType: ConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.builder()

      /**
       * @param criterion Represents a map of finding properties that match specified conditions and
       * values when querying findings.
       * For information about JSON criterion mapping to their console equivalent, see [Finding
       * criteria](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria)
       * . The following are the available criterion:
       *
       * * accountId
       * * id
       * * region
       * * severity
       *
       * To filter on the basis of severity, API and CFN use the following input list for the
       * condition:
       *
       * * *Low* : `["1", "2", "3"]`
       * * *Medium* : `["4", "5", "6"]`
       * * *High* : `["7", "8", "9"]`
       *
       * For more information, see [Severity levels for GuardDuty
       * findings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings.html#guardduty_findings-severity)
       * .
       *
       * * type
       * * updatedAt
       *
       * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on
       * whether the value contains milliseconds.
       *
       * * resource.accessKeyDetails.accessKeyId
       * * resource.accessKeyDetails.principalId
       * * resource.accessKeyDetails.userName
       * * resource.accessKeyDetails.userType
       * * resource.instanceDetails.iamInstanceProfile.id
       * * resource.instanceDetails.imageId
       * * resource.instanceDetails.instanceId
       * * resource.instanceDetails.tags.key
       * * resource.instanceDetails.tags.value
       * * resource.instanceDetails.networkInterfaces.ipv6Addresses
       * * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
       * * resource.instanceDetails.networkInterfaces.publicDnsName
       * * resource.instanceDetails.networkInterfaces.publicIp
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupId
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupName
       * * resource.instanceDetails.networkInterfaces.subnetId
       * * resource.instanceDetails.networkInterfaces.vpcId
       * * resource.instanceDetails.outpostArn
       * * resource.resourceType
       * * resource.s3BucketDetails.publicAccess.effectivePermissions
       * * resource.s3BucketDetails.name
       * * resource.s3BucketDetails.tags.key
       * * resource.s3BucketDetails.tags.value
       * * resource.s3BucketDetails.type
       * * service.action.actionType
       * * service.action.awsApiCallAction.api
       * * service.action.awsApiCallAction.callerType
       * * service.action.awsApiCallAction.errorCode
       * * service.action.awsApiCallAction.remoteIpDetails.city.cityName
       * * service.action.awsApiCallAction.remoteIpDetails.country.countryName
       * * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asn
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
       * * service.action.awsApiCallAction.serviceName
       * * service.action.dnsRequestAction.domain
       * * service.action.networkConnectionAction.blocked
       * * service.action.networkConnectionAction.connectionDirection
       * * service.action.networkConnectionAction.localPortDetails.port
       * * service.action.networkConnectionAction.protocol
       * * service.action.networkConnectionAction.remoteIpDetails.city.cityName
       * * service.action.networkConnectionAction.remoteIpDetails.country.countryName
       * * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asn
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
       * * service.action.networkConnectionAction.remotePortDetails.port
       * * service.action.awsApiCallAction.remoteAccountDetails.affiliated
       * * service.action.kubernetesApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.kubernetesApiCallAction.requestUri
       * * service.action.networkConnectionAction.localIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.protocol
       * * service.action.awsApiCallAction.serviceName
       * * service.action.awsApiCallAction.remoteAccountDetails.accountId
       * * service.additionalInfo.threatListName
       * * service.resourceRole
       * * resource.eksClusterDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.namespace
       * * resource.kubernetesDetails.kubernetesUserDetails.username
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.image
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.imagePrefix
       * * service.ebsVolumeScanDetails.scanId
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.name
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.severity
       * *
       * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.filePaths.hash
       * * resource.ecsClusterDetails.name
       * * resource.ecsClusterDetails.taskDetails.containers.image
       * * resource.ecsClusterDetails.taskDetails.definitionArn
       * * resource.containerDetails.image
       * * resource.rdsDbInstanceDetails.dbInstanceIdentifier
       * * resource.rdsDbInstanceDetails.dbClusterIdentifier
       * * resource.rdsDbInstanceDetails.engine
       * * resource.rdsDbUserDetails.user
       * * resource.rdsDbInstanceDetails.tags.key
       * * resource.rdsDbInstanceDetails.tags.value
       * * service.runtimeDetails.process.executableSha256
       * * service.runtimeDetails.process.name
       * * service.runtimeDetails.process.name
       * * resource.lambdaDetails.functionName
       * * resource.lambdaDetails.functionArn
       * * resource.lambdaDetails.tags.key
       * * resource.lambdaDetails.tags.value
       */
      override fun criterion(criterion: Any) {
        cdkBuilder.criterion(criterion)
      }

      /**
       * @param itemType the value to be set.
       */
      override fun itemType(itemType: IResolvable) {
        cdkBuilder.itemType(itemType.let(IResolvable::unwrap))
      }

      /**
       * @param itemType the value to be set.
       */
      override fun itemType(itemType: ConditionProperty) {
        cdkBuilder.itemType(itemType.let(ConditionProperty::unwrap))
      }

      /**
       * @param itemType the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("897a74b3e78942542e7d1b032849a233ae4e0ba8dddd14fdf896c74ee82093a8")
      override fun itemType(itemType: ConditionProperty.Builder.() -> Unit): Unit =
          itemType(ConditionProperty(itemType))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty,
    ) : CdkObject(cdkObject), FindingCriteriaProperty {
      /**
       * Represents a map of finding properties that match specified conditions and values when
       * querying findings.
       *
       * For information about JSON criterion mapping to their console equivalent, see [Finding
       * criteria](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria)
       * . The following are the available criterion:
       *
       * * accountId
       * * id
       * * region
       * * severity
       *
       * To filter on the basis of severity, API and CFN use the following input list for the
       * condition:
       *
       * * *Low* : `["1", "2", "3"]`
       * * *Medium* : `["4", "5", "6"]`
       * * *High* : `["7", "8", "9"]`
       *
       * For more information, see [Severity levels for GuardDuty
       * findings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings.html#guardduty_findings-severity)
       * .
       *
       * * type
       * * updatedAt
       *
       * Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on
       * whether the value contains milliseconds.
       *
       * * resource.accessKeyDetails.accessKeyId
       * * resource.accessKeyDetails.principalId
       * * resource.accessKeyDetails.userName
       * * resource.accessKeyDetails.userType
       * * resource.instanceDetails.iamInstanceProfile.id
       * * resource.instanceDetails.imageId
       * * resource.instanceDetails.instanceId
       * * resource.instanceDetails.tags.key
       * * resource.instanceDetails.tags.value
       * * resource.instanceDetails.networkInterfaces.ipv6Addresses
       * * resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress
       * * resource.instanceDetails.networkInterfaces.publicDnsName
       * * resource.instanceDetails.networkInterfaces.publicIp
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupId
       * * resource.instanceDetails.networkInterfaces.securityGroups.groupName
       * * resource.instanceDetails.networkInterfaces.subnetId
       * * resource.instanceDetails.networkInterfaces.vpcId
       * * resource.instanceDetails.outpostArn
       * * resource.resourceType
       * * resource.s3BucketDetails.publicAccess.effectivePermissions
       * * resource.s3BucketDetails.name
       * * resource.s3BucketDetails.tags.key
       * * resource.s3BucketDetails.tags.value
       * * resource.s3BucketDetails.type
       * * service.action.actionType
       * * service.action.awsApiCallAction.api
       * * service.action.awsApiCallAction.callerType
       * * service.action.awsApiCallAction.errorCode
       * * service.action.awsApiCallAction.remoteIpDetails.city.cityName
       * * service.action.awsApiCallAction.remoteIpDetails.country.countryName
       * * service.action.awsApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asn
       * * service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg
       * * service.action.awsApiCallAction.serviceName
       * * service.action.dnsRequestAction.domain
       * * service.action.networkConnectionAction.blocked
       * * service.action.networkConnectionAction.connectionDirection
       * * service.action.networkConnectionAction.localPortDetails.port
       * * service.action.networkConnectionAction.protocol
       * * service.action.networkConnectionAction.remoteIpDetails.city.cityName
       * * service.action.networkConnectionAction.remoteIpDetails.country.countryName
       * * service.action.networkConnectionAction.remoteIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asn
       * * service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg
       * * service.action.networkConnectionAction.remotePortDetails.port
       * * service.action.awsApiCallAction.remoteAccountDetails.affiliated
       * * service.action.kubernetesApiCallAction.remoteIpDetails.ipAddressV4
       * * service.action.kubernetesApiCallAction.requestUri
       * * service.action.networkConnectionAction.localIpDetails.ipAddressV4
       * * service.action.networkConnectionAction.protocol
       * * service.action.awsApiCallAction.serviceName
       * * service.action.awsApiCallAction.remoteAccountDetails.accountId
       * * service.additionalInfo.threatListName
       * * service.resourceRole
       * * resource.eksClusterDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.name
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.namespace
       * * resource.kubernetesDetails.kubernetesUserDetails.username
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.image
       * * resource.kubernetesDetails.kubernetesWorkloadDetails.containers.imagePrefix
       * * service.ebsVolumeScanDetails.scanId
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.name
       * * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.severity
       * *
       * service.ebsVolumeScanDetails.scanDetections.threatDetectedByName.threatNames.filePaths.hash
       * * resource.ecsClusterDetails.name
       * * resource.ecsClusterDetails.taskDetails.containers.image
       * * resource.ecsClusterDetails.taskDetails.definitionArn
       * * resource.containerDetails.image
       * * resource.rdsDbInstanceDetails.dbInstanceIdentifier
       * * resource.rdsDbInstanceDetails.dbClusterIdentifier
       * * resource.rdsDbInstanceDetails.engine
       * * resource.rdsDbUserDetails.user
       * * resource.rdsDbInstanceDetails.tags.key
       * * resource.rdsDbInstanceDetails.tags.value
       * * service.runtimeDetails.process.executableSha256
       * * service.runtimeDetails.process.name
       * * service.runtimeDetails.process.name
       * * resource.lambdaDetails.functionName
       * * resource.lambdaDetails.functionArn
       * * resource.lambdaDetails.tags.key
       * * resource.lambdaDetails.tags.value
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
       */
      override fun criterion(): Any? = unwrap(this).getCriterion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
       */
      override fun itemType(): Any? = unwrap(this).getItemType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FindingCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty):
          FindingCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as FindingCriteriaProperty

      internal fun unwrap(wrapped: FindingCriteriaProperty):
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty
    }
  }
}
