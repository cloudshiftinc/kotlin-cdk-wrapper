@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

@CdkDslMarker
public class CfnEndpointPrimaryPropertyDsl {
  private val cdkBuilder: CfnEndpoint.PrimaryProperty.Builder =
      CfnEndpoint.PrimaryProperty.builder()

  /**
   * @param healthCheck The ARN of the health check used by the endpoint to determine whether
   * failover is triggered. 
   */
  public fun healthCheck(healthCheck: String) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun build(): CfnEndpoint.PrimaryProperty = cdkBuilder.build()
}
