@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.SecretVersionInfo

@CdkDslMarker
public class SecretVersionInfoDsl {
  private val cdkBuilder: SecretVersionInfo.Builder = SecretVersionInfo.builder()

  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun versionStage(versionStage: String) {
    cdkBuilder.versionStage(versionStage)
  }

  public fun build(): SecretVersionInfo = cdkBuilder.build()
}
