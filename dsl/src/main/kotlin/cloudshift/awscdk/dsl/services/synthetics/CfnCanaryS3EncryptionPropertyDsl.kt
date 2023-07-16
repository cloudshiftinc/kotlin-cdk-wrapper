@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryS3EncryptionPropertyDsl {
  private val cdkBuilder: CfnCanary.S3EncryptionProperty.Builder =
      CfnCanary.S3EncryptionProperty.builder()

  public fun encryptionMode(encryptionMode: String) {
    cdkBuilder.encryptionMode(encryptionMode)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnCanary.S3EncryptionProperty = cdkBuilder.build()
}
