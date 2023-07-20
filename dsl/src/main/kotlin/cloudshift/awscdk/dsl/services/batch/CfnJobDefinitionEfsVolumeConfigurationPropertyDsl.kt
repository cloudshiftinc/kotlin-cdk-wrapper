@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEfsVolumeConfigurationPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EfsVolumeConfigurationProperty.Builder =
      CfnJobDefinition.EfsVolumeConfigurationProperty.builder()

  public fun authorizationConfig(authorizationConfig: IResolvable) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public
      fun authorizationConfig(authorizationConfig: CfnJobDefinition.AuthorizationConfigProperty) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun rootDirectory(rootDirectory: String) {
    cdkBuilder.rootDirectory(rootDirectory)
  }

  public fun transitEncryption(transitEncryption: String) {
    cdkBuilder.transitEncryption(transitEncryption)
  }

  public fun transitEncryptionPort(transitEncryptionPort: Number) {
    cdkBuilder.transitEncryptionPort(transitEncryptionPort)
  }

  public fun build(): CfnJobDefinition.EfsVolumeConfigurationProperty = cdkBuilder.build()
}
