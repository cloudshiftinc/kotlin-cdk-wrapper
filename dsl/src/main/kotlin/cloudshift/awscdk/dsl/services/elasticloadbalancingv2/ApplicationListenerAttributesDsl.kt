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
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ApplicationListenerAttributesDsl {
    private val cdkBuilder: ApplicationListenerAttributes.Builder =
        ApplicationListenerAttributes.builder()

    public fun defaultPort(defaultPort: Number) {
        cdkBuilder.defaultPort(defaultPort)
    }

    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun build(): ApplicationListenerAttributes = cdkBuilder.build()
}
