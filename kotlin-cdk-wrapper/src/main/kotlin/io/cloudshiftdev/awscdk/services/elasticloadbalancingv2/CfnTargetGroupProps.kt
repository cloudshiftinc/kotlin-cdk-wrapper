@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

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
import kotlin.jvm.JvmName

public interface CfnTargetGroupProps {
  public fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

  public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

  public fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  public fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

  public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun matcher(): Any? = unwrap(this).getMatcher()

  public fun name(): String? = unwrap(this).getName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): String? = unwrap(this).getProtocol()

  public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

  public fun targetType(): String? = unwrap(this).getTargetType()

  public fun targets(): Any? = unwrap(this).getTargets()

  public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun healthCheckEnabled(healthCheckEnabled: Boolean)

    public fun healthCheckEnabled(healthCheckEnabled: IResolvable)

    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    public fun healthCheckPath(healthCheckPath: String)

    public fun healthCheckPort(healthCheckPort: String)

    public fun healthCheckProtocol(healthCheckProtocol: String)

    public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number)

    public fun healthyThresholdCount(healthyThresholdCount: Number)

    public fun ipAddressType(ipAddressType: String)

    public fun matcher(matcher: IResolvable)

    public fun matcher(matcher: CfnTargetGroup.MatcherProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("416c71eccd26db2c39cf20fe0dccd7d456308f17ecd8926f38c832132c97d22e")
    public fun matcher(matcher: CfnTargetGroup.MatcherProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun port(port: Number)

    public fun protocol(protocol: String)

    public fun protocolVersion(protocolVersion: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetGroupAttributes(targetGroupAttributes: IResolvable)

    public fun targetGroupAttributes(targetGroupAttributes: List<Any>)

    public fun targetGroupAttributes(vararg targetGroupAttributes: Any)

    public fun targetType(targetType: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps.builder()

    override fun healthCheckEnabled(healthCheckEnabled: Boolean) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled)
    }

    override fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled.let(IResolvable::unwrap))
    }

    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    override fun healthCheckPort(healthCheckPort: String) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
      cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
    }

    override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun matcher(matcher: IResolvable) {
      cdkBuilder.matcher(matcher.let(IResolvable::unwrap))
    }

    override fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
      cdkBuilder.matcher(matcher.let(CfnTargetGroup.MatcherProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("416c71eccd26db2c39cf20fe0dccd7d456308f17ecd8926f38c832132c97d22e")
    override fun matcher(matcher: CfnTargetGroup.MatcherProperty.Builder.() -> Unit): Unit =
        matcher(CfnTargetGroup.MatcherProperty(matcher))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun protocolVersion(protocolVersion: String) {
      cdkBuilder.protocolVersion(protocolVersion)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.let(IResolvable::unwrap))
    }

    override fun targetGroupAttributes(targetGroupAttributes: List<Any>) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes)
    }

    override fun targetGroupAttributes(vararg targetGroupAttributes: Any): Unit =
        targetGroupAttributes(targetGroupAttributes.toList())

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps,
  ) : CdkObject(cdkObject), CfnTargetGroupProps {
    override fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

    override fun healthCheckIntervalSeconds(): Number? =
        unwrap(this).getHealthCheckIntervalSeconds()

    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    override fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

    override fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

    override fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

    override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun matcher(): Any? = unwrap(this).getMatcher()

    override fun name(): String? = unwrap(this).getName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): String? = unwrap(this).getProtocol()

    override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

    override fun targetType(): String? = unwrap(this).getTargetType()

    override fun targets(): Any? = unwrap(this).getTargets()

    override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps):
        CfnTargetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroupProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
  }
}
