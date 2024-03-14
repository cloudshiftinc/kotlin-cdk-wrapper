package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface BatchBuildConfig {
  /**
   * The IAM batch service Role of this Project.
   */
  public fun role(): IRole

  /**
   * A builder for [BatchBuildConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param role The IAM batch service Role of this Project. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BatchBuildConfig.Builder =
        software.amazon.awscdk.services.codebuild.BatchBuildConfig.builder()

    /**
     * @param role The IAM batch service Role of this Project. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BatchBuildConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig,
  ) : BatchBuildConfig {
    /**
     * The IAM batch service Role of this Project.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BatchBuildConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig):
        BatchBuildConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchBuildConfig):
        software.amazon.awscdk.services.codebuild.BatchBuildConfig = (wrapped as Wrapper).cdkObject
  }
}
