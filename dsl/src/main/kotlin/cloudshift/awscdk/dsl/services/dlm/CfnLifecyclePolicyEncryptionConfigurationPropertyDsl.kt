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
public class CfnLifecyclePolicyEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder =
        CfnLifecyclePolicy.EncryptionConfigurationProperty.builder()

    public fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
    }

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun build(): CfnLifecyclePolicy.EncryptionConfigurationProperty = cdkBuilder.build()
}
