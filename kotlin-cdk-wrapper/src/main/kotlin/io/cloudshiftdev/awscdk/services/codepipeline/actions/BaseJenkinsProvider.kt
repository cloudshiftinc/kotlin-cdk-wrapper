@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 *
 */
public abstract class BaseJenkinsProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider,
) : Construct(cdkObject), IJenkinsProvider {
  /**
   *
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   *
   */
  public override fun serverUrl(): String = unwrap(this).getServerUrl()

  /**
   *
   */
  public override fun version(): String = unwrap(this).getVersion()

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider,
  ) : BaseJenkinsProvider(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider):
        BaseJenkinsProvider = CdkObjectWrappers.wrap(cdkObject) as? BaseJenkinsProvider ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseJenkinsProvider):
        software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider
  }
}
