@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionSecretPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.SecretProperty.Builder =
      CfnJobDefinition.SecretProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun valueFrom(valueFrom: String) {
    cdkBuilder.valueFrom(valueFrom)
  }

  public fun build(): CfnJobDefinition.SecretProperty = cdkBuilder.build()
}
