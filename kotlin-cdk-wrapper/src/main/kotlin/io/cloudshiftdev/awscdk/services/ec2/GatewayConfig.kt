@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface GatewayConfig {
  public fun az(): String

  public fun gatewayId(): String

  @CdkDslMarker
  public interface Builder {
    public fun az(az: String)

    public fun gatewayId(gatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayConfig.Builder =
        software.amazon.awscdk.services.ec2.GatewayConfig.builder()

    override fun az(az: String) {
      cdkBuilder.az(az)
    }

    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig,
  ) : CdkObject(cdkObject), GatewayConfig {
    override fun az(): String = unwrap(this).getAz()

    override fun gatewayId(): String = unwrap(this).getGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig): GatewayConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayConfig): software.amazon.awscdk.services.ec2.GatewayConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayConfig
  }
}
