@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds or updates a permission policy for a Amazon Q Business application, allowing cross-account
 * access for an ISV.
 *
 * This operation creates a new policy statement for the specified Amazon Q Business application.
 * The policy statement defines the IAM actions that the ISV is allowed to perform on the Amazon Q
 * Business application's resources.
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
   * The list of Amazon Q Business actions that the ISV is allowed to perform.
   */
  public open fun actions(): List<String> = unwrap(this).getActions()

  /**
   * The list of Amazon Q Business actions that the ISV is allowed to perform.
   */
  public open fun actions(`value`: List<String>) {
    unwrap(this).setActions(`value`)
  }

  /**
   * The list of Amazon Q Business actions that the ISV is allowed to perform.
   */
  public open fun actions(vararg `value`: String): Unit = actions(`value`.toList())

  /**
   * The unique identifier of the Amazon Q Business application.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier of the Amazon Q Business application.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   *
   */
  public open fun conditions(): Any? = unwrap(this).getConditions()

  /**
   *
   */
  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun conditions(`value`: List<Any>) {
    unwrap(this).setConditions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun conditions(vararg `value`: Any): Unit = conditions(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Provides user and group information used for filtering documents to use for generating Amazon Q
   * Business conversation responses.
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   * Provides user and group information used for filtering documents to use for generating Amazon Q
   * Business conversation responses.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * A unique identifier for the policy statement.
   */
  public open fun statementId(): String = unwrap(this).getStatementId()

  /**
   * A unique identifier for the policy statement.
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
     * The list of Amazon Q Business actions that the ISV is allowed to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    public fun actions(actions: List<String>)

    /**
     * The list of Amazon Q Business actions that the ISV is allowed to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    public fun actions(vararg actions: String)

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    public fun conditions(conditions: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    public fun conditions(conditions: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    public fun conditions(vararg conditions: Any)

    /**
     * Provides user and group information used for filtering documents to use for generating Amazon
     * Q Business conversation responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     * @param principal Provides user and group information used for filtering documents to use for
     * generating Amazon Q Business conversation responses. 
     */
    public fun principal(principal: String)

    /**
     * A unique identifier for the policy statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
     * @param statementId A unique identifier for the policy statement. 
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
     * The list of Amazon Q Business actions that the ISV is allowed to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The list of Amazon Q Business actions that the ISV is allowed to perform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-actions)
     * @param actions The list of Amazon Q Business actions that the ISV is allowed to perform. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * The unique identifier of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-applicationid)
     * @param applicationId The unique identifier of the Amazon Q Business application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-conditions)
     * @param conditions 
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * Provides user and group information used for filtering documents to use for generating Amazon
     * Q Business conversation responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-principal)
     * @param principal Provides user and group information used for filtering documents to use for
     * generating Amazon Q Business conversation responses. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * A unique identifier for the policy statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-permission.html#cfn-qbusiness-permission-statementid)
     * @param statementId A unique identifier for the policy statement. 
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

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .conditionKey("conditionKey")
   * .conditionOperator("conditionOperator")
   * .conditionValues(List.of("conditionValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html)
   */
  public interface ConditionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionkey)
     */
    public fun conditionKey(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionoperator)
     */
    public fun conditionOperator(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionvalues)
     */
    public fun conditionValues(): List<String>

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionKey the value to be set. 
       */
      public fun conditionKey(conditionKey: String)

      /**
       * @param conditionOperator the value to be set. 
       */
      public fun conditionOperator(conditionOperator: String)

      /**
       * @param conditionValues the value to be set. 
       */
      public fun conditionValues(conditionValues: List<String>)

      /**
       * @param conditionValues the value to be set. 
       */
      public fun conditionValues(vararg conditionValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty.Builder =
          software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty.builder()

      /**
       * @param conditionKey the value to be set. 
       */
      override fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
      }

      /**
       * @param conditionOperator the value to be set. 
       */
      override fun conditionOperator(conditionOperator: String) {
        cdkBuilder.conditionOperator(conditionOperator)
      }

      /**
       * @param conditionValues the value to be set. 
       */
      override fun conditionValues(conditionValues: List<String>) {
        cdkBuilder.conditionValues(conditionValues)
      }

      /**
       * @param conditionValues the value to be set. 
       */
      override fun conditionValues(vararg conditionValues: String): Unit =
          conditionValues(conditionValues.toList())

      public fun build(): software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty,
    ) : CdkObject(cdkObject),
        ConditionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionkey)
       */
      override fun conditionKey(): String = unwrap(this).getConditionKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionoperator)
       */
      override fun conditionOperator(): String = unwrap(this).getConditionOperator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-permission-condition.html#cfn-qbusiness-permission-condition-conditionvalues)
       */
      override fun conditionValues(): List<String> = unwrap(this).getConditionValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPermission.ConditionProperty
    }
  }
}
