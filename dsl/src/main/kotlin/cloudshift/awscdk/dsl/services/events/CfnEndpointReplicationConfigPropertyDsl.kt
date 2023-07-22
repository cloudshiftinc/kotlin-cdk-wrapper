@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

@CdkDslMarker
public class CfnEndpointReplicationConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.ReplicationConfigProperty.Builder =
      CfnEndpoint.ReplicationConfigProperty.builder()

  /**
   * @param state The state of event replication. 
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnEndpoint.ReplicationConfigProperty = cdkBuilder.build()
}
