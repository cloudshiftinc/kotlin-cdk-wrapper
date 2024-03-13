package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class PolicyStatement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.PolicyStatement,
) {
  public open fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

  public open fun addAccountCondition(accountId: String) {
    unwrap(this).addAccountCondition(accountId)
  }

  public open fun addAccountRootPrincipal() {
    unwrap(this).addAccountRootPrincipal()
  }

  public open fun addActions(actions: String) {
    unwrap(this).addActions(actions)
  }

  public open fun addAllResources() {
    unwrap(this).addAllResources()
  }

  public open fun addAnyPrincipal() {
    unwrap(this).addAnyPrincipal()
  }

  public open fun addArnPrincipal(arn: String) {
    unwrap(this).addArnPrincipal(arn)
  }

  public open fun addAwsAccountPrincipal(accountId: String) {
    unwrap(this).addAwsAccountPrincipal(accountId)
  }

  public open fun addCanonicalUserPrincipal(canonicalUserId: String) {
    unwrap(this).addCanonicalUserPrincipal(canonicalUserId)
  }

  public open fun addCondition(key: String, `value`: Any) {
    unwrap(this).addCondition(key, `value`)
  }

  public open fun addConditions(conditions: Map<String, Any>) {
    unwrap(this).addConditions(conditions)
  }

  public open fun addFederatedPrincipal(federated: Any, conditions: Map<String, Any>) {
    unwrap(this).addFederatedPrincipal(federated, conditions)
  }

  public open fun addNotActions(notActions: String) {
    unwrap(this).addNotActions(notActions)
  }

  public open fun addNotPrincipals(notPrincipals: IPrincipal) {
    unwrap(this).addNotPrincipals(notPrincipals.let(IPrincipal::unwrap))
  }

  public open fun addNotResources(arns: String) {
    unwrap(this).addNotResources(arns)
  }

  public open fun addPrincipals(principals: IPrincipal) {
    unwrap(this).addPrincipals(principals.let(IPrincipal::unwrap))
  }

  public open fun addResources(arns: String) {
    unwrap(this).addResources(arns)
  }

  public open fun addServicePrincipal(service: String) {
    unwrap(this).addServicePrincipal(service)
  }

  public open fun addServicePrincipal(service: String, opts: ServicePrincipalOpts) {
    unwrap(this).addServicePrincipal(service, opts.let(ServicePrincipalOpts::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01f982aa65ad7d50f10c65b2c50eae381c720349ccb3d598b29dd0bb966cde71")
  public open fun addServicePrincipal(service: String,
      opts: ServicePrincipalOpts.Builder.() -> Unit): Unit = addServicePrincipal(service,
      ServicePrincipalOpts(opts))

  public open fun addSourceAccountCondition(accountId: String) {
    unwrap(this).addSourceAccountCondition(accountId)
  }

  public open fun addSourceArnCondition(arn: String) {
    unwrap(this).addSourceArnCondition(arn)
  }

  public open fun conditions(): Any = unwrap(this).getConditions()

  public open fun copy(): PolicyStatement = unwrap(this).copy().let(PolicyStatement::wrap)

  public open fun copy(overrides: PolicyStatementProps): PolicyStatement =
      unwrap(this).copy(overrides.let(PolicyStatementProps::unwrap)).let(PolicyStatement::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49fd20e1ad8116acd8ec88b0dbea23455b65b7ed0904a56b0ac55b81b04e2498")
  public open fun copy(overrides: PolicyStatementProps.Builder.() -> Unit): PolicyStatement =
      copy(PolicyStatementProps(overrides))

  public open fun effect(): Effect = unwrap(this).getEffect().let(Effect::wrap)

  public open fun effect(`value`: Effect) {
    unwrap(this).setEffect(`value`.let(Effect::unwrap))
  }

  public open fun freeze(): PolicyStatement = unwrap(this).freeze().let(PolicyStatement::wrap)

  public open fun frozen(): Boolean = unwrap(this).getFrozen()

  public open fun hasPrincipal(): Boolean = unwrap(this).getHasPrincipal()

  public open fun hasResource(): Boolean = unwrap(this).getHasResource()

  public open fun notActions(): List<String> = unwrap(this).getNotActions() ?: emptyList()

  public open fun notPrincipals(): List<IPrincipal> =
      unwrap(this).getNotPrincipals().map(IPrincipal::wrap)

  public open fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

  public open fun principals(): List<IPrincipal> =
      unwrap(this).getPrincipals().map(IPrincipal::wrap)

  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public open fun sid(): String? = unwrap(this).getSid()

  public open fun sid(`value`: String) {
    unwrap(this).setSid(`value`)
  }

  public open fun toJson(): Any = unwrap(this).toJSON()

  public open fun toStatementJson(): Any = unwrap(this).toStatementJson()

  public open fun validateForAnyPolicy(): List<String> = unwrap(this).validateForAnyPolicy() ?:
      emptyList()

  public open fun validateForIdentityPolicy(): List<String> =
      unwrap(this).validateForIdentityPolicy() ?: emptyList()

  public open fun validateForResourcePolicy(): List<String> =
      unwrap(this).validateForResourcePolicy() ?: emptyList()

  public interface Builder {
    public fun actions(actions: List<String>) {
    }

    public fun conditions(conditions: Map<String, Any>) {
    }

    public fun effect(effect: Effect) {
    }

    public fun notActions(notActions: List<String>) {
    }

    public fun notPrincipals(notPrincipals: List<IPrincipal>) {
    }

    public fun notResources(notResources: List<String>) {
    }

    public fun principals(principals: List<IPrincipal>) {
    }

    public fun resources(resources: List<String>) {
    }

    public fun sid(sid: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyStatement.Builder =
        software.amazon.awscdk.services.iam.PolicyStatement.Builder.create()

    public override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    public override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    public override fun effect(effect: Effect) {
      cdkBuilder.effect(effect.let(Effect::unwrap))
    }

    public override fun notActions(notActions: List<String>) {
      cdkBuilder.notActions(notActions)
    }

    public override fun notPrincipals(notPrincipals: List<IPrincipal>) {
      cdkBuilder.notPrincipals(notPrincipals.map(IPrincipal::unwrap))
    }

    public override fun notResources(notResources: List<String>) {
      cdkBuilder.notResources(notResources)
    }

    public override fun principals(principals: List<IPrincipal>) {
      cdkBuilder.principals(principals.map(IPrincipal::unwrap))
    }

    public override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    public override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    public fun build(): software.amazon.awscdk.services.iam.PolicyStatement = cdkBuilder.build()
  }

  public companion object {
    public open fun fromJson(obj: Any): PolicyStatement =
        software.amazon.awscdk.services.iam.PolicyStatement.fromJson(obj).let(PolicyStatement::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatement {
      val builderImpl = BuilderImpl()
      return PolicyStatement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyStatement):
        PolicyStatement = PolicyStatement(cdkObject)

    internal fun unwrap(wrapped: PolicyStatement):
        software.amazon.awscdk.services.iam.PolicyStatement = wrapped.cdkObject
  }
}
