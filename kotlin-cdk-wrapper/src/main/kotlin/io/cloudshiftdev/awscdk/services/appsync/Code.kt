@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents source code for an AppSync Function or Resolver.
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
public abstract class Code(
  cdkObject: software.amazon.awscdk.services.appsync.Code,
) : CdkObject(cdkObject) {
  /**
   * Bind source code to an AppSync Function or resolver.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(path: String): AssetCode =
        software.amazon.awscdk.services.appsync.Code.fromAsset(path).let(AssetCode::wrap)

    public fun fromAsset(path: String, options: AssetOptions): AssetCode =
        software.amazon.awscdk.services.appsync.Code.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(AssetCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6b30dc0029d3eae4bcdf8c40fd877adaafd1579c6e451b25506f9b13057af28")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
        fromAsset(path, AssetOptions(options))

    public fun fromInline(code: String): InlineCode =
        software.amazon.awscdk.services.appsync.Code.fromInline(code).let(InlineCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Code): Code =
        CdkObjectWrappers.wrap(cdkObject) as? Code ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.appsync.Code = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.Code
  }
}
