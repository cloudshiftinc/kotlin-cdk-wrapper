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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnFilter
import software.constructs.Construct

/**
 * The `AWS::GuardDuty::Filter` resource specifies a new filter defined by the provided
 * `findingCriteria` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * Object criterion;
 * CfnFilter cfnFilter = CfnFilter.Builder.create(this, "MyCfnFilter")
 * .action("action")
 * .description("description")
 * .detectorId("detectorId")
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
 * .name("name")
 * .rank(123)
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
 */
@CdkDslMarker
public class CfnFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFilter.Builder = CfnFilter.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
     *
     * @param action Specifies the action that is to be applied to the findings that match the
     *   filter.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * The description of the filter.
     *
     * Valid characters include alphanumeric characters, and special characters such as hyphen,
     * period, colon, underscore, parentheses ( `{ }` , `[ ]` , and `( )` ), forward slash,
     * horizontal tab, vertical tab, newline, form feed, return, and whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
     *
     * @param description The description of the filter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the detector belonging to the GuardDuty account that you want to create a filter
     * for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
     *
     * @param detectorId The ID of the detector belonging to the GuardDuty account that you want to
     *   create a filter for.
     */
    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     *
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     *   findings.
     */
    public fun findingCriteria(findingCriteria: IResolvable) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
     *
     * @param findingCriteria Represents the criteria to be used in the filter for querying
     *   findings.
     */
    public fun findingCriteria(findingCriteria: CfnFilter.FindingCriteriaProperty) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /**
     * The name of the filter.
     *
     * Valid characters include period (.), underscore (_), dash (-), and alphanumeric characters. A
     * whitespace is considered to be an invalid character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
     *
     * @param name The name of the filter.
     */
    public fun name(name: String) {
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
     *
     * @param rank Specifies the position of the filter in the list of current filters.
     */
    public fun rank(rank: Number) {
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
     *
     * @param tags The tags to be added to a new filter resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
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
     *
     * @param tags The tags to be added to a new filter resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFilter {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
