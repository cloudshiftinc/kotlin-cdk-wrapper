@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps

@CdkDslMarker
public class CfnTablePropsDsl {
  private val cdkBuilder: CfnTableProps.Builder = CfnTableProps.builder()

  /**
   * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of the database where the table metadata resides. 
   * For Hive compatibility, this must be all lowercase.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: IResolvable) {
    cdkBuilder.tableInput(tableInput)
  }

  /**
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: CfnTable.TableInputProperty) {
    cdkBuilder.tableInput(tableInput)
  }

  public fun build(): CfnTableProps = cdkBuilder.build()
}
