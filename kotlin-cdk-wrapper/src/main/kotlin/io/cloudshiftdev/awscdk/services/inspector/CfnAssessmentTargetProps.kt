@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAssessmentTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspector.*;
 * CfnAssessmentTargetProps cfnAssessmentTargetProps = CfnAssessmentTargetProps.builder()
 * .assessmentTargetName("assessmentTargetName")
 * .resourceGroupArn("resourceGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
public interface CfnAssessmentTargetProps {
  /**
   * The name of the Amazon Inspector assessment target.
   *
   * The name must be unique within the AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
   */
  public fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

  /**
   * The ARN that specifies the resource group that is used to create the assessment target.
   *
   * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and Region
   * are included in the assessment target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
   */
  public fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()

  /**
   * A builder for [CfnAssessmentTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assessmentTargetName The name of the Amazon Inspector assessment target.
     * The name must be unique within the AWS account .
     */
    public fun assessmentTargetName(assessmentTargetName: String)

    /**
     * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
     * assessment target.
     * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and
     * Region are included in the assessment target.
     */
    public fun resourceGroupArn(resourceGroupArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.builder()

    /**
     * @param assessmentTargetName The name of the Amazon Inspector assessment target.
     * The name must be unique within the AWS account .
     */
    override fun assessmentTargetName(assessmentTargetName: String) {
      cdkBuilder.assessmentTargetName(assessmentTargetName)
    }

    /**
     * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
     * assessment target.
     * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and
     * Region are included in the assessment target.
     */
    override fun resourceGroupArn(resourceGroupArn: String) {
      cdkBuilder.resourceGroupArn(resourceGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps,
  ) : CdkObject(cdkObject),
      CfnAssessmentTargetProps {
    /**
     * The name of the Amazon Inspector assessment target.
     *
     * The name must be unique within the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
     */
    override fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

    /**
     * The ARN that specifies the resource group that is used to create the assessment target.
     *
     * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and
     * Region are included in the assessment target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
     */
    override fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps):
        CfnAssessmentTargetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAssessmentTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTargetProps):
        software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
  }
}
