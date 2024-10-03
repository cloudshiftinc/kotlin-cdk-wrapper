@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for configuring an Amazon EKS Access Policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessPolicyArn accessPolicyArn;
 * AccessPolicyProps accessPolicyProps = AccessPolicyProps.builder()
 * .accessScope(AccessScope.builder()
 * .type(AccessScopeType.NAMESPACE)
 * // the properties below are optional
 * .namespaces(List.of("namespaces"))
 * .build())
 * .policy(accessPolicyArn)
 * .build();
 * ```
 */
public interface AccessPolicyProps {
  /**
   * The scope of the access policy, which determines the level of access granted.
   */
  public fun accessScope(): AccessScope

  /**
   * The access policy itself, which defines the specific permissions.
   */
  public fun policy(): AccessPolicyArn

  /**
   * A builder for [AccessPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    public fun accessScope(accessScope: AccessScope)

    /**
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a6bde82872a0b1d0dd41f09edc9de912f75e8a75ee6cb7003724844770b19d3")
    public fun accessScope(accessScope: AccessScope.Builder.() -> Unit)

    /**
     * @param policy The access policy itself, which defines the specific permissions. 
     */
    public fun policy(policy: AccessPolicyArn)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessPolicyProps.Builder =
        software.amazon.awscdk.services.eks.AccessPolicyProps.builder()

    /**
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    override fun accessScope(accessScope: AccessScope) {
      cdkBuilder.accessScope(accessScope.let(AccessScope.Companion::unwrap))
    }

    /**
     * @param accessScope The scope of the access policy, which determines the level of access
     * granted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a6bde82872a0b1d0dd41f09edc9de912f75e8a75ee6cb7003724844770b19d3")
    override fun accessScope(accessScope: AccessScope.Builder.() -> Unit): Unit =
        accessScope(AccessScope(accessScope))

    /**
     * @param policy The access policy itself, which defines the specific permissions. 
     */
    override fun policy(policy: AccessPolicyArn) {
      cdkBuilder.policy(policy.let(AccessPolicyArn.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AccessPolicyProps,
  ) : CdkObject(cdkObject),
      AccessPolicyProps {
    /**
     * The scope of the access policy, which determines the level of access granted.
     */
    override fun accessScope(): AccessScope = unwrap(this).getAccessScope().let(AccessScope::wrap)

    /**
     * The access policy itself, which defines the specific permissions.
     */
    override fun policy(): AccessPolicyArn = unwrap(this).getPolicy().let(AccessPolicyArn::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessPolicyProps):
        AccessPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? AccessPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPolicyProps):
        software.amazon.awscdk.services.eks.AccessPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.AccessPolicyProps
  }
}
