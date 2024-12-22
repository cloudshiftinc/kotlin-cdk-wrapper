@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
 * .actions(List.of("actions"))
 * .applicationId("applicationId")
 * .principal("principal")
 * .statementId("statementId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html)
 */
public interface CfnPermissionProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
   */
  public fun actions(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
   */
  public fun applicationId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
   */
  public fun principal(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
   */
  public fun statementId(): String

  /**
   * A builder for [CfnPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions the value to be set. 
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions the value to be set. 
     */
    public fun actions(vararg actions: String)

    /**
     * @param applicationId the value to be set. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param principal the value to be set. 
     */
    public fun principal(principal: String)

    /**
     * @param statementId the value to be set. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnPermissionProps.builder()

    /**
     * @param actions the value to be set. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions the value to be set. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param applicationId the value to be set. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param principal the value to be set. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param statementId the value to be set. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermissionProps,
  ) : CdkObject(cdkObject),
      CfnPermissionProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
     */
    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermissionProps):
        CfnPermissionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPermissionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.qbusiness.CfnPermissionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnPermissionProps
  }
}
