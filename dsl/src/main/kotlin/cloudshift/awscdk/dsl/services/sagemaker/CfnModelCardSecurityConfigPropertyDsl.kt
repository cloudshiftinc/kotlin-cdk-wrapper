@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardSecurityConfigPropertyDsl {
  private val cdkBuilder: CfnModelCard.SecurityConfigProperty.Builder =
      CfnModelCard.SecurityConfigProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnModelCard.SecurityConfigProperty = cdkBuilder.build()
}
