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
 * .microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty.builder()
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .build())
 * .mySqlSettings(MySqlSettingsProperty.builder()
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .build())
 * .oracleSettings(OracleSettingsProperty.builder()
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * // the properties below are optional
 * .asmServer("asmServer")
 * .certificateArn("certificateArn")
 * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
 * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
 * .secretsManagerSecurityDbEncryptionAccessRoleArn("secretsManagerSecurityDbEncryptionAccessRoleArn")
 * .secretsManagerSecurityDbEncryptionSecretId("secretsManagerSecurityDbEncryptionSecretId")
 * .build())
 * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * // the properties below are optional
 * .certificateArn("certificateArn")
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
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataProviderProps,
  ) :
      this(software.amazon.awscdk.services.dms.CfnDataProvider(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataProviderProps.Companion::unwrap))
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
    unwrap(this).setExactSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(): Any? = unwrap(this).getSettings()

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings in JSON format for a data provider.
   */
  public open fun settings(`value`: SettingsProperty) {
    unwrap(this).setSettings(`value`.let(SettingsProperty.Companion::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
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
      cdkBuilder.exactSettings(exactSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun settings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     * @param settings The settings in JSON format for a data provider. 
     */
    override fun settings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty.Companion::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
   * Provides information that defines a Microsoft SQL Server endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * MicrosoftSqlServerSettingsProperty microsoftSqlServerSettingsProperty =
   * MicrosoftSqlServerSettingsProperty.builder()
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html)
   */
  public interface MicrosoftSqlServerSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Database name for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-databasename)
     */
    public fun databaseName(): String

    /**
     * Endpoint TCP port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-port)
     */
    public fun port(): Number

    /**
     * Fully qualified domain name of the endpoint.
     *
     * For an Amazon RDS SQL Server instance, this is the output of
     * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     * , in the
     * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     * .Address` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-servername)
     */
    public fun serverName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-sslmode)
     */
    public fun sslMode(): String

    /**
     * A builder for [MicrosoftSqlServerSettingsProperty]
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
       */
      public fun port(port: Number)

      /**
       * @param serverName Fully qualified domain name of the endpoint. 
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       */
      public fun serverName(serverName: String)

      /**
       * @param sslMode the value to be set. 
       */
      public fun sslMode(sslMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty.builder()

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
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param serverName Fully qualified domain name of the endpoint. 
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
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
          software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty,
    ) : CdkObject(cdkObject),
        MicrosoftSqlServerSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Endpoint TCP port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * Fully qualified domain name of the endpoint.
       *
       * For an Amazon RDS SQL Server instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-servername)
       */
      override fun serverName(): String = unwrap(this).getServerName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-microsoftsqlserversettings.html#cfn-dms-dataprovider-microsoftsqlserversettings-sslmode)
       */
      override fun sslMode(): String = unwrap(this).getSslMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MicrosoftSqlServerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty):
          MicrosoftSqlServerSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MicrosoftSqlServerSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MicrosoftSqlServerSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataProvider.MicrosoftSqlServerSettingsProperty
    }
  }

  /**
   * Provides information that defines a MySQL endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * MySqlSettingsProperty mySqlSettingsProperty = MySqlSettingsProperty.builder()
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html)
   */
  public interface MySqlSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Endpoint TCP port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-port)
     */
    public fun port(): Number

    /**
     * The host name of the endpoint database.
     *
     * For an Amazon RDS MySQL instance, this is the output of
     * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     * , in the
     * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     * .Address` field.
     *
     * For an Aurora MySQL instance, this is the output of
     * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
     * , in the `Endpoint` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-servername)
     */
    public fun serverName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-sslmode)
     */
    public fun sslMode(): String

    /**
     * A builder for [MySqlSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn the value to be set.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param port Endpoint TCP port. 
       */
      public fun port(port: Number)

      /**
       * @param serverName The host name of the endpoint database. 
       * For an Amazon RDS MySQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora MySQL instance, this is the output of
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
          software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty.builder()

      /**
       * @param certificateArn the value to be set.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param port Endpoint TCP port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param serverName The host name of the endpoint database. 
       * For an Amazon RDS MySQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora MySQL instance, this is the output of
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

      public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty,
    ) : CdkObject(cdkObject),
        MySqlSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Endpoint TCP port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The host name of the endpoint database.
       *
       * For an Amazon RDS MySQL instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * For an Aurora MySQL instance, this is the output of
       * [DescribeDBClusters](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html)
       * , in the `Endpoint` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-servername)
       */
      override fun serverName(): String = unwrap(this).getServerName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-mysqlsettings.html#cfn-dms-dataprovider-mysqlsettings-sslmode)
       */
      override fun sslMode(): String = unwrap(this).getSslMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MySqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty):
          MySqlSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? MySqlSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MySqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataProvider.MySqlSettingsProperty
    }
  }

  /**
   * Provides information that defines an Oracle endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * OracleSettingsProperty oracleSettingsProperty = OracleSettingsProperty.builder()
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .asmServer("asmServer")
   * .certificateArn("certificateArn")
   * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
   * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
   * .secretsManagerSecurityDbEncryptionAccessRoleArn("secretsManagerSecurityDbEncryptionAccessRoleArn")
   * .secretsManagerSecurityDbEncryptionSecretId("secretsManagerSecurityDbEncryptionSecretId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html)
   */
  public interface OracleSettingsProperty {
    /**
     * For an Oracle source endpoint, your ASM server address.
     *
     * You can set this value from the `asm_server` value. You set `asm_server` as part of the extra
     * connection attribute string to access an Oracle server with Binary Reader that uses ASM. For
     * more information, see [Configuration for change data capture (CDC) on an Oracle source
     * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-asmserver)
     */
    public fun asmServer(): String? = unwrap(this).getAsmServer()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Database name for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-databasename)
     */
    public fun databaseName(): String

    /**
     * Endpoint TCP port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-port)
     */
    public fun port(): Number

    /**
     * Required only if your Oracle endpoint uses Automatic Storage Management (ASM).
     *
     * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the `SecretsManagerOracleAsmSecret` . This
     * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of the
     * endpoint.
     *
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
     * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both. For more
     * information on creating this `SecretsManagerOracleAsmSecret` and the
     * `SecretsManagerOracleAsmAccessRoleArn` and `SecretsManagerOracleAsmSecretId` required to access
     * it, see [Using secrets to access AWS Database Migration Service
     * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanageroracleasmaccessrolearn)
     */
    public fun secretsManagerOracleAsmAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

    /**
     * Required only if your Oracle endpoint uses Automatic Storage Management (ASM).
     *
     * The full ARN, partial ARN, or friendly name of the `SecretsManagerOracleAsmSecret` that
     * contains the Oracle ASM connection details for the Oracle endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanageroracleasmsecretid)
     */
    public fun secretsManagerOracleAsmSecretId(): String? =
        unwrap(this).getSecretsManagerOracleAsmSecretId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanagersecuritydbencryptionaccessrolearn)
     */
    public fun secretsManagerSecurityDbEncryptionAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerSecurityDbEncryptionAccessRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanagersecuritydbencryptionsecretid)
     */
    public fun secretsManagerSecurityDbEncryptionSecretId(): String? =
        unwrap(this).getSecretsManagerSecurityDbEncryptionSecretId()

    /**
     * Fully qualified domain name of the endpoint.
     *
     * For an Amazon RDS Oracle instance, this is the output of
     * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
     * , in the
     * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
     * .Address` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-servername)
     */
    public fun serverName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-sslmode)
     */
    public fun sslMode(): String

    /**
     * A builder for [OracleSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param asmServer For an Oracle source endpoint, your ASM server address.
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      public fun asmServer(asmServer: String)

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
       */
      public fun port(port: Number)

      /**
       * @param secretsManagerOracleAsmAccessRoleArn Required only if your Oracle endpoint uses
       * Automatic Storage Management (ASM).
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both. For more
       * information on creating this `SecretsManagerOracleAsmSecret` and the
       * `SecretsManagerOracleAsmAccessRoleArn` and `SecretsManagerOracleAsmSecretId` required to
       * access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      public fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String)

      /**
       * @param secretsManagerOracleAsmSecretId Required only if your Oracle endpoint uses Automatic
       * Storage Management (ASM).
       * The full ARN, partial ARN, or friendly name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       */
      public fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String)

      /**
       * @param secretsManagerSecurityDbEncryptionAccessRoleArn the value to be set.
       */
      public
          fun secretsManagerSecurityDbEncryptionAccessRoleArn(secretsManagerSecurityDbEncryptionAccessRoleArn: String)

      /**
       * @param secretsManagerSecurityDbEncryptionSecretId the value to be set.
       */
      public
          fun secretsManagerSecurityDbEncryptionSecretId(secretsManagerSecurityDbEncryptionSecretId: String)

      /**
       * @param serverName Fully qualified domain name of the endpoint. 
       * For an Amazon RDS Oracle instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       */
      public fun serverName(serverName: String)

      /**
       * @param sslMode the value to be set. 
       */
      public fun sslMode(sslMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty.builder()

      /**
       * @param asmServer For an Oracle source endpoint, your ASM server address.
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       */
      override fun asmServer(asmServer: String) {
        cdkBuilder.asmServer(asmServer)
      }

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
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param secretsManagerOracleAsmAccessRoleArn Required only if your Oracle endpoint uses
       * Automatic Storage Management (ASM).
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both. For more
       * information on creating this `SecretsManagerOracleAsmSecret` and the
       * `SecretsManagerOracleAsmAccessRoleArn` and `SecretsManagerOracleAsmSecretId` required to
       * access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       */
      override
          fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
        cdkBuilder.secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn)
      }

      /**
       * @param secretsManagerOracleAsmSecretId Required only if your Oracle endpoint uses Automatic
       * Storage Management (ASM).
       * The full ARN, partial ARN, or friendly name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       */
      override fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
        cdkBuilder.secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId)
      }

      /**
       * @param secretsManagerSecurityDbEncryptionAccessRoleArn the value to be set.
       */
      override
          fun secretsManagerSecurityDbEncryptionAccessRoleArn(secretsManagerSecurityDbEncryptionAccessRoleArn: String) {
        cdkBuilder.secretsManagerSecurityDbEncryptionAccessRoleArn(secretsManagerSecurityDbEncryptionAccessRoleArn)
      }

      /**
       * @param secretsManagerSecurityDbEncryptionSecretId the value to be set.
       */
      override
          fun secretsManagerSecurityDbEncryptionSecretId(secretsManagerSecurityDbEncryptionSecretId: String) {
        cdkBuilder.secretsManagerSecurityDbEncryptionSecretId(secretsManagerSecurityDbEncryptionSecretId)
      }

      /**
       * @param serverName Fully qualified domain name of the endpoint. 
       * For an Amazon RDS Oracle instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
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

      public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty,
    ) : CdkObject(cdkObject),
        OracleSettingsProperty {
      /**
       * For an Oracle source endpoint, your ASM server address.
       *
       * You can set this value from the `asm_server` value. You set `asm_server` as part of the
       * extra connection attribute string to access an Oracle server with Binary Reader that uses ASM.
       * For more information, see [Configuration for change data capture (CDC) on an Oracle source
       * database](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-asmserver)
       */
      override fun asmServer(): String? = unwrap(this).getAsmServer()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Endpoint TCP port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * Required only if your Oracle endpoint uses Automatic Storage Management (ASM).
       *
       * The full ARN of the IAM role that specifies AWS DMS as the trusted entity and grants the
       * required permissions to access the `SecretsManagerOracleAsmSecret` . This
       * `SecretsManagerOracleAsmSecret` has the secret value that allows access to the Oracle ASM of
       * the endpoint.
       *
       *
       * You can specify one of two sets of values for these permissions. You can specify the values
       * for this setting and `SecretsManagerOracleAsmSecretId` . Or you can specify clear-text values
       * for `AsmUser` , `AsmPassword` , and `AsmServerName` . You can't specify both. For more
       * information on creating this `SecretsManagerOracleAsmSecret` and the
       * `SecretsManagerOracleAsmAccessRoleArn` and `SecretsManagerOracleAsmSecretId` required to
       * access it, see [Using secrets to access AWS Database Migration Service
       * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
       * in the *AWS Database Migration Service User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanageroracleasmaccessrolearn)
       */
      override fun secretsManagerOracleAsmAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerOracleAsmAccessRoleArn()

      /**
       * Required only if your Oracle endpoint uses Automatic Storage Management (ASM).
       *
       * The full ARN, partial ARN, or friendly name of the `SecretsManagerOracleAsmSecret` that
       * contains the Oracle ASM connection details for the Oracle endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanageroracleasmsecretid)
       */
      override fun secretsManagerOracleAsmSecretId(): String? =
          unwrap(this).getSecretsManagerOracleAsmSecretId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanagersecuritydbencryptionaccessrolearn)
       */
      override fun secretsManagerSecurityDbEncryptionAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerSecurityDbEncryptionAccessRoleArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-secretsmanagersecuritydbencryptionsecretid)
       */
      override fun secretsManagerSecurityDbEncryptionSecretId(): String? =
          unwrap(this).getSecretsManagerSecurityDbEncryptionSecretId()

      /**
       * Fully qualified domain name of the endpoint.
       *
       * For an Amazon RDS Oracle instance, this is the output of
       * [DescribeDBInstances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html)
       * , in the
       * `[Endpoint](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Endpoint.html)
       * .Address` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-servername)
       */
      override fun serverName(): String = unwrap(this).getServerName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-oraclesettings.html#cfn-dms-dataprovider-oraclesettings-sslmode)
       */
      override fun sslMode(): String = unwrap(this).getSslMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OracleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty):
          OracleSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? OracleSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OracleSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnDataProvider.OracleSettingsProperty
    }
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
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
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
    public fun databaseName(): String

    /**
     * Endpoint TCP port.
     *
     * The default is 5432.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-port)
     */
    public fun port(): Number

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
    public fun serverName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-sslmode)
     */
    public fun sslMode(): String

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
    ) : CdkObject(cdkObject),
        PostgreSqlSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Database name for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Endpoint TCP port.
       *
       * The default is 5432.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-port)
       */
      override fun port(): Number = unwrap(this).getPort()

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
      override fun serverName(): String = unwrap(this).getServerName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-postgresqlsettings.html#cfn-dms-dataprovider-postgresqlsettings-sslmode)
       */
      override fun sslMode(): String = unwrap(this).getSslMode()
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
   * The property identifies the exact type of settings for the data provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * SettingsProperty settingsProperty = SettingsProperty.builder()
   * .microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty.builder()
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .build())
   * .mySqlSettings(MySqlSettingsProperty.builder()
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .build())
   * .oracleSettings(OracleSettingsProperty.builder()
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .asmServer("asmServer")
   * .certificateArn("certificateArn")
   * .secretsManagerOracleAsmAccessRoleArn("secretsManagerOracleAsmAccessRoleArn")
   * .secretsManagerOracleAsmSecretId("secretsManagerOracleAsmSecretId")
   * .secretsManagerSecurityDbEncryptionAccessRoleArn("secretsManagerSecurityDbEncryptionAccessRoleArn")
   * .secretsManagerSecurityDbEncryptionSecretId("secretsManagerSecurityDbEncryptionSecretId")
   * .build())
   * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
   * .databaseName("databaseName")
   * .port(123)
   * .serverName("serverName")
   * .sslMode("sslMode")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html)
   */
  public interface SettingsProperty {
    /**
     * MicrosoftSqlServerSettings property identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-microsoftsqlserversettings)
     */
    public fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

    /**
     * MySqlSettings property identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-mysqlsettings)
     */
    public fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

    /**
     * OracleSettings property identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-oraclesettings)
     */
    public fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

    /**
     * PostgreSqlSettings property identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-postgresqlsettings)
     */
    public fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

    /**
     * A builder for [SettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable)

      /**
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      public
          fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty)

      /**
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61f8503042f0cca48195edeb6a80756458cfe5b9a3e185af4a0c029631fd1f49")
      public
          fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit)

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      public fun mySqlSettings(mySqlSettings: IResolvable)

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty)

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285f533a2a86786bbd49792744092e8a015fab234d2f6e5eca431d66fd95b5e8")
      public fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit)

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      public fun oracleSettings(oracleSettings: IResolvable)

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      public fun oracleSettings(oracleSettings: OracleSettingsProperty)

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c9d21f3d450ca559ab4aa920af14200df18e4c73e4595cd8c56ea2d2063ba94")
      public fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit)

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
       */
      public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
       */
      public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty)

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
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
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      override fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
        cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      override
          fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty) {
        cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings.let(MicrosoftSqlServerSettingsProperty.Companion::unwrap))
      }

      /**
       * @param microsoftSqlServerSettings MicrosoftSqlServerSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61f8503042f0cca48195edeb6a80756458cfe5b9a3e185af4a0c029631fd1f49")
      override
          fun microsoftSqlServerSettings(microsoftSqlServerSettings: MicrosoftSqlServerSettingsProperty.Builder.() -> Unit):
          Unit =
          microsoftSqlServerSettings(MicrosoftSqlServerSettingsProperty(microsoftSqlServerSettings))

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      override fun mySqlSettings(mySqlSettings: IResolvable) {
        cdkBuilder.mySqlSettings(mySqlSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty) {
        cdkBuilder.mySqlSettings(mySqlSettings.let(MySqlSettingsProperty.Companion::unwrap))
      }

      /**
       * @param mySqlSettings MySqlSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285f533a2a86786bbd49792744092e8a015fab234d2f6e5eca431d66fd95b5e8")
      override fun mySqlSettings(mySqlSettings: MySqlSettingsProperty.Builder.() -> Unit): Unit =
          mySqlSettings(MySqlSettingsProperty(mySqlSettings))

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      override fun oracleSettings(oracleSettings: IResolvable) {
        cdkBuilder.oracleSettings(oracleSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      override fun oracleSettings(oracleSettings: OracleSettingsProperty) {
        cdkBuilder.oracleSettings(oracleSettings.let(OracleSettingsProperty.Companion::unwrap))
      }

      /**
       * @param oracleSettings OracleSettings property identifier.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c9d21f3d450ca559ab4aa920af14200df18e4c73e4595cd8c56ea2d2063ba94")
      override fun oracleSettings(oracleSettings: OracleSettingsProperty.Builder.() -> Unit): Unit =
          oracleSettings(OracleSettingsProperty(oracleSettings))

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
       */
      override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
       */
      override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty.Companion::unwrap))
      }

      /**
       * @param postgreSqlSettings PostgreSqlSettings property identifier.
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
    ) : CdkObject(cdkObject),
        SettingsProperty {
      /**
       * MicrosoftSqlServerSettings property identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-microsoftsqlserversettings)
       */
      override fun microsoftSqlServerSettings(): Any? = unwrap(this).getMicrosoftSqlServerSettings()

      /**
       * MySqlSettings property identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-mysqlsettings)
       */
      override fun mySqlSettings(): Any? = unwrap(this).getMySqlSettings()

      /**
       * OracleSettings property identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html#cfn-dms-dataprovider-settings-oraclesettings)
       */
      override fun oracleSettings(): Any? = unwrap(this).getOracleSettings()

      /**
       * PostgreSqlSettings property identifier.
       *
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
