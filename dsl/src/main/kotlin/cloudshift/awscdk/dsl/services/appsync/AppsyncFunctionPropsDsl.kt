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
import software.amazon.awscdk.services.appsync.AppsyncFunctionProps
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MappingTemplate
import kotlin.String

@CdkDslMarker
public class AppsyncFunctionPropsDsl {
    private val cdkBuilder: AppsyncFunctionProps.Builder = AppsyncFunctionProps.builder()

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    public fun dataSource(dataSource: BaseDataSource) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): AppsyncFunctionProps = cdkBuilder.build()
}
