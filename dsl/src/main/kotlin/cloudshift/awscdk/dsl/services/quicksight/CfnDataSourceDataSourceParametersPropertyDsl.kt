@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDataSourceParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.DataSourceParametersProperty.Builder =
      CfnDataSource.DataSourceParametersProperty.builder()

  public fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable) {
    cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters)
  }

  public
      fun amazonElasticsearchParameters(amazonElasticsearchParameters: CfnDataSource.AmazonElasticsearchParametersProperty) {
    cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters)
  }

  public fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable) {
    cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters)
  }

  public
      fun amazonOpenSearchParameters(amazonOpenSearchParameters: CfnDataSource.AmazonOpenSearchParametersProperty) {
    cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters)
  }

  public fun athenaParameters(athenaParameters: IResolvable) {
    cdkBuilder.athenaParameters(athenaParameters)
  }

  public fun athenaParameters(athenaParameters: CfnDataSource.AthenaParametersProperty) {
    cdkBuilder.athenaParameters(athenaParameters)
  }

  public fun auroraParameters(auroraParameters: IResolvable) {
    cdkBuilder.auroraParameters(auroraParameters)
  }

  public fun auroraParameters(auroraParameters: CfnDataSource.AuroraParametersProperty) {
    cdkBuilder.auroraParameters(auroraParameters)
  }

  public fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable) {
    cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters)
  }

  public
      fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: CfnDataSource.AuroraPostgreSqlParametersProperty) {
    cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters)
  }

  public fun databricksParameters(databricksParameters: IResolvable) {
    cdkBuilder.databricksParameters(databricksParameters)
  }

  public
      fun databricksParameters(databricksParameters: CfnDataSource.DatabricksParametersProperty) {
    cdkBuilder.databricksParameters(databricksParameters)
  }

  public fun mariaDbParameters(mariaDbParameters: IResolvable) {
    cdkBuilder.mariaDbParameters(mariaDbParameters)
  }

  public fun mariaDbParameters(mariaDbParameters: CfnDataSource.MariaDbParametersProperty) {
    cdkBuilder.mariaDbParameters(mariaDbParameters)
  }

  public fun mySqlParameters(mySqlParameters: IResolvable) {
    cdkBuilder.mySqlParameters(mySqlParameters)
  }

  public fun mySqlParameters(mySqlParameters: CfnDataSource.MySqlParametersProperty) {
    cdkBuilder.mySqlParameters(mySqlParameters)
  }

  public fun oracleParameters(oracleParameters: IResolvable) {
    cdkBuilder.oracleParameters(oracleParameters)
  }

  public fun oracleParameters(oracleParameters: CfnDataSource.OracleParametersProperty) {
    cdkBuilder.oracleParameters(oracleParameters)
  }

  public fun postgreSqlParameters(postgreSqlParameters: IResolvable) {
    cdkBuilder.postgreSqlParameters(postgreSqlParameters)
  }

  public
      fun postgreSqlParameters(postgreSqlParameters: CfnDataSource.PostgreSqlParametersProperty) {
    cdkBuilder.postgreSqlParameters(postgreSqlParameters)
  }

  public fun prestoParameters(prestoParameters: IResolvable) {
    cdkBuilder.prestoParameters(prestoParameters)
  }

  public fun prestoParameters(prestoParameters: CfnDataSource.PrestoParametersProperty) {
    cdkBuilder.prestoParameters(prestoParameters)
  }

  public fun rdsParameters(rdsParameters: IResolvable) {
    cdkBuilder.rdsParameters(rdsParameters)
  }

  public fun rdsParameters(rdsParameters: CfnDataSource.RdsParametersProperty) {
    cdkBuilder.rdsParameters(rdsParameters)
  }

  public fun redshiftParameters(redshiftParameters: IResolvable) {
    cdkBuilder.redshiftParameters(redshiftParameters)
  }

  public fun redshiftParameters(redshiftParameters: CfnDataSource.RedshiftParametersProperty) {
    cdkBuilder.redshiftParameters(redshiftParameters)
  }

  public fun s3Parameters(s3Parameters: IResolvable) {
    cdkBuilder.s3Parameters(s3Parameters)
  }

  public fun s3Parameters(s3Parameters: CfnDataSource.S3ParametersProperty) {
    cdkBuilder.s3Parameters(s3Parameters)
  }

  public fun snowflakeParameters(snowflakeParameters: IResolvable) {
    cdkBuilder.snowflakeParameters(snowflakeParameters)
  }

  public fun snowflakeParameters(snowflakeParameters: CfnDataSource.SnowflakeParametersProperty) {
    cdkBuilder.snowflakeParameters(snowflakeParameters)
  }

  public fun sparkParameters(sparkParameters: IResolvable) {
    cdkBuilder.sparkParameters(sparkParameters)
  }

  public fun sparkParameters(sparkParameters: CfnDataSource.SparkParametersProperty) {
    cdkBuilder.sparkParameters(sparkParameters)
  }

  public fun sqlServerParameters(sqlServerParameters: IResolvable) {
    cdkBuilder.sqlServerParameters(sqlServerParameters)
  }

  public fun sqlServerParameters(sqlServerParameters: CfnDataSource.SqlServerParametersProperty) {
    cdkBuilder.sqlServerParameters(sqlServerParameters)
  }

  public fun teradataParameters(teradataParameters: IResolvable) {
    cdkBuilder.teradataParameters(teradataParameters)
  }

  public fun teradataParameters(teradataParameters: CfnDataSource.TeradataParametersProperty) {
    cdkBuilder.teradataParameters(teradataParameters)
  }

  public fun build(): CfnDataSource.DataSourceParametersProperty = cdkBuilder.build()
}
