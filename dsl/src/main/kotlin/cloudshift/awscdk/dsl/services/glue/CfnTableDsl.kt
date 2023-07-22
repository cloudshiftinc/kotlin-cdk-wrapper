@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.constructs.Construct

@CdkDslMarker
public class CfnTableDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

  /**
   * The ID of the Data Catalog in which to create the `Table` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
   * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * The name of the database where the table metadata resides.
   *
   * For Hive compatibility, this must be all lowercase.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
   * @param databaseName The name of the database where the table metadata resides. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * A structure used to define a table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: IResolvable) {
    cdkBuilder.tableInput(tableInput)
  }

  /**
   * A structure used to define a table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: CfnTable.TableInputProperty) {
    cdkBuilder.tableInput(tableInput)
  }

  public fun build(): CfnTable = cdkBuilder.build()
}
