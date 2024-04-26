@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Provides information that defines a data provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnDataProvider cfnDataProvider = CfnDataProvider.Builder.create(this, "MyCfnDataProvider")
 * .engine("engine")
 * // the properties below are optional
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .description("description")
 * .exactSettings(false)
 * .settings(SettingsProperty.builder()
 * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
 * .certificateArn("certificateArn")
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html)
 */
public open class CfnDataProvider(
  cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataProviderProps,
  ) :
      this(software.amazon.awscdk.services.dms.CfnDataProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataProviderProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
   */
  public open fun attrDataProviderArn(): String = unwrap(this).getAttrDataProviderArn()

  /**
   * The time the data provider was created.
   */
  public open fun attrDataProviderCreationTime(): String =
      unwrap(this).getAttrDataProviderCreationTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The identifier of the data provider.
   */
  public open fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

  /**
   * The identifier of the data provider.
   */
  public open fun dataProviderIdentifier(`value`: String) {
    unwrap(this).setDataProviderIdentifier(`value`)
  }

  /**
   * The name of the data provider.
   */
  public open fun dataProviderName(): String? = unwrap(this).getDataProviderName()

  /**
   * The name of the data provider.
   */
  public open fun dataProviderName(`value`: String) {
    unwrap(this).setDataProviderName(`value`)
  }

  /**
   * A description of the data provider.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the data provider.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The type of database engine for the data provider.
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The type of database engine for the data provider.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The property describes the exact settings which can be modified.
   */
  public open fun exactSettings(): Any? = unwrap(this).getExactSettings()

  /**
   * The property describes the exact settings which can be modified.
   */
  public open fun exactSettings(`value`: Boolean) {
    unwrap(this).setExactSettings(`value`)
  }

  /**
   * The property describes the exact settings which can be modified.
   */
  public open fun exactSettings(`value`: IResolvable) {
    unwrap(this).setExactSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(): Any? = unwrap(this).getSettings()

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(`value`: SettingsProperty) {
    unwrap(this).setSettings(`value`.let(SettingsProperty::unwrap))
  }

  /**
   * The settings in JSON format for a data provider.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3edd7636f3be1f86b901cad6e1fc715014e3dbc80786d14014f149bb2e7271b6")
  public open fun settings(`value`: SettingsProperty.Builder.() -> Unit): Unit =
      settings(SettingsProperty(`value`))

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnDataProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the data provider.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovideridentifier)
     * @param dataProviderIdentifier The identifier of the data provider. 
     */
    public fun dataProviderIdentifier(dataProviderIdentifier: String)

    /**
     * The name of the data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovidername)
     * @param dataProviderName The name of the data provider. 
     */
    public fun dataProviderName(dataProviderName: String)

    /**
     * A description of the data provider.
     *
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-description)
     * @param description A description of the data provider. 
     */
    public fun description(description: String)

    /**
     * The type of database engine for the data provider.
     *
     * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` ,
     * `"postgres"` , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of
     * `"aurora"` represents Amazon Aurora MySQL-Compatible Edition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-engine)
     * @param engine The type of database engine for the data provider. 
     */
    public fun engine(engine: String)

    /**
     * The property describes the exact settings which can be modified.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
     * @param exactSettings The property describes the exact settings which can be modified. 
     */
    public fun exactSettings(exactSettings: Boolean)

    /**
     * The property describes the exact settings which can be modified.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
     * @param exactSettings The property describes the exact settings which can be modified. 
     */
    public fun exactSettings(exactSettings: IResolvable)

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    public fun settings(settings: IResolvable)

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    public fun settings(settings: SettingsProperty)

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee40722a720d7943e5c842a5aa735bea262d50da0c487f2b9017c7fe45ea2928")
    public fun settings(settings: SettingsProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataProvider.Builder =
        software.amazon.awscdk.services.dms.CfnDataProvider.Builder.create(scope, id)

    /**
     * The identifier of the data provider.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovideridentifier)
     * @param dataProviderIdentifier The identifier of the data provider. 
     */
    override fun dataProviderIdentifier(dataProviderIdentifier: String) {
      cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    /**
     * The name of the data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovidername)
     * @param dataProviderName The name of the data provider. 
     */
    override fun dataProviderName(dataProviderName: String) {
      cdkBuilder.dataProviderName(dataProviderName)
    }

    /**
     * A description of the data provider.
     *
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-description)
     * @param description A description of the data provider. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The type of database engine for the data provider.
     *
     * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` ,
     * `"postgres"` , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of
     * `"aurora"` represents Amazon Aurora MySQL-Compatible Edition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-engine)
     * @param engine The type of database engine for the data provider. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The property describes the exact settings which can be modified.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
     * @param exactSettings The property describes the exact settings which can be modified. 
     */
    override fun exactSettings(exactSettings: Boolean) {
      cdkBuilder.exactSettings(exactSettings)
    }

    /**
     * The property describes the exact settings which can be modified.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
     * @param exactSettings The property describes the exact settings which can be modified. 
     */
    override fun exactSettings(exactSettings: IResolvable) {
      cdkBuilder.exactSettings(exactSettings.let(IResolvable::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun settings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun settings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee40722a720d7943e5c842a5aa735bea262d50da0c487f2b9017c7fe45ea2928")
    override fun settings(settings: SettingsProperty.Builder.() -> Unit): Unit =
        settings(SettingsProperty(settings))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnDataProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider):
        CfnDataProvider = CfnDataProvider(cdkObject)

    internal fun unwrap(wrapped: CfnDataProvider):
        software.amazon.awscdk.services.dms.CfnDataProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.dms.CfnDataProvider
  }

  /**
   * Provides information that defines a PostgreSQL endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
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
  public interface PostgreSqlSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Database name for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Endpoint TCP port.
     *
     * The default is 5432.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The host name of the endpoint database.
     *
     * For an Amazon RDS PostgreSQL instance, this is the output of
     * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     * , in the
     * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     * .Address` field.
     *
     * For an Aurora PostgreSQL instance, this is the output of
     * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
     * , in the `Endpoint` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-servername)
     */
    public fun serverName(): String? = unwrap(this).getServerName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-sslmode)
     */
    public fun sslMode(): String? = unwrap(this).getSslMode()

    /**
     * A builder for [PostgreSqlSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn the value to be set.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param databaseName Database name for the endpoint.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param port Endpoint TCP port.
       * The default is 5432.
       */
      public fun port(port: Number)

      /**
       * @param serverName The host name of the endpoint database.
       * For an Amazon RDS PostgreSQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora PostgreSQL instance, this is the output of
       * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
       * , in the `Endpoint` field.
       */
      public fun serverName(serverName: String)

      /**
       * @param sslMode the value to be set.
       */
      public fun sslMode(sslMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty.builder()

      /**
       * @param certificateArn the value to be set.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param databaseName Database name for the endpoint.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param port Endpoint TCP port.
       * The default is 5432.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param serverName The host name of the endpoint database.
       * For an Amazon RDS PostgreSQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora PostgreSQL instance, this is the output of
       * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
       * , in the `Endpoint` field.
       */
      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      /**
       * @param sslMode the value to be set.
       */
      override fun sslMode(sslMode: String) {
        cdkBuilder.sslMode(sslMode)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty,
    ) : CdkObject(cdkObject), PostgreSqlSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Endpoint TCP port.
       *
       * The default is 5432.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The host name of the endpoint database.
       *
       * For an Amazon RDS PostgreSQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora PostgreSQL instance, this is the output of
       * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
       * , in the `Endpoint` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-servername)
       */
      override fun serverName(): String? = unwrap(this).getServerName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-sslmode)
       */
      override fun sslMode(): String? = unwrap(this).getSslMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty):
          PostgreSqlSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PostgreSqlSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty
    }
  }

  /**
   * PostgreSqlSettings property identifier.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * SettingsProperty settingsProperty = SettingsProperty.builder()
   * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
   * .certificateArn("certificateArn")
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html)
   */
  public interface SettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-postgresqlsettings)
     */
    public fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

    /**
     * A builder for [SettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param postgreSqlSettings the value to be set.
       */
      public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

      /**
       * @param postgreSqlSettings the value to be set.
       */
      public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty)

      /**
       * @param postgreSqlSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe648e536f99226c51402e8eee8ad1e33005dfd09b98a1cb53237bb9ad30d3f")
      public
          fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty.builder()

      /**
       * @param postgreSqlSettings the value to be set.
       */
      override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
      }

      /**
       * @param postgreSqlSettings the value to be set.
       */
      override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty::unwrap))
      }

      /**
       * @param postgreSqlSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe648e536f99226c51402e8eee8ad1e33005dfd09b98a1cb53237bb9ad30d3f")
      override
          fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
          Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

      public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty,
    ) : CdkObject(cdkObject), SettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-postgresqlsettings)
       */
      override fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty):
          SettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? SettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty
    }
  }
}
