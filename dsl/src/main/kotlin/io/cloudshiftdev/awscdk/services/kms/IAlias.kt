package io.cloudshiftdev.awscdk.services.kms

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

public interface IAlias : IKey {
  public fun aliasName(): String

  public fun aliasTargetKey(): IKey

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.kms.IAlias,
  ) : IAlias {
    public override fun addAlias(arg0: String): Alias = unwrap(this).addAlias(arg0).let(Alias::wrap)

    public override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    public override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    public override fun addToResourcePolicy(arg0: PolicyStatement, arg1: Boolean):
        AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap),
        arg1).let(AddToResourcePolicyResult::wrap)

    public override fun aliasName(): String = unwrap(this).getAliasName()

    public override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun grantDecrypt(arg0: IGrantable): Grant =
        unwrap(this).grantDecrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantEncrypt(arg0: IGrantable): Grant =
        unwrap(this).grantEncrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantEncryptDecrypt(arg0: IGrantable): Grant =
        unwrap(this).grantEncryptDecrypt(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantGenerateMac(arg0: IGrantable): Grant =
        unwrap(this).grantGenerateMac(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantVerifyMac(arg0: IGrantable): Grant =
        unwrap(this).grantVerifyMac(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun keyArn(): String = unwrap(this).getKeyArn()

    public override fun keyId(): String = unwrap(this).getKeyId()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IAlias): IAlias =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlias): software.amazon.awscdk.services.kms.IAlias = (wrapped as
        Wrapper).cdkObject
  }
}
