@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAssistantAssociationProps {
  public fun assistantId(): String

  public fun association(): Any

  public fun associationType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assistantId(assistantId: String)

    public fun association(association: IResolvable)

    public fun association(association: CfnAssistantAssociation.AssociationDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f6e0cdff817007d24cc1cdcfa99a228646ef052530af1bf9649c5c92d804fd2")
    public
        fun association(association: CfnAssistantAssociation.AssociationDataProperty.Builder.() -> Unit)

    public fun associationType(associationType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.builder()

    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    override fun association(association: IResolvable) {
      cdkBuilder.association(association.let(IResolvable::unwrap))
    }

    override fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
      cdkBuilder.association(association.let(CfnAssistantAssociation.AssociationDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f6e0cdff817007d24cc1cdcfa99a228646ef052530af1bf9649c5c92d804fd2")
    override
        fun association(association: CfnAssistantAssociation.AssociationDataProperty.Builder.() -> Unit):
        Unit = association(CfnAssistantAssociation.AssociationDataProperty(association))

    override fun associationType(associationType: String) {
      cdkBuilder.associationType(associationType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps,
  ) : CdkObject(cdkObject), CfnAssistantAssociationProps {
    override fun assistantId(): String = unwrap(this).getAssistantId()

    override fun association(): Any = unwrap(this).getAssociation()

    override fun associationType(): String = unwrap(this).getAssociationType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssistantAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps):
        CfnAssistantAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssistantAssociationProps):
        software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps
  }
}
