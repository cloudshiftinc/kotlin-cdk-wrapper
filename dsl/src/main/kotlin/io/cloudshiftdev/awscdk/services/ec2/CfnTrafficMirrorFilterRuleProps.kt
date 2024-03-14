package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTrafficMirrorFilterRuleProps {
  /**
   * The description of the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The destination CIDR block to assign to the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String

  /**
   * The destination port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
   */
  public fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

  /**
   * The protocol, for example UDP, to assign to the Traffic Mirror rule.
   *
   * For information about the protocol value, see [Protocol
   * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
   * on the Internet Assigned Numbers Authority (IANA) website.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol)
   */
  public fun protocol(): Number? = unwrap(this).getProtocol()

  /**
   * The action to take on the filtered traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction)
   */
  public fun ruleAction(): String

  /**
   * The number of the Traffic Mirror rule.
   *
   * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
   * processed in ascending order by rule number.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber)
   */
  public fun ruleNumber(): Number

  /**
   * The source CIDR block to assign to the Traffic Mirror rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock)
   */
  public fun sourceCidrBlock(): String

  /**
   * The source port range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
   */
  public fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

  /**
   * The type of traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection)
   */
  public fun trafficDirection(): String

  /**
   * The ID of the filter that this rule is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid)
   */
  public fun trafficMirrorFilterId(): String

  /**
   * A builder for [CfnTrafficMirrorFilterRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Traffic Mirror rule.
     */
    public fun description(description: String)

    /**
     * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param destinationPortRange The destination port range.
     */
    public fun destinationPortRange(destinationPortRange: IResolvable)

    /**
     * @param destinationPortRange The destination port range.
     */
    public
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty)

    /**
     * @param destinationPortRange The destination port range.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e520050006c341c718f8f48f005a2f160890b439e213bc6de1a8da3166a0fc3")
    public
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    /**
     * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * For information about the protocol value, see [Protocol
     * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     */
    public fun protocol(protocol: Number)

    /**
     * @param ruleAction The action to take on the filtered traffic. 
     */
    public fun ruleAction(ruleAction: String)

    /**
     * @param ruleNumber The number of the Traffic Mirror rule. 
     * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
     * processed in ascending order by rule number.
     */
    public fun ruleNumber(ruleNumber: Number)

    /**
     * @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. 
     */
    public fun sourceCidrBlock(sourceCidrBlock: String)

    /**
     * @param sourcePortRange The source port range.
     */
    public fun sourcePortRange(sourcePortRange: IResolvable)

    /**
     * @param sourcePortRange The source port range.
     */
    public
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty)

    /**
     * @param sourcePortRange The source port range.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f81f9ebdd25baa631b8fd5e7b3657bd9de0f4b9f78c4fcb04e6a73a114a6cb0")
    public
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    /**
     * @param trafficDirection The type of traffic. 
     */
    public fun trafficDirection(trafficDirection: String)

    /**
     * @param trafficMirrorFilterId The ID of the filter that this rule is associated with. 
     */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps.builder()

    /**
     * @param description The description of the Traffic Mirror rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param destinationPortRange The destination port range.
     */
    override fun destinationPortRange(destinationPortRange: IResolvable) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable::unwrap))
    }

    /**
     * @param destinationPortRange The destination port range.
     */
    override
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty::unwrap))
    }

    /**
     * @param destinationPortRange The destination port range.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e520050006c341c718f8f48f005a2f160890b439e213bc6de1a8da3166a0fc3")
    override
        fun destinationPortRange(destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit =
        destinationPortRange(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty(destinationPortRange))

    /**
     * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * For information about the protocol value, see [Protocol
     * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     */
    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param ruleAction The action to take on the filtered traffic. 
     */
    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    /**
     * @param ruleNumber The number of the Traffic Mirror rule. 
     * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
     * processed in ascending order by rule number.
     */
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    /**
     * @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. 
     */
    override fun sourceCidrBlock(sourceCidrBlock: String) {
      cdkBuilder.sourceCidrBlock(sourceCidrBlock)
    }

    /**
     * @param sourcePortRange The source port range.
     */
    override fun sourcePortRange(sourcePortRange: IResolvable) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(IResolvable::unwrap))
    }

    /**
     * @param sourcePortRange The source port range.
     */
    override
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty::unwrap))
    }

    /**
     * @param sourcePortRange The source port range.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f81f9ebdd25baa631b8fd5e7b3657bd9de0f4b9f78c4fcb04e6a73a114a6cb0")
    override
        fun sourcePortRange(sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit =
        sourcePortRange(CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty(sourcePortRange))

    /**
     * @param trafficDirection The type of traffic. 
     */
    override fun trafficDirection(trafficDirection: String) {
      cdkBuilder.trafficDirection(trafficDirection)
    }

    /**
     * @param trafficMirrorFilterId The ID of the filter that this rule is associated with. 
     */
    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorFilterRuleProps {
    /**
     * The description of the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The destination CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     */
    override fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

    /**
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     *
     * For information about the protocol value, see [Protocol
     * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol)
     */
    override fun protocol(): Number? = unwrap(this).getProtocol()

    /**
     * The action to take on the filtered traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction)
     */
    override fun ruleAction(): String = unwrap(this).getRuleAction()

    /**
     * The number of the Traffic Mirror rule.
     *
     * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
     * processed in ascending order by rule number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber)
     */
    override fun ruleNumber(): Number = unwrap(this).getRuleNumber()

    /**
     * The source CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock)
     */
    override fun sourceCidrBlock(): String = unwrap(this).getSourceCidrBlock()

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     */
    override fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

    /**
     * The type of traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection)
     */
    override fun trafficDirection(): String = unwrap(this).getTrafficDirection()

    /**
     * The ID of the filter that this rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid)
     */
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
