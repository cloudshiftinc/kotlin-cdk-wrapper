@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectS3LogsConfigPropertyDsl {
  private val cdkBuilder: CfnProject.S3LogsConfigProperty.Builder =
      CfnProject.S3LogsConfigProperty.builder()

  public fun encryptionDisabled(encryptionDisabled: Boolean) {
    cdkBuilder.encryptionDisabled(encryptionDisabled)
  }

  public fun encryptionDisabled(encryptionDisabled: IResolvable) {
    cdkBuilder.encryptionDisabled(encryptionDisabled)
  }

  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnProject.S3LogsConfigProperty = cdkBuilder.build()
}
