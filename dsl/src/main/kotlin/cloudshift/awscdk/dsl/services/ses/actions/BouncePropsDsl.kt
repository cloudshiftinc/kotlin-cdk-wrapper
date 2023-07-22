@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.BounceProps
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import software.amazon.awscdk.services.sns.ITopic

/**
 * Construction properties for a bounce action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * import software.amazon.awscdk.services.sns.*;
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
@CdkDslMarker
public class BouncePropsDsl {
  private val cdkBuilder: BounceProps.Builder = BounceProps.builder()

  /**
   * @param sender The email address of the sender of the bounced email. 
   * This is the address
   * from which the bounce message will be sent.
   */
  public fun sender(sender: String) {
    cdkBuilder.sender(sender)
  }

  /**
   * @param template The template containing the message, reply code and status code. 
   */
  public fun template(template: BounceTemplateDsl.() -> Unit = {}) {
    val builder = BounceTemplateDsl()
    builder.apply(template)
    cdkBuilder.template(builder.build())
  }

  /**
   * @param template The template containing the message, reply code and status code. 
   */
  public fun template(template: BounceTemplate) {
    cdkBuilder.template(template)
  }

  /**
   * @param topic The SNS topic to notify when the bounce action is taken.
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): BounceProps = cdkBuilder.build()
}
