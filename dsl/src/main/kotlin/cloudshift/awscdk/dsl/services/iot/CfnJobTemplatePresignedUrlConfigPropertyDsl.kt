@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplatePresignedUrlConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.PresignedUrlConfigProperty.Builder =
      CfnJobTemplate.PresignedUrlConfigProperty.builder()

  public fun expiresInSec(expiresInSec: Number) {
    cdkBuilder.expiresInSec(expiresInSec)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnJobTemplate.PresignedUrlConfigProperty = cdkBuilder.build()
}
