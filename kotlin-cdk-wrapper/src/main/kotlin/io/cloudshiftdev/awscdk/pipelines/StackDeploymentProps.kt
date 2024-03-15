@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface StackDeploymentProps {
  public fun absoluteTemplatePath(): String

  public fun account(): String? = unwrap(this).getAccount()

  public fun assets(): List<StackAsset> = unwrap(this).getAssets()?.map(StackAsset::wrap) ?:
      emptyList()

  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public fun constructPath(): String

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun region(): String? = unwrap(this).getRegion()

  public fun stackArtifactId(): String

  public fun stackName(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun templateS3Uri(): String? = unwrap(this).getTemplateS3Uri()

  @CdkDslMarker
  public interface Builder {
    public fun absoluteTemplatePath(absoluteTemplatePath: String)

    public fun account(account: String)

    public fun assets(assets: List<StackAsset>)

    public fun assets(vararg assets: StackAsset)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun constructPath(constructPath: String)

    public fun executionRoleArn(executionRoleArn: String)

    public fun region(region: String)

    public fun stackArtifactId(stackArtifactId: String)

    public fun stackName(stackName: String)

    public fun tags(tags: Map<String, String>)

    public fun templateS3Uri(templateS3Uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackDeploymentProps.Builder =
        software.amazon.awscdk.pipelines.StackDeploymentProps.builder()

    override fun absoluteTemplatePath(absoluteTemplatePath: String) {
      cdkBuilder.absoluteTemplatePath(absoluteTemplatePath)
    }

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assets(assets: List<StackAsset>) {
      cdkBuilder.assets(assets.map(StackAsset::unwrap))
    }

    override fun assets(vararg assets: StackAsset): Unit = assets(assets.toList())

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun constructPath(constructPath: String) {
      cdkBuilder.constructPath(constructPath)
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun stackArtifactId(stackArtifactId: String) {
      cdkBuilder.stackArtifactId(stackArtifactId)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun templateS3Uri(templateS3Uri: String) {
      cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): software.amazon.awscdk.pipelines.StackDeploymentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StackDeploymentProps,
  ) : CdkObject(cdkObject), StackDeploymentProps {
    override fun absoluteTemplatePath(): String = unwrap(this).getAbsoluteTemplatePath()

    override fun account(): String? = unwrap(this).getAccount()

    override fun assets(): List<StackAsset> = unwrap(this).getAssets()?.map(StackAsset::wrap) ?:
        emptyList()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun constructPath(): String = unwrap(this).getConstructPath()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun region(): String? = unwrap(this).getRegion()

    override fun stackArtifactId(): String = unwrap(this).getStackArtifactId()

    override fun stackName(): String = unwrap(this).getStackName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

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
