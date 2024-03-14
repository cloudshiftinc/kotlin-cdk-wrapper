package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class BaseJenkinsProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider,
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

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider,
  ) : BaseJenkinsProvider(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider):
        BaseJenkinsProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseJenkinsProvider):
        software.amazon.awscdk.services.codepipeline.actions.BaseJenkinsProvider = (wrapped as
        Wrapper).cdkObject
  }
}
