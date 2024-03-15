@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by the ECR source Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * EcrSourceVariables ecrSourceVariables = EcrSourceVariables.builder()
 * .imageDigest("imageDigest")
 * .imageTag("imageTag")
 * .imageUri("imageUri")
 * .registryId("registryId")
 * .repositoryName("repositoryName")
 * .build();
 * ```
 */
public interface EcrSourceVariables {
  /**
   * The digest of the current image, in the form '<digest type>:<digest value>'.
   */
  public fun imageDigest(): String

  /**
   * The Docker tag of the current image.
   */
  public fun imageTag(): String

  /**
   * The full ECR Docker URI of the current image.
   */
  public fun imageUri(): String

  /**
   * The identifier of the registry.
   *
   * In ECR, this is usually the ID of the AWS account owning it.
   */
  public fun registryId(): String

  /**
   * The physical name of the repository that this action tracks.
   */
  public fun repositoryName(): String

  /**
   * A builder for [EcrSourceVariables]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageDigest The digest of the current image, in the form '<digest type>:<digest
     * value>'. 
     */
    public fun imageDigest(imageDigest: String)

    /**
     * @param imageTag The Docker tag of the current image. 
     */
    public fun imageTag(imageTag: String)

    /**
     * @param imageUri The full ECR Docker URI of the current image. 
     */
    public fun imageUri(imageUri: String)

    /**
     * @param registryId The identifier of the registry. 
     * In ECR, this is usually the ID of the AWS account owning it.
     */
    public fun registryId(registryId: String)

    /**
     * @param repositoryName The physical name of the repository that this action tracks. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.builder()

    /**
     * @param imageDigest The digest of the current image, in the form '<digest type>:<digest
     * value>'. 
     */
    override fun imageDigest(imageDigest: String) {
      cdkBuilder.imageDigest(imageDigest)
    }

    /**
     * @param imageTag The Docker tag of the current image. 
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * @param imageUri The full ECR Docker URI of the current image. 
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param registryId The identifier of the registry. 
     * In ECR, this is usually the ID of the AWS account owning it.
     */
    override fun registryId(registryId: String) {
      cdkBuilder.registryId(registryId)
    }

    /**
     * @param repositoryName The physical name of the repository that this action tracks. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables,
  ) : CdkObject(cdkObject), EcrSourceVariables {
    /**
     * The digest of the current image, in the form '<digest type>:<digest value>'.
     */
    override fun imageDigest(): String = unwrap(this).getImageDigest()

    /**
     * The Docker tag of the current image.
     */
    override fun imageTag(): String = unwrap(this).getImageTag()

    /**
     * The full ECR Docker URI of the current image.
     */
    override fun imageUri(): String = unwrap(this).getImageUri()

    /**
     * The identifier of the registry.
     *
     * In ECR, this is usually the ID of the AWS account owning it.
     */
    override fun registryId(): String = unwrap(this).getRegistryId()

    /**
     * The physical name of the repository that this action tracks.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrSourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables):
        EcrSourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrSourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables
  }
}
