@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * // the properties below are optional
 * .conditions(List.of(ConditionProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionOperator("conditionOperator")
 * .conditionValues(List.of("conditionValues"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html)
 */
public interface CfnPermissionProps {
  /**
   * The list of Amazon Q Business actions that the ISV is allowed to perform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
   */
  public fun actions(): List<String>

  /**
   * The unique identifier of the Amazon Q Business application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
   */
  public fun applicationId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
   */
  public fun conditions(): Any? = unwrap(this).getConditions()

  /**
   * Provides user and group information used for filtering documents to use for generating Amazon Q
   * Business conversation responses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
   */
  public fun principal(): String

  /**
   * A unique identifier for the policy statement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
   */
  public fun statementId(): String

  /**
   * A builder for [CfnPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    public fun actions(vararg actions: String)

    /**
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param conditions the value to be set.
     */
    public fun conditions(conditions: IResolvable)

    /**
     * @param conditions the value to be set.
     */
    public fun conditions(conditions: List<Any>)

    /**
     * @param conditions the value to be set.
     */
    public fun conditions(vararg conditions: Any)

    /**
     * @param principal Provides user and group information used for filtering documents to use for
     * generating Amazon Q Business conversation responses. 
     */
    public fun principal(principal: String)

    /**
     * @param statementId A unique identifier for the policy statement. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnPermissionProps.builder()

    /**
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param conditions the value to be set.
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param conditions the value to be set.
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param conditions the value to be set.
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * @param principal Provides user and group information used for filtering documents to use for
     * generating Amazon Q Business conversation responses. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param statementId A unique identifier for the policy statement. 
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
     * The list of Amazon Q Business actions that the ISV is allowed to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     */
    override fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * Provides user and group information used for filtering documents to use for generating Amazon
     * Q Business conversation responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * A unique identifier for the policy statement.
     *
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
