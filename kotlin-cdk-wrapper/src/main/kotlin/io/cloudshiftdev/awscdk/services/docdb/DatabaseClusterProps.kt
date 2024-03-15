@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DatabaseClusterProps {
  public fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

  public fun cloudWatchLogsRetention(): RetentionDays? =
      unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

  public fun cloudWatchLogsRetentionRole(): IRole? =
      unwrap(this).getCloudWatchLogsRetentionRole()?.let(IRole::wrap)

  public fun dbClusterName(): String? = unwrap(this).getDbClusterName()

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun exportAuditLogsToCloudWatch(): Boolean? = unwrap(this).getExportAuditLogsToCloudWatch()

  public fun exportProfilerLogsToCloudWatch(): Boolean? =
      unwrap(this).getExportProfilerLogsToCloudWatch()

  public fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

  public fun instanceRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getInstanceRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun instanceType(): InstanceType

  public fun instances(): Number? = unwrap(this).getInstances()

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun masterUser(): Login

  public fun parameterGroup(): IClusterParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IClusterParameterGroup::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun securityGroupRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getSecurityGroupRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun backup(backup: BackupProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("058a57ed0bc87d0dc99dc6c7ef3958fcae11e18166396fa80e8358d505258030")
    public fun backup(backup: BackupProps.Builder.() -> Unit)

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole)

    public fun dbClusterName(dbClusterName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun engineVersion(engineVersion: String)

    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean)

    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean)

    public fun instanceIdentifierBase(instanceIdentifierBase: String)

    public fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy)

    public fun instanceType(instanceType: InstanceType)

    public fun instances(instances: Number)

    public fun kmsKey(kmsKey: IKey)

    public fun masterUser(masterUser: Login)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2891ec69f3e1d624106e7951889a2b980809f9a425d251ade50a7502a9cdf61")
    public fun masterUser(masterUser: Login.Builder.() -> Unit)

    public fun parameterGroup(parameterGroup: IClusterParameterGroup)

    public fun port(port: Number)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0401c178c76eb75037a815f98ed065d453ef676ff25836bd8741bb5247281f11")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseClusterProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseClusterProps.builder()

    override fun backup(backup: BackupProps) {
      cdkBuilder.backup(backup.let(BackupProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("058a57ed0bc87d0dc99dc6c7ef3958fcae11e18166396fa80e8358d505258030")
    override fun backup(backup: BackupProps.Builder.() -> Unit): Unit = backup(BackupProps(backup))

    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
      cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole.let(IRole::unwrap))
    }

    override fun dbClusterName(dbClusterName: String) {
      cdkBuilder.dbClusterName(dbClusterName)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
      cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    override fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
      cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    override fun instanceIdentifierBase(instanceIdentifierBase: String) {
      cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    override fun instanceRemovalPolicy(instanceRemovalPolicy: RemovalPolicy) {
      cdkBuilder.instanceRemovalPolicy(instanceRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun instances(instances: Number) {
      cdkBuilder.instances(instances)
    }

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun masterUser(masterUser: Login) {
      cdkBuilder.masterUser(masterUser.let(Login::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2891ec69f3e1d624106e7951889a2b980809f9a425d251ade50a7502a9cdf61")
    override fun masterUser(masterUser: Login.Builder.() -> Unit): Unit =
        masterUser(Login(masterUser))

    override fun parameterGroup(parameterGroup: IClusterParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IClusterParameterGroup::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun securityGroupRemovalPolicy(securityGroupRemovalPolicy: RemovalPolicy) {
      cdkBuilder.securityGroupRemovalPolicy(securityGroupRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0401c178c76eb75037a815f98ed065d453ef676ff25836bd8741bb5247281f11")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterProps,
  ) : CdkObject(cdkObject), DatabaseClusterProps {
    override fun backup(): BackupProps? = unwrap(this).getBackup()?.let(BackupProps::wrap)

    override fun cloudWatchLogsRetention(): RetentionDays? =
        unwrap(this).getCloudWatchLogsRetention()?.let(RetentionDays::wrap)

    override fun cloudWatchLogsRetentionRole(): IRole? =
        unwrap(this).getCloudWatchLogsRetentionRole()?.let(IRole::wrap)

    override fun dbClusterName(): String? = unwrap(this).getDbClusterName()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun exportAuditLogsToCloudWatch(): Boolean? =
        unwrap(this).getExportAuditLogsToCloudWatch()

    override fun exportProfilerLogsToCloudWatch(): Boolean? =
        unwrap(this).getExportProfilerLogsToCloudWatch()

    override fun instanceIdentifierBase(): String? = unwrap(this).getInstanceIdentifierBase()

    override fun instanceRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getInstanceRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    override fun instances(): Number? = unwrap(this).getInstances()

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun masterUser(): Login = unwrap(this).getMasterUser().let(Login::wrap)

    override fun parameterGroup(): IClusterParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IClusterParameterGroup::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun securityGroupRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getSecurityGroupRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun storageEncrypted(): Boolean? = unwrap(this).getStorageEncrypted()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterProps):
        DatabaseClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterProps):
        software.amazon.awscdk.services.docdb.DatabaseClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.DatabaseClusterProps
  }
}
