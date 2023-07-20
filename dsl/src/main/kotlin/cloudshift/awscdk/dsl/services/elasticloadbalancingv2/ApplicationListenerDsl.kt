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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationListenerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApplicationListener.Builder = ApplicationListener.Builder.create(
        scope,
        id,
    )

    private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

    private val _defaultTargetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

    public fun certificates(vararg certificates: IListenerCertificate) {
        _certificates.addAll(listOf(*certificates))
    }

    public fun certificates(certificates: Collection<IListenerCertificate>) {
        _certificates.addAll(certificates)
    }

    public fun defaultAction(defaultAction: ListenerAction) {
        cdkBuilder.defaultAction(defaultAction)
    }

    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup) {
        _defaultTargetGroups.addAll(listOf(*defaultTargetGroups))
    }

    public fun defaultTargetGroups(defaultTargetGroups: Collection<IApplicationTargetGroup>) {
        _defaultTargetGroups.addAll(defaultTargetGroups)
    }

    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): ApplicationListener {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        if (_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
        return cdkBuilder.build()
    }
}
