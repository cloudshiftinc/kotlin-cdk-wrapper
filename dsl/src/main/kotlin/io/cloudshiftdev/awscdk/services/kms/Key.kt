package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Key internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kms.Key,
) : Resource(cdkObject), IKey {
  public override fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
      AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap),
      allowNoOp).let(AddToResourcePolicyResult::wrap)

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public open fun grantAdmin(grantee: IGrantable): Grant =
      unwrap(this).grantAdmin(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantEncrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantEncryptDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncryptDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantGenerateMac(grantee: IGrantable): Grant =
      unwrap(this).grantGenerateMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantVerifyMac(grantee: IGrantable): Grant =
      unwrap(this).grantVerifyMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  public interface Builder {
    public fun admins(admins: List<IPrincipal>)

    public fun alias(alias: String)

    public fun description(description: String)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun enabled(enabled: Boolean)

    public fun keySpec(keySpec: KeySpec)

    public fun keyUsage(keyUsage: KeyUsage)

    public fun pendingWindow(pendingWindow: Duration)

    public fun policy(policy: PolicyDocument)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c7475e42519d6a2cabeb2117fee0a8b686e15b9804c0b06233e8ae6370d2268")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.Key.Builder =
        software.amazon.awscdk.services.kms.Key.Builder.create(scope, id)

    override fun admins(admins: List<IPrincipal>) {
      cdkBuilder.admins(admins.map(IPrincipal::unwrap))
    }

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun keySpec(keySpec: KeySpec) {
      cdkBuilder.keySpec(keySpec.let(KeySpec::unwrap))
    }

    override fun keyUsage(keyUsage: KeyUsage) {
      cdkBuilder.keyUsage(keyUsage.let(KeyUsage::unwrap))
    }

    override fun pendingWindow(pendingWindow: Duration) {
      cdkBuilder.pendingWindow(pendingWindow.let(Duration::unwrap))
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c7475e42519d6a2cabeb2117fee0a8b686e15b9804c0b06233e8ae6370d2268")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.Key = cdkBuilder.build()
  }

  public companion object {
    public open fun fromCfnKey(cfnKey: CfnKey): IKey =
        software.amazon.awscdk.services.kms.Key.fromCfnKey(cfnKey.let(CfnKey::unwrap)).let(IKey::wrap)

    public open fun fromKeyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyArn: String,
    ): IKey =
        software.amazon.awscdk.services.kms.Key.fromKeyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyArn).let(IKey::wrap)

    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: KeyLookupOptions,
    ): IKey =
        software.amazon.awscdk.services.kms.Key.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(KeyLookupOptions::unwrap)).let(IKey::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a38292968d860b56054807de2f29eed5b258ee0b12b25fe8d96e0d9eadd0a18a")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: KeyLookupOptions.Builder.() -> Unit,
    ): IKey = fromLookup(scope, id, KeyLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Key {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Key(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.Key): Key = Key(cdkObject)

    internal fun unwrap(wrapped: Key): software.amazon.awscdk.services.kms.Key = wrapped.cdkObject
  }
}
