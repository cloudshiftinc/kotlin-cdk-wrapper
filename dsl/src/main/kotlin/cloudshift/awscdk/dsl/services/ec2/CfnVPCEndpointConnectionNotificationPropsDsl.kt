@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps

@CdkDslMarker
public class CfnVPCEndpointConnectionNotificationPropsDsl {
  private val cdkBuilder: CfnVPCEndpointConnectionNotificationProps.Builder =
      CfnVPCEndpointConnectionNotificationProps.builder()

  private val _connectionEvents: MutableList<String> = mutableListOf()

  /**
   * @param connectionEvents The endpoint events for which to receive notifications. 
   * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
   */
  public fun connectionEvents(vararg connectionEvents: String) {
    _connectionEvents.addAll(listOf(*connectionEvents))
  }

  /**
   * @param connectionEvents The endpoint events for which to receive notifications. 
   * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
   */
  public fun connectionEvents(connectionEvents: Collection<String>) {
    _connectionEvents.addAll(connectionEvents)
  }

  /**
   * @param connectionNotificationArn The ARN of the SNS topic for the notifications. 
   */
  public fun connectionNotificationArn(connectionNotificationArn: String) {
    cdkBuilder.connectionNotificationArn(connectionNotificationArn)
  }

  /**
   * @param serviceId The ID of the endpoint service.
   */
  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  /**
   * @param vpcEndpointId The ID of the endpoint.
   */
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  public fun build(): CfnVPCEndpointConnectionNotificationProps {
    if(_connectionEvents.isNotEmpty()) cdkBuilder.connectionEvents(_connectionEvents)
    return cdkBuilder.build()
  }
}
