@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents an access entry in an Amazon EKS cluster.
 *
 * An access entry defines the permissions and scope for a user or role to access an Amazon EKS
 * cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessPolicy accessPolicy;
 * Cluster cluster;
 * AccessEntry accessEntry = AccessEntry.Builder.create(this, "MyAccessEntry")
 * .accessPolicies(List.of(accessPolicy))
 * .cluster(cluster)
 * .principal("principal")
 * // the properties below are optional
 * .accessEntryName("accessEntryName")
 * .accessEntryType(AccessEntryType.STANDARD)
 * .build();
 * ```
 */
public open class AccessEntry(
  cdkObject: software.amazon.awscdk.services.eks.AccessEntry,
) : Resource(cdkObject),
    IAccessEntry {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessEntryProps,
  ) :
      this(software.amazon.awscdk.services.eks.AccessEntry(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AccessEntryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessEntryProps.Builder.() -> Unit,
  ) : this(scope, id, AccessEntryProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the access entry.
   */
  public override fun accessEntryArn(): String = unwrap(this).getAccessEntryArn()

  /**
   * The name of the access entry.
   */
  public override fun accessEntryName(): String = unwrap(this).getAccessEntryName()

  /**
   * Add the access policies for this entry.
   *
   * @param newAccessPolicies * The new access policies to add. 
   */
  public open fun addAccessPolicies(newAccessPolicies: List<IAccessPolicy>) {
    unwrap(this).addAccessPolicies(newAccessPolicies.map(IAccessPolicy.Companion::unwrap))
  }

  /**
   * Add the access policies for this entry.
   *
   * @param newAccessPolicies * The new access policies to add. 
   */
  public open fun addAccessPolicies(vararg newAccessPolicies: IAccessPolicy): Unit =
      addAccessPolicies(newAccessPolicies.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.AccessEntry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the AccessEntry.
     *
     * Default: - No access entry name is provided
     *
     * @param accessEntryName The name of the AccessEntry. 
     */
    public fun accessEntryName(accessEntryName: String)

    /**
     * The type of the AccessEntry.
     *
     * Default: STANDARD
     *
     * @param accessEntryType The type of the AccessEntry. 
     */
    public fun accessEntryType(accessEntryType: AccessEntryType)

    /**
     * The access policies that define the permissions and scope for the access entry.
     *
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    public fun accessPolicies(accessPolicies: List<IAccessPolicy>)

    /**
     * The access policies that define the permissions and scope for the access entry.
     *
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    public fun accessPolicies(vararg accessPolicies: IAccessPolicy)

    /**
     * The Amazon EKS cluster to which the access entry applies.
     *
     * @param cluster The Amazon EKS cluster to which the access entry applies. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The Amazon Resource Name (ARN) of the principal (user or role) to associate the access entry
     * with.
     *
     * @param principal The Amazon Resource Name (ARN) of the principal (user or role) to associate
     * the access entry with. 
     */
    public fun principal(principal: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AccessEntry.Builder =
        software.amazon.awscdk.services.eks.AccessEntry.Builder.create(scope, id)

    /**
     * The name of the AccessEntry.
     *
     * Default: - No access entry name is provided
     *
     * @param accessEntryName The name of the AccessEntry. 
     */
    override fun accessEntryName(accessEntryName: String) {
      cdkBuilder.accessEntryName(accessEntryName)
    }

    /**
     * The type of the AccessEntry.
     *
     * Default: STANDARD
     *
     * @param accessEntryType The type of the AccessEntry. 
     */
    override fun accessEntryType(accessEntryType: AccessEntryType) {
      cdkBuilder.accessEntryType(accessEntryType.let(AccessEntryType.Companion::unwrap))
    }

    /**
     * The access policies that define the permissions and scope for the access entry.
     *
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    override fun accessPolicies(accessPolicies: List<IAccessPolicy>) {
      cdkBuilder.accessPolicies(accessPolicies.map(IAccessPolicy.Companion::unwrap))
    }

    /**
     * The access policies that define the permissions and scope for the access entry.
     *
     * @param accessPolicies The access policies that define the permissions and scope for the
     * access entry. 
     */
    override fun accessPolicies(vararg accessPolicies: IAccessPolicy): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * The Amazon EKS cluster to which the access entry applies.
     *
     * @param cluster The Amazon EKS cluster to which the access entry applies. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the principal (user or role) to associate the access entry
     * with.
     *
     * @param principal The Amazon Resource Name (ARN) of the principal (user or role) to associate
     * the access entry with. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public fun build(): software.amazon.awscdk.services.eks.AccessEntry = cdkBuilder.build()
  }

  public companion object {
    public fun fromAccessEntryAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessEntryAttributes,
    ): IAccessEntry =
        software.amazon.awscdk.services.eks.AccessEntry.fromAccessEntryAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(AccessEntryAttributes.Companion::unwrap)).let(IAccessEntry::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b388e22987c78847bff28f06d6483dc541b55ec23743a313cdccdc5314353bbb")
    public fun fromAccessEntryAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessEntryAttributes.Builder.() -> Unit,
    ): IAccessEntry = fromAccessEntryAttributes(scope, id, AccessEntryAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessEntry): AccessEntry =
        AccessEntry(cdkObject)

    internal fun unwrap(wrapped: AccessEntry): software.amazon.awscdk.services.eks.AccessEntry =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.AccessEntry
  }
}
