package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHost internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnHost,
) : CfnResource(cdkObject), IInspectable {
  public open fun assetId(): String? = unwrap(this).getAssetId()

  public open fun assetId(`value`: String) {
    unwrap(this).setAssetId(`value`)
  }

  public open fun attrHostId(): String = unwrap(this).getAttrHostId()

  public open fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

  public open fun autoPlacement(`value`: String) {
    unwrap(this).setAutoPlacement(`value`)
  }

  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

  public open fun hostMaintenance(`value`: String) {
    unwrap(this).setHostMaintenance(`value`)
  }

  public open fun hostRecovery(): String? = unwrap(this).getHostRecovery()

  public open fun hostRecovery(`value`: String) {
    unwrap(this).setHostRecovery(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

  public open fun instanceFamily(`value`: String) {
    unwrap(this).setInstanceFamily(`value`)
  }

  public open fun instanceType(): String? = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  public interface Builder {
    public fun assetId(assetId: String) {
    }

    public fun autoPlacement(autoPlacement: String) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun hostMaintenance(hostMaintenance: String) {
    }

    public fun hostRecovery(hostRecovery: String) {
    }

    public fun instanceFamily(instanceFamily: String) {
    }

    public fun instanceType(instanceType: String) {
    }

    public fun outpostArn(outpostArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnHost.Builder =
        software.amazon.awscdk.services.ec2.CfnHost.Builder.create(scope, id)

    public override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    public override fun autoPlacement(autoPlacement: String) {
      cdkBuilder.autoPlacement(autoPlacement)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun hostMaintenance(hostMaintenance: String) {
      cdkBuilder.hostMaintenance(hostMaintenance)
    }

    public override fun hostRecovery(hostRecovery: String) {
      cdkBuilder.hostRecovery(hostRecovery)
    }

    public override fun instanceFamily(instanceFamily: String) {
      cdkBuilder.instanceFamily(instanceFamily)
    }

    public override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    public override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnHost = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHost {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHost(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnHost): CfnHost =
        CfnHost(cdkObject)

    internal fun unwrap(wrapped: CfnHost): software.amazon.awscdk.services.ec2.CfnHost =
        wrapped.cdkObject
  }
}
