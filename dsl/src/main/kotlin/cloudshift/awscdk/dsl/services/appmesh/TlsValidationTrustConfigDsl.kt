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
import software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig
import kotlin.Unit

@CdkDslMarker
public class TlsValidationTrustConfigDsl {
    private val cdkBuilder: TlsValidationTrustConfig.Builder = TlsValidationTrustConfig.builder()

    public fun tlsValidationTrust(
        block: CfnVirtualNodeTlsValidationContextTrustPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnVirtualNodeTlsValidationContextTrustPropertyDsl()
        builder.apply(block)
        cdkBuilder.tlsValidationTrust(builder.build())
    }

    public fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty) {
        cdkBuilder.tlsValidationTrust(tlsValidationTrust)
    }

    public fun build(): TlsValidationTrustConfig = cdkBuilder.build()
}
