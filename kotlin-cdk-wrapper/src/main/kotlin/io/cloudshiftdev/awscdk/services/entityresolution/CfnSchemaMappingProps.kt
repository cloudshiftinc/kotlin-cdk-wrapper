@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSchemaMapping`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnSchemaMappingProps cfnSchemaMappingProps = CfnSchemaMappingProps.builder()
 * .mappedInputFields(List.of(SchemaInputAttributeProperty.builder()
 * .fieldName("fieldName")
 * .type("type")
 * // the properties below are optional
 * .groupName("groupName")
 * .hashed(false)
 * .matchKey("matchKey")
 * .subType("subType")
 * .build()))
 * .schemaName("schemaName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html)
 */
public interface CfnSchemaMappingProps {
  /**
   * A description of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of `MappedInputFields` .
   *
   * Each `MappedInputField` corresponds to a column the source data table, and contains column name
   * plus additional information that AWS Entity Resolution uses for matching.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
   */
  public fun mappedInputFields(): Any

  /**
   * The name of the schema.
   *
   * There can't be multiple `SchemaMappings` with the same name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-schemaname)
   */
  public fun schemaName(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSchemaMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the schema.
     */
    public fun description(description: String)

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(mappedInputFields: IResolvable)

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(mappedInputFields: List<Any>)

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(vararg mappedInputFields: Any)

    /**
     * @param schemaName The name of the schema. 
     * There can't be multiple `SchemaMappings` with the same name.
     */
    public fun schemaName(schemaName: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps.builder()

    /**
     * @param description A description of the schema.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    override fun mappedInputFields(mappedInputFields: IResolvable) {
      cdkBuilder.mappedInputFields(mappedInputFields.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    override fun mappedInputFields(mappedInputFields: List<Any>) {
      cdkBuilder.mappedInputFields(mappedInputFields.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . 
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     */
    override fun mappedInputFields(vararg mappedInputFields: Any): Unit =
        mappedInputFields(mappedInputFields.toList())

    /**
     * @param schemaName The name of the schema. 
     * There can't be multiple `SchemaMappings` with the same name.
     */
    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps,
  ) : CdkObject(cdkObject),
      CfnSchemaMappingProps {
    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     */
    override fun mappedInputFields(): Any = unwrap(this).getMappedInputFields()

    /**
     * The name of the schema.
     *
     * There can't be multiple `SchemaMappings` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-schemaname)
     */
    override fun schemaName(): String = unwrap(this).getSchemaName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps):
        CfnSchemaMappingProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSchemaMappingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaMappingProps):
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps
  }
}
