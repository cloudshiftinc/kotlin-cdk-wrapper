@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.grafana

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWorkspaceProps {
  public fun accountAccessType(): String

  public fun authenticationProviders(): List<String>

  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

  public fun name(): String? = unwrap(this).getName()

  public fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

  public fun notificationDestinations(): List<String> = unwrap(this).getNotificationDestinations()
      ?: emptyList()

  public fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

  public fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
      emptyList()

  public fun permissionType(): String

  public fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

  public fun stackSetName(): String? = unwrap(this).getStackSetName()

  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun accountAccessType(accountAccessType: String)

    public fun authenticationProviders(authenticationProviders: List<String>)

    public fun authenticationProviders(vararg authenticationProviders: String)

    public fun clientToken(clientToken: String)

    public fun dataSources(dataSources: List<String>)

    public fun dataSources(vararg dataSources: String)

    public fun description(description: String)

    public fun grafanaVersion(grafanaVersion: String)

    public fun name(name: String)

    public fun networkAccessControl(networkAccessControl: IResolvable)

    public fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61d78fb24a54dcf54e79e434aae77e826c8c6375fe463f816a7b0b443b3f2a51")
    public
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit)

    public fun notificationDestinations(notificationDestinations: List<String>)

    public fun notificationDestinations(vararg notificationDestinations: String)

    public fun organizationRoleName(organizationRoleName: String)

    public fun organizationalUnits(organizationalUnits: List<String>)

    public fun organizationalUnits(vararg organizationalUnits: String)

    public fun permissionType(permissionType: String)

    public fun pluginAdminEnabled(pluginAdminEnabled: Boolean)

    public fun pluginAdminEnabled(pluginAdminEnabled: IResolvable)

    public fun roleArn(roleArn: String)

    public fun samlConfiguration(samlConfiguration: IResolvable)

    public fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("990b1cf24df9062196c8e940da27e0fd5e31f6b1be4d2392c51e91cfbb599cf6")
    public
        fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit)

    public fun stackSetName(stackSetName: String)

    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    public fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ae53ea929d2fd9619edb5856068b2a18452f07d65de8d8010083d0a130fe1c5")
    public
        fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.grafana.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.grafana.CfnWorkspaceProps.builder()

    override fun accountAccessType(accountAccessType: String) {
      cdkBuilder.accountAccessType(accountAccessType)
    }

    override fun authenticationProviders(authenticationProviders: List<String>) {
      cdkBuilder.authenticationProviders(authenticationProviders)
    }

    override fun authenticationProviders(vararg authenticationProviders: String): Unit =
        authenticationProviders(authenticationProviders.toList())

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun dataSources(dataSources: List<String>) {
      cdkBuilder.dataSources(dataSources)
    }

    override fun dataSources(vararg dataSources: String): Unit = dataSources(dataSources.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun grafanaVersion(grafanaVersion: String) {
      cdkBuilder.grafanaVersion(grafanaVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkAccessControl(networkAccessControl: IResolvable) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(IResolvable::unwrap))
    }

    override
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(CfnWorkspace.NetworkAccessControlProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61d78fb24a54dcf54e79e434aae77e826c8c6375fe463f816a7b0b443b3f2a51")
    override
        fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty.Builder.() -> Unit):
        Unit = networkAccessControl(CfnWorkspace.NetworkAccessControlProperty(networkAccessControl))

    override fun notificationDestinations(notificationDestinations: List<String>) {
      cdkBuilder.notificationDestinations(notificationDestinations)
    }

    override fun notificationDestinations(vararg notificationDestinations: String): Unit =
        notificationDestinations(notificationDestinations.toList())

    override fun organizationRoleName(organizationRoleName: String) {
      cdkBuilder.organizationRoleName(organizationRoleName)
    }

    override fun organizationalUnits(organizationalUnits: List<String>) {
      cdkBuilder.organizationalUnits(organizationalUnits)
    }

    override fun organizationalUnits(vararg organizationalUnits: String): Unit =
        organizationalUnits(organizationalUnits.toList())

    override fun permissionType(permissionType: String) {
      cdkBuilder.permissionType(permissionType)
    }

    override fun pluginAdminEnabled(pluginAdminEnabled: Boolean) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled)
    }

    override fun pluginAdminEnabled(pluginAdminEnabled: IResolvable) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled.let(IResolvable::unwrap))
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun samlConfiguration(samlConfiguration: IResolvable) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(IResolvable::unwrap))
    }

    override fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(CfnWorkspace.SamlConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("990b1cf24df9062196c8e940da27e0fd5e31f6b1be4d2392c51e91cfbb599cf6")
    override
        fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty.Builder.() -> Unit):
        Unit = samlConfiguration(CfnWorkspace.SamlConfigurationProperty(samlConfiguration))

    override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    override fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnWorkspace.VpcConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ae53ea929d2fd9619edb5856068b2a18452f07d65de8d8010083d0a130fe1c5")
    override
        fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnWorkspace.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    override fun accountAccessType(): String = unwrap(this).getAccountAccessType()

    override fun authenticationProviders(): List<String> = unwrap(this).getAuthenticationProviders()

    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

    override fun name(): String? = unwrap(this).getName()

    override fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

    override fun notificationDestinations(): List<String> =
        unwrap(this).getNotificationDestinations() ?: emptyList()

    override fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

    override fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
        emptyList()

    override fun permissionType(): String = unwrap(this).getPermissionType()

    override fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

    override fun stackSetName(): String? = unwrap(this).getStackSetName()

    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspaceProps):
        CfnWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.grafana.CfnWorkspaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.grafana.CfnWorkspaceProps
  }
}
