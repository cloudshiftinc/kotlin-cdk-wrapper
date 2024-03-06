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
 * *[Custom snapshot policies only]* Describes the retention rule for archived snapshots.
 *
 * Once the archive retention threshold is met, the snapshots are permanently deleted from the
 * archive tier.
 *
 * The archive retention rule must retain snapshots in the archive tier for a minimum of 90 days.
 *
 * For *count-based schedules* , you must specify *Count* . For *age-based schedules* , you must
 * specify *Interval* and *IntervalUnit* .
 *
 * For more information about using snapshot archiving, see
 * [Considerations for snapshot lifecycle policies](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * RetentionArchiveTierProperty retentionArchiveTierProperty =
 * RetentionArchiveTierProperty.builder()
 * .count(123)
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retentionarchivetier.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyRetentionArchiveTierPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.RetentionArchiveTierProperty.Builder =
        CfnLifecyclePolicy.RetentionArchiveTierProperty.builder()

    /**
     * @param count The maximum number of snapshots to retain in the archive storage tier for each
     *   volume. The count must ensure that each snapshot remains in the archive tier for at least
     *   90 days. For example, if the schedule creates snapshots every 30 days, you must specify a
     *   count of 3 or more to ensure that each snapshot is archived for at least 90 days.
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * @param interval Specifies the period of time to retain snapshots in the archive tier. After
     *   this period expires, the snapshot is permanently deleted.
     */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param intervalUnit The unit of time in which to measure the *Interval* . For example, to
     *   retain a snapshots in the archive tier for 6 months, specify `Interval=6` and
     *   `IntervalUnit=MONTHS` .
     */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.RetentionArchiveTierProperty = cdkBuilder.build()
}
