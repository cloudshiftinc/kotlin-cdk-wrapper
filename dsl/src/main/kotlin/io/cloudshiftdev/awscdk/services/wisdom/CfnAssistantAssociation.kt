package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssistantAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assistantId(): String = unwrap(this).getAssistantId()

  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  public open fun association(): Any = unwrap(this).getAssociation()

  public open fun association(`value`: IResolvable) {
    unwrap(this).setAssociation(`value`.let(IResolvable::unwrap))
  }

  public open fun association(`value`: AssociationDataProperty) {
    unwrap(this).setAssociation(`value`.let(AssociationDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f82105d9aab991526f2f9dc45442aea093a0b7ac098ef7e6b0e00592427e5d92")
  public open fun association(`value`: AssociationDataProperty.Builder.() -> Unit): Unit =
      association(AssociationDataProperty(`value`))

  public open fun associationType(): String = unwrap(this).getAssociationType()

  public open fun associationType(`value`: String) {
    unwrap(this).setAssociationType(`value`)
  }

  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  public open fun attrAssistantAssociationArn(): String =
      unwrap(this).getAttrAssistantAssociationArn()

  public open fun attrAssistantAssociationId(): String =
      unwrap(this).getAttrAssistantAssociationId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun assistantId(assistantId: String)

    public fun association(association: IResolvable)

    public fun association(association: AssociationDataProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dfc74a83d0b1068a26927ba9482deb1f2fc08e5a670593a0d2aa3219048d27c")
    public fun association(association: AssociationDataProperty.Builder.() -> Unit)

    public fun associationType(associationType: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder.create(scope, id)

    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    override fun association(association: IResolvable) {
      cdkBuilder.association(association.let(IResolvable::unwrap))
    }

    override fun association(association: AssociationDataProperty) {
      cdkBuilder.association(association.let(AssociationDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dfc74a83d0b1068a26927ba9482deb1f2fc08e5a670593a0d2aa3219048d27c")
    override fun association(association: AssociationDataProperty.Builder.() -> Unit): Unit =
        association(AssociationDataProperty(association))

    override fun associationType(associationType: String) {
      cdkBuilder.associationType(associationType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssistantAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssistantAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation):
        CfnAssistantAssociation = CfnAssistantAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnAssistantAssociation):
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociation = wrapped.cdkObject
  }

  public interface AssociationDataProperty {
    public fun knowledgeBaseId(): String

    public interface Builder {
      public fun knowledgeBaseId(knowledgeBaseId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty.builder()

      override fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty,
    ) : AssociationDataProperty {
      override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty):
          AssociationDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationDataProperty):
          software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
