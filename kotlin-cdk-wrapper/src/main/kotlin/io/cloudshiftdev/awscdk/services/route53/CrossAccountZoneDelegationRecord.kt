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

public open class CrossAccountZoneDelegationRecord internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun delegatedZone(delegatedZone: IHostedZone)

    public fun delegationRole(delegationRole: IRole)

    public fun parentHostedZoneId(parentHostedZoneId: String)

    public fun parentHostedZoneName(parentHostedZoneName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

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

    override fun delegatedZone(delegatedZone: IHostedZone) {
      cdkBuilder.delegatedZone(delegatedZone.let(IHostedZone::unwrap))
    }

    override fun delegationRole(delegationRole: IRole) {
      cdkBuilder.delegationRole(delegationRole.let(IRole::unwrap))
    }

    override fun parentHostedZoneId(parentHostedZoneId: String) {
      cdkBuilder.parentHostedZoneId(parentHostedZoneId)
    }

    override fun parentHostedZoneName(parentHostedZoneName: String) {
      cdkBuilder.parentHostedZoneName(parentHostedZoneName)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

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
  }
}
