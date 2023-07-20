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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationListenerCertificatePropsDsl {
    private val cdkBuilder: ApplicationListenerCertificateProps.Builder =
        ApplicationListenerCertificateProps.builder()

    private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

    public fun certificates(vararg certificates: IListenerCertificate) {
        _certificates.addAll(listOf(*certificates))
    }

    public fun certificates(certificates: Collection<IListenerCertificate>) {
        _certificates.addAll(certificates)
    }

    public fun listener(listener: IApplicationListener) {
        cdkBuilder.listener(listener)
    }

    public fun build(): ApplicationListenerCertificateProps {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        return cdkBuilder.build()
    }
}
