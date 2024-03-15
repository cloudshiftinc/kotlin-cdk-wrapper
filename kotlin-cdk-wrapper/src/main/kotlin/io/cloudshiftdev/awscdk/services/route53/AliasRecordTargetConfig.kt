@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AliasRecordTargetConfig {
  public fun dnsName(): String

  public fun hostedZoneId(): String

  @CdkDslMarker
  public interface Builder {
    public fun dnsName(dnsName: String)

    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.AliasRecordTargetConfig.Builder
        = software.amazon.awscdk.services.route53.AliasRecordTargetConfig.builder()

    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.AliasRecordTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig,
  ) : CdkObject(cdkObject), AliasRecordTargetConfig {
    override fun dnsName(): String = unwrap(this).getDnsName()

    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasRecordTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig):
        AliasRecordTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasRecordTargetConfig):
        software.amazon.awscdk.services.route53.AliasRecordTargetConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.AliasRecordTargetConfig
  }
}
