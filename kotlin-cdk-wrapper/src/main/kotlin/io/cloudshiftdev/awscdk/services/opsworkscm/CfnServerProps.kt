@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworkscm

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

public interface CfnServerProps {
  public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  public fun backupId(): String? = unwrap(this).getBackupId()

  public fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

  public fun customCertificate(): String? = unwrap(this).getCustomCertificate()

  public fun customDomain(): String? = unwrap(this).getCustomDomain()

  public fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

  public fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

  public fun engineModel(): String? = unwrap(this).getEngineModel()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun instanceProfileArn(): String

  public fun instanceType(): String

  public fun keyPair(): String? = unwrap(this).getKeyPair()

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun serverName(): String? = unwrap(this).getServerName()

  public fun serviceRoleArn(): String

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

    public fun backupId(backupId: String)

    public fun backupRetentionCount(backupRetentionCount: Number)

    public fun customCertificate(customCertificate: String)

    public fun customDomain(customDomain: String)

    public fun customPrivateKey(customPrivateKey: String)

    public fun disableAutomatedBackup(disableAutomatedBackup: Boolean)

    public fun disableAutomatedBackup(disableAutomatedBackup: IResolvable)

    public fun engine(engine: String)

    public fun engineAttributes(engineAttributes: IResolvable)

    public fun engineAttributes(engineAttributes: List<Any>)

    public fun engineAttributes(vararg engineAttributes: Any)

    public fun engineModel(engineModel: String)

    public fun engineVersion(engineVersion: String)

    public fun instanceProfileArn(instanceProfileArn: String)

    public fun instanceType(instanceType: String)

    public fun keyPair(keyPair: String)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun serverName(serverName: String)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder =
        software.amazon.awscdk.services.opsworkscm.CfnServerProps.builder()

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    override fun backupRetentionCount(backupRetentionCount: Number) {
      cdkBuilder.backupRetentionCount(backupRetentionCount)
    }

    override fun customCertificate(customCertificate: String) {
      cdkBuilder.customCertificate(customCertificate)
    }

    override fun customDomain(customDomain: String) {
      cdkBuilder.customDomain(customDomain)
    }

    override fun customPrivateKey(customPrivateKey: String) {
      cdkBuilder.customPrivateKey(customPrivateKey)
    }

    override fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    override fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
      cdkBuilder.disableAutomatedBackup(disableAutomatedBackup.let(IResolvable::unwrap))
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineAttributes(engineAttributes: IResolvable) {
      cdkBuilder.engineAttributes(engineAttributes.let(IResolvable::unwrap))
    }

    override fun engineAttributes(engineAttributes: List<Any>) {
      cdkBuilder.engineAttributes(engineAttributes)
    }

    override fun engineAttributes(vararg engineAttributes: Any): Unit =
        engineAttributes(engineAttributes.toList())

    override fun engineModel(engineModel: String) {
      cdkBuilder.engineModel(engineModel)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.opsworkscm.CfnServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServerProps,
  ) : CdkObject(cdkObject), CfnServerProps {
    override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    override fun backupId(): String? = unwrap(this).getBackupId()

    override fun backupRetentionCount(): Number? = unwrap(this).getBackupRetentionCount()

    override fun customCertificate(): String? = unwrap(this).getCustomCertificate()

    override fun customDomain(): String? = unwrap(this).getCustomDomain()

    override fun customPrivateKey(): String? = unwrap(this).getCustomPrivateKey()

    override fun disableAutomatedBackup(): Any? = unwrap(this).getDisableAutomatedBackup()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun engineAttributes(): Any? = unwrap(this).getEngineAttributes()

    override fun engineModel(): String? = unwrap(this).getEngineModel()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun keyPair(): String? = unwrap(this).getKeyPair()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun serverName(): String? = unwrap(this).getServerName()

    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworkscm.CfnServerProps):
        CfnServerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerProps):
        software.amazon.awscdk.services.opsworkscm.CfnServerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.opsworkscm.CfnServerProps
  }
}
