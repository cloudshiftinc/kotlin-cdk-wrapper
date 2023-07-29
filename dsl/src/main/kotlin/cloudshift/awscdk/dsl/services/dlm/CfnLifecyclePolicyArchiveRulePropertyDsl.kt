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
 * ArchiveRuleProperty archiveRuleProperty = ArchiveRuleProperty.builder()
 * .retainRule(ArchiveRetainRuleProperty.builder()
 * .retentionArchiveTier(RetentionArchiveTierProperty.builder()
 * .count(123)
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-archiverule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyArchiveRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.ArchiveRuleProperty.Builder =
        CfnLifecyclePolicy.ArchiveRuleProperty.builder()

    /** @param retainRule the value to be set. */
    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    /** @param retainRule the value to be set. */
    public fun retainRule(retainRule: CfnLifecyclePolicy.ArchiveRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    public fun build(): CfnLifecyclePolicy.ArchiveRuleProperty = cdkBuilder.build()
}
