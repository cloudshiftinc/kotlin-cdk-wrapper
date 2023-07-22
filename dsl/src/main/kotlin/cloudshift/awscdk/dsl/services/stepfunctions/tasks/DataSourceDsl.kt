@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DataSource
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource

@CdkDslMarker
public class DataSourceDsl {
  private val cdkBuilder: DataSource.Builder = DataSource.builder()

  /**
   * @param s3DataSource S3 location of the data source that is associated with a channel. 
   */
  public fun s3DataSource(s3DataSource: S3DataSourceDsl.() -> Unit = {}) {
    val builder = S3DataSourceDsl()
    builder.apply(s3DataSource)
    cdkBuilder.s3DataSource(builder.build())
  }

  /**
   * @param s3DataSource S3 location of the data source that is associated with a channel. 
   */
  public fun s3DataSource(s3DataSource: S3DataSource) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  public fun build(): DataSource = cdkBuilder.build()
}
