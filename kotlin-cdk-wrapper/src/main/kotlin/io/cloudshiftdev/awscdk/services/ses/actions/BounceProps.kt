@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Construction properties for a bounce action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * BounceTemplate bounceTemplate;
 * Topic topic;
 * BounceProps bounceProps = BounceProps.builder()
 * .sender("sender")
 * .template(bounceTemplate)
 * // the properties below are optional
 * .topic(topic)
 * .build();
 * ```
 */
public interface BounceProps {
  /**
   * The email address of the sender of the bounced email.
   *
   * This is the address
   * from which the bounce message will be sent.
   */
  public fun sender(): String

  /**
   * The template containing the message, reply code and status code.
   */
  public fun template(): BounceTemplate

  /**
   * The SNS topic to notify when the bounce action is taken.
   *
   * Default: no notification
   */
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  /**
   * A builder for [BounceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sender The email address of the sender of the bounced email. 
     * This is the address
     * from which the bounce message will be sent.
     */
    public fun sender(sender: String)

    /**
     * @param template The template containing the message, reply code and status code. 
     */
    public fun template(template: BounceTemplate)

    /**
     * @param template The template containing the message, reply code and status code. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e586395a05f9e885bff0fa6fb933e85afe557281be3087ad750cce4bce4241")
    public fun template(template: BounceTemplate.Builder.() -> Unit)

    /**
     * @param topic The SNS topic to notify when the bounce action is taken.
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceProps.Builder =
        software.amazon.awscdk.services.ses.actions.BounceProps.builder()

    /**
     * @param sender The email address of the sender of the bounced email. 
     * This is the address
     * from which the bounce message will be sent.
     */
    override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    /**
     * @param template The template containing the message, reply code and status code. 
     */
    override fun template(template: BounceTemplate) {
      cdkBuilder.template(template.let(BounceTemplate::unwrap))
    }

    /**
     * @param template The template containing the message, reply code and status code. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e586395a05f9e885bff0fa6fb933e85afe557281be3087ad750cce4bce4241")
    override fun template(template: BounceTemplate.Builder.() -> Unit): Unit =
        template(BounceTemplate(template))

    /**
     * @param topic The SNS topic to notify when the bounce action is taken.
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.BounceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceProps,
  ) : CdkObject(cdkObject), BounceProps {
    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address
     * from which the bounce message will be sent.
     */
    override fun sender(): String = unwrap(this).getSender()

    /**
     * The template containing the message, reply code and status code.
     */
    override fun template(): BounceTemplate = unwrap(this).getTemplate().let(BounceTemplate::wrap)

    /**
     * The SNS topic to notify when the bounce action is taken.
     *
     * Default: no notification
     */
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BounceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.BounceProps):
        BounceProps = CdkObjectWrappers.wrap(cdkObject) as? BounceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BounceProps):
        software.amazon.awscdk.services.ses.actions.BounceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.actions.BounceProps
  }
}
