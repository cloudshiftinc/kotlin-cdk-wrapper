@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder =
      CfnTaskDefinition.EFSVolumeConfigurationProperty.builder()

  public fun authorizationConfig(authorizationConfig: IResolvable) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public
      fun authorizationConfig(authorizationConfig: CfnTaskDefinition.AuthorizationConfigProperty) {
    cdkBuilder.authorizationConfig(authorizationConfig)
  }

  public fun filesystemId(filesystemId: String) {
    cdkBuilder.filesystemId(filesystemId)
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

  public fun build(): CfnTaskDefinition.EFSVolumeConfigurationProperty = cdkBuilder.build()
}
