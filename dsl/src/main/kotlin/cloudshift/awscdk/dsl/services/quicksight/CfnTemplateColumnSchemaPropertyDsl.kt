@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnSchemaPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnSchemaProperty.Builder =
      CfnTemplate.ColumnSchemaProperty.builder()

  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  public fun geographicRole(geographicRole: String) {
    cdkBuilder.geographicRole(geographicRole)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.ColumnSchemaProperty = cdkBuilder.build()
}
