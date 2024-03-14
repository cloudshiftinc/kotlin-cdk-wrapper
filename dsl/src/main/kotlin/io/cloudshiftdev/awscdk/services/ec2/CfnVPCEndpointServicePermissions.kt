package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpointServicePermissions internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?:
      emptyList()

  public open fun allowedPrincipals(`value`: List<String>) {
    unwrap(this).setAllowedPrincipals(`value`)
  }

  public open fun allowedPrincipals(vararg `value`: String): Unit =
      allowedPrincipals(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceId(): String = unwrap(this).getServiceId()

  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  public interface Builder {
    public fun allowedPrincipals(allowedPrincipals: List<String>)

    public fun allowedPrincipals(vararg allowedPrincipals: String)

    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder.create(scope,
        id)

    override fun allowedPrincipals(allowedPrincipals: List<String>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals)
    }

    override fun allowedPrincipals(vararg allowedPrincipals: String): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointServicePermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointServicePermissions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions):
        CfnVPCEndpointServicePermissions = CfnVPCEndpointServicePermissions(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServicePermissions):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions = wrapped.cdkObject
  }
}
