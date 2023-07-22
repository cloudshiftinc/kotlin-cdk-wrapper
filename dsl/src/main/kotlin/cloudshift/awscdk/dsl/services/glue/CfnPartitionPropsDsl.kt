@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps

@CdkDslMarker
public class CfnPartitionPropsDsl {
  private val cdkBuilder: CfnPartitionProps.Builder = CfnPartitionProps.builder()

  /**
   * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId`
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of the catalog database in which to create the partition. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param partitionInput The structure used to create and update a partition. 
   */
  public fun partitionInput(partitionInput: IResolvable) {
    cdkBuilder.partitionInput(partitionInput)
  }

  /**
   * @param partitionInput The structure used to create and update a partition. 
   */
  public fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty) {
    cdkBuilder.partitionInput(partitionInput)
  }

  /**
   * @param tableName The name of the metadata table in which the partition is to be created. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnPartitionProps = cdkBuilder.build()
}
