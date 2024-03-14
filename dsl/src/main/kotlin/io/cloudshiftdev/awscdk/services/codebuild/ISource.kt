package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String

public interface ISource {
  public fun badgeSupported(): Boolean

  public fun bind(arg0: Construct, arg1: IProject): SourceConfig

  public fun identifier(): String? = unwrap(this).getIdentifier()

  public fun type(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.ISource,
  ) : ISource {
    public override fun badgeSupported(): Boolean = unwrap(this).getBadgeSupported()

    public override fun bind(arg0: Construct, arg1: IProject): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(SourceConfig::wrap)

    public override fun identifier(): String? = unwrap(this).getIdentifier()

    public override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ISource): ISource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.codebuild.ISource =
        (wrapped as Wrapper).cdkObject
  }
}
