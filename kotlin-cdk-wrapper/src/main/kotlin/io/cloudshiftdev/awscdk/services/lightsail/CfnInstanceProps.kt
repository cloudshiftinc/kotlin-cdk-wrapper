@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceProps {
  public fun addOns(): Any? = unwrap(this).getAddOns()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun blueprintId(): String

  public fun bundleId(): String

  public fun hardware(): Any? = unwrap(this).getHardware()

  public fun instanceName(): String

  public fun keyPairName(): String? = unwrap(this).getKeyPairName()

  public fun location(): Any? = unwrap(this).getLocation()

  public fun networking(): Any? = unwrap(this).getNetworking()

  public fun state(): Any? = unwrap(this).getState()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userData(): String? = unwrap(this).getUserData()

  @CdkDslMarker
  public interface Builder {
    public fun addOns(addOns: IResolvable)

    public fun addOns(addOns: List<Any>)

    public fun addOns(vararg addOns: Any)

    public fun availabilityZone(availabilityZone: String)

    public fun blueprintId(blueprintId: String)

    public fun bundleId(bundleId: String)

    public fun hardware(hardware: IResolvable)

    public fun hardware(hardware: CfnInstance.HardwareProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53764cfbdcef1b3bf24d253e23c907a685ce56955266b940e4a04835e2523fa4")
    public fun hardware(hardware: CfnInstance.HardwareProperty.Builder.() -> Unit)

    public fun instanceName(instanceName: String)

    public fun keyPairName(keyPairName: String)

    public fun location(location: IResolvable)

    public fun location(location: CfnInstance.LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4dced965c5f90881a8d1fac148b93491120c7663f84190cd34162493f499413")
    public fun location(location: CfnInstance.LocationProperty.Builder.() -> Unit)

    public fun networking(networking: IResolvable)

    public fun networking(networking: CfnInstance.NetworkingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18aec6aa9f7b234006fe1cb1adcf0e2e729120477cd845051b65b16fccdfc5c1")
    public fun networking(networking: CfnInstance.NetworkingProperty.Builder.() -> Unit)

    public fun state(state: IResolvable)

    public fun state(state: CfnInstance.StateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7963b88a8c56834294d35803a5d74d17fdcee203cf342ad2f0c45eef0df2da58")
    public fun state(state: CfnInstance.StateProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userData(userData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnInstanceProps.builder()

    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns)
    }

    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blueprintId(blueprintId: String) {
      cdkBuilder.blueprintId(blueprintId)
    }

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun hardware(hardware: IResolvable) {
      cdkBuilder.hardware(hardware.let(IResolvable::unwrap))
    }

    override fun hardware(hardware: CfnInstance.HardwareProperty) {
      cdkBuilder.hardware(hardware.let(CfnInstance.HardwareProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53764cfbdcef1b3bf24d253e23c907a685ce56955266b940e4a04835e2523fa4")
    override fun hardware(hardware: CfnInstance.HardwareProperty.Builder.() -> Unit): Unit =
        hardware(CfnInstance.HardwareProperty(hardware))

    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnInstance.LocationProperty) {
      cdkBuilder.location(location.let(CfnInstance.LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4dced965c5f90881a8d1fac148b93491120c7663f84190cd34162493f499413")
    override fun location(location: CfnInstance.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnInstance.LocationProperty(location))

    override fun networking(networking: IResolvable) {
      cdkBuilder.networking(networking.let(IResolvable::unwrap))
    }

    override fun networking(networking: CfnInstance.NetworkingProperty) {
      cdkBuilder.networking(networking.let(CfnInstance.NetworkingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18aec6aa9f7b234006fe1cb1adcf0e2e729120477cd845051b65b16fccdfc5c1")
    override fun networking(networking: CfnInstance.NetworkingProperty.Builder.() -> Unit): Unit =
        networking(CfnInstance.NetworkingProperty(networking))

    override fun state(state: IResolvable) {
      cdkBuilder.state(state.let(IResolvable::unwrap))
    }

    override fun state(state: CfnInstance.StateProperty) {
      cdkBuilder.state(state.let(CfnInstance.StateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7963b88a8c56834294d35803a5d74d17fdcee203cf342ad2f0c45eef0df2da58")
    override fun state(state: CfnInstance.StateProperty.Builder.() -> Unit): Unit =
        state(CfnInstance.StateProperty(state))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    override fun addOns(): Any? = unwrap(this).getAddOns()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun blueprintId(): String = unwrap(this).getBlueprintId()

    override fun bundleId(): String = unwrap(this).getBundleId()

    override fun hardware(): Any? = unwrap(this).getHardware()

    override fun instanceName(): String = unwrap(this).getInstanceName()

    override fun keyPairName(): String? = unwrap(this).getKeyPairName()

    override fun location(): Any? = unwrap(this).getLocation()

    override fun networking(): Any? = unwrap(this).getNetworking()

    override fun state(): Any? = unwrap(this).getState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userData(): String? = unwrap(this).getUserData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.lightsail.CfnInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnInstanceProps
  }
}
