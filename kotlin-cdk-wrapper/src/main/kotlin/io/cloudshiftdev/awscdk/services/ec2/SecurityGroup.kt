@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class SecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroup,
) : Resource(cdkObject), ISecurityGroup {
  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addEgressRule(peer: IPeer, connection: Port) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
  }

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4bf89f5e640a8b7efb17409c9a88eefede4e96a9f59d45b102417c6495109e89")
  public override fun addEgressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
      addEgressRule(peer, Port(connection))

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  ) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description)
  }

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  ) {
    unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description,
        remoteRule)
  }

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addIngressRule(peer: IPeer, connection: Port) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
  }

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d409b422c545699df421c29fe3c67d472d855aa96dc063ceafcf760d3ba5c249")
  public override fun addIngressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
      addIngressRule(peer, Port(connection))

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  ) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description)
  }

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public override fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  ) {
    unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description,
        remoteRule)
  }

  /**
   * Whether the SecurityGroup has been configured to allow all outbound ipv6 traffic.
   */
  public open fun allowAllIpv6Outbound(): Boolean = unwrap(this).getAllowAllIpv6Outbound()

  /**
   * Whether the SecurityGroup has been configured to allow all outbound traffic.
   */
  public override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

  /**
   * Whether the rule can be inlined into a SecurityGroup or not.
   */
  public override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   *
   */
  public open fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  /**
   * The ID of the security group.
   */
  public override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

  /**
   * The VPC ID this security group is part of.
   */
  public open fun securityGroupVpcId(): String = unwrap(this).getSecurityGroupVpcId()

  /**
   * Produce the egress rule JSON for the given connection.
   */
  public override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

  /**
   * Produce the ingress rule JSON for the given connection.
   */
  public override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

  /**
   * A unique identifier for this connection peer.
   */
  public override fun uniqueId(): String = unwrap(this).getUniqueId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.SecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

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
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * A description of the security group.
     *
     * Default: The default name will be the construct's CDK path.
     *
     * @param description A description of the security group. 
     */
    public fun description(description: String)

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
    public fun disableInlineRules(disableInlineRules: Boolean)

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
    public fun securityGroupName(securityGroupName: String)

    /**
     * The VPC in which to create the security group.
     *
     * @param vpc The VPC in which to create the security group. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroup.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroup.Builder.create(scope, id)

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
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
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
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * A description of the security group.
     *
     * Default: The default name will be the construct's CDK path.
     *
     * @param description A description of the security group. 
     */
    override fun description(description: String) {
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
    override fun disableInlineRules(disableInlineRules: Boolean) {
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
    override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    /**
     * The VPC in which to create the security group.
     *
     * @param vpc The VPC in which to create the security group. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromLookupById(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromLookupById(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId).let(ISecurityGroup::wrap)

    public fun fromLookupByName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupName: String,
      vpc: IVpc,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromLookupByName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupName, vpc.let(IVpc::unwrap)).let(ISecurityGroup::wrap)

    public fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromSecurityGroupId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId).let(ISecurityGroup::wrap)

    public fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
      options: SecurityGroupImportOptions,
    ): ISecurityGroup =
        software.amazon.awscdk.services.ec2.SecurityGroup.fromSecurityGroupId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, securityGroupId,
        options.let(SecurityGroupImportOptions::unwrap)).let(ISecurityGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1c6c1dacaf5bb3e730a1c0404aa31a8e76593f9a43e6f9d87dabffb2d41cee7")
    public fun fromSecurityGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      securityGroupId: String,
      options: SecurityGroupImportOptions.Builder.() -> Unit,
    ): ISecurityGroup = fromSecurityGroupId(scope, id, securityGroupId,
        SecurityGroupImportOptions(options))

    public fun isSecurityGroup(x: Any): Boolean =
        software.amazon.awscdk.services.ec2.SecurityGroup.isSecurityGroup(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroup): SecurityGroup =
        SecurityGroup(cdkObject)

    internal fun unwrap(wrapped: SecurityGroup): software.amazon.awscdk.services.ec2.SecurityGroup =
        wrapped.cdkObject
  }
}
