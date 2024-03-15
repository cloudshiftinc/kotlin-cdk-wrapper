@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for a `StackDeployment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * StackDeploymentProps stackDeploymentProps = StackDeploymentProps.builder()
 * .absoluteTemplatePath("absoluteTemplatePath")
 * .constructPath("constructPath")
 * .stackArtifactId("stackArtifactId")
 * .stackName("stackName")
 * // the properties below are optional
 * .account("account")
 * .assets(List.of(StackAsset.builder()
 * .assetId("assetId")
 * .assetManifestPath("assetManifestPath")
 * .assetSelector("assetSelector")
 * .assetType(AssetType.FILE)
 * .isTemplate(false)
 * // the properties below are optional
 * .assetPublishingRoleArn("assetPublishingRoleArn")
 * .build()))
 * .assumeRoleArn("assumeRoleArn")
 * .executionRoleArn("executionRoleArn")
 * .region("region")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .templateS3Uri("templateS3Uri")
 * .build();
 * ```
 */
public interface StackDeploymentProps {
  /**
   * Template path on disk to cloud assembly (cdk.out).
   */
  public fun absoluteTemplatePath(): String

  /**
   * Account where the stack should be deployed.
   *
   * Default: - Pipeline account
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * Assets referenced by this stack.
   *
   * Default: - No assets
   */
  public fun assets(): List<StackAsset> = unwrap(this).getAssets()?.map(StackAsset::wrap) ?:
      emptyList()

  /**
   * Role to assume before deploying this stack.
   *
   * Default: - Don't assume any role
   */
  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * Construct path for this stack.
   */
  public fun constructPath(): String

  /**
   * Execution role to pass to CloudFormation.
   *
   * Default: - No execution role
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Region where the stack should be deployed.
   *
   * Default: - Pipeline region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Artifact ID for this stack.
   */
  public fun stackArtifactId(): String

  /**
   * Name for this stack.
   */
  public fun stackName(): String

  /**
   * Tags to apply to the stack.
   *
   * Default: - No tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The S3 URL which points to the template asset location in the publishing bucket.
   *
   * Default: - Stack template is not published
   */
  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  /**
   * A builder for [StackDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param absoluteTemplatePath Template path on disk to cloud assembly (cdk.out). 
     */
    public fun absoluteTemplatePath(absoluteTemplatePath: String)

    /**
     * @param account Account where the stack should be deployed.
     */
    public fun account(account: String)

    /**
     * @param assets Assets referenced by this stack.
     */
    public fun assets(assets: List<StackAsset>)

    /**
     * @param assets Assets referenced by this stack.
     */
    public fun assets(vararg assets: StackAsset)

    /**
     * @param assumeRoleArn Role to assume before deploying this stack.
     */
    public fun assumeRoleArn(assumeRoleArn: String)

    /**
     * @param constructPath Construct path for this stack. 
     */
    public fun constructPath(constructPath: String)

    /**
     * @param executionRoleArn Execution role to pass to CloudFormation.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param region Region where the stack should be deployed.
     */
    public fun region(region: String)

    /**
     * @param stackArtifactId Artifact ID for this stack. 
     */
    public fun stackArtifactId(stackArtifactId: String)

    /**
     * @param stackName Name for this stack. 
     */
    public fun stackName(stackName: String)

    /**
     * @param tags Tags to apply to the stack.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param templateS3Uri The S3 URL which points to the template asset location in the publishing
     * bucket.
     */
    public fun templateS3Uri(templateS3Uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackDeploymentProps.Builder =
        software.amazon.awscdk.pipelines.StackDeploymentProps.builder()

    /**
     * @param absoluteTemplatePath Template path on disk to cloud assembly (cdk.out). 
     */
    override fun absoluteTemplatePath(absoluteTemplatePath: String) {
      cdkBuilder.absoluteTemplatePath(absoluteTemplatePath)
    }

    /**
     * @param account Account where the stack should be deployed.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param assets Assets referenced by this stack.
     */
    override fun assets(assets: List<StackAsset>) {
      cdkBuilder.assets(assets.map(StackAsset::unwrap))
    }

    /**
     * @param assets Assets referenced by this stack.
     */
    override fun assets(vararg assets: StackAsset): Unit = assets(assets.toList())

    /**
     * @param assumeRoleArn Role to assume before deploying this stack.
     */
    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param constructPath Construct path for this stack. 
     */
    override fun constructPath(constructPath: String) {
      cdkBuilder.constructPath(constructPath)
    }

    /**
     * @param executionRoleArn Execution role to pass to CloudFormation.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param region Region where the stack should be deployed.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param stackArtifactId Artifact ID for this stack. 
     */
    override fun stackArtifactId(stackArtifactId: String) {
      cdkBuilder.stackArtifactId(stackArtifactId)
    }

    /**
     * @param stackName Name for this stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param tags Tags to apply to the stack.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateS3Uri The S3 URL which points to the template asset location in the publishing
     * bucket.
     */
    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): software.amazon.awscdk.pipelines.StackDeploymentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StackDeploymentProps,
  ) : CdkObject(cdkObject), StackDeploymentProps {
    /**
     * Template path on disk to cloud assembly (cdk.out).
     */
    override fun absoluteTemplatePath(): String = unwrap(this).getAbsoluteTemplatePath()

    /**
     * Account where the stack should be deployed.
     *
     * Default: - Pipeline account
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * Assets referenced by this stack.
     *
     * Default: - No assets
     */
    override fun assets(): List<StackAsset> = unwrap(this).getAssets()?.map(StackAsset::wrap) ?:
        emptyList()

    /**
     * Role to assume before deploying this stack.
     *
     * Default: - Don't assume any role
     */
    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    /**
     * Construct path for this stack.
     */
    override fun constructPath(): String = unwrap(this).getConstructPath()

    /**
     * Execution role to pass to CloudFormation.
     *
     * Default: - No execution role
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * Region where the stack should be deployed.
     *
     * Default: - Pipeline region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Artifact ID for this stack.
     */
    override fun stackArtifactId(): String = unwrap(this).getStackArtifactId()

    /**
     * Name for this stack.
     */
    override fun stackName(): String = unwrap(this).getStackName()

    /**
     * Tags to apply to the stack.
     *
     * Default: - No tags
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The S3 URL which points to the template asset location in the publishing bucket.
     *
     * Default: - Stack template is not published
     */
    override fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackDeploymentProps):
        StackDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackDeploymentProps):
        software.amazon.awscdk.pipelines.StackDeploymentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.StackDeploymentProps
  }
}
