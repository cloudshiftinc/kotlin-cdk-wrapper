@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an ECR repository.
 */
public interface IRepository : IResource {
  /**
   * Add a policy statement to the repository's resource policy.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Add a policy statement to the repository's resource policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Grant the given principal identity permissions to perform the actions on this repository.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Grant the given identity permissions to pull images in this repository.
   *
   * @param grantee 
   */
  public fun grantPull(grantee: IGrantable): Grant

  /**
   * Grant the given identity permissions to pull and push images to this repository.
   *
   * @param grantee 
   */
  public fun grantPullPush(grantee: IGrantable): Grant

  /**
   * Grant the given identity permissions to push images in this repository.
   *
   * @param grantee 
   */
  public fun grantPush(grantee: IGrantable): Grant

  /**
   * Grant the given identity permissions to read images in this repository.
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailEvent(id: String): Rule

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onCloudTrailEvent(id: String, options: OnEventOptions): Rule

  /**
   * Define a CloudWatch event that triggers when something happens to this repository.
   *
   * Requires that there exists at least one CloudTrail Trail in your account
   * that captures the event. This method will not create the Trail.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed49a38b97e72d144f73c4dfe2a95a34b876c411ce7dd72df9a7a84fbeb4376")
  public fun onCloudTrailEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

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
  public fun onCloudTrailImagePushed(id: String): Rule

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
  public fun onCloudTrailImagePushed(id: String, options: OnCloudTrailImagePushedOptions): Rule

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ef082c6b809d259f51198817aa3b80a159542a1994bc4960ac065b0a64b707")
  public fun onCloudTrailImagePushed(id: String,
      options: OnCloudTrailImagePushedOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when the image scan is
   * completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onImageScanCompleted(id: String): Rule

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when the image scan is
   * completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  public fun onImageScanCompleted(id: String, options: OnImageScanCompletedOptions): Rule

  /**
   * Defines an AWS CloudWatch event rule that can trigger a target when the image scan is
   * completed.
   *
   * @param id The id of the rule. 
   * @param options Options for adding the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af5fc24c7b64d0577fb9d831f23d31aac8a626027ac1285086eb1271758a5da3")
  public fun onImageScanCompleted(id: String,
      options: OnImageScanCompletedOptions.Builder.() -> Unit): Rule

  /**
   * The ARN of the repository.
   */
  public fun repositoryArn(): String

  /**
   * The name of the repository.
   */
  public fun repositoryName(): String

  /**
   * The URI of this repository (represents the latest image):.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY
   */
  public fun repositoryUri(): String

  /**
   * Returns the URI of the repository for a certain digest. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param digest Image digest to use (tools usually default to the image with the "latest" tag if
   * omitted).
   */
  public fun repositoryUriForDigest(): String

  /**
   * Returns the URI of the repository for a certain digest. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param digest Image digest to use (tools usually default to the image with the "latest" tag if
   * omitted).
   */
  public fun repositoryUriForDigest(digest: String): String

  /**
   * Returns the URI of the repository for a certain tag. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   *
   * @param tag Image tag to use (tools usually default to "latest" if omitted).
   */
  public fun repositoryUriForTag(): String

  /**
   * Returns the URI of the repository for a certain tag. Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   *
   * @param tag Image tag to use (tools usually default to "latest" if omitted).
   */
  public fun repositoryUriForTag(tag: String): String

  /**
   * Returns the URI of the repository for a certain tag or digest, inferring based on the syntax of
   * the tag.
   *
   * Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param tagOrDigest Image tag or digest to use (tools usually default to the image with the
   * "latest" tag if omitted).
   */
  public fun repositoryUriForTagOrDigest(): String

  /**
   * Returns the URI of the repository for a certain tag or digest, inferring based on the syntax of
   * the tag.
   *
   * Can be used in `docker push/pull`.
   *
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[:TAG]
   * ACCOUNT.dkr.ecr.REGION.amazonaws.com/REPOSITORY[&#64;DIGEST]
   *
   * @param tagOrDigest Image tag or digest to use (tools usually default to the image with the
   * "latest" tag if omitted).
   */
  public fun repositoryUriForTagOrDigest(tagOrDigest: String): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.IRepository): IRepository =
        CdkObjectWrappers.wrap(cdkObject) as IRepository

    internal fun unwrap(wrapped: IRepository): software.amazon.awscdk.services.ecr.IRepository =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecr.IRepository
  }
}
