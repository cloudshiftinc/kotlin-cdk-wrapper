@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnSchemaPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnSchemaProperty.Builder =
      CfnTemplate.ColumnSchemaProperty.builder()

  /**
   * @param dataType The data type of the column schema.
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param geographicRole The geographic role of the column schema.
   */
  public fun geographicRole(geographicRole: String) {
    cdkBuilder.geographicRole(geographicRole)
  }

  /**
   * @param name The name of the column schema.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.ColumnSchemaProperty = cdkBuilder.build()
}
