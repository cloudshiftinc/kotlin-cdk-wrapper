@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubscriptionTargetProps {
  public fun applicableAssetTypes(): List<String>

  public fun authorizedPrincipals(): List<String>

  public fun domainIdentifier(): String

  public fun environmentIdentifier(): String

  public fun manageAccessRole(): String

  public fun name(): String

  public fun provider(): String? = unwrap(this).getProvider()

  public fun subscriptionTargetConfig(): Any

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun applicableAssetTypes(applicableAssetTypes: List<String>)

    public fun applicableAssetTypes(vararg applicableAssetTypes: String)

    public fun authorizedPrincipals(authorizedPrincipals: List<String>)

    public fun authorizedPrincipals(vararg authorizedPrincipals: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun manageAccessRole(manageAccessRole: String)

    public fun name(name: String)

    public fun provider(provider: String)

    public fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable)

    public fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>)

    public fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps.Builder =
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps.builder()

    override fun applicableAssetTypes(applicableAssetTypes: List<String>) {
      cdkBuilder.applicableAssetTypes(applicableAssetTypes)
    }

    override fun applicableAssetTypes(vararg applicableAssetTypes: String): Unit =
        applicableAssetTypes(applicableAssetTypes.toList())

    override fun authorizedPrincipals(authorizedPrincipals: List<String>) {
      cdkBuilder.authorizedPrincipals(authorizedPrincipals)
    }

    override fun authorizedPrincipals(vararg authorizedPrincipals: String): Unit =
        authorizedPrincipals(authorizedPrincipals.toList())

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun manageAccessRole(manageAccessRole: String) {
      cdkBuilder.manageAccessRole(manageAccessRole)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun subscriptionTargetConfig(subscriptionTargetConfig: IResolvable) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig.let(IResolvable::unwrap))
    }

    override fun subscriptionTargetConfig(subscriptionTargetConfig: List<Any>) {
      cdkBuilder.subscriptionTargetConfig(subscriptionTargetConfig)
    }

    override fun subscriptionTargetConfig(vararg subscriptionTargetConfig: Any): Unit =
        subscriptionTargetConfig(subscriptionTargetConfig.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps,
  ) : CdkObject(cdkObject), CfnSubscriptionTargetProps {
    override fun applicableAssetTypes(): List<String> = unwrap(this).getApplicableAssetTypes()

    override fun authorizedPrincipals(): List<String> = unwrap(this).getAuthorizedPrincipals()

    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    override fun manageAccessRole(): String = unwrap(this).getManageAccessRole()

    override fun name(): String = unwrap(this).getName()

    override fun provider(): String? = unwrap(this).getProvider()

    override fun subscriptionTargetConfig(): Any = unwrap(this).getSubscriptionTargetConfig()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps):
        CfnSubscriptionTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionTargetProps):
        software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps
  }
}
