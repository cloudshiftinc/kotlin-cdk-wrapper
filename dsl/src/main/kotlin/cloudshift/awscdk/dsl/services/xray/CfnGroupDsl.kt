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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

    private val _tags: MutableList<Any> = mutableListOf()

    public fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
    }

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun insightsConfiguration(insightsConfiguration: IResolvable) {
        cdkBuilder.insightsConfiguration(insightsConfiguration)
    }

    public fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty) {
        cdkBuilder.insightsConfiguration(insightsConfiguration)
    }

    public fun tags(vararg tags: Any) {
        _tags.addAll(listOf(*tags))
    }

    public fun tags(tags: Collection<Any>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
