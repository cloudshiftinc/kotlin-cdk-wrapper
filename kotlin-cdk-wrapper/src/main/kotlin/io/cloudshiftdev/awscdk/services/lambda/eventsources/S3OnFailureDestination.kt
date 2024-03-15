@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.DlqDestinationConfig
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceMapping
import io.cloudshiftdev.awscdk.services.lambda.IFunction

public open class S3OnFailureDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination,
) : CdkObject(cdkObject), IEventSourceDlq {
  public override fun bind(_target: IEventSourceMapping, targetHandler: IFunction):
      DlqDestinationConfig = unwrap(this).bind(_target.let(IEventSourceMapping::unwrap),
      targetHandler.let(IFunction::unwrap)).let(DlqDestinationConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination):
        S3OnFailureDestination = S3OnFailureDestination(cdkObject)

    internal fun unwrap(wrapped: S3OnFailureDestination):
        software.amazon.awscdk.services.lambda.eventsources.S3OnFailureDestination =
        wrapped.cdkObject
  }
}
