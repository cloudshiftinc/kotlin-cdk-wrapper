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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * The type of the configuration to override the risk decision.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * RiskExceptionConfigurationTypeProperty riskExceptionConfigurationTypeProperty =
 * RiskExceptionConfigurationTypeProperty.builder()
 * .blockedIpRangeList(List.of("blockedIpRangeList"))
 * .skippedIpRangeList(List.of("skippedIpRangeList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder()

    private val _blockedIpRangeList: MutableList<String> = mutableListOf()

    private val _skippedIpRangeList: MutableList<String> = mutableListOf()

    /**
     * @param blockedIpRangeList Overrides the risk decision to always block the pre-authentication
     *   requests. The IP range is in CIDR notation, a compact representation of an IP address and
     *   its routing prefix.
     */
    public fun blockedIpRangeList(vararg blockedIpRangeList: String) {
        _blockedIpRangeList.addAll(listOf(*blockedIpRangeList))
    }

    /**
     * @param blockedIpRangeList Overrides the risk decision to always block the pre-authentication
     *   requests. The IP range is in CIDR notation, a compact representation of an IP address and
     *   its routing prefix.
     */
    public fun blockedIpRangeList(blockedIpRangeList: Collection<String>) {
        _blockedIpRangeList.addAll(blockedIpRangeList)
    }

    /**
     * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
     *   list. The IP range is in CIDR notation.
     */
    public fun skippedIpRangeList(vararg skippedIpRangeList: String) {
        _skippedIpRangeList.addAll(listOf(*skippedIpRangeList))
    }

    /**
     * @param skippedIpRangeList Risk detection isn't performed on the IP addresses in this range
     *   list. The IP range is in CIDR notation.
     */
    public fun skippedIpRangeList(skippedIpRangeList: Collection<String>) {
        _skippedIpRangeList.addAll(skippedIpRangeList)
    }

    public fun build():
        CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty {
        if (_blockedIpRangeList.isNotEmpty()) cdkBuilder.blockedIpRangeList(_blockedIpRangeList)
        if (_skippedIpRangeList.isNotEmpty()) cdkBuilder.skippedIpRangeList(_skippedIpRangeList)
        return cdkBuilder.build()
    }
}
