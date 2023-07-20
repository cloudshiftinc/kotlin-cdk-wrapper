@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AuthorizationConfig
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration

@CdkDslMarker
public class EfsVolumeConfigurationDsl {
  private val cdkBuilder: EfsVolumeConfiguration.Builder = EfsVolumeConfiguration.builder()

  public fun authorizationConfig(block: AuthorizationConfigDsl.() -> Unit = {}) {
    val builder = AuthorizationConfigDsl()
    builder.apply(block)
    cdkBuilder.authorizationConfig(builder.build())
  }

  public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
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

  public fun build(): EfsVolumeConfiguration = cdkBuilder.build()
}
