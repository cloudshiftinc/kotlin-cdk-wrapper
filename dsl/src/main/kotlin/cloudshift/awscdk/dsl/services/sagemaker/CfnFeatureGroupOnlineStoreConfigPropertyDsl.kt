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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import kotlin.Boolean

@CdkDslMarker
public class CfnFeatureGroupOnlineStoreConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.OnlineStoreConfigProperty.Builder =
        CfnFeatureGroup.OnlineStoreConfigProperty.builder()

    public fun enableOnlineStore(enableOnlineStore: Boolean) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
    }

    public fun enableOnlineStore(enableOnlineStore: IResolvable) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
    }

    public fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig)
    }

    public fun securityConfig(securityConfig: CfnFeatureGroup.OnlineStoreSecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig)
    }

    public fun build(): CfnFeatureGroup.OnlineStoreConfigProperty = cdkBuilder.build()
}
