@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter

/**
 * Specifies an IP address filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .ipFilter(IpFilterProperty.builder()
 * .cidr("cidr")
 * .policy("policy")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-filter.html)
 */
@CdkDslMarker
public class CfnReceiptFilterFilterPropertyDsl {
    private val cdkBuilder: CfnReceiptFilter.FilterProperty.Builder =
        CfnReceiptFilter.FilterProperty.builder()

    /**
     * @param ipFilter A structure that provides the IP addresses to block or allow, and whether to
     *   block or allow incoming mail from them.
     */
    public fun ipFilter(ipFilter: IResolvable) {
        cdkBuilder.ipFilter(ipFilter)
    }

    /**
     * @param ipFilter A structure that provides the IP addresses to block or allow, and whether to
     *   block or allow incoming mail from them.
     */
    public fun ipFilter(ipFilter: CfnReceiptFilter.IpFilterProperty) {
        cdkBuilder.ipFilter(ipFilter)
    }

    /**
     * @param name The name of the IP address filter. The name must meet the following
     *   requirements:.
     * * Contain only ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * * Start and end with a letter or number.
     * * Contain 64 characters or fewer.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnReceiptFilter.FilterProperty = cdkBuilder.build()
}
