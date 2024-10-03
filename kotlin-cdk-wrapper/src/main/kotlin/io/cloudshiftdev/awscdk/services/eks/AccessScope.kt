@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the scope of an access policy.
 *
 * The scope defines the namespaces or cluster-level access granted by the policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessScope accessScope = AccessScope.builder()
 * .type(AccessScopeType.NAMESPACE)
 * // the properties below are optional
 * .namespaces(List.of("namespaces"))
 * .build();
 * ```
 */
public interface AccessScope {
  /**
   * A Kubernetes namespace that an access policy is scoped to.
   *
   * A value is required if you specified
   * namespace for Type.
   *
   * Default: - no specific namespaces for this scope.
   */
  public fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

  /**
   * The scope type of the policy, either 'namespace' or 'cluster'.
   */
  public fun type(): AccessScopeType

  /**
   * A builder for [AccessScope]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespaces A Kubernetes namespace that an access policy is scoped to.
     * A value is required if you specified
     * namespace for Type.
     */
    public fun namespaces(namespaces: List<String>)

    /**
     * @param namespaces A Kubernetes namespace that an access policy is scoped to.
     * A value is required if you specified
     * namespace for Type.
     */
    public fun namespaces(vararg namespaces: String)

    /**
     * @param type The scope type of the policy, either 'namespace' or 'cluster'. 
     */
    public fun type(type: AccessScopeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessScope.Builder =
        software.amazon.awscdk.services.eks.AccessScope.builder()

    /**
     * @param namespaces A Kubernetes namespace that an access policy is scoped to.
     * A value is required if you specified
     * namespace for Type.
     */
    override fun namespaces(namespaces: List<String>) {
      cdkBuilder.namespaces(namespaces)
    }

    /**
     * @param namespaces A Kubernetes namespace that an access policy is scoped to.
     * A value is required if you specified
     * namespace for Type.
     */
    override fun namespaces(vararg namespaces: String): Unit = namespaces(namespaces.toList())

    /**
     * @param type The scope type of the policy, either 'namespace' or 'cluster'. 
     */
    override fun type(type: AccessScopeType) {
      cdkBuilder.type(type.let(AccessScopeType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessScope = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AccessScope,
  ) : CdkObject(cdkObject),
      AccessScope {
    /**
     * A Kubernetes namespace that an access policy is scoped to.
     *
     * A value is required if you specified
     * namespace for Type.
     *
     * Default: - no specific namespaces for this scope.
     */
    override fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

    /**
     * The scope type of the policy, either 'namespace' or 'cluster'.
     */
    override fun type(): AccessScopeType = unwrap(this).getType().let(AccessScopeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessScope {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessScope): AccessScope =
        CdkObjectWrappers.wrap(cdkObject) as? AccessScope ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessScope): software.amazon.awscdk.services.eks.AccessScope =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.AccessScope
  }
}
