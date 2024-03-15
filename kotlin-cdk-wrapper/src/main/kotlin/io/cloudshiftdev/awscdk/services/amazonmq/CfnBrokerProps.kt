@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBrokerProps {
  public fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  public fun autoMinorVersionUpgrade(): Any

  public fun brokerName(): String

  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

  public fun dataReplicationPrimaryBrokerArn(): String? =
      unwrap(this).getDataReplicationPrimaryBrokerArn()

  public fun deploymentMode(): String

  public fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

  public fun engineType(): String

  public fun engineVersion(): String

  public fun hostInstanceType(): String

  public fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

  public fun logs(): Any? = unwrap(this).getLogs()

  public fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

  public fun publiclyAccessible(): Any

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun storageType(): String? = unwrap(this).getStorageType()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnBroker.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnBroker.TagsEntryProperty::wrap) ?: emptyList()

  public fun users(): Any

  @CdkDslMarker
  public interface Builder {
    public fun authenticationStrategy(authenticationStrategy: String)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun brokerName(brokerName: String)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnBroker.ConfigurationIdProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85ce35c3dd8412acbc332227ff1ec05a2793e0f89faf903727e0bd38df04be63")
    public fun configuration(configuration: CfnBroker.ConfigurationIdProperty.Builder.() -> Unit)

    public fun dataReplicationMode(dataReplicationMode: String)

    public fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String)

    public fun deploymentMode(deploymentMode: String)

    public fun encryptionOptions(encryptionOptions: IResolvable)

    public fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed587c05f8c37ed89ca566d62bf019ebe88fc92d4829241d18f9161c9015b8c0")
    public
        fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit)

    public fun engineType(engineType: String)

    public fun engineVersion(engineVersion: String)

    public fun hostInstanceType(hostInstanceType: String)

    public fun ldapServerMetadata(ldapServerMetadata: IResolvable)

    public fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8209a5f89dc3449517df516b1711d1e93167f576dd6a9ad193a99f85c3a798dc")
    public
        fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty.Builder.() -> Unit)

    public fun logs(logs: IResolvable)

    public fun logs(logs: CfnBroker.LogListProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583aa0b11ed80ce308a7d1c1e77cc8f3475d9fab9bc7314e88dceaa35f380732")
    public fun logs(logs: CfnBroker.LogListProperty.Builder.() -> Unit)

    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable)

    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4775557514f76715252b70f99f62eccfcb6ce3a2e123da23734082bccd31de11")
    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun storageType(storageType: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnBroker.TagsEntryProperty>)

    public fun tags(vararg tags: CfnBroker.TagsEntryProperty)

    public fun users(users: IResolvable)

    public fun users(users: List<Any>)

    public fun users(vararg users: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnBrokerProps.builder()

    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun brokerName(brokerName: String) {
      cdkBuilder.brokerName(brokerName)
    }

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnBroker.ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(CfnBroker.ConfigurationIdProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85ce35c3dd8412acbc332227ff1ec05a2793e0f89faf903727e0bd38df04be63")
    override fun configuration(configuration: CfnBroker.ConfigurationIdProperty.Builder.() -> Unit):
        Unit = configuration(CfnBroker.ConfigurationIdProperty(configuration))

    override fun dataReplicationMode(dataReplicationMode: String) {
      cdkBuilder.dataReplicationMode(dataReplicationMode)
    }

    override fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String) {
      cdkBuilder.dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn)
    }

    override fun deploymentMode(deploymentMode: String) {
      cdkBuilder.deploymentMode(deploymentMode)
    }

    override fun encryptionOptions(encryptionOptions: IResolvable) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(IResolvable::unwrap))
    }

    override fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(CfnBroker.EncryptionOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed587c05f8c37ed89ca566d62bf019ebe88fc92d4829241d18f9161c9015b8c0")
    override
        fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit):
        Unit = encryptionOptions(CfnBroker.EncryptionOptionsProperty(encryptionOptions))

    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun hostInstanceType(hostInstanceType: String) {
      cdkBuilder.hostInstanceType(hostInstanceType)
    }

    override fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(IResolvable::unwrap))
    }

    override fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(CfnBroker.LdapServerMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8209a5f89dc3449517df516b1711d1e93167f576dd6a9ad193a99f85c3a798dc")
    override
        fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty.Builder.() -> Unit):
        Unit = ldapServerMetadata(CfnBroker.LdapServerMetadataProperty(ldapServerMetadata))

    override fun logs(logs: IResolvable) {
      cdkBuilder.logs(logs.let(IResolvable::unwrap))
    }

    override fun logs(logs: CfnBroker.LogListProperty) {
      cdkBuilder.logs(logs.let(CfnBroker.LogListProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583aa0b11ed80ce308a7d1c1e77cc8f3475d9fab9bc7314e88dceaa35f380732")
    override fun logs(logs: CfnBroker.LogListProperty.Builder.() -> Unit): Unit =
        logs(CfnBroker.LogListProperty(logs))

    override fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(IResolvable::unwrap))
    }

    override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(CfnBroker.MaintenanceWindowProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4775557514f76715252b70f99f62eccfcb6ce3a2e123da23734082bccd31de11")
    override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit):
        Unit =
        maintenanceWindowStartTime(CfnBroker.MaintenanceWindowProperty(maintenanceWindowStartTime))

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnBroker.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnBroker.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnBroker.TagsEntryProperty): Unit = tags(tags.toList())

    override fun users(users: IResolvable) {
      cdkBuilder.users(users.let(IResolvable::unwrap))
    }

    override fun users(users: List<Any>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: Any): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnBrokerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBrokerProps,
  ) : CdkObject(cdkObject), CfnBrokerProps {
    override fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

    override fun autoMinorVersionUpgrade(): Any = unwrap(this).getAutoMinorVersionUpgrade()

    override fun brokerName(): String = unwrap(this).getBrokerName()

    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

    override fun dataReplicationPrimaryBrokerArn(): String? =
        unwrap(this).getDataReplicationPrimaryBrokerArn()

    override fun deploymentMode(): String = unwrap(this).getDeploymentMode()

    override fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    override fun hostInstanceType(): String = unwrap(this).getHostInstanceType()

    override fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

    override fun logs(): Any? = unwrap(this).getLogs()

    override fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

    override fun publiclyAccessible(): Any = unwrap(this).getPubliclyAccessible()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun storageType(): String? = unwrap(this).getStorageType()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnBroker.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnBroker.TagsEntryProperty::wrap) ?: emptyList()

    override fun users(): Any = unwrap(this).getUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBrokerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBrokerProps):
        CfnBrokerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBrokerProps):
        software.amazon.awscdk.services.amazonmq.CfnBrokerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.amazonmq.CfnBrokerProps
  }
}
