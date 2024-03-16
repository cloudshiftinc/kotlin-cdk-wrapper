@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnIPSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.*;
 * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .ipSetDescriptors(List.of(Map.of(
 * "type", "type",
 * "value", "value")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
 */
public interface CfnIPSetProps {
  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   *
   * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not use
   * an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
   * CloudFront access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
   */
  public fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

  /**
   * The name of the `IPSet` .
   *
   * You can't change the name of an `IPSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnIPSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

    /**
     * @param name The name of the `IPSet` . 
     * You can't change the name of an `IPSet` after you create it.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.waf.CfnIPSetProps.builder()

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     */
    override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
        ipSetDescriptors(ipSetDescriptors.toList())

    /**
     * @param name The name of the `IPSet` . 
     * You can't change the name of an `IPSet` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnIPSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in
     * the CloudFront access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
     */
    override fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

    /**
     * The name of the `IPSet` .
     *
     * You can't change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnIPSetProps): CfnIPSetProps =
        CdkObjectWrappers.wrap(cdkObject) as CfnIPSetProps

    internal fun unwrap(wrapped: CfnIPSetProps): software.amazon.awscdk.services.waf.CfnIPSetProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.waf.CfnIPSetProps
  }
}
