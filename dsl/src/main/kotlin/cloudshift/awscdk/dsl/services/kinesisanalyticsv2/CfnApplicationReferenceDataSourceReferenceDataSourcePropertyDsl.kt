@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder =
      CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.builder()

  public fun referenceSchema(referenceSchema: IResolvable) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  public
      fun referenceSchema(referenceSchema: CfnApplicationReferenceDataSource.ReferenceSchemaProperty) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  public
      fun s3ReferenceDataSource(s3ReferenceDataSource: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnApplicationReferenceDataSource.ReferenceDataSourceProperty =
      cdkBuilder.build()
}
