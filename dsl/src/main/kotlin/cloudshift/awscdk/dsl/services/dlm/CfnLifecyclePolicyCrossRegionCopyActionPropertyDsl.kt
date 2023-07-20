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
import kotlin.String

@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyActionProperty.builder()

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: CfnLifecyclePolicy.EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
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

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyActionProperty = cdkBuilder.build()
}
