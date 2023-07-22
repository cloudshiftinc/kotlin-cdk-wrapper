@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The column schema.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnSchemaProperty columnSchemaProperty = ColumnSchemaProperty.builder()
 * .dataType("dataType")
 * .geographicRole("geographicRole")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-columnschema.html)
 */
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
