package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicableAssetTypes(): List<String> = unwrap(this).getApplicableAssetTypes()

  public open fun applicableAssetTypes(`value`: List<String>) {
    unwrap(this).setApplicableAssetTypes(`value`)
  }

  public open fun applicableAssetTypes(vararg `value`: String): Unit =
      applicableAssetTypes(`value`.toList())

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun attrUpdatedBy(): String = unwrap(this).getAttrUpdatedBy()

  public open fun authorizedPrincipals(): List<String> = unwrap(this).getAuthorizedPrincipals()

  public open fun authorizedPrincipals(`value`: List<String>) {
    unwrap(this).setAuthorizedPrincipals(`value`)
  }

  public open fun authorizedPrincipals(vararg `value`: String): Unit =
      authorizedPrincipals(`value`.toList())

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun manageAccessRole(): String = unwrap(this).getManageAccessRole()

  public open fun manageAccessRole(`value`: String) {
    unwrap(this).setManageAccessRole(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun provider(): String? = unwrap(this).getProvider()

  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  public open fun subscriptionTargetConfig(): Any = unwrap(this).getSubscriptionTargetConfig()

  public open fun subscriptionTargetConfig(`value`: IResolvable) {
    unwrap(this).setSubscriptionTargetConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun subscriptionTargetConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscriptionTargetConfig(__idx_ac66f0)
  }

  public open fun subscriptionTargetConfig(vararg __idx_ac66f0: Any): Unit =
      subscriptionTargetConfig(__idx_ac66f0.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.Builder =
        software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.datazone.CfnSubscriptionTarget =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget):
        CfnSubscriptionTarget = CfnSubscriptionTarget(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionTarget):
        software.amazon.awscdk.services.datazone.CfnSubscriptionTarget = wrapped.cdkObject
  }

  public interface SubscriptionTargetFormProperty {
    public fun content(): String

    public fun formName(): String

    public interface Builder {
      public fun content(content: String)

      public fun formName(formName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun formName(formName: String) {
        cdkBuilder.formName(formName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty,
    ) : SubscriptionTargetFormProperty {
      override fun content(): String = unwrap(this).getContent()

      override fun formName(): String = unwrap(this).getFormName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionTargetFormProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty):
          SubscriptionTargetFormProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionTargetFormProperty):
          software.amazon.awscdk.services.datazone.CfnSubscriptionTarget.SubscriptionTargetFormProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
