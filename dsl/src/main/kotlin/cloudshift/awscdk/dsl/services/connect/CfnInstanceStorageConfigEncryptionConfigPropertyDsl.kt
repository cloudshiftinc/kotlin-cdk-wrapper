@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@CdkDslMarker
public class CfnInstanceStorageConfigEncryptionConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.EncryptionConfigProperty.Builder =
      CfnInstanceStorageConfig.EncryptionConfigProperty.builder()

  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  public fun keyId(keyId: String) {
    cdkBuilder.keyId(keyId)
  }

  public fun build(): CfnInstanceStorageConfig.EncryptionConfigProperty = cdkBuilder.build()
}
