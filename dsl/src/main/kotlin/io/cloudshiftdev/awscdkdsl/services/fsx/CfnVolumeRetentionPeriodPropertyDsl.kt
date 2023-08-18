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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Specifies the retention period of an FSx for ONTAP SnapLock volume.
 *
 * After it is set, it can't be changed. Files can't be deleted or modified during the retention
 * period.
 *
 * For more information, see
 * [Working with the retention period in SnapLock](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-retentionperiod.html)
 */
@CdkDslMarker
public class CfnVolumeRetentionPeriodPropertyDsl {
    private val cdkBuilder: CfnVolume.RetentionPeriodProperty.Builder =
        CfnVolume.RetentionPeriodProperty.builder()

    /**
     * @param type Defines the type of time for the retention period of an FSx for ONTAP SnapLock
     *   volume. Set it to one of the valid types. If you set it to `INFINITE` , the files are
     *   retained forever. If you set it to `UNSPECIFIED` , the files are retained until you set an
     *   explicit retention period.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value Defines the amount of time for the retention period of an FSx for ONTAP SnapLock
     *   volume. You can't set a value for `INFINITE` or `UNSPECIFIED` . For all other options, the
     *   following ranges are valid:
     * * `Seconds` : 0 - 65,535
     * * `Minutes` : 0 - 65,535
     * * `Hours` : 0 - 24
     * * `Days` : 0 - 365
     * * `Months` : 0 - 12
     * * `Years` : 0 - 100
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVolume.RetentionPeriodProperty = cdkBuilder.build()
}
