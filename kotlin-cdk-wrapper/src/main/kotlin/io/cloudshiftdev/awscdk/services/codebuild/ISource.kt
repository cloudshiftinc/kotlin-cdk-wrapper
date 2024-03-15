@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String

public interface ISource {
  public fun badgeSupported(): Boolean

  public fun bind(arg0: Construct, arg1: IProject): SourceConfig

  public fun identifier(): String? = unwrap(this).getIdentifier()

  public fun type(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ISource,
  ) : CdkObject(cdkObject), ISource {
    override fun badgeSupported(): Boolean = unwrap(this).getBadgeSupported()

    override fun bind(arg0: Construct, arg1: IProject): SourceConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IProject::unwrap)).let(SourceConfig::wrap)

    override fun identifier(): String? = unwrap(this).getIdentifier()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ISource): ISource =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.codebuild.ISource =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.ISource
  }
}
