@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionSecretPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.SecretProperty.Builder =
      CfnTaskDefinition.SecretProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun valueFrom(valueFrom: String) {
    cdkBuilder.valueFrom(valueFrom)
  }

  public fun build(): CfnTaskDefinition.SecretProperty = cdkBuilder.build()
}
