@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupEndpointDetailsPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder =
      CfnDataflowEndpointGroup.EndpointDetailsProperty.builder()

  public fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable) {
    cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
  }

  public
      fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty) {
    cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint)
  }

  public fun endpoint(endpoint: IResolvable) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun endpoint(endpoint: CfnDataflowEndpointGroup.DataflowEndpointProperty) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun securityDetails(securityDetails: IResolvable) {
    cdkBuilder.securityDetails(securityDetails)
  }

  public fun securityDetails(securityDetails: CfnDataflowEndpointGroup.SecurityDetailsProperty) {
    cdkBuilder.securityDetails(securityDetails)
  }

  public fun build(): CfnDataflowEndpointGroup.EndpointDetailsProperty = cdkBuilder.build()
}
