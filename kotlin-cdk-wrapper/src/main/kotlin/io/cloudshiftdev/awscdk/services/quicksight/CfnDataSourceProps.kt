@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
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
 * .starburstParameters(StarburstParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .productType("productType")
 * .build())
 * .teradataParameters(TeradataParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .trinoParameters(TrinoParametersProperty.builder()
 * .catalog("catalog")
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
 * .starburstParameters(StarburstParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .productType("productType")
 * .build())
 * .teradataParameters(TeradataParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .trinoParameters(TrinoParametersProperty.builder()
 * .catalog("catalog")
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
 * .starburstParameters(StarburstParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .productType("productType")
 * .build())
 * .teradataParameters(TeradataParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build())
 * .trinoParameters(TrinoParametersProperty.builder()
 * .catalog("catalog")
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
public interface CfnDataSourceProps {
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
   */
  public fun alternateDataSourceParameters(): Any? = unwrap(this).getAlternateDataSourceParameters()

  /**
   * The AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   *
   * Currently, only credentials based on user name and password are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
   */
  public fun credentials(): Any? = unwrap(this).getCredentials()

  /**
   * An ID for the data source.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceid)
   */
  public fun dataSourceId(): String? = unwrap(this).getDataSourceId()

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
   */
  public fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

  /**
   * Error information from the last update or the creation of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
   */
  public fun errorInfo(): Any? = unwrap(this).getErrorInfo()

  /**
   * A display name for the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of resource permissions on the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
   */
  public fun sslProperties(): Any? = unwrap(this).getSslProperties()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the data source. To return a list of all data sources, use `ListDataSources` .
   *
   * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
   */
  public fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

    /**
     * @param awsAccountId The AWS account ID.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    public fun credentials(credentials: IResolvable)

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    public fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty)

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94b6b359e14c5af0ec6a634cb12da67b4b802be31f0bdd780cf8b4d2eb68eaf1")
    public
        fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty.Builder.() -> Unit)

    /**
     * @param dataSourceId An ID for the data source.
     * This ID is unique per AWS Region for each AWS account.
     */
    public fun dataSourceId(dataSourceId: String)

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    public fun dataSourceParameters(dataSourceParameters: IResolvable)

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    public
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty)

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3e23ae026f5f1109635cd9a81fdf12c775f459611e10050ecbcc22747d9b8")
    public
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty.Builder.() -> Unit)

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    public fun errorInfo(errorInfo: IResolvable)

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty)

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("940209a500ffcaecdb951c48cf1f2043c693a9937c26643df99def8eae972df8")
    public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty.Builder.() -> Unit)

    /**
     * @param name A display name for the data source.
     */
    public fun name(name: String)

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    public fun sslProperties(sslProperties: IResolvable)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bcf27d540594af2c8dc76349f94b8b25ef198e56c7699c1b7e39640ed60ac15")
    public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty.Builder.() -> Unit)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the data source. To return a list of all data sources, use
     * `ListDataSources` .
     * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
     */
    public fun type(type: String)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    public
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbfe7920df0f3021e69f9a8763d39adf3119156b3047661a69cd9f780d1e7e36")
    public
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSourceProps.builder()

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    override fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters.let(IResolvable::unwrap))
    }

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    override fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
    }

    /**
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source.
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     */
    override fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any): Unit =
        alternateDataSourceParameters(alternateDataSourceParameters.toList())

    /**
     * @param awsAccountId The AWS account ID.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
    }

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    override fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty) {
      cdkBuilder.credentials(credentials.let(CfnDataSource.DataSourceCredentialsProperty::unwrap))
    }

    /**
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source.
     * Currently, only credentials based on user name and password are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94b6b359e14c5af0ec6a634cb12da67b4b802be31f0bdd780cf8b4d2eb68eaf1")
    override
        fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty.Builder.() -> Unit):
        Unit = credentials(CfnDataSource.DataSourceCredentialsProperty(credentials))

    /**
     * @param dataSourceId An ID for the data source.
     * This ID is unique per AWS Region for each AWS account.
     */
    override fun dataSourceId(dataSourceId: String) {
      cdkBuilder.dataSourceId(dataSourceId)
    }

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    override fun dataSourceParameters(dataSourceParameters: IResolvable) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(IResolvable::unwrap))
    }

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    override
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(CfnDataSource.DataSourceParametersProperty::unwrap))
    }

    /**
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3e23ae026f5f1109635cd9a81fdf12c775f459611e10050ecbcc22747d9b8")
    override
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty.Builder.() -> Unit):
        Unit =
        dataSourceParameters(CfnDataSource.DataSourceParametersProperty(dataSourceParameters))

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    override fun errorInfo(errorInfo: IResolvable) {
      cdkBuilder.errorInfo(errorInfo.let(IResolvable::unwrap))
    }

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    override fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty) {
      cdkBuilder.errorInfo(errorInfo.let(CfnDataSource.DataSourceErrorInfoProperty::unwrap))
    }

    /**
     * @param errorInfo Error information from the last update or the creation of the data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("940209a500ffcaecdb951c48cf1f2043c693a9937c26643df99def8eae972df8")
    override fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty.Builder.() -> Unit):
        Unit = errorInfo(CfnDataSource.DataSourceErrorInfoProperty(errorInfo))

    /**
     * @param name A display name for the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions A list of resource permissions on the data source.
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    override fun sslProperties(sslProperties: IResolvable) {
      cdkBuilder.sslProperties(sslProperties.let(IResolvable::unwrap))
    }

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    override fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty) {
      cdkBuilder.sslProperties(sslProperties.let(CfnDataSource.SslPropertiesProperty::unwrap))
    }

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bcf27d540594af2c8dc76349f94b8b25ef198e56c7699c1b7e39640ed60ac15")
    override
        fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty.Builder.() -> Unit):
        Unit = sslProperties(CfnDataSource.SslPropertiesProperty(sslProperties))

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the data source. To return a list of all data sources, use
     * `ListDataSources` .
     * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    override fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    override
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(CfnDataSource.VpcConnectionPropertiesProperty::unwrap))
    }

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbfe7920df0f3021e69f9a8763d39adf3119156b3047661a69cd9f780d1e7e36")
    override
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty.Builder.() -> Unit):
        Unit =
        vpcConnectionProperties(CfnDataSource.VpcConnectionPropertiesProperty(vpcConnectionProperties))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    /**
     * A set of alternate data source parameters that you want to share for the credentials stored
     * with this data source.
     *
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the credentials from this existing data source. If the
     * `AlternateDataSourceParameters` list is null, the `Credentials` originally used with this
     * `DataSourceParameters` are automatically allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-alternatedatasourceparameters)
     */
    override fun alternateDataSourceParameters(): Any? =
        unwrap(this).getAlternateDataSourceParameters()

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The credentials Amazon QuickSight that uses to connect to your underlying source.
     *
     * Currently, only credentials based on user name and password are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
     */
    override fun credentials(): Any? = unwrap(this).getCredentials()

    /**
     * An ID for the data source.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceid)
     */
    override fun dataSourceId(): String? = unwrap(this).getDataSourceId()

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     */
    override fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     */
    override fun errorInfo(): Any? = unwrap(this).getErrorInfo()

    /**
     * A display name for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     */
    override fun sslProperties(): Any? = unwrap(this).getSslProperties()

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the data source. To return a list of all data sources, use `ListDataSources` .
     *
     * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     */
    override fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.quicksight.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDataSourceProps
  }
}
