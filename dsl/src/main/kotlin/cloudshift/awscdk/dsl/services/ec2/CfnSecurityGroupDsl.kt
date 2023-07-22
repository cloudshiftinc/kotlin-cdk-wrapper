@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnSecurityGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityGroup.Builder = CfnSecurityGroup.Builder.create(scope, id)

  private val _securityGroupEgress: MutableList<Any> = mutableListOf()

  private val _securityGroupIngress: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
  public fun groupDescription(groupDescription: String) {
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
  public fun groupName(groupName: String) {
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
  public fun securityGroupEgress(vararg securityGroupEgress: Any) {
    _securityGroupEgress.addAll(listOf(*securityGroupEgress))
  }

  /**
   * The outbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
   * @param securityGroupEgress The outbound rules associated with the security group. 
   */
  public fun securityGroupEgress(securityGroupEgress: Collection<Any>) {
    _securityGroupEgress.addAll(securityGroupEgress)
  }

  /**
   * The outbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupegress)
   * @param securityGroupEgress The outbound rules associated with the security group. 
   */
  public fun securityGroupEgress(securityGroupEgress: IResolvable) {
    cdkBuilder.securityGroupEgress(securityGroupEgress)
  }

  /**
   * The inbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
   * @param securityGroupIngress The inbound rules associated with the security group. 
   */
  public fun securityGroupIngress(vararg securityGroupIngress: Any) {
    _securityGroupIngress.addAll(listOf(*securityGroupIngress))
  }

  /**
   * The inbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
   * @param securityGroupIngress The inbound rules associated with the security group. 
   */
  public fun securityGroupIngress(securityGroupIngress: Collection<Any>) {
    _securityGroupIngress.addAll(securityGroupIngress)
  }

  /**
   * The inbound rules associated with the security group.
   *
   * There is a short interruption during which you cannot connect to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-securitygroupingress)
   * @param securityGroupIngress The inbound rules associated with the security group. 
   */
  public fun securityGroupIngress(securityGroupIngress: IResolvable) {
    cdkBuilder.securityGroupIngress(securityGroupIngress)
  }

  /**
   * Any tags assigned to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
   * @param tags Any tags assigned to the security group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Any tags assigned to the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-tags)
   * @param tags Any tags assigned to the security group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the VPC for the security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroup.html#cfn-ec2-securitygroup-vpcid)
   * @param vpcId The ID of the VPC for the security group. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnSecurityGroup {
    if(_securityGroupEgress.isNotEmpty()) cdkBuilder.securityGroupEgress(_securityGroupEgress)
    if(_securityGroupIngress.isNotEmpty()) cdkBuilder.securityGroupIngress(_securityGroupIngress)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
