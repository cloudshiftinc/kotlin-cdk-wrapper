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
import software.amazon.awscdk.services.cloudfront.FunctionCode
import software.amazon.awscdk.services.cloudfront.FunctionProps
import software.amazon.awscdk.services.cloudfront.FunctionRuntime
import software.amazon.awscdk.services.cloudfront.IKeyValueStore

/**
 * Properties for creating a CloudFront Function.
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
public class FunctionPropsDsl {
    private val cdkBuilder: FunctionProps.Builder = FunctionProps.builder()

    /** @param code The source code of the function. */
    public fun code(code: FunctionCode) {
        cdkBuilder.code(code)
    }

    /** @param comment A comment to describe the function. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param functionName A name to identify the function. */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param keyValueStore The Key Value Store to associate with this function. In order to
     *   associate a Key Value Store, the `runtime` must be `cloudfront-js-2.0` or newer.
     */
    public fun keyValueStore(keyValueStore: IKeyValueStore) {
        cdkBuilder.keyValueStore(keyValueStore)
    }

    /** @param runtime The runtime environment for the function. */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): FunctionProps = cdkBuilder.build()
}
