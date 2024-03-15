@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDNSSECProps {
  public fun hostedZoneId(): String

  @CdkDslMarker
  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnDNSSECProps.Builder =
        software.amazon.awscdk.services.route53.CfnDNSSECProps.builder()

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnDNSSECProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnDNSSECProps,
  ) : CdkObject(cdkObject), CfnDNSSECProps {
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDNSSECProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnDNSSECProps):
        CfnDNSSECProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDNSSECProps):
        software.amazon.awscdk.services.route53.CfnDNSSECProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CfnDNSSECProps
  }
}
