package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HostedZone internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.HostedZone,
) : Resource(cdkObject), IHostedZone {
  public open fun addVpc(vpc: IVpc) {
    unwrap(this).addVpc(vpc.let(IVpc::unwrap))
  }

  public override fun grantDelegation(grantee: IGrantable): Grant =
      unwrap(this).grantDelegation(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun hostedZoneArn(): String = unwrap(this).getHostedZoneArn()

  public override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  public override fun hostedZoneNameServers(): List<String> =
      unwrap(this).getHostedZoneNameServers() ?: emptyList()

  public override fun zoneName(): String = unwrap(this).getZoneName()

  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean) {
    }

    public fun comment(comment: String) {
    }

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    }

    public fun vpcs(vpcs: List<IVpc>) {
    }

    public fun zoneName(zoneName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZone.Builder =
        software.amazon.awscdk.services.route53.HostedZone.Builder.create(scope, id)

    public override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    public override fun vpcs(vpcs: List<IVpc>) {
      cdkBuilder.vpcs(vpcs.map(IVpc::unwrap))
    }

    public override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZone = cdkBuilder.build()
  }

  public companion object {
    public open fun fromHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HostedZoneAttributes,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromHostedZoneAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HostedZoneAttributes::unwrap)).let(IHostedZone::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec7a6041c2e75e630a70fa110a2369053e8a0554dd6c63d11cfc004e3770592a")
    public open fun fromHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HostedZoneAttributes.Builder.() -> Unit,
    ): IHostedZone = fromHostedZoneAttributes(scope, id, HostedZoneAttributes(attrs))

    public open fun fromHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      hostedZoneId: String,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, hostedZoneId).let(IHostedZone::wrap)

    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      query: HostedZoneProviderProps,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, query.let(HostedZoneProviderProps::unwrap)).let(IHostedZone::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f3c8afe809bef1b11863ef5f2169db51c709530a321c9ba303e6b29bcd9690a")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      query: HostedZoneProviderProps.Builder.() -> Unit,
    ): IHostedZone = fromLookup(scope, id, HostedZoneProviderProps(query))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZone): HostedZone =
        HostedZone(cdkObject)

    internal fun unwrap(wrapped: HostedZone): software.amazon.awscdk.services.route53.HostedZone =
        wrapped.cdkObject
  }
}
