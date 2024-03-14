package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.cxapi.CloudFormationStackArtifact
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class StackDeployment internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.StackDeployment,
) {
  public open fun absoluteTemplatePath(): String = unwrap(this).getAbsoluteTemplatePath()

  public open fun account(): String? = unwrap(this).getAccount()

  public open fun addStackDependency(stackDeployment: StackDeployment) {
    unwrap(this).addStackDependency(stackDeployment.let(StackDeployment::unwrap))
  }

  public open fun addStackSteps(
    pre: List<Step>,
    changeSet: List<Step>,
    post: List<Step>,
  ) {
    unwrap(this).addStackSteps(pre.map(Step::unwrap), changeSet.map(Step::unwrap),
        post.map(Step::unwrap))
  }

  public open fun assets(): List<StackAsset> = unwrap(this).getAssets().map(StackAsset::wrap)

  public open fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public open fun changeSet(): List<Step> = unwrap(this).getChangeSet().map(Step::wrap)

  public open fun constructPath(): String = unwrap(this).getConstructPath()

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  public open fun region(): String? = unwrap(this).getRegion()

  public open fun stackArtifactId(): String = unwrap(this).getStackArtifactId()

  public open fun stackDependencies(): List<StackDeployment> =
      unwrap(this).getStackDependencies().map(StackDeployment::wrap)

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun templateAsset(): StackAsset? =
      unwrap(this).getTemplateAsset()?.let(StackAsset::wrap)

  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  public companion object {
    public open fun fromArtifact(stackArtifact: CloudFormationStackArtifact): StackDeployment =
        software.amazon.awscdk.pipelines.StackDeployment.fromArtifact(stackArtifact.let(CloudFormationStackArtifact::unwrap)).let(StackDeployment::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackDeployment): StackDeployment
        = StackDeployment(cdkObject)

    internal fun unwrap(wrapped: StackDeployment): software.amazon.awscdk.pipelines.StackDeployment
        = wrapped.cdkObject
  }
}
