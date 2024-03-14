package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficMirrorFilterRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public open fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

  public open fun destinationPortRange(`value`: IResolvable) {
    unwrap(this).setDestinationPortRange(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationPortRange(`value`: TrafficMirrorPortRangeProperty) {
    unwrap(this).setDestinationPortRange(`value`.let(TrafficMirrorPortRangeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fddaa574b2742bd039ecf9056772e39f8cf1845f80393d88ab19a8bebeb601ed")
  public open fun destinationPortRange(`value`: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
      Unit = destinationPortRange(TrafficMirrorPortRangeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protocol(): Number? = unwrap(this).getProtocol()

  public open fun protocol(`value`: Number) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun ruleAction(): String = unwrap(this).getRuleAction()

  public open fun ruleAction(`value`: String) {
    unwrap(this).setRuleAction(`value`)
  }

  public open fun ruleNumber(): Number = unwrap(this).getRuleNumber()

  public open fun ruleNumber(`value`: Number) {
    unwrap(this).setRuleNumber(`value`)
  }

  public open fun sourceCidrBlock(): String = unwrap(this).getSourceCidrBlock()

  public open fun sourceCidrBlock(`value`: String) {
    unwrap(this).setSourceCidrBlock(`value`)
  }

  public open fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

  public open fun sourcePortRange(`value`: IResolvable) {
    unwrap(this).setSourcePortRange(`value`.let(IResolvable::unwrap))
  }

  public open fun sourcePortRange(`value`: TrafficMirrorPortRangeProperty) {
    unwrap(this).setSourcePortRange(`value`.let(TrafficMirrorPortRangeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26f3db059ffe93144e666e175fc6378055a4f8539dee331a533e37812f5d36d6")
  public open fun sourcePortRange(`value`: TrafficMirrorPortRangeProperty.Builder.() -> Unit): Unit
      = sourcePortRange(TrafficMirrorPortRangeProperty(`value`))

  public open fun trafficDirection(): String = unwrap(this).getTrafficDirection()

  public open fun trafficDirection(`value`: String) {
    unwrap(this).setTrafficDirection(`value`)
  }

  public open fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

  public open fun trafficMirrorFilterId(`value`: String) {
    unwrap(this).setTrafficMirrorFilterId(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun destinationPortRange(destinationPortRange: IResolvable)

    public fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2db10abca88db1493b54a0e5d6c9b1f72a0ea3617d0f02596052a458b0eabf9c")
    public
        fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    public fun protocol(protocol: Number)

    public fun ruleAction(ruleAction: String)

    public fun ruleNumber(ruleNumber: Number)

    public fun sourceCidrBlock(sourceCidrBlock: String)

    public fun sourcePortRange(sourcePortRange: IResolvable)

    public fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f857ab00af762cf044e690ee3f6928e738c828c0867a4415dc02afb4621b061")
    public fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    public fun trafficDirection(trafficDirection: String)

    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun destinationPortRange(destinationPortRange: IResolvable) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable::unwrap))
    }

    override fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(TrafficMirrorPortRangeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2db10abca88db1493b54a0e5d6c9b1f72a0ea3617d0f02596052a458b0eabf9c")
    override
        fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit = destinationPortRange(TrafficMirrorPortRangeProperty(destinationPortRange))

    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    override fun sourceCidrBlock(sourceCidrBlock: String) {
      cdkBuilder.sourceCidrBlock(sourceCidrBlock)
    }

    override fun sourcePortRange(sourcePortRange: IResolvable) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(IResolvable::unwrap))
    }

    override fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(TrafficMirrorPortRangeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f857ab00af762cf044e690ee3f6928e738c828c0867a4415dc02afb4621b061")
    override
        fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit = sourcePortRange(TrafficMirrorPortRangeProperty(sourcePortRange))

    override fun trafficDirection(trafficDirection: String) {
      cdkBuilder.trafficDirection(trafficDirection)
    }

    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficMirrorFilterRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficMirrorFilterRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule):
        CfnTrafficMirrorFilterRule = CfnTrafficMirrorFilterRule(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorFilterRule):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule = wrapped.cdkObject
  }

  public interface TrafficMirrorPortRangeProperty {
    public fun fromPort(): Number

    public fun toPort(): Number

    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty,
    ) : TrafficMirrorPortRangeProperty {
      override fun fromPort(): Number = unwrap(this).getFromPort()

      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficMirrorPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty):
          TrafficMirrorPortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficMirrorPortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
