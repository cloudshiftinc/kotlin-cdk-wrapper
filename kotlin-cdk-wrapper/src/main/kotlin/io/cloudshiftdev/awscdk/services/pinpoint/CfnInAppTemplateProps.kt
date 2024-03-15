@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInAppTemplateProps {
  public fun content(): Any? = unwrap(this).getContent()

  public fun customConfig(): Any? = unwrap(this).getCustomConfig()

  public fun layout(): String? = unwrap(this).getLayout()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public fun templateName(): String

  @CdkDslMarker
  public interface Builder {
    public fun content(content: IResolvable)

    public fun content(content: List<Any>)

    public fun content(vararg content: Any)

    public fun customConfig(customConfig: Any)

    public fun layout(layout: String)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps.builder()

    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    override fun content(content: List<Any>) {
      cdkBuilder.content(content)
    }

    override fun content(vararg content: Any): Unit = content(content.toList())

    override fun customConfig(customConfig: Any) {
      cdkBuilder.customConfig(customConfig)
    }

    override fun layout(layout: String) {
      cdkBuilder.layout(layout)
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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps,
  ) : CdkObject(cdkObject), CfnInAppTemplateProps {
    override fun content(): Any? = unwrap(this).getContent()

    override fun customConfig(): Any? = unwrap(this).getCustomConfig()

    override fun layout(): String? = unwrap(this).getLayout()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInAppTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps):
        CfnInAppTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInAppTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
  }
}
