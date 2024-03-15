@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DlqDestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction

/**
 * An SQS dead letter queue destination configuration for a Lambda event source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.DynamoEventSource;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.SqsDlq;
 * Table table;
 * Function fn;
 * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .batchSize(5)
 * .bisectBatchOnError(true)
 * .onFailure(new SqsDlq(deadLetterQueue))
 * .retryAttempts(10)
 * .build());
 * ```
 */
public open class SqsDlq internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsDlq,
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsDlq): SqsDlq
        = SqsDlq(cdkObject)

    internal fun unwrap(wrapped: SqsDlq): software.amazon.awscdk.services.lambda.eventsources.SqsDlq
        = wrapped.cdkObject
  }
}
