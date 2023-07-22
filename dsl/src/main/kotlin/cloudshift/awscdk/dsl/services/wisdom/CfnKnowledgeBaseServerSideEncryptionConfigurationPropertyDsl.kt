@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@CdkDslMarker
public class CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder =
      CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder()

  /**
   * @param kmsKeyId The KMS key .
   * For information about valid ID values, see [Key identifiers
   * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
   * Key Management Service Developer Guide* .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty =
      cdkBuilder.build()
}
