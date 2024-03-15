@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ServerlessClusterFromSnapshotProps {
  public fun backupRetention(): Duration? = unwrap(this).getBackupRetention()?.let(Duration::wrap)

  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

  public fun credentials(): SnapshotCredentials? =
      unwrap(this).getCredentials()?.let(SnapshotCredentials::wrap)

  public fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

  public fun engine(): IClusterEngine

  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun scaling(): ServerlessScalingOptions? =
      unwrap(this).getScaling()?.let(ServerlessScalingOptions::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun snapshotIdentifier(): String

  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun backupRetention(backupRetention: Duration)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun credentials(credentials: SnapshotCredentials)

    public fun defaultDatabaseName(defaultDatabaseName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun enableDataApi(enableDataApi: Boolean)

    public fun engine(engine: IClusterEngine)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun scaling(scaling: ServerlessScalingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f532dd0bd4a1ac00a248aff28d8fcdbfe1c0a4c17a25b61412da9197890b9aa3")
    public fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun subnetGroup(subnetGroup: ISubnetGroup)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26ecb36b2048091ced66bb02cacfc2424ded144d47168c2025232faf49a2c64a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps.Builder =
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps.builder()

    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun credentials(credentials: SnapshotCredentials) {
      cdkBuilder.credentials(credentials.let(SnapshotCredentials::unwrap))
    }

    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun scaling(scaling: ServerlessScalingOptions) {
      cdkBuilder.scaling(scaling.let(ServerlessScalingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f532dd0bd4a1ac00a248aff28d8fcdbfe1c0a4c17a25b61412da9197890b9aa3")
    override fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit): Unit =
        scaling(ServerlessScalingOptions(scaling))

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26ecb36b2048091ced66bb02cacfc2424ded144d47168c2025232faf49a2c64a")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps,
  ) : CdkObject(cdkObject), ServerlessClusterFromSnapshotProps {
    override fun backupRetention(): Duration? =
        unwrap(this).getBackupRetention()?.let(Duration::wrap)

    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

    override fun credentials(): SnapshotCredentials? =
        unwrap(this).getCredentials()?.let(SnapshotCredentials::wrap)

    override fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

    override fun engine(): IClusterEngine = unwrap(this).getEngine().let(IClusterEngine::wrap)

    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun scaling(): ServerlessScalingOptions? =
        unwrap(this).getScaling()?.let(ServerlessScalingOptions::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun snapshotIdentifier(): String = unwrap(this).getSnapshotIdentifier()

    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessClusterFromSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps):
        ServerlessClusterFromSnapshotProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessClusterFromSnapshotProps):
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
  }
}
