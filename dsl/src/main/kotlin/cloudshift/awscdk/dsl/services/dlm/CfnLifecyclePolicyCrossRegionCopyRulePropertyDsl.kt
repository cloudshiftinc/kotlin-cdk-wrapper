@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder()

    public fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
    }

    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    public fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    public fun deprecateRule(deprecateRule: CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    public fun retainRule(retainRule: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun targetRegion(targetRegion: String) {
        cdkBuilder.targetRegion(targetRegion)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyRuleProperty = cdkBuilder.build()
}
