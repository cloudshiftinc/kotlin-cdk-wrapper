@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnAssistant

@CdkDslMarker
public class CfnAssistantServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder =
      CfnAssistant.ServerSideEncryptionConfigurationProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnAssistant.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}
