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
import software.amazon.awscdk.services.apigatewayv2.VpcLinkProps
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Properties for a VpcLink.
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
public class VpcLinkPropsDsl {
    private val cdkBuilder: VpcLinkProps.Builder = VpcLinkProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param securityGroups A list of security groups for the VPC link. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups A list of security groups for the VPC link. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param subnets A list of subnets for the VPC link. */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /** @param subnets A list of subnets for the VPC link. */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    /** @param vpc The VPC in which the private resources reside. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcLinkName The name used to label and identify the VPC link. */
    public fun vpcLinkName(vpcLinkName: String) {
        cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): VpcLinkProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
