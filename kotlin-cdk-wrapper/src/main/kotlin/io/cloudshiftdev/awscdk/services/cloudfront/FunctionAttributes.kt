@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Attributes of an existing CloudFront Function to import it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * FunctionAttributes functionAttributes = FunctionAttributes.builder()
 * .functionArn("functionArn")
 * .functionName("functionName")
 * // the properties below are optional
 * .functionRuntime("functionRuntime")
 * .build();
 * ```
 */
public interface FunctionAttributes {
  /**
   * The ARN of the function.
   */
  public fun functionArn(): String

  /**
   * The name of the function.
   */
  public fun functionName(): String

  /**
   * The Runtime of the function.
   *
   * Default: FunctionRuntime.JS_1_0
   */
  public fun functionRuntime(): String? = unwrap(this).getFunctionRuntime()

  /**
   * A builder for [FunctionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn The ARN of the function. 
     */
    public fun functionArn(functionArn: String)

    /**
     * @param functionName The name of the function. 
     */
    public fun functionName(functionName: String)

    /**
     * @param functionRuntime The Runtime of the function.
     */
    public fun functionRuntime(functionRuntime: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionAttributes.builder()

    /**
     * @param functionArn The ARN of the function. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param functionName The name of the function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionRuntime The Runtime of the function.
     */
    override fun functionRuntime(functionRuntime: String) {
      cdkBuilder.functionRuntime(functionRuntime)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAttributes,
  ) : CdkObject(cdkObject), FunctionAttributes {
    /**
     * The ARN of the function.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The name of the function.
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * The Runtime of the function.
     *
     * Default: FunctionRuntime.JS_1_0
     */
    override fun functionRuntime(): String? = unwrap(this).getFunctionRuntime()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAttributes):
        FunctionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionAttributes):
        software.amazon.awscdk.services.cloudfront.FunctionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.FunctionAttributes
  }
}
