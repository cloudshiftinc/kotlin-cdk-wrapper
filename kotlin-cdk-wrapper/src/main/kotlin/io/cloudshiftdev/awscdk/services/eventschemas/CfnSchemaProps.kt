@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
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
public interface CfnSchemaProps {
  /**
   * The source of the schema definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-content)
   */
  public fun content(): String

  /**
   * A description of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the schema registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-registryname)
   */
  public fun registryName(): String

  /**
   * The name of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-schemaname)
   */
  public fun schemaName(): String? = unwrap(this).getSchemaName()

  /**
   * Tags associated with the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
   */
  public fun tags(): List<CfnSchema.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnSchema.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * The type of schema.
   *
   * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnSchemaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The source of the schema definition. 
     */
    public fun content(content: String)

    /**
     * @param description A description of the schema.
     */
    public fun description(description: String)

    /**
     * @param registryName The name of the schema registry. 
     */
    public fun registryName(registryName: String)

    /**
     * @param schemaName The name of the schema.
     */
    public fun schemaName(schemaName: String)

    /**
     * @param tags Tags associated with the schema.
     */
    public fun tags(tags: List<CfnSchema.TagsEntryProperty>)

    /**
     * @param tags Tags associated with the schema.
     */
    public fun tags(vararg tags: CfnSchema.TagsEntryProperty)

    /**
     * @param type The type of schema. 
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnSchemaProps.builder()

    /**
     * @param content The source of the schema definition. 
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * @param description A description of the schema.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param registryName The name of the schema registry. 
     */
    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    /**
     * @param schemaName The name of the schema.
     */
    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    /**
     * @param tags Tags associated with the schema.
     */
    override fun tags(tags: List<CfnSchema.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnSchema.TagsEntryProperty.Companion::unwrap))
    }

    /**
     * @param tags Tags associated with the schema.
     */
    override fun tags(vararg tags: CfnSchema.TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * @param type The type of schema. 
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchemaProps,
  ) : CdkObject(cdkObject),
      CfnSchemaProps {
    /**
     * The source of the schema definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-content)
     */
    override fun content(): String = unwrap(this).getContent()

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-registryname)
     */
    override fun registryName(): String = unwrap(this).getRegistryName()

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-schemaname)
     */
    override fun schemaName(): String? = unwrap(this).getSchemaName()

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     */
    override fun tags(): List<CfnSchema.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnSchema.TagsEntryProperty::wrap) ?: emptyList()

    /**
     * The type of schema.
     *
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnSchemaProps):
        CfnSchemaProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSchemaProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.eventschemas.CfnSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnSchemaProps
  }
}
