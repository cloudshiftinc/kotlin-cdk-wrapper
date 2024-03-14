package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

  public open fun deleteAllPolicyResources(`value`: Boolean) {
    unwrap(this).setDeleteAllPolicyResources(`value`)
  }

  public open fun deleteAllPolicyResources(`value`: IResolvable) {
    unwrap(this).setDeleteAllPolicyResources(`value`.let(IResolvable::unwrap))
  }

  public open fun excludeMap(): Any? = unwrap(this).getExcludeMap()

  public open fun excludeMap(`value`: IResolvable) {
    unwrap(this).setExcludeMap(`value`.let(IResolvable::unwrap))
  }

  public open fun excludeMap(`value`: IEMapProperty) {
    unwrap(this).setExcludeMap(`value`.let(IEMapProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90dbafc25c20538b49a99a833f29adda3ceeb6177d4c33e0fe39c0b87784184a")
  public open fun excludeMap(`value`: IEMapProperty.Builder.() -> Unit): Unit =
      excludeMap(IEMapProperty(`value`))

  public open fun excludeResourceTags(): Any = unwrap(this).getExcludeResourceTags()

  public open fun excludeResourceTags(`value`: Boolean) {
    unwrap(this).setExcludeResourceTags(`value`)
  }

  public open fun excludeResourceTags(`value`: IResolvable) {
    unwrap(this).setExcludeResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun includeMap(): Any? = unwrap(this).getIncludeMap()

  public open fun includeMap(`value`: IResolvable) {
    unwrap(this).setIncludeMap(`value`.let(IResolvable::unwrap))
  }

  public open fun includeMap(`value`: IEMapProperty) {
    unwrap(this).setIncludeMap(`value`.let(IEMapProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c68e54f81e190605e1afc5ac2797654a27e81d755507dd5890fae0427d239d41")
  public open fun includeMap(`value`: IEMapProperty.Builder.() -> Unit): Unit =
      includeMap(IEMapProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  public open fun policyDescription(`value`: String) {
    unwrap(this).setPolicyDescription(`value`)
  }

  public open fun policyName(): String = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  public open fun remediationEnabled(): Any = unwrap(this).getRemediationEnabled()

  public open fun remediationEnabled(`value`: Boolean) {
    unwrap(this).setRemediationEnabled(`value`)
  }

  public open fun remediationEnabled(`value`: IResolvable) {
    unwrap(this).setRemediationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

  public open fun resourceSetIds(`value`: List<String>) {
    unwrap(this).setResourceSetIds(`value`)
  }

  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(__idx_ac66f0)
  }

  public open fun resourceType(): String? = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?:
      emptyList()

  public open fun resourceTypeList(`value`: List<String>) {
    unwrap(this).setResourceTypeList(`value`)
  }

  public open fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

  public open fun resourcesCleanUp(`value`: Boolean) {
    unwrap(this).setResourcesCleanUp(`value`)
  }

  public open fun resourcesCleanUp(`value`: IResolvable) {
    unwrap(this).setResourcesCleanUp(`value`.let(IResolvable::unwrap))
  }

  public open fun securityServicePolicyData(): Any = unwrap(this).getSecurityServicePolicyData()

  public open fun securityServicePolicyData(`value`: IResolvable) {
    unwrap(this).setSecurityServicePolicyData(`value`.let(IResolvable::unwrap))
  }

  public open fun securityServicePolicyData(`value`: SecurityServicePolicyDataProperty) {
    unwrap(this).setSecurityServicePolicyData(`value`.let(SecurityServicePolicyDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ba9b3b101a2f14f2a035ec72d41466b590f563c22e74c228b813fe7f551a4f0")
  public open
      fun securityServicePolicyData(`value`: SecurityServicePolicyDataProperty.Builder.() -> Unit):
      Unit = securityServicePolicyData(SecurityServicePolicyDataProperty(`value`))

  public open fun tags(): List<PolicyTagProperty> =
      unwrap(this).getTags()?.map(PolicyTagProperty::wrap) ?: emptyList()

  public open fun tags(`value`: List<PolicyTagProperty>) {
    unwrap(this).setTags(`value`.map(PolicyTagProperty::unwrap))
  }

  public interface Builder {
    public fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean)

    public fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable)

    public fun excludeMap(excludeMap: IResolvable)

    public fun excludeMap(excludeMap: IEMapProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9201ba49b229379b9cdb087e646f6e6b0a3ee882c187741304b10358610837e3")
    public fun excludeMap(excludeMap: IEMapProperty.Builder.() -> Unit)

    public fun excludeResourceTags(excludeResourceTags: Boolean)

    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    public fun includeMap(includeMap: IResolvable)

    public fun includeMap(includeMap: IEMapProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be0f3fca68c982884aadf66d90ba2c15d32110488071e4668446e1d23d98c8a")
    public fun includeMap(includeMap: IEMapProperty.Builder.() -> Unit)

    public fun policyDescription(policyDescription: String)

    public fun policyName(policyName: String)

    public fun remediationEnabled(remediationEnabled: Boolean)

    public fun remediationEnabled(remediationEnabled: IResolvable)

    public fun resourceSetIds(resourceSetIds: List<String>)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: List<Any>)

    public fun resourceType(resourceType: String)

    public fun resourceTypeList(resourceTypeList: List<String>)

    public fun resourcesCleanUp(resourcesCleanUp: Boolean)

    public fun resourcesCleanUp(resourcesCleanUp: IResolvable)

    public fun securityServicePolicyData(securityServicePolicyData: IResolvable)

    public
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b0a8c4bc2180cc27511bfa544fbcc568c2089639558a518fac066f29b437aa5")
    public
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty.Builder.() -> Unit)

    public fun tags(tags: List<PolicyTagProperty>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicy.Builder =
        software.amazon.awscdk.services.fms.CfnPolicy.Builder.create(scope, id)

    override fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
    }

    override fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources.let(IResolvable::unwrap))
    }

    override fun excludeMap(excludeMap: IResolvable) {
      cdkBuilder.excludeMap(excludeMap.let(IResolvable::unwrap))
    }

    override fun excludeMap(excludeMap: IEMapProperty) {
      cdkBuilder.excludeMap(excludeMap.let(IEMapProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9201ba49b229379b9cdb087e646f6e6b0a3ee882c187741304b10358610837e3")
    override fun excludeMap(excludeMap: IEMapProperty.Builder.() -> Unit): Unit =
        excludeMap(IEMapProperty(excludeMap))

    override fun excludeResourceTags(excludeResourceTags: Boolean) {
      cdkBuilder.excludeResourceTags(excludeResourceTags)
    }

    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable::unwrap))
    }

    override fun includeMap(includeMap: IResolvable) {
      cdkBuilder.includeMap(includeMap.let(IResolvable::unwrap))
    }

    override fun includeMap(includeMap: IEMapProperty) {
      cdkBuilder.includeMap(includeMap.let(IEMapProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be0f3fca68c982884aadf66d90ba2c15d32110488071e4668446e1d23d98c8a")
    override fun includeMap(includeMap: IEMapProperty.Builder.() -> Unit): Unit =
        includeMap(IEMapProperty(includeMap))

    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun remediationEnabled(remediationEnabled: Boolean) {
      cdkBuilder.remediationEnabled(remediationEnabled)
    }

    override fun remediationEnabled(remediationEnabled: IResolvable) {
      cdkBuilder.remediationEnabled(remediationEnabled.let(IResolvable::unwrap))
    }

    override fun resourceSetIds(resourceSetIds: List<String>) {
      cdkBuilder.resourceSetIds(resourceSetIds)
    }

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    override fun resourcesCleanUp(resourcesCleanUp: Boolean) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp)
    }

    override fun resourcesCleanUp(resourcesCleanUp: IResolvable) {
      cdkBuilder.resourcesCleanUp(resourcesCleanUp.let(IResolvable::unwrap))
    }

    override fun securityServicePolicyData(securityServicePolicyData: IResolvable) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(IResolvable::unwrap))
    }

    override
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(SecurityServicePolicyDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b0a8c4bc2180cc27511bfa544fbcc568c2089639558a518fac066f29b437aa5")
    override
        fun securityServicePolicyData(securityServicePolicyData: SecurityServicePolicyDataProperty.Builder.() -> Unit):
        Unit =
        securityServicePolicyData(SecurityServicePolicyDataProperty(securityServicePolicyData))

    override fun tags(tags: List<PolicyTagProperty>) {
      cdkBuilder.tags(tags.map(PolicyTagProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fms.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy): CfnPolicy =
        CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.fms.CfnPolicy =
        wrapped.cdkObject
  }

  public interface IEMapProperty {
    public fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

    public fun orgunit(): List<String> = unwrap(this).getOrgunit() ?: emptyList()

    public interface Builder {
      public fun account(account: List<String>)

      public fun orgunit(orgunit: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty.builder()

      override fun account(account: List<String>) {
        cdkBuilder.account(account)
      }

      override fun orgunit(orgunit: List<String>) {
        cdkBuilder.orgunit(orgunit)
      }

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty,
    ) : IEMapProperty {
      override fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

      override fun orgunit(): List<String> = unwrap(this).getOrgunit() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IEMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty):
          IEMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IEMapProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourceTagProperty {
    public fun key(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty,
    ) : ResourceTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.ResourceTagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PolicyTagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty,
    ) : PolicyTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty):
          PolicyTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyTagProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ThirdPartyFirewallPolicyProperty {
    public fun firewallDeploymentModel(): String

    public interface Builder {
      public fun firewallDeploymentModel(firewallDeploymentModel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty.builder()

      override fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty,
    ) : ThirdPartyFirewallPolicyProperty {
      override fun firewallDeploymentModel(): String = unwrap(this).getFirewallDeploymentModel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThirdPartyFirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty):
          ThirdPartyFirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThirdPartyFirewallPolicyProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.ThirdPartyFirewallPolicyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PolicyOptionProperty {
    public fun networkFirewallPolicy(): Any? = unwrap(this).getNetworkFirewallPolicy()

    public fun thirdPartyFirewallPolicy(): Any? = unwrap(this).getThirdPartyFirewallPolicy()

    public interface Builder {
      public fun networkFirewallPolicy(networkFirewallPolicy: IResolvable)

      public fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bcfef3a9236edfe1e7fca0e402ed9c668da4af60317973bf9145ed2b8744616b")
      public
          fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty.Builder.() -> Unit)

      public fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: IResolvable)

      public
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ebfdb764ce864461cebec237cda266d743def4733edcc56b56b4ee2b8cd9fb")
      public
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty.builder()

      override fun networkFirewallPolicy(networkFirewallPolicy: IResolvable) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy.let(IResolvable::unwrap))
      }

      override fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty) {
        cdkBuilder.networkFirewallPolicy(networkFirewallPolicy.let(NetworkFirewallPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bcfef3a9236edfe1e7fca0e402ed9c668da4af60317973bf9145ed2b8744616b")
      override
          fun networkFirewallPolicy(networkFirewallPolicy: NetworkFirewallPolicyProperty.Builder.() -> Unit):
          Unit = networkFirewallPolicy(NetworkFirewallPolicyProperty(networkFirewallPolicy))

      override fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: IResolvable) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy.let(IResolvable::unwrap))
      }

      override
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty) {
        cdkBuilder.thirdPartyFirewallPolicy(thirdPartyFirewallPolicy.let(ThirdPartyFirewallPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ebfdb764ce864461cebec237cda266d743def4733edcc56b56b4ee2b8cd9fb")
      override
          fun thirdPartyFirewallPolicy(thirdPartyFirewallPolicy: ThirdPartyFirewallPolicyProperty.Builder.() -> Unit):
          Unit =
          thirdPartyFirewallPolicy(ThirdPartyFirewallPolicyProperty(thirdPartyFirewallPolicy))

      public fun build(): software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty,
    ) : PolicyOptionProperty {
      override fun networkFirewallPolicy(): Any? = unwrap(this).getNetworkFirewallPolicy()

      override fun thirdPartyFirewallPolicy(): Any? = unwrap(this).getThirdPartyFirewallPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty):
          PolicyOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyOptionProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.PolicyOptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecurityServicePolicyDataProperty {
    public fun managedServiceData(): String? = unwrap(this).getManagedServiceData()

    public fun policyOption(): Any? = unwrap(this).getPolicyOption()

    public fun type(): String

    public interface Builder {
      public fun managedServiceData(managedServiceData: String)

      public fun policyOption(policyOption: IResolvable)

      public fun policyOption(policyOption: PolicyOptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f802adb0072e9aff9070aaec6a8b5cccadf0cb1794bb55ea6dcb6d68e66c7c85")
      public fun policyOption(policyOption: PolicyOptionProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty.builder()

      override fun managedServiceData(managedServiceData: String) {
        cdkBuilder.managedServiceData(managedServiceData)
      }

      override fun policyOption(policyOption: IResolvable) {
        cdkBuilder.policyOption(policyOption.let(IResolvable::unwrap))
      }

      override fun policyOption(policyOption: PolicyOptionProperty) {
        cdkBuilder.policyOption(policyOption.let(PolicyOptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f802adb0072e9aff9070aaec6a8b5cccadf0cb1794bb55ea6dcb6d68e66c7c85")
      override fun policyOption(policyOption: PolicyOptionProperty.Builder.() -> Unit): Unit =
          policyOption(PolicyOptionProperty(policyOption))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty,
    ) : SecurityServicePolicyDataProperty {
      override fun managedServiceData(): String? = unwrap(this).getManagedServiceData()

      override fun policyOption(): Any? = unwrap(this).getPolicyOption()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecurityServicePolicyDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty):
          SecurityServicePolicyDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityServicePolicyDataProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.SecurityServicePolicyDataProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NetworkFirewallPolicyProperty {
    public fun firewallDeploymentModel(): String

    public interface Builder {
      public fun firewallDeploymentModel(firewallDeploymentModel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty.Builder =
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty.builder()

      override fun firewallDeploymentModel(firewallDeploymentModel: String) {
        cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
      }

      public fun build():
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty,
    ) : NetworkFirewallPolicyProperty {
      override fun firewallDeploymentModel(): String = unwrap(this).getFirewallDeploymentModel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkFirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty):
          NetworkFirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkFirewallPolicyProperty):
          software.amazon.awscdk.services.fms.CfnPolicy.NetworkFirewallPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
