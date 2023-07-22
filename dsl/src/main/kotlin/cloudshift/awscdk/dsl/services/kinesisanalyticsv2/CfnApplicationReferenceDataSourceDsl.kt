@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationReferenceDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationReferenceDataSource.Builder =
      CfnApplicationReferenceDataSource.Builder.create(scope, id)

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
   * @param applicationName The name of the application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
   * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
   * reference data source by providing the source information (Amazon S3 bucket name and object key
   * name), the resulting in-application table name that is created, and the necessary schema to map
   * the data elements in the Amazon S3 object to the in-application table. 
   */
  public fun referenceDataSource(referenceDataSource: IResolvable) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
   * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
   * reference data source by providing the source information (Amazon S3 bucket name and object key
   * name), the resulting in-application table name that is created, and the necessary schema to map
   * the data elements in the Amazon S3 object to the in-application table. 
   */
  public
      fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public fun build(): CfnApplicationReferenceDataSource = cdkBuilder.build()
}
