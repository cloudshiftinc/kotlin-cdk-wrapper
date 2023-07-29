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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnGroup
import software.constructs.Construct

/**
 * Use the `AWS::XRay::Group` resource to specify a group with a name and a filter expression.
 *
 * Groups enable the collection of traces that match the filter expression, can be used to filter
 * service graphs and traces, and to supply Amazon CloudWatch metrics.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * Object tags;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .groupName("groupName")
 * // the properties below are optional
 * .filterExpression("filterExpression")
 * .insightsConfiguration(InsightsConfigurationProperty.builder()
 * .insightsEnabled(false)
 * .notificationsEnabled(false)
 * .build())
 * .tags(List.of(tags))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html)
 */
@CdkDslMarker
public class CfnGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

    private val _tags: MutableList<Any> = mutableListOf()

    /**
     * The filter expression defining the parameters to include traces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-filterexpression)
     *
     * @param filterExpression The filter expression defining the parameters to include traces.
     */
    public fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
    }

    /**
     * The unique case-sensitive name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-groupname)
     *
     * @param groupName The unique case-sensitive name of the group.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     *   disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     *   through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     *
     * @param insightsConfiguration The structure containing configurations related to insights.
     */
    public fun insightsConfiguration(insightsConfiguration: IResolvable) {
        cdkBuilder.insightsConfiguration(insightsConfiguration)
    }

    /**
     * The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     *   disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     *   through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     *
     * @param insightsConfiguration The structure containing configurations related to insights.
     */
    public fun insightsConfiguration(
        insightsConfiguration: CfnGroup.InsightsConfigurationProperty
    ) {
        cdkBuilder.insightsConfiguration(insightsConfiguration)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: Any) {
        _tags.addAll(listOf(*tags))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<Any>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
