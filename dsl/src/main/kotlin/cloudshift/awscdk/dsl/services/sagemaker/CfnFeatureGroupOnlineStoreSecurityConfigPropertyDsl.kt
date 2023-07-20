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
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import kotlin.String

@CdkDslMarker
public class CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.OnlineStoreSecurityConfigProperty.Builder =
        CfnFeatureGroup.OnlineStoreSecurityConfigProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnFeatureGroup.OnlineStoreSecurityConfigProperty = cdkBuilder.build()
}
