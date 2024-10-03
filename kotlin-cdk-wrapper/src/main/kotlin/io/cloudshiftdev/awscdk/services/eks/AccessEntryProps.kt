@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the properties required to create an Amazon EKS access entry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessPolicy accessPolicy;
 * Cluster cluster;
 * AccessEntryProps accessEntryProps = AccessEntryProps.builder()
 * .accessPolicies(List.of(accessPolicy))
 * .cluster(cluster)
 * .principal("principal")
 * // the properties below are optional
 * .accessEntryName("accessEntryName")
 * .accessEntryType(AccessEntryType.STANDARD)
 * .build();
 * ```
 */
public interface AccessEntryProps {
  /**
   * The name of the AccessEntry.
   *
   * Default: - No access entry name is provided
   */
  public fun accessEntryName(): String? = unwrap(this).getAccessEntryName()

  /**
   * The type of the AccessEntry.
   *
   * Default: STANDARD
   */
  public fun accessEntryType(): AccessEntryType? =
      unwrap(this).getAccessEntryType()?.let(AccessEntryType::wrap)

  /**
   * The access policies that define the permissions and scope for the access entry.
   */
  public fun accessPolicies(): List<IAccessPolicy>

  /**
   * The Amazon EKS cluster to which the access entry applies.
   */
  public fun cluster(): ICluster

  /**
   * The Amazon Resource Name (ARN) of the principal (user or role) to associate the access entry
   * with.
   */
  public fun principal(): String

  /**
   * A builder for [AccessEntryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessEntryName The name of the AccessEntry.
     */
    public fun accessEntryName(accessEntryName: String)

    /**
     * @param accessEntryType The type of the AccessEntry.
     */
    public fun accessEntryType(accessEntryType: AccessEntryType)

    /**
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    public fun accessPolicies(accessPolicies: List<IAccessPolicy>)

    /**
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    public fun accessPolicies(vararg accessPolicies: IAccessPolicy)

    /**
     * @param cluster The Amazon EKS cluster to which the access entry applies. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param principal The Amazon Resource Name (ARN) of the principal (user or role) to associate
     * the access entry with. 
     */
    public fun principal(principal: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessEntryProps.Builder =
        software.amazon.awscdk.services.eks.AccessEntryProps.builder()

    /**
     * @param accessEntryName The name of the AccessEntry.
     */
    override fun accessEntryName(accessEntryName: String) {
      cdkBuilder.accessEntryName(accessEntryName)
    }

    /**
     * @param accessEntryType The type of the AccessEntry.
     */
    override fun accessEntryType(accessEntryType: AccessEntryType) {
      cdkBuilder.accessEntryType(accessEntryType.let(AccessEntryType.Companion::unwrap))
    }

    /**
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    override fun accessPolicies(accessPolicies: List<IAccessPolicy>) {
      cdkBuilder.accessPolicies(accessPolicies.map(IAccessPolicy.Companion::unwrap))
    }

    /**
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    override fun accessPolicies(vararg accessPolicies: IAccessPolicy): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * @param cluster The Amazon EKS cluster to which the access entry applies. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param principal The Amazon Resource Name (ARN) of the principal (user or role) to associate
     * the access entry with. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessEntryProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AccessEntryProps,
  ) : CdkObject(cdkObject),
      AccessEntryProps {
    /**
     * The name of the AccessEntry.
     *
     * Default: - No access entry name is provided
     */
    override fun accessEntryName(): String? = unwrap(this).getAccessEntryName()

    /**
     * The type of the AccessEntry.
     *
     * Default: STANDARD
     */
    override fun accessEntryType(): AccessEntryType? =
        unwrap(this).getAccessEntryType()?.let(AccessEntryType::wrap)

    /**
     * The access policies that define the permissions and scope for the access entry.
     */
    override fun accessPolicies(): List<IAccessPolicy> =
        unwrap(this).getAccessPolicies().map(IAccessPolicy::wrap)

    /**
     * The Amazon EKS cluster to which the access entry applies.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The Amazon Resource Name (ARN) of the principal (user or role) to associate the access entry
     * with.
     */
    override fun principal(): String = unwrap(this).getPrincipal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessEntryProps):
        AccessEntryProps = CdkObjectWrappers.wrap(cdkObject) as? AccessEntryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessEntryProps):
        software.amazon.awscdk.services.eks.AccessEntryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.AccessEntryProps
  }
}
