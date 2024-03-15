@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The function's runtime environment version.
 *
 * Example:
 *
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
public open class FunctionRuntime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionRuntime,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val JS_1_0: FunctionRuntime =
        FunctionRuntime.wrap(software.amazon.awscdk.services.cloudfront.FunctionRuntime.JS_1_0)

    public val JS_2_0: FunctionRuntime =
        FunctionRuntime.wrap(software.amazon.awscdk.services.cloudfront.FunctionRuntime.JS_2_0)

    public fun custom(runtimeString: String): FunctionRuntime =
        software.amazon.awscdk.services.cloudfront.FunctionRuntime.custom(runtimeString).let(FunctionRuntime::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionRuntime):
        FunctionRuntime = FunctionRuntime(cdkObject)

    internal fun unwrap(wrapped: FunctionRuntime):
        software.amazon.awscdk.services.cloudfront.FunctionRuntime = wrapped.cdkObject
  }
}
