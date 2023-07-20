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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeClientTlsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ClientTlsCertificateProperty.Builder =
        CfnVirtualNode.ClientTlsCertificateProperty.builder()

    public fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`)
    }

    public fun `file`(`file`: CfnVirtualNode.ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`)
    }

    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    public fun sds(sds: CfnVirtualNode.ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualNode.ClientTlsCertificateProperty = cdkBuilder.build()
}
