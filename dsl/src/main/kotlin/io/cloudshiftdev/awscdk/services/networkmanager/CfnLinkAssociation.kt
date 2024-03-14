package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLinkAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun deviceId(): String = unwrap(this).getDeviceId()

  public open fun deviceId(`value`: String) {
    unwrap(this).setDeviceId(`value`)
  }

  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun linkId(): String = unwrap(this).getLinkId()

  public open fun linkId(`value`: String) {
    unwrap(this).setLinkId(`value`)
  }

  public interface Builder {
    public fun deviceId(deviceId: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun linkId(linkId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder.create(scope, id)

    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun linkId(linkId: String) {
      cdkBuilder.linkId(linkId)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLinkAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLinkAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociation):
        CfnLinkAssociation = CfnLinkAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnLinkAssociation):
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociation = wrapped.cdkObject
  }
}
