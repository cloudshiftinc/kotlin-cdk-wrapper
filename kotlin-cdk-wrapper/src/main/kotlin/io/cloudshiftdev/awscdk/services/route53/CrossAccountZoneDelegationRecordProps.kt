@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface CrossAccountZoneDelegationRecordProps {
  public fun delegatedZone(): IHostedZone

  public fun delegationRole(): IRole

  public fun parentHostedZoneId(): String? = unwrap(this).getParentHostedZoneId()

  public fun parentHostedZoneName(): String? = unwrap(this).getParentHostedZoneName()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun delegatedZone(delegatedZone: IHostedZone)

    public fun delegationRole(delegationRole: IRole)

    public fun parentHostedZoneId(parentHostedZoneId: String)

    public fun parentHostedZoneName(parentHostedZoneName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps.Builder =
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps,
  ) : CdkObject(cdkObject), CrossAccountZoneDelegationRecordProps {
    override fun delegatedZone(): IHostedZone =
        unwrap(this).getDelegatedZone().let(IHostedZone::wrap)

    override fun delegationRole(): IRole = unwrap(this).getDelegationRole().let(IRole::wrap)

    override fun parentHostedZoneId(): String? = unwrap(this).getParentHostedZoneId()

    override fun parentHostedZoneName(): String? = unwrap(this).getParentHostedZoneName()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

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
        CrossAccountZoneDelegationRecordProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CrossAccountZoneDelegationRecordProps):
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
  }
}
