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
public class CfnApplicationInstanceManifestOverridesPayloadPropertyDsl {
    private val cdkBuilder: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder =
        CfnApplicationInstance.ManifestOverridesPayloadProperty.builder()

    public fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
    }

    public fun build(): CfnApplicationInstance.ManifestOverridesPayloadProperty = cdkBuilder.build()
}
