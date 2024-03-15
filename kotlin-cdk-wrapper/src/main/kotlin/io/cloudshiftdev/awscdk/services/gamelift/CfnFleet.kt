@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet,
) : CfnResource(cdkObject), IInspectable {
  public open fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

  public open fun anywhereConfiguration(`value`: IResolvable) {
    unwrap(this).setAnywhereConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty) {
    unwrap(this).setAnywhereConfiguration(`value`.let(AnywhereConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3aaecba63b51f1ca2dbb498f0ba4045d16345fe44a17a948e144d8540985afa8")
  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty.Builder.() -> Unit):
      Unit = anywhereConfiguration(AnywhereConfigurationProperty(`value`))

  public open fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

  public open fun applyCapacity(`value`: String) {
    unwrap(this).setApplyCapacity(`value`)
  }

  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  public open fun buildId(): String? = unwrap(this).getBuildId()

  public open fun buildId(`value`: String) {
    unwrap(this).setBuildId(`value`)
  }

  public open fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

  public open fun certificateConfiguration(`value`: IResolvable) {
    unwrap(this).setCertificateConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun certificateConfiguration(`value`: CertificateConfigurationProperty) {
    unwrap(this).setCertificateConfiguration(`value`.let(CertificateConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("319b28c07acf889cfcadea422d5c26529c6dd665089cedfad34223ba8c99ceda")
  public open
      fun certificateConfiguration(`value`: CertificateConfigurationProperty.Builder.() -> Unit):
      Unit = certificateConfiguration(CertificateConfigurationProperty(`value`))

  public open fun computeType(): String? = unwrap(this).getComputeType()

  public open fun computeType(`value`: String) {
    unwrap(this).setComputeType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

  public open fun desiredEc2Instances(`value`: Number) {
    unwrap(this).setDesiredEc2Instances(`value`)
  }

  public open fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

  public open fun ec2InboundPermissions(`value`: IResolvable) {
    unwrap(this).setEc2InboundPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun ec2InboundPermissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setEc2InboundPermissions(__idx_ac66f0)
  }

  public open fun ec2InboundPermissions(vararg __idx_ac66f0: Any): Unit =
      ec2InboundPermissions(__idx_ac66f0.toList())

  public open fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

  public open fun ec2InstanceType(`value`: String) {
    unwrap(this).setEc2InstanceType(`value`)
  }

  public open fun fleetType(): String? = unwrap(this).getFleetType()

  public open fun fleetType(`value`: String) {
    unwrap(this).setFleetType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  public open fun instanceRoleArn(`value`: String) {
    unwrap(this).setInstanceRoleArn(`value`)
  }

  public open fun instanceRoleCredentialsProvider(): String? =
      unwrap(this).getInstanceRoleCredentialsProvider()

  public open fun instanceRoleCredentialsProvider(`value`: String) {
    unwrap(this).setInstanceRoleCredentialsProvider(`value`)
  }

  public open fun locations(): Any? = unwrap(this).getLocations()

  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable::unwrap))
  }

  public open fun locations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocations(__idx_ac66f0)
  }

  public open fun locations(vararg __idx_ac66f0: Any): Unit = locations(__idx_ac66f0.toList())

  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(`value`: List<String>) {
    unwrap(this).setLogPaths(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(vararg `value`: String): Unit = logPaths(`value`.toList())

  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  public open fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

  public open fun metricGroups(`value`: List<String>) {
    unwrap(this).setMetricGroups(`value`)
  }

  public open fun metricGroups(vararg `value`: String): Unit = metricGroups(`value`.toList())

  public open fun minSize(): Number? = unwrap(this).getMinSize()

  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  public open fun newGameSessionProtectionPolicy(`value`: String) {
    unwrap(this).setNewGameSessionProtectionPolicy(`value`)
  }

  public open fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

  public open fun peerVpcAwsAccountId(`value`: String) {
    unwrap(this).setPeerVpcAwsAccountId(`value`)
  }

  public open fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

  public open fun peerVpcId(`value`: String) {
    unwrap(this).setPeerVpcId(`value`)
  }

  public open fun resourceCreationLimitPolicy(): Any? =
      unwrap(this).getResourceCreationLimitPolicy()

  public open fun resourceCreationLimitPolicy(`value`: IResolvable) {
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceCreationLimitPolicy(`value`: ResourceCreationLimitPolicyProperty) {
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(ResourceCreationLimitPolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7041eef8c71d79be352f6ecfb03735949670f7522fb3ebcec844b60b20889fb4")
  public open
      fun resourceCreationLimitPolicy(`value`: ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
      Unit = resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty(`value`))

  public open fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  public open fun runtimeConfiguration(`value`: IResolvable) {
    unwrap(this).setRuntimeConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimeConfiguration(`value`: RuntimeConfigurationProperty) {
    unwrap(this).setRuntimeConfiguration(`value`.let(RuntimeConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ba44b8b597ac96e666a90a90473f18c03dbb2f22badf442740b8a4606b46df5")
  public open fun runtimeConfiguration(`value`: RuntimeConfigurationProperty.Builder.() -> Unit):
      Unit = runtimeConfiguration(RuntimeConfigurationProperty(`value`))

  public open fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  public open fun scalingPolicies(`value`: IResolvable) {
    unwrap(this).setScalingPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun scalingPolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setScalingPolicies(__idx_ac66f0)
  }

  public open fun scalingPolicies(vararg __idx_ac66f0: Any): Unit =
      scalingPolicies(__idx_ac66f0.toList())

  public open fun scriptId(): String? = unwrap(this).getScriptId()

  public open fun scriptId(`value`: String) {
    unwrap(this).setScriptId(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchParameters(`value`: String) {
    unwrap(this).setServerLaunchParameters(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()

  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchPath(`value`: String) {
    unwrap(this).setServerLaunchPath(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable)

    public fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    public
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit)

    public fun applyCapacity(applyCapacity: String)

    public fun buildId(buildId: String)

    public fun certificateConfiguration(certificateConfiguration: IResolvable)

    public fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    public
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit)

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
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a16622527c205d3f8f7e8bf9ba63ad02b40fec4c20212321e8fda075d93f553f")
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty.Builder.() -> Unit)

    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

    public fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0627cf5d1239128484c5e236ab999e30df9307e33f611a0bc163bf3a7b6d62d")
    public
        fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty.Builder.() -> Unit)

    public fun scalingPolicies(scalingPolicies: IResolvable)

    public fun scalingPolicies(scalingPolicies: List<Any>)

    public fun scalingPolicies(vararg scalingPolicies: Any)

    public fun scriptId(scriptId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchParameters(serverLaunchParameters: String)

    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchPath(serverLaunchPath: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnFleet.Builder =
        software.amazon.awscdk.services.gamelift.CfnFleet.Builder.create(scope, id)

    override fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(IResolvable::unwrap))
    }

    override fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(AnywhereConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    override
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit):
        Unit = anywhereConfiguration(AnywhereConfigurationProperty(anywhereConfiguration))

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
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(CertificateConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    override
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit):
        Unit = certificateConfiguration(CertificateConfigurationProperty(certificateConfiguration))

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
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(ResourceCreationLimitPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a16622527c205d3f8f7e8bf9ba63ad02b40fec4c20212321e8fda075d93f553f")
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty(resourceCreationLimitPolicy))

    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
    }

    override fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(RuntimeConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0627cf5d1239128484c5e236ab999e30df9307e33f611a0bc163bf3a7b6d62d")
    override
        fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty.Builder.() -> Unit):
        Unit = runtimeConfiguration(RuntimeConfigurationProperty(runtimeConfiguration))

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

    public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.gamelift.CfnFleet =
        wrapped.cdkObject
  }

  public interface TargetConfigurationProperty {
    public fun targetValue(): Number

    @CdkDslMarker
    public interface Builder {
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty.builder()

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty,
    ) : CdkObject(cdkObject), TargetConfigurationProperty {
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty):
          TargetConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty
    }
  }

  public interface AnywhereConfigurationProperty {
    public fun cost(): String

    @CdkDslMarker
    public interface Builder {
      public fun cost(cost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.builder()

      override fun cost(cost: String) {
        cdkBuilder.cost(cost)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty,
    ) : CdkObject(cdkObject), AnywhereConfigurationProperty {
      override fun cost(): String = unwrap(this).getCost()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnywhereConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty):
          AnywhereConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnywhereConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty
    }
  }

  public interface IpPermissionProperty {
    public fun fromPort(): Number

    public fun ipRange(): String

    public fun protocol(): String

    public fun toPort(): Number

    @CdkDslMarker
    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun ipRange(ipRange: String)

      public fun protocol(protocol: String)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun ipRange(ipRange: String) {
        cdkBuilder.ipRange(ipRange)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty,
    ) : CdkObject(cdkObject), IpPermissionProperty {
      override fun fromPort(): Number = unwrap(this).getFromPort()

      override fun ipRange(): String = unwrap(this).getIpRange()

      override fun protocol(): String = unwrap(this).getProtocol()

      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpPermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty):
          IpPermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpPermissionProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty
    }
  }

  public interface ResourceCreationLimitPolicyProperty {
    public fun newGameSessionsPerCreator(): Number? = unwrap(this).getNewGameSessionsPerCreator()

    public fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()

    @CdkDslMarker
    public interface Builder {
      public fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number)

      public fun policyPeriodInMinutes(policyPeriodInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty.builder()

      override fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number) {
        cdkBuilder.newGameSessionsPerCreator(newGameSessionsPerCreator)
      }

      override fun policyPeriodInMinutes(policyPeriodInMinutes: Number) {
        cdkBuilder.policyPeriodInMinutes(policyPeriodInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty,
    ) : CdkObject(cdkObject), ResourceCreationLimitPolicyProperty {
      override fun newGameSessionsPerCreator(): Number? =
          unwrap(this).getNewGameSessionsPerCreator()

      override fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceCreationLimitPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty):
          ResourceCreationLimitPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCreationLimitPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty
    }
  }

  public interface LocationConfigurationProperty {
    public fun location(): String

    public fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun location(location: String)

      public fun locationCapacity(locationCapacity: IResolvable)

      public fun locationCapacity(locationCapacity: LocationCapacityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      public fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.builder()

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity.let(IResolvable::unwrap))
      }

      override fun locationCapacity(locationCapacity: LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity.let(LocationCapacityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      override fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit):
          Unit = locationCapacity(LocationCapacityProperty(locationCapacity))

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty,
    ) : CdkObject(cdkObject), LocationConfigurationProperty {
      override fun location(): String = unwrap(this).getLocation()

      override fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty):
          LocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty
    }
  }

  public interface ServerProcessProperty {
    public fun concurrentExecutions(): Number

    public fun launchPath(): String

    public fun parameters(): String? = unwrap(this).getParameters()

    @CdkDslMarker
    public interface Builder {
      public fun concurrentExecutions(concurrentExecutions: Number)

      public fun launchPath(launchPath: String)

      public fun parameters(parameters: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.builder()

      override fun concurrentExecutions(concurrentExecutions: Number) {
        cdkBuilder.concurrentExecutions(concurrentExecutions)
      }

      override fun launchPath(launchPath: String) {
        cdkBuilder.launchPath(launchPath)
      }

      override fun parameters(parameters: String) {
        cdkBuilder.parameters(parameters)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty,
    ) : CdkObject(cdkObject), ServerProcessProperty {
      override fun concurrentExecutions(): Number = unwrap(this).getConcurrentExecutions()

      override fun launchPath(): String = unwrap(this).getLaunchPath()

      override fun parameters(): String? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerProcessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty):
          ServerProcessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerProcessProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty
    }
  }

  public interface RuntimeConfigurationProperty {
    public fun gameSessionActivationTimeoutSeconds(): Number? =
        unwrap(this).getGameSessionActivationTimeoutSeconds()

    public fun maxConcurrentGameSessionActivations(): Number? =
        unwrap(this).getMaxConcurrentGameSessionActivations()

    public fun serverProcesses(): Any? = unwrap(this).getServerProcesses()

    @CdkDslMarker
    public interface Builder {
      public fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number)

      public fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number)

      public fun serverProcesses(serverProcesses: IResolvable)

      public fun serverProcesses(serverProcesses: List<Any>)

      public fun serverProcesses(vararg serverProcesses: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty.builder()

      override
          fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number) {
        cdkBuilder.gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds)
      }

      override
          fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number) {
        cdkBuilder.maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations)
      }

      override fun serverProcesses(serverProcesses: IResolvable) {
        cdkBuilder.serverProcesses(serverProcesses.let(IResolvable::unwrap))
      }

      override fun serverProcesses(serverProcesses: List<Any>) {
        cdkBuilder.serverProcesses(serverProcesses)
      }

      override fun serverProcesses(vararg serverProcesses: Any): Unit =
          serverProcesses(serverProcesses.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty,
    ) : CdkObject(cdkObject), RuntimeConfigurationProperty {
      override fun gameSessionActivationTimeoutSeconds(): Number? =
          unwrap(this).getGameSessionActivationTimeoutSeconds()

      override fun maxConcurrentGameSessionActivations(): Number? =
          unwrap(this).getMaxConcurrentGameSessionActivations()

      override fun serverProcesses(): Any? = unwrap(this).getServerProcesses()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty):
          RuntimeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty
    }
  }

  public interface LocationCapacityProperty {
    public fun desiredEc2Instances(): Number

    public fun maxSize(): Number

    public fun minSize(): Number

    @CdkDslMarker
    public interface Builder {
      public fun desiredEc2Instances(desiredEc2Instances: Number)

      public fun maxSize(maxSize: Number)

      public fun minSize(minSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.builder()

      override fun desiredEc2Instances(desiredEc2Instances: Number) {
        cdkBuilder.desiredEc2Instances(desiredEc2Instances)
      }

      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      override fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty,
    ) : CdkObject(cdkObject), LocationCapacityProperty {
      override fun desiredEc2Instances(): Number = unwrap(this).getDesiredEc2Instances()

      override fun maxSize(): Number = unwrap(this).getMaxSize()

      override fun minSize(): Number = unwrap(this).getMinSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty):
          LocationCapacityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationCapacityProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty
    }
  }

  public interface ScalingPolicyProperty {
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    public fun location(): String? = unwrap(this).getLocation()

    public fun metricName(): String

    public fun name(): String

    public fun policyType(): String? = unwrap(this).getPolicyType()

    public fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

    public fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

    public fun status(): String? = unwrap(this).getStatus()

    public fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

    public fun threshold(): Number? = unwrap(this).getThreshold()

    public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

    @CdkDslMarker
    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun evaluationPeriods(evaluationPeriods: Number)

      public fun location(location: String)

      public fun metricName(metricName: String)

      public fun name(name: String)

      public fun policyType(policyType: String)

      public fun scalingAdjustment(scalingAdjustment: Number)

      public fun scalingAdjustmentType(scalingAdjustmentType: String)

      public fun status(status: String)

      public fun targetConfiguration(targetConfiguration: IResolvable)

      public fun targetConfiguration(targetConfiguration: TargetConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b0b337b57e3a5a24e7cb4418ee3663db31c914108fb66054b6598bc2c749e8")
      public
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit)

      public fun threshold(threshold: Number)

      public fun updateStatus(updateStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      override fun scalingAdjustmentType(scalingAdjustmentType: String) {
        cdkBuilder.scalingAdjustmentType(scalingAdjustmentType)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun targetConfiguration(targetConfiguration: IResolvable) {
        cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable::unwrap))
      }

      override fun targetConfiguration(targetConfiguration: TargetConfigurationProperty) {
        cdkBuilder.targetConfiguration(targetConfiguration.let(TargetConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b0b337b57e3a5a24e7cb4418ee3663db31c914108fb66054b6598bc2c749e8")
      override
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit):
          Unit = targetConfiguration(TargetConfigurationProperty(targetConfiguration))

      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      override fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty,
    ) : CdkObject(cdkObject), ScalingPolicyProperty {
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      override fun location(): String? = unwrap(this).getLocation()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun name(): String = unwrap(this).getName()

      override fun policyType(): String? = unwrap(this).getPolicyType()

      override fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

      override fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

      override fun status(): String? = unwrap(this).getStatus()

      override fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

      override fun threshold(): Number? = unwrap(this).getThreshold()

      override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty):
          ScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty
    }
  }

  public interface CertificateConfigurationProperty {
    public fun certificateType(): String

    @CdkDslMarker
    public interface Builder {
      public fun certificateType(certificateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty.builder()

      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty,
    ) : CdkObject(cdkObject), CertificateConfigurationProperty {
      override fun certificateType(): String = unwrap(this).getCertificateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty):
          CertificateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty
    }
  }
}
