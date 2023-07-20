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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerCertificatePropsDsl {
    private val cdkBuilder: CfnListenerCertificateProps.Builder =
        CfnListenerCertificateProps.builder()

    private val _certificates: MutableList<Any> = mutableListOf()

    public fun certificates(vararg certificates: Any) {
        _certificates.addAll(listOf(*certificates))
    }

    public fun certificates(certificates: Collection<Any>) {
        _certificates.addAll(certificates)
    }

    public fun certificates(certificates: IResolvable) {
        cdkBuilder.certificates(certificates)
    }

    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    public fun build(): CfnListenerCertificateProps {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        return cdkBuilder.build()
    }
}
