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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Provides information about the Amazon Redshift database configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * RedshiftSourceConfigProperty redshiftSourceConfigProperty =
 * RedshiftSourceConfigProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .roleArn("roleArn")
 * .secretManagerArn("secretManagerArn")
 * .tableName("tableName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorRedshiftSourceConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder =
        CfnAnomalyDetector.RedshiftSourceConfigProperty.builder()

    /** @param clusterIdentifier A string identifying the Redshift cluster. */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /** @param databaseHost The name of the database host. */
    public fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
    }

    /** @param databaseName The Redshift database name. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param databasePort The port number where the database can be accessed. */
    public fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role providing access to the database.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. */
    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    /** @param tableName The table name of the Redshift database. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
     *   configuration.
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /**
     * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
     *   configuration.
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAnomalyDetector.VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnAnomalyDetector.RedshiftSourceConfigProperty = cdkBuilder.build()
}
