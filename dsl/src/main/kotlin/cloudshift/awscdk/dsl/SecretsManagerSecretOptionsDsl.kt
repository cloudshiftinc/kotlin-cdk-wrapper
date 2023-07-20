@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretsManagerSecretOptions

@CdkDslMarker
public class SecretsManagerSecretOptionsDsl {
  private val cdkBuilder: SecretsManagerSecretOptions.Builder =
      SecretsManagerSecretOptions.builder()

  public fun jsonField(jsonField: String) {
    cdkBuilder.jsonField(jsonField)
  }

  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun versionStage(versionStage: String) {
    cdkBuilder.versionStage(versionStage)
  }

  public fun build(): SecretsManagerSecretOptions = cdkBuilder.build()
}
