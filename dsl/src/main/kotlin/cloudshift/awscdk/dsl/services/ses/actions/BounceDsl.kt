@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.Bounce
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import software.amazon.awscdk.services.sns.ITopic

/**
 * Rejects the received email by returning a bounce response to the sender and, optionally,
 * publishes a notification to Amazon SNS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * import software.amazon.awscdk.services.sns.*;
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
@CdkDslMarker
public class BounceDsl {
    private val cdkBuilder: Bounce.Builder = Bounce.Builder.create()

    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address from which the bounce message will be sent.
     *
     * @param sender The email address of the sender of the bounced email.
     */
    public fun sender(sender: String) {
        cdkBuilder.sender(sender)
    }

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code.
     */
    public fun template(template: BounceTemplateDsl.() -> Unit = {}) {
        val builder = BounceTemplateDsl()
        builder.apply(template)
        cdkBuilder.template(builder.build())
    }

    /**
     * The template containing the message, reply code and status code.
     *
     * @param template The template containing the message, reply code and status code.
     */
    public fun template(template: BounceTemplate) {
        cdkBuilder.template(template)
    }

    /**
     * The SNS topic to notify when the bounce action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the bounce action is taken.
     */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): Bounce = cdkBuilder.build()
}
