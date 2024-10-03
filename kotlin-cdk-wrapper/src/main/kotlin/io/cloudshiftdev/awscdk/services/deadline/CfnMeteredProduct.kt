@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a metered product.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnMeteredProduct cfnMeteredProduct = CfnMeteredProduct.Builder.create(this,
 * "MyCfnMeteredProduct")
 * .licenseEndpointId("licenseEndpointId")
 * .productId("productId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html)
 */
public open class CfnMeteredProduct(
  cdkObject: software.amazon.awscdk.services.deadline.CfnMeteredProduct,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.deadline.CfnMeteredProduct(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMeteredProductProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnMeteredProduct(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMeteredProductProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMeteredProductProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMeteredProductProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the metered product.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The family to which the metered product belongs.
   */
  public open fun attrFamily(): String = unwrap(this).getAttrFamily()

  /**
   * The port on which the metered product should run.
   */
  public open fun attrPort(): Number = unwrap(this).getAttrPort()

  /**
   * The vendor.
   */
  public open fun attrVendor(): String = unwrap(this).getAttrVendor()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon EC2 identifier of the license endpoint.
   */
  public open fun licenseEndpointId(): String? = unwrap(this).getLicenseEndpointId()

  /**
   * The Amazon EC2 identifier of the license endpoint.
   */
  public open fun licenseEndpointId(`value`: String) {
    unwrap(this).setLicenseEndpointId(`value`)
  }

  /**
   * The product ID.
   */
  public open fun productId(): String? = unwrap(this).getProductId()

  /**
   * The product ID.
   */
  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnMeteredProduct].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon EC2 identifier of the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint. 
     */
    public fun licenseEndpointId(licenseEndpointId: String)

    /**
     * The product ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
     * @param productId The product ID. 
     */
    public fun productId(productId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnMeteredProduct.Builder =
        software.amazon.awscdk.services.deadline.CfnMeteredProduct.Builder.create(scope, id)

    /**
     * The Amazon EC2 identifier of the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-licenseendpointid)
     * @param licenseEndpointId The Amazon EC2 identifier of the license endpoint. 
     */
    override fun licenseEndpointId(licenseEndpointId: String) {
      cdkBuilder.licenseEndpointId(licenseEndpointId)
    }

    /**
     * The product ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-meteredproduct.html#cfn-deadline-meteredproduct-productid)
     * @param productId The product ID. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnMeteredProduct =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnMeteredProduct.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMeteredProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMeteredProduct(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnMeteredProduct):
        CfnMeteredProduct = CfnMeteredProduct(cdkObject)

    internal fun unwrap(wrapped: CfnMeteredProduct):
        software.amazon.awscdk.services.deadline.CfnMeteredProduct = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnMeteredProduct
  }
}
