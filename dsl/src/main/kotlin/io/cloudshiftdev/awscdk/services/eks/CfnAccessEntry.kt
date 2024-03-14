package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnAccessEntry internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  public open fun accessPolicies(`value`: IResolvable) {
    unwrap(this).setAccessPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun accessPolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessPolicies(__idx_ac66f0)
  }

  public open fun attrAccessEntryArn(): String = unwrap(this).getAttrAccessEntryArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?:
      emptyList()

  public open fun kubernetesGroups(`value`: List<String>) {
    unwrap(this).setKubernetesGroups(`value`)
  }

  public open fun principalArn(): String = unwrap(this).getPrincipalArn()

  public open fun principalArn(`value`: String) {
    unwrap(this).setPrincipalArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  public interface Builder {
    public fun accessPolicies(accessPolicies: IResolvable)

    public fun accessPolicies(accessPolicies: List<Any>)

    public fun clusterName(clusterName: String)

    public fun kubernetesGroups(kubernetesGroups: List<String>)

    public fun principalArn(principalArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun type(type: String)

    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAccessEntry.Builder =
        software.amazon.awscdk.services.eks.CfnAccessEntry.Builder.create(scope, id)

    override fun accessPolicies(accessPolicies: IResolvable) {
      cdkBuilder.accessPolicies(accessPolicies.let(IResolvable::unwrap))
    }

    override fun accessPolicies(accessPolicies: List<Any>) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun kubernetesGroups(kubernetesGroups: List<String>) {
      cdkBuilder.kubernetesGroups(kubernetesGroups)
    }

    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry): CfnAccessEntry
        = CfnAccessEntry(cdkObject)

    internal fun unwrap(wrapped: CfnAccessEntry): software.amazon.awscdk.services.eks.CfnAccessEntry
        = wrapped.cdkObject
  }

  public interface AccessScopeProperty {
    public fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

    public fun type(): String

    public interface Builder {
      public fun namespaces(namespaces: List<String>)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty.Builder =
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty.builder()

      override fun namespaces(namespaces: List<String>) {
        cdkBuilder.namespaces(namespaces)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty,
    ) : AccessScopeProperty {
      override fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty):
          AccessScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessScopeProperty):
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccessPolicyProperty {
    public fun accessScope(): Any

    public fun policyArn(): String

    public interface Builder {
      public fun accessScope(accessScope: IResolvable)

      public fun accessScope(accessScope: AccessScopeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5d63cbcdfb4374595a500769eefa1674960e340dae629f9832bd17cb4ba4480")
      public fun accessScope(accessScope: AccessScopeProperty.Builder.() -> Unit)

      public fun policyArn(policyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty.Builder =
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty.builder()

      override fun accessScope(accessScope: IResolvable) {
        cdkBuilder.accessScope(accessScope.let(IResolvable::unwrap))
      }

      override fun accessScope(accessScope: AccessScopeProperty) {
        cdkBuilder.accessScope(accessScope.let(AccessScopeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5d63cbcdfb4374595a500769eefa1674960e340dae629f9832bd17cb4ba4480")
      override fun accessScope(accessScope: AccessScopeProperty.Builder.() -> Unit): Unit =
          accessScope(AccessScopeProperty(accessScope))

      override fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty,
    ) : AccessPolicyProperty {
      override fun accessScope(): Any = unwrap(this).getAccessScope()

      override fun policyArn(): String = unwrap(this).getPolicyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty):
          AccessPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyProperty):
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
