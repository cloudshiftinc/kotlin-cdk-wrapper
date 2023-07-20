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

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun tempDirectory(tempDirectory: CfnJob.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnJob.DatabaseTableOutputOptionsProperty = cdkBuilder.build()
}
