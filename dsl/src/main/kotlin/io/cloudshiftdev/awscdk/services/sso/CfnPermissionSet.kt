package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermissionSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
    }

    public fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun inlinePolicy(inlinePolicy: Any) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun managedPolicies(managedPolicies: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun permissionsBoundary(permissionsBoundary: IResolvable) {
    }

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    public
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit) {
    }

    public fun relayStateType(relayStateType: String) {
    }

    public fun sessionDuration(sessionDuration: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnPermissionSet.Builder =
        software.amazon.awscdk.services.sso.CfnPermissionSet.Builder.create(scope, id)

    public override
        fun customerManagedPolicyReferences(customerManagedPolicyReferences: IResolvable) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences.let(IResolvable::unwrap))
    }

    public override
        fun customerManagedPolicyReferences(customerManagedPolicyReferences: List<Any>) {
      cdkBuilder.customerManagedPolicyReferences(customerManagedPolicyReferences)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun inlinePolicy(inlinePolicy: Any) {
      cdkBuilder.inlinePolicy(inlinePolicy)
    }

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun managedPolicies(managedPolicies: List<String>) {
      cdkBuilder.managedPolicies(managedPolicies)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun permissionsBoundary(permissionsBoundary: IResolvable) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IResolvable::unwrap))
    }

    public override fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundaryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b2b281fcd686446b3f09daa41b872dc6e753e0375a9adcd7db672c7edd7a792")
    public override
        fun permissionsBoundary(permissionsBoundary: PermissionsBoundaryProperty.Builder.() -> Unit):
        Unit = permissionsBoundary(PermissionsBoundaryProperty(permissionsBoundary))

    public override fun relayStateType(relayStateType: String) {
      cdkBuilder.relayStateType(relayStateType)
    }

    public override fun sessionDuration(sessionDuration: String) {
      cdkBuilder.sessionDuration(sessionDuration)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sso.CfnPermissionSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
      }

      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      public
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit) {
      }

      public fun managedPolicyArn(managedPolicyArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.Builder =
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty.builder()

      public override
          fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(IResolvable::unwrap))
      }

      public override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference.let(CustomerManagedPolicyReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1966918747bd1a2b8f3efd6711b8ee888d72bbb3a1b39999a072ea1761c9702e")
      public override
          fun customerManagedPolicyReference(customerManagedPolicyReference: CustomerManagedPolicyReferenceProperty.Builder.() -> Unit):
          Unit =
          customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty(customerManagedPolicyReference))

      public override fun managedPolicyArn(managedPolicyArn: String) {
        cdkBuilder.managedPolicyArn(managedPolicyArn)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty,
    ) : PermissionsBoundaryProperty {
      public override fun customerManagedPolicyReference(): Any? =
          unwrap(this).getCustomerManagedPolicyReference()

      public override fun managedPolicyArn(): String? = unwrap(this).getManagedPolicyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBoundaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty):
          PermissionsBoundaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PermissionsBoundaryProperty):
          software.amazon.awscdk.services.sso.CfnPermissionSet.PermissionsBoundaryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomerManagedPolicyReferenceProperty {
    public fun name(): String

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun path(path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder
          =
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sso.CfnPermissionSet.CustomerManagedPolicyReferenceProperty,
    ) : CustomerManagedPolicyReferenceProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }
}
