@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEndpointServicePermissionsProps {
  public fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?: emptyList()

  public fun serviceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun allowedPrincipals(allowedPrincipals: List<String>)

    public fun allowedPrincipals(vararg allowedPrincipals: String)

    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.builder()

    override fun allowedPrincipals(allowedPrincipals: List<String>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals)
    }

    override fun allowedPrincipals(vararg allowedPrincipals: String): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointServicePermissionsProps {
    override fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?:
        emptyList()

    override fun serviceId(): String = unwrap(this).getServiceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCEndpointServicePermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps):
        CfnVPCEndpointServicePermissionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServicePermissionsProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
  }
}
