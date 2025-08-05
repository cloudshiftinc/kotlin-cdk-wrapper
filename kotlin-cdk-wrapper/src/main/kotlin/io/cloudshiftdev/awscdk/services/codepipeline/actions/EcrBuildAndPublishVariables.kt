@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by the ECR build and publish Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * EcrBuildAndPublishVariables ecrBuildAndPublishVariables = EcrBuildAndPublishVariables.builder()
 * .ecrImageDigestId("ecrImageDigestId")
 * .ecrRepositoryName("ecrRepositoryName")
 * .build();
 * ```
 */
public interface EcrBuildAndPublishVariables {
  /**
   * The sha256 digest of the image manifest.
   */
  public fun ecrImageDigestId(): String

  /**
   * The name of the Amazon ECR repository where the image was pushed.
   */
  public fun ecrRepositoryName(): String

  /**
   * A builder for [EcrBuildAndPublishVariables]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ecrImageDigestId The sha256 digest of the image manifest. 
     */
    public fun ecrImageDigestId(ecrImageDigestId: String)

    /**
     * @param ecrRepositoryName The name of the Amazon ECR repository where the image was pushed. 
     */
    public fun ecrRepositoryName(ecrRepositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables.builder()

    /**
     * @param ecrImageDigestId The sha256 digest of the image manifest. 
     */
    override fun ecrImageDigestId(ecrImageDigestId: String) {
      cdkBuilder.ecrImageDigestId(ecrImageDigestId)
    }

    /**
     * @param ecrRepositoryName The name of the Amazon ECR repository where the image was pushed. 
     */
    override fun ecrRepositoryName(ecrRepositoryName: String) {
      cdkBuilder.ecrRepositoryName(ecrRepositoryName)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables,
  ) : CdkObject(cdkObject),
      EcrBuildAndPublishVariables {
    /**
     * The sha256 digest of the image manifest.
     */
    override fun ecrImageDigestId(): String = unwrap(this).getEcrImageDigestId()

    /**
     * The name of the Amazon ECR repository where the image was pushed.
     */
    override fun ecrRepositoryName(): String = unwrap(this).getEcrRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrBuildAndPublishVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables):
        EcrBuildAndPublishVariables = CdkObjectWrappers.wrap(cdkObject) as?
        EcrBuildAndPublishVariables ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrBuildAndPublishVariables):
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables
  }
}
