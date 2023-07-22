@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.constructs.Construct

@CdkDslMarker
public class CfnIPSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIPSet.Builder = CfnIPSet.Builder.create(scope, id)

  private val _ipSetDescriptors: MutableList<Any> = mutableListOf()

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
   * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
   * CIDR notation) that web requests originate from. 
   */
  public fun ipSetDescriptors(vararg ipSetDescriptors: Any) {
    _ipSetDescriptors.addAll(listOf(*ipSetDescriptors))
  }

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
   * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
   * CIDR notation) that web requests originate from. 
   */
  public fun ipSetDescriptors(ipSetDescriptors: Collection<Any>) {
    _ipSetDescriptors.addAll(ipSetDescriptors)
  }

  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
   * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
   * CIDR notation) that web requests originate from. 
   */
  public fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
    cdkBuilder.ipSetDescriptors(ipSetDescriptors)
  }

  /**
   * A friendly name or description of the `IPSet` .
   *
   * You can't change the name of an `IPSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
   * @param name A friendly name or description of the `IPSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnIPSet {
    if(_ipSetDescriptors.isNotEmpty()) cdkBuilder.ipSetDescriptors(_ipSetDescriptors)
    return cdkBuilder.build()
  }
}
