@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Traffic Mirror filter rule.
 *
 * A Traffic Mirror rule defines the Traffic Mirror source traffic to mirror.
 *
 * You need the Traffic Mirror filter ID when you create the rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilterRule cfnTrafficMirrorFilterRule =
 * CfnTrafficMirrorFilterRule.Builder.create(this, "MyCfnTrafficMirrorFilterRule")
 * .destinationCidrBlock("destinationCidrBlock")
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * .sourceCidrBlock("sourceCidrBlock")
 * .trafficDirection("trafficDirection")
 * .trafficMirrorFilterId("trafficMirrorFilterId")
 * // the properties below are optional
 * .description("description")
 * .destinationPortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .protocol(123)
 * .sourcePortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 */
public open class CfnTrafficMirrorFilterRule(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrafficMirrorFilterRuleProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTrafficMirrorFilterRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrafficMirrorFilterRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrafficMirrorFilterRuleProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the Traffic Mirror rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the Traffic Mirror rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The destination CIDR block to assign to the Traffic Mirror rule.
   */
  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  /**
   * The destination CIDR block to assign to the Traffic Mirror rule.
   */
  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  /**
   * The destination port range.
   */
  public open fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

  /**
   * The destination port range.
   */
  public open fun destinationPortRange(`value`: IResolvable) {
    unwrap(this).setDestinationPortRange(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The destination port range.
   */
  public open fun destinationPortRange(`value`: TrafficMirrorPortRangeProperty) {
    unwrap(this).setDestinationPortRange(`value`.let(TrafficMirrorPortRangeProperty.Companion::unwrap))
  }

  /**
   * The destination port range.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fddaa574b2742bd039ecf9056772e39f8cf1845f80393d88ab19a8bebeb601ed")
  public open fun destinationPortRange(`value`: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
      Unit = destinationPortRange(TrafficMirrorPortRangeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The protocol, for example UDP, to assign to the Traffic Mirror rule.
   */
  public open fun protocol(): Number? = unwrap(this).getProtocol()

  /**
   * The protocol, for example UDP, to assign to the Traffic Mirror rule.
   */
  public open fun protocol(`value`: Number) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * The action to take on the filtered traffic.
   */
  public open fun ruleAction(): String = unwrap(this).getRuleAction()

  /**
   * The action to take on the filtered traffic.
   */
  public open fun ruleAction(`value`: String) {
    unwrap(this).setRuleAction(`value`)
  }

  /**
   * The number of the Traffic Mirror rule.
   */
  public open fun ruleNumber(): Number = unwrap(this).getRuleNumber()

  /**
   * The number of the Traffic Mirror rule.
   */
  public open fun ruleNumber(`value`: Number) {
    unwrap(this).setRuleNumber(`value`)
  }

  /**
   * The source CIDR block to assign to the Traffic Mirror rule.
   */
  public open fun sourceCidrBlock(): String = unwrap(this).getSourceCidrBlock()

  /**
   * The source CIDR block to assign to the Traffic Mirror rule.
   */
  public open fun sourceCidrBlock(`value`: String) {
    unwrap(this).setSourceCidrBlock(`value`)
  }

  /**
   * The source port range.
   */
  public open fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

  /**
   * The source port range.
   */
  public open fun sourcePortRange(`value`: IResolvable) {
    unwrap(this).setSourcePortRange(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The source port range.
   */
  public open fun sourcePortRange(`value`: TrafficMirrorPortRangeProperty) {
    unwrap(this).setSourcePortRange(`value`.let(TrafficMirrorPortRangeProperty.Companion::unwrap))
  }

  /**
   * The source port range.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26f3db059ffe93144e666e175fc6378055a4f8539dee331a533e37812f5d36d6")
  public open fun sourcePortRange(`value`: TrafficMirrorPortRangeProperty.Builder.() -> Unit): Unit
      = sourcePortRange(TrafficMirrorPortRangeProperty(`value`))

  /**
   * Tags on Traffic Mirroring filter rules.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags on Traffic Mirroring filter rules.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags on Traffic Mirroring filter rules.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of traffic.
   */
  public open fun trafficDirection(): String = unwrap(this).getTrafficDirection()

  /**
   * The type of traffic.
   */
  public open fun trafficDirection(`value`: String) {
    unwrap(this).setTrafficDirection(`value`)
  }

  /**
   * The ID of the filter that this rule is associated with.
   */
  public open fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

  /**
   * The ID of the filter that this rule is associated with.
   */
  public open fun trafficMirrorFilterId(`value`: String) {
    unwrap(this).setTrafficMirrorFilterId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTrafficMirrorFilterRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description)
     * @param description The description of the Traffic Mirror rule. 
     */
    public fun description(description: String)

    /**
     * The destination CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock)
     * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    public fun destinationPortRange(destinationPortRange: IResolvable)

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    public fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty)

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2db10abca88db1493b54a0e5d6c9b1f72a0ea3617d0f02596052a458b0eabf9c")
    public
        fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    /**
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     *
     * For information about the protocol value, see [Protocol
     * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol)
     * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule. 
     */
    public fun protocol(protocol: Number)

    /**
     * The action to take on the filtered traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction)
     * @param ruleAction The action to take on the filtered traffic. 
     */
    public fun ruleAction(ruleAction: String)

    /**
     * The number of the Traffic Mirror rule.
     *
     * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
     * processed in ascending order by rule number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber)
     * @param ruleNumber The number of the Traffic Mirror rule. 
     */
    public fun ruleNumber(ruleNumber: Number)

    /**
     * The source CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock)
     * @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. 
     */
    public fun sourceCidrBlock(sourceCidrBlock: String)

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    public fun sourcePortRange(sourcePortRange: IResolvable)

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    public fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty)

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f857ab00af762cf044e690ee3f6928e738c828c0867a4415dc02afb4621b061")
    public fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit)

    /**
     * Tags on Traffic Mirroring filter rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-tags)
     * @param tags Tags on Traffic Mirroring filter rules. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags on Traffic Mirroring filter rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-tags)
     * @param tags Tags on Traffic Mirroring filter rules. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection)
     * @param trafficDirection The type of traffic. 
     */
    public fun trafficDirection(trafficDirection: String)

    /**
     * The ID of the filter that this rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid)
     * @param trafficMirrorFilterId The ID of the filter that this rule is associated with. 
     */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder.create(scope, id)

    /**
     * The description of the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-description)
     * @param description The description of the Traffic Mirror rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The destination CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationcidrblock)
     * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    override fun destinationPortRange(destinationPortRange: IResolvable) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable.Companion::unwrap))
    }

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    override fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty) {
      cdkBuilder.destinationPortRange(destinationPortRange.let(TrafficMirrorPortRangeProperty.Companion::unwrap))
    }

    /**
     * The destination port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-destinationportrange)
     * @param destinationPortRange The destination port range. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2db10abca88db1493b54a0e5d6c9b1f72a0ea3617d0f02596052a458b0eabf9c")
    override
        fun destinationPortRange(destinationPortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit = destinationPortRange(TrafficMirrorPortRangeProperty(destinationPortRange))

    /**
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     *
     * For information about the protocol value, see [Protocol
     * Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * on the Internet Assigned Numbers Authority (IANA) website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-protocol)
     * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule. 
     */
    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * The action to take on the filtered traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-ruleaction)
     * @param ruleAction The action to take on the filtered traffic. 
     */
    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    /**
     * The number of the Traffic Mirror rule.
     *
     * This number must be unique for each Traffic Mirror rule in a given direction. The rules are
     * processed in ascending order by rule number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-rulenumber)
     * @param ruleNumber The number of the Traffic Mirror rule. 
     */
    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    /**
     * The source CIDR block to assign to the Traffic Mirror rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourcecidrblock)
     * @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. 
     */
    override fun sourceCidrBlock(sourceCidrBlock: String) {
      cdkBuilder.sourceCidrBlock(sourceCidrBlock)
    }

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    override fun sourcePortRange(sourcePortRange: IResolvable) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(IResolvable.Companion::unwrap))
    }

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    override fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty) {
      cdkBuilder.sourcePortRange(sourcePortRange.let(TrafficMirrorPortRangeProperty.Companion::unwrap))
    }

    /**
     * The source port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-sourceportrange)
     * @param sourcePortRange The source port range. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f857ab00af762cf044e690ee3f6928e738c828c0867a4415dc02afb4621b061")
    override
        fun sourcePortRange(sourcePortRange: TrafficMirrorPortRangeProperty.Builder.() -> Unit):
        Unit = sourcePortRange(TrafficMirrorPortRangeProperty(sourcePortRange))

    /**
     * Tags on Traffic Mirroring filter rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-tags)
     * @param tags Tags on Traffic Mirroring filter rules. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags on Traffic Mirroring filter rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-tags)
     * @param tags Tags on Traffic Mirroring filter rules. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficdirection)
     * @param trafficDirection The type of traffic. 
     */
    override fun trafficDirection(trafficDirection: String) {
      cdkBuilder.trafficDirection(trafficDirection)
    }

    /**
     * The ID of the filter that this rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorfilterid)
     * @param trafficMirrorFilterId The ID of the filter that this rule is associated with. 
     */
    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
  }

  /**
   * Describes the Traffic Mirror port range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TrafficMirrorPortRangeProperty trafficMirrorPortRangeProperty =
   * TrafficMirrorPortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html)
   */
  public interface TrafficMirrorPortRangeProperty {
    /**
     * The start of the Traffic Mirror port range.
     *
     * This applies to the TCP and UDP protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorportrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * The end of the Traffic Mirror port range.
     *
     * This applies to the TCP and UDP protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorportrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [TrafficMirrorPortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort The start of the Traffic Mirror port range. 
       * This applies to the TCP and UDP protocols.
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort The end of the Traffic Mirror port range. 
       * This applies to the TCP and UDP protocols.
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder()

      /**
       * @param fromPort The start of the Traffic Mirror port range. 
       * This applies to the TCP and UDP protocols.
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort The end of the Traffic Mirror port range. 
       * This applies to the TCP and UDP protocols.
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty,
    ) : CdkObject(cdkObject),
        TrafficMirrorPortRangeProperty {
      /**
       * The start of the Traffic Mirror port range.
       *
       * This applies to the TCP and UDP protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorportrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * The end of the Traffic Mirror port range.
       *
       * This applies to the TCP and UDP protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-trafficmirrorfilterrule-trafficmirrorportrange.html#cfn-ec2-trafficmirrorfilterrule-trafficmirrorportrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficMirrorPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty):
          TrafficMirrorPortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TrafficMirrorPortRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficMirrorPortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
    }
  }
}
