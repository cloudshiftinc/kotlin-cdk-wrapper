package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ISecret : IResource {
  public fun addRotationSchedule(arg0: String, arg1: RotationScheduleOptions): RotationSchedule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public fun addRotationSchedule(arg0: String, arg1: RotationScheduleOptions.Builder.() -> Unit):
      RotationSchedule

  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun attach(arg0: ISecretAttachmentTarget): ISecret

  public fun denyAccountRootDelete()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantRead(arg0: IGrantable, arg1: List<String>): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun secretArn(): String

  public fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  public fun secretName(): String

  public fun secretValue(): SecretValue

  public fun secretValueFromJson(arg0: String): SecretValue

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.secretsmanager.ISecret,
  ) : ISecret {
    public override fun addRotationSchedule(arg0: String, arg1: RotationScheduleOptions):
        RotationSchedule = unwrap(this).addRotationSchedule(arg0,
        arg1.let(RotationScheduleOptions::unwrap)).let(RotationSchedule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
    public override fun addRotationSchedule(arg0: String,
        arg1: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
        addRotationSchedule(arg0, RotationScheduleOptions(arg1))

    public override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    public override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun attach(arg0: ISecretAttachmentTarget): ISecret =
        unwrap(this).attach(arg0.let(ISecretAttachmentTarget::unwrap)).let(ISecret::wrap)

    public override fun denyAccountRootDelete() {
      unwrap(this).denyAccountRootDelete()
    }

    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantRead(arg0: IGrantable, arg1: List<String>): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun secretArn(): String = unwrap(this).getSecretArn()

    public override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

    public override fun secretName(): String = unwrap(this).getSecretName()

    public override fun secretValue(): SecretValue =
        unwrap(this).getSecretValue().let(SecretValue::wrap)

    public override fun secretValueFromJson(arg0: String): SecretValue =
        unwrap(this).secretValueFromJson(arg0).let(SecretValue::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecret): ISecret =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecret): software.amazon.awscdk.services.secretsmanager.ISecret =
        (wrapped as Wrapper).cdkObject
  }
}
