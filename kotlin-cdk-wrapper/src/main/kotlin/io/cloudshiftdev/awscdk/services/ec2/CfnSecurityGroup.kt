@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a security group.
 *
 * To create a security group, use the
 * [VpcId](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html#cfn-ec2-securitygroup-vpcid)
 * property to specify the VPC for which to create the security group.
 *
 * If you do not specify an egress rule, we add egress rules that allow IPv4 and IPv6 traffic on all
 * ports and protocols to any destination. We do not add these rules if you specify your own egress
 * rules. If you later remove your egress rules, we restore the default egress rules.
 *
 * This type supports updates. For more information about updating stacks, see [AWS CloudFormation
 * Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 *
 * To cross-reference two security groups in the ingress and egress rules of those security groups,
 * use the
 * [AWS::EC2::SecurityGroupEgress](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html)
 * and
 * [AWS::EC2::SecurityGroupIngress](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-ingress.html)
 * resources to define your rules. Do not use the embedded ingress and egress rules in the
 * `AWS::EC2::SecurityGroup` . Doing so creates a circular dependency, which AWS CloudFormation doesn't
 * allow.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroup cfnSecurityGroup = CfnSecurityGroup.Builder.create(this, "MyCfnSecurityGroup")
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
public open class CfnSecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The group ID of the specified security group, such as `sg-94b3a1f6` .
   */
  public open fun attrGroupId(): String = unwrap(this).getAttrGroupId()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The physical ID of the VPC.
   *
   * You can obtain the physical ID by using a reference to an
   * [AWS::EC2::VPC](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
   * , such as: `{ "Ref" : "myVPC" }` .
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * A description for the security group.
   */
  public open fun groupDescription(): String = unwrap(this).getGroupDescription()

  /**
   * A description for the security group.
   */
  public open fun groupDescription(`value`: String) {
    unwrap(this).setGroupDescription(`value`)
  }

  /**
   * The name of the security group.
   */
  public open fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The name of the security group.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The outbound rules associated with the security group.
   */
  public open fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

  /**
   * The outbound rules associated with the security group.
   */
  public open fun securityGroupEgress(`value`: IResolvable) {
    unwrap(this).setSecurityGroupEgress(`value`.let(IResolvable::unwrap))
  }

  /**
   * The outbound rules associated with the security group.
   */
  public open fun securityGroupEgress(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecurityGroupEgress(__idx_ac66f0)
  }

  /**
   * The outbound rules associated with the security group.
   */
  public open fun securityGroupEgress(vararg __idx_ac66f0: Any): Unit =
      securityGroupEgress(__idx_ac66f0.toList())

  /**
   * The inbound rules associated with the security group.
   */
  public open fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

  /**
   * The inbound rules associated with the security group.
   */
  public open fun securityGroupIngress(`value`: IResolvable) {
    unwrap(this).setSecurityGroupIngress(`value`.let(IResolvable::unwrap))
  }

  /**
   * The inbound rules associated with the security group.
   */
  public open fun securityGroupIngress(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecurityGroupIngress(__idx_ac66f0)
  }

  /**
   * The inbound rules associated with the security group.
   */
  public open fun securityGroupIngress(vararg __idx_ac66f0: Any): Unit =
      securityGroupIngress(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the security group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the security group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the security group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC for the security group.
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The ID of the VPC for the security group.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the security group.
     *
     * Constraints: Up to 255 characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupdescription)
     * @param groupDescription A description for the security group. 
     */
    public fun groupDescription(groupDescription: String)

    /**
     * The name of the security group.
     *
     * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupname)
     * @param groupName The name of the security group. 
     */
    public fun groupName(groupName: String)

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    public fun securityGroupEgress(securityGroupEgress: IResolvable)

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    public fun securityGroupEgress(securityGroupEgress: List<Any>)

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    public fun securityGroupEgress(vararg securityGroupEgress: Any)

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    public fun securityGroupIngress(securityGroupIngress: IResolvable)

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    public fun securityGroupIngress(securityGroupIngress: List<Any>)

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    public fun securityGroupIngress(vararg securityGroupIngress: Any)

    /**
     * Any tags assigned to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
     * @param tags Any tags assigned to the security group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
     * @param tags Any tags assigned to the security group. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC for the security group.
     *
     * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
     * no specified VPC and no default VPC, security group creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-vpcid)
     * @param vpcId The ID of the VPC for the security group. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder.create(scope, id)

    /**
     * A description for the security group.
     *
     * Constraints: Up to 255 characters in length
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupdescription)
     * @param groupDescription A description for the security group. 
     */
    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * The name of the security group.
     *
     * Constraints: Up to 255 characters in length. Cannot start with `sg-` .
     *
     * Valid characters: a-z, A-Z, 0-9, spaces, and ._-:/()#,&#64;[]+=&amp;;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-groupname)
     * @param groupName The name of the security group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    override fun securityGroupEgress(securityGroupEgress: IResolvable) {
      cdkBuilder.securityGroupEgress(securityGroupEgress.let(IResolvable::unwrap))
    }

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    override fun securityGroupEgress(securityGroupEgress: List<Any>) {
      cdkBuilder.securityGroupEgress(securityGroupEgress)
    }

    /**
     * The outbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
     * @param securityGroupEgress The outbound rules associated with the security group. 
     */
    override fun securityGroupEgress(vararg securityGroupEgress: Any): Unit =
        securityGroupEgress(securityGroupEgress.toList())

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    override fun securityGroupIngress(securityGroupIngress: IResolvable) {
      cdkBuilder.securityGroupIngress(securityGroupIngress.let(IResolvable::unwrap))
    }

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    override fun securityGroupIngress(securityGroupIngress: List<Any>) {
      cdkBuilder.securityGroupIngress(securityGroupIngress)
    }

    /**
     * The inbound rules associated with the security group.
     *
     * There is a short interruption during which you cannot connect to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
     * @param securityGroupIngress The inbound rules associated with the security group. 
     */
    override fun securityGroupIngress(vararg securityGroupIngress: Any): Unit =
        securityGroupIngress(securityGroupIngress.toList())

    /**
     * Any tags assigned to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
     * @param tags Any tags assigned to the security group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
     * @param tags Any tags assigned to the security group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC for the security group.
     *
     * If you do not specify a VPC, the default is to use the default VPC for the Region. If there's
     * no specified VPC and no default VPC, security group creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-vpcid)
     * @param vpcId The ID of the VPC for the security group. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup):
        CfnSecurityGroup = CfnSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroup):
        software.amazon.awscdk.services.ec2.CfnSecurityGroup = wrapped.cdkObject
  }

  /**
   * Adds an inbound (ingress) rule to a security group.
   *
   * An inbound rule permits instances to receive traffic from the specified IPv4 or IPv6 address
   * range, the IP address ranges that are specified by a prefix list, or the instances that are
   * associated with a source security group. For more information, see [Security group
   * rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html) .
   *
   * You must specify exactly one of the following sources: an IPv4 or IPv6 address range, a prefix
   * list, or a security group. Otherwise, the stack launches successfully, but the rule is not added
   * to the security group.
   *
   * You must specify a protocol for each rule (for example, TCP). If the protocol is TCP or UDP,
   * you must also specify a port or port range. If the protocol is ICMP or ICMPv6, you must also
   * specify the ICMP/ICMPv6 type and code.
   *
   * Rule changes are propagated to instances associated with the security group as quickly as
   * possible. However, a small delay might occur.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IngressProperty ingressProperty = IngressProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html)
   */
  public interface IngressProperty {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-cidrip)
     */
    public fun cidrIp(): String? = unwrap(this).getCidrIp()

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId` )
     * or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-cidripv6)
     */
    public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    /**
     * Updates the description of an ingress (inbound) security group rule.
     *
     * You can replace an existing description, or add a description to a rule that did not have one
     * previously.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-fromport)
     */
    public fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ).
     *
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
     * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a
     * port range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for
     * all types and codes is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-ipprotocol)
     */
    public fun ipProtocol(): String

    /**
     * The ID of a prefix list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourceprefixlistid)
     */
    public fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

    /**
     * The ID of the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupid)
     */
    public fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

    /**
     * [Default VPC] The name of the source security group.
     *
     * You must specify either the security group ID or the security group name. You can't specify
     * the group name in combination with an IP address range. Creates rules that grant full ICMP, UDP,
     * and TCP access.
     *
     * For security groups in a nondefault VPC, you must specify the group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupname)
     */
    public fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

    /**
     * [nondefault VPC] The AWS account ID for the source security group, if the source security
     * group is in a different account.
     *
     * You can't specify this property with an IP address range. Creates rules that grant full ICMP,
     * UDP, and TCP access.
     *
     * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
     * is owned by a different account than the account creating the stack, you must specify the
     * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupownerid)
     */
    public fun sourceSecurityGroupOwnerId(): String? = unwrap(this).getSourceSecurityGroupOwnerId()

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-toport)
     */
    public fun toPort(): Number? = unwrap(this).getToPort()

    /**
     * A builder for [IngressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrIp The IPv4 address range, in CIDR format.
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun cidrIp(cidrIp: String)

      /**
       * @param cidrIpv6 The IPv6 address range, in CIDR format.
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun cidrIpv6(cidrIpv6: String)

      /**
       * @param description Updates the description of an ingress (inbound) security group rule.
       * You can replace an existing description, or add a description to a rule that did not have
       * one previously.
       *
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       */
      public fun description(description: String)

      /**
       * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
       * [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ). 
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       */
      public fun ipProtocol(ipProtocol: String)

      /**
       * @param sourcePrefixListId The ID of a prefix list.
       */
      public fun sourcePrefixListId(sourcePrefixListId: String)

      /**
       * @param sourceSecurityGroupId The ID of the security group.
       */
      public fun sourceSecurityGroupId(sourceSecurityGroupId: String)

      /**
       * @param sourceSecurityGroupName [Default VPC] The name of the source security group.
       * You must specify either the security group ID or the security group name. You can't specify
       * the group name in combination with an IP address range. Creates rules that grant full ICMP,
       * UDP, and TCP access.
       *
       * For security groups in a nondefault VPC, you must specify the group ID.
       */
      public fun sourceSecurityGroupName(sourceSecurityGroupName: String)

      /**
       * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source
       * security group, if the source security group is in a different account.
       * You can't specify this property with an IP address range. Creates rules that grant full
       * ICMP, UDP, and TCP access.
       *
       * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
       * is owned by a different account than the account creating the stack, you must specify the
       * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
       */
      public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String)

      /**
       * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty.builder()

      /**
       * @param cidrIp The IPv4 address range, in CIDR format.
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
      }

      /**
       * @param cidrIpv6 The IPv6 address range, in CIDR format.
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
      }

      /**
       * @param description Updates the description of an ingress (inbound) security group rule.
       * You can replace an existing description, or add a description to a rule that did not have
       * one previously.
       *
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
       * [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ). 
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       */
      override fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
      }

      /**
       * @param sourcePrefixListId The ID of a prefix list.
       */
      override fun sourcePrefixListId(sourcePrefixListId: String) {
        cdkBuilder.sourcePrefixListId(sourcePrefixListId)
      }

      /**
       * @param sourceSecurityGroupId The ID of the security group.
       */
      override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
        cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
      }

      /**
       * @param sourceSecurityGroupName [Default VPC] The name of the source security group.
       * You must specify either the security group ID or the security group name. You can't specify
       * the group name in combination with an IP address range. Creates rules that grant full ICMP,
       * UDP, and TCP access.
       *
       * For security groups in a nondefault VPC, you must specify the group ID.
       */
      override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
        cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
      }

      /**
       * @param sourceSecurityGroupOwnerId [nondefault VPC] The AWS account ID for the source
       * security group, if the source security group is in a different account.
       * You can't specify this property with an IP address range. Creates rules that grant full
       * ICMP, UDP, and TCP access.
       *
       * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
       * is owned by a different account than the account creating the stack, you must specify the
       * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
       */
      override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
        cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
      }

      /**
       * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty,
    ) : CdkObject(cdkObject), IngressProperty {
      /**
       * The IPv4 address range, in CIDR format.
       *
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-cidrip)
       */
      override fun cidrIp(): String? = unwrap(this).getCidrIp()

      /**
       * The IPv6 address range, in CIDR format.
       *
       * You must specify a source security group ( `SourcePrefixListId` or `SourceSecurityGroupId`
       * ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-cidripv6)
       */
      override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

      /**
       * Updates the description of an ingress (inbound) security group rule.
       *
       * You can replace an existing description, or add a description to a rule that did not have
       * one previously.
       *
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * If the protocol is TCP or UDP, this is the start of the port range.
       *
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-fromport)
       */
      override fun fromPort(): Number? = unwrap(this).getFromPort()

      /**
       * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ).
       *
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-ipprotocol)
       */
      override fun ipProtocol(): String = unwrap(this).getIpProtocol()

      /**
       * The ID of a prefix list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourceprefixlistid)
       */
      override fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

      /**
       * The ID of the security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupid)
       */
      override fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

      /**
       * [Default VPC] The name of the source security group.
       *
       * You must specify either the security group ID or the security group name. You can't specify
       * the group name in combination with an IP address range. Creates rules that grant full ICMP,
       * UDP, and TCP access.
       *
       * For security groups in a nondefault VPC, you must specify the group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupname)
       */
      override fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

      /**
       * [nondefault VPC] The AWS account ID for the source security group, if the source security
       * group is in a different account.
       *
       * You can't specify this property with an IP address range. Creates rules that grant full
       * ICMP, UDP, and TCP access.
       *
       * If you specify `SourceSecurityGroupName` or `SourceSecurityGroupId` and that security group
       * is owned by a different account than the account creating the stack, you must specify the
       * `SourceSecurityGroupOwnerId` ; otherwise, this property is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-sourcesecuritygroupownerid)
       */
      override fun sourceSecurityGroupOwnerId(): String? =
          unwrap(this).getSourceSecurityGroupOwnerId()

      /**
       * If the protocol is TCP or UDP, this is the end of the port range.
       *
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-ingress.html#cfn-ec2-securitygroup-ingress-toport)
       */
      override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty):
          IngressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressProperty):
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty
    }
  }

  /**
   * Adds the specified outbound (egress) rule to a security group.
   *
   * An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 address range,
   * the IP address ranges that are specified by a prefix list, or the instances that are associated
   * with a destination security group. For more information, see [Security group
   * rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html) .
   *
   * You must specify exactly one of the following destinations: an IPv4 or IPv6 address range, a
   * prefix list, or a security group. Otherwise, the stack launches successfully but the rule is not
   * added to the security group.
   *
   * You must specify a protocol for each rule (for example, TCP). If the protocol is TCP or UDP,
   * you must also specify a port or port range. If the protocol is ICMP or ICMPv6, you must also
   * specify the ICMP/ICMPv6 type and code.
   *
   * Rule changes are propagated to instances associated with the security group as quickly as
   * possible. However, a small delay might occur.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EgressProperty egressProperty = EgressProperty.builder()
   * .ipProtocol("ipProtocol")
   * // the properties below are optional
   * .cidrIp("cidrIp")
   * .cidrIpv6("cidrIpv6")
   * .description("description")
   * .destinationPrefixListId("destinationPrefixListId")
   * .destinationSecurityGroupId("destinationSecurityGroupId")
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html)
   */
  public interface EgressProperty {
    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-cidrip)
     */
    public fun cidrIp(): String? = unwrap(this).getCidrIp()

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use
     * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-cidripv6)
     */
    public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    /**
     * A description for the security group rule.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The prefix list IDs for the destination AWS service.
     *
     * This is the AWS service that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-destinationprefixlistid)
     */
    public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    /**
     * The ID of the destination VPC security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-destinationsecuritygroupid)
     */
    public fun destinationSecurityGroupId(): String? = unwrap(this).getDestinationSecurityGroupId()

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-fromport)
     */
    public fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
     * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ).
     *
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all ports,
     * regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must specify a
     * port range. For `icmpv6` , the port range is optional; if you omit the port range, traffic for
     * all types and codes is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-ipprotocol)
     */
    public fun ipProtocol(): String

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-toport)
     */
    public fun toPort(): Number? = unwrap(this).getToPort()

    /**
     * A builder for [EgressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrIp The IPv4 address range, in CIDR format.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun cidrIp(cidrIp: String)

      /**
       * @param cidrIpv6 The IPv6 address range, in CIDR format.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun cidrIpv6(cidrIpv6: String)

      /**
       * @param description A description for the security group rule.
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       */
      public fun description(description: String)

      /**
       * @param destinationPrefixListId The prefix list IDs for the destination AWS service.
       * This is the AWS service that you want to access through a VPC endpoint from instances
       * associated with the security group.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       */
      public fun destinationPrefixListId(destinationPrefixListId: String)

      /**
       * @param destinationSecurityGroupId The ID of the destination VPC security group.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       */
      public fun destinationSecurityGroupId(destinationSecurityGroupId: String)

      /**
       * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
       * [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ). 
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       */
      public fun ipProtocol(ipProtocol: String)

      /**
       * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty.builder()

      /**
       * @param cidrIp The IPv4 address range, in CIDR format.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
      }

      /**
       * @param cidrIpv6 The IPv6 address range, in CIDR format.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
      }

      /**
       * @param description A description for the security group rule.
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param destinationPrefixListId The prefix list IDs for the destination AWS service.
       * This is the AWS service that you want to access through a VPC endpoint from instances
       * associated with the security group.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       */
      override fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
      }

      /**
       * @param destinationSecurityGroupId The ID of the destination VPC security group.
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       */
      override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
        cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
      }

      /**
       * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
       * [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ). 
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       */
      override fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
      }

      /**
       * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty,
    ) : CdkObject(cdkObject), EgressProperty {
      /**
       * The IPv4 address range, in CIDR format.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-cidrip)
       */
      override fun cidrIp(): String? = unwrap(this).getCidrIp()

      /**
       * The IPv6 address range, in CIDR format.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * For examples of rules that you can add to security groups for specific access scenarios,
       * see [Security group rules for different use
       * cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-cidripv6)
       */
      override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

      /**
       * A description for the security group rule.
       *
       * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
       * and ._-:/()#,&#64;[]+=;{}!$*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The prefix list IDs for the destination AWS service.
       *
       * This is the AWS service that you want to access through a VPC endpoint from instances
       * associated with the security group.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-destinationprefixlistid)
       */
      override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

      /**
       * The ID of the destination VPC security group.
       *
       * You must specify a destination security group ( `DestinationPrefixListId` or
       * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-destinationsecuritygroupid)
       */
      override fun destinationSecurityGroupId(): String? =
          unwrap(this).getDestinationSecurityGroupId()

      /**
       * If the protocol is TCP or UDP, this is the start of the port range.
       *
       * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-fromport)
       */
      override fun fromPort(): Number? = unwrap(this).getFromPort()

      /**
       * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see [Protocol
       * Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
       * ).
       *
       * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1`
       * or a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
       * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
       * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
       * traffic for all types and codes is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-ipprotocol)
       */
      override fun ipProtocol(): String = unwrap(this).getIpProtocol()

      /**
       * If the protocol is TCP or UDP, this is the end of the port range.
       *
       * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the
       * start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-securitygroup-egress.html#cfn-ec2-securitygroup-egress-toport)
       */
      override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EgressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty):
          EgressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressProperty):
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty
    }
  }
}
