@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the function's source code.
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
public abstract class FunctionCode(
  cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode,
) : CdkObject(cdkObject) {
  /**
   * renders the function code.
   */
  public open fun render(): String = unwrap(this).render()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode,
  ) : FunctionCode(cdkObject)

  public companion object {
    public fun fromFile(options: FileCodeOptions): FunctionCode =
        software.amazon.awscdk.services.cloudfront.FunctionCode.fromFile(options.let(FileCodeOptions::unwrap)).let(FunctionCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53d4fdd60d88d1066ce14701c44b6e6aab79d38ec5e6f1245ba33b34e1e75d7")
    public fun fromFile(options: FileCodeOptions.Builder.() -> Unit): FunctionCode =
        fromFile(FileCodeOptions(options))

    public fun fromInline(code: String): FunctionCode =
        software.amazon.awscdk.services.cloudfront.FunctionCode.fromInline(code).let(FunctionCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode):
        FunctionCode = CdkObjectWrappers.wrap(cdkObject) as? FunctionCode ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionCode):
        software.amazon.awscdk.services.cloudfront.FunctionCode = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.FunctionCode
  }
}
