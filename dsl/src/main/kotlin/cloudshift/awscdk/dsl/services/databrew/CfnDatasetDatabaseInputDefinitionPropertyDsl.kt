@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetDatabaseInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnDataset.DatabaseInputDefinitionProperty.Builder =
      CfnDataset.DatabaseInputDefinitionProperty.builder()

  /**
   * @param databaseTableName The table within the target database.
   */
  public fun databaseTableName(databaseTableName: String) {
    cdkBuilder.databaseTableName(databaseTableName)
  }

  /**
   * @param glueConnectionName The AWS Glue Connection that stores the connection information for
   * the target database. 
   */
  public fun glueConnectionName(glueConnectionName: String) {
    cdkBuilder.glueConnectionName(glueConnectionName)
  }

  /**
   * @param queryString Custom SQL to run against the provided AWS Glue connection.
   * This SQL will be used as the input for DataBrew projects and jobs.
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
   * directory.
   */
  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  /**
   * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
   * directory.
   */
  public fun tempDirectory(tempDirectory: CfnDataset.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnDataset.DatabaseInputDefinitionProperty = cdkBuilder.build()
}
