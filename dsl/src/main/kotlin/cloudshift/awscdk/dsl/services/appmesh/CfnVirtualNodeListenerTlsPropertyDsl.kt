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
import kotlin.String

@CdkDslMarker
public class CfnVirtualNodeListenerTlsPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsProperty.Builder =
        CfnVirtualNode.ListenerTlsProperty.builder()

    public fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate)
    }

    public fun certificate(certificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
        cdkBuilder.certificate(certificate)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation)
    }

    public fun validation(validation: CfnVirtualNode.ListenerTlsValidationContextProperty) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CfnVirtualNode.ListenerTlsProperty = cdkBuilder.build()
}
