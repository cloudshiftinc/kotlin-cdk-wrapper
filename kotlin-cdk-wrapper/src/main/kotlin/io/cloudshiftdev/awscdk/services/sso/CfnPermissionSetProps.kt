@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPermissionSetProps {
  public fun customerManagedPolicyReferences(): Any? =
      unwrap(this).getCustomerManagedPolicyReferences()

  public fun description(): String? = unwrap(this).getDescription()

  public fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

  public fun instanceArn(): String

  public fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

  public fun name(): String

  public fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

  public fun relayStateType(): String? = unwrap(this).getRelayStateType()

  public fun sessionDuration(): String? = unwrap(this).getSessionDuration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable)

    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>)

    public fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any)

    public fun description(description: String)

    public fun inlinePolicy(inlinePolicy: Any)

    public fun instanceArn(instanceArn: String)

    public fun managedPolicies(managedPolicies: List<String>)

    public fun managedPolicies(vararg managedPolicies: String)

    public fun name(name: String)

    public fun permissionsBoundary(permissionsBoundary: IResolvable)

    public
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c14e6a4914bb3fafcbed2113b07967e85f359ce102bc4d4a1e87c2c63c3afa")
    public
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit)

    public fun relayStateType(relayStateType: String)

    public fun sessionDuration(sessionDuration: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnPermissionSetProps.Builder =
        software.amazon.awscdk.services.sso.CfnPermissionSetProps.builder()

    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences.let(IResolvable::unwrap))
    }

    override fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
    }

    override fun customerManagedPolicyReferences(vararg customerManagedPolicyReferences: Any): Unit
        = customerManagedPolicyReferences(customerManagedPolicyReferences.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun inlinePolicy(inlinePolicy: Any) {
      cdkBuilder.inlinePolicy(inlinePolicy)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun managedPolicies(managedPolicies: List<String>) {
      cdkBuilder.managedPolicies(managedPolicies)
    }

    override fun managedPolicies(vararg managedPolicies: String): Unit =
        managedPolicies(managedPolicies.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionsBoundary(permissionsBoundary: IResolvable) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IResolvable::unwrap))
    }

    override
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(CfnPermissionSet.PermissionsBoundaryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02c14e6a4914bb3fafcbed2113b07967e85f359ce102bc4d4a1e87c2c63c3afa")
    override
        fun permissionsBoundary(permissionsBoundary: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit):
        Unit =
        permissionsBoundary(CfnPermissionSet.PermissionsBoundaryProperty(permissionsBoundary))

    override fun relayStateType(relayStateType: String) {
      cdkBuilder.relayStateType(relayStateType)
    }

    override fun sessionDuration(sessionDuration: String) {
      cdkBuilder.sessionDuration(sessionDuration)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnPermissionSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSetProps,
  ) : CdkObject(cdkObject), CfnPermissionSetProps {
    override fun customerManagedPolicyReferences(): Any? =
        unwrap(this).getCustomerManagedPolicyReferences()

    override fun description(): String? = unwrap(this).getDescription()

    override fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

    override fun relayStateType(): String? = unwrap(this).getRelayStateType()

    override fun sessionDuration(): String? = unwrap(this).getSessionDuration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSetProps):
        CfnPermissionSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionSetProps):
        software.amazon.awscdk.services.sso.CfnPermissionSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sso.CfnPermissionSetProps
  }
}
