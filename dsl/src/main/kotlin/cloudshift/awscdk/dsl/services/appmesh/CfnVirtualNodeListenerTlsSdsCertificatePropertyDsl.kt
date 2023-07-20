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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.String

@CdkDslMarker
public class CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder =
        CfnVirtualNode.ListenerTlsSdsCertificateProperty.builder()

    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnVirtualNode.ListenerTlsSdsCertificateProperty = cdkBuilder.build()
}
