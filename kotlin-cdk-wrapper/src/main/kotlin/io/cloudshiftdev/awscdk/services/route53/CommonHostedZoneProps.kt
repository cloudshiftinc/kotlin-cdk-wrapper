@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CommonHostedZoneProps {
  public fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

  public fun comment(): String? = unwrap(this).getComment()

  public fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

  public fun zoneName(): String

  @CdkDslMarker
  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean)

    public fun comment(comment: String)

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CommonHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.CommonHostedZoneProps.builder()

    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.CommonHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CommonHostedZoneProps,
  ) : CdkObject(cdkObject), CommonHostedZoneProps {
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    override fun comment(): String? = unwrap(this).getComment()

    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CommonHostedZoneProps):
        CommonHostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonHostedZoneProps):
        software.amazon.awscdk.services.route53.CommonHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CommonHostedZoneProps
  }
}
