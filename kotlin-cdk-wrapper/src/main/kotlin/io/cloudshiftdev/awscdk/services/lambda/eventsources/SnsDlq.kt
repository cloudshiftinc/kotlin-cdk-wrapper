@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DlqDestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sns.ITopic

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
public open class SnsDlq(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsDlq,
) : CdkObject(cdkObject), IEventSourceDlq {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.lambda.eventsources.SnsDlq(topic.let(ITopic.Companion::unwrap))
  )

  /**
   * Returns a destination configuration for the DLQ.
   *
   * @param _target 
   * @param targetHandler 
   */
  public override fun bind(target: IEventSourceMapping, targetHandler: IFunction):
      DlqDestinationConfig = unwrap(this).bind(target.let(IEventSourceMapping.Companion::unwrap),
      targetHandler.let(IFunction.Companion::unwrap)).let(DlqDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsDlq): SnsDlq
        = SnsDlq(cdkObject)

    internal fun unwrap(wrapped: SnsDlq): software.amazon.awscdk.services.lambda.eventsources.SnsDlq
        = wrapped.cdkObject as software.amazon.awscdk.services.lambda.eventsources.SnsDlq
  }
}
