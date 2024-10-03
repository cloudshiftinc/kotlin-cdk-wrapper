@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates and persists a DataIntegration resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appintegrations.*;
 * Object filters;
 * Object objectConfiguration;
 * CfnDataIntegration cfnDataIntegration = CfnDataIntegration.Builder.create(this,
 * "MyCfnDataIntegration")
 * .kmsKey("kmsKey")
 * .name("name")
 * .sourceUri("sourceUri")
 * // the properties below are optional
 * .description("description")
 * .fileConfiguration(FileConfigurationProperty.builder()
 * .folders(List.of("folders"))
 * // the properties below are optional
 * .filters(filters)
 * .build())
 * .objectConfiguration(objectConfiguration)
 * .scheduleConfig(ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .firstExecutionFrom("firstExecutionFrom")
 * .object("object")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html)
 */
public open class CfnDataIntegration(
  cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.appintegrations.CfnDataIntegration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataIntegrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataIntegrationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the DataIntegration.
   */
  public open fun attrDataIntegrationArn(): String = unwrap(this).getAttrDataIntegrationArn()

  /**
   * A unique identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the DataIntegration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the DataIntegration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The configuration for what files should be pulled from the source.
   */
  public open fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

  /**
   * The configuration for what files should be pulled from the source.
   */
  public open fun fileConfiguration(`value`: IResolvable) {
    unwrap(this).setFileConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for what files should be pulled from the source.
   */
  public open fun fileConfiguration(`value`: FileConfigurationProperty) {
    unwrap(this).setFileConfiguration(`value`.let(FileConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration for what files should be pulled from the source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2adc25cd7d4beceeb2ae3fb90f69703b1f105598680a799678b443562f6b9c5")
  public open fun fileConfiguration(`value`: FileConfigurationProperty.Builder.() -> Unit): Unit =
      fileConfiguration(FileConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The KMS key for the DataIntegration.
   */
  public open fun kmsKey(): String = unwrap(this).getKmsKey()

  /**
   * The KMS key for the DataIntegration.
   */
  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  /**
   * The name of the DataIntegration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the DataIntegration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The configuration for what data should be pulled from the source.
   */
  public open fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

  /**
   * The configuration for what data should be pulled from the source.
   */
  public open fun objectConfiguration(`value`: Any) {
    unwrap(this).setObjectConfiguration(`value`)
  }

  /**
   * The name of the data and how often it should be pulled from the source.
   */
  public open fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

  /**
   * The name of the data and how often it should be pulled from the source.
   */
  public open fun scheduleConfig(`value`: IResolvable) {
    unwrap(this).setScheduleConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the data and how often it should be pulled from the source.
   */
  public open fun scheduleConfig(`value`: ScheduleConfigProperty) {
    unwrap(this).setScheduleConfig(`value`.let(ScheduleConfigProperty.Companion::unwrap))
  }

  /**
   * The name of the data and how often it should be pulled from the source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0bbbac3b352d5ac0f9ddecbc6fb862b2d90df91be1216220f1a820a7fb4d8083")
  public open fun scheduleConfig(`value`: ScheduleConfigProperty.Builder.() -> Unit): Unit =
      scheduleConfig(ScheduleConfigProperty(`value`))

  /**
   * The URI of the data source.
   */
  public open fun sourceUri(): String = unwrap(this).getSourceUri()

  /**
   * The URI of the data source.
   */
  public open fun sourceUri(`value`: String) {
    unwrap(this).setSourceUri(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appintegrations.CfnDataIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-description)
     * @param description A description of the DataIntegration. 
     */
    public fun description(description: String)

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    public fun fileConfiguration(fileConfiguration: IResolvable)

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    public fun fileConfiguration(fileConfiguration: FileConfigurationProperty)

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0d3ae32aa8666f3c6576bb12199758f0d36515a44406953f1c58bc5ca298af5")
    public fun fileConfiguration(fileConfiguration: FileConfigurationProperty.Builder.() -> Unit)

    /**
     * The KMS key for the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-kmskey)
     * @param kmsKey The KMS key for the DataIntegration. 
     */
    public fun kmsKey(kmsKey: String)

    /**
     * The name of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-name)
     * @param name The name of the DataIntegration. 
     */
    public fun name(name: String)

    /**
     * The configuration for what data should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-objectconfiguration)
     * @param objectConfiguration The configuration for what data should be pulled from the source. 
     */
    public fun objectConfiguration(objectConfiguration: Any)

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    public fun scheduleConfig(scheduleConfig: IResolvable)

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty)

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19c75c75946003dc2287b741c14dc1d829aedfd5a3d81ce0b4c9da014ce1a1f")
    public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit)

    /**
     * The URI of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-sourceuri)
     * @param sourceUri The URI of the data source. 
     */
    public fun sourceUri(sourceUri: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration.Builder =
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration.Builder.create(scope, id)

    /**
     * A description of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-description)
     * @param description A description of the DataIntegration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    override fun fileConfiguration(fileConfiguration: IResolvable) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    override fun fileConfiguration(fileConfiguration: FileConfigurationProperty) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(FileConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     * @param fileConfiguration The configuration for what files should be pulled from the source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0d3ae32aa8666f3c6576bb12199758f0d36515a44406953f1c58bc5ca298af5")
    override fun fileConfiguration(fileConfiguration: FileConfigurationProperty.Builder.() -> Unit):
        Unit = fileConfiguration(FileConfigurationProperty(fileConfiguration))

    /**
     * The KMS key for the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-kmskey)
     * @param kmsKey The KMS key for the DataIntegration. 
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * The name of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-name)
     * @param name The name of the DataIntegration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The configuration for what data should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-objectconfiguration)
     * @param objectConfiguration The configuration for what data should be pulled from the source. 
     */
    override fun objectConfiguration(objectConfiguration: Any) {
      cdkBuilder.objectConfiguration(objectConfiguration)
    }

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    override fun scheduleConfig(scheduleConfig: IResolvable) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(ScheduleConfigProperty.Companion::unwrap))
    }

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e19c75c75946003dc2287b741c14dc1d829aedfd5a3d81ce0b4c9da014ce1a1f")
    override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit): Unit =
        scheduleConfig(ScheduleConfigProperty(scheduleConfig))

    /**
     * The URI of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-sourceuri)
     * @param sourceUri The URI of the data source. 
     */
    override fun sourceUri(sourceUri: String) {
      cdkBuilder.sourceUri(sourceUri)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnDataIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration):
        CfnDataIntegration = CfnDataIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnDataIntegration):
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnDataIntegration
  }

  /**
   * The configuration for what files should be pulled from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appintegrations.*;
   * Object filters;
   * FileConfigurationProperty fileConfigurationProperty = FileConfigurationProperty.builder()
   * .folders(List.of("folders"))
   * // the properties below are optional
   * .filters(filters)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html)
   */
  public interface FileConfigurationProperty {
    /**
     * Restrictions for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html#cfn-appintegrations-dataintegration-fileconfiguration-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * Identifiers for the source folders to pull all files from recursively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html#cfn-appintegrations-dataintegration-fileconfiguration-folders)
     */
    public fun folders(): List<String>

    /**
     * A builder for [FileConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters Restrictions for what files should be pulled from the source.
       */
      public fun filters(filters: Any)

      /**
       * @param folders Identifiers for the source folders to pull all files from recursively. 
       */
      public fun folders(folders: List<String>)

      /**
       * @param folders Identifiers for the source folders to pull all files from recursively. 
       */
      public fun folders(vararg folders: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty.builder()

      /**
       * @param filters Restrictions for what files should be pulled from the source.
       */
      override fun filters(filters: Any) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param folders Identifiers for the source folders to pull all files from recursively. 
       */
      override fun folders(folders: List<String>) {
        cdkBuilder.folders(folders)
      }

      /**
       * @param folders Identifiers for the source folders to pull all files from recursively. 
       */
      override fun folders(vararg folders: String): Unit = folders(folders.toList())

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty,
    ) : CdkObject(cdkObject),
        FileConfigurationProperty {
      /**
       * Restrictions for what files should be pulled from the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html#cfn-appintegrations-dataintegration-fileconfiguration-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()

      /**
       * Identifiers for the source folders to pull all files from recursively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html#cfn-appintegrations-dataintegration-fileconfiguration-folders)
       */
      override fun folders(): List<String> = unwrap(this).getFolders()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty):
          FileConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FileConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileConfigurationProperty):
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.FileConfigurationProperty
    }
  }

  /**
   * The name of the data and how often it should be pulled from the source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appintegrations.*;
   * ScheduleConfigProperty scheduleConfigProperty = ScheduleConfigProperty.builder()
   * .scheduleExpression("scheduleExpression")
   * // the properties below are optional
   * .firstExecutionFrom("firstExecutionFrom")
   * .object("object")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html)
   */
  public interface ScheduleConfigProperty {
    /**
     * The start date for objects to import in the first flow run as an Unix/epoch timestamp in
     * milliseconds or in ISO-8601 format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-firstexecutionfrom)
     */
    public fun firstExecutionFrom(): String? = unwrap(this).getFirstExecutionFrom()

    /**
     * The name of the object to pull from the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-object)
     */
    public fun `object`(): String? = unwrap(this).getObject()

    /**
     * How often the data should be pulled from data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-scheduleexpression)
     */
    public fun scheduleExpression(): String

    /**
     * A builder for [ScheduleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firstExecutionFrom The start date for objects to import in the first flow run as an
       * Unix/epoch timestamp in milliseconds or in ISO-8601 format.
       */
      public fun firstExecutionFrom(firstExecutionFrom: String)

      /**
       * @param object The name of the object to pull from the data source.
       */
      public fun `object`(`object`: String)

      /**
       * @param scheduleExpression How often the data should be pulled from data source. 
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty.builder()

      /**
       * @param firstExecutionFrom The start date for objects to import in the first flow run as an
       * Unix/epoch timestamp in milliseconds or in ISO-8601 format.
       */
      override fun firstExecutionFrom(firstExecutionFrom: String) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
      }

      /**
       * @param object The name of the object to pull from the data source.
       */
      override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      /**
       * @param scheduleExpression How often the data should be pulled from data source. 
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty,
    ) : CdkObject(cdkObject),
        ScheduleConfigProperty {
      /**
       * The start date for objects to import in the first flow run as an Unix/epoch timestamp in
       * milliseconds or in ISO-8601 format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-firstexecutionfrom)
       */
      override fun firstExecutionFrom(): String? = unwrap(this).getFirstExecutionFrom()

      /**
       * The name of the object to pull from the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-object)
       */
      override fun `object`(): String? = unwrap(this).getObject()

      /**
       * How often the data should be pulled from data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html#cfn-appintegrations-dataintegration-scheduleconfig-scheduleexpression)
       */
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty):
          ScheduleConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigProperty):
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnDataIntegration.ScheduleConfigProperty
    }
  }
}
