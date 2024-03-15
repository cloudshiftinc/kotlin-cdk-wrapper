@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Secret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.Secret,
) : Resource(cdkObject), ISecret {
  public open fun addReplicaRegion(region: String) {
    unwrap(this).addReplicaRegion(region)
  }

  public open fun addReplicaRegion(region: String, encryptionKey: IKey) {
    unwrap(this).addReplicaRegion(region, encryptionKey.let(IKey::unwrap))
  }

  public override fun addRotationSchedule(id: String, options: RotationScheduleOptions):
      RotationSchedule = unwrap(this).addRotationSchedule(id,
      options.let(RotationScheduleOptions::unwrap)).let(RotationSchedule::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public override fun addRotationSchedule(id: String,
      options: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
      addRotationSchedule(id, RotationScheduleOptions(options))

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun attach(target: ISecretAttachmentTarget): ISecret =
      unwrap(this).attach(target.let(ISecretAttachmentTarget::unwrap)).let(ISecret::wrap)

  public override fun denyAccountRootDelete() {
    unwrap(this).denyAccountRootDelete()
  }

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public open fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap), versionStages).let(Grant::wrap)

  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun secretArn(): String = unwrap(this).getSecretArn()

  public override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  public override fun secretName(): String = unwrap(this).getSecretName()

  public override fun secretValue(): SecretValue =
      unwrap(this).getSecretValue().let(SecretValue::wrap)

  public override fun secretValueFromJson(jsonField: String): SecretValue =
      unwrap(this).secretValueFromJson(jsonField).let(SecretValue::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun generateSecretString(generateSecretString: SecretStringGenerator)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432bf523ce3cefc0354228b8978c1c1b0db664de7ca5a31b7c101f2cd30dc646")
    public fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    public fun secretName(secretName: String)

    public fun secretObjectValue(secretObjectValue: Map<String, SecretValue>)

    @Deprecated(message = "deprecated in CDK")
    public fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1)

    public fun secretStringValue(secretStringValue: SecretValue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.Secret.Builder =
        software.amazon.awscdk.services.secretsmanager.Secret.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun generateSecretString(generateSecretString: SecretStringGenerator) {
      cdkBuilder.generateSecretString(generateSecretString.let(SecretStringGenerator::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("432bf523ce3cefc0354228b8978c1c1b0db664de7ca5a31b7c101f2cd30dc646")
    override
        fun generateSecretString(generateSecretString: SecretStringGenerator.Builder.() -> Unit):
        Unit = generateSecretString(SecretStringGenerator(generateSecretString))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    override fun secretObjectValue(secretObjectValue: Map<String, SecretValue>) {
      cdkBuilder.secretObjectValue(secretObjectValue.mapValues{SecretValue.unwrap(it.value)})
    }

    @Deprecated(message = "deprecated in CDK")
    override fun secretStringBeta1(secretStringBeta1: SecretStringValueBeta1) {
      cdkBuilder.secretStringBeta1(secretStringBeta1.let(SecretStringValueBeta1::unwrap))
    }

    override fun secretStringValue(secretStringValue: SecretValue) {
      cdkBuilder.secretStringValue(secretStringValue.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.Secret = cdkBuilder.build()
  }

  public companion object {
    public fun fromSecretAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecretAttributes,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SecretAttributes::unwrap)).let(ISecret::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc9143f7f368629afa8c68f5cc797692785ded40710919292c6e0847b43e61e")
    public fun fromSecretAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SecretAttributes.Builder.() -> Unit,
    ): ISecret = fromSecretAttributes(scope, id, SecretAttributes(attrs))

    public fun fromSecretCompleteArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretCompleteArn: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretCompleteArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretCompleteArn).let(ISecret::wrap)

    public fun fromSecretNameV2(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretName: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretNameV2(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretName).let(ISecret::wrap)

    public fun fromSecretPartialArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretPartialArn: String,
    ): ISecret =
        software.amazon.awscdk.services.secretsmanager.Secret.fromSecretPartialArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, secretPartialArn).let(ISecret::wrap)

    public fun isSecret(x: Any): Boolean =
        software.amazon.awscdk.services.secretsmanager.Secret.isSecret(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Secret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Secret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.Secret): Secret =
        Secret(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.secretsmanager.Secret =
        wrapped.cdkObject
  }
}
