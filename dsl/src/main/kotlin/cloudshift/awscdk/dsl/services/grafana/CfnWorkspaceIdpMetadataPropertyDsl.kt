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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.grafana.CfnWorkspace
import kotlin.String

@CdkDslMarker
public class CfnWorkspaceIdpMetadataPropertyDsl {
    private val cdkBuilder: CfnWorkspace.IdpMetadataProperty.Builder =
        CfnWorkspace.IdpMetadataProperty.builder()

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun xml(xml: String) {
        cdkBuilder.xml(xml)
    }

    public fun build(): CfnWorkspace.IdpMetadataProperty = cdkBuilder.build()
}
