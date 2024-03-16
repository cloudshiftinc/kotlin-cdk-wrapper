@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAccessPointPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3objectlambda.*;
 * Object policyDocument;
 * CfnAccessPointPolicyProps cfnAccessPointPolicyProps = CfnAccessPointPolicyProps.builder()
 * .objectLambdaAccessPoint("objectLambdaAccessPoint")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html)
 */
public interface CfnAccessPointPolicyProps {
  /**
   * An access point with an attached AWS Lambda function used to access transformed data from an
   * Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-objectlambdaaccesspoint)
   */
  public fun objectLambdaAccessPoint(): String

  /**
   * Object Lambda Access Point resource policy document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * A builder for [CfnAccessPointPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
     * access transformed data from an Amazon S3 bucket. 
     */
    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String)

    /**
     * @param policyDocument Object Lambda Access Point resource policy document. 
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps.builder()

    /**
     * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
     * access transformed data from an Amazon S3 bucket. 
     */
    override fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
      cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    /**
     * @param policyDocument Object Lambda Access Point resource policy document. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps,
  ) : CdkObject(cdkObject), CfnAccessPointPolicyProps {
    /**
     * An access point with an attached AWS Lambda function used to access transformed data from an
     * Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-objectlambdaaccesspoint)
     */
    override fun objectLambdaAccessPoint(): String = unwrap(this).getObjectLambdaAccessPoint()

    /**
     * Object Lambda Access Point resource policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps):
        CfnAccessPointPolicyProps = CdkObjectWrappers.wrap(cdkObject) as CfnAccessPointPolicyProps

    internal fun unwrap(wrapped: CfnAccessPointPolicyProps):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
  }
}
