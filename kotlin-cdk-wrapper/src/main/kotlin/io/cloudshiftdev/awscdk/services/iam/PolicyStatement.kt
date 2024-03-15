@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class PolicyStatement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PolicyStatement,
) : CdkObject(cdkObject) {
  public open fun actions(): List<String> = unwrap(this).getActions()

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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun notActions(): List<String> = unwrap(this).getNotActions()

  public open fun notPrincipals(): List<IPrincipal> =
      unwrap(this).getNotPrincipals().map(IPrincipal::wrap)

  public open fun notResources(): List<String> = unwrap(this).getNotResources()

  public open fun principals(): List<IPrincipal> =
      unwrap(this).getPrincipals().map(IPrincipal::wrap)

  public open fun resources(): List<String> = unwrap(this).getResources()

  public open fun sid(): String? = unwrap(this).getSid()

  public open fun sid(`value`: String) {
    unwrap(this).setSid(`value`)
  }

  public open fun toJson(): Any = unwrap(this).toJSON()

  public open fun toStatementJson(): Any = unwrap(this).toStatementJson()

  public open fun validateForAnyPolicy(): List<String> = unwrap(this).validateForAnyPolicy()

  public open fun validateForIdentityPolicy(): List<String> =
      unwrap(this).validateForIdentityPolicy()

  public open fun validateForResourcePolicy(): List<String> =
      unwrap(this).validateForResourcePolicy()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<String>)

    public fun actions(vararg actions: String)

    public fun conditions(conditions: Map<String, Any>)

    public fun effect(effect: Effect)

    public fun notActions(notActions: List<String>)

    public fun notActions(vararg notActions: String)

    public fun notPrincipals(notPrincipals: List<IPrincipal>)

    public fun notPrincipals(vararg notPrincipals: IPrincipal)

    public fun notResources(notResources: List<String>)

    public fun notResources(vararg notResources: String)

    public fun principals(principals: List<IPrincipal>)

    public fun principals(vararg principals: IPrincipal)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun sid(sid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyStatement.Builder =
        software.amazon.awscdk.services.iam.PolicyStatement.Builder.create()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun effect(effect: Effect) {
      cdkBuilder.effect(effect.let(Effect::unwrap))
    }

    override fun notActions(notActions: List<String>) {
      cdkBuilder.notActions(notActions)
    }

    override fun notActions(vararg notActions: String): Unit = notActions(notActions.toList())

    override fun notPrincipals(notPrincipals: List<IPrincipal>) {
      cdkBuilder.notPrincipals(notPrincipals.map(IPrincipal::unwrap))
    }

    override fun notPrincipals(vararg notPrincipals: IPrincipal): Unit =
        notPrincipals(notPrincipals.toList())

    override fun notResources(notResources: List<String>) {
      cdkBuilder.notResources(notResources)
    }

    override fun notResources(vararg notResources: String): Unit =
        notResources(notResources.toList())

    override fun principals(principals: List<IPrincipal>) {
      cdkBuilder.principals(principals.map(IPrincipal::unwrap))
    }

    override fun principals(vararg principals: IPrincipal): Unit = principals(principals.toList())

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    public fun build(): software.amazon.awscdk.services.iam.PolicyStatement = cdkBuilder.build()
  }

  public companion object {
    public fun fromJson(obj: Any): PolicyStatement =
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
