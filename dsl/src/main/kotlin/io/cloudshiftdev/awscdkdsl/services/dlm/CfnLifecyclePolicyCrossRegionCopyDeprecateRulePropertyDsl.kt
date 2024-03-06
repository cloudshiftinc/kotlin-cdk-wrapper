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
 * *[Custom AMI policies only]* Specifies an AMI deprecation rule for cross-Region AMI copies
 * created by an AMI policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * CrossRegionCopyDeprecateRuleProperty crossRegionCopyDeprecateRuleProperty =
 * CrossRegionCopyDeprecateRuleProperty.builder()
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopydeprecaterule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.builder()

    /**
     * @param interval The period after which to deprecate the cross-Region AMI copies. The period
     *   must be less than or equal to the cross-Region AMI copy retention period, and it can't be
     *   greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
     */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param intervalUnit The unit of time in which to measure the *Interval* . For example, to
     *   deprecate a cross-Region AMI copy after 3 months, specify `Interval=3` and
     *   `IntervalUnit=MONTHS` .
     */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty = cdkBuilder.build()
}
