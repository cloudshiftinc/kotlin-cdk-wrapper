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
import software.amazon.awscdk.services.ec2.CfnIPAM
import software.constructs.Construct

/**
 * IPAM is a VPC feature that you can use to automate your IP address management workflows including
 * assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts
 * throughout your AWS Organization.
 *
 * For more information, see [What is
 * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
 * User Guide* .
 *
 * There are AWS Identity and Access Management (IAM) permissions required to fully manage an IPAM
 * in CloudFormation. For more information, see [Example
 * policy](https://docs.aws.amazon.com//vpc/latest/ipam/iam-ipam-policy-examples.html) in the *Amazon
 * VPC IPAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAM cfnIPAM = CfnIPAM.Builder.create(this, "MyCfnIPAM")
 * .defaultResourceDiscoveryAssociationId("defaultResourceDiscoveryAssociationId")
 * .defaultResourceDiscoveryId("defaultResourceDiscoveryId")
 * .description("description")
 * .operatingRegions(List.of(IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html)
 */
@CdkDslMarker
public class CfnIPAMDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIPAM.Builder = CfnIPAM.Builder.create(scope, id)

  private val _operatingRegions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The IPAM's default resource discovery association ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryassociationid)
   * @param defaultResourceDiscoveryAssociationId The IPAM's default resource discovery association
   * ID. 
   */
  public fun defaultResourceDiscoveryAssociationId(defaultResourceDiscoveryAssociationId: String) {
    cdkBuilder.defaultResourceDiscoveryAssociationId(defaultResourceDiscoveryAssociationId)
  }

  /**
   * The IPAM's default resource discovery ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-defaultresourcediscoveryid)
   * @param defaultResourceDiscoveryId The IPAM's default resource discovery ID. 
   */
  public fun defaultResourceDiscoveryId(defaultResourceDiscoveryId: String) {
    cdkBuilder.defaultResourceDiscoveryId(defaultResourceDiscoveryId)
  }

  /**
   * The description for the IPAM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-description)
   * @param description The description for the IPAM. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The operating Regions for an IPAM.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * For more information about operating Regions, see [Create an
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
   * @param operatingRegions The operating Regions for an IPAM. 
   */
  public fun operatingRegions(vararg operatingRegions: Any) {
    _operatingRegions.addAll(listOf(*operatingRegions))
  }

  /**
   * The operating Regions for an IPAM.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * For more information about operating Regions, see [Create an
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
   * @param operatingRegions The operating Regions for an IPAM. 
   */
  public fun operatingRegions(operatingRegions: Collection<Any>) {
    _operatingRegions.addAll(operatingRegions)
  }

  /**
   * The operating Regions for an IPAM.
   *
   * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM
   * only discovers and monitors resources in the AWS Regions you select as operating Regions.
   *
   * For more information about operating Regions, see [Create an
   * IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon VPC IPAM User
   * Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-operatingregions)
   * @param operatingRegions The operating Regions for an IPAM. 
   */
  public fun operatingRegions(operatingRegions: IResolvable) {
    cdkBuilder.operatingRegions(operatingRegions)
  }

  /**
   * The key/value combination of a tag assigned to the resource.
   *
   * Use the tag key in the filter name and the tag value as the filter value. For example, to find
   * all resources that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for
   * the filter name and `TeamA` for the filter value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
   * @param tags The key/value combination of a tag assigned to the resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The key/value combination of a tag assigned to the resource.
   *
   * Use the tag key in the filter name and the tag value as the filter value. For example, to find
   * all resources that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for
   * the filter name and `TeamA` for the filter value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipam.html#cfn-ec2-ipam-tags)
   * @param tags The key/value combination of a tag assigned to the resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIPAM {
    if(_operatingRegions.isNotEmpty()) cdkBuilder.operatingRegions(_operatingRegions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
