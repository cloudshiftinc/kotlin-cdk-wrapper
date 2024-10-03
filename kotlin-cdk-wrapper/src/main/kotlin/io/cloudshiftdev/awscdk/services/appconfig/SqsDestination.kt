@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String

/**
 * Use an Amazon SQS queue as an event destination.
 *
 * Example:
 *
 * ```
 * Queue queue;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new SqsDestination(queue))
 * .build()))
 * .build();
 * ```
 */
public open class SqsDestination(
  cdkObject: software.amazon.awscdk.services.appconfig.SqsDestination,
) : CdkObject(cdkObject),
    IEventDestination {
  public constructor(queue: IQueue) :
      this(software.amazon.awscdk.services.appconfig.SqsDestination(queue.let(IQueue.Companion::unwrap))
  )

  /**
   * The URI of the extension event destination.
   */
  public override fun extensionUri(): String = unwrap(this).getExtensionUri()

  /**
   * The IAM policy document to invoke the event destination.
   */
  public override fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  /**
   * The type of the extension event destination.
   */
  public override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SqsDestination):
        SqsDestination = SqsDestination(cdkObject)

    internal fun unwrap(wrapped: SqsDestination):
        software.amazon.awscdk.services.appconfig.SqsDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.SqsDestination
  }
}
