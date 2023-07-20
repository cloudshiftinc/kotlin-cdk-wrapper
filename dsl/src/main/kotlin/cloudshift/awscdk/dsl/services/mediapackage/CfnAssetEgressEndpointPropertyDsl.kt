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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediapackage.CfnAsset
import kotlin.String

@CdkDslMarker
public class CfnAssetEgressEndpointPropertyDsl {
    private val cdkBuilder: CfnAsset.EgressEndpointProperty.Builder =
        CfnAsset.EgressEndpointProperty.builder()

    public fun packagingConfigurationId(packagingConfigurationId: String) {
        cdkBuilder.packagingConfigurationId(packagingConfigurationId)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnAsset.EgressEndpointProperty = cdkBuilder.build()
}
