@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnHostProps {
  public fun assetId(): String? = unwrap(this).getAssetId()

  public fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

  public fun availabilityZone(): String

  public fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

  public fun hostRecovery(): String? = unwrap(this).getHostRecovery()

  public fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

  public fun instanceType(): String? = unwrap(this).getInstanceType()

  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  @CdkDslMarker
  public interface Builder {
    public fun assetId(assetId: String)

    public fun autoPlacement(autoPlacement: String)

    public fun availabilityZone(availabilityZone: String)

    public fun hostMaintenance(hostMaintenance: String)

    public fun hostRecovery(hostRecovery: String)

    public fun instanceFamily(instanceFamily: String)

    public fun instanceType(instanceType: String)

    public fun outpostArn(outpostArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnHostProps.Builder =
        software.amazon.awscdk.services.ec2.CfnHostProps.builder()

    override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    override fun autoPlacement(autoPlacement: String) {
      cdkBuilder.autoPlacement(autoPlacement)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun hostMaintenance(hostMaintenance: String) {
      cdkBuilder.hostMaintenance(hostMaintenance)
    }

    override fun hostRecovery(hostRecovery: String) {
      cdkBuilder.hostRecovery(hostRecovery)
    }

    override fun instanceFamily(instanceFamily: String) {
      cdkBuilder.instanceFamily(instanceFamily)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnHostProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnHostProps,
  ) : CdkObject(cdkObject), CfnHostProps {
    override fun assetId(): String? = unwrap(this).getAssetId()

    override fun autoPlacement(): String? = unwrap(this).getAutoPlacement()

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun hostMaintenance(): String? = unwrap(this).getHostMaintenance()

    override fun hostRecovery(): String? = unwrap(this).getHostRecovery()

    override fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

    override fun instanceType(): String? = unwrap(this).getInstanceType()

    override fun outpostArn(): String? = unwrap(this).getOutpostArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHostProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnHostProps): CfnHostProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHostProps): software.amazon.awscdk.services.ec2.CfnHostProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnHostProps
  }
}
