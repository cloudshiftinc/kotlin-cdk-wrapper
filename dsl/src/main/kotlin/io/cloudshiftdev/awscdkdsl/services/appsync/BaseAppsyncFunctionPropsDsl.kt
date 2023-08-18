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
import software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.MappingTemplate

/**
 * the base properties for AppSync Functions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * Code code;
 * FunctionRuntime functionRuntime;
 * MappingTemplate mappingTemplate;
 * BaseAppsyncFunctionProps baseAppsyncFunctionProps = BaseAppsyncFunctionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .code(code)
 * .description("description")
 * .requestMappingTemplate(mappingTemplate)
 * .responseMappingTemplate(mappingTemplate)
 * .runtime(functionRuntime)
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseAppsyncFunctionPropsDsl {
    private val cdkBuilder: BaseAppsyncFunctionProps.Builder = BaseAppsyncFunctionProps.builder()

    /** @param code The function code. */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /** @param description the description for this AppSync Function. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name the name of the AppSync Function. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param requestMappingTemplate the request mapping template for the AppSync Function. */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /** @param responseMappingTemplate the response mapping template for the AppSync Function. */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /** @param runtime The functions runtime. */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): BaseAppsyncFunctionProps = cdkBuilder.build()
}
