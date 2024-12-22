@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::QBusiness::Permission Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
 * .actions(List.of("actions"))
 * .applicationId("applicationId")
 * .principal("principal")
 * .statementId("statementId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html)
 */
public open class CfnPermission(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermission,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnPermission(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPermissionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPermissionProps(props)
  )

  /**
   *
   */
  public open fun actions(): List<String> = unwrap(this).getActions()

  /**
   *
   */
  public open fun actions(`value`: List<String>) {
    unwrap(this).setActions(`value`)
  }

  /**
   *
   */
  public open fun actions(vararg `value`: String): Unit = actions(`value`.toList())

  /**
   *
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   *
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
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
   *
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   *
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   *
   */
  public open fun statementId(): String = unwrap(this).getStatementId()

  /**
   *
   */
  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnPermission].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions 
     */
    public fun actions(actions: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions 
     */
    public fun actions(vararg actions: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     * @param applicationId 
     */
    public fun applicationId(applicationId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     * @param principal 
     */
    public fun principal(principal: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
     * @param statementId 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPermission.Builder =
        software.amazon.awscdk.services.qbusiness.CfnPermission.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     * @param applicationId 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     * @param principal 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
     * @param statementId 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnPermission.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermission):
        CfnPermission = CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission):
        software.amazon.awscdk.services.qbusiness.CfnPermission = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnPermission
  }
}
