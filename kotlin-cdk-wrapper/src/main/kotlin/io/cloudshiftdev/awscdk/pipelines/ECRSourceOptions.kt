@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for ECR sources.
 *
 * Example:
 *
 * ```
 * IRepository repository;
 * CodePipelineSource.ecr(repository, ECRSourceOptions.builder()
 * .imageTag("latest")
 * .build());
 * ```
 */
public interface ECRSourceOptions {
  /**
   * The action name used for this source in the CodePipeline.
   *
   * Default: - The repository name
   */
  public fun actionName(): String? = unwrap(this).getActionName()

  /**
   * The image tag that will be checked for changes.
   *
   * Default: latest
   */
  public fun imageTag(): String? = unwrap(this).getImageTag()

  /**
   * A builder for [ECRSourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    public fun actionName(actionName: String)

    /**
     * @param imageTag The image tag that will be checked for changes.
     */
    public fun imageTag(imageTag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ECRSourceOptions.Builder =
        software.amazon.awscdk.pipelines.ECRSourceOptions.builder()

    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param imageTag The image tag that will be checked for changes.
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    public fun build(): software.amazon.awscdk.pipelines.ECRSourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.ECRSourceOptions,
  ) : CdkObject(cdkObject), ECRSourceOptions {
    /**
     * The action name used for this source in the CodePipeline.
     *
     * Default: - The repository name
     */
    override fun actionName(): String? = unwrap(this).getActionName()

    /**
     * The image tag that will be checked for changes.
     *
     * Default: latest
     */
    override fun imageTag(): String? = unwrap(this).getImageTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ECRSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ECRSourceOptions):
        ECRSourceOptions = CdkObjectWrappers.wrap(cdkObject) as? ECRSourceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ECRSourceOptions):
        software.amazon.awscdk.pipelines.ECRSourceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.ECRSourceOptions
  }
}
