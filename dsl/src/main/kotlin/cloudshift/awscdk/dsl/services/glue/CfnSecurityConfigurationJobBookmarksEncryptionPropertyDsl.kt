@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@CdkDslMarker
public class CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl {
  private val cdkBuilder: CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder =
      CfnSecurityConfiguration.JobBookmarksEncryptionProperty.builder()

  public fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String) {
    cdkBuilder.jobBookmarksEncryptionMode(jobBookmarksEncryptionMode)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnSecurityConfiguration.JobBookmarksEncryptionProperty = cdkBuilder.build()
}
