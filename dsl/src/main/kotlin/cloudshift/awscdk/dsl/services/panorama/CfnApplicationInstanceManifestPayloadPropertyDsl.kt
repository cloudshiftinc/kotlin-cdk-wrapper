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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import kotlin.String

@CdkDslMarker
public class CfnApplicationInstanceManifestPayloadPropertyDsl {
    private val cdkBuilder: CfnApplicationInstance.ManifestPayloadProperty.Builder =
        CfnApplicationInstance.ManifestPayloadProperty.builder()

    public fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
    }

    public fun build(): CfnApplicationInstance.ManifestPayloadProperty = cdkBuilder.build()
}
