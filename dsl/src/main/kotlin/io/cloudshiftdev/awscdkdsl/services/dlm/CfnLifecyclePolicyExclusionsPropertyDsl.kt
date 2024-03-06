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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Default policies only]* Specifies exclusion parameters for volumes or instances for which you
 * do not want to create snapshots or AMIs.
 *
 * The policy will not create snapshots or AMIs for target resources that match any of the specified
 * exclusion parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * Object excludeTags;
 * Object excludeVolumeTypes;
 * ExclusionsProperty exclusionsProperty = ExclusionsProperty.builder()
 * .excludeBootVolumes(false)
 * .excludeTags(excludeTags)
 * .excludeVolumeTypes(excludeVolumeTypes)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-exclusions.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyExclusionsPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ExclusionsProperty.Builder =
        CfnLifecyclePolicy.ExclusionsProperty.builder()

    /**
     * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
     *   exclude volumes that are attached to instances as the boot volume. If you exclude boot
     *   volumes, only volumes attached as data (non-boot) volumes will be backed up by the policy.
     *   To exclude boot volumes, specify `true` .
     */
    public fun excludeBootVolumes(excludeBootVolumes: Boolean) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes)
    }

    /**
     * @param excludeBootVolumes *[Default policies for EBS snapshots only]* Indicates whether to
     *   exclude volumes that are attached to instances as the boot volume. If you exclude boot
     *   volumes, only volumes attached as data (non-boot) volumes will be backed up by the policy.
     *   To exclude boot volumes, specify `true` .
     */
    public fun excludeBootVolumes(excludeBootVolumes: IResolvable) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes)
    }

    /**
     * @param excludeTags *[Default policies for EBS-backed AMIs only]* Specifies whether to exclude
     *   volumes that have specific tags.
     */
    public fun excludeTags(excludeTags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(excludeTags)
        cdkBuilder.excludeTags(builder.map)
    }

    /**
     * @param excludeTags *[Default policies for EBS-backed AMIs only]* Specifies whether to exclude
     *   volumes that have specific tags.
     */
    public fun excludeTags(excludeTags: Any) {
        cdkBuilder.excludeTags(excludeTags)
    }

    /**
     * @param excludeVolumeTypes *[Default policies for EBS snapshots only]* Specifies the volume
     *   types to exclude. Volumes of the specified types will not be targeted by the policy.
     */
    public fun excludeVolumeTypes(excludeVolumeTypes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(excludeVolumeTypes)
        cdkBuilder.excludeVolumeTypes(builder.map)
    }

    /**
     * @param excludeVolumeTypes *[Default policies for EBS snapshots only]* Specifies the volume
     *   types to exclude. Volumes of the specified types will not be targeted by the policy.
     */
    public fun excludeVolumeTypes(excludeVolumeTypes: Any) {
        cdkBuilder.excludeVolumeTypes(excludeVolumeTypes)
    }

    public fun build(): CfnLifecyclePolicy.ExclusionsProperty = cdkBuilder.build()
}
