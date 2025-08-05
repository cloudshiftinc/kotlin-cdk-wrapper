@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties to import from the VPC origin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * VpcOriginAttributes vpcOriginAttributes = VpcOriginAttributes.builder()
 * .domainName("domainName")
 * .vpcOriginArn("vpcOriginArn")
 * .vpcOriginId("vpcOriginId")
 * .build();
 * ```
 */
public interface VpcOriginAttributes {
  /**
   * The domain name of the CloudFront VPC origin endpoint configuration.
   *
   * Default: - No domain name configured
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The ARN of the VPC origin.
   *
   * At least one of vpcOriginArn and vpcOriginId must be provided.
   *
   * Default: - derived from `vpcOriginId`.
   */
  public fun vpcOriginArn(): String? = unwrap(this).getVpcOriginArn()

  /**
   * The ID of the VPC origin.
   *
   * At least one of vpcOriginArn and vpcOriginId must be provided.
   *
   * Default: - derived from `vpcOriginArn`.
   */
  public fun vpcOriginId(): String? = unwrap(this).getVpcOriginId()

  /**
   * A builder for [VpcOriginAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The domain name of the CloudFront VPC origin endpoint configuration.
     */
    public fun domainName(domainName: String)

    /**
     * @param vpcOriginArn The ARN of the VPC origin.
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     */
    public fun vpcOriginArn(vpcOriginArn: String)

    /**
     * @param vpcOriginId The ID of the VPC origin.
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     */
    public fun vpcOriginId(vpcOriginId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.VpcOriginAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.VpcOriginAttributes.builder()

    /**
     * @param domainName The domain name of the CloudFront VPC origin endpoint configuration.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param vpcOriginArn The ARN of the VPC origin.
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     */
    override fun vpcOriginArn(vpcOriginArn: String) {
      cdkBuilder.vpcOriginArn(vpcOriginArn)
    }

    /**
     * @param vpcOriginId The ID of the VPC origin.
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     */
    override fun vpcOriginId(vpcOriginId: String) {
      cdkBuilder.vpcOriginId(vpcOriginId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.VpcOriginAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginAttributes,
  ) : CdkObject(cdkObject),
      VpcOriginAttributes {
    /**
     * The domain name of the CloudFront VPC origin endpoint configuration.
     *
     * Default: - No domain name configured
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The ARN of the VPC origin.
     *
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     *
     * Default: - derived from `vpcOriginId`.
     */
    override fun vpcOriginArn(): String? = unwrap(this).getVpcOriginArn()

    /**
     * The ID of the VPC origin.
     *
     * At least one of vpcOriginArn and vpcOriginId must be provided.
     *
     * Default: - derived from `vpcOriginArn`.
     */
    override fun vpcOriginId(): String? = unwrap(this).getVpcOriginId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcOriginAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginAttributes):
        VpcOriginAttributes = CdkObjectWrappers.wrap(cdkObject) as? VpcOriginAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcOriginAttributes):
        software.amazon.awscdk.services.cloudfront.VpcOriginAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.VpcOriginAttributes
  }
}
