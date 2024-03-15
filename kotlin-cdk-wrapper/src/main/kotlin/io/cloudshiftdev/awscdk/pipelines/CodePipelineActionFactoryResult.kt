@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import kotlin.Number
import kotlin.Unit

/**
 * The result of adding actions to the pipeline.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Project project;
 * CodePipelineActionFactoryResult codePipelineActionFactoryResult =
 * CodePipelineActionFactoryResult.builder()
 * .runOrdersConsumed(123)
 * // the properties below are optional
 * .project(project)
 * .build();
 * ```
 */
public interface CodePipelineActionFactoryResult {
  /**
   * If a CodeBuild project got created, the project.
   *
   * Default: - This factory did not create a CodeBuild project
   */
  public fun project(): IProject? = unwrap(this).getProject()?.let(IProject::wrap)

  /**
   * How many RunOrders were consumed.
   *
   * If you add 1 action, return the value 1 here.
   */
  public fun runOrdersConsumed(): Number

  /**
   * A builder for [CodePipelineActionFactoryResult]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param project If a CodeBuild project got created, the project.
     */
    public fun project(project: IProject)

    /**
     * @param runOrdersConsumed How many RunOrders were consumed. 
     * If you add 1 action, return the value 1 here.
     */
    public fun runOrdersConsumed(runOrdersConsumed: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult.Builder
        = software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult.builder()

    /**
     * @param project If a CodeBuild project got created, the project.
     */
    override fun project(project: IProject) {
      cdkBuilder.project(project.let(IProject::unwrap))
    }

    /**
     * @param runOrdersConsumed How many RunOrders were consumed. 
     * If you add 1 action, return the value 1 here.
     */
    override fun runOrdersConsumed(runOrdersConsumed: Number) {
      cdkBuilder.runOrdersConsumed(runOrdersConsumed)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult,
  ) : CdkObject(cdkObject), CodePipelineActionFactoryResult {
    /**
     * If a CodeBuild project got created, the project.
     *
     * Default: - This factory did not create a CodeBuild project
     */
    override fun project(): IProject? = unwrap(this).getProject()?.let(IProject::wrap)

    /**
     * How many RunOrders were consumed.
     *
     * If you add 1 action, return the value 1 here.
     */
    override fun runOrdersConsumed(): Number = unwrap(this).getRunOrdersConsumed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodePipelineActionFactoryResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult):
        CodePipelineActionFactoryResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineActionFactoryResult):
        software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
  }
}
