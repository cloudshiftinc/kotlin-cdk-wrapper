@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String

/**
 * Use an Amazon SNS topic as an event destination.
 *
 * Example:
 *
 * ```
 * Topic topic;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new SnsDestination(topic))
 * .build()))
 * .build();
 * ```
 */
public open class SnsDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.SnsDestination,
) : CdkObject(cdkObject), IEventDestination {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.appconfig.SnsDestination(ITopic.unwrap(topic)))

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.SnsDestination):
        SnsDestination = SnsDestination(cdkObject)

    internal fun unwrap(wrapped: SnsDestination):
        software.amazon.awscdk.services.appconfig.SnsDestination = wrapped.cdkObject
  }
}
