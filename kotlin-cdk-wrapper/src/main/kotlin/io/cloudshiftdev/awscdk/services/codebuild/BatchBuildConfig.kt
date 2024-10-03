@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

/**
 * The type returned from `IProject#enableBatchBuilds`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * BatchBuildConfig batchBuildConfig = BatchBuildConfig.builder()
 * .role(role)
 * .build();
 * ```
 */
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BatchBuildConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig,
  ) : CdkObject(cdkObject),
      BatchBuildConfig {
    /**
     * The IAM batch service Role of this Project.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchBuildConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BatchBuildConfig):
        BatchBuildConfig = CdkObjectWrappers.wrap(cdkObject) as? BatchBuildConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchBuildConfig):
        software.amazon.awscdk.services.codebuild.BatchBuildConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BatchBuildConfig
  }
}
