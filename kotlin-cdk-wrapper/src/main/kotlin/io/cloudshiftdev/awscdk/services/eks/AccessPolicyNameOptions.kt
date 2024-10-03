@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the options required to create an Amazon EKS Access Policy using the
 * `fromAccessPolicyName()` method.
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
public interface AccessPolicyNameOptions {
  /**
   * The scope of the access policy.
   *
   * This determines the level of access granted by the policy.
   */
  public fun accessScopeType(): AccessScopeType

  /**
   * An optional array of Kubernetes namespaces to which the access policy applies.
   *
   * Default: - no specific namespaces for this scope
   */
  public fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

  /**
   * A builder for [AccessPolicyNameOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessScopeType The scope of the access policy. 
     * This determines the level of access granted by the policy.
     */
    public fun accessScopeType(accessScopeType: AccessScopeType)

    /**
     * @param namespaces An optional array of Kubernetes namespaces to which the access policy
     * applies.
     */
    public fun namespaces(namespaces: List<String>)

    /**
     * @param namespaces An optional array of Kubernetes namespaces to which the access policy
     * applies.
     */
    public fun namespaces(vararg namespaces: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessPolicyNameOptions.Builder =
        software.amazon.awscdk.services.eks.AccessPolicyNameOptions.builder()

    /**
     * @param accessScopeType The scope of the access policy. 
     * This determines the level of access granted by the policy.
     */
    override fun accessScopeType(accessScopeType: AccessScopeType) {
      cdkBuilder.accessScopeType(accessScopeType.let(AccessScopeType.Companion::unwrap))
    }

    /**
     * @param namespaces An optional array of Kubernetes namespaces to which the access policy
     * applies.
     */
    override fun namespaces(namespaces: List<String>) {
      cdkBuilder.namespaces(namespaces)
    }

    /**
     * @param namespaces An optional array of Kubernetes namespaces to which the access policy
     * applies.
     */
    override fun namespaces(vararg namespaces: String): Unit = namespaces(namespaces.toList())

    public fun build(): software.amazon.awscdk.services.eks.AccessPolicyNameOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AccessPolicyNameOptions,
  ) : CdkObject(cdkObject),
      AccessPolicyNameOptions {
    /**
     * The scope of the access policy.
     *
     * This determines the level of access granted by the policy.
     */
    override fun accessScopeType(): AccessScopeType =
        unwrap(this).getAccessScopeType().let(AccessScopeType::wrap)

    /**
     * An optional array of Kubernetes namespaces to which the access policy applies.
     *
     * Default: - no specific namespaces for this scope
     */
    override fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessPolicyNameOptions):
        AccessPolicyNameOptions = CdkObjectWrappers.wrap(cdkObject) as? AccessPolicyNameOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPolicyNameOptions):
        software.amazon.awscdk.services.eks.AccessPolicyNameOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.AccessPolicyNameOptions
  }
}
