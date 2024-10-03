@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApplicationAssignment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnApplicationAssignmentProps cfnApplicationAssignmentProps =
 * CfnApplicationAssignmentProps.builder()
 * .applicationArn("applicationArn")
 * .principalId("principalId")
 * .principalType("principalType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html)
 */
public interface CfnApplicationAssignmentProps {
  /**
   * The ARN of the application that has principals assigned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-applicationarn)
   */
  public fun applicationArn(): String

  /**
   * The unique identifier of the principal assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principalid)
   */
  public fun principalId(): String

  /**
   * The type of the principal assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principaltype)
   */
  public fun principalType(): String

  /**
   * A builder for [CfnApplicationAssignmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationArn The ARN of the application that has principals assigned. 
     */
    public fun applicationArn(applicationArn: String)

    /**
     * @param principalId The unique identifier of the principal assigned to the application. 
     */
    public fun principalId(principalId: String)

    /**
     * @param principalType The type of the principal assigned to the application. 
     */
    public fun principalType(principalType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps.Builder =
        software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps.builder()

    /**
     * @param applicationArn The ARN of the application that has principals assigned. 
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * @param principalId The unique identifier of the principal assigned to the application. 
     */
    override fun principalId(principalId: String) {
      cdkBuilder.principalId(principalId)
    }

    /**
     * @param principalType The type of the principal assigned to the application. 
     */
    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build(): software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps,
  ) : CdkObject(cdkObject),
      CfnApplicationAssignmentProps {
    /**
     * The ARN of the application that has principals assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-applicationarn)
     */
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    /**
     * The unique identifier of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principalid)
     */
    override fun principalId(): String = unwrap(this).getPrincipalId()

    /**
     * The type of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principaltype)
     */
    override fun principalType(): String = unwrap(this).getPrincipalType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationAssignmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps):
        CfnApplicationAssignmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnApplicationAssignmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationAssignmentProps):
        software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sso.CfnApplicationAssignmentProps
  }
}
