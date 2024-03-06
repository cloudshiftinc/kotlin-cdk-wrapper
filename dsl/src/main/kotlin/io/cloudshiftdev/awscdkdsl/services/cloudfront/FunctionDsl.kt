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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.Function
import software.amazon.awscdk.services.cloudfront.FunctionCode
import software.amazon.awscdk.services.cloudfront.FunctionRuntime
import software.amazon.awscdk.services.cloudfront.IKeyValueStore
import software.constructs.Construct

/**
 * A CloudFront Function.
 *
 * Example:
 * ```
 * Bucket s3Bucket;
 * // Add a cloudfront Function to a Distribution
 * Function cfFunction = Function.Builder.create(this, "Function")
 * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
 * .runtime(FunctionRuntime.JS_2_0)
 * .build();
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .function(cfFunction)
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class FunctionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Function.Builder = Function.Builder.create(scope, id)

    /**
     * The source code of the function.
     *
     * @param code The source code of the function.
     */
    public fun code(code: FunctionCode) {
        cdkBuilder.code(code)
    }

    /**
     * A comment to describe the function.
     *
     * Default: - same as `functionName`
     *
     * @param comment A comment to describe the function.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * A name to identify the function.
     *
     * Default: - generated from the `id`
     *
     * @param functionName A name to identify the function.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * The Key Value Store to associate with this function.
     *
     * In order to associate a Key Value Store, the `runtime` must be `cloudfront-js-2.0` or newer.
     *
     * Default: - no key value store is associated
     *
     * @param keyValueStore The Key Value Store to associate with this function.
     */
    public fun keyValueStore(keyValueStore: IKeyValueStore) {
        cdkBuilder.keyValueStore(keyValueStore)
    }

    /**
     * The runtime environment for the function.
     *
     * Default: FunctionRuntime.JS_1_0 (unless `keyValueStore` is specified, then
     * `FunctionRuntime.JS_2_0`)
     *
     * @param runtime The runtime environment for the function.
     */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): Function = cdkBuilder.build()
}
