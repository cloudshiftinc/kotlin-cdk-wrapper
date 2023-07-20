@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery

@CdkDslMarker
public class HostedZoneContextQueryDsl {
  private val cdkBuilder: HostedZoneContextQuery.Builder = HostedZoneContextQuery.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  public fun privateZone(privateZone: Boolean) {
    cdkBuilder.privateZone(privateZone)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): HostedZoneContextQuery = cdkBuilder.build()
}
