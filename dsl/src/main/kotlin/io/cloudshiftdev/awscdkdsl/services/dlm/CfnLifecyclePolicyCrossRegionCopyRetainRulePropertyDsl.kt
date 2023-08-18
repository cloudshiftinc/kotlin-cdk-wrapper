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
 * Specifies a retention rule for cross-Region snapshot copies created by snapshot or event-based
 * policies, or cross-Region AMI copies created by AMI policies.
 *
 * After the retention period expires, the cross-Region copy is deleted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * CrossRegionCopyRetainRuleProperty crossRegionCopyRetainRuleProperty =
 * CrossRegionCopyRetainRuleProperty.builder()
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

    /**
     * @param interval The amount of time to retain a cross-Region snapshot or AMI copy. The maximum
     *   is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param intervalUnit The unit of time for time-based retention. For example, to retain a
     *   cross-Region copy for 3 months, specify `Interval=3` and `IntervalUnit=MONTHS` .
     */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty = cdkBuilder.build()
}
