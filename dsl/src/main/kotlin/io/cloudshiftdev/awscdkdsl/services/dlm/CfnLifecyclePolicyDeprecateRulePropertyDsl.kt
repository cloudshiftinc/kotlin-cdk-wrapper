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

package io.cloudshiftdev.awscdkdsl.services.dlm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Custom AMI policies only]* Specifies an AMI deprecation rule for AMIs created by an AMI
 * lifecycle policy.
 *
 * For age-based schedules, you must specify *Interval* and *IntervalUnit* . For count-based
 * schedules, you must specify *Count* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * DeprecateRuleProperty deprecateRuleProperty = DeprecateRuleProperty.builder()
 * .count(123)
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-deprecaterule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyDeprecateRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.DeprecateRuleProperty.Builder =
        CfnLifecyclePolicy.DeprecateRuleProperty.builder()

    /**
     * @param count If the schedule has a count-based retention rule, this parameter specifies the
     *   number of oldest AMIs to deprecate. The count must be less than or equal to the schedule's
     *   retention count, and it can't be greater than 1000.
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * @param interval If the schedule has an age-based retention rule, this parameter specifies the
     *   period after which to deprecate AMIs created by the schedule. The period must be less than
     *   or equal to the schedule's retention period, and it can't be greater than 10 years. This is
     *   equivalent to 120 months, 520 weeks, or 3650 days.
     */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /** @param intervalUnit The unit of time in which to measure the *Interval* . */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.DeprecateRuleProperty = cdkBuilder.build()
}
