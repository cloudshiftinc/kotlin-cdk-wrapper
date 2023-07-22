@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery

@CdkDslMarker
public class HostedZoneContextQueryDsl {
  private val cdkBuilder: HostedZoneContextQuery.Builder = HostedZoneContextQuery.builder()

  /**
   * @param account Query account. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param domainName The domain name e.g. example.com to lookup. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
   */
  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  /**
   * @param privateZone True if the zone you want to find is a private hosted zone.
   */
  public fun privateZone(privateZone: Boolean) {
    cdkBuilder.privateZone(privateZone)
  }

  /**
   * @param region Query region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param vpcId The VPC ID to that the private zone must be associated with.
   * If you provide VPC ID and privateZone is false, this will return no results
   * and raise an error.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): HostedZoneContextQuery = cdkBuilder.build()
}
