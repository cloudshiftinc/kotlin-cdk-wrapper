@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnStackProps {
  public fun agentVersion(): String? = unwrap(this).getAgentVersion()

  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

  public fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

  public fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

  public fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

  public fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

  public fun customJson(): Any? = unwrap(this).getCustomJson()

  public fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

  public fun defaultInstanceProfileArn(): String

  public fun defaultOs(): String? = unwrap(this).getDefaultOs()

  public fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

  public fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

  public fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

  public fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

  public fun elasticIps(): Any? = unwrap(this).getElasticIps()

  public fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

  public fun name(): String

  public fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

  public fun serviceRoleArn(): String

  public fun sourceStackId(): String? = unwrap(this).getSourceStackId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

  public fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun agentVersion(agentVersion: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun chefConfiguration(chefConfiguration: IResolvable)

    public fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5b2ed84bf8a02581536d76d9ffcb6a2544382d6574f369d866043395824fee")
    public
        fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty.Builder.() -> Unit)

    public fun cloneAppIds(cloneAppIds: List<String>)

    public fun cloneAppIds(vararg cloneAppIds: String)

    public fun clonePermissions(clonePermissions: Boolean)

    public fun clonePermissions(clonePermissions: IResolvable)

    public fun configurationManager(configurationManager: IResolvable)

    public
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ec23e002717b9da62167eef1b3c231d2ae8b8bcd33230dc6018893d5f2bfb1b")
    public
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit)

    public fun customCookbooksSource(customCookbooksSource: IResolvable)

    public fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8d5340deac08f795f23fc538b30c0c2287f7297f6bf120afcbe8746b3a6868")
    public
        fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty.Builder.() -> Unit)

    public fun customJson(customJson: Any)

    public fun defaultAvailabilityZone(defaultAvailabilityZone: String)

    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String)

    public fun defaultOs(defaultOs: String)

    public fun defaultRootDeviceType(defaultRootDeviceType: String)

    public fun defaultSshKeyName(defaultSshKeyName: String)

    public fun defaultSubnetId(defaultSubnetId: String)

    public fun ecsClusterArn(ecsClusterArn: String)

    public fun elasticIps(elasticIps: IResolvable)

    public fun elasticIps(elasticIps: List<Any>)

    public fun elasticIps(vararg elasticIps: Any)

    public fun hostnameTheme(hostnameTheme: String)

    public fun name(name: String)

    public fun rdsDbInstances(rdsDbInstances: IResolvable)

    public fun rdsDbInstances(rdsDbInstances: List<Any>)

    public fun rdsDbInstances(vararg rdsDbInstances: Any)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun sourceStackId(sourceStackId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun useCustomCookbooks(useCustomCookbooks: Boolean)

    public fun useCustomCookbooks(useCustomCookbooks: IResolvable)

    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean)

    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnStackProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnStackProps.builder()

    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun chefConfiguration(chefConfiguration: IResolvable) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(IResolvable::unwrap))
    }

    override fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(CfnStack.ChefConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5b2ed84bf8a02581536d76d9ffcb6a2544382d6574f369d866043395824fee")
    override
        fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty.Builder.() -> Unit):
        Unit = chefConfiguration(CfnStack.ChefConfigurationProperty(chefConfiguration))

    override fun cloneAppIds(cloneAppIds: List<String>) {
      cdkBuilder.cloneAppIds(cloneAppIds)
    }

    override fun cloneAppIds(vararg cloneAppIds: String): Unit = cloneAppIds(cloneAppIds.toList())

    override fun clonePermissions(clonePermissions: Boolean) {
      cdkBuilder.clonePermissions(clonePermissions)
    }

    override fun clonePermissions(clonePermissions: IResolvable) {
      cdkBuilder.clonePermissions(clonePermissions.let(IResolvable::unwrap))
    }

    override fun configurationManager(configurationManager: IResolvable) {
      cdkBuilder.configurationManager(configurationManager.let(IResolvable::unwrap))
    }

    override
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty) {
      cdkBuilder.configurationManager(configurationManager.let(CfnStack.StackConfigurationManagerProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ec23e002717b9da62167eef1b3c231d2ae8b8bcd33230dc6018893d5f2bfb1b")
    override
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit):
        Unit =
        configurationManager(CfnStack.StackConfigurationManagerProperty(configurationManager))

    override fun customCookbooksSource(customCookbooksSource: IResolvable) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(IResolvable::unwrap))
    }

    override fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(CfnStack.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8d5340deac08f795f23fc538b30c0c2287f7297f6bf120afcbe8746b3a6868")
    override
        fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty.Builder.() -> Unit):
        Unit = customCookbooksSource(CfnStack.SourceProperty(customCookbooksSource))

    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    override fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
      cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    override fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
      cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

    override fun defaultOs(defaultOs: String) {
      cdkBuilder.defaultOs(defaultOs)
    }

    override fun defaultRootDeviceType(defaultRootDeviceType: String) {
      cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

    override fun defaultSshKeyName(defaultSshKeyName: String) {
      cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    override fun defaultSubnetId(defaultSubnetId: String) {
      cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

    override fun ecsClusterArn(ecsClusterArn: String) {
      cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    override fun elasticIps(elasticIps: IResolvable) {
      cdkBuilder.elasticIps(elasticIps.let(IResolvable::unwrap))
    }

    override fun elasticIps(elasticIps: List<Any>) {
      cdkBuilder.elasticIps(elasticIps)
    }

    override fun elasticIps(vararg elasticIps: Any): Unit = elasticIps(elasticIps.toList())

    override fun hostnameTheme(hostnameTheme: String) {
      cdkBuilder.hostnameTheme(hostnameTheme)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rdsDbInstances(rdsDbInstances: IResolvable) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.let(IResolvable::unwrap))
    }

    override fun rdsDbInstances(rdsDbInstances: List<Any>) {
      cdkBuilder.rdsDbInstances(rdsDbInstances)
    }

    override fun rdsDbInstances(vararg rdsDbInstances: Any): Unit =
        rdsDbInstances(rdsDbInstances.toList())

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun sourceStackId(sourceStackId: String) {
      cdkBuilder.sourceStackId(sourceStackId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun useCustomCookbooks(useCustomCookbooks: Boolean) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    override fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks.let(IResolvable::unwrap))
    }

    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups.let(IResolvable::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnStackProps,
  ) : CdkObject(cdkObject), CfnStackProps {
    override fun agentVersion(): String? = unwrap(this).getAgentVersion()

    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

    override fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

    override fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

    override fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

    override fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

    override fun customJson(): Any? = unwrap(this).getCustomJson()

    override fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

    override fun defaultInstanceProfileArn(): String = unwrap(this).getDefaultInstanceProfileArn()

    override fun defaultOs(): String? = unwrap(this).getDefaultOs()

    override fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

    override fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

    override fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

    override fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

    override fun elasticIps(): Any? = unwrap(this).getElasticIps()

    override fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

    override fun name(): String = unwrap(this).getName()

    override fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    override fun sourceStackId(): String? = unwrap(this).getSourceStackId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

    override fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStackProps):
        CfnStackProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackProps):
        software.amazon.awscdk.services.opsworks.CfnStackProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnStackProps
  }
}
