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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TlsValidationContextAcmTrustProperty.Builder =
        CfnVirtualNode.TlsValidationContextAcmTrustProperty.builder()

    private val _certificateAuthorityArns: MutableList<String> = mutableListOf()

    public fun certificateAuthorityArns(vararg certificateAuthorityArns: String) {
        _certificateAuthorityArns.addAll(listOf(*certificateAuthorityArns))
    }

    public fun certificateAuthorityArns(certificateAuthorityArns: Collection<String>) {
        _certificateAuthorityArns.addAll(certificateAuthorityArns)
    }

    public fun build(): CfnVirtualNode.TlsValidationContextAcmTrustProperty {
        if (_certificateAuthorityArns.isNotEmpty()) {
            cdkBuilder.certificateAuthorityArns(_certificateAuthorityArns)
        }
        return cdkBuilder.build()
    }
}
