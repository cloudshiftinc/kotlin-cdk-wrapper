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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * Data source credentials.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSourceCredentialsProperty dataSourceCredentialsProperty =
 * DataSourceCredentialsProperty.builder()
 * .copySourceArn("copySourceArn")
 * .credentialPair(CredentialPairProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .alternateDataSourceParameters(List.of(DataSourceParametersProperty.builder()
 * .amazonElasticsearchParameters(AmazonElasticsearchParametersProperty.builder()
 * .domain("domain")
 * .build())
 * .amazonOpenSearchParameters(AmazonOpenSearchParametersProperty.builder()
 * .domain("domain")
 * .build())
 * .athenaParameters(AthenaParametersProperty.builder()
 * .roleArn("roleArn")
 * .workGroup("workGroup")
 * .build())
 * .auroraParameters(AuroraParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .auroraPostgreSqlParameters(AuroraPostgreSqlParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .databricksParameters(DatabricksParametersProperty.builder()
 * .host("host")
 * .port(123)
 * .sqlEndpointPath("sqlEndpointPath")
 * .build())
 * .mariaDbParameters(MariaDbParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .mySqlParameters(MySqlParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .oracleParameters(OracleParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .postgreSqlParameters(PostgreSqlParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .prestoParameters(PrestoParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * .build())
 * .rdsParameters(RdsParametersProperty.builder()
 * .database("database")
 * .instanceId("instanceId")
 * .build())
 * .redshiftParameters(RedshiftParametersProperty.builder()
 * .database("database")
 * // the properties below are optional
 * .clusterId("clusterId")
 * .host("host")
 * .port(123)
 * .build())
 * .s3Parameters(S3ParametersProperty.builder()
 * .manifestFileLocation(ManifestFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .roleArn("roleArn")
 * .build())
 * .snowflakeParameters(SnowflakeParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .warehouse("warehouse")
 * .build())
 * .sparkParameters(SparkParametersProperty.builder()
 * .host("host")
 * .port(123)
 * .build())
 * .sqlServerParameters(SqlServerParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .teradataParameters(TeradataParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .build()))
 * .build())
 * .secretArn("secretArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html)
 */
@CdkDslMarker
public class CfnDataSourceDataSourceCredentialsPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceCredentialsProperty.Builder =
        CfnDataSource.DataSourceCredentialsProperty.builder()

    /**
     * @param copySourceArn The Amazon Resource Name (ARN) of a data source that has the credential
     *   pair that you want to use. When `CopySourceArn` is not null, the credential pair from the
     *   data source in the ARN is used as the credentials for the `DataSourceCredentials`
     *   structure.
     */
    public fun copySourceArn(copySourceArn: String) {
        cdkBuilder.copySourceArn(copySourceArn)
    }

    /**
     * @param credentialPair Credential pair. For more information, see
     *   `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
     *   .
     */
    public fun credentialPair(credentialPair: IResolvable) {
        cdkBuilder.credentialPair(credentialPair)
    }

    /**
     * @param credentialPair Credential pair. For more information, see
     *   `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
     *   .
     */
    public fun credentialPair(credentialPair: CfnDataSource.CredentialPairProperty) {
        cdkBuilder.credentialPair(credentialPair)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) of the secret associated with the data source
     *   in AWS Secrets Manager .
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnDataSource.DataSourceCredentialsProperty = cdkBuilder.build()
}
