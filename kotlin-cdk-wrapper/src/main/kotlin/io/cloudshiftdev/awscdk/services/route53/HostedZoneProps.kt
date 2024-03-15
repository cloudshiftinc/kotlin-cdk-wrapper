@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HostedZoneProps : CommonHostedZoneProps {
  public fun vpcs(): List<IVpc> = unwrap(this).getVpcs()?.map(IVpc::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean)

    public fun comment(comment: String)

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    public fun vpcs(vpcs: List<IVpc>)

    public fun vpcs(vararg vpcs: IVpc)

    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.HostedZoneProps.builder()

    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    override fun vpcs(vpcs: List<IVpc>) {
      cdkBuilder.vpcs(vpcs.map(IVpc::unwrap))
    }

    override fun vpcs(vararg vpcs: IVpc): Unit = vpcs(vpcs.toList())

    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.HostedZoneProps,
  ) : CdkObject(cdkObject), HostedZoneProps {
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    override fun comment(): String? = unwrap(this).getComment()

    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    override fun vpcs(): List<IVpc> = unwrap(this).getVpcs()?.map(IVpc::wrap) ?: emptyList()

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneProps):
        HostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneProps):
        software.amazon.awscdk.services.route53.HostedZoneProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.HostedZoneProps
  }
}
