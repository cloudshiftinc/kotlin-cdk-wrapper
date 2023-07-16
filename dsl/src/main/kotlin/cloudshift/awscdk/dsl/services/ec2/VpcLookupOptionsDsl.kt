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

  public fun isDefault(isDefault: Boolean) {
    cdkBuilder.isDefault(isDefault)
  }

  public fun ownerAccountId(ownerAccountId: String) {
    cdkBuilder.ownerAccountId(ownerAccountId)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun returnVpnGateways(returnVpnGateways: Boolean) {
    cdkBuilder.returnVpnGateways(returnVpnGateways)
  }

  public fun subnetGroupNameTag(subnetGroupNameTag: String) {
    cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun vpcName(vpcName: String) {
    cdkBuilder.vpcName(vpcName)
  }

  public fun build(): VpcLookupOptions = cdkBuilder.build()
}
