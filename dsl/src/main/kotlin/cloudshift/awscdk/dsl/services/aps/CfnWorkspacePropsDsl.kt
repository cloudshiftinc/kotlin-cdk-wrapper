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

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.amazon.awscdk.services.aps.CfnWorkspaceProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkspacePropsDsl {
    private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun alertManagerDefinition(alertManagerDefinition: String) {
        cdkBuilder.alertManagerDefinition(alertManagerDefinition)
    }

    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun loggingConfiguration(loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnWorkspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
