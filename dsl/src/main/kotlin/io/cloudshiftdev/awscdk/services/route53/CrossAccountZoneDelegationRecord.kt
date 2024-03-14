package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CrossAccountZoneDelegationRecord internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53.CrossAccountZoneDelegationRecord].
   */
  @CdkDslMarker
  public interface Builder {
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
    init {

    }

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
  }
}
