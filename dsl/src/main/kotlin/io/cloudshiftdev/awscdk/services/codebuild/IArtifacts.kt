package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public interface IArtifacts {
  public fun bind(arg0: Construct, arg1: IProject): ArtifactsConfig

  public fun identifier(): String? = unwrap(this).getIdentifier()

  public fun type(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts,
  ) : IArtifacts {
    public override fun bind(arg0: Construct, arg1: IProject): ArtifactsConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(ArtifactsConfig::wrap)

    public override fun identifier(): String? = unwrap(this).getIdentifier()

    public override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts): IArtifacts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IArtifacts): software.amazon.awscdk.services.codebuild.IArtifacts =
        (wrapped as Wrapper).cdkObject
  }
}
