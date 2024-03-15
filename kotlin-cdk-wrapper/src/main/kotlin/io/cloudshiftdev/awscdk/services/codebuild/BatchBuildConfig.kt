@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface BatchBuildConfig {
  public fun role(): IRole

  @CdkDslMarker
  public interface Builder {
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BatchBuildConfig.Builder =
        software.amazon.awscdk.services.codebuild.BatchBuildConfig.builder()

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BatchBuildConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig,
  ) : CdkObject(cdkObject), BatchBuildConfig {
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchBuildConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig):
        BatchBuildConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchBuildConfig):
        software.amazon.awscdk.services.codebuild.BatchBuildConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BatchBuildConfig
  }
}
