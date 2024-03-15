@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnEmailTemplateProps {
  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  public fun htmlPart(): String? = unwrap(this).getHtmlPart()

  public fun subject(): String

  public fun tags(): Any? = unwrap(this).getTags()

  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public fun templateName(): String

  public fun textPart(): String? = unwrap(this).getTextPart()

  @CdkDslMarker
  public interface Builder {
    public fun defaultSubstitutions(defaultSubstitutions: String)

    public fun htmlPart(htmlPart: String)

    public fun subject(subject: String)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)

    public fun textPart(textPart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.builder()

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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps,
  ) : CdkObject(cdkObject), CfnEmailTemplateProps {
    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    override fun htmlPart(): String? = unwrap(this).getHtmlPart()

    override fun subject(): String = unwrap(this).getSubject()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    override fun templateName(): String = unwrap(this).getTemplateName()

    override fun textPart(): String? = unwrap(this).getTextPart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps):
        CfnEmailTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
  }
}
