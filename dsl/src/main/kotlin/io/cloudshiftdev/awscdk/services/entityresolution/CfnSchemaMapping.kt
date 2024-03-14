package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchemaMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMapping,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrHasWorkflows(): IResolvable =
      unwrap(this).getAttrHasWorkflows().let(IResolvable::wrap)

  public open fun attrSchemaArn(): String = unwrap(this).getAttrSchemaArn()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mappedInputFields(): Any = unwrap(this).getMappedInputFields()

  public open fun mappedInputFields(`value`: IResolvable) {
    unwrap(this).setMappedInputFields(`value`.let(IResolvable::unwrap))
  }

  public open fun mappedInputFields(__idx_ac66f0: List<Any>) {
    unwrap(this).setMappedInputFields(__idx_ac66f0)
  }

  public open fun schemaName(): String = unwrap(this).getSchemaName()

  public open fun schemaName(`value`: String) {
    unwrap(this).setSchemaName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun mappedInputFields(mappedInputFields: IResolvable)

    public fun mappedInputFields(mappedInputFields: List<Any>)

    public fun schemaName(schemaName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.Builder =
        software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mappedInputFields(mappedInputFields: IResolvable) {
      cdkBuilder.mappedInputFields(mappedInputFields.let(IResolvable::unwrap))
    }

    override fun mappedInputFields(mappedInputFields: List<Any>) {
      cdkBuilder.mappedInputFields(mappedInputFields)
    }

    override fun schemaName(schemaName: String) {
      cdkBuilder.schemaName(schemaName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnSchemaMapping =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface SchemaInputAttributeProperty {
    public fun fieldName(): String

    public fun groupName(): String? = unwrap(this).getGroupName()

    public fun matchKey(): String? = unwrap(this).getMatchKey()

    public fun subType(): String? = unwrap(this).getSubType()

    public fun type(): String

    public interface Builder {
      public fun fieldName(fieldName: String)

      public fun groupName(groupName: String)

      public fun matchKey(matchKey: String)

      public fun subType(subType: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty.builder()

      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      override fun matchKey(matchKey: String) {
        cdkBuilder.matchKey(matchKey)
      }

      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty,
    ) : SchemaInputAttributeProperty {
      override fun fieldName(): String = unwrap(this).getFieldName()

      override fun groupName(): String? = unwrap(this).getGroupName()

      override fun matchKey(): String? = unwrap(this).getMatchKey()

      override fun subType(): String? = unwrap(this).getSubType()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaInputAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty):
          SchemaInputAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaInputAttributeProperty):
          software.amazon.awscdk.services.entityresolution.CfnSchemaMapping.SchemaInputAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
