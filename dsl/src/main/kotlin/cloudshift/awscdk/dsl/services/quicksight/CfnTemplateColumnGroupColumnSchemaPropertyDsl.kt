@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A structure describing the name, data type, and geographic role of the columns.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnGroupColumnSchemaProperty columnGroupColumnSchemaProperty =
 * ColumnGroupColumnSchemaProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-columngroupcolumnschema.html)
 */
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
