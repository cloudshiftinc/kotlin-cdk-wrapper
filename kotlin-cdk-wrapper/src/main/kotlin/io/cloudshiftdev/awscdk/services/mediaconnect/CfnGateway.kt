@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrGatewayArn(): String = unwrap(this).getAttrGatewayArn()

  public open fun attrGatewayState(): String = unwrap(this).getAttrGatewayState()

  public open fun egressCidrBlocks(): List<String> = unwrap(this).getEgressCidrBlocks()

  public open fun egressCidrBlocks(`value`: List<String>) {
    unwrap(this).setEgressCidrBlocks(`value`)
  }

  public open fun egressCidrBlocks(vararg `value`: String): Unit =
      egressCidrBlocks(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networks(): Any = unwrap(this).getNetworks()

  public open fun networks(`value`: IResolvable) {
    unwrap(this).setNetworks(`value`.let(IResolvable::unwrap))
  }

  public open fun networks(__idx_ac66f0: List<Any>) {
    unwrap(this).setNetworks(__idx_ac66f0)
  }

  public open fun networks(vararg __idx_ac66f0: Any): Unit = networks(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun egressCidrBlocks(egressCidrBlocks: List<String>)

    public fun egressCidrBlocks(vararg egressCidrBlocks: String)

    public fun name(name: String)

    public fun networks(networks: IResolvable)

    public fun networks(networks: List<Any>)

    public fun networks(vararg networks: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnGateway.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnGateway.Builder.create(scope, id)

    override fun egressCidrBlocks(egressCidrBlocks: List<String>) {
      cdkBuilder.egressCidrBlocks(egressCidrBlocks)
    }

    override fun egressCidrBlocks(vararg egressCidrBlocks: String): Unit =
        egressCidrBlocks(egressCidrBlocks.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networks(networks: IResolvable) {
      cdkBuilder.networks(networks.let(IResolvable::unwrap))
    }

    override fun networks(networks: List<Any>) {
      cdkBuilder.networks(networks)
    }

    override fun networks(vararg networks: Any): Unit = networks(networks.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway):
        CfnGateway = CfnGateway(cdkObject)

    internal fun unwrap(wrapped: CfnGateway):
        software.amazon.awscdk.services.mediaconnect.CfnGateway = wrapped.cdkObject
  }

  public interface GatewayNetworkProperty {
    public fun cidrBlock(): String

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun cidrBlock(cidrBlock: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty.builder()

      override fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty,
    ) : CdkObject(cdkObject), GatewayNetworkProperty {
      override fun cidrBlock(): String = unwrap(this).getCidrBlock()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayNetworkProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty):
          GatewayNetworkProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayNetworkProperty):
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnGateway.GatewayNetworkProperty
    }
  }
}
