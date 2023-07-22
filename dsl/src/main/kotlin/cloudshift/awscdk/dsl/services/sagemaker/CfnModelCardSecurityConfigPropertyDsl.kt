@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardSecurityConfigPropertyDsl {
  private val cdkBuilder: CfnModelCard.SecurityConfigProperty.Builder =
      CfnModelCard.SecurityConfigProperty.builder()

  /**
   * @param kmsKeyId A AWS Key Management Service [key
   * ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id) used to
   * encrypt a model card.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnModelCard.SecurityConfigProperty = cdkBuilder.build()
}
