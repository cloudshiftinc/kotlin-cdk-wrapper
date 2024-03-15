@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Vpc vpc;
 * SecurityGroup securityGroup1 = SecurityGroup.Builder.create(this,
 * "SecurityGroup1").vpc(vpc).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .securityGroup(securityGroup1)
 * .build();
 * SecurityGroup securityGroup2 = SecurityGroup.Builder.create(this,
 * "SecurityGroup2").vpc(vpc).build();
 * lb.addSecurityGroup(securityGroup2);
 * ```
 */
public interface SecurityGroupProps {
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
   */
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

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
   */
  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  /**
   * A description of the security group.
   *
   * Default: The default name will be the construct's CDK path.
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun disableInlineRules(): Boolean? = unwrap(this).getDisableInlineRules()

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
   */
  public fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

  /**
   * The VPC in which to create the security group.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [SecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllIpv6Outbound Whether to allow all outbound ipv6 traffic by default.
     * If this is set to true, there will only be a single egress rule which allows all
     * outbound ipv6 traffic. If this is set to false, no outbound traffic will be allowed by
     * default and all egress ipv6 traffic must be explicitly authorized.
     *
     * To allow all ipv4 traffic use allowAllOutbound
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    /**
     * @param allowAllOutbound Whether to allow all outbound traffic by default.
     * If this is set to true, there will only be a single egress rule which allows all
     * outbound traffic. If this is set to false, no outbound traffic will be allowed by
     * default and all egress traffic must be explicitly authorized.
     *
     * To allow all ipv6 traffic use allowAllIpv6Outbound
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param description A description of the security group.
     */
    public fun description(description: String)

    /**
     * @param disableInlineRules Whether to disable inline ingress and egress rule optimization.
     * If this is set to true, ingress and egress rules will not be declared under the
     * SecurityGroup in cloudformation, but will be separate elements.
     *
     * Inlining rules is an optimization for producing smaller stack templates. Sometimes
     * this is not desirable, for example when security group access is managed via tags.
     *
     * The default value can be overriden globally by setting the context variable
     * '&#64;aws-cdk/aws-ec2.securityGroupDisableInlineRules'.
     */
    public fun disableInlineRules(disableInlineRules: Boolean)

    /**
     * @param securityGroupName The name of the security group.
     * For valid values, see the GroupName
     * parameter of the CreateSecurityGroup action in the Amazon EC2 API
     * Reference.
     *
     * It is not recommended to use an explicit group name.
     */
    public fun securityGroupName(securityGroupName: String)

    /**
     * @param vpc The VPC in which to create the security group. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroupProps.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroupProps.builder()

    /**
     * @param allowAllIpv6Outbound Whether to allow all outbound ipv6 traffic by default.
     * If this is set to true, there will only be a single egress rule which allows all
     * outbound ipv6 traffic. If this is set to false, no outbound traffic will be allowed by
     * default and all egress ipv6 traffic must be explicitly authorized.
     *
     * To allow all ipv4 traffic use allowAllOutbound
     */
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * @param allowAllOutbound Whether to allow all outbound traffic by default.
     * If this is set to true, there will only be a single egress rule which allows all
     * outbound traffic. If this is set to false, no outbound traffic will be allowed by
     * default and all egress traffic must be explicitly authorized.
     *
     * To allow all ipv6 traffic use allowAllIpv6Outbound
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param description A description of the security group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableInlineRules Whether to disable inline ingress and egress rule optimization.
     * If this is set to true, ingress and egress rules will not be declared under the
     * SecurityGroup in cloudformation, but will be separate elements.
     *
     * Inlining rules is an optimization for producing smaller stack templates. Sometimes
     * this is not desirable, for example when security group access is managed via tags.
     *
     * The default value can be overriden globally by setting the context variable
     * '&#64;aws-cdk/aws-ec2.securityGroupDisableInlineRules'.
     */
    override fun disableInlineRules(disableInlineRules: Boolean) {
      cdkBuilder.disableInlineRules(disableInlineRules)
    }

    /**
     * @param securityGroupName The name of the security group.
     * For valid values, see the GroupName
     * parameter of the CreateSecurityGroup action in the Amazon EC2 API
     * Reference.
     *
     * It is not recommended to use an explicit group name.
     */
    override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    /**
     * @param vpc The VPC in which to create the security group. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupProps,
  ) : CdkObject(cdkObject), SecurityGroupProps {
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
     */
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

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
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * A description of the security group.
     *
     * Default: The default name will be the construct's CDK path.
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun disableInlineRules(): Boolean? = unwrap(this).getDisableInlineRules()

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
     */
    override fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

    /**
     * The VPC in which to create the security group.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupProps):
        SecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupProps):
        software.amazon.awscdk.services.ec2.SecurityGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SecurityGroupProps
  }
}
