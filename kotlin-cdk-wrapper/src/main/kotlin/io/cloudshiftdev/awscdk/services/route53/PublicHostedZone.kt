@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PublicHostedZone internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.PublicHostedZone,
) : HostedZone(cdkObject), IPublicHostedZone {
  public open fun addDelegation(`delegate`: IPublicHostedZone) {
    unwrap(this).addDelegation(`delegate`.let(IPublicHostedZone::unwrap))
  }

  public open fun addDelegation(`delegate`: IPublicHostedZone, opts: ZoneDelegationOptions) {
    unwrap(this).addDelegation(`delegate`.let(IPublicHostedZone::unwrap),
        opts.let(ZoneDelegationOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3fd65481d9aa885e9f4806ffe91bda7013b73dd21fe06d445e0d0b3ec8027f9")
  public open fun addDelegation(`delegate`: IPublicHostedZone,
      opts: ZoneDelegationOptions.Builder.() -> Unit): Unit = addDelegation(`delegate`,
      ZoneDelegationOptions(opts))

  public override fun addVpc(_vpc: IVpc) {
    unwrap(this).addVpc(_vpc.let(IVpc::unwrap))
  }

  public open fun crossAccountZoneDelegationRole(): Role? =
      unwrap(this).getCrossAccountZoneDelegationRole()?.let(Role::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean)

    public fun caaAmazon(caaAmazon: Boolean)

    public fun comment(comment: String)

    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal)

    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String)

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PublicHostedZone.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZone.Builder.create(scope, id)

    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    override fun caaAmazon(caaAmazon: Boolean) {
      cdkBuilder.caaAmazon(caaAmazon)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
      cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal.let(IPrincipal::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
      cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
    }

    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZone =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicHostedZoneAttributes,
    ): IPublicHostedZone =
        software.amazon.awscdk.services.route53.PublicHostedZone.fromPublicHostedZoneAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PublicHostedZoneAttributes::unwrap)).let(IPublicHostedZone::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06cb4baac981ad1dbf446227d98c9cfd34ba1dbb37d9b99936ef13730db60f6b")
    public fun fromPublicHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicHostedZoneAttributes.Builder.() -> Unit,
    ): IPublicHostedZone = fromPublicHostedZoneAttributes(scope, id,
        PublicHostedZoneAttributes(attrs))

    public fun fromPublicHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      publicHostedZoneId: String,
    ): IPublicHostedZone =
        software.amazon.awscdk.services.route53.PublicHostedZone.fromPublicHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, publicHostedZoneId).let(IPublicHostedZone::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZone):
        PublicHostedZone = PublicHostedZone(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZone):
        software.amazon.awscdk.services.route53.PublicHostedZone = wrapped.cdkObject
  }
}
