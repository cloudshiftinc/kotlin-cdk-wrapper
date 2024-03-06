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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.VpcLink
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct

/**
 * Define a new VPC Link Specifies an API Gateway VPC link for a HTTP API to access resources in an
 * Amazon Virtual Private Cloud (VPC).
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * ApplicationLoadBalancer alb = ApplicationLoadBalancer.Builder.create(this,
 * "AppLoadBalancer").vpc(vpc).build();
 * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
 * // Creating an HTTP ALB Integration:
 * HttpAlbIntegration albIntegration = HttpAlbIntegration.Builder.create("ALBIntegration",
 * alb.getListeners()[0]).build();
 * ```
 */
@CdkDslMarker
public class VpcLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VpcLink.Builder = VpcLink.Builder.create(scope, id)

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * A list of security groups for the VPC link.
     *
     * Default: - no security groups. Use `addSecurityGroups` to add security groups
     *
     * @param securityGroups A list of security groups for the VPC link.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /**
     * A list of subnets for the VPC link.
     *
     * Default: - private subnets of the provided VPC. Use `addSubnets` to add more subnets
     *
     * @param subnets A list of subnets for the VPC link.
     */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    /**
     * The VPC in which the private resources reside.
     *
     * @param vpc The VPC in which the private resources reside.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     *
     * @param vpcLinkName The name used to label and identify the VPC link.
     */
    public fun vpcLinkName(vpcLinkName: String) {
        cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): VpcLink {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
