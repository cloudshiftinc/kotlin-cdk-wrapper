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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Custom snapshot policies only]* Specifies information about the archive storage tier retention
 * period.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * ArchiveRetainRuleProperty archiveRetainRuleProperty = ArchiveRetainRuleProperty.builder()
 * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
 * .count(123)
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiveretainrule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyArchiveRetainRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder =
        CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder()

    /**
     * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
     *   Archive. For more information, see
     *   [Archive Amazon EBS snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html)
     *   .
     */
    public fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier)
    }

    /**
     * @param retentionArchiveTier Information about retention period in the Amazon EBS Snapshots
     *   Archive. For more information, see
     *   [Archive Amazon EBS snapshots](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/snapshot-archive.html)
     *   .
     */
    public fun retentionArchiveTier(
        retentionArchiveTier: CfnLifecyclePolicy.RetentionArchiveTierProperty
    ) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier)
    }

    public fun build(): CfnLifecyclePolicy.ArchiveRetainRuleProperty = cdkBuilder.build()
}
