@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface PublicHostedZoneAttributes : HostedZoneAttributes {
  @CdkDslMarker
  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String)

    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes.builder()

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZoneAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneAttributes,
  ) : CdkObject(cdkObject), PublicHostedZoneAttributes {
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicHostedZoneAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneAttributes):
        PublicHostedZoneAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZoneAttributes):
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PublicHostedZoneAttributes
  }
}
