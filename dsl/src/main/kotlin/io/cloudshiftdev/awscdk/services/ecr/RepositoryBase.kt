package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RepositoryBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryBase,
) : Resource(cdkObject), IRepository {
  /**
   * Add a policy statement to the repository's resource policy.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Add a policy statement to the repository's resource policy.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Grant the given principal identity permissions to perform the actions on this repository.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * Grant the given identity permissions to use the images in this repository.
   *
   * @param grantee 
   */
  public override fun grantPull(grantee: IGrantable): Grant =
      unwrap(this).grantPull(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to pull and push images to this repository.
   *
   * @param grantee 
   */
  public override fun grantPullPush(grantee: IGrantable): Grant =
      unwrap(this).grantPullPush(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to use the images in this repository.
   *
   * @param grantee 
   */
  public override fun grantPush(grantee: IGrantable): Grant =
      unwrap(this).grantPush(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to read the images in this repository.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onCloudTrailEvent(id: String): Rule =
      unwrap(this).onCloudTrailEvent(id).let(Rule::wrap)

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onCloudTrailEvent(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCloudTrailEvent(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed49a38b97e72d144f73c4dfe2a95a34b876c411ce7dd72df9a7a84fbeb4376")
  public override fun onCloudTrailEvent(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onCloudTrailEvent(id, OnEventOptions(options))

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image is pushed to this
   * repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onCloudTrailImagePushed(id: String): Rule =
      unwrap(this).onCloudTrailImagePushed(id).let(Rule::wrap)

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image is pushed to this
   * repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onCloudTrailImagePushed(id: String, options: OnCloudTrailImagePushedOptions):
      Rule = unwrap(this).onCloudTrailImagePushed(id,
      options.let(OnCloudTrailImagePushedOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image is pushed to this
   * repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ef082c6b809d259f51198817aa3b80a159542a1994bc4960ac065b0a64b707")
  public override fun onCloudTrailImagePushed(id: String,
      options: OnCloudTrailImagePushedOptions.Builder.() -> Unit): Rule =
      onCloudTrailImagePushed(id, OnCloudTrailImagePushedOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image scan is completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onImageScanCompleted(id: String): Rule =
      unwrap(this).onImageScanCompleted(id).let(Rule::wrap)

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image scan is completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public override fun onImageScanCompleted(id: String, options: OnImageScanCompletedOptions): Rule =
      unwrap(this).onImageScanCompleted(id,
      options.let(OnImageScanCompletedOptions::unwrap)).let(Rule::wrap)

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when an image scan is completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af5fc24c7b64d0577fb9d831f23d31aac8a626027ac1285086eb1271758a5da3")
  public override fun onImageScanCompleted(id: String,
      options: OnImageScanCompletedOptions.Builder.() -> Unit): Rule = onImageScanCompleted(id,
      OnImageScanCompletedOptions(options))

  /**
   * The ARN of the repository.
   */
  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  /**
   * The name of the repository.
   */
  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * The URI of this repository (represents the latest image):.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY
   */
  public override fun repositoryUri(): String = unwrap(this).getRepositoryUri()

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param digest Optional image digest.
   */
  public override fun repositoryUriForDigest(): String = unwrap(this).repositoryUriForDigest()

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param digest Optional image digest.
   */
  public override fun repositoryUriForDigest(digest: String): String =
      unwrap(this).repositoryUriForDigest(digest)

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   *
   * @param tag Optional image tag.
   */
  public override fun repositoryUriForTag(): String = unwrap(this).repositoryUriForTag()

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   *
   * @param tag Optional image tag.
   */
  public override fun repositoryUriForTag(tag: String): String =
      unwrap(this).repositoryUriForTag(tag)

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param tagOrDigest Optional image tag or digest (digests must start with `sha256:`).
   */
  public override fun repositoryUriForTagOrDigest(): String =
      unwrap(this).repositoryUriForTagOrDigest()

  /**
   * Returns the URL of the repository. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param tagOrDigest Optional image tag or digest (digests must start with `sha256:`).
   */
  public override fun repositoryUriForTagOrDigest(tagOrDigest: String): String =
      unwrap(this).repositoryUriForTagOrDigest(tagOrDigest)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryBase,
  ) : RepositoryBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryBase): RepositoryBase
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryBase): software.amazon.awscdk.services.ecr.RepositoryBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecr.RepositoryBase
  }
}
