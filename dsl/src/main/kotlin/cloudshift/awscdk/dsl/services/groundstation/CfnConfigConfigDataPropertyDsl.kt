@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig

@CdkDslMarker
public class CfnConfigConfigDataPropertyDsl {
  private val cdkBuilder: CfnConfig.ConfigDataProperty.Builder =
      CfnConfig.ConfigDataProperty.builder()

  public fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable) {
    cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig)
  }

  public fun antennaDownlinkConfig(antennaDownlinkConfig: CfnConfig.AntennaDownlinkConfigProperty) {
    cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig)
  }

  public fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable) {
    cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig)
  }

  public
      fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: CfnConfig.AntennaDownlinkDemodDecodeConfigProperty) {
    cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig)
  }

  public fun antennaUplinkConfig(antennaUplinkConfig: IResolvable) {
    cdkBuilder.antennaUplinkConfig(antennaUplinkConfig)
  }

  public fun antennaUplinkConfig(antennaUplinkConfig: CfnConfig.AntennaUplinkConfigProperty) {
    cdkBuilder.antennaUplinkConfig(antennaUplinkConfig)
  }

  public fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable) {
    cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig)
  }

  public
      fun dataflowEndpointConfig(dataflowEndpointConfig: CfnConfig.DataflowEndpointConfigProperty) {
    cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig)
  }

  public fun s3RecordingConfig(s3RecordingConfig: IResolvable) {
    cdkBuilder.s3RecordingConfig(s3RecordingConfig)
  }

  public fun s3RecordingConfig(s3RecordingConfig: CfnConfig.S3RecordingConfigProperty) {
    cdkBuilder.s3RecordingConfig(s3RecordingConfig)
  }

  public fun trackingConfig(trackingConfig: IResolvable) {
    cdkBuilder.trackingConfig(trackingConfig)
  }

  public fun trackingConfig(trackingConfig: CfnConfig.TrackingConfigProperty) {
    cdkBuilder.trackingConfig(trackingConfig)
  }

  public fun uplinkEchoConfig(uplinkEchoConfig: IResolvable) {
    cdkBuilder.uplinkEchoConfig(uplinkEchoConfig)
  }

  public fun uplinkEchoConfig(uplinkEchoConfig: CfnConfig.UplinkEchoConfigProperty) {
    cdkBuilder.uplinkEchoConfig(uplinkEchoConfig)
  }

  public fun build(): CfnConfig.ConfigDataProperty = cdkBuilder.build()
}
