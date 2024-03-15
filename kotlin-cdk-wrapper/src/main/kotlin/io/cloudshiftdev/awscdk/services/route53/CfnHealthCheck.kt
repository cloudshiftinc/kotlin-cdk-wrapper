@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHealthCheck internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheck,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrHealthCheckId(): String = unwrap(this).getAttrHealthCheckId()

  public open fun healthCheckConfig(): Any = unwrap(this).getHealthCheckConfig()

  public open fun healthCheckConfig(`value`: IResolvable) {
    unwrap(this).setHealthCheckConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty) {
    unwrap(this).setHealthCheckConfig(`value`.let(HealthCheckConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("569eb2c9af72fd191e8dd3936c0a9b7373d37a3274cca2d72dcb60fa371c84a3")
  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty.Builder.() -> Unit): Unit =
      healthCheckConfig(HealthCheckConfigProperty(`value`))

  public open fun healthCheckTags(): Any? = unwrap(this).getHealthCheckTags()

  public open fun healthCheckTags(`value`: IResolvable) {
    unwrap(this).setHealthCheckTags(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setHealthCheckTags(__idx_ac66f0)
  }

  public open fun healthCheckTags(vararg __idx_ac66f0: Any): Unit =
      healthCheckTags(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun healthCheckConfig(healthCheckConfig: IResolvable)

    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10eb564e26de9025530513c4b2ab1399372b7f9d1c8936dcaa5908f181227922")
    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit)

    public fun healthCheckTags(healthCheckTags: IResolvable)

    public fun healthCheckTags(healthCheckTags: List<Any>)

    public fun healthCheckTags(vararg healthCheckTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHealthCheck.Builder =
        software.amazon.awscdk.services.route53.CfnHealthCheck.Builder.create(scope, id)

    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
    }

    override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(HealthCheckConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10eb564e26de9025530513c4b2ab1399372b7f9d1c8936dcaa5908f181227922")
    override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(HealthCheckConfigProperty(healthCheckConfig))

    override fun healthCheckTags(healthCheckTags: IResolvable) {
      cdkBuilder.healthCheckTags(healthCheckTags.let(IResolvable::unwrap))
    }

    override fun healthCheckTags(healthCheckTags: List<Any>) {
      cdkBuilder.healthCheckTags(healthCheckTags)
    }

    override fun healthCheckTags(vararg healthCheckTags: Any): Unit =
        healthCheckTags(healthCheckTags.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHealthCheck = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnHealthCheck.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHealthCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHealthCheck(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheck):
        CfnHealthCheck = CfnHealthCheck(cdkObject)

    internal fun unwrap(wrapped: CfnHealthCheck):
        software.amazon.awscdk.services.route53.CfnHealthCheck = wrapped.cdkObject
  }

  public interface HealthCheckTagProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty,
    ) : CdkObject(cdkObject), HealthCheckTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty):
          HealthCheckTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckTagProperty):
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckTagProperty
    }
  }

  public interface AlarmIdentifierProperty {
    public fun name(): String

    public fun region(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty,
    ) : CdkObject(cdkObject), AlarmIdentifierProperty {
      override fun name(): String = unwrap(this).getName()

      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty):
          AlarmIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmIdentifierProperty):
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty
    }
  }

  public interface HealthCheckConfigProperty {
    public fun alarmIdentifier(): Any? = unwrap(this).getAlarmIdentifier()

    public fun childHealthChecks(): List<String> = unwrap(this).getChildHealthChecks() ?:
        emptyList()

    public fun enableSni(): Any? = unwrap(this).getEnableSni()

    public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    public fun fullyQualifiedDomainName(): String? = unwrap(this).getFullyQualifiedDomainName()

    public fun healthThreshold(): Number? = unwrap(this).getHealthThreshold()

    public fun insufficientDataHealthStatus(): String? =
        unwrap(this).getInsufficientDataHealthStatus()

    public fun inverted(): Any? = unwrap(this).getInverted()

    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    public fun measureLatency(): Any? = unwrap(this).getMeasureLatency()

    public fun port(): Number? = unwrap(this).getPort()

    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    public fun requestInterval(): Number? = unwrap(this).getRequestInterval()

    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    public fun routingControlArn(): String? = unwrap(this).getRoutingControlArn()

    public fun searchString(): String? = unwrap(this).getSearchString()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun alarmIdentifier(alarmIdentifier: IResolvable)

      public fun alarmIdentifier(alarmIdentifier: AlarmIdentifierProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac412132c89e73ae908b1ecb7239f3b46dc7142b3ec016100beea46011eddae9")
      public fun alarmIdentifier(alarmIdentifier: AlarmIdentifierProperty.Builder.() -> Unit)

      public fun childHealthChecks(childHealthChecks: List<String>)

      public fun childHealthChecks(vararg childHealthChecks: String)

      public fun enableSni(enableSni: Boolean)

      public fun enableSni(enableSni: IResolvable)

      public fun failureThreshold(failureThreshold: Number)

      public fun fullyQualifiedDomainName(fullyQualifiedDomainName: String)

      public fun healthThreshold(healthThreshold: Number)

      public fun insufficientDataHealthStatus(insufficientDataHealthStatus: String)

      public fun inverted(inverted: Boolean)

      public fun inverted(inverted: IResolvable)

      public fun ipAddress(ipAddress: String)

      public fun measureLatency(measureLatency: Boolean)

      public fun measureLatency(measureLatency: IResolvable)

      public fun port(port: Number)

      public fun regions(regions: List<String>)

      public fun regions(vararg regions: String)

      public fun requestInterval(requestInterval: Number)

      public fun resourcePath(resourcePath: String)

      public fun routingControlArn(routingControlArn: String)

      public fun searchString(searchString: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty.builder()

      override fun alarmIdentifier(alarmIdentifier: IResolvable) {
        cdkBuilder.alarmIdentifier(alarmIdentifier.let(IResolvable::unwrap))
      }

      override fun alarmIdentifier(alarmIdentifier: AlarmIdentifierProperty) {
        cdkBuilder.alarmIdentifier(alarmIdentifier.let(AlarmIdentifierProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac412132c89e73ae908b1ecb7239f3b46dc7142b3ec016100beea46011eddae9")
      override fun alarmIdentifier(alarmIdentifier: AlarmIdentifierProperty.Builder.() -> Unit):
          Unit = alarmIdentifier(AlarmIdentifierProperty(alarmIdentifier))

      override fun childHealthChecks(childHealthChecks: List<String>) {
        cdkBuilder.childHealthChecks(childHealthChecks)
      }

      override fun childHealthChecks(vararg childHealthChecks: String): Unit =
          childHealthChecks(childHealthChecks.toList())

      override fun enableSni(enableSni: Boolean) {
        cdkBuilder.enableSni(enableSni)
      }

      override fun enableSni(enableSni: IResolvable) {
        cdkBuilder.enableSni(enableSni.let(IResolvable::unwrap))
      }

      override fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
      }

      override fun fullyQualifiedDomainName(fullyQualifiedDomainName: String) {
        cdkBuilder.fullyQualifiedDomainName(fullyQualifiedDomainName)
      }

      override fun healthThreshold(healthThreshold: Number) {
        cdkBuilder.healthThreshold(healthThreshold)
      }

      override fun insufficientDataHealthStatus(insufficientDataHealthStatus: String) {
        cdkBuilder.insufficientDataHealthStatus(insufficientDataHealthStatus)
      }

      override fun inverted(inverted: Boolean) {
        cdkBuilder.inverted(inverted)
      }

      override fun inverted(inverted: IResolvable) {
        cdkBuilder.inverted(inverted.let(IResolvable::unwrap))
      }

      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      override fun measureLatency(measureLatency: Boolean) {
        cdkBuilder.measureLatency(measureLatency)
      }

      override fun measureLatency(measureLatency: IResolvable) {
        cdkBuilder.measureLatency(measureLatency.let(IResolvable::unwrap))
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      override fun requestInterval(requestInterval: Number) {
        cdkBuilder.requestInterval(requestInterval)
      }

      override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      override fun routingControlArn(routingControlArn: String) {
        cdkBuilder.routingControlArn(routingControlArn)
      }

      override fun searchString(searchString: String) {
        cdkBuilder.searchString(searchString)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty,
    ) : CdkObject(cdkObject), HealthCheckConfigProperty {
      override fun alarmIdentifier(): Any? = unwrap(this).getAlarmIdentifier()

      override fun childHealthChecks(): List<String> = unwrap(this).getChildHealthChecks() ?:
          emptyList()

      override fun enableSni(): Any? = unwrap(this).getEnableSni()

      override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

      override fun fullyQualifiedDomainName(): String? = unwrap(this).getFullyQualifiedDomainName()

      override fun healthThreshold(): Number? = unwrap(this).getHealthThreshold()

      override fun insufficientDataHealthStatus(): String? =
          unwrap(this).getInsufficientDataHealthStatus()

      override fun inverted(): Any? = unwrap(this).getInverted()

      override fun ipAddress(): String? = unwrap(this).getIpAddress()

      override fun measureLatency(): Any? = unwrap(this).getMeasureLatency()

      override fun port(): Number? = unwrap(this).getPort()

      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      override fun requestInterval(): Number? = unwrap(this).getRequestInterval()

      override fun resourcePath(): String? = unwrap(this).getResourcePath()

      override fun routingControlArn(): String? = unwrap(this).getRoutingControlArn()

      override fun searchString(): String? = unwrap(this).getSearchString()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty):
          HealthCheckConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty
    }
  }
}
