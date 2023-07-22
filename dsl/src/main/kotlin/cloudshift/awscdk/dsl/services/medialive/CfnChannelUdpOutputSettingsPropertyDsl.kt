@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelUdpOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.UdpOutputSettingsProperty.Builder =
      CfnChannel.UdpOutputSettingsProperty.builder()

  /**
   * @param bufferMsec The UDP output buffering in milliseconds.
   * Larger values increase latency through the transcoder but simultaneously assist the transcoder
   * in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input
   * switching, input disruptions, picture reordering, and so on.
   */
  public fun bufferMsec(bufferMsec: Number) {
    cdkBuilder.bufferMsec(bufferMsec)
  }

  /**
   * @param containerSettings The settings for the UDP output.
   */
  public fun containerSettings(containerSettings: IResolvable) {
    cdkBuilder.containerSettings(containerSettings)
  }

  /**
   * @param containerSettings The settings for the UDP output.
   */
  public fun containerSettings(containerSettings: CfnChannel.UdpContainerSettingsProperty) {
    cdkBuilder.containerSettings(containerSettings)
  }

  /**
   * @param destination The destination address and port number for RTP or UDP packets.
   * These can be unicast or multicast RTP or UDP (for example, rtp://239.10.10.10:5001 or
   * udp://10.100.100.100:5002).
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination The destination address and port number for RTP or UDP packets.
   * These can be unicast or multicast RTP or UDP (for example, rtp://239.10.10.10:5001 or
   * udp://10.100.100.100:5002).
   */
  public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param fecOutputSettings The settings for enabling and adjusting Forward Error Correction on
   * UDP outputs.
   */
  public fun fecOutputSettings(fecOutputSettings: IResolvable) {
    cdkBuilder.fecOutputSettings(fecOutputSettings)
  }

  /**
   * @param fecOutputSettings The settings for enabling and adjusting Forward Error Correction on
   * UDP outputs.
   */
  public fun fecOutputSettings(fecOutputSettings: CfnChannel.FecOutputSettingsProperty) {
    cdkBuilder.fecOutputSettings(fecOutputSettings)
  }

  public fun build(): CfnChannel.UdpOutputSettingsProperty = cdkBuilder.build()
}
