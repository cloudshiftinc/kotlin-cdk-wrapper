@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery

@CdkDslMarker
public class EndpointServiceAvailabilityZonesContextQueryDsl {
  private val cdkBuilder: EndpointServiceAvailabilityZonesContextQuery.Builder =
      EndpointServiceAvailabilityZonesContextQuery.builder()

  /**
   * @param account Query account. 
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
   */
  public fun lookupRoleArn(lookupRoleArn: String) {
    cdkBuilder.lookupRoleArn(lookupRoleArn)
  }

  /**
   * @param region Query region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param serviceName Query service name. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): EndpointServiceAvailabilityZonesContextQuery = cdkBuilder.build()
}
