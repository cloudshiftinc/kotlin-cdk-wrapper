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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnEnvironment.LoggingConfigurationProperty.Builder =
        CfnEnvironment.LoggingConfigurationProperty.builder()

    public fun dagProcessingLogs(dagProcessingLogs: IResolvable) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs)
    }

    public fun dagProcessingLogs(dagProcessingLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs)
    }

    public fun schedulerLogs(schedulerLogs: IResolvable) {
        cdkBuilder.schedulerLogs(schedulerLogs)
    }

    public fun schedulerLogs(schedulerLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
        cdkBuilder.schedulerLogs(schedulerLogs)
    }

    public fun taskLogs(taskLogs: IResolvable) {
        cdkBuilder.taskLogs(taskLogs)
    }

    public fun taskLogs(taskLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
        cdkBuilder.taskLogs(taskLogs)
    }

    public fun webserverLogs(webserverLogs: IResolvable) {
        cdkBuilder.webserverLogs(webserverLogs)
    }

    public fun webserverLogs(webserverLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
        cdkBuilder.webserverLogs(webserverLogs)
    }

    public fun workerLogs(workerLogs: IResolvable) {
        cdkBuilder.workerLogs(workerLogs)
    }

    public fun workerLogs(workerLogs: CfnEnvironment.ModuleLoggingConfigurationProperty) {
        cdkBuilder.workerLogs(workerLogs)
    }

    public fun build(): CfnEnvironment.LoggingConfigurationProperty = cdkBuilder.build()
}
