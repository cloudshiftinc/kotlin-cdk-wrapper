package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface InstanceProps {
  public fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

  public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun deleteAutomatedBackups(): Boolean? = unwrap(this).getDeleteAutomatedBackups()

  public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun performanceInsightEncryptionKey(): IKey? =
      unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

  public fun performanceInsightRetention(): PerformanceInsightRetention? =
      unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
    }

    public fun parameters(parameters: Map<String, String>) {
    }

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
    }

    public
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06f29cc1e421b47afc48b17869ce6a6a175e083e14694e74c2e89c878ef0fa55")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceProps.Builder =
        software.amazon.awscdk.services.rds.InstanceProps.builder()

    public override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    public override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    public override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
      cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey.let(IKey::unwrap))
    }

    public override
        fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
      cdkBuilder.performanceInsightRetention(performanceInsightRetention.let(PerformanceInsightRetention::unwrap))
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06f29cc1e421b47afc48b17869ce6a6a175e083e14694e74c2e89c878ef0fa55")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.InstanceProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.InstanceProps,
  ) : InstanceProps {
    public override fun allowMajorVersionUpgrade(): Boolean? =
        unwrap(this).getAllowMajorVersionUpgrade()

    public override fun autoMinorVersionUpgrade(): Boolean? =
        unwrap(this).getAutoMinorVersionUpgrade()

    public override fun deleteAutomatedBackups(): Boolean? =
        unwrap(this).getDeleteAutomatedBackups()

    public override fun enablePerformanceInsights(): Boolean? =
        unwrap(this).getEnablePerformanceInsights()

    public override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    public override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    public override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?:
        emptyMap()

    public override fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    public override fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    public override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    public override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    public override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceProps): InstanceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceProps): software.amazon.awscdk.services.rds.InstanceProps =
        (wrapped as Wrapper).cdkObject
  }
}
