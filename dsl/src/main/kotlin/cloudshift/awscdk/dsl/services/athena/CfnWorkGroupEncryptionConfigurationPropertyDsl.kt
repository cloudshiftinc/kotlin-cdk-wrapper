@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.EncryptionConfigurationProperty.Builder =
      CfnWorkGroup.EncryptionConfigurationProperty.builder()

  public fun encryptionOption(encryptionOption: String) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnWorkGroup.EncryptionConfigurationProperty = cdkBuilder.build()
}
