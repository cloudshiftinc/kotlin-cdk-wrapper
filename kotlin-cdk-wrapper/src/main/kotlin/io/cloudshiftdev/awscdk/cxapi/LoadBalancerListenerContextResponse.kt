@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerListenerContextResponse {
  public fun listenerArn(): String

  public fun listenerPort(): Number

  public fun securityGroupIds(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun listenerArn(listenerArn: String)

    public fun listenerPort(listenerPort: Number)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.Builder
        = software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.builder()

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    public fun build(): software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse,
  ) : CdkObject(cdkObject), LoadBalancerListenerContextResponse {
    override fun listenerArn(): String = unwrap(this).getListenerArn()

    override fun listenerPort(): Number = unwrap(this).getListenerPort()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        LoadBalancerListenerContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse):
        LoadBalancerListenerContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerListenerContextResponse):
        software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse
  }
}
