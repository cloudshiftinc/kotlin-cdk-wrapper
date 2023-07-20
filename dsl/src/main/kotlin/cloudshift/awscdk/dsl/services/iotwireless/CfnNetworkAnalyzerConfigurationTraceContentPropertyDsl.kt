@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration

@CdkDslMarker
public class CfnNetworkAnalyzerConfigurationTraceContentPropertyDsl {
  private val cdkBuilder: CfnNetworkAnalyzerConfiguration.TraceContentProperty.Builder =
      CfnNetworkAnalyzerConfiguration.TraceContentProperty.builder()

  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
    cdkBuilder.wirelessDeviceFrameInfo(wirelessDeviceFrameInfo)
  }

  public fun build(): CfnNetworkAnalyzerConfiguration.TraceContentProperty = cdkBuilder.build()
}
