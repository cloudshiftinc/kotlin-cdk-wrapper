@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnProductSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnProductSubscriptionProps cfnProductSubscriptionProps = CfnProductSubscriptionProps.builder()
 * .productArn("productArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html)
 */
public interface CfnProductSubscriptionProps {
  /**
   * The ARN of the product to enable the integration for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html#cfn-securityhub-productsubscription-productarn)
   */
  public fun productArn(): String

  /**
   * A builder for [CfnProductSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param productArn The ARN of the product to enable the integration for. 
     */
    public fun productArn(productArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps.builder()

    /**
     * @param productArn The ARN of the product to enable the integration for. 
     */
    override fun productArn(productArn: String) {
      cdkBuilder.productArn(productArn)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps,
  ) : CdkObject(cdkObject), CfnProductSubscriptionProps {
    /**
     * The ARN of the product to enable the integration for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-productsubscription.html#cfn-securityhub-productsubscription-productarn)
     */
    override fun productArn(): String = unwrap(this).getProductArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProductSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps):
        CfnProductSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnProductSubscriptionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProductSubscriptionProps):
        software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps
  }
}
