@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableColumnPropertyDsl {
  private val cdkBuilder: CfnTable.ColumnProperty.Builder = CfnTable.ColumnProperty.builder()

  /**
   * @param columnName The name of the column. 
   * For more information, see
   * [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
   * in the *Amazon Keyspaces Developer Guide* .
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param columnType The data type of the column. 
   * For more information, see [Data
   * types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types) in
   * the *Amazon Keyspaces Developer Guide* .
   */
  public fun columnType(columnType: String) {
    cdkBuilder.columnType(columnType)
  }

  public fun build(): CfnTable.ColumnProperty = cdkBuilder.build()
}
