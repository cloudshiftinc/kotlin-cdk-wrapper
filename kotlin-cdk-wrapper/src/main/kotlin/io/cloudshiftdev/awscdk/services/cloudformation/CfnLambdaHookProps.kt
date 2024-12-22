@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLambdaHook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnLambdaHookProps cfnLambdaHookProps = CfnLambdaHookProps.builder()
 * .alias("alias")
 * .executionRole("executionRole")
 * .failureMode("failureMode")
 * .hookStatus("hookStatus")
 * .lambdaFunction("lambdaFunction")
 * .targetOperations(List.of("targetOperations"))
 * // the properties below are optional
 * .stackFilters(StackFiltersProperty.builder()
 * .filteringCriteria("filteringCriteria")
 * // the properties below are optional
 * .stackNames(StackNamesProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build())
 * .stackRoles(StackRolesProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build())
 * .build())
 * .targetFilters(TargetFiltersProperty.builder()
 * .actions(List.of("actions"))
 * .invocationPoints(List.of("invocationPoints"))
 * .targetNames(List.of("targetNames"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html)
 */
public interface CfnLambdaHookProps {
  /**
   * The type name alias for the Hook. This alias must be unique per account and Region.
   *
   * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
   * example, `Private::Lambda::MyTestHook` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-alias)
   */
  public fun alias(): String

  /**
   * The IAM role that the Hook assumes to invoke your Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-executionrole)
   */
  public fun executionRole(): String

  /**
   * Specifies how the Hook responds when the Lambda function invoked by the Hook returns a `FAILED`
   * response.
   *
   * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict compliance
   * or security policies.
   * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
   * non-critical validations or informational checks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-failuremode)
   */
  public fun failureMode(): String

  /**
   * Specifies if the Hook is `ENABLED` or `DISABLED` .
   *
   * Default: - "ENABLED"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-hookstatus)
   */
  public fun hookStatus(): String

  /**
   * Specifies the Lambda function for the Hook. You can use:.
   *
   * * The full Amazon Resource Name (ARN) without a suffix.
   * * A qualified ARN with a version or alias suffix.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-lambdafunction)
   */
  public fun lambdaFunction(): String

  /**
   * Specifies the stack level filters for the Hook.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
   */
  public fun stackFilters(): Any? = unwrap(this).getStackFilters()

  /**
   * Specifies the target filters for the Hook.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
   */
  public fun targetFilters(): Any? = unwrap(this).getTargetFilters()

  /**
   * Specifies which type of operation the Hook is run against.
   *
   * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
   */
  public fun targetOperations(): List<String>

  /**
   * A builder for [CfnLambdaHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Lambda::MyTestHook` .
     */
    public fun alias(alias: String)

    /**
     * @param executionRole The IAM role that the Hook assumes to invoke your Lambda function. 
     */
    public fun executionRole(executionRole: String)

    /**
     * @param failureMode Specifies how the Hook responds when the Lambda function invoked by the
     * Hook returns a `FAILED` response. 
     * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict
     * compliance or security policies.
     * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
     * non-critical validations or informational checks.
     */
    public fun failureMode(failureMode: String)

    /**
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    public fun hookStatus(hookStatus: String)

    /**
     * @param lambdaFunction Specifies the Lambda function for the Hook. You can use:. 
     * * The full Amazon Resource Name (ARN) without a suffix.
     * * A qualified ARN with a version or alias suffix.
     */
    public fun lambdaFunction(lambdaFunction: String)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    public fun stackFilters(stackFilters: IResolvable)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    public fun stackFilters(stackFilters: CfnLambdaHook.StackFiltersProperty)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6b6e11cd90dda0bad6186839e844e3785ba994f438316d80edaab88ae832c66")
    public fun stackFilters(stackFilters: CfnLambdaHook.StackFiltersProperty.Builder.() -> Unit)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    public fun targetFilters(targetFilters: IResolvable)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    public fun targetFilters(targetFilters: CfnLambdaHook.TargetFiltersProperty)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7be9b3b7ce3abad58e6d0f65fda1a60effebfafcd01e5b5b3e268362047fe013")
    public fun targetFilters(targetFilters: CfnLambdaHook.TargetFiltersProperty.Builder.() -> Unit)

    /**
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    public fun targetOperations(targetOperations: List<String>)

    /**
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    public fun targetOperations(vararg targetOperations: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps.builder()

    /**
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Lambda::MyTestHook` .
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param executionRole The IAM role that the Hook assumes to invoke your Lambda function. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param failureMode Specifies how the Hook responds when the Lambda function invoked by the
     * Hook returns a `FAILED` response. 
     * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict
     * compliance or security policies.
     * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
     * non-critical validations or informational checks.
     */
    override fun failureMode(failureMode: String) {
      cdkBuilder.failureMode(failureMode)
    }

    /**
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    override fun hookStatus(hookStatus: String) {
      cdkBuilder.hookStatus(hookStatus)
    }

    /**
     * @param lambdaFunction Specifies the Lambda function for the Hook. You can use:. 
     * * The full Amazon Resource Name (ARN) without a suffix.
     * * A qualified ARN with a version or alias suffix.
     */
    override fun lambdaFunction(lambdaFunction: String) {
      cdkBuilder.lambdaFunction(lambdaFunction)
    }

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    override fun stackFilters(stackFilters: IResolvable) {
      cdkBuilder.stackFilters(stackFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    override fun stackFilters(stackFilters: CfnLambdaHook.StackFiltersProperty) {
      cdkBuilder.stackFilters(stackFilters.let(CfnLambdaHook.StackFiltersProperty.Companion::unwrap))
    }

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6b6e11cd90dda0bad6186839e844e3785ba994f438316d80edaab88ae832c66")
    override fun stackFilters(stackFilters: CfnLambdaHook.StackFiltersProperty.Builder.() -> Unit):
        Unit = stackFilters(CfnLambdaHook.StackFiltersProperty(stackFilters))

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    override fun targetFilters(targetFilters: IResolvable) {
      cdkBuilder.targetFilters(targetFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    override fun targetFilters(targetFilters: CfnLambdaHook.TargetFiltersProperty) {
      cdkBuilder.targetFilters(targetFilters.let(CfnLambdaHook.TargetFiltersProperty.Companion::unwrap))
    }

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7be9b3b7ce3abad58e6d0f65fda1a60effebfafcd01e5b5b3e268362047fe013")
    override
        fun targetFilters(targetFilters: CfnLambdaHook.TargetFiltersProperty.Builder.() -> Unit):
        Unit = targetFilters(CfnLambdaHook.TargetFiltersProperty(targetFilters))

    /**
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    override fun targetOperations(targetOperations: List<String>) {
      cdkBuilder.targetOperations(targetOperations)
    }

    /**
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    override fun targetOperations(vararg targetOperations: String): Unit =
        targetOperations(targetOperations.toList())

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps,
  ) : CdkObject(cdkObject),
      CfnLambdaHookProps {
    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Lambda::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-alias)
     */
    override fun alias(): String = unwrap(this).getAlias()

    /**
     * The IAM role that the Hook assumes to invoke your Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-executionrole)
     */
    override fun executionRole(): String = unwrap(this).getExecutionRole()

    /**
     * Specifies how the Hook responds when the Lambda function invoked by the Hook returns a
     * `FAILED` response.
     *
     * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict
     * compliance or security policies.
     * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
     * non-critical validations or informational checks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-failuremode)
     */
    override fun failureMode(): String = unwrap(this).getFailureMode()

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-hookstatus)
     */
    override fun hookStatus(): String = unwrap(this).getHookStatus()

    /**
     * Specifies the Lambda function for the Hook. You can use:.
     *
     * * The full Amazon Resource Name (ARN) without a suffix.
     * * A qualified ARN with a version or alias suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-lambdafunction)
     */
    override fun lambdaFunction(): String = unwrap(this).getLambdaFunction()

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     */
    override fun stackFilters(): Any? = unwrap(this).getStackFilters()

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     */
    override fun targetFilters(): Any? = unwrap(this).getTargetFilters()

    /**
     * Specifies which type of operation the Hook is run against.
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
     */
    override fun targetOperations(): List<String> = unwrap(this).getTargetOperations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLambdaHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps):
        CfnLambdaHookProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLambdaHookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLambdaHookProps):
        software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnLambdaHookProps
  }
}
