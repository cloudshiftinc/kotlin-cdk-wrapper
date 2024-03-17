@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnDataProviderProps cfnDataProviderProps = CfnDataProviderProps.builder()
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
public interface CfnDataProviderProps {
  /**
   * The identifier of the data provider.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen, or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovideridentifier)
   */
  public fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

  /**
   * The name of the data provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovidername)
   */
  public fun dataProviderName(): String? = unwrap(this).getDataProviderName()

  /**
   * A description of the data provider.
   *
   * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
   * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
   * and can only begin with a letter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The type of database engine for the data provider.
   *
   * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` , `"postgres"`
   * , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of `"aurora"`
   * represents Amazon Aurora MySQL-Compatible Edition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-engine)
   */
  public fun engine(): String

  /**
   * The property describes the exact settings which can be modified.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
   */
  public fun exactSettings(): Any? = unwrap(this).getExactSettings()

  /**
   * The settings in JSON format for a data provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
   */
  public fun settings(): Any? = unwrap(this).getSettings()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataProviderIdentifier The identifier of the data provider.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    public fun dataProviderIdentifier(dataProviderIdentifier: String)

    /**
     * @param dataProviderName The name of the data provider.
     */
    public fun dataProviderName(dataProviderName: String)

    /**
     * @param description A description of the data provider.
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     */
    public fun description(description: String)

    /**
     * @param engine The type of database engine for the data provider. 
     * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` ,
     * `"postgres"` , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of
     * `"aurora"` represents Amazon Aurora MySQL-Compatible Edition.
     */
    public fun engine(engine: String)

    /**
     * @param exactSettings The property describes the exact settings which can be modified.
     */
    public fun exactSettings(exactSettings: Boolean)

    /**
     * @param exactSettings The property describes the exact settings which can be modified.
     */
    public fun exactSettings(exactSettings: IResolvable)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    public fun tings(settings: IResolvable)

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    public fun tings(settings: CfnDataProvider.SettingsProperty)

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b475e46ec9dab9f70be7a140914ccb0cd1bf64c0975e2d522e33f8d3266511")
    public fun tings(settings: CfnDataProvider.SettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataProviderProps.Builder =
        software.amazon.awscdk.services.dms.CfnDataProviderProps.builder()

    /**
     * @param dataProviderIdentifier The identifier of the data provider.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    override fun dataProviderIdentifier(dataProviderIdentifier: String) {
      cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    /**
     * @param dataProviderName The name of the data provider.
     */
    override fun dataProviderName(dataProviderName: String) {
      cdkBuilder.dataProviderName(dataProviderName)
    }

    /**
     * @param description A description of the data provider.
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The type of database engine for the data provider. 
     * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` ,
     * `"postgres"` , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of
     * `"aurora"` represents Amazon Aurora MySQL-Compatible Edition.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param exactSettings The property describes the exact settings which can be modified.
     */
    override fun exactSettings(exactSettings: Boolean) {
      cdkBuilder.exactSettings(exactSettings)
    }

    /**
     * @param exactSettings The property describes the exact settings which can be modified.
     */
    override fun exactSettings(exactSettings: IResolvable) {
      cdkBuilder.exactSettings(exactSettings.let(IResolvable::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    override fun tings(settings: CfnDataProvider.SettingsProperty) {
      cdkBuilder.settings(settings.let(CfnDataProvider.SettingsProperty::unwrap))
    }

    /**
     * @param settings The settings in JSON format for a data provider.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b475e46ec9dab9f70be7a140914ccb0cd1bf64c0975e2d522e33f8d3266511")
    override fun tings(settings: CfnDataProvider.SettingsProperty.Builder.() -> Unit): Unit =
        tings(CfnDataProvider.SettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.dms.CfnDataProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnDataProviderProps,
  ) : CdkObject(cdkObject), CfnDataProviderProps {
    /**
     * The identifier of the data provider.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovideridentifier)
     */
    override fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

    /**
     * The name of the data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-dataprovidername)
     */
    override fun dataProviderName(): String? = unwrap(this).getDataProviderName()

    /**
     * A description of the data provider.
     *
     * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
     * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The type of database engine for the data provider.
     *
     * Valid values include `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` ,
     * `"postgres"` , `"sqlserver"` , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of
     * `"aurora"` represents Amazon Aurora MySQL-Compatible Edition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

    /**
     * The property describes the exact settings which can be modified.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-exactsettings)
     */
    override fun exactSettings(): Any? = unwrap(this).getExactSettings()

    /**
     * The settings in JSON format for a data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-settings)
     */
    override fun settings(): Any? = unwrap(this).getSettings()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html#cfn-dms-dataprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProviderProps):
        CfnDataProviderProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataProviderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataProviderProps):
        software.amazon.awscdk.services.dms.CfnDataProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dms.CfnDataProviderProps
  }
}
