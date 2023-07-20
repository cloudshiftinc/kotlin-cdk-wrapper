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

package cloudshift.awscdk.dsl.services.mwaa

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment
import software.amazon.awscdk.services.mwaa.CfnEnvironmentProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    public fun airflowConfigurationOptions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.airflowConfigurationOptions(builder.map)
    }

    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
        cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    public fun airflowVersion(airflowVersion: String) {
        cdkBuilder.airflowVersion(airflowVersion)
    }

    public fun dagS3Path(dagS3Path: String) {
        cdkBuilder.dagS3Path(dagS3Path)
    }

    public fun environmentClass(environmentClass: String) {
        cdkBuilder.environmentClass(environmentClass)
    }

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun loggingConfiguration(loggingConfiguration: CfnEnvironment.LoggingConfigurationProperty) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    public fun maxWorkers(maxWorkers: Number) {
        cdkBuilder.maxWorkers(maxWorkers)
    }

    public fun minWorkers(minWorkers: Number) {
        cdkBuilder.minWorkers(minWorkers)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun networkConfiguration(networkConfiguration: CfnEnvironment.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
        cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    public fun pluginsS3Path(pluginsS3Path: String) {
        cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
        cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    public fun requirementsS3Path(requirementsS3Path: String) {
        cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    public fun schedulers(schedulers: Number) {
        cdkBuilder.schedulers(schedulers)
    }

    public fun sourceBucketArn(sourceBucketArn: String) {
        cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
        cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

    public fun startupScriptS3Path(startupScriptS3Path: String) {
        cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun webserverAccessMode(webserverAccessMode: String) {
        cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
        cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): CfnEnvironmentProps = cdkBuilder.build()
}
