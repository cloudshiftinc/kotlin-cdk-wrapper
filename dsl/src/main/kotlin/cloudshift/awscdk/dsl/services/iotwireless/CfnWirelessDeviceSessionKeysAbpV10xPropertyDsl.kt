@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder =
      CfnWirelessDevice.SessionKeysAbpV10xProperty.builder()

  /**
   * @param appSKey The AppSKey is a secret key, which you should handle in a similar way as you
   * would an application password. 
   * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
   * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
   * to reference this value.
   */
  public fun appSKey(appSKey: String) {
    cdkBuilder.appSKey(appSKey)
  }

  /**
   * @param nwkSKey The NwkSKey is a secret key, which you should handle in a similar way as you
   * would an application password. 
   * You can protect the NwkSKey value by storing it in the AWS Secrets Manager and use the
   * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
   * to reference this value.
   */
  public fun nwkSKey(nwkSKey: String) {
    cdkBuilder.nwkSKey(nwkSKey)
  }

  public fun build(): CfnWirelessDevice.SessionKeysAbpV10xProperty = cdkBuilder.build()
}
