@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTrafficMirrorFilterRuleProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun destinationCidrBlock(): String

  public fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

  public fun protocol(): Number? = unwrap(this).getProtocol()

  public fun ruleAction(): String

  public fun ruleNumber(): Number

  public fun sourceCidrBlock(): String

  public fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

  public fun trafficDirection(): String

  public fun trafficMirrorFilterId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun destinationPortRange(destinationPortRange: IResolvable)

    public
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e520050006c341c718f8f48f005a2f160890b439e213bc6de1a8da3166a0fc3")
    public
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    public fun protocol(protocol: Number)

    public fun ruleAction(ruleAction: String)

    public fun ruleNumber(ruleNumber: Number)

    public fun sourceCidrBlock(sourceCidrBlock: String)

    public fun sourcePortRange(sourcePortRange: IResolvable)

    public
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f81f9ebdd25baa631b8fd5e7b3657bd9de0f4b9f78c4fcb04e6a73a114a6cb0")
    public
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    public fun trafficDirection(trafficDirection: String)

    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun destinationPortRange(destinationPortRange: IResolvable) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable::unwrap))
    }

    override
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e520050006c341c718f8f48f005a2f160890b439e213bc6de1a8da3166a0fc3")
    override
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit =
        destinationPortRange(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty(destinationPortRange))

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

    override
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f81f9ebdd25baa631b8fd5e7b3657bd9de0f4b9f78c4fcb04e6a73a114a6cb0")
    override
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit =
        sourcePortRange(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty(sourcePortRange))

    override fun trafficDirection(trafficDirection: String) {
      cdkBuilder.trafficDirection(trafficDirection)
    }

    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorFilterRuleProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    override fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

    override fun protocol(): Number? = unwrap(this).getProtocol()

    override fun ruleAction(): String = unwrap(this).getRuleAction()

    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()

    override fun sourceCidrBlock(): String = unwrap(this).getSourceCidrBlock()

    override fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

    override fun trafficDirection(): String = unwrap(this).getTrafficDirection()

    override fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorFilterRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps):
        CfnTrafficMirrorFilterRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorFilterRuleProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps
  }
}
