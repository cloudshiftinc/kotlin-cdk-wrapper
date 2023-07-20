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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNetworkInsightsAccessScopeAnalysisPropsDsl {
    private val cdkBuilder: CfnNetworkInsightsAccessScopeAnalysisProps.Builder =
        CfnNetworkInsightsAccessScopeAnalysisProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
        cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNetworkInsightsAccessScopeAnalysisProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
