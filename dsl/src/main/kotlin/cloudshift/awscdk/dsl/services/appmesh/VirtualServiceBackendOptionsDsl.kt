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
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions
import kotlin.Unit

@CdkDslMarker
public class VirtualServiceBackendOptionsDsl {
    private val cdkBuilder: VirtualServiceBackendOptions.Builder =
        VirtualServiceBackendOptions.builder()

    public fun tlsClientPolicy(block: TlsClientPolicyDsl.() -> Unit = {}) {
        val builder = TlsClientPolicyDsl()
        builder.apply(block)
        cdkBuilder.tlsClientPolicy(builder.build())
    }

    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
        cdkBuilder.tlsClientPolicy(tlsClientPolicy)
    }

    public fun build(): VirtualServiceBackendOptions = cdkBuilder.build()
}
