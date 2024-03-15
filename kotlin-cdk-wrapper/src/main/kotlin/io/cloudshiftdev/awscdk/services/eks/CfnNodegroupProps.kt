@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnNodegroupProps {
  public fun amiType(): String? = unwrap(this).getAmiType()

  public fun capacityType(): String? = unwrap(this).getCapacityType()

  public fun clusterName(): String

  public fun diskSize(): Number? = unwrap(this).getDiskSize()

  public fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

  public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  public fun labels(): Any? = unwrap(this).getLabels()

  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public fun nodeRole(): String

  public fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  public fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  public fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

  public fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  public fun subnets(): List<String>

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun taints(): Any? = unwrap(this).getTaints()

  public fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun amiType(amiType: String)

    public fun capacityType(capacityType: String)

    public fun clusterName(clusterName: String)

    public fun diskSize(diskSize: Number)

    public fun forceUpdateEnabled(forceUpdateEnabled: Boolean)

    public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable)

    public fun instanceTypes(instanceTypes: List<String>)

    public fun instanceTypes(vararg instanceTypes: String)

    public fun labels(labels: IResolvable)

    public fun labels(labels: Map<String, String>)

    public fun launchTemplate(launchTemplate: IResolvable)

    public fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18969c3bfdf19d3641486ae46a5013a3e6802b5482a7ebd85b52450aa667aa99")
    public
        fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    public fun nodeRole(nodeRole: String)

    public fun nodegroupName(nodegroupName: String)

    public fun releaseVersion(releaseVersion: String)

    public fun remoteAccess(remoteAccess: IResolvable)

    public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f39ff54f381c2a00ad3b9e744a041218336b0931c5b42b819859c985d10a3a5")
    public fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit)

    public fun scalingConfig(scalingConfig: IResolvable)

    public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab8b43e22c8f3fdacd3df66c43824c9b0a4a40d16c5ee222a381428ce2bcce6")
    public fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty.Builder.() -> Unit)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: Map<String, String>)

    public fun taints(taints: IResolvable)

    public fun taints(taints: List<Any>)

    public fun taints(vararg taints: Any)

    public fun updateConfig(updateConfig: IResolvable)

    public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4dbafb1a7a495a5b14585187cd5802fbf5edeac3c315a8210bb3125da71894")
    public fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroupProps.Builder =
        software.amazon.awscdk.services.eks.CfnNodegroupProps.builder()

    override fun amiType(amiType: String) {
      cdkBuilder.amiType(amiType)
    }

    override fun capacityType(capacityType: String) {
      cdkBuilder.capacityType(capacityType)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    override fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

    override fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled.let(IResolvable::unwrap))
    }

    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnNodegroup.LaunchTemplateSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18969c3bfdf19d3641486ae46a5013a3e6802b5482a7ebd85b52450aa667aa99")
    override
        fun launchTemplate(launchTemplate: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnNodegroup.LaunchTemplateSpecificationProperty(launchTemplate))

    override fun nodeRole(nodeRole: String) {
      cdkBuilder.nodeRole(nodeRole)
    }

    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    override fun remoteAccess(remoteAccess: IResolvable) {
      cdkBuilder.remoteAccess(remoteAccess.let(IResolvable::unwrap))
    }

    override fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty) {
      cdkBuilder.remoteAccess(remoteAccess.let(CfnNodegroup.RemoteAccessProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f39ff54f381c2a00ad3b9e744a041218336b0931c5b42b819859c985d10a3a5")
    override fun remoteAccess(remoteAccess: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit):
        Unit = remoteAccess(CfnNodegroup.RemoteAccessProperty(remoteAccess))

    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    override fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(CfnNodegroup.ScalingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab8b43e22c8f3fdacd3df66c43824c9b0a4a40d16c5ee222a381428ce2bcce6")
    override
        fun scalingConfig(scalingConfig: CfnNodegroup.ScalingConfigProperty.Builder.() -> Unit):
        Unit = scalingConfig(CfnNodegroup.ScalingConfigProperty(scalingConfig))

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taints(taints: IResolvable) {
      cdkBuilder.taints(taints.let(IResolvable::unwrap))
    }

    override fun taints(taints: List<Any>) {
      cdkBuilder.taints(taints)
    }

    override fun taints(vararg taints: Any): Unit = taints(taints.toList())

    override fun updateConfig(updateConfig: IResolvable) {
      cdkBuilder.updateConfig(updateConfig.let(IResolvable::unwrap))
    }

    override fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty) {
      cdkBuilder.updateConfig(updateConfig.let(CfnNodegroup.UpdateConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4dbafb1a7a495a5b14585187cd5802fbf5edeac3c315a8210bb3125da71894")
    override fun updateConfig(updateConfig: CfnNodegroup.UpdateConfigProperty.Builder.() -> Unit):
        Unit = updateConfig(CfnNodegroup.UpdateConfigProperty(updateConfig))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnNodegroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroupProps,
  ) : CdkObject(cdkObject), CfnNodegroupProps {
    override fun amiType(): String? = unwrap(this).getAmiType()

    override fun capacityType(): String? = unwrap(this).getCapacityType()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun diskSize(): Number? = unwrap(this).getDiskSize()

    override fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

    override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    override fun labels(): Any? = unwrap(this).getLabels()

    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    override fun nodeRole(): String = unwrap(this).getNodeRole()

    override fun nodegroupName(): String? = unwrap(this).getNodegroupName()

    override fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

    override fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

    override fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

    override fun subnets(): List<String> = unwrap(this).getSubnets()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taints(): Any? = unwrap(this).getTaints()

    override fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNodegroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroupProps):
        CfnNodegroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNodegroupProps):
        software.amazon.awscdk.services.eks.CfnNodegroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.CfnNodegroupProps
  }
}
