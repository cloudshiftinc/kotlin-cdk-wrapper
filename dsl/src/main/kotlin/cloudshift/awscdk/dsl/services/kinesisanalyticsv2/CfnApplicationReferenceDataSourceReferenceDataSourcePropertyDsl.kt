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

  /**
   * @param referenceSchema Describes the format of the data in the streaming source, and how each
   * data element maps to corresponding columns created in the in-application stream. 
   */
  public fun referenceSchema(referenceSchema: IResolvable) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  /**
   * @param referenceSchema Describes the format of the data in the streaming source, and how each
   * data element maps to corresponding columns created in the in-application stream. 
   */
  public
      fun referenceSchema(referenceSchema: CfnApplicationReferenceDataSource.ReferenceSchemaProperty) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  /**
   * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the reference
   * data.
   * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
   * call the
   * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_UpdateApplication.html)
   * operation to trigger reloading of data into your application.
   */
  public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  /**
   * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the reference
   * data.
   * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
   * call the
   * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_UpdateApplication.html)
   * operation to trigger reloading of data into your application.
   */
  public
      fun s3ReferenceDataSource(s3ReferenceDataSource: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  /**
   * @param tableName The name of the in-application table to create.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnApplicationReferenceDataSource.ReferenceDataSourceProperty =
      cdkBuilder.build()
}
