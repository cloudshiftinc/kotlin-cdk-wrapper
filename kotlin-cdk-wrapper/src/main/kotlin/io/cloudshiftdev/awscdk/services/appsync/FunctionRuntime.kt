@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Utility class for specifying specific appsync runtime versions.
 *
 * Example:
 *
 * ```
 * GraphqlApi api;
 * AppsyncFunction myJsFunction = AppsyncFunction.Builder.create(this, "function")
 * .name("my_js_function")
 * .api(api)
 * .dataSource(api.addNoneDataSource("none"))
 * .code(Code.fromAsset("directory/function_code.js"))
 * .runtime(FunctionRuntime.JS_1_0_0)
 * .build();
 * Resolver.Builder.create(this, "PipelineResolver")
 * .api(api)
 * .typeName("typeName")
 * .fieldName("fieldName")
 * .code(Code.fromInline("\n    // The before step\n    export function request(...args) {\n     
 * console.log(args);\n      return {}\n    }\n\n    // The after step\n    export function
 * response(ctx) {\n      return ctx.prev.result\n    }\n  "))
 * .runtime(FunctionRuntime.JS_1_0_0)
 * .pipelineConfig(List.of(myJsFunction))
 * .build();
 * ```
 */
public open class FunctionRuntime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime,
) : CdkObject(cdkObject) {
  /**
   * The name of the runtime.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Convert to Cfn runtime configuration property format.
   */
  public open fun toProperties(): RuntimeConfig =
      unwrap(this).toProperties().let(RuntimeConfig::wrap)

  /**
   * The runtime version.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val JS_1_0_0: FunctionRuntime =
        FunctionRuntime.wrap(software.amazon.awscdk.services.appsync.FunctionRuntime.JS_1_0_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime):
        FunctionRuntime = FunctionRuntime(cdkObject)

    internal fun unwrap(wrapped: FunctionRuntime):
        software.amazon.awscdk.services.appsync.FunctionRuntime = wrapped.cdkObject
  }
}
