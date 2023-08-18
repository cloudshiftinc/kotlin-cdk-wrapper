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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * Use the `RdsHttpEndpointConfig` property type to specify the `RdsHttpEndpoint` for an AWS AppSync
 * relational database.
 *
 * `RdsHttpEndpointConfig` is a property of the
 * [AWS AppSync DataSource RelationalDatabaseConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * RdsHttpEndpointConfigProperty rdsHttpEndpointConfigProperty =
 * RdsHttpEndpointConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .awsSecretStoreArn("awsSecretStoreArn")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * // the properties below are optional
 * .databaseName("databaseName")
 * .schema("schema")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceRdsHttpEndpointConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.RdsHttpEndpointConfigProperty.Builder =
        CfnDataSource.RdsHttpEndpointConfigProperty.builder()

    /** @param awsRegion AWS Region for RDS HTTP endpoint. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /** @param awsSecretStoreArn The ARN for database credentials stored in AWS Secrets Manager . */
    public fun awsSecretStoreArn(awsSecretStoreArn: String) {
        cdkBuilder.awsSecretStoreArn(awsSecretStoreArn)
    }

    /** @param databaseName Logical database name. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param dbClusterIdentifier Amazon RDS cluster Amazon Resource Name (ARN). */
    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /** @param schema Logical schema name. */
    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnDataSource.RdsHttpEndpointConfigProperty = cdkBuilder.build()
}
