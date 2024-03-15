@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DlqDestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction

/**
 * An SNS dead letter queue destination configuration for a Lambda event source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic;
 * SnsDlq snsDlq = new SnsDlq(topic);
 * ```
 */
public open class SnsDlq internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsDlq,
) : CdkObject(cdkObject), IEventSourceDlq {
  /**
   * Returns a destination configuration for the DLQ.
   *
   * @param _target 
   * @param targetHandler 
   */
  public override fun bind(_target: IEventSourceMapping, targetHandler: IFunction):
      DlqDestinationConfig = unwrap(this).bind(_target.let(IEventSourceMapping::unwrap),
      targetHandler.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsDlq): SnsDlq
        = SnsDlq(cdkObject)

    internal fun unwrap(wrapped: SnsDlq): software.amazon.awscdk.services.lambda.eventsources.SnsDlq
        = wrapped.cdkObject
  }
}
