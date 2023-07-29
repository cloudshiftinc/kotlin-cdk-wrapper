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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
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

    /** @param count the value to be set. */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /** @param interval the value to be set. */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /** @param intervalUnit the value to be set. */
    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.RetentionArchiveTierProperty = cdkBuilder.build()
}
