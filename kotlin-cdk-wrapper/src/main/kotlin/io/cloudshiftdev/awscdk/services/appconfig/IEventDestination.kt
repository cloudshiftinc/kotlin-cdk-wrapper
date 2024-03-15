@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String

public interface IEventDestination {
  public fun extensionUri(): String

  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  public fun type(): SourceType

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination,
  ) : CdkObject(cdkObject), IEventDestination {
    override fun extensionUri(): String = unwrap(this).getExtensionUri()

    override fun policyDocument(): PolicyDocument? =
        unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

    override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination):
        IEventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventDestination):
        software.amazon.awscdk.services.appconfig.IEventDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IEventDestination
  }
}
