@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface SecretProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun generateSecretString(): SecretStringGenerator? =
      unwrap(this).getGenerateSecretString()?.let(SecretStringGenerator::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  public fun secretName(): String? = unwrap(this).getSecretName()

  public fun secretObjectValue(): Map<String, SecretValue> =
      unwrap(this).getSecretObjectValue()?.mapValues{SecretValue.wrap(it.value)} ?: emptyMap()

  @Deprecated(message = "deprecated in CDK")
  public fun secretStringBeta1(): SecretStringValueBeta1? =
      unwrap(this).getSecretStringBeta1()?.let(SecretStringValueBeta1::wrap)

  public fun secretStringValue(): SecretValue? =
      unwrap(this).getSecretStringValue()?.let(SecretValue::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun encryptionKey(encryptionKey: IKey)

    public fun generateSecretString(generateSecretString: SecretStringGenerator)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8af2d5073b6ec6287167783559d11ff0eff5112d334f13eb677be14bc6c75a3e")
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretProps.builder()

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
    @JvmName("8af2d5073b6ec6287167783559d11ff0eff5112d334f13eb677be14bc6c75a3e")
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

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretProps,
  ) : CdkObject(cdkObject), SecretProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun generateSecretString(): SecretStringGenerator? =
        unwrap(this).getGenerateSecretString()?.let(SecretStringGenerator::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

    override fun secretName(): String? = unwrap(this).getSecretName()

    override fun secretObjectValue(): Map<String, SecretValue> =
        unwrap(this).getSecretObjectValue()?.mapValues{SecretValue.wrap(it.value)} ?: emptyMap()

    @Deprecated(message = "deprecated in CDK")
    override fun secretStringBeta1(): SecretStringValueBeta1? =
        unwrap(this).getSecretStringBeta1()?.let(SecretStringValueBeta1::wrap)

    override fun secretStringValue(): SecretValue? =
        unwrap(this).getSecretStringValue()?.let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretProps):
        SecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretProps):
        software.amazon.awscdk.services.secretsmanager.SecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretProps
  }
}
