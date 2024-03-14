package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IRepository : IResource {
  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantPull(arg0: IGrantable): Grant

  public fun grantPullPush(arg0: IGrantable): Grant

  public fun grantPush(arg0: IGrantable): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun onCloudTrailEvent(arg0: String): Rule

  public fun onCloudTrailEvent(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed49a38b97e72d144f73c4dfe2a95a34b876c411ce7dd72df9a7a84fbeb4376")
  public fun onCloudTrailEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onCloudTrailImagePushed(arg0: String): Rule

  public fun onCloudTrailImagePushed(arg0: String, arg1: OnCloudTrailImagePushedOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ef082c6b809d259f51198817aa3b80a159542a1994bc4960ac065b0a64b707")
  public fun onCloudTrailImagePushed(arg0: String,
      arg1: OnCloudTrailImagePushedOptions.Builder.() -> Unit): Rule

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onImageScanCompleted(arg0: String): Rule

  public fun onImageScanCompleted(arg0: String, arg1: OnImageScanCompletedOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af5fc24c7b64d0577fb9d831f23d31aac8a626027ac1285086eb1271758a5da3")
  public fun onImageScanCompleted(arg0: String,
      arg1: OnImageScanCompletedOptions.Builder.() -> Unit): Rule

  public fun repositoryArn(): String

  public fun repositoryName(): String

  public fun repositoryUri(): String

  public fun repositoryUriForDigest(): String

  public fun repositoryUriForDigest(arg0: String): String

  public fun repositoryUriForTag(): String

  public fun repositoryUriForTag(arg0: String): String

  public fun repositoryUriForTagOrDigest(): String

  public fun repositoryUriForTagOrDigest(arg0: String): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.IRepository,
  ) : IRepository {
    public override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    public override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun grantPull(arg0: IGrantable): Grant =
        unwrap(this).grantPull(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantPullPush(arg0: IGrantable): Grant =
        unwrap(this).grantPullPush(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantPush(arg0: IGrantable): Grant =
        unwrap(this).grantPush(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun onCloudTrailEvent(arg0: String): Rule =
        unwrap(this).onCloudTrailEvent(arg0).let(Rule::wrap)

    public override fun onCloudTrailEvent(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onCloudTrailEvent(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ed49a38b97e72d144f73c4dfe2a95a34b876c411ce7dd72df9a7a84fbeb4376")
    public override fun onCloudTrailEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit):
        Rule = onCloudTrailEvent(arg0, OnEventOptions(arg1))

    public override fun onCloudTrailImagePushed(arg0: String): Rule =
        unwrap(this).onCloudTrailImagePushed(arg0).let(Rule::wrap)

    public override fun onCloudTrailImagePushed(arg0: String, arg1: OnCloudTrailImagePushedOptions):
        Rule = unwrap(this).onCloudTrailImagePushed(arg0,
        arg1.let(OnCloudTrailImagePushedOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6ef082c6b809d259f51198817aa3b80a159542a1994bc4960ac065b0a64b707")
    public override fun onCloudTrailImagePushed(arg0: String,
        arg1: OnCloudTrailImagePushedOptions.Builder.() -> Unit): Rule =
        onCloudTrailImagePushed(arg0, OnCloudTrailImagePushedOptions(arg1))

    public override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    public override fun onEvent(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onEvent(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    public override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    public override fun onImageScanCompleted(arg0: String): Rule =
        unwrap(this).onImageScanCompleted(arg0).let(Rule::wrap)

    public override fun onImageScanCompleted(arg0: String, arg1: OnImageScanCompletedOptions): Rule
        = unwrap(this).onImageScanCompleted(arg0,
        arg1.let(OnImageScanCompletedOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af5fc24c7b64d0577fb9d831f23d31aac8a626027ac1285086eb1271758a5da3")
    public override fun onImageScanCompleted(arg0: String,
        arg1: OnImageScanCompletedOptions.Builder.() -> Unit): Rule = onImageScanCompleted(arg0,
        OnImageScanCompletedOptions(arg1))

    public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

    public override fun repositoryName(): String = unwrap(this).getRepositoryName()

    public override fun repositoryUri(): String = unwrap(this).getRepositoryUri()

    public override fun repositoryUriForDigest(): String = unwrap(this).repositoryUriForDigest()

    public override fun repositoryUriForDigest(arg0: String): String =
        unwrap(this).repositoryUriForDigest(arg0)

    public override fun repositoryUriForTag(): String = unwrap(this).repositoryUriForTag()

    public override fun repositoryUriForTag(arg0: String): String =
        unwrap(this).repositoryUriForTag(arg0)

    public override fun repositoryUriForTagOrDigest(): String =
        unwrap(this).repositoryUriForTagOrDigest()

    public override fun repositoryUriForTagOrDigest(arg0: String): String =
        unwrap(this).repositoryUriForTagOrDigest(arg0)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.IRepository): IRepository =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRepository): software.amazon.awscdk.services.ecr.IRepository =
        (wrapped as Wrapper).cdkObject
  }
}
