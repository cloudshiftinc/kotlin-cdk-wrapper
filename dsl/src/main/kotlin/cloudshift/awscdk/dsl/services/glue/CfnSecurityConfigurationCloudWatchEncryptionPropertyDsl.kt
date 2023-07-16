@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@CdkDslMarker
public class CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl {
  private val cdkBuilder: CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder =
      CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder()

  public fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String) {
    cdkBuilder.cloudWatchEncryptionMode(cloudWatchEncryptionMode)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnSecurityConfiguration.CloudWatchEncryptionProperty = cdkBuilder.build()
}
