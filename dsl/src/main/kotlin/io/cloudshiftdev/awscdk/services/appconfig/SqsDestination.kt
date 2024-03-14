package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String

public open class SqsDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.SqsDestination,
) : CdkObject(cdkObject), IEventDestination {
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
        software.amazon.awscdk.services.appconfig.SqsDestination = wrapped.cdkObject
  }
}
