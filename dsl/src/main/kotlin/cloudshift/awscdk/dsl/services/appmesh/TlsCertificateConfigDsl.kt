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
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig
import kotlin.Unit

@CdkDslMarker
public class TlsCertificateConfigDsl {
    private val cdkBuilder: TlsCertificateConfig.Builder = TlsCertificateConfig.builder()

    public fun tlsCertificate(
        block: CfnVirtualNodeListenerTlsCertificatePropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnVirtualNodeListenerTlsCertificatePropertyDsl()
        builder.apply(block)
        cdkBuilder.tlsCertificate(builder.build())
    }

    public fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
        cdkBuilder.tlsCertificate(tlsCertificate)
    }

    public fun build(): TlsCertificateConfig = cdkBuilder.build()
}
