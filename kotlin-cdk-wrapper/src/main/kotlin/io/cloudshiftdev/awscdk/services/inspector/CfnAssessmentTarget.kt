@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Inspector::AssessmentTarget` resource is used to create Amazon Inspector assessment
 * targets, which specify the Amazon EC2 instances that will be analyzed during an assessment run.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspector.*;
 * CfnAssessmentTarget cfnAssessmentTarget = CfnAssessmentTarget.Builder.create(this,
 * "MyCfnAssessmentTarget")
 * .assessmentTargetName("assessmentTargetName")
 * .resourceGroupArn("resourceGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
public open class CfnAssessmentTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTarget,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.inspector.CfnAssessmentTarget(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssessmentTargetProps,
  ) :
      this(software.amazon.awscdk.services.inspector.CfnAssessmentTarget(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAssessmentTargetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssessmentTargetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAssessmentTargetProps(props)
  )

  /**
   * The name of the Amazon Inspector assessment target.
   */
  public open fun assessmentTargetName(): String? = unwrap(this).getAssessmentTargetName()

  /**
   * The name of the Amazon Inspector assessment target.
   */
  public open fun assessmentTargetName(`value`: String) {
    unwrap(this).setAssessmentTargetName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) that specifies the assessment target that is created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN that specifies the resource group that is used to create the assessment target.
   */
  public open fun resourceGroupArn(): String? = unwrap(this).getResourceGroupArn()

  /**
   * The ARN that specifies the resource group that is used to create the assessment target.
   */
  public open fun resourceGroupArn(`value`: String) {
    unwrap(this).setResourceGroupArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.inspector.CfnAssessmentTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Amazon Inspector assessment target.
     *
     * The name must be unique within the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
     * @param assessmentTargetName The name of the Amazon Inspector assessment target. 
     */
    public fun assessmentTargetName(assessmentTargetName: String)

    /**
     * The ARN that specifies the resource group that is used to create the assessment target.
     *
     * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and
     * Region are included in the assessment target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
     * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
     * assessment target. 
     */
    public fun resourceGroupArn(resourceGroupArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnAssessmentTarget.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget.Builder.create(scope, id)

    /**
     * The name of the Amazon Inspector assessment target.
     *
     * The name must be unique within the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
     * @param assessmentTargetName The name of the Amazon Inspector assessment target. 
     */
    override fun assessmentTargetName(assessmentTargetName: String) {
      cdkBuilder.assessmentTargetName(assessmentTargetName)
    }

    /**
     * The ARN that specifies the resource group that is used to create the assessment target.
     *
     * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and
     * Region are included in the assessment target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
     * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
     * assessment target. 
     */
    override fun resourceGroupArn(resourceGroupArn: String) {
      cdkBuilder.resourceGroupArn(resourceGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssessmentTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssessmentTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTarget):
        CfnAssessmentTarget = CfnAssessmentTarget(cdkObject)

    internal fun unwrap(wrapped: CfnAssessmentTarget):
        software.amazon.awscdk.services.inspector.CfnAssessmentTarget = wrapped.cdkObject
  }
}
