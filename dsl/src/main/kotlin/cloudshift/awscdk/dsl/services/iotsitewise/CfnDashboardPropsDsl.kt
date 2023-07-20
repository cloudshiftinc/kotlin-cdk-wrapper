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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnDashboardProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardPropsDsl {
    private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dashboardDefinition(dashboardDefinition: String) {
        cdkBuilder.dashboardDefinition(dashboardDefinition)
    }

    public fun dashboardDescription(dashboardDescription: String) {
        cdkBuilder.dashboardDescription(dashboardDescription)
    }

    public fun dashboardName(dashboardName: String) {
        cdkBuilder.dashboardName(dashboardName)
    }

    public fun projectId(projectId: String) {
        cdkBuilder.projectId(projectId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDashboardProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
