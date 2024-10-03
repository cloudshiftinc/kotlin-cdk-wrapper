@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMeteredProduct`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnMeteredProductProps cfnMeteredProductProps = CfnMeteredProductProps.builder()
 * .licenseEndpointId("licenseEndpointId")
 * .productId("productId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html)
 */
public interface CfnMeteredProductProps {
  /**
   * The Amazon EC2 identifier of the license endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
   */
  public fun licenseEndpointId(): String? = unwrap(this).getLicenseEndpointId()

  /**
   * The product ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
   */
  public fun productId(): String? = unwrap(this).getProductId()

  /**
   * A builder for [CfnMeteredProductProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint.
     */
    public fun licenseEndpointId(licenseEndpointId: String)

    /**
     * @param productId The product ID.
     */
    public fun productId(productId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnMeteredProductProps.Builder
        = software.amazon.awscdk.services.deadline.CfnMeteredProductProps.builder()

    /**
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint.
     */
    override fun licenseEndpointId(licenseEndpointId: String) {
      cdkBuilder.licenseEndpointId(licenseEndpointId)
    }

    /**
     * @param productId The product ID.
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnMeteredProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnMeteredProductProps,
  ) : CdkObject(cdkObject),
      CfnMeteredProductProps {
    /**
     * The Amazon EC2 identifier of the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
     */
    override fun licenseEndpointId(): String? = unwrap(this).getLicenseEndpointId()

    /**
     * The product ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
     */
    override fun productId(): String? = unwrap(this).getProductId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMeteredProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnMeteredProductProps):
        CfnMeteredProductProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMeteredProductProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMeteredProductProps):
        software.amazon.awscdk.services.deadline.CfnMeteredProductProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.deadline.CfnMeteredProductProps
  }
}
