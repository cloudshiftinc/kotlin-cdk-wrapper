@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.VpcLookupOptions

@CdkDslMarker
public class VpcLookupOptionsDsl {
  private val cdkBuilder: VpcLookupOptions.Builder = VpcLookupOptions.builder()

  /**
   * @param isDefault Whether to match the default VPC.
   */
  public fun isDefault(isDefault: Boolean) {
    cdkBuilder.isDefault(isDefault)
  }

  /**
   * @param ownerAccountId The ID of the AWS account that owns the VPC.
   */
  public fun ownerAccountId(ownerAccountId: String) {
    cdkBuilder.ownerAccountId(ownerAccountId)
  }

  /**
   * @param region Optional to override inferred region.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param returnVpnGateways Whether to look up whether a VPN Gateway is attached to the looked up
   * VPC.
   * You can set this to `false` if you know the VPC does not have a VPN Gateway
   * attached, in order to avoid an API call.
   *
   * If you change this property from `false` to `true` or undefined, you may
   * need to clear the corresponding context entry in `cdk.context.json` in
   * order to trigger a new lookup.
   */
  public fun returnVpnGateways(returnVpnGateways: Boolean) {
    cdkBuilder.returnVpnGateways(returnVpnGateways)
  }

  /**
   * @param subnetGroupNameTag Optional tag for subnet group name.
   * If not provided, we'll look at the aws-cdk:subnet-name tag.
   * If the subnet does not have the specified tag,
   * we'll use its type as the name.
   */
  public fun subnetGroupNameTag(subnetGroupNameTag: String) {
    cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
  }

  /**
   * @param tags Tags on the VPC.
   * The VPC must have all of these tags
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param vpcId The ID of the VPC.
   * If given, will import exactly this VPC.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  /**
   * @param vpcName The name of the VPC.
   * If given, will import the VPC with this name.
   */
  public fun vpcName(vpcName: String) {
    cdkBuilder.vpcName(vpcName)
  }

  public fun build(): VpcLookupOptions = cdkBuilder.build()
}
