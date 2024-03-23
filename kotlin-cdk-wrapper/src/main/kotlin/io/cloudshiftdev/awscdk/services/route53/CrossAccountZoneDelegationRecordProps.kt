@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a CrossAccountZoneDelegationRecord.
 *
 * Example:
 *
 * ```
 * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
 * .zoneName("sub.someexample.com")
 * .build();
 * // import the delegation role by constructing the roleArn
 * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
 * .region("") // IAM is global in each partition
 * .service("iam")
 * .account("parent-account-id")
 * .resource("role")
 * .resourceName("MyDelegationRole")
 * .build());
 * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
 * // create the record
 * // create the record
 * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
 * .delegatedZone(subZone)
 * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
 * .delegationRole(delegationRole)
 * .build();
 * ```
 */
public interface CrossAccountZoneDelegationRecordProps {
  /**
   * The zone to be delegated.
   */
  public fun delegatedZone(): IHostedZone

  /**
   * The delegation role in the parent account.
   */
  public fun delegationRole(): IRole

  /**
   * The hosted zone id in the parent account.
   *
   * Default: - no zone id
   */
  public fun parentHostedZoneId(): String? = unwrap(this).getParentHostedZoneId()

  /**
   * The hosted zone name in the parent account.
   *
   * Default: - no zone name
   */
  public fun parentHostedZoneName(): String? = unwrap(this).getParentHostedZoneName()

  /**
   * The removal policy to apply to the record set.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The resource record cache time to live (TTL).
   *
   * Default: Duration.days(2)
   */
  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  /**
   * A builder for [CrossAccountZoneDelegationRecordProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param delegatedZone The zone to be delegated. 
     */
    public fun delegatedZone(delegatedZone: IHostedZone)

    /**
     * @param delegationRole The delegation role in the parent account. 
     */
    public fun delegationRole(delegationRole: IRole)

    /**
     * @param parentHostedZoneId The hosted zone id in the parent account.
     */
    public fun parentHostedZoneId(parentHostedZoneId: String)

    /**
     * @param parentHostedZoneName The hosted zone name in the parent account.
     */
    public fun parentHostedZoneName(parentHostedZoneName: String)

    /**
     * @param removalPolicy The removal policy to apply to the record set.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param ttl The resource record cache time to live (TTL).
     */
    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps.Builder =
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps.builder()

    /**
     * @param delegatedZone The zone to be delegated. 
     */
    override fun delegatedZone(delegatedZone: IHostedZone) {
      cdkBuilder.delegatedZone(delegatedZone.let(IHostedZone::unwrap))
    }

    /**
     * @param delegationRole The delegation role in the parent account. 
     */
    override fun delegationRole(delegationRole: IRole) {
      cdkBuilder.delegationRole(delegationRole.let(IRole::unwrap))
    }

    /**
     * @param parentHostedZoneId The hosted zone id in the parent account.
     */
    override fun parentHostedZoneId(parentHostedZoneId: String) {
      cdkBuilder.parentHostedZoneId(parentHostedZoneId)
    }

    /**
     * @param parentHostedZoneName The hosted zone name in the parent account.
     */
    override fun parentHostedZoneName(parentHostedZoneName: String) {
      cdkBuilder.parentHostedZoneName(parentHostedZoneName)
    }

    /**
     * @param removalPolicy The removal policy to apply to the record set.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param ttl The resource record cache time to live (TTL).
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps,
  ) : CdkObject(cdkObject), CrossAccountZoneDelegationRecordProps {
    /**
     * The zone to be delegated.
     */
    override fun delegatedZone(): IHostedZone =
        unwrap(this).getDelegatedZone().let(IHostedZone::wrap)

    /**
     * The delegation role in the parent account.
     */
    override fun delegationRole(): IRole = unwrap(this).getDelegationRole().let(IRole::wrap)

    /**
     * The hosted zone id in the parent account.
     *
     * Default: - no zone id
     */
    override fun parentHostedZoneId(): String? = unwrap(this).getParentHostedZoneId()

    /**
     * The hosted zone name in the parent account.
     *
     * Default: - no zone name
     */
    override fun parentHostedZoneName(): String? = unwrap(this).getParentHostedZoneName()

    /**
     * The removal policy to apply to the record set.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.days(2)
     */
    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CrossAccountZoneDelegationRecordProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps):
        CrossAccountZoneDelegationRecordProps = CdkObjectWrappers.wrap(cdkObject) as?
        CrossAccountZoneDelegationRecordProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossAccountZoneDelegationRecordProps):
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
  }
}
