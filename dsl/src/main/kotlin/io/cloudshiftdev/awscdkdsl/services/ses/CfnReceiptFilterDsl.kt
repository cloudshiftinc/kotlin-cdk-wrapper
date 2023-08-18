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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.constructs.Construct

/**
 * Specify a new IP address filter.
 *
 * You use IP address filters when you receive email with Amazon SES.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnReceiptFilter cfnReceiptFilter = CfnReceiptFilter.Builder.create(this, "MyCfnReceiptFilter")
 * .filter(FilterProperty.builder()
 * .ipFilter(IpFilterProperty.builder()
 * .cidr("cidr")
 * .policy("policy")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
 */
@CdkDslMarker
public class CfnReceiptFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReceiptFilter.Builder = CfnReceiptFilter.Builder.create(scope, id)

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     *
     * @param filter A data structure that describes the IP address filter to create, which consists
     *   of a name, an IP address range, and whether to allow or block mail from it.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * A data structure that describes the IP address filter to create, which consists of a name, an
     * IP address range, and whether to allow or block mail from it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
     *
     * @param filter A data structure that describes the IP address filter to create, which consists
     *   of a name, an IP address range, and whether to allow or block mail from it.
     */
    public fun filter(filter: CfnReceiptFilter.FilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun build(): CfnReceiptFilter = cdkBuilder.build()
}
