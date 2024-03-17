@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The attributes for imported AppSync Functions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * AppsyncFunctionAttributes appsyncFunctionAttributes = AppsyncFunctionAttributes.builder()
 * .functionArn("functionArn")
 * .build();
 * ```
 */
public interface AppsyncFunctionAttributes {
  /**
   * the ARN of the AppSync function.
   */
  public fun functionArn(): String

  /**
   * A builder for [AppsyncFunctionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn the ARN of the AppSync function. 
     */
    public fun functionArn(functionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes.Builder =
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes.builder()

    /**
     * @param functionArn the ARN of the AppSync function. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes,
  ) : CdkObject(cdkObject), AppsyncFunctionAttributes {
    /**
     * the ARN of the AppSync function.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppsyncFunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes):
        AppsyncFunctionAttributes = CdkObjectWrappers.wrap(cdkObject) as? AppsyncFunctionAttributes
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppsyncFunctionAttributes):
        software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes
  }
}
