@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties when using Amazon Redshift.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * RedshiftConnectorProfilePropertiesProperty redshiftConnectorProfilePropertiesProperty =
 * RedshiftConnectorProfilePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .clusterIdentifier("clusterIdentifier")
 * .dataApiRoleArn("dataApiRoleArn")
 * .databaseName("databaseName")
 * .databaseUrl("databaseUrl")
 * .isRedshiftServerless(false)
 * .workgroupName("workgroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.builder()

  /**
   * @param bucketName A name for the associated Amazon S3 bucket. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow places
   * the files.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param clusterIdentifier the value to be set.
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * @param dataApiRoleArn the value to be set.
   */
  public fun dataApiRoleArn(dataApiRoleArn: String) {
    cdkBuilder.dataApiRoleArn(dataApiRoleArn)
  }

  /**
   * @param databaseName the value to be set.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param databaseUrl The JDBC URL of the Amazon Redshift cluster.
   */
  public fun databaseUrl(databaseUrl: String) {
    cdkBuilder.databaseUrl(databaseUrl)
  }

  /**
   * @param isRedshiftServerless If Amazon AppFlow will connect to Amazon Redshift Serverless or
   * Amazon Redshift cluster.
   */
  public fun isRedshiftServerless(isRedshiftServerless: Boolean) {
    cdkBuilder.isRedshiftServerless(isRedshiftServerless)
  }

  /**
   * @param isRedshiftServerless If Amazon AppFlow will connect to Amazon Redshift Serverless or
   * Amazon Redshift cluster.
   */
  public fun isRedshiftServerless(isRedshiftServerless: IResolvable) {
    cdkBuilder.isRedshiftServerless(isRedshiftServerless)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only
   * access to Amazon S3. 
   * For more information, and for the polices that you attach to this role, see [Allow Amazon
   * Redshift to access your Amazon AppFlow data in Amazon
   * S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
   * .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param workgroupName the value to be set.
   */
  public fun workgroupName(workgroupName: String) {
    cdkBuilder.workgroupName(workgroupName)
  }

  public fun build(): CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
