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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationListenerCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApplicationListenerCertificate.Builder =
        ApplicationListenerCertificate.Builder.create(scope, id)

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

    public fun build(): ApplicationListenerCertificate {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        return cdkBuilder.build()
    }
}
