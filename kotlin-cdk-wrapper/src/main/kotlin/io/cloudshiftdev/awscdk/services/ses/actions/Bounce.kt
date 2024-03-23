@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Rejects the received email by returning a bounce response to the sender and, optionally,
 * publishes a notification to Amazon SNS.
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
 * Bounce bounce = Bounce.Builder.create()
 * .sender("sender")
 * .template(bounceTemplate)
 * // the properties below are optional
 * .topic(topic)
 * .build();
 * ```
 */
public open class Bounce(
  cdkObject: software.amazon.awscdk.services.ses.actions.Bounce,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public constructor(props: BounceProps) :
      this(software.amazon.awscdk.services.ses.actions.Bounce(props.let(BounceProps::unwrap))
  )

  public constructor(props: BounceProps.Builder.() -> Unit) : this(BounceProps(props)
  )

  /**
   * Returns the receipt rule action specification.
   *
   * @param _rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.Bounce].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address
     * from which the bounce message will be sent.
     *
     * @param sender The email address of the sender of the bounced email. 
     */
    public fun sender(sender: String)

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code. 
     */
    public fun template(template: BounceTemplate)

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5c274363373a138b9e6be078a174b21734665aa6da0a46e552d7ebb47c626")
    public fun template(template: BounceTemplate.Builder.() -> Unit)

    /**
     * The SNS topic to notify when the bounce action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the bounce action is taken. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Bounce.Builder =
        software.amazon.awscdk.services.ses.actions.Bounce.Builder.create()

    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address
     * from which the bounce message will be sent.
     *
     * @param sender The email address of the sender of the bounced email. 
     */
    override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code. 
     */
    override fun template(template: BounceTemplate) {
      cdkBuilder.template(template.let(BounceTemplate::unwrap))
    }

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01c5c274363373a138b9e6be078a174b21734665aa6da0a46e552d7ebb47c626")
    override fun template(template: BounceTemplate.Builder.() -> Unit): Unit =
        template(BounceTemplate(template))

    /**
     * The SNS topic to notify when the bounce action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the bounce action is taken. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.Bounce = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Bounce {
      val builderImpl = BuilderImpl()
      return Bounce(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.Bounce): Bounce =
        Bounce(cdkObject)

    internal fun unwrap(wrapped: Bounce): software.amazon.awscdk.services.ses.actions.Bounce =
        wrapped.cdkObject as software.amazon.awscdk.services.ses.actions.Bounce
  }
}
