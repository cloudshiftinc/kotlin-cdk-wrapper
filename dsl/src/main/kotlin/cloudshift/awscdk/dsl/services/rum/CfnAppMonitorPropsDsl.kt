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

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAppMonitorPropsDsl {
    private val cdkBuilder: CfnAppMonitorProps.Builder = CfnAppMonitorProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
        cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
    }

    public fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty) {
        cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
    }

    public fun customEvents(customEvents: IResolvable) {
        cdkBuilder.customEvents(customEvents)
    }

    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
        cdkBuilder.customEvents(customEvents)
    }

    public fun cwLogEnabled(cwLogEnabled: Boolean) {
        cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    public fun cwLogEnabled(cwLogEnabled: IResolvable) {
        cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAppMonitorProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
