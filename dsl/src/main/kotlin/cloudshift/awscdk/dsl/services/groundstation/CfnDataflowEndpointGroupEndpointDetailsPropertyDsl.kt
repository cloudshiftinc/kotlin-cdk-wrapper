@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupEndpointDetailsPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder =
      CfnDataflowEndpointGroup.EndpointDetailsProperty.builder()

  /**
   * @param awsGroundStationAgentEndpoint the value to be set.
   */
  public fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable) {
    cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
  }

  /**
   * @param awsGroundStationAgentEndpoint the value to be set.
   */
  public
      fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty) {
    cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
  }

  /**
   * @param endpoint Information about the endpoint such as name and the endpoint address.
   */
  public fun endpoint(endpoint: IResolvable) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param endpoint Information about the endpoint such as name and the endpoint address.
   */
  public fun endpoint(endpoint: CfnDataflowEndpointGroup.DataflowEndpointProperty) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param securityDetails The role ARN, and IDs for security groups and subnets.
   */
  public fun securityDetails(securityDetails: IResolvable) {
    cdkBuilder.securityDetails(securityDetails)
  }

  /**
   * @param securityDetails The role ARN, and IDs for security groups and subnets.
   */
  public fun securityDetails(securityDetails: CfnDataflowEndpointGroup.SecurityDetailsProperty) {
    cdkBuilder.securityDetails(securityDetails)
  }

  public fun build(): CfnDataflowEndpointGroup.EndpointDetailsProperty = cdkBuilder.build()
}
