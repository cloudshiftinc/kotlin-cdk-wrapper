@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties when using Amazon Redshift.
 *
 * Example:
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

    /** @param bucketName A name for the associated Amazon S3 bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow places
     *   the files.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /** @param clusterIdentifier The unique ID that's assigned to an Amazon Redshift cluster. */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param dataApiRoleArn The Amazon Resource Name (ARN) of an IAM role that permits Amazon
     *   AppFlow to access your Amazon Redshift database through the Data API. For more information,
     *   and for the polices that you attach to this role, see
     *   [Allow Amazon AppFlow to access Amazon Redshift databases with the Data API](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift)
     *   .
     */
    public fun dataApiRoleArn(dataApiRoleArn: String) {
        cdkBuilder.dataApiRoleArn(dataApiRoleArn)
    }

    /** @param databaseName The name of an Amazon Redshift database. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param databaseUrl The JDBC URL of the Amazon Redshift cluster. */
    public fun databaseUrl(databaseUrl: String) {
        cdkBuilder.databaseUrl(databaseUrl)
    }

    /**
     * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
     *   an Amazon Redshift Serverless data warehouse.
     */
    public fun isRedshiftServerless(isRedshiftServerless: Boolean) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless)
    }

    /**
     * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
     *   an Amazon Redshift Serverless data warehouse.
     */
    public fun isRedshiftServerless(isRedshiftServerless: IResolvable) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift
     *   read-only access to Amazon S3. For more information, and for the polices that you attach to
     *   this role, see
     *   [Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
     *   .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param workgroupName The name of an Amazon Redshift workgroup. */
    public fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
