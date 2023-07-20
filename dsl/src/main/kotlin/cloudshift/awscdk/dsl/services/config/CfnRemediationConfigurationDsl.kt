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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnRemediationConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRemediationConfiguration.Builder =
        CfnRemediationConfiguration.Builder.create(scope, id)

    public fun automatic(automatic: Boolean) {
        cdkBuilder.automatic(automatic)
    }

    public fun automatic(automatic: IResolvable) {
        cdkBuilder.automatic(automatic)
    }

    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    public fun executionControls(executionControls: IResolvable) {
        cdkBuilder.executionControls(executionControls)
    }

    public fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty) {
        cdkBuilder.executionControls(executionControls)
    }

    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
        cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun retryAttemptSeconds(retryAttemptSeconds: Number) {
        cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun targetVersion(targetVersion: String) {
        cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): CfnRemediationConfiguration = cdkBuilder.build()
}
