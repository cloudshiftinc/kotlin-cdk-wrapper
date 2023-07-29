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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
import software.constructs.Construct

/**
 * Describes a Network Access Scope analysis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScopeAnalysis cfnNetworkInsightsAccessScopeAnalysis =
 * CfnNetworkInsightsAccessScopeAnalysis.Builder.create(this,
 * "MyCfnNetworkInsightsAccessScopeAnalysis")
 * .networkInsightsAccessScopeId("networkInsightsAccessScopeId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopeAnalysisDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInsightsAccessScopeAnalysis.Builder =
        CfnNetworkInsightsAccessScopeAnalysis.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the Network Access Scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-networkinsightsaccessscopeid)
     *
     * @param networkInsightsAccessScopeId The ID of the Network Access Scope.
     */
    public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
        cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNetworkInsightsAccessScopeAnalysis {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
