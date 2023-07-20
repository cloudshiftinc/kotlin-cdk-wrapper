@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEksContainerEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder =
      CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJobDefinition.EksContainerEnvironmentVariableProperty = cdkBuilder.build()
}
