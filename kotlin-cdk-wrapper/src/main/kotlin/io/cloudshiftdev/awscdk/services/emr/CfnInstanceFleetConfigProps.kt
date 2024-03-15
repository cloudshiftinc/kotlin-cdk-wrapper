@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceFleetConfigProps {
  public fun clusterId(): String

  public fun instanceFleetType(): String

  public fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

  public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

  public fun name(): String? = unwrap(this).getName()

  public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

  public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

  @CdkDslMarker
  public interface Builder {
    public fun clusterId(clusterId: String)

    public fun instanceFleetType(instanceFleetType: String)

    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

    public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

    public fun launchSpecifications(launchSpecifications: IResolvable)

    public
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb8bce8d092d4eb1af0eb5107a3e18c525496dc61feee2b3c354bbc087ca708")
    public
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

    public fun targetSpotCapacity(targetSpotCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder
        = software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.builder()

    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    override fun instanceFleetType(instanceFleetType: String) {
      cdkBuilder.instanceFleetType(instanceFleetType)
    }

    override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
    }

    override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
    }

    override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
        instanceTypeConfigs(instanceTypeConfigs.toList())

    override fun launchSpecifications(launchSpecifications: IResolvable) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
    }

    override
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb8bce8d092d4eb1af0eb5107a3e18c525496dc61feee2b3c354bbc087ca708")
    override
        fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
        Unit =
        launchSpecifications(CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    override fun targetSpotCapacity(targetSpotCapacity: Number) {
      cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps,
  ) : CdkObject(cdkObject), CfnInstanceFleetConfigProps {
    override fun clusterId(): String = unwrap(this).getClusterId()

    override fun instanceFleetType(): String = unwrap(this).getInstanceFleetType()

    override fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

    override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    override fun name(): String? = unwrap(this).getName()

    override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

    override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceFleetConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps):
        CfnInstanceFleetConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceFleetConfigProps):
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
  }
}
