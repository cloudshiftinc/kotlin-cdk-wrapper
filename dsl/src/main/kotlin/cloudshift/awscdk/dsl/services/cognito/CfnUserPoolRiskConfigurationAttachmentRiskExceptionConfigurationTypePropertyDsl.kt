@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder()

    private val _blockedIpRangeList: MutableList<String> = mutableListOf()

    private val _skippedIpRangeList: MutableList<String> = mutableListOf()

    public fun blockedIpRangeList(vararg blockedIpRangeList: String) {
        _blockedIpRangeList.addAll(listOf(*blockedIpRangeList))
    }

    public fun blockedIpRangeList(blockedIpRangeList: Collection<String>) {
        _blockedIpRangeList.addAll(blockedIpRangeList)
    }

    public fun skippedIpRangeList(vararg skippedIpRangeList: String) {
        _skippedIpRangeList.addAll(listOf(*skippedIpRangeList))
    }

    public fun skippedIpRangeList(skippedIpRangeList: Collection<String>) {
        _skippedIpRangeList.addAll(skippedIpRangeList)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty {
        if (_blockedIpRangeList.isNotEmpty()) cdkBuilder.blockedIpRangeList(_blockedIpRangeList)
        if (_skippedIpRangeList.isNotEmpty()) cdkBuilder.skippedIpRangeList(_skippedIpRangeList)
        return cdkBuilder.build()
    }
}
