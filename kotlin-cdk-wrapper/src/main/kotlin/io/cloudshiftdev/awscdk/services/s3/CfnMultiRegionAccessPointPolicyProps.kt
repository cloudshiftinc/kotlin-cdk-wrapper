@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMultiRegionAccessPointPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Object policy;
 * CfnMultiRegionAccessPointPolicyProps cfnMultiRegionAccessPointPolicyProps =
 * CfnMultiRegionAccessPointPolicyProps.builder()
 * .mrapName("mrapName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html)
 */
public interface CfnMultiRegionAccessPointPolicyProps {
  /**
   * The name of the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
   */
  public fun mrapName(): String

  /**
   * The access policy associated with the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
   */
  public fun policy(): Any

  /**
   * A builder for [CfnMultiRegionAccessPointPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mrapName The name of the Multi-Region Access Point. 
     */
    public fun mrapName(mrapName: String)

    /**
     * @param policy The access policy associated with the Multi-Region Access Point. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.builder()

    /**
     * @param mrapName The name of the Multi-Region Access Point. 
     */
    override fun mrapName(mrapName: String) {
      cdkBuilder.mrapName(mrapName)
    }

    /**
     * @param policy The access policy associated with the Multi-Region Access Point. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps,
  ) : CdkObject(cdkObject), CfnMultiRegionAccessPointPolicyProps {
    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
     */
    override fun mrapName(): String = unwrap(this).getMrapName()

    /**
     * The access policy associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnMultiRegionAccessPointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps):
        CfnMultiRegionAccessPointPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMultiRegionAccessPointPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointPolicyProps):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
  }
}
