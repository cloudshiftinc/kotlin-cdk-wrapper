@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

/**
 * The extra options passed to the `IProject.bindToCodePipeline` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * BindToCodePipelineOptions bindToCodePipelineOptions = BindToCodePipelineOptions.builder()
 * .artifactBucket(bucket)
 * .build();
 * ```
 */
public interface BindToCodePipelineOptions {
  /**
   * The artifact bucket that will be used by the action that invokes this project.
   */
  public fun artifactBucket(): IBucket

  /**
   * A builder for [BindToCodePipelineOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactBucket The artifact bucket that will be used by the action that invokes this
     * project. 
     */
    public fun artifactBucket(artifactBucket: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions.Builder =
        software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions.builder()

    /**
     * @param artifactBucket The artifact bucket that will be used by the action that invokes this
     * project. 
     */
    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions,
  ) : CdkObject(cdkObject), BindToCodePipelineOptions {
    /**
     * The artifact bucket that will be used by the action that invokes this project.
     */
    override fun artifactBucket(): IBucket = unwrap(this).getArtifactBucket().let(IBucket::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BindToCodePipelineOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions):
        BindToCodePipelineOptions = CdkObjectWrappers.wrap(cdkObject) as? BindToCodePipelineOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BindToCodePipelineOptions):
        software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions
  }
}
