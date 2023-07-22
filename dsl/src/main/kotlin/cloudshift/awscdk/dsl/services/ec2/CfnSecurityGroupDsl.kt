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
