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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import kotlin.String

@CdkDslMarker
public class CfnImageBuilderAccessEndpointPropertyDsl {
    private val cdkBuilder: CfnImageBuilder.AccessEndpointProperty.Builder =
        CfnImageBuilder.AccessEndpointProperty.builder()

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
    }

    public fun build(): CfnImageBuilder.AccessEndpointProperty = cdkBuilder.build()
}
