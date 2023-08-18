@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
import software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType

/**
 * Properties for defining an Application Load Balancer.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * FargateService service = FargateService.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
 * "LB").vpc(vpc).internetFacing(true).build();
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerPropsDsl {
    private val cdkBuilder: ApplicationLoadBalancerProps.Builder =
        ApplicationLoadBalancerProps.builder()

    /** @param deletionProtection Indicates whether deletion protection is enabled. */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     *   a security risk to your application.
     */
    public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
        cdkBuilder.desyncMitigationMode(desyncMitigationMode)
    }

    /**
     * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
     *   removed by the load balancer (true) or routed to targets (false).
     */
    public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
        cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
    }

    /** @param http2Enabled Indicates whether HTTP/2 is enabled. */
    public fun http2Enabled(http2Enabled: Boolean) {
        cdkBuilder.http2Enabled(http2Enabled)
    }

    /** @param idleTimeout The load balancer idle timeout, in seconds. */
    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    /** @param internetFacing Whether the load balancer has an internet-routable address. */
    public fun internetFacing(internetFacing: Boolean) {
        cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param ipAddressType The type of IP addresses to use. Only applies to application load
     *   balancers.
     */
    public fun ipAddressType(ipAddressType: IpAddressType) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /** @param loadBalancerName Name of the load balancer. */
    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /** @param securityGroup Security group to associate with this load balancer. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param vpc The VPC network to place the load balancer in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets Which subnets place the load balancer in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Which subnets place the load balancer in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ApplicationLoadBalancerProps = cdkBuilder.build()
}
