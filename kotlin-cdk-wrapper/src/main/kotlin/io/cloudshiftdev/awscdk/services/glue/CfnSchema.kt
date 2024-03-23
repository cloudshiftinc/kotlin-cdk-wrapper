@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

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
 * The `AWS::Glue::Schema` is an AWS Glue resource type that manages schemas in the AWS Glue Schema
 * Registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
 * .compatibility("compatibility")
 * .dataFormat("dataFormat")
 * .name("name")
 * .schemaDefinition("schemaDefinition")
 * // the properties below are optional
 * .checkpointVersion(SchemaVersionProperty.builder()
 * .isLatest(false)
 * .versionNumber(123)
 * .build())
 * .description("description")
 * .registry(RegistryProperty.builder()
 * .arn("arn")
 * .name("name")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html)
 */
public open class CfnSchema(
  cdkObject: software.amazon.awscdk.services.glue.CfnSchema,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchemaProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnSchema(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSchemaProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSchemaProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSchemaProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the schema.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Represents the version ID associated with the initial schema version.
   */
  public open fun attrInitialSchemaVersionId(): String =
      unwrap(this).getAttrInitialSchemaVersionId()

  /**
   * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
   */
  public open fun checkpointVersion(): Any? = unwrap(this).getCheckpointVersion()

  /**
   * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
   */
  public open fun checkpointVersion(`value`: IResolvable) {
    unwrap(this).setCheckpointVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
   */
  public open fun checkpointVersion(`value`: SchemaVersionProperty) {
    unwrap(this).setCheckpointVersion(`value`.let(SchemaVersionProperty::unwrap))
  }

  /**
   * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f14ad1a485ab2723afb3f5b1b8f0beaf5c5fd8372dbf725dd4a229830232f77")
  public open fun checkpointVersion(`value`: SchemaVersionProperty.Builder.() -> Unit): Unit =
      checkpointVersion(SchemaVersionProperty(`value`))

  /**
   * The compatibility mode of the schema.
   */
  public open fun compatibility(): String = unwrap(this).getCompatibility()

  /**
   * The compatibility mode of the schema.
   */
  public open fun compatibility(`value`: String) {
    unwrap(this).setCompatibility(`value`)
  }

  /**
   * The data format of the schema definition.
   */
  public open fun dataFormat(): String = unwrap(this).getDataFormat()

  /**
   * The data format of the schema definition.
   */
  public open fun dataFormat(`value`: String) {
    unwrap(this).setDataFormat(`value`)
  }

  /**
   * A description of the schema if specified when created.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the schema if specified when created.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
   * hyphen, underscore, dollar sign, or hash mark.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
   * hyphen, underscore, dollar sign, or hash mark.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The registry where a schema is stored.
   */
  public open fun registry(): Any? = unwrap(this).getRegistry()

  /**
   * The registry where a schema is stored.
   */
  public open fun registry(`value`: IResolvable) {
    unwrap(this).setRegistry(`value`.let(IResolvable::unwrap))
  }

  /**
   * The registry where a schema is stored.
   */
  public open fun registry(`value`: RegistryProperty) {
    unwrap(this).setRegistry(`value`.let(RegistryProperty::unwrap))
  }

  /**
   * The registry where a schema is stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("24134c63f1038052ea111cbba6623d0255a0d637aa6bc4b10c27f248e19ccced")
  public open fun registry(`value`: RegistryProperty.Builder.() -> Unit): Unit =
      registry(RegistryProperty(`value`))

  /**
   * The schema definition using the `DataFormat` setting for `SchemaName` .
   */
  public open fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

  /**
   * The schema definition using the `DataFormat` setting for `SchemaName` .
   */
  public open fun schemaDefinition(`value`: String) {
    unwrap(this).setSchemaDefinition(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnSchema].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    public fun checkpointVersion(checkpointVersion: IResolvable)

    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    public fun checkpointVersion(checkpointVersion: SchemaVersionProperty)

    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3eeb7859853555ddbc8e034fa3c713d1c5d55ef36b6839602ae57bb54808494c")
    public fun checkpointVersion(checkpointVersion: SchemaVersionProperty.Builder.() -> Unit)

    /**
     * The compatibility mode of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-compatibility)
     * @param compatibility The compatibility mode of the schema. 
     */
    public fun compatibility(compatibility: String)

    /**
     * The data format of the schema definition.
     *
     * Currently only `AVRO` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-dataformat)
     * @param dataFormat The data format of the schema definition. 
     */
    public fun dataFormat(dataFormat: String)

    /**
     * A description of the schema if specified when created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-description)
     * @param description A description of the schema if specified when created. 
     */
    public fun description(description: String)

    /**
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
     * hyphen, underscore, dollar sign, or hash mark.
     *
     * No whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-name)
     * @param name Name of the schema to be created of max length of 255, and may only contain
     * letters, numbers, hyphen, underscore, dollar sign, or hash mark. 
     */
    public fun name(name: String)

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    public fun registry(registry: IResolvable)

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    public fun registry(registry: RegistryProperty)

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e1c454a8571fb2f1580d2ce942f579497f8e983dfe9fa7a990003f276a9b9d0")
    public fun registry(registry: RegistryProperty.Builder.() -> Unit)

    /**
     * The schema definition using the `DataFormat` setting for `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-schemadefinition)
     * @param schemaDefinition The schema definition using the `DataFormat` setting for `SchemaName`
     * . 
     */
    public fun schemaDefinition(schemaDefinition: String)

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchema.Builder =
        software.amazon.awscdk.services.glue.CfnSchema.Builder.create(scope, id)

    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    override fun checkpointVersion(checkpointVersion: IResolvable) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(IResolvable::unwrap))
    }

    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    override fun checkpointVersion(checkpointVersion: SchemaVersionProperty) {
      cdkBuilder.checkpointVersion(checkpointVersion.let(SchemaVersionProperty::unwrap))
    }

    /**
     * Specify the `VersionNumber` or the `IsLatest` for setting the checkpoint for the schema.
     *
     * This is only required for updating a checkpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-checkpointversion)
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     * checkpoint for the schema. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3eeb7859853555ddbc8e034fa3c713d1c5d55ef36b6839602ae57bb54808494c")
    override fun checkpointVersion(checkpointVersion: SchemaVersionProperty.Builder.() -> Unit):
        Unit = checkpointVersion(SchemaVersionProperty(checkpointVersion))

    /**
     * The compatibility mode of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-compatibility)
     * @param compatibility The compatibility mode of the schema. 
     */
    override fun compatibility(compatibility: String) {
      cdkBuilder.compatibility(compatibility)
    }

    /**
     * The data format of the schema definition.
     *
     * Currently only `AVRO` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-dataformat)
     * @param dataFormat The data format of the schema definition. 
     */
    override fun dataFormat(dataFormat: String) {
      cdkBuilder.dataFormat(dataFormat)
    }

    /**
     * A description of the schema if specified when created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-description)
     * @param description A description of the schema if specified when created. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers,
     * hyphen, underscore, dollar sign, or hash mark.
     *
     * No whitespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-name)
     * @param name Name of the schema to be created of max length of 255, and may only contain
     * letters, numbers, hyphen, underscore, dollar sign, or hash mark. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    override fun registry(registry: IResolvable) {
      cdkBuilder.registry(registry.let(IResolvable::unwrap))
    }

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    override fun registry(registry: RegistryProperty) {
      cdkBuilder.registry(registry.let(RegistryProperty::unwrap))
    }

    /**
     * The registry where a schema is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-registry)
     * @param registry The registry where a schema is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e1c454a8571fb2f1580d2ce942f579497f8e983dfe9fa7a990003f276a9b9d0")
    override fun registry(registry: RegistryProperty.Builder.() -> Unit): Unit =
        registry(RegistryProperty(registry))

    /**
     * The schema definition using the `DataFormat` setting for `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-schemadefinition)
     * @param schemaDefinition The schema definition using the `DataFormat` setting for `SchemaName`
     * . 
     */
    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html#cfn-glue-schema-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnSchema.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema): CfnSchema =
        CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.glue.CfnSchema =
        wrapped.cdkObject as software.amazon.awscdk.services.glue.CfnSchema
  }

  /**
   * Specifies a registry in the AWS Glue Schema Registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * RegistryProperty registryProperty = RegistryProperty.builder()
   * .arn("arn")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html)
   */
  public interface RegistryProperty {
    /**
     * The Amazon Resource Name (ARN) of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html#cfn-glue-schema-registry-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The name of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html#cfn-glue-schema-registry-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [RegistryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the registry.
       */
      public fun arn(arn: String)

      /**
       * @param name The name of the registry.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty.Builder =
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the registry.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param name The name of the registry.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty,
    ) : CdkObject(cdkObject), RegistryProperty {
      /**
       * The Amazon Resource Name (ARN) of the registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html#cfn-glue-schema-registry-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The name of the registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-registry.html#cfn-glue-schema-registry-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty):
          RegistryProperty = CdkObjectWrappers.wrap(cdkObject) as? RegistryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistryProperty):
          software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSchema.RegistryProperty
    }
  }

  /**
   * Specifies the version of a schema.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * SchemaVersionProperty schemaVersionProperty = SchemaVersionProperty.builder()
   * .isLatest(false)
   * .versionNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html)
   */
  public interface SchemaVersionProperty {
    /**
     * Indicates if this version is the latest version of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html#cfn-glue-schema-schemaversion-islatest)
     */
    public fun isLatest(): Any? = unwrap(this).getIsLatest()

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html#cfn-glue-schema-schemaversion-versionnumber)
     */
    public fun versionNumber(): Number? = unwrap(this).getVersionNumber()

    /**
     * A builder for [SchemaVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isLatest Indicates if this version is the latest version of the schema.
       */
      public fun isLatest(isLatest: Boolean)

      /**
       * @param isLatest Indicates if this version is the latest version of the schema.
       */
      public fun isLatest(isLatest: IResolvable)

      /**
       * @param versionNumber The version number of the schema.
       */
      public fun versionNumber(versionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty.builder()

      /**
       * @param isLatest Indicates if this version is the latest version of the schema.
       */
      override fun isLatest(isLatest: Boolean) {
        cdkBuilder.isLatest(isLatest)
      }

      /**
       * @param isLatest Indicates if this version is the latest version of the schema.
       */
      override fun isLatest(isLatest: IResolvable) {
        cdkBuilder.isLatest(isLatest.let(IResolvable::unwrap))
      }

      /**
       * @param versionNumber The version number of the schema.
       */
      override fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty,
    ) : CdkObject(cdkObject), SchemaVersionProperty {
      /**
       * Indicates if this version is the latest version of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html#cfn-glue-schema-schemaversion-islatest)
       */
      override fun isLatest(): Any? = unwrap(this).getIsLatest()

      /**
       * The version number of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-schema-schemaversion.html#cfn-glue-schema-schemaversion-versionnumber)
       */
      override fun versionNumber(): Number? = unwrap(this).getVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty):
          SchemaVersionProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaVersionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaVersionProperty):
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty
    }
  }
}
