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
public class CfnVirtualNodeListenerTlsFileCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder =
        CfnVirtualNode.ListenerTlsFileCertificateProperty.builder()

    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    public fun build(): CfnVirtualNode.ListenerTlsFileCertificateProperty = cdkBuilder.build()
}
