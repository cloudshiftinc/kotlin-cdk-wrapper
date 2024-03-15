@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SecurityGroupContextResponse {
  public fun allowAllOutbound(): Boolean

  public fun securityGroupId(): String

  @CdkDslMarker
  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun securityGroupId(securityGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.SecurityGroupContextResponse.Builder =
        software.amazon.awscdk.cxapi.SecurityGroupContextResponse.builder()

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun build(): software.amazon.awscdk.cxapi.SecurityGroupContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.SecurityGroupContextResponse,
  ) : CdkObject(cdkObject), SecurityGroupContextResponse {
    override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.SecurityGroupContextResponse):
        SecurityGroupContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextResponse):
        software.amazon.awscdk.cxapi.SecurityGroupContextResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.SecurityGroupContextResponse
  }
}
