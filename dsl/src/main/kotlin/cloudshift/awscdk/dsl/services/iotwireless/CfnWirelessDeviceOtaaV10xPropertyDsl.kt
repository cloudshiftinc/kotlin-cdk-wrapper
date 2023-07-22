@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceOtaaV10xPropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.OtaaV10xProperty.Builder =
      CfnWirelessDevice.OtaaV10xProperty.builder()

  /**
   * @param appEui The AppEUI value, with pattern of `[a-fA-F0-9]{16}` . 
   */
  public fun appEui(appEui: String) {
    cdkBuilder.appEui(appEui)
  }

  /**
   * @param appKey The AppKey is a secret key, which you should handle in a similar way as you would
   * an application password. 
   * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
   * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
   * to reference this value.
   */
  public fun appKey(appKey: String) {
    cdkBuilder.appKey(appKey)
  }

  public fun build(): CfnWirelessDevice.OtaaV10xProperty = cdkBuilder.build()
}
