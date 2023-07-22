@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptFilter

/**
 * A receipt IP address filter enables you to specify whether to accept or reject mail originating
 * from an IP address or range of IP addresses.
 *
 * For information about setting up IP address filters, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * IpFilterProperty ipFilterProperty = IpFilterProperty.builder()
 * .cidr("cidr")
 * .policy("policy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html)
 */
@CdkDslMarker
public class CfnReceiptFilterIpFilterPropertyDsl {
  private val cdkBuilder: CfnReceiptFilter.IpFilterProperty.Builder =
      CfnReceiptFilter.IpFilterProperty.builder()

  /**
   * @param cidr A single IP address or a range of IP addresses to block or allow, specified in
   * Classless Inter-Domain Routing (CIDR) notation. 
   * An example of a single email address is 10.0.0.1. An example of a range of IP addresses is
   * 10.0.0.1/24. For more information about CIDR notation, see [RFC
   * 2317](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2317) .
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param policy Indicates whether to block or allow incoming mail from the specified IP
   * addresses. 
   */
  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnReceiptFilter.IpFilterProperty = cdkBuilder.build()
}
