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
 * ResourceBindOptions resourceBindOptions = ResourceBindOptions.builder()
 * .resourceProperty("resourceProperty")
 * .build();
 * ```
 */
public interface ResourceBindOptions {
  /**
   * The name of the CloudFormation property to annotate with asset metadata.
   *
   * Default: Code
   *
   * [Documentation](https://github.com/aws/aws-cdk/issues/1432)
   */
  public fun resourceProperty(): String? = unwrap(this).getResourceProperty()

  /**
   * A builder for [ResourceBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceProperty The name of the CloudFormation property to annotate with asset
     * metadata.
     */
    public fun resourceProperty(resourceProperty: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.ResourceBindOptions.Builder =
        software.amazon.awscdk.services.lambda.ResourceBindOptions.builder()

    /**
     * @param resourceProperty The name of the CloudFormation property to annotate with asset
     * metadata.
     */
    override fun resourceProperty(resourceProperty: String) {
      cdkBuilder.resourceProperty(resourceProperty)
    }

    public fun build(): software.amazon.awscdk.services.lambda.ResourceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.ResourceBindOptions,
  ) : CdkObject(cdkObject),
      ResourceBindOptions {
    /**
     * The name of the CloudFormation property to annotate with asset metadata.
     *
     * Default: Code
     *
     * [Documentation](https://github.com/aws/aws-cdk/issues/1432)
     */
    override fun resourceProperty(): String? = unwrap(this).getResourceProperty()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ResourceBindOptions):
        ResourceBindOptions = CdkObjectWrappers.wrap(cdkObject) as? ResourceBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceBindOptions):
        software.amazon.awscdk.services.lambda.ResourceBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.ResourceBindOptions
  }
}
