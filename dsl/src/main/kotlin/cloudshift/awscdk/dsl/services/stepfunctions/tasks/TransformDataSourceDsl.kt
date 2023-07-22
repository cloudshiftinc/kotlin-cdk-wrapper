@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

@CdkDslMarker
public class TransformDataSourceDsl {
  private val cdkBuilder: TransformDataSource.Builder = TransformDataSource.builder()

  /**
   * @param s3DataSource S3 location of the input data. 
   */
  public fun s3DataSource(s3DataSource: TransformS3DataSourceDsl.() -> Unit = {}) {
    val builder = TransformS3DataSourceDsl()
    builder.apply(s3DataSource)
    cdkBuilder.s3DataSource(builder.build())
  }

  /**
   * @param s3DataSource S3 location of the input data. 
   */
  public fun s3DataSource(s3DataSource: TransformS3DataSource) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  public fun build(): TransformDataSource = cdkBuilder.build()
}
