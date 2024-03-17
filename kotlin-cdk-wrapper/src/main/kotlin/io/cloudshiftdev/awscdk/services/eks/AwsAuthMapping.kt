@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * AwsAuth mapping.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * User adminUser = new User(this, "Admin");
 * cluster.awsAuth.addUserMapping(adminUser,
 * AwsAuthMapping.builder().groups(List.of("system:masters")).build());
 * ```
 */
public interface AwsAuthMapping {
  /**
   * A list of groups within Kubernetes to which the role is mapped.
   *
   * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
   */
  public fun groups(): List<String>

  /**
   * The user name within Kubernetes to map to the IAM role.
   *
   * Default: - By default, the user name is the ARN of the IAM role.
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A builder for [AwsAuthMapping]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groups A list of groups within Kubernetes to which the role is mapped. 
     */
    public fun groups(groups: List<String>)

    /**
     * @param groups A list of groups within Kubernetes to which the role is mapped. 
     */
    public fun groups(vararg groups: String)

    /**
     * @param username The user name within Kubernetes to map to the IAM role.
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuthMapping.Builder =
        software.amazon.awscdk.services.eks.AwsAuthMapping.builder()

    /**
     * @param groups A list of groups within Kubernetes to which the role is mapped. 
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups A list of groups within Kubernetes to which the role is mapped. 
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    /**
     * @param username The user name within Kubernetes to map to the IAM role.
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuthMapping = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AwsAuthMapping,
  ) : CdkObject(cdkObject), AwsAuthMapping {
    /**
     * A list of groups within Kubernetes to which the role is mapped.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     */
    override fun groups(): List<String> = unwrap(this).getGroups()

    /**
     * The user name within Kubernetes to map to the IAM role.
     *
     * Default: - By default, the user name is the ARN of the IAM role.
     */
    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsAuthMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AwsAuthMapping): AwsAuthMapping
        = CdkObjectWrappers.wrap(cdkObject) as? AwsAuthMapping ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsAuthMapping): software.amazon.awscdk.services.eks.AwsAuthMapping
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.AwsAuthMapping
  }
}
