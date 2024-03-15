@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Alias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.Alias,
) : Resource(cdkObject), IAlias {
  public override fun addAlias(alias: String): Alias = unwrap(this).addAlias(alias).let(Alias::wrap)

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
      AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap),
      allowNoOp).let(AddToResourcePolicyResult::wrap)

  public open fun aliasArn(): String = unwrap(this).getAliasArn()

  public override fun aliasName(): String = unwrap(this).getAliasName()

  public override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

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

  @Deprecated(message = "deprecated in CDK")
  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  @CdkDslMarker
  public interface Builder {
    public fun aliasName(aliasName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun targetKey(targetKey: IKey)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.Alias.Builder =
        software.amazon.awscdk.services.kms.Alias.Builder.create(scope, id)

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun targetKey(targetKey: IKey) {
      cdkBuilder.targetKey(targetKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.Alias = cdkBuilder.build()
  }

  public companion object {
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes,
    ): IAlias =
        software.amazon.awscdk.services.kms.Alias.fromAliasAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AliasAttributes::unwrap)).let(IAlias::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f8a4f380057c7db5b4bb4a37859d5e4eb587ce5d28aeceaa398fb06fc738c1f")
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes.Builder.() -> Unit,
    ): IAlias = fromAliasAttributes(scope, id, AliasAttributes(attrs))

    public fun fromAliasName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      aliasName: String,
    ): IAlias =
        software.amazon.awscdk.services.kms.Alias.fromAliasName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, aliasName).let(IAlias::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Alias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Alias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.Alias): Alias =
        Alias(cdkObject)

    internal fun unwrap(wrapped: Alias): software.amazon.awscdk.services.kms.Alias =
        wrapped.cdkObject
  }
}
