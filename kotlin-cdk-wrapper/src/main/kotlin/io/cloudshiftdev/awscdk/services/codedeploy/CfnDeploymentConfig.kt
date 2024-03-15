@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeploymentConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

  public open fun computePlatform(`value`: String) {
    unwrap(this).setComputePlatform(`value`)
  }

  public open fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  public open fun deploymentConfigName(`value`: String) {
    unwrap(this).setDeploymentConfigName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

  public open fun minimumHealthyHosts(`value`: IResolvable) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(IResolvable::unwrap))
  }

  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(MinimumHealthyHostsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4c2b03df70ac5bf70aa2b05713337e53ec2648c4ac018e353ccf862f86ba8ef")
  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty.Builder.() -> Unit): Unit
      = minimumHealthyHosts(MinimumHealthyHostsProperty(`value`))

  public open fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

  public open fun trafficRoutingConfig(`value`: IResolvable) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(TrafficRoutingConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d964922def4bec56fa9cdc91c31b1b3b18c2104796e96ee04cc8ac02b6f4ca62")
  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty.Builder.() -> Unit):
      Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(`value`))

  public open fun zonalConfig(): Any? = unwrap(this).getZonalConfig()

  public open fun zonalConfig(`value`: IResolvable) {
    unwrap(this).setZonalConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun zonalConfig(`value`: ZonalConfigProperty) {
    unwrap(this).setZonalConfig(`value`.let(ZonalConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5ab885da9610db1d6963b24bdbfbc7779b060021c581adc938401cd8cd86ec2")
  public open fun zonalConfig(`value`: ZonalConfigProperty.Builder.() -> Unit): Unit =
      zonalConfig(ZonalConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun computePlatform(computePlatform: String)

    public fun deploymentConfigName(deploymentConfigName: String)

    public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable)

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    public
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit)

    public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable)

    public fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit)

    public fun zonalConfig(zonalConfig: IResolvable)

    public fun zonalConfig(zonalConfig: ZonalConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    public fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder.create(scope, id)

    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(IResolvable::unwrap))
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHostsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    override
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit):
        Unit = minimumHealthyHosts(MinimumHealthyHostsProperty(minimumHealthyHosts))

    override fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(IResolvable::unwrap))
    }

    override fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(TrafficRoutingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit):
        Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(trafficRoutingConfig))

    override fun zonalConfig(zonalConfig: IResolvable) {
      cdkBuilder.zonalConfig(zonalConfig.let(IResolvable::unwrap))
    }

    override fun zonalConfig(zonalConfig: ZonalConfigProperty) {
      cdkBuilder.zonalConfig(zonalConfig.let(ZonalConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    override fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfigProperty(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig):
        CfnDeploymentConfig = CfnDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig = wrapped.cdkObject
  }

  public interface ZonalConfigProperty {
    public fun firstZoneMonitorDurationInSeconds(): Number? =
        unwrap(this).getFirstZoneMonitorDurationInSeconds()

    public fun minimumHealthyHostsPerZone(): Any? = unwrap(this).getMinimumHealthyHostsPerZone()

    public fun monitorDurationInSeconds(): Number? = unwrap(this).getMonitorDurationInSeconds()

    @CdkDslMarker
    public interface Builder {
      public fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number)

      public fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable)

      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit)

      public fun monitorDurationInSeconds(monitorDurationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.builder()

      override fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number) {
        cdkBuilder.firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds)
      }

      override fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(IResolvable::unwrap))
      }

      override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(MinimumHealthyHostsPerZoneProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit):
          Unit =
          minimumHealthyHostsPerZone(MinimumHealthyHostsPerZoneProperty(minimumHealthyHostsPerZone))

      override fun monitorDurationInSeconds(monitorDurationInSeconds: Number) {
        cdkBuilder.monitorDurationInSeconds(monitorDurationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty,
    ) : CdkObject(cdkObject), ZonalConfigProperty {
      override fun firstZoneMonitorDurationInSeconds(): Number? =
          unwrap(this).getFirstZoneMonitorDurationInSeconds()

      override fun minimumHealthyHostsPerZone(): Any? = unwrap(this).getMinimumHealthyHostsPerZone()

      override fun monitorDurationInSeconds(): Number? = unwrap(this).getMonitorDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZonalConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty):
          ZonalConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZonalConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty
    }
  }

  public interface MinimumHealthyHostsProperty {
    public fun type(): String

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty,
    ) : CdkObject(cdkObject), MinimumHealthyHostsProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MinimumHealthyHostsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty):
          MinimumHealthyHostsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
    }
  }

  public interface MinimumHealthyHostsPerZoneProperty {
    public fun type(): String

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty,
    ) : CdkObject(cdkObject), MinimumHealthyHostsPerZoneProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MinimumHealthyHostsPerZoneProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty):
          MinimumHealthyHostsPerZoneProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsPerZoneProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
    }
  }

  public interface TrafficRoutingConfigProperty {
    public fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

    public fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun timeBasedCanary(timeBasedCanary: IResolvable)

      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit)

      public fun timeBasedLinear(timeBasedLinear: IResolvable)

      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.builder()

      override fun timeBasedCanary(timeBasedCanary: IResolvable) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(IResolvable::unwrap))
      }

      override fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(TimeBasedCanaryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      override fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit):
          Unit = timeBasedCanary(TimeBasedCanaryProperty(timeBasedCanary))

      override fun timeBasedLinear(timeBasedLinear: IResolvable) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(IResolvable::unwrap))
      }

      override fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(TimeBasedLinearProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      override fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit):
          Unit = timeBasedLinear(TimeBasedLinearProperty(timeBasedLinear))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty,
    ) : CdkObject(cdkObject), TrafficRoutingConfigProperty {
      override fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

      override fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty):
          TrafficRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRoutingConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
    }
  }

  public interface TimeBasedLinearProperty {
    public fun linearInterval(): Number

    public fun linearPercentage(): Number

    @CdkDslMarker
    public interface Builder {
      public fun linearInterval(linearInterval: Number)

      public fun linearPercentage(linearPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.builder()

      override fun linearInterval(linearInterval: Number) {
        cdkBuilder.linearInterval(linearInterval)
      }

      override fun linearPercentage(linearPercentage: Number) {
        cdkBuilder.linearPercentage(linearPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty,
    ) : CdkObject(cdkObject), TimeBasedLinearProperty {
      override fun linearInterval(): Number = unwrap(this).getLinearInterval()

      override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty):
          TimeBasedLinearProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedLinearProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty
    }
  }

  public interface TimeBasedCanaryProperty {
    public fun canaryInterval(): Number

    public fun canaryPercentage(): Number

    @CdkDslMarker
    public interface Builder {
      public fun canaryInterval(canaryInterval: Number)

      public fun canaryPercentage(canaryPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

      override fun canaryInterval(canaryInterval: Number) {
        cdkBuilder.canaryInterval(canaryInterval)
      }

      override fun canaryPercentage(canaryPercentage: Number) {
        cdkBuilder.canaryPercentage(canaryPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty,
    ) : CdkObject(cdkObject), TimeBasedCanaryProperty {
      override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

      override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedCanaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty):
          TimeBasedCanaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCanaryProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty
    }
  }
}
