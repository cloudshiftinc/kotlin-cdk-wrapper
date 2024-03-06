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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnDataProvider

/**
 * Provides information that defines a PostgreSQL endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * PostgreSqlSettingsProperty postgreSqlSettingsProperty = PostgreSqlSettingsProperty.builder()
 * .certificateArn("certificateArn")
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html)
 */
@CdkDslMarker
public class CfnDataProviderPostgreSqlSettingsPropertyDsl {
    private val cdkBuilder: CfnDataProvider.PostgreSqlSettingsProperty.Builder =
        CfnDataProvider.PostgreSqlSettingsProperty.builder()

    /** @param certificateArn the value to be set. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param databaseName Database name for the endpoint. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param port Endpoint TCP port. The default is 5432. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param serverName The host name of the endpoint database. For an Amazon RDS PostgreSQL
     *   instance, this is the output of
     *   [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     *   , in the
     *   `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     *   .Address` field.
     *
     * For an Aurora PostgreSQL instance, this is the output of
     * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
     * , in the `Endpoint` field.
     */
    public fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
    }

    /** @param sslMode the value to be set. */
    public fun sslMode(sslMode: String) {
        cdkBuilder.sslMode(sslMode)
    }

    public fun build(): CfnDataProvider.PostgreSqlSettingsProperty = cdkBuilder.build()
}
