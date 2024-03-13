package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTargetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLoadBalancerArns(): List<String> = unwrap(this).getAttrLoadBalancerArns() ?:
      emptyList()

  public open fun attrTargetGroupArn(): String = unwrap(this).getAttrTargetGroupArn()

  public open fun attrTargetGroupFullName(): String = unwrap(this).getAttrTargetGroupFullName()

  public open fun attrTargetGroupName(): String = unwrap(this).getAttrTargetGroupName()

  public open fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

  public open fun healthCheckEnabled(`value`: Boolean) {
    unwrap(this).setHealthCheckEnabled(`value`)
  }

  public open fun healthCheckEnabled(`value`: IResolvable) {
    unwrap(this).setHealthCheckEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheckIntervalSeconds(): Number? =
      unwrap(this).getHealthCheckIntervalSeconds()

  public open fun healthCheckIntervalSeconds(`value`: Number) {
    unwrap(this).setHealthCheckIntervalSeconds(`value`)
  }

  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  public open fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

  public open fun healthCheckPort(`value`: String) {
    unwrap(this).setHealthCheckPort(`value`)
  }

  public open fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  public open fun healthCheckProtocol(`value`: String) {
    unwrap(this).setHealthCheckProtocol(`value`)
  }

  public open fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

  public open fun healthCheckTimeoutSeconds(`value`: Number) {
    unwrap(this).setHealthCheckTimeoutSeconds(`value`)
  }

  public open fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  public open fun healthyThresholdCount(`value`: Number) {
    unwrap(this).setHealthyThresholdCount(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun matcher(): Any? = unwrap(this).getMatcher()

  public open fun matcher(`value`: IResolvable) {
    unwrap(this).setMatcher(`value`.let(IResolvable::unwrap))
  }

  public open fun matcher(`value`: MatcherProperty) {
    unwrap(this).setMatcher(`value`.let(MatcherProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6953856f3003f994e810858fb1c90dfc78aedf88a46fd53642692cffe2eb21c3")
  public open fun matcher(`value`: MatcherProperty.Builder.() -> Unit): Unit =
      matcher(MatcherProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun protocol(): String? = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

  public open fun protocolVersion(`value`: String) {
    unwrap(this).setProtocolVersion(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

  public open fun targetGroupAttributes(`value`: IResolvable) {
    unwrap(this).setTargetGroupAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun targetGroupAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargetGroupAttributes(__idx_ac66f0)
  }

  public open fun targetType(): String? = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  public open fun unhealthyThresholdCount(`value`: Number) {
    unwrap(this).setUnhealthyThresholdCount(`value`)
  }

  public open fun vpcId(): String? = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun healthCheckEnabled(healthCheckEnabled: Boolean) {
    }

    public fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
    }

    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
    }

    public fun healthCheckPath(healthCheckPath: String) {
    }

    public fun healthCheckPort(healthCheckPort: String) {
    }

    public fun healthCheckProtocol(healthCheckProtocol: String) {
    }

    public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
    }

    public fun healthyThresholdCount(healthyThresholdCount: Number) {
    }

    public fun ipAddressType(ipAddressType: String) {
    }

    public fun matcher(matcher: IResolvable) {
    }

    public fun matcher(matcher: MatcherProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33940954ca624bb4d6d5ab1fa461595b5a719f17704474e9f0e09d8e43dede3f")
    public fun matcher(matcher: MatcherProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: String) {
    }

    public fun protocolVersion(protocolVersion: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
    }

    public fun targetGroupAttributes(targetGroupAttributes: List<Any>) {
    }

    public fun targetType(targetType: String) {
    }

    public fun targets(targets: IResolvable) {
    }

    public fun targets(targets: List<Any>) {
    }

    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.Builder.create(scope,
        id)

    public override fun healthCheckEnabled(healthCheckEnabled: Boolean) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled)
    }

    public override fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled.let(IResolvable::unwrap))
    }

    public override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    public override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    public override fun healthCheckPort(healthCheckPort: String) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    public override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    public override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
      cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
    }

    public override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    public override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    public override fun matcher(matcher: IResolvable) {
      cdkBuilder.matcher(matcher.let(IResolvable::unwrap))
    }

    public override fun matcher(matcher: MatcherProperty) {
      cdkBuilder.matcher(matcher.let(MatcherProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33940954ca624bb4d6d5ab1fa461595b5a719f17704474e9f0e09d8e43dede3f")
    public override fun matcher(matcher: MatcherProperty.Builder.() -> Unit): Unit =
        matcher(MatcherProperty(matcher))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public override fun protocolVersion(protocolVersion: String) {
      cdkBuilder.protocolVersion(protocolVersion)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.let(IResolvable::unwrap))
    }

    public override fun targetGroupAttributes(targetGroupAttributes: List<Any>) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes)
    }

    public override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    public override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    public override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup):
        CfnTargetGroup = CfnTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup = wrapped.cdkObject
  }

  public interface MatcherProperty {
    public fun grpcCode(): String? = unwrap(this).getGrpcCode()

    public fun httpCode(): String? = unwrap(this).getHttpCode()

    public interface Builder {
      public fun grpcCode(grpcCode: String) {
      }

      public fun httpCode(httpCode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty.builder()

      public override fun grpcCode(grpcCode: String) {
        cdkBuilder.grpcCode(grpcCode)
      }

      public override fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty,
    ) : MatcherProperty {
      public override fun grpcCode(): String? = unwrap(this).getGrpcCode()

      public override fun httpCode(): String? = unwrap(this).getHttpCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatcherProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty):
          MatcherProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatcherProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupAttributeProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty,
    ) : TargetGroupAttributeProperty {
      public override fun key(): String? = unwrap(this).getKey()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty):
          TargetGroupAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupAttributeProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetDescriptionProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun id(): String

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String) {
      }

      public fun id(id: String) {
      }

      public fun port(port: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.builder()

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty,
    ) : TargetDescriptionProperty {
      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun id(): String = unwrap(this).getId()

      public override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty):
          TargetDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetDescriptionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
