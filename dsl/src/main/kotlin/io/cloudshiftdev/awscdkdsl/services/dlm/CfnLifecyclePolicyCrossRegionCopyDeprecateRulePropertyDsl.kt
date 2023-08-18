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

    /** @param interval the value to be set. */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /** @param intervalUnit the value to be set. */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty = cdkBuilder.build()
}
