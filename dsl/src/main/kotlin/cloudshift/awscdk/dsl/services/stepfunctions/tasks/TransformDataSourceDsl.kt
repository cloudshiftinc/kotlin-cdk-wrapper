@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

@CdkDslMarker
public class TransformDataSourceDsl {
  private val cdkBuilder: TransformDataSource.Builder = TransformDataSource.builder()

  public fun s3DataSource(block: TransformS3DataSourceDsl.() -> Unit = {}) {
    val builder = TransformS3DataSourceDsl()
    builder.apply(block)
    cdkBuilder.s3DataSource(builder.build())
  }

  public fun s3DataSource(s3DataSource: TransformS3DataSource) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  public fun build(): TransformDataSource = cdkBuilder.build()
}
