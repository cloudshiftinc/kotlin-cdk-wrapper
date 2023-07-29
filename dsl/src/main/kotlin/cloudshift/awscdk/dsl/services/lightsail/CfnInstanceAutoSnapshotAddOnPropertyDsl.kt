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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `AutoSnapshotAddOn` is a property of the
 * [AddOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html)
 * property. It describes the automatic snapshot add-on for an instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * AutoSnapshotAddOnProperty autoSnapshotAddOnProperty = AutoSnapshotAddOnProperty.builder()
 * .snapshotTimeOfDay("snapshotTimeOfDay")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-autosnapshotaddon.html)
 */
@CdkDslMarker
public class CfnInstanceAutoSnapshotAddOnPropertyDsl {
    private val cdkBuilder: CfnInstance.AutoSnapshotAddOnProperty.Builder =
        CfnInstance.AutoSnapshotAddOnProperty.builder()

    /**
     * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
     *   Constraints:
     * * Must be in `HH:00` format, and in an hourly increment.
     * * Specified in Coordinated Universal Time (UTC).
     * * The snapshot will be automatically created between the time specified and up to 45 minutes
     *   after.
     */
    public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
        cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
    }

    public fun build(): CfnInstance.AutoSnapshotAddOnProperty = cdkBuilder.build()
}
