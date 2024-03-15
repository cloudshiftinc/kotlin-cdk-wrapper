@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BounceProps {
  public fun sender(): String

  public fun template(): BounceTemplate

  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun sender(sender: String)

    public fun template(template: BounceTemplate)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e586395a05f9e885bff0fa6fb933e85afe557281be3087ad750cce4bce4241")
    public fun template(template: BounceTemplate.Builder.() -> Unit)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceProps.Builder =
        software.amazon.awscdk.services.ses.actions.BounceProps.builder()

    override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    override fun template(template: BounceTemplate) {
      cdkBuilder.template(template.let(BounceTemplate::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e586395a05f9e885bff0fa6fb933e85afe557281be3087ad750cce4bce4241")
    override fun template(template: BounceTemplate.Builder.() -> Unit): Unit =
        template(BounceTemplate(template))

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.BounceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceProps,
  ) : CdkObject(cdkObject), BounceProps {
    override fun sender(): String = unwrap(this).getSender()

    override fun template(): BounceTemplate = unwrap(this).getTemplate().let(BounceTemplate::wrap)

    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BounceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.BounceProps):
        BounceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BounceProps):
        software.amazon.awscdk.services.ses.actions.BounceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.actions.BounceProps
  }
}
