@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDocumentProps {
  public fun attachments(): Any? = unwrap(this).getAttachments()

  public fun content(): Any

  public fun documentFormat(): String? = unwrap(this).getDocumentFormat()

  public fun documentType(): String? = unwrap(this).getDocumentType()

  public fun name(): String? = unwrap(this).getName()

  public fun requires(): Any? = unwrap(this).getRequires()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetType(): String? = unwrap(this).getTargetType()

  public fun updateMethod(): String? = unwrap(this).getUpdateMethod()

  public fun versionName(): String? = unwrap(this).getVersionName()

  @CdkDslMarker
  public interface Builder {
    public fun attachments(attachments: IResolvable)

    public fun attachments(attachments: List<Any>)

    public fun attachments(vararg attachments: Any)

    public fun content(content: Any)

    public fun documentFormat(documentFormat: String)

    public fun documentType(documentType: String)

    public fun name(name: String)

    public fun requires(requires: IResolvable)

    public fun requires(requires: List<Any>)

    public fun requires(vararg requires: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetType(targetType: String)

    public fun updateMethod(updateMethod: String)

    public fun versionName(versionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnDocumentProps.Builder =
        software.amazon.awscdk.services.ssm.CfnDocumentProps.builder()

    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable::unwrap))
    }

    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments)
    }

    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    override fun documentFormat(documentFormat: String) {
      cdkBuilder.documentFormat(documentFormat)
    }

    override fun documentType(documentType: String) {
      cdkBuilder.documentType(documentType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun requires(requires: IResolvable) {
      cdkBuilder.requires(requires.let(IResolvable::unwrap))
    }

    override fun requires(requires: List<Any>) {
      cdkBuilder.requires(requires)
    }

    override fun requires(vararg requires: Any): Unit = requires(requires.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    override fun updateMethod(updateMethod: String) {
      cdkBuilder.updateMethod(updateMethod)
    }

    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnDocumentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnDocumentProps,
  ) : CdkObject(cdkObject), CfnDocumentProps {
    override fun attachments(): Any? = unwrap(this).getAttachments()

    override fun content(): Any = unwrap(this).getContent()

    override fun documentFormat(): String? = unwrap(this).getDocumentFormat()

    override fun documentType(): String? = unwrap(this).getDocumentType()

    override fun name(): String? = unwrap(this).getName()

    override fun requires(): Any? = unwrap(this).getRequires()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetType(): String? = unwrap(this).getTargetType()

    override fun updateMethod(): String? = unwrap(this).getUpdateMethod()

    override fun versionName(): String? = unwrap(this).getVersionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocumentProps):
        CfnDocumentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentProps):
        software.amazon.awscdk.services.ssm.CfnDocumentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.CfnDocumentProps
  }
}
