@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Environment variables options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * EnvironmentOptions environmentOptions = EnvironmentOptions.builder()
 * .removeInEdge(false)
 * .build();
 * ```
 */
public interface EnvironmentOptions {
  /**
   * When used in Lambda&#64;Edge via edgeArn() API, these environment variables will be removed.
   *
   * If not set, an error will be thrown.
   *
   * Default: false - using the function in Lambda@Edge will throw
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-requirements-limits.html#lambda-requirements-lambda-function-configuration)
   */
  public fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()

  /**
   * A builder for [EnvironmentOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param removeInEdge When used in Lambda&#64;Edge via edgeArn() API, these environment
     * variables will be removed.
     * If not set, an error will be thrown.
     */
    public fun removeInEdge(removeInEdge: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.lambda.EnvironmentOptions.builder()

    /**
     * @param removeInEdge When used in Lambda&#64;Edge via edgeArn() API, these environment
     * variables will be removed.
     * If not set, an error will be thrown.
     */
    override fun removeInEdge(removeInEdge: Boolean) {
      cdkBuilder.removeInEdge(removeInEdge)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions,
  ) : CdkObject(cdkObject), EnvironmentOptions {
    /**
     * When used in Lambda&#64;Edge via edgeArn() API, these environment variables will be removed.
     *
     * If not set, an error will be thrown.
     *
     * Default: false - using the function in Lambda@Edge will throw
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-requirements-limits.html#lambda-requirements-lambda-function-configuration)
     */
    override fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions):
        EnvironmentOptions = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.lambda.EnvironmentOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.EnvironmentOptions
  }
}
