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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

/**
 * A structure containing the percentage of launch traffic to allocate to one launch group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * GroupToWeightProperty groupToWeightProperty = GroupToWeightProperty.builder()
 * .groupName("groupName")
 * .splitWeight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-grouptoweight.html)
 */
@CdkDslMarker
public class CfnLaunchGroupToWeightPropertyDsl {
    private val cdkBuilder: CfnLaunch.GroupToWeightProperty.Builder =
        CfnLaunch.GroupToWeightProperty.builder()

    /** @param groupName The name of the launch group. It can include up to 127 characters. */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param splitWeight The portion of launch traffic to allocate to this launch group. This is
     *   represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the
     *   launch audience to this launch group.
     */
    public fun splitWeight(splitWeight: Number) {
        cdkBuilder.splitWeight(splitWeight)
    }

    public fun build(): CfnLaunch.GroupToWeightProperty = cdkBuilder.build()
}
