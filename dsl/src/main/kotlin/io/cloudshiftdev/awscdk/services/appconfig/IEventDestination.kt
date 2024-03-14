package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String

public interface IEventDestination {
  public fun extensionUri(): String

  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  public fun type(): SourceType

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination,
  ) : IEventDestination {
    public override fun extensionUri(): String = unwrap(this).getExtensionUri()

    public override fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    public override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination):
        IEventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventDestination):
        software.amazon.awscdk.services.appconfig.IEventDestination = (wrapped as Wrapper).cdkObject
  }
}
