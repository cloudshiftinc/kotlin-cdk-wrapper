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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationConfiguration(applicationConfiguration: IResolvable) {
        cdkBuilder.applicationConfiguration(applicationConfiguration)
    }

    public fun applicationConfiguration(applicationConfiguration: CfnApplication.ApplicationConfigurationProperty) {
        cdkBuilder.applicationConfiguration(applicationConfiguration)
    }

    public fun applicationDescription(applicationDescription: String) {
        cdkBuilder.applicationDescription(applicationDescription)
    }

    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
        cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
    }

    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: CfnApplication.ApplicationMaintenanceConfigurationProperty) {
        cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration)
    }

    public fun applicationMode(applicationMode: String) {
        cdkBuilder.applicationMode(applicationMode)
    }

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun runConfiguration(runConfiguration: IResolvable) {
        cdkBuilder.runConfiguration(runConfiguration)
    }

    public fun runConfiguration(runConfiguration: CfnApplication.RunConfigurationProperty) {
        cdkBuilder.runConfiguration(runConfiguration)
    }

    public fun runtimeEnvironment(runtimeEnvironment: String) {
        cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    public fun serviceExecutionRole(serviceExecutionRole: String) {
        cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplication {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
