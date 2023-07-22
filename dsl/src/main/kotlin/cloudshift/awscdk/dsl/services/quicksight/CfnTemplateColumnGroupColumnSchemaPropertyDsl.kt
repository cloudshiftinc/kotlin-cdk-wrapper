@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnGroupColumnSchemaPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnGroupColumnSchemaProperty.Builder =
      CfnTemplate.ColumnGroupColumnSchemaProperty.builder()

  /**
   * @param name The name of the column group's column schema.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.ColumnGroupColumnSchemaProperty = cdkBuilder.build()
}
