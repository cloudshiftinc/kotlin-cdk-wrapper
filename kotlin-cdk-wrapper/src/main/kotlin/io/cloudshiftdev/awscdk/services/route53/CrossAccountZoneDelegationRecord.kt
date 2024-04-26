@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Cross Account Zone Delegation record.
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
public open class CrossAccountZoneDelegationRecord(
  cdkObject: software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CrossAccountZoneDelegationRecordProps,
  ) :
      this(software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CrossAccountZoneDelegationRecordProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CrossAccountZoneDelegationRecordProps.Builder.() -> Unit,
  ) : this(scope, id, CrossAccountZoneDelegationRecordProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53.CrossAccountZoneDelegationRecord].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Region from which to obtain temporary credentials.
     *
     * Default: - the Route53 signing region in the current partition
     *
     * @param assumeRoleRegion Region from which to obtain temporary credentials. 
     */
    public fun assumeRoleRegion(assumeRoleRegion: String)

    /**
     * The zone to be delegated.
     *
     * @param delegatedZone The zone to be delegated. 
     */
    public fun delegatedZone(delegatedZone: IHostedZone)

    /**
     * The delegation role in the parent account.
     *
     * @param delegationRole The delegation role in the parent account. 
     */
    public fun delegationRole(delegationRole: IRole)

    /**
     * The hosted zone id in the parent account.
     *
     * Default: - no zone id
     *
     * @param parentHostedZoneId The hosted zone id in the parent account. 
     */
    public fun parentHostedZoneId(parentHostedZoneId: String)

    /**
     * The hosted zone name in the parent account.
     *
     * Default: - no zone name
     *
     * @param parentHostedZoneName The hosted zone name in the parent account. 
     */
    public fun parentHostedZoneName(parentHostedZoneName: String)

    /**
     * The removal policy to apply to the record set.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply to the record set. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.days(2)
     *
     * @param ttl The resource record cache time to live (TTL). 
     */
    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord.Builder =
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord.Builder.create(scope,
        id)

    /**
     * Region from which to obtain temporary credentials.
     *
     * Default: - the Route53 signing region in the current partition
     *
     * @param assumeRoleRegion Region from which to obtain temporary credentials. 
     */
    override fun assumeRoleRegion(assumeRoleRegion: String) {
      cdkBuilder.assumeRoleRegion(assumeRoleRegion)
    }

    /**
     * The zone to be delegated.
     *
     * @param delegatedZone The zone to be delegated. 
     */
    override fun delegatedZone(delegatedZone: IHostedZone) {
      cdkBuilder.delegatedZone(delegatedZone.let(IHostedZone::unwrap))
    }

    /**
     * The delegation role in the parent account.
     *
     * @param delegationRole The delegation role in the parent account. 
     */
    override fun delegationRole(delegationRole: IRole) {
      cdkBuilder.delegationRole(delegationRole.let(IRole::unwrap))
    }

    /**
     * The hosted zone id in the parent account.
     *
     * Default: - no zone id
     *
     * @param parentHostedZoneId The hosted zone id in the parent account. 
     */
    override fun parentHostedZoneId(parentHostedZoneId: String) {
      cdkBuilder.parentHostedZoneId(parentHostedZoneId)
    }

    /**
     * The hosted zone name in the parent account.
     *
     * Default: - no zone name
     *
     * @param parentHostedZoneName The hosted zone name in the parent account. 
     */
    override fun parentHostedZoneName(parentHostedZoneName: String) {
      cdkBuilder.parentHostedZoneName(parentHostedZoneName)
    }

    /**
     * The removal policy to apply to the record set.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply to the record set. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.days(2)
     *
     * @param ttl The resource record cache time to live (TTL). 
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CrossAccountZoneDelegationRecord {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CrossAccountZoneDelegationRecord(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord):
        CrossAccountZoneDelegationRecord = CrossAccountZoneDelegationRecord(cdkObject)

    internal fun unwrap(wrapped: CrossAccountZoneDelegationRecord):
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord = wrapped.cdkObject
        as software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
  }
}
