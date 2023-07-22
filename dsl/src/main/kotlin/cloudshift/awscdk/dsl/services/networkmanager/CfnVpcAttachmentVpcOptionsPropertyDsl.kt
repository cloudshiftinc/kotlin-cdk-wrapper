@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

@CdkDslMarker
public class CfnVpcAttachmentVpcOptionsPropertyDsl {
  private val cdkBuilder: CfnVpcAttachment.VpcOptionsProperty.Builder =
      CfnVpcAttachment.VpcOptionsProperty.builder()

  /**
   * @param applianceModeSupport Indicates whether appliance mode is supported.
   * If enabled, traffic flow between a source and destination use the same Availability Zone for
   * the VPC attachment for the lifetime of that flow. The default value is `false` .
   */
  public fun applianceModeSupport(applianceModeSupport: Boolean) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  /**
   * @param applianceModeSupport Indicates whether appliance mode is supported.
   * If enabled, traffic flow between a source and destination use the same Availability Zone for
   * the VPC attachment for the lifetime of that flow. The default value is `false` .
   */
  public fun applianceModeSupport(applianceModeSupport: IResolvable) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  /**
   * @param ipv6Support Indicates whether IPv6 is supported.
   */
  public fun ipv6Support(ipv6Support: Boolean) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  /**
   * @param ipv6Support Indicates whether IPv6 is supported.
   */
  public fun ipv6Support(ipv6Support: IResolvable) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  public fun build(): CfnVpcAttachment.VpcOptionsProperty = cdkBuilder.build()
}
