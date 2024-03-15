@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RepositoryBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryBase,
) : Resource(cdkObject), IRepository {
  public override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantPull(grantee: IGrantable): Grant =
      unwrap(this).grantPull(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPullPush(grantee: IGrantable): Grant =
      unwrap(this).grantPullPush(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPush(grantee: IGrantable): Grant =
      unwrap(this).grantPush(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun onCloudTrailEvent(id: String): Rule =
      unwrap(this).onCloudTrailEvent(id).let(Rule::wrap)

  public override fun onCloudTrailEvent(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCloudTrailEvent(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed49a38b97e72d144f73c4dfe2a95a34b876c411ce7dd72df9a7a84fbeb4376")
  public override fun onCloudTrailEvent(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onCloudTrailEvent(id, OnEventOptions(options))

  public override fun onCloudTrailImagePushed(id: String): Rule =
      unwrap(this).onCloudTrailImagePushed(id).let(Rule::wrap)

  public override fun onCloudTrailImagePushed(id: String, options: OnCloudTrailImagePushedOptions):
      Rule = unwrap(this).onCloudTrailImagePushed(id,
      options.let(OnCloudTrailImagePushedOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ef082c6b809d259f51198817aa3b80a159542a1994bc4960ac065b0a64b707")
  public override fun onCloudTrailImagePushed(id: String,
      options: OnCloudTrailImagePushedOptions.Builder.() -> Unit): Rule =
      onCloudTrailImagePushed(id, OnCloudTrailImagePushedOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onImageScanCompleted(id: String): Rule =
      unwrap(this).onImageScanCompleted(id).let(Rule::wrap)

  public override fun onImageScanCompleted(id: String, options: OnImageScanCompletedOptions): Rule =
      unwrap(this).onImageScanCompleted(id,
      options.let(OnImageScanCompletedOptions::unwrap)).let(Rule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af5fc24c7b64d0577fb9d831f23d31aac8a626027ac1285086eb1271758a5da3")
  public override fun onImageScanCompleted(id: String,
      options: OnImageScanCompletedOptions.Builder.() -> Unit): Rule = onImageScanCompleted(id,
      OnImageScanCompletedOptions(options))

  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  public override fun repositoryUri(): String = unwrap(this).getRepositoryUri()

  public override fun repositoryUriForDigest(): String = unwrap(this).repositoryUriForDigest()

  public override fun repositoryUriForDigest(digest: String): String =
      unwrap(this).repositoryUriForDigest(digest)

  public override fun repositoryUriForTag(): String = unwrap(this).repositoryUriForTag()

  public override fun repositoryUriForTag(tag: String): String =
      unwrap(this).repositoryUriForTag(tag)

  public override fun repositoryUriForTagOrDigest(): String =
      unwrap(this).repositoryUriForTagOrDigest()

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
