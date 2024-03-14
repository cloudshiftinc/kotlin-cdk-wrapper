package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEmailTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  public open fun defaultSubstitutions(`value`: String) {
    unwrap(this).setDefaultSubstitutions(`value`)
  }

  public open fun htmlPart(): String? = unwrap(this).getHtmlPart()

  public open fun htmlPart(`value`: String) {
    unwrap(this).setHtmlPart(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subject(): String = unwrap(this).getSubject()

  public open fun subject(`value`: String) {
    unwrap(this).setSubject(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public open fun templateDescription(`value`: String) {
    unwrap(this).setTemplateDescription(`value`)
  }

  public open fun templateName(): String = unwrap(this).getTemplateName()

  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  public open fun textPart(): String? = unwrap(this).getTextPart()

  public open fun textPart(`value`: String) {
    unwrap(this).setTextPart(`value`)
  }

  public interface Builder {
    public fun defaultSubstitutions(defaultSubstitutions: String)

    public fun htmlPart(htmlPart: String)

    public fun subject(subject: String)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)

    public fun textPart(textPart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.Builder.create(scope, id)

    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    override fun htmlPart(htmlPart: String) {
      cdkBuilder.htmlPart(htmlPart)
    }

    override fun subject(subject: String) {
      cdkBuilder.subject(subject)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    override fun textPart(textPart: String) {
      cdkBuilder.textPart(textPart)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate):
        CfnEmailTemplate = CfnEmailTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnEmailTemplate):
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate = wrapped.cdkObject
  }
}
