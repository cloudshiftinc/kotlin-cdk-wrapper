@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnSmsTemplateProps {
  public fun body(): String

  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public fun templateName(): String

  @CdkDslMarker
  public interface Builder {
    public fun body(body: String)

    public fun defaultSubstitutions(defaultSubstitutions: String)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.builder()

    override fun body(body: String) {
      cdkBuilder.body(body)
    }

    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps,
  ) : CdkObject(cdkObject), CfnSmsTemplateProps {
    override fun body(): String = unwrap(this).getBody()

    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSmsTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps):
        CfnSmsTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSmsTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
  }
}
