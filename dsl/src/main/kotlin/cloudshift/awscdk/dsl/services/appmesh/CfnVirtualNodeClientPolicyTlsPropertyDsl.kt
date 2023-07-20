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
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualNodeClientPolicyTlsPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ClientPolicyTlsProperty.Builder =
        CfnVirtualNode.ClientPolicyTlsProperty.builder()

    private val _ports: MutableList<Number> = mutableListOf()

    public fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate)
    }

    public fun certificate(certificate: CfnVirtualNode.ClientTlsCertificateProperty) {
        cdkBuilder.certificate(certificate)
    }

    public fun enforce(enforce: Boolean) {
        cdkBuilder.enforce(enforce)
    }

    public fun enforce(enforce: IResolvable) {
        cdkBuilder.enforce(enforce)
    }

    public fun ports(vararg ports: Number) {
        _ports.addAll(listOf(*ports))
    }

    public fun ports(ports: Collection<Number>) {
        _ports.addAll(ports)
    }

    public fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports)
    }

    public fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation)
    }

    public fun validation(validation: CfnVirtualNode.TlsValidationContextProperty) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CfnVirtualNode.ClientPolicyTlsProperty {
        if (_ports.isNotEmpty()) cdkBuilder.ports(_ports)
        return cdkBuilder.build()
    }
}
