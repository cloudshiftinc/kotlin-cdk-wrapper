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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * The configuration to set the retention period of an FSx for ONTAP SnapLock volume.
 *
 * The retention period includes default, maximum, and minimum settings. For more information, see
 * [Working with the retention period in SnapLock](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * SnaplockRetentionPeriodProperty snaplockRetentionPeriodProperty =
 * SnaplockRetentionPeriodProperty.builder()
 * .defaultRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .maximumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .minimumRetention(RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-snaplockretentionperiod.html)
 */
@CdkDslMarker
public class CfnVolumeSnaplockRetentionPeriodPropertyDsl {
    private val cdkBuilder: CfnVolume.SnaplockRetentionPeriodProperty.Builder =
        CfnVolume.SnaplockRetentionPeriodProperty.builder()

    /**
     * @param defaultRetention The retention period assigned to a write once, read many (WORM) file
     *   by default if an explicit retention period is not set for an FSx for ONTAP SnapLock volume.
     *   The default retention period must be greater than or equal to the minimum retention period
     *   and less than or equal to the maximum retention period.
     */
    public fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention)
    }

    /**
     * @param defaultRetention The retention period assigned to a write once, read many (WORM) file
     *   by default if an explicit retention period is not set for an FSx for ONTAP SnapLock volume.
     *   The default retention period must be greater than or equal to the minimum retention period
     *   and less than or equal to the maximum retention period.
     */
    public fun defaultRetention(defaultRetention: CfnVolume.RetentionPeriodProperty) {
        cdkBuilder.defaultRetention(defaultRetention)
    }

    /**
     * @param maximumRetention The longest retention period that can be assigned to a WORM file on
     *   an FSx for ONTAP SnapLock volume.
     */
    public fun maximumRetention(maximumRetention: IResolvable) {
        cdkBuilder.maximumRetention(maximumRetention)
    }

    /**
     * @param maximumRetention The longest retention period that can be assigned to a WORM file on
     *   an FSx for ONTAP SnapLock volume.
     */
    public fun maximumRetention(maximumRetention: CfnVolume.RetentionPeriodProperty) {
        cdkBuilder.maximumRetention(maximumRetention)
    }

    /**
     * @param minimumRetention The shortest retention period that can be assigned to a WORM file on
     *   an FSx for ONTAP SnapLock volume.
     */
    public fun minimumRetention(minimumRetention: IResolvable) {
        cdkBuilder.minimumRetention(minimumRetention)
    }

    /**
     * @param minimumRetention The shortest retention period that can be assigned to a WORM file on
     *   an FSx for ONTAP SnapLock volume.
     */
    public fun minimumRetention(minimumRetention: CfnVolume.RetentionPeriodProperty) {
        cdkBuilder.minimumRetention(minimumRetention)
    }

    public fun build(): CfnVolume.SnaplockRetentionPeriodProperty = cdkBuilder.build()
}
