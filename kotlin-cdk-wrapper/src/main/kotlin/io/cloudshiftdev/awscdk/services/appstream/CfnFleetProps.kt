@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFleetProps {
  public fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disconnectTimeoutInSeconds(): Number? = unwrap(this).getDisconnectTimeoutInSeconds()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  public fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

  public fun fleetType(): String? = unwrap(this).getFleetType()

  public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public fun idleDisconnectTimeoutInSeconds(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInSeconds()

  public fun imageArn(): String? = unwrap(this).getImageArn()

  public fun imageName(): String? = unwrap(this).getImageName()

  public fun instanceType(): String

  public fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

  public fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

  public fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

  public fun name(): String

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

  public fun streamView(): String? = unwrap(this).getStreamView()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings() ?:
      emptyList()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun computeCapacity(computeCapacity: IResolvable)

    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e9cdbabab83e85e1da25daa1a039334828818ddcfa6a02eaeda85ad4cb80da")
    public fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number)

    public fun displayName(displayName: String)

    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308a5d79b8e903a24a9de1981c9ebfba808bd63632efd009682e5e28a601db69")
    public fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty.Builder.() -> Unit)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun fleetType(fleetType: String)

    public fun iamRoleArn(iamRoleArn: String)

    public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number)

    public fun imageArn(imageArn: String)

    public fun imageName(imageName: String)

    public fun instanceType(instanceType: String)

    public fun maxConcurrentSessions(maxConcurrentSessions: Number)

    public fun maxSessionsPerInstance(maxSessionsPerInstance: Number)

    public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun sessionScriptS3Location(sessionScriptS3Location: IResolvable)

    public fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad395e1e53e659550a6645eab8bfd307a269d1b76ba055229d82e95afca3e34d")
    public
        fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty.Builder.() -> Unit)

    public fun streamView(streamView: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>)

    public fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab49971d1d1fc25990b8996f87906c689182b6a229ba0e8e9ff08455a1854f2")
    public fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnFleetProps.Builder =
        software.amazon.awscdk.services.appstream.CfnFleetProps.builder()

    override fun computeCapacity(computeCapacity: IResolvable) {
      cdkBuilder.computeCapacity(computeCapacity.let(IResolvable::unwrap))
    }

    override fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty) {
      cdkBuilder.computeCapacity(computeCapacity.let(CfnFleet.ComputeCapacityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e9cdbabab83e85e1da25daa1a039334828818ddcfa6a02eaeda85ad4cb80da")
    override
        fun computeCapacity(computeCapacity: CfnFleet.ComputeCapacityProperty.Builder.() -> Unit):
        Unit = computeCapacity(CfnFleet.ComputeCapacityProperty(computeCapacity))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
      cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    override fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(CfnFleet.DomainJoinInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308a5d79b8e903a24a9de1981c9ebfba808bd63632efd009682e5e28a601db69")
    override fun domainJoinInfo(domainJoinInfo: CfnFleet.DomainJoinInfoProperty.Builder.() -> Unit):
        Unit = domainJoinInfo(CfnFleet.DomainJoinInfoProperty(domainJoinInfo))

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
      cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
    }

    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun maxConcurrentSessions(maxConcurrentSessions: Number) {
      cdkBuilder.maxConcurrentSessions(maxConcurrentSessions)
    }

    override fun maxSessionsPerInstance(maxSessionsPerInstance: Number) {
      cdkBuilder.maxSessionsPerInstance(maxSessionsPerInstance)
    }

    override fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
      cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun sessionScriptS3Location(sessionScriptS3Location: IResolvable) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(IResolvable::unwrap))
    }

    override fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty) {
      cdkBuilder.sessionScriptS3Location(sessionScriptS3Location.let(CfnFleet.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad395e1e53e659550a6645eab8bfd307a269d1b76ba055229d82e95afca3e34d")
    override
        fun sessionScriptS3Location(sessionScriptS3Location: CfnFleet.S3LocationProperty.Builder.() -> Unit):
        Unit = sessionScriptS3Location(CfnFleet.S3LocationProperty(sessionScriptS3Location))

    override fun streamView(streamView: String) {
      cdkBuilder.streamView(streamView)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun usbDeviceFilterStrings(usbDeviceFilterStrings: List<String>) {
      cdkBuilder.usbDeviceFilterStrings(usbDeviceFilterStrings)
    }

    override fun usbDeviceFilterStrings(vararg usbDeviceFilterStrings: String): Unit =
        usbDeviceFilterStrings(usbDeviceFilterStrings.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFleet.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab49971d1d1fc25990b8996f87906c689182b6a229ba0e8e9ff08455a1854f2")
    override fun vpcConfig(vpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFleet.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnFleetProps,
  ) : CdkObject(cdkObject), CfnFleetProps {
    override fun computeCapacity(): Any? = unwrap(this).getComputeCapacity()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disconnectTimeoutInSeconds(): Number? =
        unwrap(this).getDisconnectTimeoutInSeconds()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

    override fun enableDefaultInternetAccess(): Any? = unwrap(this).getEnableDefaultInternetAccess()

    override fun fleetType(): String? = unwrap(this).getFleetType()

    override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    override fun idleDisconnectTimeoutInSeconds(): Number? =
        unwrap(this).getIdleDisconnectTimeoutInSeconds()

    override fun imageArn(): String? = unwrap(this).getImageArn()

    override fun imageName(): String? = unwrap(this).getImageName()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun maxConcurrentSessions(): Number? = unwrap(this).getMaxConcurrentSessions()

    override fun maxSessionsPerInstance(): Number? = unwrap(this).getMaxSessionsPerInstance()

    override fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

    override fun name(): String = unwrap(this).getName()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun sessionScriptS3Location(): Any? = unwrap(this).getSessionScriptS3Location()

    override fun streamView(): String? = unwrap(this).getStreamView()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun usbDeviceFilterStrings(): List<String> = unwrap(this).getUsbDeviceFilterStrings()
        ?: emptyList()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnFleetProps):
        CfnFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.appstream.CfnFleetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appstream.CfnFleetProps
  }
}
