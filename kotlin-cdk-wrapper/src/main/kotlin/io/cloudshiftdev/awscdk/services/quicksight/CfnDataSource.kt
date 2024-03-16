@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a data source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
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
public open class CfnDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   */
  public open fun alternateDataSourceParameters(): Any? =
      unwrap(this).getAlternateDataSourceParameters()

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   */
  public open fun alternateDataSourceParameters(`value`: IResolvable) {
    unwrap(this).setAlternateDataSourceParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   */
  public open fun alternateDataSourceParameters(`value`: List<Any>) {
    unwrap(this).setAlternateDataSourceParameters(`value`)
  }

  /**
   * A set of alternate data source parameters that you want to share for the credentials stored
   * with this data source.
   */
  public open fun alternateDataSourceParameters(vararg `value`: Any): Unit =
      alternateDataSourceParameters(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the dataset.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time that this data source was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The last time that this data source was updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The HTTP status of the request.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The AWS account ID.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The AWS account ID.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   */
  public open fun credentials(): Any? = unwrap(this).getCredentials()

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   */
  public open fun credentials(`value`: IResolvable) {
    unwrap(this).setCredentials(`value`.let(IResolvable::unwrap))
  }

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   */
  public open fun credentials(`value`: DataSourceCredentialsProperty) {
    unwrap(this).setCredentials(`value`.let(DataSourceCredentialsProperty::unwrap))
  }

  /**
   * The credentials Amazon QuickSight that uses to connect to your underlying source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df61786675ce00c1232499951939ae13cd98a579e214432c11273c41f126567d")
  public open fun credentials(`value`: DataSourceCredentialsProperty.Builder.() -> Unit): Unit =
      credentials(DataSourceCredentialsProperty(`value`))

  /**
   * An ID for the data source.
   */
  public open fun dataSourceId(): String? = unwrap(this).getDataSourceId()

  /**
   * An ID for the data source.
   */
  public open fun dataSourceId(`value`: String) {
    unwrap(this).setDataSourceId(`value`)
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   */
  public open fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   */
  public open fun dataSourceParameters(`value`: IResolvable) {
    unwrap(this).setDataSourceParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   */
  public open fun dataSourceParameters(`value`: DataSourceParametersProperty) {
    unwrap(this).setDataSourceParameters(`value`.let(DataSourceParametersProperty::unwrap))
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c893daf1ad004b4692d7d96bf773829b227580c1075bc21b097c1dbd238908c8")
  public open fun dataSourceParameters(`value`: DataSourceParametersProperty.Builder.() -> Unit):
      Unit = dataSourceParameters(DataSourceParametersProperty(`value`))

  /**
   * Error information from the last update or the creation of the data source.
   */
  public open fun errorInfo(): Any? = unwrap(this).getErrorInfo()

  /**
   * Error information from the last update or the creation of the data source.
   */
  public open fun errorInfo(`value`: IResolvable) {
    unwrap(this).setErrorInfo(`value`.let(IResolvable::unwrap))
  }

  /**
   * Error information from the last update or the creation of the data source.
   */
  public open fun errorInfo(`value`: DataSourceErrorInfoProperty) {
    unwrap(this).setErrorInfo(`value`.let(DataSourceErrorInfoProperty::unwrap))
  }

  /**
   * Error information from the last update or the creation of the data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ddc8fa021ece05fff344a70fa737c5c23224128797defc2ff07faceaddb1987")
  public open fun errorInfo(`value`: DataSourceErrorInfoProperty.Builder.() -> Unit): Unit =
      errorInfo(DataSourceErrorInfoProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A display name for the data source.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A display name for the data source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of resource permissions on the data source.
   */
  public open fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A list of resource permissions on the data source.
   */
  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of resource permissions on the data source.
   */
  public open fun permissions(`value`: List<Any>) {
    unwrap(this).setPermissions(`value`)
  }

  /**
   * A list of resource permissions on the data source.
   */
  public open fun permissions(vararg `value`: Any): Unit = permissions(`value`.toList())

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   */
  public open fun sslProperties(): Any? = unwrap(this).getSslProperties()

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   */
  public open fun sslProperties(`value`: IResolvable) {
    unwrap(this).setSslProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   */
  public open fun sslProperties(`value`: SslPropertiesProperty) {
    unwrap(this).setSslProperties(`value`.let(SslPropertiesProperty::unwrap))
  }

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e002963bc13f87b032f33313b3132602720997159639f0cae74249efe102f653")
  public open fun sslProperties(`value`: SslPropertiesProperty.Builder.() -> Unit): Unit =
      sslProperties(SslPropertiesProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the data source.
   *
   * To return a list of all data sources, use `ListDataSources` .
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of the data source.
   *
   * To return a list of all data sources, use `ListDataSources` .
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   */
  public open fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   */
  public open fun vpcConnectionProperties(`value`: IResolvable) {
    unwrap(this).setVpcConnectionProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   */
  public open fun vpcConnectionProperties(`value`: VpcConnectionPropertiesProperty) {
    unwrap(this).setVpcConnectionProperties(`value`.let(VpcConnectionPropertiesProperty::unwrap))
  }

  /**
   * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting
   * to your underlying source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72afc2ff8bd25dd0fc143e3592f3bcfdd9b7a87503e2613b657f15697ba7a2ac")
  public open
      fun vpcConnectionProperties(`value`: VpcConnectionPropertiesProperty.Builder.() -> Unit): Unit
      = vpcConnectionProperties(VpcConnectionPropertiesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-awsaccountid)
     * @param awsAccountId The AWS account ID. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * The credentials Amazon QuickSight that uses to connect to your underlying source.
     *
     * Currently, only credentials based on user name and password are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source. 
     */
    public fun credentials(credentials: IResolvable)

    /**
     * The credentials Amazon QuickSight that uses to connect to your underlying source.
     *
     * Currently, only credentials based on user name and password are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source. 
     */
    public fun credentials(credentials: DataSourceCredentialsProperty)

    /**
     * The credentials Amazon QuickSight that uses to connect to your underlying source.
     *
     * Currently, only credentials based on user name and password are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-credentials)
     * @param credentials The credentials Amazon QuickSight that uses to connect to your underlying
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2fb1dc91492b09b3c8cb8098a14857a39a4b752aef8d30ca82f08de6b44140")
    public fun credentials(credentials: DataSourceCredentialsProperty.Builder.() -> Unit)

    /**
     * An ID for the data source.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceid)
     * @param dataSourceId An ID for the data source. 
     */
    public fun dataSourceId(dataSourceId: String)

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    public fun dataSourceParameters(dataSourceParameters: IResolvable)

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    public fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty)

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0be218c60213d251370615a299fc07bd660fcf7619e829bbad962705616cfce")
    public
        fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty.Builder.() -> Unit)

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    public fun errorInfo(errorInfo: IResolvable)

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    public fun errorInfo(errorInfo: DataSourceErrorInfoProperty)

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52fd2007a60586cb2c41684fb7b1685a9c9618931c46f9309ddb447b490d4eac")
    public fun errorInfo(errorInfo: DataSourceErrorInfoProperty.Builder.() -> Unit)

    /**
     * A display name for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-name)
     * @param name A display name for the data source. 
     */
    public fun name(name: String)

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    public fun permissions(permissions: IResolvable)

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    public fun permissions(permissions: List<Any>)

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    public fun permissions(vararg permissions: Any)

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    public fun sslProperties(sslProperties: IResolvable)

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    public fun sslProperties(sslProperties: SslPropertiesProperty)

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82bf32715672f83e73bde18ec71930c2e7d957f06953af1a5fb0b7d0a05d41cf")
    public fun sslProperties(sslProperties: SslPropertiesProperty.Builder.() -> Unit)

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the data source. To return a list of all data sources, use `ListDataSources` .
     *
     * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-type)
     * @param type The type of the data source. To return a list of all data sources, use
     * `ListDataSources` . 
     */
    public fun type(type: String)

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable)

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    public fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty)

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7bfc6df3cf4308b3f040563924f0b4079cf13e91a8fe81d69970d80c0b6a02f")
    public
        fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSource.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSource.Builder.create(scope, id)

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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    override fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters.let(IResolvable::unwrap))
    }

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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    override fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
    }

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
     * @param alternateDataSourceParameters A set of alternate data source parameters that you want
     * to share for the credentials stored with this data source. 
     */
    override fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any): Unit =
        alternateDataSourceParameters(alternateDataSourceParameters.toList())

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-awsaccountid)
     * @param awsAccountId The AWS account ID. 
     */
    override fun awsAccountId(awsAccountId: String) {
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
    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
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
    override fun credentials(credentials: DataSourceCredentialsProperty) {
      cdkBuilder.credentials(credentials.let(DataSourceCredentialsProperty::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2fb1dc91492b09b3c8cb8098a14857a39a4b752aef8d30ca82f08de6b44140")
    override fun credentials(credentials: DataSourceCredentialsProperty.Builder.() -> Unit): Unit =
        credentials(DataSourceCredentialsProperty(credentials))

    /**
     * An ID for the data source.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceid)
     * @param dataSourceId An ID for the data source. 
     */
    override fun dataSourceId(dataSourceId: String) {
      cdkBuilder.dataSourceId(dataSourceId)
    }

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    override fun dataSourceParameters(dataSourceParameters: IResolvable) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    override fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(DataSourceParametersProperty::unwrap))
    }

    /**
     * The parameters that Amazon QuickSight uses to connect to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-datasourceparameters)
     * @param dataSourceParameters The parameters that Amazon QuickSight uses to connect to your
     * underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0be218c60213d251370615a299fc07bd660fcf7619e829bbad962705616cfce")
    override
        fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty.Builder.() -> Unit):
        Unit = dataSourceParameters(DataSourceParametersProperty(dataSourceParameters))

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    override fun errorInfo(errorInfo: IResolvable) {
      cdkBuilder.errorInfo(errorInfo.let(IResolvable::unwrap))
    }

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    override fun errorInfo(errorInfo: DataSourceErrorInfoProperty) {
      cdkBuilder.errorInfo(errorInfo.let(DataSourceErrorInfoProperty::unwrap))
    }

    /**
     * Error information from the last update or the creation of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-errorinfo)
     * @param errorInfo Error information from the last update or the creation of the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52fd2007a60586cb2c41684fb7b1685a9c9618931c46f9309ddb447b490d4eac")
    override fun errorInfo(errorInfo: DataSourceErrorInfoProperty.Builder.() -> Unit): Unit =
        errorInfo(DataSourceErrorInfoProperty(errorInfo))

    /**
     * A display name for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-name)
     * @param name A display name for the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * A list of resource permissions on the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-permissions)
     * @param permissions A list of resource permissions on the data source. 
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    override fun sslProperties(sslProperties: IResolvable) {
      cdkBuilder.sslProperties(sslProperties.let(IResolvable::unwrap))
    }

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    override fun sslProperties(sslProperties: SslPropertiesProperty) {
      cdkBuilder.sslProperties(sslProperties.let(SslPropertiesProperty::unwrap))
    }

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
     * underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-sslproperties)
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight
     * connects to your underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82bf32715672f83e73bde18ec71930c2e7d957f06953af1a5fb0b7d0a05d41cf")
    override fun sslProperties(sslProperties: SslPropertiesProperty.Builder.() -> Unit): Unit =
        sslProperties(SslPropertiesProperty(sslProperties))

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the data source. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the data source. To return a list of all data sources, use `ListDataSources` .
     *
     * Use `AMAZON_ELASTICSEARCH` for Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-type)
     * @param type The type of the data source. To return a list of all data sources, use
     * `ListDataSources` . 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    override fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(IResolvable::unwrap))
    }

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    override fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(VpcConnectionPropertiesProperty::unwrap))
    }

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when
     * connecting to your underlying source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-datasource.html#cfn-quicksight-datasource-vpcconnectionproperties)
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use
     * a VPC connection when connecting to your underlying source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7bfc6df3cf4308b3f040563924f0b4079cf13e91a8fe81d69970d80c0b6a02f")
    override
        fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty.Builder.() -> Unit):
        Unit = vpcConnectionProperties(VpcConnectionPropertiesProperty(vpcConnectionProperties))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.quicksight.CfnDataSource = wrapped.cdkObject
  }

  /**
   * The parameters for Amazon RDS.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RdsParametersProperty rdsParametersProperty = RdsParametersProperty.builder()
   * .database("database")
   * .instanceId("instanceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html)
   */
  public interface RdsParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html#cfn-quicksight-datasource-rdsparameters-database)
     */
    public fun database(): String

    /**
     * Instance ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html#cfn-quicksight-datasource-rdsparameters-instanceid)
     */
    public fun instanceId(): String

    /**
     * A builder for [RdsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param instanceId Instance ID. 
       */
      public fun instanceId(instanceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param instanceId Instance ID. 
       */
      override fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty,
    ) : CdkObject(cdkObject), RdsParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html#cfn-quicksight-datasource-rdsparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Instance ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html#cfn-quicksight-datasource-rdsparameters-instanceid)
       */
      override fun instanceId(): String = unwrap(this).getInstanceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty):
          RdsParametersProperty = CdkObjectWrappers.wrap(cdkObject) as RdsParametersProperty

      internal fun unwrap(wrapped: RdsParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty
    }
  }

  /**
   * Parameters for Amazon Aurora.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * AuroraParametersProperty auroraParametersProperty = AuroraParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html)
   */
  public interface AuroraParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [AuroraParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty,
    ) : CdkObject(cdkObject), AuroraParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html#cfn-quicksight-datasource-auroraparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuroraParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty):
          AuroraParametersProperty = CdkObjectWrappers.wrap(cdkObject) as AuroraParametersProperty

      internal fun unwrap(wrapped: AuroraParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty
    }
  }

  /**
   * The parameters for Amazon Redshift.
   *
   * The `ClusterId` field can be blank if `Host` and `Port` are both set. The `Host` and `Port`
   * fields can be blank if the `ClusterId` field is set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RedshiftParametersProperty redshiftParametersProperty = RedshiftParametersProperty.builder()
   * .database("database")
   * // the properties below are optional
   * .clusterId("clusterId")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html)
   */
  public interface RedshiftParametersProperty {
    /**
     * Cluster ID.
     *
     * This field can be blank if the `Host` and `Port` are provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-clusterid)
     */
    public fun clusterId(): String? = unwrap(this).getClusterId()

    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * This field can be blank if `ClusterId` is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-host)
     */
    public fun host(): String? = unwrap(this).getHost()

    /**
     * Port.
     *
     * This field can be blank if the `ClusterId` is provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [RedshiftParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterId Cluster ID.
       * This field can be blank if the `Host` and `Port` are provided.
       */
      public fun clusterId(clusterId: String)

      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host.
       * This field can be blank if `ClusterId` is provided.
       */
      public fun host(host: String)

      /**
       * @param port Port.
       * This field can be blank if the `ClusterId` is provided.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.builder()

      /**
       * @param clusterId Cluster ID.
       * This field can be blank if the `Host` and `Port` are provided.
       */
      override fun clusterId(clusterId: String) {
        cdkBuilder.clusterId(clusterId)
      }

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host.
       * This field can be blank if `ClusterId` is provided.
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port.
       * This field can be blank if the `ClusterId` is provided.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty,
    ) : CdkObject(cdkObject), RedshiftParametersProperty {
      /**
       * Cluster ID.
       *
       * This field can be blank if the `Host` and `Port` are provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-clusterid)
       */
      override fun clusterId(): String? = unwrap(this).getClusterId()

      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * This field can be blank if `ClusterId` is provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-host)
       */
      override fun host(): String? = unwrap(this).getHost()

      /**
       * Port.
       *
       * This field can be blank if the `ClusterId` is provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html#cfn-quicksight-datasource-redshiftparameters-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty):
          RedshiftParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          RedshiftParametersProperty

      internal fun unwrap(wrapped: RedshiftParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty
    }
  }

  /**
   * The parameters for Teradata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TeradataParametersProperty teradataParametersProperty = TeradataParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html)
   */
  public interface TeradataParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [TeradataParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty,
    ) : CdkObject(cdkObject), TeradataParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-teradataparameters.html#cfn-quicksight-datasource-teradataparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TeradataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty):
          TeradataParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          TeradataParametersProperty

      internal fun unwrap(wrapped: TeradataParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty
    }
  }

  /**
   * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
   * underlying data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SslPropertiesProperty sslPropertiesProperty = SslPropertiesProperty.builder()
   * .disableSsl(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sslproperties.html)
   */
  public interface SslPropertiesProperty {
    /**
     * A Boolean option to control whether SSL should be disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sslproperties.html#cfn-quicksight-datasource-sslproperties-disablessl)
     */
    public fun disableSsl(): Any? = unwrap(this).getDisableSsl()

    /**
     * A builder for [SslPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disableSsl A Boolean option to control whether SSL should be disabled.
       */
      public fun disableSsl(disableSsl: Boolean)

      /**
       * @param disableSsl A Boolean option to control whether SSL should be disabled.
       */
      public fun disableSsl(disableSsl: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty.builder()

      /**
       * @param disableSsl A Boolean option to control whether SSL should be disabled.
       */
      override fun disableSsl(disableSsl: Boolean) {
        cdkBuilder.disableSsl(disableSsl)
      }

      /**
       * @param disableSsl A Boolean option to control whether SSL should be disabled.
       */
      override fun disableSsl(disableSsl: IResolvable) {
        cdkBuilder.disableSsl(disableSsl.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty,
    ) : CdkObject(cdkObject), SslPropertiesProperty {
      /**
       * A Boolean option to control whether SSL should be disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sslproperties.html#cfn-quicksight-datasource-sslproperties-disablessl)
       */
      override fun disableSsl(): Any? = unwrap(this).getDisableSsl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SslPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty):
          SslPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as SslPropertiesProperty

      internal fun unwrap(wrapped: SslPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty
    }
  }

  /**
   * Oracle parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * OracleParametersProperty oracleParametersProperty = OracleParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html)
   */
  public interface OracleParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [OracleParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty,
    ) : CdkObject(cdkObject), OracleParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-oracleparameters.html#cfn-quicksight-datasource-oracleparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OracleParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty):
          OracleParametersProperty = CdkObjectWrappers.wrap(cdkObject) as OracleParametersProperty

      internal fun unwrap(wrapped: OracleParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty
    }
  }

  /**
   * VPC connection properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * VpcConnectionPropertiesProperty vpcConnectionPropertiesProperty =
   * VpcConnectionPropertiesProperty.builder()
   * .vpcConnectionArn("vpcConnectionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-vpcconnectionproperties.html)
   */
  public interface VpcConnectionPropertiesProperty {
    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-vpcconnectionproperties.html#cfn-quicksight-datasource-vpcconnectionproperties-vpcconnectionarn)
     */
    public fun vpcConnectionArn(): String

    /**
     * A builder for [VpcConnectionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcConnectionArn The Amazon Resource Name (ARN) for the VPC connection. 
       */
      public fun vpcConnectionArn(vpcConnectionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.builder()

      /**
       * @param vpcConnectionArn The Amazon Resource Name (ARN) for the VPC connection. 
       */
      override fun vpcConnectionArn(vpcConnectionArn: String) {
        cdkBuilder.vpcConnectionArn(vpcConnectionArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty,
    ) : CdkObject(cdkObject), VpcConnectionPropertiesProperty {
      /**
       * The Amazon Resource Name (ARN) for the VPC connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-vpcconnectionproperties.html#cfn-quicksight-datasource-vpcconnectionproperties-vpcconnectionarn)
       */
      override fun vpcConnectionArn(): String = unwrap(this).getVpcConnectionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty):
          VpcConnectionPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as
          VpcConnectionPropertiesProperty

      internal fun unwrap(wrapped: VpcConnectionPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty
    }
  }

  /**
   * The parameters for S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * S3ParametersProperty s3ParametersProperty = S3ParametersProperty.builder()
   * .manifestFileLocation(ManifestFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * // the properties below are optional
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html)
   */
  public interface S3ParametersProperty {
    /**
     * Location of the Amazon S3 manifest file.
     *
     * This is NULL if the manifest file was uploaded into Amazon QuickSight.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html#cfn-quicksight-datasource-s3parameters-manifestfilelocation)
     */
    public fun manifestFileLocation(): Any

    /**
     * Use the `RoleArn` structure to override an account-wide role for a specific S3 data source.
     *
     * For example, say an account administrator has turned off all S3 access with an account-wide
     * role. The administrator can then use `RoleArn` to bypass the account-wide role and allow S3
     * access for the single S3 data source that is specified in the structure, even if the
     * account-wide role forbidding S3 access is still active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html#cfn-quicksight-datasource-s3parameters-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [S3ParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      public fun manifestFileLocation(manifestFileLocation: IResolvable)

      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      public fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty)

      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d401bd5d60fc3f30f93f9b08f35377bfd666a889a4f66dc9c5e18ae4d64e6540")
      public
          fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty.Builder.() -> Unit)

      /**
       * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific
       * S3 data source.
       * For example, say an account administrator has turned off all S3 access with an account-wide
       * role. The administrator can then use `RoleArn` to bypass the account-wide role and allow S3
       * access for the single S3 data source that is specified in the structure, even if the
       * account-wide role forbidding S3 access is still active.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.builder()

      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      override fun manifestFileLocation(manifestFileLocation: IResolvable) {
        cdkBuilder.manifestFileLocation(manifestFileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      override fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty) {
        cdkBuilder.manifestFileLocation(manifestFileLocation.let(ManifestFileLocationProperty::unwrap))
      }

      /**
       * @param manifestFileLocation Location of the Amazon S3 manifest file. 
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d401bd5d60fc3f30f93f9b08f35377bfd666a889a4f66dc9c5e18ae4d64e6540")
      override
          fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty.Builder.() -> Unit):
          Unit = manifestFileLocation(ManifestFileLocationProperty(manifestFileLocation))

      /**
       * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific
       * S3 data source.
       * For example, say an account administrator has turned off all S3 access with an account-wide
       * role. The administrator can then use `RoleArn` to bypass the account-wide role and allow S3
       * access for the single S3 data source that is specified in the structure, even if the
       * account-wide role forbidding S3 access is still active.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty,
    ) : CdkObject(cdkObject), S3ParametersProperty {
      /**
       * Location of the Amazon S3 manifest file.
       *
       * This is NULL if the manifest file was uploaded into Amazon QuickSight.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html#cfn-quicksight-datasource-s3parameters-manifestfilelocation)
       */
      override fun manifestFileLocation(): Any = unwrap(this).getManifestFileLocation()

      /**
       * Use the `RoleArn` structure to override an account-wide role for a specific S3 data source.
       *
       * For example, say an account administrator has turned off all S3 access with an account-wide
       * role. The administrator can then use `RoleArn` to bypass the account-wide role and allow S3
       * access for the single S3 data source that is specified in the structure, even if the
       * account-wide role forbidding S3 access is still active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html#cfn-quicksight-datasource-s3parameters-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty):
          S3ParametersProperty = CdkObjectWrappers.wrap(cdkObject) as S3ParametersProperty

      internal fun unwrap(wrapped: S3ParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty
    }
  }

  /**
   * Parameters for Amazon Aurora PostgreSQL-Compatible Edition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * AuroraPostgreSqlParametersProperty auroraPostgreSqlParametersProperty =
   * AuroraPostgreSqlParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html)
   */
  public interface AuroraPostgreSqlParametersProperty {
    /**
     * The Amazon Aurora PostgreSQL database to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-database)
     */
    public fun database(): String

    /**
     * The Amazon Aurora PostgreSQL-Compatible host to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-host)
     */
    public fun host(): String

    /**
     * The port that Amazon Aurora PostgreSQL is listening on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [AuroraPostgreSqlParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database The Amazon Aurora PostgreSQL database to connect to. 
       */
      public fun database(database: String)

      /**
       * @param host The Amazon Aurora PostgreSQL-Compatible host to connect to. 
       */
      public fun host(host: String)

      /**
       * @param port The port that Amazon Aurora PostgreSQL is listening on. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty.builder()

      /**
       * @param database The Amazon Aurora PostgreSQL database to connect to. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host The Amazon Aurora PostgreSQL-Compatible host to connect to. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port that Amazon Aurora PostgreSQL is listening on. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty,
    ) : CdkObject(cdkObject), AuroraPostgreSqlParametersProperty {
      /**
       * The Amazon Aurora PostgreSQL database to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * The Amazon Aurora PostgreSQL-Compatible host to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port that Amazon Aurora PostgreSQL is listening on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html#cfn-quicksight-datasource-aurorapostgresqlparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuroraPostgreSqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty):
          AuroraPostgreSqlParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          AuroraPostgreSqlParametersProperty

      internal fun unwrap(wrapped: AuroraPostgreSqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty
    }
  }

  /**
   * The parameters that are required to connect to a Trino data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TrinoParametersProperty trinoParametersProperty = TrinoParametersProperty.builder()
   * .catalog("catalog")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html)
   */
  public interface TrinoParametersProperty {
    /**
     * The catalog name for the Trino data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-catalog)
     */
    public fun catalog(): String

    /**
     * The host name of the Trino data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-host)
     */
    public fun host(): String

    /**
     * The port for the Trino data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [TrinoParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog The catalog name for the Trino data source. 
       */
      public fun catalog(catalog: String)

      /**
       * @param host The host name of the Trino data source. 
       */
      public fun host(host: String)

      /**
       * @param port The port for the Trino data source. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty.builder()

      /**
       * @param catalog The catalog name for the Trino data source. 
       */
      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param host The host name of the Trino data source. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port for the Trino data source. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty,
    ) : CdkObject(cdkObject), TrinoParametersProperty {
      /**
       * The catalog name for the Trino data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-catalog)
       */
      override fun catalog(): String = unwrap(this).getCatalog()

      /**
       * The host name of the Trino data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port for the Trino data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html#cfn-quicksight-datasource-trinoparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrinoParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty):
          TrinoParametersProperty = CdkObjectWrappers.wrap(cdkObject) as TrinoParametersProperty

      internal fun unwrap(wrapped: TrinoParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty
    }
  }

  /**
   * Permission for the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ResourcePermissionProperty resourcePermissionProperty = ResourcePermissionProperty.builder()
   * .actions(List.of("actions"))
   * .principal("principal")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-resourcepermission.html)
   */
  public interface ResourcePermissionProperty {
    /**
     * The IAM action to grant or revoke permissions on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-resourcepermission.html#cfn-quicksight-datasource-resourcepermission-actions)
     */
    public fun actions(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
     *
     * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
     * (This is common.)
     * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
     * dashboard, template, or theme. (This is common.)
     * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN. Use
     * this option only to share resources (templates) across AWS accounts . (This is less common.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-resourcepermission.html#cfn-quicksight-datasource-resourcepermission-principal)
     */
    public fun principal(): String

    /**
     * A builder for [ResourcePermissionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      public fun actions(vararg actions: String)

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty.builder()

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The IAM action to grant or revoke permissions on. 
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty,
    ) : CdkObject(cdkObject), ResourcePermissionProperty {
      /**
       * The IAM action to grant or revoke permissions on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-resourcepermission.html#cfn-quicksight-datasource-resourcepermission-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
       *
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-resourcepermission.html#cfn-quicksight-datasource-resourcepermission-principal)
       */
      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty):
          ResourcePermissionProperty = CdkObjectWrappers.wrap(cdkObject) as
          ResourcePermissionProperty

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty
    }
  }

  /**
   * The parameters for Presto.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * PrestoParametersProperty prestoParametersProperty = PrestoParametersProperty.builder()
   * .catalog("catalog")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html)
   */
  public interface PrestoParametersProperty {
    /**
     * Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-catalog)
     */
    public fun catalog(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [PrestoParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog Catalog. 
       */
      public fun catalog(catalog: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.builder()

      /**
       * @param catalog Catalog. 
       */
      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty,
    ) : CdkObject(cdkObject), PrestoParametersProperty {
      /**
       * Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-catalog)
       */
      override fun catalog(): String = unwrap(this).getCatalog()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html#cfn-quicksight-datasource-prestoparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrestoParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty):
          PrestoParametersProperty = CdkObjectWrappers.wrap(cdkObject) as PrestoParametersProperty

      internal fun unwrap(wrapped: PrestoParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty
    }
  }

  /**
   * The combination of user name and password that are used as credentials.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html)
   */
  public interface CredentialPairProperty {
    /**
     * A set of alternate data source parameters that you want to share for these credentials.
     *
     * The credentials are applied in tandem with the data source parameters when you copy a data
     * source by using a create or update request. The API operation compares the
     * `DataSourceParameters` structure that's in the request with the structures in the
     * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request is
     * allowed to use the new data source with the existing credentials. If the
     * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
     * these `Credentials` is automatically allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-alternatedatasourceparameters)
     */
    public fun alternateDataSourceParameters(): Any? =
        unwrap(this).getAlternateDataSourceParameters()

    /**
     * Password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-password)
     */
    public fun password(): String

    /**
     * User name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-username)
     */
    public fun username(): String

    /**
     * A builder for [CredentialPairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

      /**
       * @param password Password. 
       */
      public fun password(password: String)

      /**
       * @param username User name. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.builder()

      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      override fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters.let(IResolvable::unwrap))
      }

      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      override fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
      }

      /**
       * @param alternateDataSourceParameters A set of alternate data source parameters that you
       * want to share for these credentials.
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       */
      override fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any): Unit =
          alternateDataSourceParameters(alternateDataSourceParameters.toList())

      /**
       * @param password Password. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username User name. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty,
    ) : CdkObject(cdkObject), CredentialPairProperty {
      /**
       * A set of alternate data source parameters that you want to share for these credentials.
       *
       * The credentials are applied in tandem with the data source parameters when you copy a data
       * source by using a create or update request. The API operation compares the
       * `DataSourceParameters` structure that's in the request with the structures in the
       * `AlternateDataSourceParameters` allow list. If the structures are an exact match, the request
       * is allowed to use the new data source with the existing credentials. If the
       * `AlternateDataSourceParameters` list is null, the `DataSourceParameters` originally used with
       * these `Credentials` is automatically allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-alternatedatasourceparameters)
       */
      override fun alternateDataSourceParameters(): Any? =
          unwrap(this).getAlternateDataSourceParameters()

      /**
       * Password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * User name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-credentialpair.html#cfn-quicksight-datasource-credentialpair-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CredentialPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty):
          CredentialPairProperty = CdkObjectWrappers.wrap(cdkObject) as CredentialPairProperty

      internal fun unwrap(wrapped: CredentialPairProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty
    }
  }

  /**
   * The parameters for OpenSearch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * AmazonOpenSearchParametersProperty amazonOpenSearchParametersProperty =
   * AmazonOpenSearchParametersProperty.builder()
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonopensearchparameters.html)
   */
  public interface AmazonOpenSearchParametersProperty {
    /**
     * The OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonopensearchparameters.html#cfn-quicksight-datasource-amazonopensearchparameters-domain)
     */
    public fun domain(): String

    /**
     * A builder for [AmazonOpenSearchParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domain The OpenSearch domain. 
       */
      public fun domain(domain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty.builder()

      /**
       * @param domain The OpenSearch domain. 
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty,
    ) : CdkObject(cdkObject), AmazonOpenSearchParametersProperty {
      /**
       * The OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonopensearchparameters.html#cfn-quicksight-datasource-amazonopensearchparameters-domain)
       */
      override fun domain(): String = unwrap(this).getDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty):
          AmazonOpenSearchParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          AmazonOpenSearchParametersProperty

      internal fun unwrap(wrapped: AmazonOpenSearchParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty
    }
  }

  /**
   * The parameters that Amazon QuickSight uses to connect to your underlying data source.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html)
   */
  public interface DataSourceParametersProperty {
    /**
     * The parameters for OpenSearch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-amazonelasticsearchparameters)
     */
    public fun amazonElasticsearchParameters(): Any? =
        unwrap(this).getAmazonElasticsearchParameters()

    /**
     * The parameters for OpenSearch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-amazonopensearchparameters)
     */
    public fun amazonOpenSearchParameters(): Any? = unwrap(this).getAmazonOpenSearchParameters()

    /**
     * The parameters for Amazon Athena.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-athenaparameters)
     */
    public fun athenaParameters(): Any? = unwrap(this).getAthenaParameters()

    /**
     * The parameters for Amazon Aurora MySQL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-auroraparameters)
     */
    public fun auroraParameters(): Any? = unwrap(this).getAuroraParameters()

    /**
     * The parameters for Amazon Aurora.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-aurorapostgresqlparameters)
     */
    public fun auroraPostgreSqlParameters(): Any? = unwrap(this).getAuroraPostgreSqlParameters()

    /**
     * The required parameters that are needed to connect to a Databricks data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-databricksparameters)
     */
    public fun databricksParameters(): Any? = unwrap(this).getDatabricksParameters()

    /**
     * The parameters for MariaDB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-mariadbparameters)
     */
    public fun mariaDbParameters(): Any? = unwrap(this).getMariaDbParameters()

    /**
     * The parameters for MySQL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-mysqlparameters)
     */
    public fun mySqlParameters(): Any? = unwrap(this).getMySqlParameters()

    /**
     * Oracle parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-oracleparameters)
     */
    public fun oracleParameters(): Any? = unwrap(this).getOracleParameters()

    /**
     * The parameters for PostgreSQL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-postgresqlparameters)
     */
    public fun postgreSqlParameters(): Any? = unwrap(this).getPostgreSqlParameters()

    /**
     * The parameters for Presto.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-prestoparameters)
     */
    public fun prestoParameters(): Any? = unwrap(this).getPrestoParameters()

    /**
     * The parameters for Amazon RDS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-rdsparameters)
     */
    public fun rdsParameters(): Any? = unwrap(this).getRdsParameters()

    /**
     * The parameters for Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-redshiftparameters)
     */
    public fun redshiftParameters(): Any? = unwrap(this).getRedshiftParameters()

    /**
     * The parameters for S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-s3parameters)
     */
    public fun s3Parameters(): Any? = unwrap(this).getS3Parameters()

    /**
     * The parameters for Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-snowflakeparameters)
     */
    public fun snowflakeParameters(): Any? = unwrap(this).getSnowflakeParameters()

    /**
     * The parameters for Spark.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-sparkparameters)
     */
    public fun sparkParameters(): Any? = unwrap(this).getSparkParameters()

    /**
     * The parameters for SQL Server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-sqlserverparameters)
     */
    public fun sqlServerParameters(): Any? = unwrap(this).getSqlServerParameters()

    /**
     * The parameters that are required to connect to a Starburst data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-starburstparameters)
     */
    public fun starburstParameters(): Any? = unwrap(this).getStarburstParameters()

    /**
     * The parameters for Teradata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-teradataparameters)
     */
    public fun teradataParameters(): Any? = unwrap(this).getTeradataParameters()

    /**
     * The parameters that are required to connect to a Trino data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-trinoparameters)
     */
    public fun trinoParameters(): Any? = unwrap(this).getTrinoParameters()

    /**
     * A builder for [DataSourceParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      public fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable)

      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      public
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty)

      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2153c70132789fb56cdf408e1ebaeb585f6b8100e2aa4fc906cb2e2783da6b6")
      public
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty.Builder.() -> Unit)

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      public fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable)

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      public
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty)

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cace02353382b977c42b8ea4949867a4ac2f45c324dbec1079d03c92602fe820")
      public
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty.Builder.() -> Unit)

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      public fun athenaParameters(athenaParameters: IResolvable)

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      public fun athenaParameters(athenaParameters: AthenaParametersProperty)

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c58f5ad5d332a2a7d756d8992973cc056883d53404b871da40918eb8cc03ac1d")
      public fun athenaParameters(athenaParameters: AthenaParametersProperty.Builder.() -> Unit)

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      public fun auroraParameters(auroraParameters: IResolvable)

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      public fun auroraParameters(auroraParameters: AuroraParametersProperty)

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09515b2d36772646c727317e28a694567ac706fe0a855130ad5c2a1b76f6844")
      public fun auroraParameters(auroraParameters: AuroraParametersProperty.Builder.() -> Unit)

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      public fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable)

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      public
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty)

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3c6d5ad96a230049ff450aafce3cd4c31de10c3420cdcbdc450ea3c5b556b2")
      public
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty.Builder.() -> Unit)

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      public fun databricksParameters(databricksParameters: IResolvable)

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      public fun databricksParameters(databricksParameters: DatabricksParametersProperty)

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f94d35e9ca8d723c5d7e8f8671be3ce033195932307971de6e56b5824d75daa")
      public
          fun databricksParameters(databricksParameters: DatabricksParametersProperty.Builder.() -> Unit)

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      public fun mariaDbParameters(mariaDbParameters: IResolvable)

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      public fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty)

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8dfc6560f1ecfdee4e6c954ff83a8b783c6bb7e798d686f9a41eaf5c8d54097")
      public fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty.Builder.() -> Unit)

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      public fun mySqlParameters(mySqlParameters: IResolvable)

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      public fun mySqlParameters(mySqlParameters: MySqlParametersProperty)

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e793ab3d603d10e4491bd0313ed0e779d66eceb0a5ba76fa715896f351ada4cc")
      public fun mySqlParameters(mySqlParameters: MySqlParametersProperty.Builder.() -> Unit)

      /**
       * @param oracleParameters Oracle parameters.
       */
      public fun oracleParameters(oracleParameters: IResolvable)

      /**
       * @param oracleParameters Oracle parameters.
       */
      public fun oracleParameters(oracleParameters: OracleParametersProperty)

      /**
       * @param oracleParameters Oracle parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ee8e4204253b7e92de79cf58069a22766f6921f7c9146c1b22e24c4af230c7")
      public fun oracleParameters(oracleParameters: OracleParametersProperty.Builder.() -> Unit)

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      public fun postgreSqlParameters(postgreSqlParameters: IResolvable)

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      public fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty)

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0843b21be6225317dfaa48505e7df79e575abbfefe2d32c4a8699d35290a145f")
      public
          fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty.Builder.() -> Unit)

      /**
       * @param prestoParameters The parameters for Presto.
       */
      public fun prestoParameters(prestoParameters: IResolvable)

      /**
       * @param prestoParameters The parameters for Presto.
       */
      public fun prestoParameters(prestoParameters: PrestoParametersProperty)

      /**
       * @param prestoParameters The parameters for Presto.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78059515c713c0bf9b61e0177674e0b7a1a927ee4d1f56137e0249ee21226d2")
      public fun prestoParameters(prestoParameters: PrestoParametersProperty.Builder.() -> Unit)

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      public fun rdsParameters(rdsParameters: IResolvable)

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      public fun rdsParameters(rdsParameters: RdsParametersProperty)

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca5d49532078df9da6d2eac5ef912be5d3969312e1067bdd2a904e7d32b1225f")
      public fun rdsParameters(rdsParameters: RdsParametersProperty.Builder.() -> Unit)

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      public fun redshiftParameters(redshiftParameters: IResolvable)

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      public fun redshiftParameters(redshiftParameters: RedshiftParametersProperty)

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bea46f7205647aa4a150520dd27625d45546af4b1e51091246d80cb7514726f5")
      public
          fun redshiftParameters(redshiftParameters: RedshiftParametersProperty.Builder.() -> Unit)

      /**
       * @param s3Parameters The parameters for S3.
       */
      public fun s3Parameters(s3Parameters: IResolvable)

      /**
       * @param s3Parameters The parameters for S3.
       */
      public fun s3Parameters(s3Parameters: S3ParametersProperty)

      /**
       * @param s3Parameters The parameters for S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d6a142b7a6d4336c3696e6e3c0c89099b11d31f470c6931c56cbfb102b20a20")
      public fun s3Parameters(s3Parameters: S3ParametersProperty.Builder.() -> Unit)

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      public fun snowflakeParameters(snowflakeParameters: IResolvable)

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      public fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty)

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a98c676b487887d316be1869cbbd3342b13057c96182da8a6d6ceef8cd5eb42")
      public
          fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty.Builder.() -> Unit)

      /**
       * @param sparkParameters The parameters for Spark.
       */
      public fun sparkParameters(sparkParameters: IResolvable)

      /**
       * @param sparkParameters The parameters for Spark.
       */
      public fun sparkParameters(sparkParameters: SparkParametersProperty)

      /**
       * @param sparkParameters The parameters for Spark.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b72744628bc594ff8779b64b835ccca7b04fa83bba9a97fd1f9ae1dc433be00b")
      public fun sparkParameters(sparkParameters: SparkParametersProperty.Builder.() -> Unit)

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      public fun sqlServerParameters(sqlServerParameters: IResolvable)

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      public fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty)

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07f1d510b965d1261f5828f33f04be6ef3437a9e1de4cb5fad330f3614b0c2b9")
      public
          fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty.Builder.() -> Unit)

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      public fun starburstParameters(starburstParameters: IResolvable)

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      public fun starburstParameters(starburstParameters: StarburstParametersProperty)

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e60cc94b7b984169f0774ce19bca38f94482a6fdf5b8db568b9cf2f4a70580")
      public
          fun starburstParameters(starburstParameters: StarburstParametersProperty.Builder.() -> Unit)

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      public fun teradataParameters(teradataParameters: IResolvable)

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      public fun teradataParameters(teradataParameters: TeradataParametersProperty)

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc3042e9939672e0a8c2c616fe1a207e7898eadbcddbc2b9f7134a6e1393e834")
      public
          fun teradataParameters(teradataParameters: TeradataParametersProperty.Builder.() -> Unit)

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      public fun trinoParameters(trinoParameters: IResolvable)

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      public fun trinoParameters(trinoParameters: TrinoParametersProperty)

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750e071517f85857906e681d642e8648c75d3c0402bd664ebd30f7debe29ccc3")
      public fun trinoParameters(trinoParameters: TrinoParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty.builder()

      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      override fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters.let(IResolvable::unwrap))
      }

      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      override
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters.let(AmazonElasticsearchParametersProperty::unwrap))
      }

      /**
       * @param amazonElasticsearchParameters The parameters for OpenSearch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2153c70132789fb56cdf408e1ebaeb585f6b8100e2aa4fc906cb2e2783da6b6")
      override
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty.Builder.() -> Unit):
          Unit =
          amazonElasticsearchParameters(AmazonElasticsearchParametersProperty(amazonElasticsearchParameters))

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      override fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters.let(IResolvable::unwrap))
      }

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      override
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters.let(AmazonOpenSearchParametersProperty::unwrap))
      }

      /**
       * @param amazonOpenSearchParameters The parameters for OpenSearch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cace02353382b977c42b8ea4949867a4ac2f45c324dbec1079d03c92602fe820")
      override
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty.Builder.() -> Unit):
          Unit =
          amazonOpenSearchParameters(AmazonOpenSearchParametersProperty(amazonOpenSearchParameters))

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      override fun athenaParameters(athenaParameters: IResolvable) {
        cdkBuilder.athenaParameters(athenaParameters.let(IResolvable::unwrap))
      }

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      override fun athenaParameters(athenaParameters: AthenaParametersProperty) {
        cdkBuilder.athenaParameters(athenaParameters.let(AthenaParametersProperty::unwrap))
      }

      /**
       * @param athenaParameters The parameters for Amazon Athena.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c58f5ad5d332a2a7d756d8992973cc056883d53404b871da40918eb8cc03ac1d")
      override fun athenaParameters(athenaParameters: AthenaParametersProperty.Builder.() -> Unit):
          Unit = athenaParameters(AthenaParametersProperty(athenaParameters))

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      override fun auroraParameters(auroraParameters: IResolvable) {
        cdkBuilder.auroraParameters(auroraParameters.let(IResolvable::unwrap))
      }

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      override fun auroraParameters(auroraParameters: AuroraParametersProperty) {
        cdkBuilder.auroraParameters(auroraParameters.let(AuroraParametersProperty::unwrap))
      }

      /**
       * @param auroraParameters The parameters for Amazon Aurora MySQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09515b2d36772646c727317e28a694567ac706fe0a855130ad5c2a1b76f6844")
      override fun auroraParameters(auroraParameters: AuroraParametersProperty.Builder.() -> Unit):
          Unit = auroraParameters(AuroraParametersProperty(auroraParameters))

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      override fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters.let(IResolvable::unwrap))
      }

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      override
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters.let(AuroraPostgreSqlParametersProperty::unwrap))
      }

      /**
       * @param auroraPostgreSqlParameters The parameters for Amazon Aurora.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3c6d5ad96a230049ff450aafce3cd4c31de10c3420cdcbdc450ea3c5b556b2")
      override
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty.Builder.() -> Unit):
          Unit =
          auroraPostgreSqlParameters(AuroraPostgreSqlParametersProperty(auroraPostgreSqlParameters))

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      override fun databricksParameters(databricksParameters: IResolvable) {
        cdkBuilder.databricksParameters(databricksParameters.let(IResolvable::unwrap))
      }

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      override fun databricksParameters(databricksParameters: DatabricksParametersProperty) {
        cdkBuilder.databricksParameters(databricksParameters.let(DatabricksParametersProperty::unwrap))
      }

      /**
       * @param databricksParameters The required parameters that are needed to connect to a
       * Databricks data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f94d35e9ca8d723c5d7e8f8671be3ce033195932307971de6e56b5824d75daa")
      override
          fun databricksParameters(databricksParameters: DatabricksParametersProperty.Builder.() -> Unit):
          Unit = databricksParameters(DatabricksParametersProperty(databricksParameters))

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      override fun mariaDbParameters(mariaDbParameters: IResolvable) {
        cdkBuilder.mariaDbParameters(mariaDbParameters.let(IResolvable::unwrap))
      }

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      override fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty) {
        cdkBuilder.mariaDbParameters(mariaDbParameters.let(MariaDbParametersProperty::unwrap))
      }

      /**
       * @param mariaDbParameters The parameters for MariaDB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8dfc6560f1ecfdee4e6c954ff83a8b783c6bb7e798d686f9a41eaf5c8d54097")
      override
          fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty.Builder.() -> Unit):
          Unit = mariaDbParameters(MariaDbParametersProperty(mariaDbParameters))

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      override fun mySqlParameters(mySqlParameters: IResolvable) {
        cdkBuilder.mySqlParameters(mySqlParameters.let(IResolvable::unwrap))
      }

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      override fun mySqlParameters(mySqlParameters: MySqlParametersProperty) {
        cdkBuilder.mySqlParameters(mySqlParameters.let(MySqlParametersProperty::unwrap))
      }

      /**
       * @param mySqlParameters The parameters for MySQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e793ab3d603d10e4491bd0313ed0e779d66eceb0a5ba76fa715896f351ada4cc")
      override fun mySqlParameters(mySqlParameters: MySqlParametersProperty.Builder.() -> Unit):
          Unit = mySqlParameters(MySqlParametersProperty(mySqlParameters))

      /**
       * @param oracleParameters Oracle parameters.
       */
      override fun oracleParameters(oracleParameters: IResolvable) {
        cdkBuilder.oracleParameters(oracleParameters.let(IResolvable::unwrap))
      }

      /**
       * @param oracleParameters Oracle parameters.
       */
      override fun oracleParameters(oracleParameters: OracleParametersProperty) {
        cdkBuilder.oracleParameters(oracleParameters.let(OracleParametersProperty::unwrap))
      }

      /**
       * @param oracleParameters Oracle parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ee8e4204253b7e92de79cf58069a22766f6921f7c9146c1b22e24c4af230c7")
      override fun oracleParameters(oracleParameters: OracleParametersProperty.Builder.() -> Unit):
          Unit = oracleParameters(OracleParametersProperty(oracleParameters))

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      override fun postgreSqlParameters(postgreSqlParameters: IResolvable) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters.let(IResolvable::unwrap))
      }

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      override fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters.let(PostgreSqlParametersProperty::unwrap))
      }

      /**
       * @param postgreSqlParameters The parameters for PostgreSQL.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0843b21be6225317dfaa48505e7df79e575abbfefe2d32c4a8699d35290a145f")
      override
          fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty.Builder.() -> Unit):
          Unit = postgreSqlParameters(PostgreSqlParametersProperty(postgreSqlParameters))

      /**
       * @param prestoParameters The parameters for Presto.
       */
      override fun prestoParameters(prestoParameters: IResolvable) {
        cdkBuilder.prestoParameters(prestoParameters.let(IResolvable::unwrap))
      }

      /**
       * @param prestoParameters The parameters for Presto.
       */
      override fun prestoParameters(prestoParameters: PrestoParametersProperty) {
        cdkBuilder.prestoParameters(prestoParameters.let(PrestoParametersProperty::unwrap))
      }

      /**
       * @param prestoParameters The parameters for Presto.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78059515c713c0bf9b61e0177674e0b7a1a927ee4d1f56137e0249ee21226d2")
      override fun prestoParameters(prestoParameters: PrestoParametersProperty.Builder.() -> Unit):
          Unit = prestoParameters(PrestoParametersProperty(prestoParameters))

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      override fun rdsParameters(rdsParameters: IResolvable) {
        cdkBuilder.rdsParameters(rdsParameters.let(IResolvable::unwrap))
      }

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      override fun rdsParameters(rdsParameters: RdsParametersProperty) {
        cdkBuilder.rdsParameters(rdsParameters.let(RdsParametersProperty::unwrap))
      }

      /**
       * @param rdsParameters The parameters for Amazon RDS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca5d49532078df9da6d2eac5ef912be5d3969312e1067bdd2a904e7d32b1225f")
      override fun rdsParameters(rdsParameters: RdsParametersProperty.Builder.() -> Unit): Unit =
          rdsParameters(RdsParametersProperty(rdsParameters))

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      override fun redshiftParameters(redshiftParameters: IResolvable) {
        cdkBuilder.redshiftParameters(redshiftParameters.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      override fun redshiftParameters(redshiftParameters: RedshiftParametersProperty) {
        cdkBuilder.redshiftParameters(redshiftParameters.let(RedshiftParametersProperty::unwrap))
      }

      /**
       * @param redshiftParameters The parameters for Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bea46f7205647aa4a150520dd27625d45546af4b1e51091246d80cb7514726f5")
      override
          fun redshiftParameters(redshiftParameters: RedshiftParametersProperty.Builder.() -> Unit):
          Unit = redshiftParameters(RedshiftParametersProperty(redshiftParameters))

      /**
       * @param s3Parameters The parameters for S3.
       */
      override fun s3Parameters(s3Parameters: IResolvable) {
        cdkBuilder.s3Parameters(s3Parameters.let(IResolvable::unwrap))
      }

      /**
       * @param s3Parameters The parameters for S3.
       */
      override fun s3Parameters(s3Parameters: S3ParametersProperty) {
        cdkBuilder.s3Parameters(s3Parameters.let(S3ParametersProperty::unwrap))
      }

      /**
       * @param s3Parameters The parameters for S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d6a142b7a6d4336c3696e6e3c0c89099b11d31f470c6931c56cbfb102b20a20")
      override fun s3Parameters(s3Parameters: S3ParametersProperty.Builder.() -> Unit): Unit =
          s3Parameters(S3ParametersProperty(s3Parameters))

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      override fun snowflakeParameters(snowflakeParameters: IResolvable) {
        cdkBuilder.snowflakeParameters(snowflakeParameters.let(IResolvable::unwrap))
      }

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      override fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty) {
        cdkBuilder.snowflakeParameters(snowflakeParameters.let(SnowflakeParametersProperty::unwrap))
      }

      /**
       * @param snowflakeParameters The parameters for Snowflake.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a98c676b487887d316be1869cbbd3342b13057c96182da8a6d6ceef8cd5eb42")
      override
          fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty.Builder.() -> Unit):
          Unit = snowflakeParameters(SnowflakeParametersProperty(snowflakeParameters))

      /**
       * @param sparkParameters The parameters for Spark.
       */
      override fun sparkParameters(sparkParameters: IResolvable) {
        cdkBuilder.sparkParameters(sparkParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sparkParameters The parameters for Spark.
       */
      override fun sparkParameters(sparkParameters: SparkParametersProperty) {
        cdkBuilder.sparkParameters(sparkParameters.let(SparkParametersProperty::unwrap))
      }

      /**
       * @param sparkParameters The parameters for Spark.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b72744628bc594ff8779b64b835ccca7b04fa83bba9a97fd1f9ae1dc433be00b")
      override fun sparkParameters(sparkParameters: SparkParametersProperty.Builder.() -> Unit):
          Unit = sparkParameters(SparkParametersProperty(sparkParameters))

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      override fun sqlServerParameters(sqlServerParameters: IResolvable) {
        cdkBuilder.sqlServerParameters(sqlServerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      override fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty) {
        cdkBuilder.sqlServerParameters(sqlServerParameters.let(SqlServerParametersProperty::unwrap))
      }

      /**
       * @param sqlServerParameters The parameters for SQL Server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07f1d510b965d1261f5828f33f04be6ef3437a9e1de4cb5fad330f3614b0c2b9")
      override
          fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty.Builder.() -> Unit):
          Unit = sqlServerParameters(SqlServerParametersProperty(sqlServerParameters))

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      override fun starburstParameters(starburstParameters: IResolvable) {
        cdkBuilder.starburstParameters(starburstParameters.let(IResolvable::unwrap))
      }

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      override fun starburstParameters(starburstParameters: StarburstParametersProperty) {
        cdkBuilder.starburstParameters(starburstParameters.let(StarburstParametersProperty::unwrap))
      }

      /**
       * @param starburstParameters The parameters that are required to connect to a Starburst data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e60cc94b7b984169f0774ce19bca38f94482a6fdf5b8db568b9cf2f4a70580")
      override
          fun starburstParameters(starburstParameters: StarburstParametersProperty.Builder.() -> Unit):
          Unit = starburstParameters(StarburstParametersProperty(starburstParameters))

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      override fun teradataParameters(teradataParameters: IResolvable) {
        cdkBuilder.teradataParameters(teradataParameters.let(IResolvable::unwrap))
      }

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      override fun teradataParameters(teradataParameters: TeradataParametersProperty) {
        cdkBuilder.teradataParameters(teradataParameters.let(TeradataParametersProperty::unwrap))
      }

      /**
       * @param teradataParameters The parameters for Teradata.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc3042e9939672e0a8c2c616fe1a207e7898eadbcddbc2b9f7134a6e1393e834")
      override
          fun teradataParameters(teradataParameters: TeradataParametersProperty.Builder.() -> Unit):
          Unit = teradataParameters(TeradataParametersProperty(teradataParameters))

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      override fun trinoParameters(trinoParameters: IResolvable) {
        cdkBuilder.trinoParameters(trinoParameters.let(IResolvable::unwrap))
      }

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      override fun trinoParameters(trinoParameters: TrinoParametersProperty) {
        cdkBuilder.trinoParameters(trinoParameters.let(TrinoParametersProperty::unwrap))
      }

      /**
       * @param trinoParameters The parameters that are required to connect to a Trino data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750e071517f85857906e681d642e8648c75d3c0402bd664ebd30f7debe29ccc3")
      override fun trinoParameters(trinoParameters: TrinoParametersProperty.Builder.() -> Unit):
          Unit = trinoParameters(TrinoParametersProperty(trinoParameters))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty,
    ) : CdkObject(cdkObject), DataSourceParametersProperty {
      /**
       * The parameters for OpenSearch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-amazonelasticsearchparameters)
       */
      override fun amazonElasticsearchParameters(): Any? =
          unwrap(this).getAmazonElasticsearchParameters()

      /**
       * The parameters for OpenSearch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-amazonopensearchparameters)
       */
      override fun amazonOpenSearchParameters(): Any? = unwrap(this).getAmazonOpenSearchParameters()

      /**
       * The parameters for Amazon Athena.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-athenaparameters)
       */
      override fun athenaParameters(): Any? = unwrap(this).getAthenaParameters()

      /**
       * The parameters for Amazon Aurora MySQL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-auroraparameters)
       */
      override fun auroraParameters(): Any? = unwrap(this).getAuroraParameters()

      /**
       * The parameters for Amazon Aurora.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-aurorapostgresqlparameters)
       */
      override fun auroraPostgreSqlParameters(): Any? = unwrap(this).getAuroraPostgreSqlParameters()

      /**
       * The required parameters that are needed to connect to a Databricks data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-databricksparameters)
       */
      override fun databricksParameters(): Any? = unwrap(this).getDatabricksParameters()

      /**
       * The parameters for MariaDB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-mariadbparameters)
       */
      override fun mariaDbParameters(): Any? = unwrap(this).getMariaDbParameters()

      /**
       * The parameters for MySQL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-mysqlparameters)
       */
      override fun mySqlParameters(): Any? = unwrap(this).getMySqlParameters()

      /**
       * Oracle parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-oracleparameters)
       */
      override fun oracleParameters(): Any? = unwrap(this).getOracleParameters()

      /**
       * The parameters for PostgreSQL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-postgresqlparameters)
       */
      override fun postgreSqlParameters(): Any? = unwrap(this).getPostgreSqlParameters()

      /**
       * The parameters for Presto.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-prestoparameters)
       */
      override fun prestoParameters(): Any? = unwrap(this).getPrestoParameters()

      /**
       * The parameters for Amazon RDS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-rdsparameters)
       */
      override fun rdsParameters(): Any? = unwrap(this).getRdsParameters()

      /**
       * The parameters for Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-redshiftparameters)
       */
      override fun redshiftParameters(): Any? = unwrap(this).getRedshiftParameters()

      /**
       * The parameters for S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-s3parameters)
       */
      override fun s3Parameters(): Any? = unwrap(this).getS3Parameters()

      /**
       * The parameters for Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-snowflakeparameters)
       */
      override fun snowflakeParameters(): Any? = unwrap(this).getSnowflakeParameters()

      /**
       * The parameters for Spark.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-sparkparameters)
       */
      override fun sparkParameters(): Any? = unwrap(this).getSparkParameters()

      /**
       * The parameters for SQL Server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-sqlserverparameters)
       */
      override fun sqlServerParameters(): Any? = unwrap(this).getSqlServerParameters()

      /**
       * The parameters that are required to connect to a Starburst data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-starburstparameters)
       */
      override fun starburstParameters(): Any? = unwrap(this).getStarburstParameters()

      /**
       * The parameters for Teradata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-teradataparameters)
       */
      override fun teradataParameters(): Any? = unwrap(this).getTeradataParameters()

      /**
       * The parameters that are required to connect to a Trino data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceparameters.html#cfn-quicksight-datasource-datasourceparameters-trinoparameters)
       */
      override fun trinoParameters(): Any? = unwrap(this).getTrinoParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty):
          DataSourceParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          DataSourceParametersProperty

      internal fun unwrap(wrapped: DataSourceParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty
    }
  }

  /**
   * Error information for the data source creation or update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DataSourceErrorInfoProperty dataSourceErrorInfoProperty = DataSourceErrorInfoProperty.builder()
   * .message("message")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html)
   */
  public interface DataSourceErrorInfoProperty {
    /**
     * Error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html#cfn-quicksight-datasource-datasourceerrorinfo-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * Error type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html#cfn-quicksight-datasource-datasourceerrorinfo-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DataSourceErrorInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param message Error message.
       */
      public fun message(message: String)

      /**
       * @param type Error type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty.builder()

      /**
       * @param message Error message.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      /**
       * @param type Error type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty,
    ) : CdkObject(cdkObject), DataSourceErrorInfoProperty {
      /**
       * Error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html#cfn-quicksight-datasource-datasourceerrorinfo-message)
       */
      override fun message(): String? = unwrap(this).getMessage()

      /**
       * Error type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html#cfn-quicksight-datasource-datasourceerrorinfo-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceErrorInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty):
          DataSourceErrorInfoProperty = CdkObjectWrappers.wrap(cdkObject) as
          DataSourceErrorInfoProperty

      internal fun unwrap(wrapped: DataSourceErrorInfoProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty
    }
  }

  /**
   * The parameters for SQL Server.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SqlServerParametersProperty sqlServerParametersProperty = SqlServerParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html)
   */
  public interface SqlServerParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [SqlServerParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty,
    ) : CdkObject(cdkObject), SqlServerParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sqlserverparameters.html#cfn-quicksight-datasource-sqlserverparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty):
          SqlServerParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          SqlServerParametersProperty

      internal fun unwrap(wrapped: SqlServerParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty
    }
  }

  /**
   * Parameters for Amazon Athena.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * AthenaParametersProperty athenaParametersProperty = AthenaParametersProperty.builder()
   * .roleArn("roleArn")
   * .workGroup("workGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html)
   */
  public interface AthenaParametersProperty {
    /**
     * Use the `RoleArn` structure to override an account-wide role for a specific Athena data
     * source.
     *
     * For example, say an account administrator has turned off all Athena access with an
     * account-wide role. The administrator can then use `RoleArn` to bypass the account-wide role and
     * allow Athena access for the single Athena data source that is specified in the structure, even
     * if the account-wide role forbidding Athena access is still active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html#cfn-quicksight-datasource-athenaparameters-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The workgroup that Amazon Athena uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html#cfn-quicksight-datasource-athenaparameters-workgroup)
     */
    public fun workGroup(): String? = unwrap(this).getWorkGroup()

    /**
     * A builder for [AthenaParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific
       * Athena data source.
       * For example, say an account administrator has turned off all Athena access with an
       * account-wide role. The administrator can then use `RoleArn` to bypass the account-wide role
       * and allow Athena access for the single Athena data source that is specified in the structure,
       * even if the account-wide role forbidding Athena access is still active.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param workGroup The workgroup that Amazon Athena uses.
       */
      public fun workGroup(workGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty.builder()

      /**
       * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific
       * Athena data source.
       * For example, say an account administrator has turned off all Athena access with an
       * account-wide role. The administrator can then use `RoleArn` to bypass the account-wide role
       * and allow Athena access for the single Athena data source that is specified in the structure,
       * even if the account-wide role forbidding Athena access is still active.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param workGroup The workgroup that Amazon Athena uses.
       */
      override fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty,
    ) : CdkObject(cdkObject), AthenaParametersProperty {
      /**
       * Use the `RoleArn` structure to override an account-wide role for a specific Athena data
       * source.
       *
       * For example, say an account administrator has turned off all Athena access with an
       * account-wide role. The administrator can then use `RoleArn` to bypass the account-wide role
       * and allow Athena access for the single Athena data source that is specified in the structure,
       * even if the account-wide role forbidding Athena access is still active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html#cfn-quicksight-datasource-athenaparameters-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The workgroup that Amazon Athena uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-athenaparameters.html#cfn-quicksight-datasource-athenaparameters-workgroup)
       */
      override fun workGroup(): String? = unwrap(this).getWorkGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AthenaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty):
          AthenaParametersProperty = CdkObjectWrappers.wrap(cdkObject) as AthenaParametersProperty

      internal fun unwrap(wrapped: AthenaParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty
    }
  }

  /**
   * The parameters for Snowflake.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SnowflakeParametersProperty snowflakeParametersProperty = SnowflakeParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .warehouse("warehouse")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html)
   */
  public interface SnowflakeParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-host)
     */
    public fun host(): String

    /**
     * Warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-warehouse)
     */
    public fun warehouse(): String

    /**
     * A builder for [SnowflakeParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param warehouse Warehouse. 
       */
      public fun warehouse(warehouse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param warehouse Warehouse. 
       */
      override fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty,
    ) : CdkObject(cdkObject), SnowflakeParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Warehouse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html#cfn-quicksight-datasource-snowflakeparameters-warehouse)
       */
      override fun warehouse(): String = unwrap(this).getWarehouse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnowflakeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty):
          SnowflakeParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          SnowflakeParametersProperty

      internal fun unwrap(wrapped: SnowflakeParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty
    }
  }

  /**
   * The parameters for Spark.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SparkParametersProperty sparkParametersProperty = SparkParametersProperty.builder()
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html)
   */
  public interface SparkParametersProperty {
    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html#cfn-quicksight-datasource-sparkparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html#cfn-quicksight-datasource-sparkparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [SparkParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty.builder()

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty,
    ) : CdkObject(cdkObject), SparkParametersProperty {
      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html#cfn-quicksight-datasource-sparkparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html#cfn-quicksight-datasource-sparkparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SparkParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty):
          SparkParametersProperty = CdkObjectWrappers.wrap(cdkObject) as SparkParametersProperty

      internal fun unwrap(wrapped: SparkParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty
    }
  }

  /**
   * The parameters that are required to connect to a Starburst data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * StarburstParametersProperty starburstParametersProperty = StarburstParametersProperty.builder()
   * .catalog("catalog")
   * .host("host")
   * .port(123)
   * // the properties below are optional
   * .productType("productType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html)
   */
  public interface StarburstParametersProperty {
    /**
     * The catalog name for the Starburst data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-catalog)
     */
    public fun catalog(): String

    /**
     * The host name of the Starburst data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-host)
     */
    public fun host(): String

    /**
     * The port for the Starburst data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-port)
     */
    public fun port(): Number

    /**
     * The product type for the Starburst data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-producttype)
     */
    public fun productType(): String? = unwrap(this).getProductType()

    /**
     * A builder for [StarburstParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog The catalog name for the Starburst data source. 
       */
      public fun catalog(catalog: String)

      /**
       * @param host The host name of the Starburst data source. 
       */
      public fun host(host: String)

      /**
       * @param port The port for the Starburst data source. 
       */
      public fun port(port: Number)

      /**
       * @param productType The product type for the Starburst data source.
       */
      public fun productType(productType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty.builder()

      /**
       * @param catalog The catalog name for the Starburst data source. 
       */
      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param host The host name of the Starburst data source. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port for the Starburst data source. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param productType The product type for the Starburst data source.
       */
      override fun productType(productType: String) {
        cdkBuilder.productType(productType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty,
    ) : CdkObject(cdkObject), StarburstParametersProperty {
      /**
       * The catalog name for the Starburst data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-catalog)
       */
      override fun catalog(): String = unwrap(this).getCatalog()

      /**
       * The host name of the Starburst data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port for the Starburst data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The product type for the Starburst data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html#cfn-quicksight-datasource-starburstparameters-producttype)
       */
      override fun productType(): String? = unwrap(this).getProductType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StarburstParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty):
          StarburstParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          StarburstParametersProperty

      internal fun unwrap(wrapped: StarburstParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty
    }
  }

  /**
   * Amazon S3 manifest file location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ManifestFileLocationProperty manifestFileLocationProperty =
   * ManifestFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html)
   */
  public interface ManifestFileLocationProperty {
    /**
     * Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html#cfn-quicksight-datasource-manifestfilelocation-bucket)
     */
    public fun bucket(): String

    /**
     * Amazon S3 key that identifies an object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html#cfn-quicksight-datasource-manifestfilelocation-key)
     */
    public fun key(): String

    /**
     * A builder for [ManifestFileLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket Amazon S3 bucket. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key Amazon S3 key that identifies an object. 
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.builder()

      /**
       * @param bucket Amazon S3 bucket. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key Amazon S3 key that identifies an object. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty,
    ) : CdkObject(cdkObject), ManifestFileLocationProperty {
      /**
       * Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html#cfn-quicksight-datasource-manifestfilelocation-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * Amazon S3 key that identifies an object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-manifestfilelocation.html#cfn-quicksight-datasource-manifestfilelocation-key)
       */
      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty):
          ManifestFileLocationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ManifestFileLocationProperty

      internal fun unwrap(wrapped: ManifestFileLocationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty
    }
  }

  /**
   * Data source credentials.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html)
   */
  public interface DataSourceCredentialsProperty {
    /**
     * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to
     * use.
     *
     * When `CopySourceArn` is not null, the credential pair from the data source in the ARN is used
     * as the credentials for the `DataSourceCredentials` structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-copysourcearn)
     */
    public fun copySourceArn(): String? = unwrap(this).getCopySourceArn()

    /**
     * Credential pair.
     *
     * For more information, see
     * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-credentialpair)
     */
    public fun credentialPair(): Any? = unwrap(this).getCredentialPair()

    /**
     * The Amazon Resource Name (ARN) of the secret associated with the data source in AWS Secrets
     * Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [DataSourceCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copySourceArn The Amazon Resource Name (ARN) of a data source that has the
       * credential pair that you want to use.
       * When `CopySourceArn` is not null, the credential pair from the data source in the ARN is
       * used as the credentials for the `DataSourceCredentials` structure.
       */
      public fun copySourceArn(copySourceArn: String)

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      public fun credentialPair(credentialPair: IResolvable)

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      public fun credentialPair(credentialPair: CredentialPairProperty)

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("315871381c49148e355518ab9833e78ced1546740cad061b89e892cea02829dc")
      public fun credentialPair(credentialPair: CredentialPairProperty.Builder.() -> Unit)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret associated with the data
       * source in AWS Secrets Manager .
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty.builder()

      /**
       * @param copySourceArn The Amazon Resource Name (ARN) of a data source that has the
       * credential pair that you want to use.
       * When `CopySourceArn` is not null, the credential pair from the data source in the ARN is
       * used as the credentials for the `DataSourceCredentials` structure.
       */
      override fun copySourceArn(copySourceArn: String) {
        cdkBuilder.copySourceArn(copySourceArn)
      }

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      override fun credentialPair(credentialPair: IResolvable) {
        cdkBuilder.credentialPair(credentialPair.let(IResolvable::unwrap))
      }

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      override fun credentialPair(credentialPair: CredentialPairProperty) {
        cdkBuilder.credentialPair(credentialPair.let(CredentialPairProperty::unwrap))
      }

      /**
       * @param credentialPair Credential pair.
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("315871381c49148e355518ab9833e78ced1546740cad061b89e892cea02829dc")
      override fun credentialPair(credentialPair: CredentialPairProperty.Builder.() -> Unit): Unit =
          credentialPair(CredentialPairProperty(credentialPair))

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the secret associated with the data
       * source in AWS Secrets Manager .
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty,
    ) : CdkObject(cdkObject), DataSourceCredentialsProperty {
      /**
       * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want
       * to use.
       *
       * When `CopySourceArn` is not null, the credential pair from the data source in the ARN is
       * used as the credentials for the `DataSourceCredentials` structure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-copysourcearn)
       */
      override fun copySourceArn(): String? = unwrap(this).getCopySourceArn()

      /**
       * Credential pair.
       *
       * For more information, see
       * `[CredentialPair](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CredentialPair.html)`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-credentialpair)
       */
      override fun credentialPair(): Any? = unwrap(this).getCredentialPair()

      /**
       * The Amazon Resource Name (ARN) of the secret associated with the data source in AWS Secrets
       * Manager .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourcecredentials.html#cfn-quicksight-datasource-datasourcecredentials-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty):
          DataSourceCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as
          DataSourceCredentialsProperty

      internal fun unwrap(wrapped: DataSourceCredentialsProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty
    }
  }

  /**
   * The parameters for MySQL.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * MySqlParametersProperty mySqlParametersProperty = MySqlParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html)
   */
  public interface MySqlParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [MySqlParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty,
    ) : CdkObject(cdkObject), MySqlParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mysqlparameters.html#cfn-quicksight-datasource-mysqlparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MySqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty):
          MySqlParametersProperty = CdkObjectWrappers.wrap(cdkObject) as MySqlParametersProperty

      internal fun unwrap(wrapped: MySqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty
    }
  }

  /**
   * The parameters for OpenSearch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * AmazonElasticsearchParametersProperty amazonElasticsearchParametersProperty =
   * AmazonElasticsearchParametersProperty.builder()
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonelasticsearchparameters.html)
   */
  public interface AmazonElasticsearchParametersProperty {
    /**
     * The OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonelasticsearchparameters.html#cfn-quicksight-datasource-amazonelasticsearchparameters-domain)
     */
    public fun domain(): String

    /**
     * A builder for [AmazonElasticsearchParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domain The OpenSearch domain. 
       */
      public fun domain(domain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.builder()

      /**
       * @param domain The OpenSearch domain. 
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty,
    ) : CdkObject(cdkObject), AmazonElasticsearchParametersProperty {
      /**
       * The OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-amazonelasticsearchparameters.html#cfn-quicksight-datasource-amazonelasticsearchparameters-domain)
       */
      override fun domain(): String = unwrap(this).getDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonElasticsearchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty):
          AmazonElasticsearchParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          AmazonElasticsearchParametersProperty

      internal fun unwrap(wrapped: AmazonElasticsearchParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty
    }
  }

  /**
   * The required parameters that are needed to connect to a Databricks data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DatabricksParametersProperty databricksParametersProperty =
   * DatabricksParametersProperty.builder()
   * .host("host")
   * .port(123)
   * .sqlEndpointPath("sqlEndpointPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html)
   */
  public interface DatabricksParametersProperty {
    /**
     * The host name of the Databricks data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-host)
     */
    public fun host(): String

    /**
     * The port for the Databricks data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-port)
     */
    public fun port(): Number

    /**
     * The HTTP path of the Databricks data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-sqlendpointpath)
     */
    public fun sqlEndpointPath(): String

    /**
     * A builder for [DatabricksParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param host The host name of the Databricks data source. 
       */
      public fun host(host: String)

      /**
       * @param port The port for the Databricks data source. 
       */
      public fun port(port: Number)

      /**
       * @param sqlEndpointPath The HTTP path of the Databricks data source. 
       */
      public fun sqlEndpointPath(sqlEndpointPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty.builder()

      /**
       * @param host The host name of the Databricks data source. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port for the Databricks data source. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param sqlEndpointPath The HTTP path of the Databricks data source. 
       */
      override fun sqlEndpointPath(sqlEndpointPath: String) {
        cdkBuilder.sqlEndpointPath(sqlEndpointPath)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty,
    ) : CdkObject(cdkObject), DatabricksParametersProperty {
      /**
       * The host name of the Databricks data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port for the Databricks data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The HTTP path of the Databricks data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-databricksparameters.html#cfn-quicksight-datasource-databricksparameters-sqlendpointpath)
       */
      override fun sqlEndpointPath(): String = unwrap(this).getSqlEndpointPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabricksParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty):
          DatabricksParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          DatabricksParametersProperty

      internal fun unwrap(wrapped: DatabricksParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty
    }
  }

  /**
   * The parameters for PostgreSQL.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * PostgreSqlParametersProperty postgreSqlParametersProperty =
   * PostgreSqlParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html)
   */
  public interface PostgreSqlParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [PostgreSqlParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty,
    ) : CdkObject(cdkObject), PostgreSqlParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html#cfn-quicksight-datasource-postgresqlparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty):
          PostgreSqlParametersProperty = CdkObjectWrappers.wrap(cdkObject) as
          PostgreSqlParametersProperty

      internal fun unwrap(wrapped: PostgreSqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty
    }
  }

  /**
   * The parameters for MariaDB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * MariaDbParametersProperty mariaDbParametersProperty = MariaDbParametersProperty.builder()
   * .database("database")
   * .host("host")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html)
   */
  public interface MariaDbParametersProperty {
    /**
     * Database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-database)
     */
    public fun database(): String

    /**
     * Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-host)
     */
    public fun host(): String

    /**
     * Port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-port)
     */
    public fun port(): Number

    /**
     * A builder for [MariaDbParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database Database. 
       */
      public fun database(database: String)

      /**
       * @param host Host. 
       */
      public fun host(host: String)

      /**
       * @param port Port. 
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty.builder()

      /**
       * @param database Database. 
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param host Host. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port Port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty,
    ) : CdkObject(cdkObject), MariaDbParametersProperty {
      /**
       * Database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html#cfn-quicksight-datasource-mariadbparameters-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MariaDbParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty):
          MariaDbParametersProperty = CdkObjectWrappers.wrap(cdkObject) as MariaDbParametersProperty

      internal fun unwrap(wrapped: MariaDbParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty
    }
  }
}
