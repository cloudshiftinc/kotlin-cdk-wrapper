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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
}
