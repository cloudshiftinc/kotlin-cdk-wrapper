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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFunctionConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFunctionConfiguration.Builder =
        CfnFunctionConfiguration.Builder.create(scope, id)

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    public fun codeS3Location(codeS3Location: String) {
        cdkBuilder.codeS3Location(codeS3Location)
    }

    public fun dataSourceName(dataSourceName: String) {
        cdkBuilder.dataSourceName(dataSourceName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
    }

    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun requestMappingTemplate(requestMappingTemplate: String) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
        cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    public fun responseMappingTemplate(responseMappingTemplate: String) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
        cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    public fun runtime(runtime: IResolvable) {
        cdkBuilder.runtime(runtime)
    }

    public fun runtime(runtime: CfnFunctionConfiguration.AppSyncRuntimeProperty) {
        cdkBuilder.runtime(runtime)
    }

    public fun syncConfig(syncConfig: IResolvable) {
        cdkBuilder.syncConfig(syncConfig)
    }

    public fun syncConfig(syncConfig: CfnFunctionConfiguration.SyncConfigProperty) {
        cdkBuilder.syncConfig(syncConfig)
    }

    public fun build(): CfnFunctionConfiguration = cdkBuilder.build()
}
