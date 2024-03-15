@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a schema mapping, which defines the schema of the input customer records table.
 *
 * The `SchemaMapping` also provides AWS Entity Resolution with some metadata about the table, such
 * as the attribute types of the columns and which columns to match on.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnSchemaMapping cfnSchemaMapping = CfnSchemaMapping.Builder.create(this, "MyCfnSchemaMapping")
 * .mappedInputFields(List.of(SchemaInputAttributeProperty.builder()
 * .fieldName("fieldName")
 * .type("type")
 * // the properties below are optional
 * .groupName("groupName")
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
public open class CfnSchemaMapping internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.entityresolution.CfnSchemaMapping,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The time of this SchemaMapping got created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The boolean value that indicates whether or not a SchemaMapping has MatchingWorkflows that are
   * associated with.
   */
  public open fun attrHasWorkflows(): IResolvable =
      unwrap(this).getAttrHasWorkflows().let(IResolvable::wrap)

  /**
   * The SchemaMapping arn associated with the Schema.
   */
  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  /**
   * The time of this SchemaMapping got last updated at.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

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
   * A list of `MappedInputFields` .
   */
  public open fun mappedInputFields(): Any = unwrap(this).getMappedInputFields()

  /**
   * A list of `MappedInputFields` .
   */
  public open fun mappedInputFields(`value`: IResolvable) {
    unwrap(this).setMappedInputFields(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `MappedInputFields` .
   */
  public open fun mappedInputFields(`value`: List<Any>) {
    unwrap(this).setMappedInputFields(`value`)
  }

  /**
   * A list of `MappedInputFields` .
   */
  public open fun mappedInputFields(vararg `value`: Any): Unit = mappedInputFields(`value`.toList())

  /**
   * The name of the schema.
   */
  public open fun schemaName(): String = unwrap(this).getSchemaName()

  /**
   * The name of the schema.
   */
  public open fun schemaName(`value`: String) {
    unwrap(this).setSchemaName(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.entityresolution.CfnSchemaMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-description)
     * @param description A description of the schema. 
     */
    public fun description(description: String)

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    public fun mappedInputFields(mappedInputFields: IResolvable)

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    public fun mappedInputFields(mappedInputFields: List<Any>)

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    public fun mappedInputFields(vararg mappedInputFields: Any)

    /**
     * The name of the schema.
     *
     * There can't be multiple `SchemaMappings` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-schemaname)
     * @param schemaName The name of the schema. 
     */
    public fun schemaName(schemaName: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.Builder =
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.Builder.create(scope, id)

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-description)
     * @param description A description of the schema. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    override fun mappedInputFields(mappedInputFields: IResolvable) {
      cdkBuilder.mappedInputFields(mappedInputFields.let(IResolvable::unwrap))
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    override fun mappedInputFields(mappedInputFields: List<Any>) {
      cdkBuilder.mappedInputFields(mappedInputFields)
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     * @param mappedInputFields A list of `MappedInputFields` . 
     */
    override fun mappedInputFields(vararg mappedInputFields: Any): Unit =
        mappedInputFields(mappedInputFields.toList())

    /**
     * The name of the schema.
     *
     * There can't be multiple `SchemaMappings` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-schemaname)
     * @param schemaName The name of the schema. 
     */
    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnSchemaMapping =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchemaMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchemaMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMapping):
        CfnSchemaMapping = CfnSchemaMapping(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaMapping):
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping = wrapped.cdkObject
  }

  /**
   * An object containing `FieldName` , `Type` , `GroupName` , and `MatchKey` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * SchemaInputAttributeProperty schemaInputAttributeProperty =
   * SchemaInputAttributeProperty.builder()
   * .fieldName("fieldName")
   * .type("type")
   * // the properties below are optional
   * .groupName("groupName")
   * .matchKey("matchKey")
   * .subType("subType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html)
   */
  public interface SchemaInputAttributeProperty {
    /**
     * A string containing the field name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-fieldname)
     */
    public fun fieldName(): String

    /**
     * Instruct AWS Entity Resolution to combine several columns into a unified column with the
     * identical attribute type.
     *
     * For example, when working with columns such as first_name, middle_name, and last_name,
     * assigning them a common `GroupName` will prompt AWS Entity Resolution to concatenate them into a
     * single value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * A key that allows grouping of multiple input attributes into a unified matching group.
     *
     * For example, let's consider a scenario where the source table contains various addresses,
     * such as `business_address` and `shipping_address` . By assigning the `MatchKey` *Address* to
     * both attributes, AWS Entity Resolution will match records across these fields to create a
     * consolidated matching group. If no `MatchKey` is specified for a column, it won't be utilized
     * for matching purposes but will still be included in the output table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-matchkey)
     */
    public fun matchKey(): String? = unwrap(this).getMatchKey()

    /**
     * The subtype of the attribute, selected from a list of values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-subtype)
     */
    public fun subType(): String? = unwrap(this).getSubType()

    /**
     * The type of the attribute, selected from a list of values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-type)
     */
    public fun type(): String

    /**
     * A builder for [SchemaInputAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName A string containing the field name. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param groupName Instruct AWS Entity Resolution to combine several columns into a unified
       * column with the identical attribute type.
       * For example, when working with columns such as first_name, middle_name, and last_name,
       * assigning them a common `GroupName` will prompt AWS Entity Resolution to concatenate them into
       * a single value.
       */
      public fun groupName(groupName: String)

      /**
       * @param matchKey A key that allows grouping of multiple input attributes into a unified
       * matching group.
       * For example, let's consider a scenario where the source table contains various addresses,
       * such as `business_address` and `shipping_address` . By assigning the `MatchKey` *Address* to
       * both attributes, AWS Entity Resolution will match records across these fields to create a
       * consolidated matching group. If no `MatchKey` is specified for a column, it won't be utilized
       * for matching purposes but will still be included in the output table.
       */
      public fun matchKey(matchKey: String)

      /**
       * @param subType The subtype of the attribute, selected from a list of values.
       */
      public fun subType(subType: String)

      /**
       * @param type The type of the attribute, selected from a list of values. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty.builder()

      /**
       * @param fieldName A string containing the field name. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param groupName Instruct AWS Entity Resolution to combine several columns into a unified
       * column with the identical attribute type.
       * For example, when working with columns such as first_name, middle_name, and last_name,
       * assigning them a common `GroupName` will prompt AWS Entity Resolution to concatenate them into
       * a single value.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param matchKey A key that allows grouping of multiple input attributes into a unified
       * matching group.
       * For example, let's consider a scenario where the source table contains various addresses,
       * such as `business_address` and `shipping_address` . By assigning the `MatchKey` *Address* to
       * both attributes, AWS Entity Resolution will match records across these fields to create a
       * consolidated matching group. If no `MatchKey` is specified for a column, it won't be utilized
       * for matching purposes but will still be included in the output table.
       */
      override fun matchKey(matchKey: String) {
        cdkBuilder.matchKey(matchKey)
      }

      /**
       * @param subType The subtype of the attribute, selected from a list of values.
       */
      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      /**
       * @param type The type of the attribute, selected from a list of values. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty,
    ) : CdkObject(cdkObject), SchemaInputAttributeProperty {
      /**
       * A string containing the field name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * Instruct AWS Entity Resolution to combine several columns into a unified column with the
       * identical attribute type.
       *
       * For example, when working with columns such as first_name, middle_name, and last_name,
       * assigning them a common `GroupName` will prompt AWS Entity Resolution to concatenate them into
       * a single value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * A key that allows grouping of multiple input attributes into a unified matching group.
       *
       * For example, let's consider a scenario where the source table contains various addresses,
       * such as `business_address` and `shipping_address` . By assigning the `MatchKey` *Address* to
       * both attributes, AWS Entity Resolution will match records across these fields to create a
       * consolidated matching group. If no `MatchKey` is specified for a column, it won't be utilized
       * for matching purposes but will still be included in the output table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-matchkey)
       */
      override fun matchKey(): String? = unwrap(this).getMatchKey()

      /**
       * The subtype of the attribute, selected from a list of values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-subtype)
       */
      override fun subType(): String? = unwrap(this).getSubType()

      /**
       * The type of the attribute, selected from a list of values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html#cfn-entityresolution-schemamapping-schemainputattribute-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaInputAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty):
          SchemaInputAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaInputAttributeProperty):
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty
    }
  }
}
