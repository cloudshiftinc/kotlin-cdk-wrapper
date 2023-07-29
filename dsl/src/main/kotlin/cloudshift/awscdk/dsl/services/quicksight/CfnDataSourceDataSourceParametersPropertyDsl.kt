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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters that Amazon QuickSight uses to connect to your underlying data source.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSourceParametersProperty dataSourceParametersProperty =
 * DataSourceParametersProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceDataSourceParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceParametersProperty.Builder =
        CfnDataSource.DataSourceParametersProperty.builder()

    /** @param amazonElasticsearchParameters The parameters for OpenSearch. */
    public fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters)
    }

    /** @param amazonElasticsearchParameters The parameters for OpenSearch. */
    public fun amazonElasticsearchParameters(
        amazonElasticsearchParameters: CfnDataSource.AmazonElasticsearchParametersProperty
    ) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters)
    }

    /** @param amazonOpenSearchParameters The parameters for OpenSearch. */
    public fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters)
    }

    /** @param amazonOpenSearchParameters The parameters for OpenSearch. */
    public fun amazonOpenSearchParameters(
        amazonOpenSearchParameters: CfnDataSource.AmazonOpenSearchParametersProperty
    ) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters)
    }

    /** @param athenaParameters The parameters for Amazon Athena. */
    public fun athenaParameters(athenaParameters: IResolvable) {
        cdkBuilder.athenaParameters(athenaParameters)
    }

    /** @param athenaParameters The parameters for Amazon Athena. */
    public fun athenaParameters(athenaParameters: CfnDataSource.AthenaParametersProperty) {
        cdkBuilder.athenaParameters(athenaParameters)
    }

    /** @param auroraParameters The parameters for Amazon Aurora MySQL. */
    public fun auroraParameters(auroraParameters: IResolvable) {
        cdkBuilder.auroraParameters(auroraParameters)
    }

    /** @param auroraParameters The parameters for Amazon Aurora MySQL. */
    public fun auroraParameters(auroraParameters: CfnDataSource.AuroraParametersProperty) {
        cdkBuilder.auroraParameters(auroraParameters)
    }

    /** @param auroraPostgreSqlParameters The parameters for Amazon Aurora. */
    public fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters)
    }

    /** @param auroraPostgreSqlParameters The parameters for Amazon Aurora. */
    public fun auroraPostgreSqlParameters(
        auroraPostgreSqlParameters: CfnDataSource.AuroraPostgreSqlParametersProperty
    ) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters)
    }

    /**
     * @param databricksParameters The required parameters that are needed to connect to a
     *   Databricks data source.
     */
    public fun databricksParameters(databricksParameters: IResolvable) {
        cdkBuilder.databricksParameters(databricksParameters)
    }

    /**
     * @param databricksParameters The required parameters that are needed to connect to a
     *   Databricks data source.
     */
    public fun databricksParameters(
        databricksParameters: CfnDataSource.DatabricksParametersProperty
    ) {
        cdkBuilder.databricksParameters(databricksParameters)
    }

    /** @param mariaDbParameters The parameters for MariaDB. */
    public fun mariaDbParameters(mariaDbParameters: IResolvable) {
        cdkBuilder.mariaDbParameters(mariaDbParameters)
    }

    /** @param mariaDbParameters The parameters for MariaDB. */
    public fun mariaDbParameters(mariaDbParameters: CfnDataSource.MariaDbParametersProperty) {
        cdkBuilder.mariaDbParameters(mariaDbParameters)
    }

    /** @param mySqlParameters The parameters for MySQL. */
    public fun mySqlParameters(mySqlParameters: IResolvable) {
        cdkBuilder.mySqlParameters(mySqlParameters)
    }

    /** @param mySqlParameters The parameters for MySQL. */
    public fun mySqlParameters(mySqlParameters: CfnDataSource.MySqlParametersProperty) {
        cdkBuilder.mySqlParameters(mySqlParameters)
    }

    /** @param oracleParameters Oracle parameters. */
    public fun oracleParameters(oracleParameters: IResolvable) {
        cdkBuilder.oracleParameters(oracleParameters)
    }

    /** @param oracleParameters Oracle parameters. */
    public fun oracleParameters(oracleParameters: CfnDataSource.OracleParametersProperty) {
        cdkBuilder.oracleParameters(oracleParameters)
    }

    /** @param postgreSqlParameters The parameters for PostgreSQL. */
    public fun postgreSqlParameters(postgreSqlParameters: IResolvable) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters)
    }

    /** @param postgreSqlParameters The parameters for PostgreSQL. */
    public fun postgreSqlParameters(
        postgreSqlParameters: CfnDataSource.PostgreSqlParametersProperty
    ) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters)
    }

    /** @param prestoParameters The parameters for Presto. */
    public fun prestoParameters(prestoParameters: IResolvable) {
        cdkBuilder.prestoParameters(prestoParameters)
    }

    /** @param prestoParameters The parameters for Presto. */
    public fun prestoParameters(prestoParameters: CfnDataSource.PrestoParametersProperty) {
        cdkBuilder.prestoParameters(prestoParameters)
    }

    /** @param rdsParameters The parameters for Amazon RDS. */
    public fun rdsParameters(rdsParameters: IResolvable) {
        cdkBuilder.rdsParameters(rdsParameters)
    }

    /** @param rdsParameters The parameters for Amazon RDS. */
    public fun rdsParameters(rdsParameters: CfnDataSource.RdsParametersProperty) {
        cdkBuilder.rdsParameters(rdsParameters)
    }

    /** @param redshiftParameters The parameters for Amazon Redshift. */
    public fun redshiftParameters(redshiftParameters: IResolvable) {
        cdkBuilder.redshiftParameters(redshiftParameters)
    }

    /** @param redshiftParameters The parameters for Amazon Redshift. */
    public fun redshiftParameters(redshiftParameters: CfnDataSource.RedshiftParametersProperty) {
        cdkBuilder.redshiftParameters(redshiftParameters)
    }

    /** @param s3Parameters The parameters for S3. */
    public fun s3Parameters(s3Parameters: IResolvable) {
        cdkBuilder.s3Parameters(s3Parameters)
    }

    /** @param s3Parameters The parameters for S3. */
    public fun s3Parameters(s3Parameters: CfnDataSource.S3ParametersProperty) {
        cdkBuilder.s3Parameters(s3Parameters)
    }

    /** @param snowflakeParameters The parameters for Snowflake. */
    public fun snowflakeParameters(snowflakeParameters: IResolvable) {
        cdkBuilder.snowflakeParameters(snowflakeParameters)
    }

    /** @param snowflakeParameters The parameters for Snowflake. */
    public fun snowflakeParameters(snowflakeParameters: CfnDataSource.SnowflakeParametersProperty) {
        cdkBuilder.snowflakeParameters(snowflakeParameters)
    }

    /** @param sparkParameters The parameters for Spark. */
    public fun sparkParameters(sparkParameters: IResolvable) {
        cdkBuilder.sparkParameters(sparkParameters)
    }

    /** @param sparkParameters The parameters for Spark. */
    public fun sparkParameters(sparkParameters: CfnDataSource.SparkParametersProperty) {
        cdkBuilder.sparkParameters(sparkParameters)
    }

    /** @param sqlServerParameters The parameters for SQL Server. */
    public fun sqlServerParameters(sqlServerParameters: IResolvable) {
        cdkBuilder.sqlServerParameters(sqlServerParameters)
    }

    /** @param sqlServerParameters The parameters for SQL Server. */
    public fun sqlServerParameters(sqlServerParameters: CfnDataSource.SqlServerParametersProperty) {
        cdkBuilder.sqlServerParameters(sqlServerParameters)
    }

    /** @param teradataParameters The parameters for Teradata. */
    public fun teradataParameters(teradataParameters: IResolvable) {
        cdkBuilder.teradataParameters(teradataParameters)
    }

    /** @param teradataParameters The parameters for Teradata. */
    public fun teradataParameters(teradataParameters: CfnDataSource.TeradataParametersProperty) {
        cdkBuilder.teradataParameters(teradataParameters)
    }

    public fun build(): CfnDataSource.DataSourceParametersProperty = cdkBuilder.build()
}
