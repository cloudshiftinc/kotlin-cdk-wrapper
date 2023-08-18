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

package io.cloudshiftdev.awscdkdsl.services.macie

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps

/**
 * Properties for defining a `CfnFindingsFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnFindingsFilterProps cfnFindingsFilterProps = CfnFindingsFilterProps.builder()
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
public class CfnFindingsFilterPropsDsl {
    private val cdkBuilder: CfnFindingsFilterProps.Builder = CfnFindingsFilterProps.builder()

    /**
     * @param action The action to perform on findings that match the filter criteria (
     *   `FindingCriteria` ). Valid values are:.
     * * `ARCHIVE` - Suppress (automatically archive) the findings.
     * * `NOOP` - Don't perform any action on the findings.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param description A custom description of the findings filter. The description can contain
     *   1-512 characters. Avoid including sensitive data in the description. Users of the account
     *   might be able to see the description, depending on the actions that they're allowed to
     *   perform in Amazon Macie .
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param findingCriteria The criteria to use to filter findings. */
    public fun findingCriteria(findingCriteria: IResolvable) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /** @param findingCriteria The criteria to use to filter findings. */
    public fun findingCriteria(findingCriteria: CfnFindingsFilter.FindingCriteriaProperty) {
        cdkBuilder.findingCriteria(findingCriteria)
    }

    /**
     * @param name A custom name for the findings filter. The name can contain 3-64 characters.
     *   Avoid including sensitive data in the name. Users of the account might be able to see the
     *   name, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param position The position of the findings filter in the list of saved filters on the
     *   Amazon Macie console. This value also determines the order in which the filter is applied
     *   to findings, relative to other filters that are also applied to findings.
     */
    public fun position(position: Number) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnFindingsFilterProps = cdkBuilder.build()
}
