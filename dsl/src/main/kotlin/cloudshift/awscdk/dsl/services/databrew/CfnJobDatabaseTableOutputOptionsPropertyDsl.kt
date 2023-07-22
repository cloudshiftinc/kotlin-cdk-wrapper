@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobDatabaseTableOutputOptionsPropertyDsl {
  private val cdkBuilder: CfnJob.DatabaseTableOutputOptionsProperty.Builder =
      CfnJob.DatabaseTableOutputOptionsProperty.builder()

  /**
   * @param tableName A prefix for the name of a table DataBrew will create in the database. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
   * DataBrew can store intermediate results.
   */
  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  /**
   * @param tempDirectory Represents an Amazon S3 location (bucket name and object key) where
   * DataBrew can store intermediate results.
   */
  public fun tempDirectory(tempDirectory: CfnJob.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnJob.DatabaseTableOutputOptionsProperty = cdkBuilder.build()
}
