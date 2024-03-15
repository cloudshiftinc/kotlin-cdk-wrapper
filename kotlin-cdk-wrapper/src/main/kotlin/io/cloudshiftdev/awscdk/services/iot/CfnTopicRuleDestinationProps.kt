@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTopicRuleDestinationProps {
  public fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

  public fun status(): String? = unwrap(this).getStatus()

  public fun vpcProperties(): Any? = unwrap(this).getVpcProperties()

  @CdkDslMarker
  public interface Builder {
    public fun httpUrlProperties(httpUrlProperties: IResolvable)

    public
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010bd1522fe20d65d1e51792627d288e2dac240d978257f23fa77787dff6b1a3")
    public
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun vpcProperties(vpcProperties: IResolvable)

    public
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e10148f81787769647ddb8430133f3b1493dd84af69f1bdf37c0a60239fbd5")
    public
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps.Builder
        = software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps.builder()

    override fun httpUrlProperties(httpUrlProperties: IResolvable) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(IResolvable::unwrap))
    }

    override
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("010bd1522fe20d65d1e51792627d288e2dac240d978257f23fa77787dff6b1a3")
    override
        fun httpUrlProperties(httpUrlProperties: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
        Unit =
        httpUrlProperties(CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty(httpUrlProperties))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun vpcProperties(vpcProperties: IResolvable) {
      cdkBuilder.vpcProperties(vpcProperties.let(IResolvable::unwrap))
    }

    override
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty) {
      cdkBuilder.vpcProperties(vpcProperties.let(CfnTopicRuleDestination.VpcDestinationPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e10148f81787769647ddb8430133f3b1493dd84af69f1bdf37c0a60239fbd5")
    override
        fun vpcProperties(vpcProperties: CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder.() -> Unit):
        Unit =
        vpcProperties(CfnTopicRuleDestination.VpcDestinationPropertiesProperty(vpcProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps,
  ) : CdkObject(cdkObject), CfnTopicRuleDestinationProps {
    override fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

    override fun status(): String? = unwrap(this).getStatus()

    override fun vpcProperties(): Any? = unwrap(this).getVpcProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicRuleDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps):
        CfnTopicRuleDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleDestinationProps):
        software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
  }
}
