@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MappingTemplate
import software.constructs.Construct

/**
 * AppSync Functions are local functions that perform certain operations onto a backend data source.
 *
 * Developers can compose operations (Functions) and execute them in sequence with Pipeline
 * Resolvers.
 *
 * Example:
 * ```
 * GraphqlApi api;
 * AppsyncFunction appsyncFunction = AppsyncFunction.Builder.create(this, "function")
 * .name("appsync_function")
 * .api(api)
 * .dataSource(api.addNoneDataSource("none"))
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AppsyncFunctionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AppsyncFunction.Builder = AppsyncFunction.Builder.create(scope, id)

    /**
     * the GraphQL Api linked to this AppSync Function.
     *
     * @param api the GraphQL Api linked to this AppSync Function.
     */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /**
     * The function code.
     *
     * Default: - no code is used
     *
     * @param code The function code.
     */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /**
     * the data source linked to this AppSync Function.
     *
     * @param dataSource the data source linked to this AppSync Function.
     */
    public fun dataSource(dataSource: BaseDataSource) {
        cdkBuilder.dataSource(dataSource)
    }

    /**
     * the description for this AppSync Function.
     *
     * Default: - no description
     *
     * @param description the description for this AppSync Function.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * the name of the AppSync Function.
     *
     * @param name the name of the AppSync Function.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * the request mapping template for the AppSync Function.
     *
     * Default: - no request mapping template
     *
     * @param requestMappingTemplate the request mapping template for the AppSync Function.
     */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /**
     * the response mapping template for the AppSync Function.
     *
     * Default: - no response mapping template
     *
     * @param responseMappingTemplate the response mapping template for the AppSync Function.
     */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     *
     * @param runtime The functions runtime.
     */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): AppsyncFunction = cdkBuilder.build()
}
