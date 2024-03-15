@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFleetProps {
  public fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

  public fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

  public fun buildId(): String? = unwrap(this).getBuildId()

  public fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

  public fun computeType(): String? = unwrap(this).getComputeType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

  public fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

  public fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

  public fun fleetType(): String? = unwrap(this).getFleetType()

  public fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  public fun instanceRoleCredentialsProvider(): String? =
      unwrap(this).getInstanceRoleCredentialsProvider()

  public fun locations(): Any? = unwrap(this).getLocations()

  @Deprecated(message = "deprecated in CDK")
  public fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  public fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun name(): String

  public fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  public fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

  public fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

  public fun resourceCreationLimitPolicy(): Any? = unwrap(this).getResourceCreationLimitPolicy()

  public fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  public fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  public fun scriptId(): String? = unwrap(this).getScriptId()

  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()

  @CdkDslMarker
  public interface Builder {
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable)

    public fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a57775121bfaabdc7dbc0bf4d1a90036fc861b8f222bff3268b7aa4e48687e1b")
    public
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty.Builder.() -> Unit)

    public fun applyCapacity(applyCapacity: String)

    public fun buildId(buildId: String)

    public fun certificateConfiguration(certificateConfiguration: IResolvable)

    public
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68f956d2a0b252401d8b1858f9cecdd3f547c4ce8139f787bf3892ffd176baab")
    public
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty.Builder.() -> Unit)

    public fun computeType(computeType: String)

    public fun description(description: String)

    public fun desiredEc2Instances(desiredEc2Instances: Number)

    public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable)

    public fun ec2InboundPermissions(ec2InboundPermissions: List<Any>)

    public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any)

    public fun ec2InstanceType(ec2InstanceType: String)

    public fun fleetType(fleetType: String)

    public fun instanceRoleArn(instanceRoleArn: String)

    public fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String)

    public fun locations(locations: IResolvable)

    public fun locations(locations: List<Any>)

    public fun locations(vararg locations: Any)

    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(logPaths: List<String>)

    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(vararg logPaths: String)

    public fun maxSize(maxSize: Number)

    public fun metricGroups(metricGroups: List<String>)

    public fun metricGroups(vararg metricGroups: String)

    public fun minSize(minSize: Number)

    public fun name(name: String)

    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String)

    public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String)

    public fun peerVpcId(peerVpcId: String)

    public fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable)

    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a4eb3da77f618986dbe788068f6534b94253a7ff3b4fe723a9343721f93f947")
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty.Builder.() -> Unit)

    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

    public fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c38cb393fece61cac243bc64d503ea4bcff0c7c0bfce608a61b496e334374d6")
    public
        fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit)

    public fun scalingPolicies(scalingPolicies: IResolvable)

    public fun scalingPolicies(scalingPolicies: List<Any>)

    public fun scalingPolicies(vararg scalingPolicies: Any)

    public fun scriptId(scriptId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchParameters(serverLaunchParameters: String)

    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchPath(serverLaunchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnFleetProps.builder()

    override fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(IResolvable::unwrap))
    }

    override
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(CfnFleet.AnywhereConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a57775121bfaabdc7dbc0bf4d1a90036fc861b8f222bff3268b7aa4e48687e1b")
    override
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty.Builder.() -> Unit):
        Unit = anywhereConfiguration(CfnFleet.AnywhereConfigurationProperty(anywhereConfiguration))

    override fun applyCapacity(applyCapacity: String) {
      cdkBuilder.applyCapacity(applyCapacity)
    }

    override fun buildId(buildId: String) {
      cdkBuilder.buildId(buildId)
    }

    override fun certificateConfiguration(certificateConfiguration: IResolvable) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(IResolvable::unwrap))
    }

    override
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(CfnFleet.CertificateConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68f956d2a0b252401d8b1858f9cecdd3f547c4ce8139f787bf3892ffd176baab")
    override
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty.Builder.() -> Unit):
        Unit =
        certificateConfiguration(CfnFleet.CertificateConfigurationProperty(certificateConfiguration))

    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun desiredEc2Instances(desiredEc2Instances: Number) {
      cdkBuilder.desiredEc2Instances(desiredEc2Instances)
    }

    override fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions.let(IResolvable::unwrap))
    }

    override fun ec2InboundPermissions(ec2InboundPermissions: List<Any>) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions)
    }

    override fun ec2InboundPermissions(vararg ec2InboundPermissions: Any): Unit =
        ec2InboundPermissions(ec2InboundPermissions.toList())

    override fun ec2InstanceType(ec2InstanceType: String) {
      cdkBuilder.ec2InstanceType(ec2InstanceType)
    }

    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    override fun instanceRoleArn(instanceRoleArn: String) {
      cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    override fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String) {
      cdkBuilder.instanceRoleCredentialsProvider(instanceRoleCredentialsProvider)
    }

    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
    }

    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
    }

    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(logPaths: List<String>) {
      cdkBuilder.logPaths(logPaths)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(vararg logPaths: String): Unit = logPaths(logPaths.toList())

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun metricGroups(metricGroups: List<String>) {
      cdkBuilder.metricGroups(metricGroups)
    }

    override fun metricGroups(vararg metricGroups: String): Unit =
        metricGroups(metricGroups.toList())

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
      cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    override fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
      cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
    }

    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    override fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(IResolvable::unwrap))
    }

    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(CfnFleet.ResourceCreationLimitPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a4eb3da77f618986dbe788068f6534b94253a7ff3b4fe723a9343721f93f947")
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        resourceCreationLimitPolicy(CfnFleet.ResourceCreationLimitPolicyProperty(resourceCreationLimitPolicy))

    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
    }

    override fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(CfnFleet.RuntimeConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c38cb393fece61cac243bc64d503ea4bcff0c7c0bfce608a61b496e334374d6")
    override
        fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit):
        Unit = runtimeConfiguration(CfnFleet.RuntimeConfigurationProperty(runtimeConfiguration))

    override fun scalingPolicies(scalingPolicies: IResolvable) {
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable::unwrap))
    }

    override fun scalingPolicies(scalingPolicies: List<Any>) {
      cdkBuilder.scalingPolicies(scalingPolicies)
    }

    override fun scalingPolicies(vararg scalingPolicies: Any): Unit =
        scalingPolicies(scalingPolicies.toList())

    override fun scriptId(scriptId: String) {
      cdkBuilder.scriptId(scriptId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchParameters(serverLaunchParameters: String) {
      cdkBuilder.serverLaunchParameters(serverLaunchParameters)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchPath(serverLaunchPath: String) {
      cdkBuilder.serverLaunchPath(serverLaunchPath)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnFleetProps,
  ) : CdkObject(cdkObject), CfnFleetProps {
    override fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

    override fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

    override fun buildId(): String? = unwrap(this).getBuildId()

    override fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

    override fun computeType(): String? = unwrap(this).getComputeType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

    override fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

    override fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

    override fun fleetType(): String? = unwrap(this).getFleetType()

    override fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

    override fun instanceRoleCredentialsProvider(): String? =
        unwrap(this).getInstanceRoleCredentialsProvider()

    override fun locations(): Any? = unwrap(this).getLocations()

    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    override fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun name(): String = unwrap(this).getName()

    override fun newGameSessionProtectionPolicy(): String? =
        unwrap(this).getNewGameSessionProtectionPolicy()

    override fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

    override fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

    override fun resourceCreationLimitPolicy(): Any? = unwrap(this).getResourceCreationLimitPolicy()

    override fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

    override fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

    override fun scriptId(): String? = unwrap(this).getScriptId()

    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleetProps):
        CfnFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.gamelift.CfnFleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnFleetProps
  }
}
