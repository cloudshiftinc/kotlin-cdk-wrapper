@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain
 * Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through
 * /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
 *
 * To specify an individual IP address, you specify the four-part IP address followed by a `/32` ,
 * for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any range between
 * /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more information
 * about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
 * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
 * .name("name")
 * // the properties below are optional
 * .ipSetDescriptors(List.of(Map.of(
 * "type", "type",
 * "value", "value")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html)
 */
public open class CfnIPSet(
  cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPSetProps,
  ) :
      this(software.amazon.awscdk.services.waf.regional.CfnIPSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIPSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIPSetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   */
  public open fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   */
  public open fun ipSetDescriptors(`value`: IResolvable) {
    unwrap(this).setIpSetDescriptors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   */
  public open fun ipSetDescriptors(`value`: List<Any>) {
    unwrap(this).setIpSetDescriptors(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   */
  public open fun ipSetDescriptors(vararg `value`: Any): Unit = ipSetDescriptors(`value`.toList())

  /**
   * A friendly name or description of the `IPSet` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name or description of the `IPSet` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.waf.regional.CfnIPSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

    /**
     * A friendly name or description of the `IPSet` .
     *
     * You can't change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
     * @param name A friendly name or description of the `IPSet` . 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnIPSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnIPSet.Builder.create(scope, id)

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable.Companion::unwrap))
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from. 
     */
    override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
        ipSetDescriptors(ipSetDescriptors.toList())

    /**
     * A friendly name or description of the `IPSet` .
     *
     * You can't change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
     * @param name A friendly name or description of the `IPSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.regional.CfnIPSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.waf.regional.CfnIPSet =
        wrapped.cdkObject as software.amazon.awscdk.services.waf.regional.CfnIPSet
  }

  /**
   * This is *AWS WAF Classic* documentation.
   *
   * For more information, see [AWS WAF
   * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
   * developer guide.
   *
   *
   * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
   * version, AWS WAF has a single set of endpoints for regional and global use.
   *
   *
   * Specifies the IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR format)
   * that web requests originate from.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.waf.regional.*;
   * IPSetDescriptorProperty iPSetDescriptorProperty = Map.of(
   * "type", "type",
   * "value", "value");
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html)
   */
  public interface IPSetDescriptorProperty {
    /**
     * Specify `IPV4` or `IPV6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-type)
     */
    public fun type(): String

    /**
     * Specify an IPv4 address by using CIDR notation. For example:.
     *
     * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 192.0.2.44, specify `192.0.2.44/32` .
     * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Specify an IPv6 address by using CIDR notation. For example:
     *
     * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-value)
     */
    public fun `value`(): String

    /**
     * A builder for [IPSetDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specify `IPV4` or `IPV6` . 
       */
      public fun type(type: String)

      /**
       * @param value Specify an IPv4 address by using CIDR notation. For example:. 
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 192.0.2.44, specify `192.0.2.44/32` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * Specify an IPv6 address by using CIDR notation. For example:
       *
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 1111:0000:0000:0000:0000:0000:0000:0111, specify
       * `1111:0000:0000:0000:0000:0000:0000:0111/128` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty.Builder =
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty.builder()

      /**
       * @param type Specify `IPV4` or `IPV6` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Specify an IPv4 address by using CIDR notation. For example:. 
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 192.0.2.44, specify `192.0.2.44/32` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * Specify an IPv6 address by using CIDR notation. For example:
       *
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 1111:0000:0000:0000:0000:0000:0000:0111, specify
       * `1111:0000:0000:0000:0000:0000:0000:0111/128` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty,
    ) : CdkObject(cdkObject),
        IPSetDescriptorProperty {
      /**
       * Specify `IPV4` or `IPV6` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Specify an IPv4 address by using CIDR notation. For example:.
       *
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 192.0.2.44, specify `192.0.2.44/32` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * Specify an IPv6 address by using CIDR notation. For example:
       *
       * * To configure AWS WAF to allow, block, or count requests that originated from the IP
       * address 1111:0000:0000:0000:0000:0000:0000:0111, specify
       * `1111:0000:0000:0000:0000:0000:0000:0111/128` .
       * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html#cfn-wafregional-ipset-ipsetdescriptor-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty):
          IPSetDescriptorProperty = CdkObjectWrappers.wrap(cdkObject) as? IPSetDescriptorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetDescriptorProperty):
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.regional.CfnIPSet.IPSetDescriptorProperty
    }
  }
}
