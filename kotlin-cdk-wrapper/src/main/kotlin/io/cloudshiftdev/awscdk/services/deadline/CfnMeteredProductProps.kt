@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
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
 * .family("family")
 * .licenseEndpointId("licenseEndpointId")
 * .port(123)
 * .productId("productId")
 * .vendor("vendor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html)
 */
public interface CfnMeteredProductProps {
  /**
   * The family to which the metered product belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-family)
   */
  public fun family(): String? = unwrap(this).getFamily()

  /**
   * The Amazon EC2 identifier of the license endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
   */
  public fun licenseEndpointId(): String? = unwrap(this).getLicenseEndpointId()

  /**
   * The port on which the metered product should run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The product ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
   */
  public fun productId(): String? = unwrap(this).getProductId()

  /**
   * The vendor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-vendor)
   */
  public fun vendor(): String? = unwrap(this).getVendor()

  /**
   * A builder for [CfnMeteredProductProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param family The family to which the metered product belongs.
     */
    public fun family(family: String)

    /**
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint.
     */
    public fun licenseEndpointId(licenseEndpointId: String)

    /**
     * @param port The port on which the metered product should run.
     */
    public fun port(port: Number)

    /**
     * @param productId The product ID.
     */
    public fun productId(productId: String)

    /**
     * @param vendor The vendor.
     */
    public fun vendor(vendor: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnMeteredProductProps.Builder
        = software.amazon.awscdk.services.deadline.CfnMeteredProductProps.builder()

    /**
     * @param family The family to which the metered product belongs.
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint.
     */
    override fun licenseEndpointId(licenseEndpointId: String) {
      cdkBuilder.licenseEndpointId(licenseEndpointId)
    }

    /**
     * @param port The port on which the metered product should run.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param productId The product ID.
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param vendor The vendor.
     */
    override fun vendor(vendor: String) {
      cdkBuilder.vendor(vendor)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnMeteredProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnMeteredProductProps,
  ) : CdkObject(cdkObject), CfnMeteredProductProps {
    /**
     * The family to which the metered product belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-family)
     */
    override fun family(): String? = unwrap(this).getFamily()

    /**
     * The Amazon EC2 identifier of the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
     */
    override fun licenseEndpointId(): String? = unwrap(this).getLicenseEndpointId()

    /**
     * The port on which the metered product should run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The product ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
     */
    override fun productId(): String? = unwrap(this).getProductId()

    /**
     * The vendor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-vendor)
     */
    override fun vendor(): String? = unwrap(this).getVendor()
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
