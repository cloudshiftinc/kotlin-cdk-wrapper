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
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Custom snapshot and AMI policies only]* Specifies optional parameters for snapshot and AMI
 * policies.
 *
 * The set of valid parameters depends on the combination of policy type and target resource type.
 *
 * If you choose to exclude boot volumes and you specify tags that consequently exclude all of the
 * additional data volumes attached to an instance, then Amazon Data Lifecycle Manager will not
 * create any snapshots for the affected instance, and it will emit a `SnapshotsCreateFailed` Amazon
 * CloudWatch metric. For more information, see
 * [Monitor your policies using Amazon CloudWatch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitor-dlm-cw-metrics.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * ParametersProperty parametersProperty = ParametersProperty.builder()
 * .excludeBootVolume(false)
 * .excludeDataVolumeTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .noReboot(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyParametersPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ParametersProperty.Builder =
        CfnLifecyclePolicy.ParametersProperty.builder()

    private val _excludeDataVolumeTags: MutableList<Any> = mutableListOf()

    /**
     * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
     *   whether to exclude the root volume from multi-volume snapshot sets. The default is `false`
     *   . If you specify `true` , then the root volumes attached to targeted instances will be
     *   excluded from the multi-volume snapshot sets created by the policy.
     */
    public fun excludeBootVolume(excludeBootVolume: Boolean) {
        cdkBuilder.excludeBootVolume(excludeBootVolume)
    }

    /**
     * @param excludeBootVolume *[Custom snapshot policies that target instances only]* Indicates
     *   whether to exclude the root volume from multi-volume snapshot sets. The default is `false`
     *   . If you specify `true` , then the root volumes attached to targeted instances will be
     *   excluded from the multi-volume snapshot sets created by the policy.
     */
    public fun excludeBootVolume(excludeBootVolume: IResolvable) {
        cdkBuilder.excludeBootVolume(excludeBootVolume)
    }

    /**
     * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The tags
     *   used to identify data (non-root) volumes to exclude from multi-volume snapshot sets. If you
     *   create a snapshot lifecycle policy that targets instances and you specify tags for this
     *   parameter, then data volumes with the specified tags that are attached to targeted
     *   instances will be excluded from the multi-volume snapshot sets created by the policy.
     */
    public fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any) {
        _excludeDataVolumeTags.addAll(listOf(*excludeDataVolumeTags))
    }

    /**
     * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The tags
     *   used to identify data (non-root) volumes to exclude from multi-volume snapshot sets. If you
     *   create a snapshot lifecycle policy that targets instances and you specify tags for this
     *   parameter, then data volumes with the specified tags that are attached to targeted
     *   instances will be excluded from the multi-volume snapshot sets created by the policy.
     */
    public fun excludeDataVolumeTags(excludeDataVolumeTags: Collection<Any>) {
        _excludeDataVolumeTags.addAll(excludeDataVolumeTags)
    }

    /**
     * @param excludeDataVolumeTags *[Custom snapshot policies that target instances only]* The tags
     *   used to identify data (non-root) volumes to exclude from multi-volume snapshot sets. If you
     *   create a snapshot lifecycle policy that targets instances and you specify tags for this
     *   parameter, then data volumes with the specified tags that are attached to targeted
     *   instances will be excluded from the multi-volume snapshot sets created by the policy.
     */
    public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
    }

    /**
     * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
     *   rebooted when the lifecycle policy runs. `true` indicates that targeted instances are not
     *   rebooted when the policy runs. `false` indicates that target instances are rebooted when
     *   the policy runs. The default is `true` (instances are not rebooted).
     */
    public fun noReboot(noReboot: Boolean) {
        cdkBuilder.noReboot(noReboot)
    }

    /**
     * @param noReboot *[Custom AMI policies only]* Indicates whether targeted instances are
     *   rebooted when the lifecycle policy runs. `true` indicates that targeted instances are not
     *   rebooted when the policy runs. `false` indicates that target instances are rebooted when
     *   the policy runs. The default is `true` (instances are not rebooted).
     */
    public fun noReboot(noReboot: IResolvable) {
        cdkBuilder.noReboot(noReboot)
    }

    public fun build(): CfnLifecyclePolicy.ParametersProperty {
        if (_excludeDataVolumeTags.isNotEmpty())
            cdkBuilder.excludeDataVolumeTags(_excludeDataVolumeTags)
        return cdkBuilder.build()
    }
}
