@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition

@CdkDslMarker
public class CfnLoggerDefinitionLoggerPropertyDsl {
  private val cdkBuilder: CfnLoggerDefinition.LoggerProperty.Builder =
      CfnLoggerDefinition.LoggerProperty.builder()

  public fun component(component: String) {
    cdkBuilder.component(component)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun level(level: String) {
    cdkBuilder.level(level)
  }

  public fun space(space: Number) {
    cdkBuilder.space(space)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLoggerDefinition.LoggerProperty = cdkBuilder.build()
}
