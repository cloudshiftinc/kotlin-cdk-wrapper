package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface PolicyStatementProps {
  public fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

  public fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  public fun effect(): Effect? = unwrap(this).getEffect()?.let(Effect::wrap)

  public fun notActions(): List<String> = unwrap(this).getNotActions() ?: emptyList()

  public fun notPrincipals(): List<IPrincipal> =
      unwrap(this).getNotPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

  public fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

  public fun principals(): List<IPrincipal> = unwrap(this).getPrincipals()?.map(IPrincipal::wrap) ?:
      emptyList()

  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public fun sid(): String? = unwrap(this).getSid()

  public interface Builder {
    public fun actions(actions: List<String>)

    public fun conditions(conditions: Map<String, Any>)

    public fun effect(effect: Effect)

    public fun notActions(notActions: List<String>)

    public fun notPrincipals(notPrincipals: List<IPrincipal>)

    public fun notResources(notResources: List<String>)

    public fun principals(principals: List<IPrincipal>)

    public fun resources(resources: List<String>)

    public fun sid(sid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyStatementProps.Builder =
        software.amazon.awscdk.services.iam.PolicyStatementProps.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun effect(effect: Effect) {
      cdkBuilder.effect(effect.let(Effect::unwrap))
    }

    override fun notActions(notActions: List<String>) {
      cdkBuilder.notActions(notActions)
    }

    override fun notPrincipals(notPrincipals: List<IPrincipal>) {
      cdkBuilder.notPrincipals(notPrincipals.map(IPrincipal::unwrap))
    }

    override fun notResources(notResources: List<String>) {
      cdkBuilder.notResources(notResources)
    }

    override fun principals(principals: List<IPrincipal>) {
      cdkBuilder.principals(principals.map(IPrincipal::unwrap))
    }

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    public fun build(): software.amazon.awscdk.services.iam.PolicyStatementProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.PolicyStatementProps,
  ) : PolicyStatementProps {
    override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    override fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

    override fun effect(): Effect? = unwrap(this).getEffect()?.let(Effect::wrap)

    override fun notActions(): List<String> = unwrap(this).getNotActions() ?: emptyList()

    override fun notPrincipals(): List<IPrincipal> =
        unwrap(this).getNotPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

    override fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

    override fun principals(): List<IPrincipal> =
        unwrap(this).getPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    override fun sid(): String? = unwrap(this).getSid()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyStatementProps):
        PolicyStatementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyStatementProps):
        software.amazon.awscdk.services.iam.PolicyStatementProps = (wrapped as Wrapper).cdkObject
  }
}
