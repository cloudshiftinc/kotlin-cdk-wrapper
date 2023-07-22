@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnStorageSystem

/**
 * The network settings that DataSync Discovery uses to connect with your on-premises storage
 * system's management interface.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * ServerConfigurationProperty serverConfigurationProperty = ServerConfigurationProperty.builder()
 * .serverHostname("serverHostname")
 * // the properties below are optional
 * .serverPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html)
 */
@CdkDslMarker
public class CfnStorageSystemServerConfigurationPropertyDsl {
  private val cdkBuilder: CfnStorageSystem.ServerConfigurationProperty.Builder =
      CfnStorageSystem.ServerConfigurationProperty.builder()

  /**
   * @param serverHostname The domain name or IP address of your storage system's management
   * interface. 
   */
  public fun serverHostname(serverHostname: String) {
    cdkBuilder.serverHostname(serverHostname)
  }

  /**
   * @param serverPort The network port for accessing the storage system's management interface.
   */
  public fun serverPort(serverPort: Number) {
    cdkBuilder.serverPort(serverPort)
  }

  public fun build(): CfnStorageSystem.ServerConfigurationProperty = cdkBuilder.build()
}
