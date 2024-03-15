@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface PrivateHostedZoneProps : CommonHostedZoneProps {
  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean)

    public fun comment(comment: String)

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    public fun vpc(vpc: IVpc)

    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PrivateHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.PrivateHostedZoneProps.builder()

    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PrivateHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZoneProps,
  ) : CdkObject(cdkObject), PrivateHostedZoneProps {
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    override fun comment(): String? = unwrap(this).getComment()

    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZoneProps):
        PrivateHostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateHostedZoneProps):
        software.amazon.awscdk.services.route53.PrivateHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PrivateHostedZoneProps
  }
}
