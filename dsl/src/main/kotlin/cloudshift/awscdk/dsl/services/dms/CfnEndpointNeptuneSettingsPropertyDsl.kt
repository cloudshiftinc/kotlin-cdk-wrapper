@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines an Amazon Neptune endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about the available settings,
 * see [Specifying endpoint settings for Amazon Neptune as a
 * target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.EndpointSettings)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * NeptuneSettingsProperty neptuneSettingsProperty = NeptuneSettingsProperty.builder()
 * .errorRetryDuration(123)
 * .iamAuthEnabled(false)
 * .maxFileSize(123)
 * .maxRetryCount(123)
 * .s3BucketFolder("s3BucketFolder")
 * .s3BucketName("s3BucketName")
 * .serviceAccessRoleArn("serviceAccessRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html)
 */
@CdkDslMarker
public class CfnEndpointNeptuneSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.NeptuneSettingsProperty.Builder =
      CfnEndpoint.NeptuneSettingsProperty.builder()

  /**
   * @param errorRetryDuration The number of milliseconds for AWS DMS to wait to retry a bulk-load
   * of migrated graph data to the Neptune target database before raising an error.
   * The default is 250.
   */
  public fun errorRetryDuration(errorRetryDuration: Number) {
    cdkBuilder.errorRetryDuration(errorRetryDuration)
  }

  /**
   * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
   * parameter to `true` .
   * Then attach the appropriate IAM policy document to your service role specified by
   * `ServiceAccessRoleArn` . The default is `false` .
   */
  public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * @param iamAuthEnabled If you want IAM authorization enabled for this endpoint, set this
   * parameter to `true` .
   * Then attach the appropriate IAM policy document to your service role specified by
   * `ServiceAccessRoleArn` . The default is `false` .
   */
  public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
    cdkBuilder.iamAuthEnabled(iamAuthEnabled)
  }

  /**
   * @param maxFileSize The maximum size in kilobytes of migrated graph data stored in a .csv file
   * before AWS DMS bulk-loads the data to the Neptune target database. The default is 1,048,576 KB. If
   * the bulk load is successful, AWS DMS clears the bucket, ready to store the next batch of migrated
   * graph data.
   */
  public fun maxFileSize(maxFileSize: Number) {
    cdkBuilder.maxFileSize(maxFileSize)
  }

  /**
   * @param maxRetryCount The number of times for AWS DMS to retry a bulk load of migrated graph
   * data to the Neptune target database before raising an error.
   * The default is 5.
   */
  public fun maxRetryCount(maxRetryCount: Number) {
    cdkBuilder.maxRetryCount(maxRetryCount)
  }

  /**
   * @param s3BucketFolder A folder path where you want AWS DMS to store migrated graph data in the
   * S3 bucket specified by `S3BucketName`.
   */
  public fun s3BucketFolder(s3BucketFolder: String) {
    cdkBuilder.s3BucketFolder(s3BucketFolder)
  }

  /**
   * @param s3BucketName The name of the Amazon S3 bucket where AWS DMS can temporarily store
   * migrated graph data in .csv files before bulk-loading it to the Neptune target database. AWS DMS
   * maps the SQL source data to graph data before storing it in these .csv files.
   */
  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  /**
   * @param serviceAccessRoleArn The Amazon Resource Name (ARN) of the service role that you created
   * for the Neptune target endpoint.
   * The role must allow the `iam:PassRole` action.
   *
   * For more information, see [Creating an IAM Service Role for Accessing Amazon Neptune as a
   * Target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole)
   * in the *AWS Database Migration Service User Guide* .
   */
  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun build(): CfnEndpoint.NeptuneSettingsProperty = cdkBuilder.build()
}
