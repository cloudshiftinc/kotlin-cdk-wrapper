@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnStorageSystem

@CdkDslMarker
public class CfnStorageSystemServerConfigurationPropertyDsl {
  private val cdkBuilder: CfnStorageSystem.ServerConfigurationProperty.Builder =
      CfnStorageSystem.ServerConfigurationProperty.builder()

  public fun serverHostname(serverHostname: String) {
    cdkBuilder.serverHostname(serverHostname)
  }

  public fun serverPort(serverPort: Number) {
    cdkBuilder.serverPort(serverPort)
  }

  public fun build(): CfnStorageSystem.ServerConfigurationProperty = cdkBuilder.build()
}
