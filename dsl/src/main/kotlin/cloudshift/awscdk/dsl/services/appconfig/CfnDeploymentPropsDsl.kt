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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentPropsDsl {
    private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

    private val _tags: MutableList<CfnDeployment.TagsProperty> = mutableListOf()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun configurationProfileId(configurationProfileId: String) {
        cdkBuilder.configurationProfileId(configurationProfileId)
    }

    public fun configurationVersion(configurationVersion: String) {
        cdkBuilder.configurationVersion(configurationVersion)
    }

    public fun deploymentStrategyId(deploymentStrategyId: String) {
        cdkBuilder.deploymentStrategyId(deploymentStrategyId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
    }

    public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    public fun tags(tags: CfnDeploymentTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDeploymentTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnDeployment.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeploymentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
