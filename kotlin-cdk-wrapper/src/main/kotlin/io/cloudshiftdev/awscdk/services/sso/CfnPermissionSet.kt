@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermissionSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrPermissionSetArn(): String = unwrap(this).getAttrPermissionSetArn()

  public open fun customerManagedPolicyReferences(): Any? =
      unwrap(this).getCustomerManagedPolicyReferences()

  public open fun customerManagedPolicyReferences(`value`: IResolvable) {
    unwrap(this).setCustomerManagedPolicyReferences(`value`.let(IResolvable::unwrap))
  }

  public open fun customerManagedPolicyReferences(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomerManagedPolicyReferences(__idx_ac66f0)
  }

  public open fun customerManagedPolicyReferences(vararg __idx_ac66f0: Any): Unit =
      customerManagedPolicyReferences(__idx_ac66f0.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun inlinePolicy(): Any? = unwrap(this).getInlinePolicy()

  public open fun inlinePolicy(`value`: Any) {
    unwrap(this).setInlinePolicy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun managedPolicies(): List<String> = unwrap(this).getManagedPolicies() ?: emptyList()

  public open fun managedPolicies(`value`: List<String>) {
    unwrap(this).setManagedPolicies(`value`)
  }

  public open fun managedPolicies(vararg `value`: String): Unit = managedPolicies(`value`.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissionsBoundary(): Any? = unwrap(this).getPermissionsBoundary()

  public open fun permissionsBoundary(`value`: IResolvable) {
    unwrap(this).setPermissionsBoundary(`value`.let(IResolvable::unwrap))
  }

  public open fun permissionsBoundary(`value`: PermissionsBoundaryProperty) {
    unwrap(this).setPermissionsBoundary(`value`.let(PermissionsBoundaryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccc4618b8ea8743ee19aa0f130b8c4d8128d5a8f581515c866d1c24d5c369f81")
  public open fun permissionsBoundary(`value`: PermissionsBoundaryProperty.Builder.() -> Unit): Unit
      = permissionsBoundary(PermissionsBoundaryProperty(`value`))

  public open fun relayStateType(): String? = unwrap(this).getRelayStateType()

  public open fun relayStateType(`value`: String) {
    unwrap(this).setRelayStateType(`value`)
  }

  public open fun sessionDuration(): String? = unwrap(this).getSessionDuration()

  public open fun sessionDuration(`value`: String) {
    unwrap(this).setSessionDuration(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    public
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit)

    public fun relayStateType(relayStateType: String)

    public fun sessionDuration(sessionDuration: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnPermissionSet.Builder =
        software.amazon.awscdk.services.sso.CfnPermissionSet.Builder.create(scope, id)

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

    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundaryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    override
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit):
        Unit = permissionsBoundary(PermissionsBoundaryProperty(permissionsBoundary))

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

    public fun build(): software.amazon.awscdk.services.sso.CfnPermissionSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnPermissionSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermissionSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermissionSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet):
        CfnPermissionSet = CfnPermissionSet(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionSet):
        software.amazon.awscdk.services.sso.CfnPermissionSet = wrapped.cdkObject
  }

  public interface PermissionsBoundaryProperty {
    public fun customerManagedPolicyReference(): Any? =
        unwrap(this).getCustomerManagedPolicyReference()

    public fun managedPolicyArn(): String? = unwrap(this).getManagedPolicyArn()

    @CdkDslMarker
    public interface Builder {
      public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable)

      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit)

      public fun managedPolicyArn(managedPolicyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.Builder =
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.builder()

      override fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(IResolvable::unwrap))
      }

      override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(CustomerManagedPolicyReferenceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit):
          Unit =
          customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty(customerManagedPolicyReference))

      override fun managedPolicyArn(managedPolicyArn: String) {
        cdkBuilder.managedPolicyArn(managedPolicyArn)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty,
    ) : CdkObject(cdkObject), PermissionsBoundaryProperty {
      override fun customerManagedPolicyReference(): Any? =
          unwrap(this).getCustomerManagedPolicyReference()

      override fun managedPolicyArn(): String? = unwrap(this).getManagedPolicyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBoundaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty):
          PermissionsBoundaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PermissionsBoundaryProperty):
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty
    }
  }

  public interface CustomerManagedPolicyReferenceProperty {
    public fun name(): String

    public fun path(): String? = unwrap(this).getPath()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty,
    ) : CdkObject(cdkObject), CustomerManagedPolicyReferenceProperty {
      override fun name(): String = unwrap(this).getName()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerManagedPolicyReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty):
          CustomerManagedPolicyReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedPolicyReferenceProperty):
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
    }
  }
}
