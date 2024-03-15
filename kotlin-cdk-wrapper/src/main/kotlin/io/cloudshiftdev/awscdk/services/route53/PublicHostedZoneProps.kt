@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface PublicHostedZoneProps : CommonHostedZoneProps {
  public fun caaAmazon(): Boolean? = unwrap(this).getCaaAmazon()

  @Deprecated(message = "deprecated in CDK")
  public fun crossAccountZoneDelegationPrincipal(): IPrincipal? =
      unwrap(this).getCrossAccountZoneDelegationPrincipal()?.let(IPrincipal::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun crossAccountZoneDelegationRoleName(): String? =
      unwrap(this).getCrossAccountZoneDelegationRoleName()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PublicHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZoneProps.builder()

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

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneProps,
  ) : CdkObject(cdkObject), PublicHostedZoneProps {
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    override fun caaAmazon(): Boolean? = unwrap(this).getCaaAmazon()

    override fun comment(): String? = unwrap(this).getComment()

    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationPrincipal(): IPrincipal? =
        unwrap(this).getCrossAccountZoneDelegationPrincipal()?.let(IPrincipal::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationRoleName(): String? =
        unwrap(this).getCrossAccountZoneDelegationRoleName()

    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneProps):
        PublicHostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZoneProps):
        software.amazon.awscdk.services.route53.PublicHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PublicHostedZoneProps
  }
}
