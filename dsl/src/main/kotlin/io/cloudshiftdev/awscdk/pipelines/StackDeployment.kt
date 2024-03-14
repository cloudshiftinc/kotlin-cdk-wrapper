package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.cxapi.CloudFormationStackArtifact
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class StackDeployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.StackDeployment,
) : CdkObject(cdkObject) {
  /**
   * Template path on disk to CloudAssembly.
   */
  public open fun absoluteTemplatePath(): String = unwrap(this).getAbsoluteTemplatePath()

  /**
   * Account where the stack should be deployed.
   *
   * Default: - Pipeline account
   */
  public open fun account(): String? = unwrap(this).getAccount()

  /**
   * Add a dependency on another stack.
   *
   * @param stackDeployment 
   */
  public open fun addStackDependency(stackDeployment: StackDeployment) {
    unwrap(this).addStackDependency(stackDeployment.let(StackDeployment::unwrap))
  }

  /**
   * Adds steps to each phase of the stack.
   *
   * @param pre steps executed before stack.prepare. 
   * @param changeSet steps executed after stack.prepare and before stack.deploy. 
   * @param post steps executed after stack.deploy. 
   */
  public open fun addStackSteps(
    pre: List<Step>,
    changeSet: List<Step>,
    post: List<Step>,
  ) {
    unwrap(this).addStackSteps(pre.map(Step::unwrap), changeSet.map(Step::unwrap),
        post.map(Step::unwrap))
  }

  /**
   * Assets referenced by this stack.
   */
  public open fun assets(): List<StackAsset> = unwrap(this).getAssets().map(StackAsset::wrap)

  /**
   * Role to assume before deploying this stack.
   *
   * Default: - Don't assume any role
   */
  public open fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  /**
   * Steps that take place after stack is prepared but before stack deploys.
   *
   * Your pipeline engine may not disable `prepareStep`.
   */
  public open fun changeSet(): List<Step> = unwrap(this).getChangeSet().map(Step::wrap)

  /**
   * Construct path for this stack.
   */
  public open fun constructPath(): String = unwrap(this).getConstructPath()

  /**
   * Execution role to pass to CloudFormation.
   *
   * Default: - No execution role
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Steps to execute after stack deploys.
   */
  public open fun post(): List<Step> = unwrap(this).getPost().map(Step::wrap)

  /**
   * Steps that take place before stack is prepared.
   *
   * If your pipeline engine disables 'prepareStep', then this will happen before stack deploys
   */
  public open fun pre(): List<Step> = unwrap(this).getPre().map(Step::wrap)

  /**
   * Region where the stack should be deployed.
   *
   * Default: - Pipeline region
   */
  public open fun region(): String? = unwrap(this).getRegion()

  /**
   * Artifact ID for this stack.
   */
  public open fun stackArtifactId(): String = unwrap(this).getStackArtifactId()

  /**
   * Other stacks this stack depends on.
   */
  public open fun stackDependencies(): List<StackDeployment> =
      unwrap(this).getStackDependencies().map(StackDeployment::wrap)

  /**
   * Name for this stack.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * Tags to apply to the stack.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The asset that represents the CloudFormation template for this stack.
   */
  public open fun templateAsset(): StackAsset? =
      unwrap(this).getTemplateAsset()?.let(StackAsset::wrap)

  /**
   * The S3 URL which points to the template asset location in the publishing bucket.
   *
   * This is `undefined` if the stack template is not published. Use the
   * `DefaultStackSynthesizer` to ensure it is.
   *
   * Example value: `https://bucket.s3.amazonaws.com/object/key`
   */
  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  public companion object {
    public fun fromArtifact(stackArtifact: CloudFormationStackArtifact): StackDeployment =
        software.amazon.awscdk.pipelines.StackDeployment.fromArtifact(stackArtifact.let(CloudFormationStackArtifact::unwrap)).let(StackDeployment::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackDeployment): StackDeployment
        = StackDeployment(cdkObject)

    internal fun unwrap(wrapped: StackDeployment): software.amazon.awscdk.pipelines.StackDeployment
        = wrapped.cdkObject
  }
}
