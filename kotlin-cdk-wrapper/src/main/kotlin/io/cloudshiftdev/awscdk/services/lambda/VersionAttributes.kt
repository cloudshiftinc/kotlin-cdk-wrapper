@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function function_;
 * VersionAttributes versionAttributes = VersionAttributes.builder()
 * .lambda(function_)
 * .version("version")
 * .build();
 * ```
 */
public interface VersionAttributes {
  /**
   * The lambda function.
   */
  public fun lambda(): IFunction

  /**
   * The version.
   */
  public fun version(): String

  /**
   * A builder for [VersionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lambda The lambda function. 
     */
    public fun lambda(lambda: IFunction)

    /**
     * @param version The version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionAttributes.Builder =
        software.amazon.awscdk.services.lambda.VersionAttributes.builder()

    /**
     * @param lambda The lambda function. 
     */
    override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction::unwrap))
    }

    /**
     * @param version The version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.VersionAttributes,
  ) : CdkObject(cdkObject), VersionAttributes {
    /**
     * The lambda function.
     */
    override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

    /**
     * The version.
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VersionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionAttributes):
        VersionAttributes = CdkObjectWrappers.wrap(cdkObject) as? VersionAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionAttributes):
        software.amazon.awscdk.services.lambda.VersionAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.VersionAttributes
  }
}
