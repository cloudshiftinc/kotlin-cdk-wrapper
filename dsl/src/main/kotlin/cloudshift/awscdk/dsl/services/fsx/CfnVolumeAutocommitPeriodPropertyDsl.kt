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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Sets the autocommit period of files in an FSx for ONTAP SnapLock volume, which determines how
 * long the files must remain unmodified before they're automatically transitioned to the write
 * once, read many (WORM) state.
 *
 * For more information, see
 * [Autocommit](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-autocommit)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * AutocommitPeriodProperty autocommitPeriodProperty = AutocommitPeriodProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-autocommitperiod.html)
 */
@CdkDslMarker
public class CfnVolumeAutocommitPeriodPropertyDsl {
    private val cdkBuilder: CfnVolume.AutocommitPeriodProperty.Builder =
        CfnVolume.AutocommitPeriodProperty.builder()

    /**
     * @param type Defines the type of time for the autocommit period of a file in an FSx for ONTAP
     *   SnapLock volume. Setting this value to `NONE` disables autocommit. The default value is
     *   `NONE` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value Defines the amount of time for the autocommit period of a file in an FSx for
     *   ONTAP SnapLock volume. The following ranges are valid:
     * * `Minutes` : 5 - 65,535
     * * `Hours` : 1 - 65,535
     * * `Days` : 1 - 3,650
     * * `Months` : 1 - 120
     * * `Years` : 1 - 10
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVolume.AutocommitPeriodProperty = cdkBuilder.build()
}
