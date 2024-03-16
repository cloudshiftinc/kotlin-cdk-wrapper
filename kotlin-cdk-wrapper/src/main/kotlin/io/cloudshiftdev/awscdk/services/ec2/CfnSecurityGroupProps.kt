@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroupProps cfnSecurityGroupProps = CfnSecurityGroupProps.builder()
 * .groupDescription("groupDescription")
 * // the properties below are optional
 * .groupName("groupName")
 * .securityGroupEgress(List.of(EgressProperty.builder()
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .destinationPrefixListId("destinationPrefixListId")
 * .destinationSecurityGroupId("destinationSecurityGroupId")
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .securityGroupIngress(List.of(IngressProperty.builder()
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .fromPort(123)
 * .sourcePrefixListId("sourcePrefixListId")
 * .sourceSecurityGroupId("sourceSecurityGroupId")
 * .sourceSecurityGroupName("sourceSecurityGroupName")
 * .sourceSecurityGroupOwnerId("sourceSecurityGroupOwnerId")
 * .toPort(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html)
 */
public interface CfnSecurityGroupProps {
  /**
   * A description for the security group.
   *
   * Constraints: Up to 255 characters in length
   *
   * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupdescription)
   */
  public fun groupDescription(): String

  /**
   * The name of the security group.
   *
   * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
   *
   * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupname)
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The outbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
   */
  public fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

  /**
   * The inbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
   */
  public fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

  /**
   * Any tags assigned to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC for the security group.
   *
   * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
   * no specified VPC and no default VPC, security group creation fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [CfnSecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupDescription A description for the security group. 
     * Constraints: Up to 255 characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    public fun groupDescription(groupDescription: String)

    /**
     * @param groupName The name of the security group.
     * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    public fun groupName(groupName: String)

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(securityGroupEgress: IResolvable)

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(securityGroupEgress: List<Any>)

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupEgress(vararg securityGroupEgress: Any)

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(securityGroupIngress: IResolvable)

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(securityGroupIngress: List<Any>)

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    public fun securityGroupIngress(vararg securityGroupIngress: Any)

    /**
     * @param tags Any tags assigned to the security group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the security group.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the VPC for the security group.
     * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
     * no specified VPC and no default VPC, security group creation fails.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupProps.builder()

    /**
     * @param groupDescription A description for the security group. 
     * Constraints: Up to 255 characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * @param groupName The name of the security group.
     * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupEgress(securityGroupEgress: IResolvable) {
      cdkBuilder.securityGroupEgress(securityGroupEgress.let(IResolvable::unwrap))
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupEgress(securityGroupEgress: List<Any>) {
      cdkBuilder.securityGroupEgress(securityGroupEgress)
    }

    /**
     * @param securityGroupEgress The outbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupEgress(vararg securityGroupEgress: Any): Unit =
        securityGroupEgress(securityGroupEgress.toList())

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupIngress(securityGroupIngress: IResolvable) {
      cdkBuilder.securityGroupIngress(securityGroupIngress.let(IResolvable::unwrap))
    }

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupIngress(securityGroupIngress: List<Any>) {
      cdkBuilder.securityGroupIngress(securityGroupIngress)
    }

    /**
     * @param securityGroupIngress The inbound rules associated with the security group.
     * There is a short interruption during which you cannot connect to the security group.
     */
    override fun securityGroupIngress(vararg securityGroupIngress: Any): Unit =
        securityGroupIngress(securityGroupIngress.toList())

    /**
     * @param tags Any tags assigned to the security group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the security group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the VPC for the security group.
     * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
     * no specified VPC and no default VPC, security group creation fails.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupProps {
    /**
     * A description for the security group.
     *
     * Constraints: Up to 255 characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupdescription)
     */
    override fun groupDescription(): String = unwrap(this).getGroupDescription()

    /**
     * The name of the security group.
     *
     * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupname)
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     */
    override fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     */
    override fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

    /**
     * Any tags assigned to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC for the security group.
     *
     * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
     * no specified VPC and no default VPC, security group creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps):
        CfnSecurityGroupProps = CdkObjectWrappers.wrap(cdkObject) as CfnSecurityGroupProps

    internal fun unwrap(wrapped: CfnSecurityGroupProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
  }
}
