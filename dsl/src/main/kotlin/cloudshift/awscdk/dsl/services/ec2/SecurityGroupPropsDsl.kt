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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SecurityGroupProps

/**
 * Example:
 * ```
 * Vpc vpc;
 * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
 * .vpc(vpc)
 * .build();
 * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
 * .vpc(vpc)
 * .build();
 * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .securityGroup(sg1)
 * .build();
 * launchTemplate.addSecurityGroup(sg2);
 * ```
 */
@CdkDslMarker
public class SecurityGroupPropsDsl {
    private val cdkBuilder: SecurityGroupProps.Builder = SecurityGroupProps.builder()

    /**
     * @param allowAllIpv6Outbound Whether to allow all outbound ipv6 traffic by default. If this is
     *   set to true, there will only be a single egress rule which allows all outbound ipv6
     *   traffic. If this is set to false, no outbound traffic will be allowed by default and all
     *   egress ipv6 traffic must be explicitly authorized.
     *
     * To allow all ipv4 traffic use allowAllOutbound
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
        cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * @param allowAllOutbound Whether to allow all outbound traffic by default. If this is set to
     *   true, there will only be a single egress rule which allows all outbound traffic. If this is
     *   set to false, no outbound traffic will be allowed by default and all egress traffic must be
     *   explicitly authorized.
     *
     * To allow all ipv6 traffic use allowAllIpv6Outbound
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /** @param description A description of the security group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param disableInlineRules Whether to disable inline ingress and egress rule optimization. If
     *   this is set to true, ingress and egress rules will not be declared under the SecurityGroup
     *   in cloudformation, but will be separate elements.
     *
     * Inlining rules is an optimization for producing smaller stack templates. Sometimes this is
     * not desirable, for example when security group access is managed via tags.
     *
     * The default value can be overriden globally by setting the context variable
     * '&#64;aws-cdk/aws-ec2.securityGroupDisableInlineRules'.
     */
    public fun disableInlineRules(disableInlineRules: Boolean) {
        cdkBuilder.disableInlineRules(disableInlineRules)
    }

    /**
     * @param securityGroupName The name of the security group. For valid values, see the GroupName
     *   parameter of the CreateSecurityGroup action in the Amazon EC2 API Reference.
     *
     * It is not recommended to use an explicit group name.
     */
    public fun securityGroupName(securityGroupName: String) {
        cdkBuilder.securityGroupName(securityGroupName)
    }

    /** @param vpc The VPC in which to create the security group. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): SecurityGroupProps = cdkBuilder.build()
}
