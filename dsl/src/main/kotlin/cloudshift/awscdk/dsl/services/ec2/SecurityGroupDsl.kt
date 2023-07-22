@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.constructs.Construct

/**
 * Creates an Amazon EC2 security group within a VPC.
 *
 * Security Groups act like a firewall with a set of rules, and are associated
 * with any AWS resource that has or creates Elastic Network Interfaces (ENIs).
 * A typical example of a resource that has a security group is an Instance (or
 * Auto Scaling Group of instances)
 *
 * If you are defining new infrastructure in CDK, there is a good chance you
 * won't have to interact with this class at all. Like IAM Roles, Security
 * Groups need to exist to control access between AWS resources, but CDK will
 * automatically generate and populate them with least-privilege permissions
 * for you so you can concentrate on your business logic.
 *
 * All Constructs that require Security Groups will create one for you if you
 * don't specify one at construction. After construction, you can selectively
 * allow connections to and between constructs via--for example-- the `instance.connections`
 * object. Think of it as "allowing connections to your instance", rather than
 * "adding ingress rules a security group". See the <a
 * href="https://docs.aws.amazon.com/cdk/api/latest/docs/aws-cdk-lib.aws_ec2-readme.html#allowing-connections">Allowing
 * Connections</a>
 * section in the library documentation for examples.
 *
 * Direct manipulation of the Security Group through `addIngressRule` and
 * `addEgressRule` is possible, but mutation through the `.connections` object
 * is recommended. If you peer two constructs with security groups this way,
 * appropriate rules will be created in both.
 *
 * If you have an existing security group you want to use in your CDK application,
 * you would import it like this:
 *
 * ```
 * ISecurityGroup securityGroup = SecurityGroup.fromSecurityGroupId(this, "SG", "sg-12345",
 * SecurityGroupImportOptions.builder()
 * .mutable(false)
 * .build());
 * ```
 *
 * Example:
 *
 * ```
 * SecurityGroup mySecurityGroupWithoutInlineRules = SecurityGroup.Builder.create(this,
 * "SecurityGroup")
 * .vpc(vpc)
 * .description("Allow ssh access to ec2 instances")
 * .allowAllOutbound(true)
 * .disableInlineRules(true)
 * .build();
 * //This will add the rule as an external cloud formation construct
 * mySecurityGroupWithoutInlineRules.addIngressRule(Peer.anyIpv4(), Port.tcp(22), "allow ssh access
 * from the world");
 * ```
 */
@CdkDslMarker
public class SecurityGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SecurityGroup.Builder = SecurityGroup.Builder.create(scope, id)

  /**
   * Whether to allow all outbound ipv6 traffic by default.
   *
   * If this is set to true, there will only be a single egress rule which allows all
   * outbound ipv6 traffic. If this is set to false, no outbound traffic will be allowed by
   * default and all egress ipv6 traffic must be explicitly authorized.
   *
   * To allow all ipv4 traffic use allowAllOutbound
   *
   * Default: false
   *
   * @param allowAllIpv6Outbound Whether to allow all outbound ipv6 traffic by default. 
   */
  public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
    cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
  }

  /**
   * Whether to allow all outbound traffic by default.
   *
   * If this is set to true, there will only be a single egress rule which allows all
   * outbound traffic. If this is set to false, no outbound traffic will be allowed by
   * default and all egress traffic must be explicitly authorized.
   *
   * To allow all ipv6 traffic use allowAllIpv6Outbound
   *
   * Default: true
   *
   * @param allowAllOutbound Whether to allow all outbound traffic by default. 
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  /**
   * A description of the security group.
   *
   * Default: The default name will be the construct's CDK path.
   *
   * @param description A description of the security group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Whether to disable inline ingress and egress rule optimization.
   *
   * If this is set to true, ingress and egress rules will not be declared under the
   * SecurityGroup in cloudformation, but will be separate elements.
   *
   * Inlining rules is an optimization for producing smaller stack templates. Sometimes
   * this is not desirable, for example when security group access is managed via tags.
   *
   * The default value can be overriden globally by setting the context variable
   * '&#64;aws-cdk/aws-ec2.securityGroupDisableInlineRules'.
   *
   * Default: false
   *
   * @param disableInlineRules Whether to disable inline ingress and egress rule optimization. 
   */
  public fun disableInlineRules(disableInlineRules: Boolean) {
    cdkBuilder.disableInlineRules(disableInlineRules)
  }

  /**
   * The name of the security group.
   *
   * For valid values, see the GroupName
   * parameter of the CreateSecurityGroup action in the Amazon EC2 API
   * Reference.
   *
   * It is not recommended to use an explicit group name.
   *
   * Default: If you don't specify a GroupName, AWS CloudFormation generates a
   * unique physical ID and uses that ID for the group name.
   *
   * @param securityGroupName The name of the security group. 
   */
  public fun securityGroupName(securityGroupName: String) {
    cdkBuilder.securityGroupName(securityGroupName)
  }

  /**
   * The VPC in which to create the security group.
   *
   * @param vpc The VPC in which to create the security group. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): SecurityGroup = cdkBuilder.build()
}
