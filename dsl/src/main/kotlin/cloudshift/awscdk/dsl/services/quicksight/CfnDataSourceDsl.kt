@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.constructs.Construct

/**
 * Creates a data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
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
 * .awsAccountId("awsAccountId")
 * .credentials(DataSourceCredentialsProperty.builder()
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
 * .build())
 * .dataSourceId("dataSourceId")
 * .dataSourceParameters(DataSourceParametersProperty.builder()
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
 * .build())
 * .errorInfo(DataSourceErrorInfoProperty.builder()
 * .message("message")
 * .type("type")
 * .build())
 * .name("name")
 * .permissions(List.of(ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * .build()))
 * .sslProperties(SslPropertiesProperty.builder()
 * .disableSsl(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .vpcConnectionProperties(VpcConnectionPropertiesProperty.builder()
 * .vpcConnectionArn("vpcConnectionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html)
 */
@CdkDslMarker
public class CfnDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

  private val _alternateDataSourceParameters: MutableList<Any> = mutableListOf()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   *
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-alternatedatasourceparameters)
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source. 
   */
  public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
    _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
  }

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   *
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-alternatedatasourceparameters)
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source. 
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
    _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
  }

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   *
   * The credentials are applied in tandem with the data source parameters when you copy a data
   * source by using a create or update request. The API operation compares the `DataSourceParameters`
   * structure that's in the request with the structures in the `AlternateDataSourceParameters` allow
   * list. If the structures are an exact match, the request is allowed to use the credentials from
   * this existing data source. If the `AlternateDataSourceParameters` list is null, the `Credentials`
   * originally used with this `DataSourceParameters` are automatically allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-alternatedatasourceparameters)
   * @param alternateDataSourceParameters A set of alternate data source parameters that you want to
   * share for the credentials stored with this data source. 
   */
  public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
    cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
  }

  /**
   * The AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-awsaccountid)
   * @param awsAccountId The AWS account ID. 
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   *
   * Currently, only credentials based on user name and password are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
   * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
   * source. 
   */
  public fun credentials(credentials: IResolvable) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   *
   * Currently, only credentials based on user name and password are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
   * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
   * source. 
   */
  public fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * An ID for the data source.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceid)
   * @param dataSourceId An ID for the data source. 
   */
  public fun dataSourceId(dataSourceId: String) {
    cdkBuilder.dataSourceId(dataSourceId)
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
   * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
   * underlying source. 
   */
  public fun dataSourceParameters(dataSourceParameters: IResolvable) {
    cdkBuilder.dataSourceParameters(dataSourceParameters)
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
   * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
   * underlying source. 
   */
  public
      fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty) {
    cdkBuilder.dataSourceParameters(dataSourceParameters)
  }

  /**
   * Error information from the last update or the creation of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
   * @param errorInfo Error information from the last update or the creation of the data source. 
   */
  public fun errorInfo(errorInfo: IResolvable) {
    cdkBuilder.errorInfo(errorInfo)
  }

  /**
   * Error information from the last update or the creation of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
   * @param errorInfo Error information from the last update or the creation of the data source. 
   */
  public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty) {
    cdkBuilder.errorInfo(errorInfo)
  }

  /**
   * A display name for the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-name)
   * @param name A display name for the data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A list of resource permissions on the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
   * @param permissions A list of resource permissions on the data source. 
   */
  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * A list of resource permissions on the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
   * @param permissions A list of resource permissions on the data source. 
   */
  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  /**
   * A list of resource permissions on the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
   * @param permissions A list of resource permissions on the data source. 
   */
  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
   * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
   * connects to your underlying source. 
   */
  public fun sslProperties(sslProperties: IResolvable) {
    cdkBuilder.sslProperties(sslProperties)
  }

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
   * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
   * connects to your underlying source. 
   */
  public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty) {
    cdkBuilder.sslProperties(sslProperties)
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * data source. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * data source. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of the data source. To return a list of all data sources, use `ListDataSources` .
   *
   * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-type)
   * @param type The type of the data source. To return a list of all data sources, use
   * `ListDataSources` . 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
   * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a
   * VPC connection when connecting to your underlying source. 
   */
  public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
    cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
  }

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
   * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a
   * VPC connection when connecting to your underlying source. 
   */
  public
      fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty) {
    cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
  }

  public fun build(): CfnDataSource {
    if(_alternateDataSourceParameters.isNotEmpty())
        cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
