@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

@CdkDslMarker
public class CfnTableColumnPropertyDsl {
  private val cdkBuilder: CfnTable.ColumnProperty.Builder = CfnTable.ColumnProperty.builder()

  /**
   * @param comment A free-form text comment.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param name The name of the `Column` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The data type of the `Column` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTable.ColumnProperty = cdkBuilder.build()
}
