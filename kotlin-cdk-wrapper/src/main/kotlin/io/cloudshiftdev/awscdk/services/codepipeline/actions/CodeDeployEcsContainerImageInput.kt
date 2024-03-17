@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.String
import kotlin.Unit

/**
 * Configuration for replacing a placeholder string in the ECS task definition template file with an
 * image URI.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * Artifact artifact;
 * CodeDeployEcsContainerImageInput codeDeployEcsContainerImageInput =
 * CodeDeployEcsContainerImageInput.builder()
 * .input(artifact)
 * // the properties below are optional
 * .taskDefinitionPlaceholder("taskDefinitionPlaceholder")
 * .build();
 * ```
 */
public interface CodeDeployEcsContainerImageInput {
  /**
   * The artifact that contains an `imageDetails.json` file with the image URI.
   *
   * The artifact's `imageDetails.json` file must be a JSON file containing an
   * `ImageURI` property.  For example:
   * `{ "ImageURI": "ACCOUNTID.dkr.ecr.us-west-2.amazonaws.com/dk-image-repo&#64;sha256:example3" }`
   */
  public fun input(): Artifact

  /**
   * The placeholder string in the ECS task definition template file that will be replaced with the
   * image URI.
   *
   * The placeholder string must be surrounded by angle brackets in the template file.
   * For example, if the task definition template file contains a placeholder like
   * `"image": "&lt;PLACEHOLDER&gt;"`, then the `taskDefinitionPlaceholder` value should
   * be `PLACEHOLDER`.
   *
   * Default: IMAGE
   */
  public fun taskDefinitionPlaceholder(): String? = unwrap(this).getTaskDefinitionPlaceholder()

  /**
   * A builder for [CodeDeployEcsContainerImageInput]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param input The artifact that contains an `imageDetails.json` file with the image URI. 
     * The artifact's `imageDetails.json` file must be a JSON file containing an
     * `ImageURI` property.  For example:
     * `{ "ImageURI": "ACCOUNTID.dkr.ecr.us-west-2.amazonaws.com/dk-image-repo&#64;sha256:example3"
     * }`
     */
    public fun input(input: Artifact)

    /**
     * @param taskDefinitionPlaceholder The placeholder string in the ECS task definition template
     * file that will be replaced with the image URI.
     * The placeholder string must be surrounded by angle brackets in the template file.
     * For example, if the task definition template file contains a placeholder like
     * `"image": "&lt;PLACEHOLDER&gt;"`, then the `taskDefinitionPlaceholder` value should
     * be `PLACEHOLDER`.
     */
    public fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.builder()

    /**
     * @param input The artifact that contains an `imageDetails.json` file with the image URI. 
     * The artifact's `imageDetails.json` file must be a JSON file containing an
     * `ImageURI` property.  For example:
     * `{ "ImageURI": "ACCOUNTID.dkr.ecr.us-west-2.amazonaws.com/dk-image-repo&#64;sha256:example3"
     * }`
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    /**
     * @param taskDefinitionPlaceholder The placeholder string in the ECS task definition template
     * file that will be replaced with the image URI.
     * The placeholder string must be surrounded by angle brackets in the template file.
     * For example, if the task definition template file contains a placeholder like
     * `"image": "&lt;PLACEHOLDER&gt;"`, then the `taskDefinitionPlaceholder` value should
     * be `PLACEHOLDER`.
     */
    override fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String) {
      cdkBuilder.taskDefinitionPlaceholder(taskDefinitionPlaceholder)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput,
  ) : CdkObject(cdkObject), CodeDeployEcsContainerImageInput {
    /**
     * The artifact that contains an `imageDetails.json` file with the image URI.
     *
     * The artifact's `imageDetails.json` file must be a JSON file containing an
     * `ImageURI` property.  For example:
     * `{ "ImageURI": "ACCOUNTID.dkr.ecr.us-west-2.amazonaws.com/dk-image-repo&#64;sha256:example3"
     * }`
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The placeholder string in the ECS task definition template file that will be replaced with
     * the image URI.
     *
     * The placeholder string must be surrounded by angle brackets in the template file.
     * For example, if the task definition template file contains a placeholder like
     * `"image": "&lt;PLACEHOLDER&gt;"`, then the `taskDefinitionPlaceholder` value should
     * be `PLACEHOLDER`.
     *
     * Default: IMAGE
     */
    override fun taskDefinitionPlaceholder(): String? = unwrap(this).getTaskDefinitionPlaceholder()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployEcsContainerImageInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput):
        CodeDeployEcsContainerImageInput = CdkObjectWrappers.wrap(cdkObject) as?
        CodeDeployEcsContainerImageInput ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeDeployEcsContainerImageInput):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
  }
}
