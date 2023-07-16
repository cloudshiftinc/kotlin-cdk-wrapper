@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCalculatedFieldPropertyDsl {
  private val cdkBuilder: CfnTemplate.CalculatedFieldProperty.Builder =
      CfnTemplate.CalculatedFieldProperty.builder()

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.CalculatedFieldProperty = cdkBuilder.build()
}
