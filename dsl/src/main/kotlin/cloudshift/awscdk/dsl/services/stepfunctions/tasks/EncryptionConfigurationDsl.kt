@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption

@CdkDslMarker
public class EncryptionConfigurationDsl {
  private val cdkBuilder: EncryptionConfiguration.Builder = EncryptionConfiguration.builder()

  /**
   * @param encryptionKey KMS key ARN or ID.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param encryptionOption Type of S3 server-side encryption enabled. 
   */
  public fun encryptionOption(encryptionOption: EncryptionOption) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  public fun build(): EncryptionConfiguration = cdkBuilder.build()
}
