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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Defines criteria to exclude AMIs from lifecycle actions based on the last time they were used to
 * launch an instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * LastLaunchedProperty lastLaunchedProperty = LastLaunchedProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyLastLaunchedPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.LastLaunchedProperty.Builder =
        CfnLifecyclePolicy.LastLaunchedProperty.builder()

    /**
     * @param unit Defines the unit of time that the lifecycle policy uses to calculate elapsed time
     *   since the last instance launched from the AMI. For example: days, weeks, months, or years.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value The integer number of units for the time period. For example `6` (months). */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnLifecyclePolicy.LastLaunchedProperty = cdkBuilder.build()
}
