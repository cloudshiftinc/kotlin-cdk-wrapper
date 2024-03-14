package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
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
  @Suppress("INAPPLICABLE_JVM_NAME")
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

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    public fun tings(settings: IResolvable)

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    public fun tings(settings: SettingsProperty)

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c39604e34fcba258422b1df3816092070b4c839ccb0f3d3f90ea77f4a50919e")
    public fun tings(settings: SettingsProperty.Builder.() -> Unit)
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

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun tings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c39604e34fcba258422b1df3816092070b4c839ccb0f3d3f90ea77f4a50919e")
    override fun tings(settings: SettingsProperty.Builder.() -> Unit): Unit =
        tings(SettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.dms.CfnDataProvider = wrapped.cdkObject
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe648e536f99226c51402e8eee8ad1e33005dfd09b98a1cb53237bb9ad30d3f")
      override
          fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
          Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

      public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty,
    ) : SettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-postgresqlsettings)
       */
      override fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty):
          SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty,
    ) : PostgreSqlSettingsProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty):
          PostgreSqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
