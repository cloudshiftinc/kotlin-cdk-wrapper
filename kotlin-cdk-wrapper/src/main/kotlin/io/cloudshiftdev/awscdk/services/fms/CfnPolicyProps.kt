@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPolicyProps {
  public fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

  public fun excludeMap(): Any? = unwrap(this).getExcludeMap()

  public fun excludeResourceTags(): Any

  public fun includeMap(): Any? = unwrap(this).getIncludeMap()

  public fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  public fun policyName(): String

  public fun remediationEnabled(): Any

  public fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public fun resourceType(): String? = unwrap(this).getResourceType()

  public fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?: emptyList()

  public fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

  public fun securityServicePolicyData(): Any

  public fun tags(): List<CfnPolicy.PolicyTagProperty> =
      unwrap(this).getTags()?.map(CfnPolicy.PolicyTagProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean)

    public fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable)

    public fun excludeMap(excludeMap: IResolvable)

    public fun excludeMap(excludeMap: CfnPolicy.IEMapProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dabac81d9d14de8582790778205aac9f55dc0bf0e374279a1aaba7bd345cc8df")
    public fun excludeMap(excludeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit)

    public fun excludeResourceTags(excludeResourceTags: Boolean)

    public fun excludeResourceTags(excludeResourceTags: IResolvable)

    public fun includeMap(includeMap: IResolvable)

    public fun includeMap(includeMap: CfnPolicy.IEMapProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0235a1bc8910622f1c668441f2471fc699a55b2eeb6f6aa7e06f9f74235904d")
    public fun includeMap(includeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit)

    public fun policyDescription(policyDescription: String)

    public fun policyName(policyName: String)

    public fun remediationEnabled(remediationEnabled: Boolean)

    public fun remediationEnabled(remediationEnabled: IResolvable)

    public fun resourceSetIds(resourceSetIds: List<String>)

    public fun resourceSetIds(vararg resourceSetIds: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: List<Any>)

    public fun resourceTags(vararg resourceTags: Any)

    public fun resourceType(resourceType: String)

    public fun resourceTypeList(resourceTypeList: List<String>)

    public fun resourceTypeList(vararg resourceTypeList: String)

    public fun resourcesCleanUp(resourcesCleanUp: Boolean)

    public fun resourcesCleanUp(resourcesCleanUp: IResolvable)

    public fun securityServicePolicyData(securityServicePolicyData: IResolvable)

    public
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5cd94c5a2ee23d6307ea07058e670e3c79f73632f0d8f9d24a9f53081cd56")
    public
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnPolicy.PolicyTagProperty>)

    public fun tags(vararg tags: CfnPolicy.PolicyTagProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.fms.CfnPolicyProps.builder()

    override fun deleteAllPolicyResources(deleteAllPolicyResources: Boolean) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources)
    }

    override fun deleteAllPolicyResources(deleteAllPolicyResources: IResolvable) {
      cdkBuilder.deleteAllPolicyResources(deleteAllPolicyResources.let(IResolvable::unwrap))
    }

    override fun excludeMap(excludeMap: IResolvable) {
      cdkBuilder.excludeMap(excludeMap.let(IResolvable::unwrap))
    }

    override fun excludeMap(excludeMap: CfnPolicy.IEMapProperty) {
      cdkBuilder.excludeMap(excludeMap.let(CfnPolicy.IEMapProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dabac81d9d14de8582790778205aac9f55dc0bf0e374279a1aaba7bd345cc8df")
    override fun excludeMap(excludeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit): Unit =
        excludeMap(CfnPolicy.IEMapProperty(excludeMap))

    override fun excludeResourceTags(excludeResourceTags: Boolean) {
      cdkBuilder.excludeResourceTags(excludeResourceTags)
    }

    override fun excludeResourceTags(excludeResourceTags: IResolvable) {
      cdkBuilder.excludeResourceTags(excludeResourceTags.let(IResolvable::unwrap))
    }

    override fun includeMap(includeMap: IResolvable) {
      cdkBuilder.includeMap(includeMap.let(IResolvable::unwrap))
    }

    override fun includeMap(includeMap: CfnPolicy.IEMapProperty) {
      cdkBuilder.includeMap(includeMap.let(CfnPolicy.IEMapProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0235a1bc8910622f1c668441f2471fc699a55b2eeb6f6aa7e06f9f74235904d")
    override fun includeMap(includeMap: CfnPolicy.IEMapProperty.Builder.() -> Unit): Unit =
        includeMap(CfnPolicy.IEMapProperty(includeMap))

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

    override fun resourceSetIds(vararg resourceSetIds: String): Unit =
        resourceSetIds(resourceSetIds.toList())

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    override fun resourceTypeList(vararg resourceTypeList: String): Unit =
        resourceTypeList(resourceTypeList.toList())

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
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty) {
      cdkBuilder.securityServicePolicyData(securityServicePolicyData.let(CfnPolicy.SecurityServicePolicyDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5cd94c5a2ee23d6307ea07058e670e3c79f73632f0d8f9d24a9f53081cd56")
    override
        fun securityServicePolicyData(securityServicePolicyData: CfnPolicy.SecurityServicePolicyDataProperty.Builder.() -> Unit):
        Unit =
        securityServicePolicyData(CfnPolicy.SecurityServicePolicyDataProperty(securityServicePolicyData))

    override fun tags(tags: List<CfnPolicy.PolicyTagProperty>) {
      cdkBuilder.tags(tags.map(CfnPolicy.PolicyTagProperty::unwrap))
    }

    override fun tags(vararg tags: CfnPolicy.PolicyTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fms.CfnPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fms.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    override fun deleteAllPolicyResources(): Any? = unwrap(this).getDeleteAllPolicyResources()

    override fun excludeMap(): Any? = unwrap(this).getExcludeMap()

    override fun excludeResourceTags(): Any = unwrap(this).getExcludeResourceTags()

    override fun includeMap(): Any? = unwrap(this).getIncludeMap()

    override fun policyDescription(): String? = unwrap(this).getPolicyDescription()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun remediationEnabled(): Any = unwrap(this).getRemediationEnabled()

    override fun resourceSetIds(): List<String> = unwrap(this).getResourceSetIds() ?: emptyList()

    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    override fun resourceType(): String? = unwrap(this).getResourceType()

    override fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList() ?:
        emptyList()

    override fun resourcesCleanUp(): Any? = unwrap(this).getResourcesCleanUp()

    override fun securityServicePolicyData(): Any = unwrap(this).getSecurityServicePolicyData()

    override fun tags(): List<CfnPolicy.PolicyTagProperty> =
        unwrap(this).getTags()?.map(CfnPolicy.PolicyTagProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnPolicyProps): CfnPolicyProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps): software.amazon.awscdk.services.fms.CfnPolicyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnPolicyProps
  }
}
