package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SecretTargetAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment,
) : Resource(cdkObject), ISecretTargetAttachment, ISecret {
  public override fun addRotationSchedule(id: String, options: RotationScheduleOptions):
      RotationSchedule = unwrap(this).addRotationSchedule(id,
      options.let(RotationScheduleOptions::unwrap)).let(RotationSchedule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public override fun addRotationSchedule(id: String,
      options: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
      addRotationSchedule(id, RotationScheduleOptions(options))

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun attach(target: ISecretAttachmentTarget): ISecret =
      unwrap(this).attach(target.let(ISecretAttachmentTarget::unwrap)).let(ISecret::wrap)

  public override fun denyAccountRootDelete() {
    unwrap(this).denyAccountRootDelete()
  }

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap), versionStages).let(Grant::wrap)

  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun secretArn(): String = unwrap(this).getSecretArn()

  public override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  public override fun secretName(): String = unwrap(this).getSecretName()

  public override fun secretTargetAttachmentSecretArn(): String =
      unwrap(this).getSecretTargetAttachmentSecretArn()

  public override fun secretValue(): SecretValue =
      unwrap(this).getSecretValue().let(SecretValue::wrap)

  public override fun secretValueFromJson(jsonField: String): SecretValue =
      unwrap(this).secretValueFromJson(jsonField).let(SecretValue::wrap)

  public interface Builder {
    public fun secret(secret: ISecret)

    public fun target(target: ISecretAttachmentTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder.create(scope,
        id)

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    override fun target(target: ISecretAttachmentTarget) {
      cdkBuilder.target(target.let(ISecretAttachmentTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromSecretTargetAttachmentSecretArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretTargetAttachmentSecretArn: String,
    ): ISecretTargetAttachment =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.fromSecretTargetAttachmentSecretArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretTargetAttachmentSecretArn).let(ISecretTargetAttachment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecretTargetAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecretTargetAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment):
        SecretTargetAttachment = SecretTargetAttachment(cdkObject)

    internal fun unwrap(wrapped: SecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment = wrapped.cdkObject
  }
}
