@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::EventSchemas::Schema` resource to specify an event schema.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
 * .content("content")
 * .registryName("registryName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .schemaName("schemaName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html)
 */
public open class CfnSchema internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The date and time that schema was modified.
   */
  public open fun attrLastModified(): String = unwrap(this).getAttrLastModified()

  /**
   * The ARN of the schema.
   */
  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  /**
   * The name of the schema.
   */
  public open fun attrSchemaName(): String = unwrap(this).getAttrSchemaName()

  /**
   * The version number of the schema.
   */
  public open fun attrSchemaVersion(): String = unwrap(this).getAttrSchemaVersion()

  /**
   * The date the schema version was created.
   */
  public open fun attrVersionCreatedDate(): String = unwrap(this).getAttrVersionCreatedDate()

  /**
   * The source of the schema definition.
   */
  public open fun content(): String = unwrap(this).getContent()

  /**
   * The source of the schema definition.
   */
  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  /**
   * A description of the schema.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the schema.
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
   * The name of the schema registry.
   */
  public open fun registryName(): String = unwrap(this).getRegistryName()

  /**
   * The name of the schema registry.
   */
  public open fun registryName(`value`: String) {
    unwrap(this).setRegistryName(`value`)
  }

  /**
   * The name of the schema.
   */
  public open fun schemaName(): String? = unwrap(this).getSchemaName()

  /**
   * The name of the schema.
   */
  public open fun schemaName(`value`: String) {
    unwrap(this).setSchemaName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags associated with the schema.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * Tags associated with the schema.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  /**
   * Tags associated with the schema.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * The type of schema.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of schema.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eventschemas.CfnSchema].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The source of the schema definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-content)
     * @param content The source of the schema definition. 
     */
    public fun content(content: String)

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-description)
     * @param description A description of the schema. 
     */
    public fun description(description: String)

    /**
     * The name of the schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-registryname)
     * @param registryName The name of the schema registry. 
     */
    public fun registryName(registryName: String)

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-schemaname)
     * @param schemaName The name of the schema. 
     */
    public fun schemaName(schemaName: String)

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     * @param tags Tags associated with the schema. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     * @param tags Tags associated with the schema. 
     */
    public fun tags(vararg tags: TagsEntryProperty)

    /**
     * The type of schema.
     *
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-type)
     * @param type The type of schema. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnSchema.Builder =
        software.amazon.awscdk.services.eventschemas.CfnSchema.Builder.create(scope, id)

    /**
     * The source of the schema definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-content)
     * @param content The source of the schema definition. 
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-description)
     * @param description A description of the schema. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-registryname)
     * @param registryName The name of the schema registry. 
     */
    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-schemaname)
     * @param schemaName The name of the schema. 
     */
    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     * @param tags Tags associated with the schema. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     * @param tags Tags associated with the schema. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * The type of schema.
     *
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-type)
     * @param type The type of schema. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchema = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eventschemas.CfnSchema.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema): CfnSchema
        = CfnSchema(cdkObject)

    internal fun unwrap(wrapped: CfnSchema): software.amazon.awscdk.services.eventschemas.CfnSchema
        = wrapped.cdkObject
  }

  /**
   * Tags to associate with the schema.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eventschemas.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The key of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html#cfn-eventschemas-schema-tagsentry-key)
     */
    public fun key(): String

    /**
     * The value of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html#cfn-eventschemas-schema-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of a key-value pair. 
       */
      public fun key(key: String)

      /**
       * @param value The value of a key-value pair. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.builder()

      /**
       * @param key The key of a key-value pair. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of a key-value pair. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty,
    ) : CdkObject(cdkObject), TagsEntryProperty {
      /**
       * The key of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html#cfn-eventschemas-schema-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html#cfn-eventschemas-schema-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty):
          TagsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as TagsEntryProperty

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty
    }
  }
}
