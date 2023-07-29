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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.constructs.Construct

/**
 * The `AWS::Macie::FindingsFilter` resource specifies a findings filter.
 *
 * In Amazon Macie , a *findings filter* , also referred to as a *filter rule* , is a set of custom
 * criteria that specifies which findings to include or exclude from the results of a query for
 * findings. The criteria can help you identify and focus on findings that have specific
 * characteristics, such as severity, type, or the name of an affected AWS resource. You can also
 * configure a findings filter to suppress (automatically archive) findings that match the filter's
 * criteria. For more information, see
 * [Filtering findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html)
 * in the *Amazon Macie User Guide* .
 *
 * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
 * `AWS::Macie::FindingsFilter` resource for the account. Use a
 * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
 * created for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnFindingsFilter cfnFindingsFilter = CfnFindingsFilter.Builder.create(this,
 * "MyCfnFindingsFilter")
 * .findingCriteria(FindingCriteriaProperty.builder()
 * .criterion(Map.of(
 * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
 * .eq(List.of("eq"))
 * .gt(123)
 * .gte(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .action("action")
 * .description("description")
 * .position(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html)
 */
@CdkDslMarker
public class CfnFindingsFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFindingsFilter.Builder = CfnFindingsFilter.Builder.create(scope, id)

    /**
     * The action to perform on findings that match the filter criteria ( `FindingCriteria` ). Valid
     * values are:.
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-action)
     *
     * @param action The action to perform on findings that match the filter criteria (
     *   `FindingCriteria` ). Valid values are:.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * A custom description of the findings filter. The description can contain 1-512 characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-description)
     *
     * @param description A custom description of the findings filter. The description can contain
     *   1-512 characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     *
     * @param findingCriteria The criteria to use to filter findings.
     */
    public fun findingCriteria(findingCriteria: IResolvable) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /**
     * The criteria to use to filter findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-findingcriteria)
     *
     * @param findingCriteria The criteria to use to filter findings.
     */
    public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /**
     * A custom name for the findings filter. The name can contain 3-64 characters.
     *
     * Avoid including sensitive data in the name. Users of the account might be able to see the
     * name, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-name)
     *
     * @param name A custom name for the findings filter. The name can contain 3-64 characters.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The position of the findings filter in the list of saved filters on the Amazon Macie console.
     *
     * This value also determines the order in which the filter is applied to findings, relative to
     * other filters that are also applied to findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-findingsfilter.html#cfn-macie-findingsfilter-position)
     *
     * @param position The position of the findings filter in the list of saved filters on the
     *   Amazon Macie console.
     */
    public fun position(position: Number) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnFindingsFilter = cdkBuilder.build()
}
