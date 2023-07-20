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
public class CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder =
        CfnVirtualNode.ListenerTlsAcmCertificateProperty.builder()

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun build(): CfnVirtualNode.ListenerTlsAcmCertificateProperty = cdkBuilder.build()
}
