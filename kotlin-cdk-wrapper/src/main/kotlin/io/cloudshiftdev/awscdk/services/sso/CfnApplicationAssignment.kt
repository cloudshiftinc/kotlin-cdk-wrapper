@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A structure that describes an assignment of a principal to an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnApplicationAssignment cfnApplicationAssignment = CfnApplicationAssignment.Builder.create(this,
 * "MyCfnApplicationAssignment")
 * .applicationArn("applicationArn")
 * .principalId("principalId")
 * .principalType("principalType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html)
 */
public open class CfnApplicationAssignment(
  cdkObject: software.amazon.awscdk.services.sso.CfnApplicationAssignment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationAssignmentProps,
  ) :
      this(software.amazon.awscdk.services.sso.CfnApplicationAssignment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationAssignmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationAssignmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationAssignmentProps(props)
  )

  /**
   * The ARN of the application that has principals assigned.
   */
  public open fun applicationArn(): String = unwrap(this).getApplicationArn()

  /**
   * The ARN of the application that has principals assigned.
   */
  public open fun applicationArn(`value`: String) {
    unwrap(this).setApplicationArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique identifier of the principal assigned to the application.
   */
  public open fun principalId(): String = unwrap(this).getPrincipalId()

  /**
   * The unique identifier of the principal assigned to the application.
   */
  public open fun principalId(`value`: String) {
    unwrap(this).setPrincipalId(`value`)
  }

  /**
   * The type of the principal assigned to the application.
   */
  public open fun principalType(): String = unwrap(this).getPrincipalType()

  /**
   * The type of the principal assigned to the application.
   */
  public open fun principalType(`value`: String) {
    unwrap(this).setPrincipalType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sso.CfnApplicationAssignment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the application that has principals assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-applicationarn)
     * @param applicationArn The ARN of the application that has principals assigned. 
     */
    public fun applicationArn(applicationArn: String)

    /**
     * The unique identifier of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principalid)
     * @param principalId The unique identifier of the principal assigned to the application. 
     */
    public fun principalId(principalId: String)

    /**
     * The type of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principaltype)
     * @param principalType The type of the principal assigned to the application. 
     */
    public fun principalType(principalType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnApplicationAssignment.Builder =
        software.amazon.awscdk.services.sso.CfnApplicationAssignment.Builder.create(scope, id)

    /**
     * The ARN of the application that has principals assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-applicationarn)
     * @param applicationArn The ARN of the application that has principals assigned. 
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * The unique identifier of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principalid)
     * @param principalId The unique identifier of the principal assigned to the application. 
     */
    override fun principalId(principalId: String) {
      cdkBuilder.principalId(principalId)
    }

    /**
     * The type of the principal assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-applicationassignment.html#cfn-sso-applicationassignment-principaltype)
     * @param principalType The type of the principal assigned to the application. 
     */
    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build(): software.amazon.awscdk.services.sso.CfnApplicationAssignment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnApplicationAssignment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationAssignment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationAssignment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnApplicationAssignment):
        CfnApplicationAssignment = CfnApplicationAssignment(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationAssignment):
        software.amazon.awscdk.services.sso.CfnApplicationAssignment = wrapped.cdkObject as
        software.amazon.awscdk.services.sso.CfnApplicationAssignment
  }
}
