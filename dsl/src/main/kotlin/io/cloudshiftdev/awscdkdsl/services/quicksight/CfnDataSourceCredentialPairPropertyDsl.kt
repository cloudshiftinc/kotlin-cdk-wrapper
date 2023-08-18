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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The combination of user name and password that are used as credentials.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CredentialPairProperty credentialPairProperty = CredentialPairProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html)
 */
@CdkDslMarker
public class CfnDataSourceCredentialPairPropertyDsl {
    private val cdkBuilder: CfnDataSource.CredentialPairProperty.Builder =
        CfnDataSource.CredentialPairProperty.builder()

    private val _alternateDataSourceParameters: MutableList<Any> = mutableListOf()

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     *   to share for these credentials. The credentials are applied in tandem with the data source
     *   parameters when you copy a data source by using a create or update request. The API
     *   operation compares the `DataSourceParameters` structure that's in the request with the
     *   structures in the `AlternateDataSourceParameters` allow list. If the structures are an
     *   exact match, the request is allowed to use the new data source with the existing
     *   credentials. If the `AlternateDataSourceParameters` list is null, the
     *   `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
     */
    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
        _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
    }

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     *   to share for these credentials. The credentials are applied in tandem with the data source
     *   parameters when you copy a data source by using a create or update request. The API
     *   operation compares the `DataSourceParameters` structure that's in the request with the
     *   structures in the `AlternateDataSourceParameters` allow list. If the structures are an
     *   exact match, the request is allowed to use the new data source with the existing
     *   credentials. If the `AlternateDataSourceParameters` list is null, the
     *   `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
        _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
    }

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     *   to share for these credentials. The credentials are applied in tandem with the data source
     *   parameters when you copy a data source by using a create or update request. The API
     *   operation compares the `DataSourceParameters` structure that's in the request with the
     *   structures in the `AlternateDataSourceParameters` allow list. If the structures are an
     *   exact match, the request is allowed to use the new data source with the existing
     *   credentials. If the `AlternateDataSourceParameters` list is null, the
     *   `DataSourceParameters` originally used with these `Credentials` is automatically allowed.
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
    }

    /** @param password Password. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param username User name. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnDataSource.CredentialPairProperty {
        if (_alternateDataSourceParameters.isNotEmpty())
            cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
        return cdkBuilder.build()
    }
}
