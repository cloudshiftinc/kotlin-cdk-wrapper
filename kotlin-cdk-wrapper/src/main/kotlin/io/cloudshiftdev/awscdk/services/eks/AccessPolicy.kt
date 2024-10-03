@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an Amazon EKS Access Policy that implements the IAccessPolicy interface.
 *
 * Example:
 *
 * ```
 * // AmazonEKSClusterAdminPolicy with `cluster` scope
 * AccessPolicy.fromAccessPolicyName("AmazonEKSClusterAdminPolicy",
 * AccessPolicyNameOptions.builder()
 * .accessScopeType(AccessScopeType.CLUSTER)
 * .build());
 * // AmazonEKSAdminPolicy with `namespace` scope
 * AccessPolicy.fromAccessPolicyName("AmazonEKSAdminPolicy", AccessPolicyNameOptions.builder()
 * .accessScopeType(AccessScopeType.NAMESPACE)
 * .namespaces(List.of("foo", "bar"))
 * .build());
 * ```
 */
public open class AccessPolicy(
  cdkObject: software.amazon.awscdk.services.eks.AccessPolicy,
) : CdkObject(cdkObject),
    IAccessPolicy {
  public constructor(props: AccessPolicyProps) :
      this(software.amazon.awscdk.services.eks.AccessPolicy(props.let(AccessPolicyProps.Companion::unwrap))
  )

  public constructor(props: AccessPolicyProps.Builder.() -> Unit) : this(AccessPolicyProps(props)
  )

  /**
   * The scope of the access policy, which determines the level of access granted.
   */
  public override fun accessScope(): AccessScope =
      unwrap(this).getAccessScope().let(AccessScope::wrap)

  /**
   * The access policy itself, which defines the specific permissions.
   */
  public override fun policy(): String = unwrap(this).getPolicy()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.AccessPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The scope of the access policy, which determines the level of access granted.
     *
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    public fun accessScope(accessScope: AccessScope)

    /**
     * The scope of the access policy, which determines the level of access granted.
     *
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7047007961666d97aa191fc78379a2b2a3b780f196c639fd6258f095df990e9")
    public fun accessScope(accessScope: AccessScope.Builder.() -> Unit)

    /**
     * The access policy itself, which defines the specific permissions.
     *
     * @param policy The access policy itself, which defines the specific permissions. 
     */
    public fun policy(policy: AccessPolicyArn)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessPolicy.Builder =
        software.amazon.awscdk.services.eks.AccessPolicy.Builder.create()

    /**
     * The scope of the access policy, which determines the level of access granted.
     *
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    override fun accessScope(accessScope: AccessScope) {
      cdkBuilder.accessScope(accessScope.let(AccessScope.Companion::unwrap))
    }

    /**
     * The scope of the access policy, which determines the level of access granted.
     *
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7047007961666d97aa191fc78379a2b2a3b780f196c639fd6258f095df990e9")
    override fun accessScope(accessScope: AccessScope.Builder.() -> Unit): Unit =
        accessScope(AccessScope(accessScope))

    /**
     * The access policy itself, which defines the specific permissions.
     *
     * @param policy The access policy itself, which defines the specific permissions. 
     */
    override fun policy(policy: AccessPolicyArn) {
      cdkBuilder.policy(policy.let(AccessPolicyArn.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessPolicy = cdkBuilder.build()
  }

  public companion object {
    public fun fromAccessPolicyName(policyName: String, options: AccessPolicyNameOptions):
        IAccessPolicy =
        software.amazon.awscdk.services.eks.AccessPolicy.fromAccessPolicyName(policyName,
        options.let(AccessPolicyNameOptions.Companion::unwrap)).let(IAccessPolicy::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edf5384f730db35bbf7ec4f054fc7aa30ef9a5579006bdc20c37e293723d2ba5")
    public fun fromAccessPolicyName(policyName: String,
        options: AccessPolicyNameOptions.Builder.() -> Unit): IAccessPolicy =
        fromAccessPolicyName(policyName, AccessPolicyNameOptions(options))

    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicy {
      val builderImpl = BuilderImpl()
      return AccessPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessPolicy): AccessPolicy =
        AccessPolicy(cdkObject)

    internal fun unwrap(wrapped: AccessPolicy): software.amazon.awscdk.services.eks.AccessPolicy =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.AccessPolicy
  }
}
