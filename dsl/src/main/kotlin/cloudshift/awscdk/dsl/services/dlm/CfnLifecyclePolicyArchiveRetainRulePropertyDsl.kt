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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
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

    /** @param retentionArchiveTier the value to be set. */
    public fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier)
    }

    /** @param retentionArchiveTier the value to be set. */
    public fun retentionArchiveTier(
        retentionArchiveTier: CfnLifecyclePolicy.RetentionArchiveTierProperty
    ) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier)
    }

    public fun build(): CfnLifecyclePolicy.ArchiveRetainRuleProperty = cdkBuilder.build()
}
