package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IKey : IResource {
  public fun addAlias(arg0: String): Alias

  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun addToResourcePolicy(arg0: PolicyStatement, arg1: Boolean): AddToResourcePolicyResult

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantDecrypt(arg0: IGrantable): Grant

  public fun grantEncrypt(arg0: IGrantable): Grant

  public fun grantEncryptDecrypt(arg0: IGrantable): Grant

  public fun grantGenerateMac(arg0: IGrantable): Grant

  public fun grantVerifyMac(arg0: IGrantable): Grant

  public fun keyArn(): String

  public fun keyId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.kms.IKey,
  ) : IKey {
    override fun addAlias(arg0: String): Alias = unwrap(this).addAlias(arg0).let(Alias::wrap)

    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun addToResourcePolicy(arg0: PolicyStatement, arg1: Boolean):
        AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap),
        arg1).let(AddToResourcePolicyResult::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantDecrypt(arg0: IGrantable): Grant =
        unwrap(this).grantDecrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantEncrypt(arg0: IGrantable): Grant =
        unwrap(this).grantEncrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantEncryptDecrypt(arg0: IGrantable): Grant =
        unwrap(this).grantEncryptDecrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantGenerateMac(arg0: IGrantable): Grant =
        unwrap(this).grantGenerateMac(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantVerifyMac(arg0: IGrantable): Grant =
        unwrap(this).grantVerifyMac(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun keyArn(): String = unwrap(this).getKeyArn()

    override fun keyId(): String = unwrap(this).getKeyId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IKey): IKey =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKey): software.amazon.awscdk.services.kms.IKey = (wrapped as
        Wrapper).cdkObject
  }
}
