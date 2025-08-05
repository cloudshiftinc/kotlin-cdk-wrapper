@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::LambdaHook` resource creates and activates a Lambda Hook.
 *
 * You can use a Lambda Hook to evaluate your resources before allowing stack operations. This
 * resource forwards requests for resource evaluation to a Lambda function.
 *
 * For more information, see [Lambda
 * Hooks](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/lambda-hooks.html) in
 * the *AWS CloudFormation Hooks User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnLambdaHook cfnLambdaHook = CfnLambdaHook.Builder.create(this, "MyCfnLambdaHook")
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
 * .targets(List.of(HookTargetProperty.builder()
 * .action("action")
 * .invocationPoint("invocationPoint")
 * .targetName("targetName")
 * .build()))
 * // the properties below are optional
 * .actions(List.of("actions"))
 * .invocationPoints(List.of("invocationPoints"))
 * .targetNames(List.of("targetNames"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html)
 */
public open class CfnLambdaHook(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLambdaHookProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnLambdaHook(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLambdaHookProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLambdaHookProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLambdaHookProps(props)
  )

  /**
   * The type name alias for the Hook.
   *
   * This alias must be unique per account and Region.
   */
  public open fun alias(): String = unwrap(this).getAlias()

  /**
   * The type name alias for the Hook.
   *
   * This alias must be unique per account and Region.
   */
  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  /**
   * Returns the ARN of a Lambda Hook.
   */
  public open fun attrHookArn(): String = unwrap(this).getAttrHookArn()

  /**
   * The IAM role that the Hook assumes to invoke your Lambda function.
   */
  public open fun executionRole(): String = unwrap(this).getExecutionRole()

  /**
   * The IAM role that the Hook assumes to invoke your Lambda function.
   */
  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  /**
   * Specifies how the Hook responds when the Lambda function invoked by the Hook returns a `FAILED`
   * response.
   */
  public open fun failureMode(): String = unwrap(this).getFailureMode()

  /**
   * Specifies how the Hook responds when the Lambda function invoked by the Hook returns a `FAILED`
   * response.
   */
  public open fun failureMode(`value`: String) {
    unwrap(this).setFailureMode(`value`)
  }

  /**
   * Specifies if the Hook is `ENABLED` or `DISABLED` .
   */
  public open fun hookStatus(): String = unwrap(this).getHookStatus()

  /**
   * Specifies if the Hook is `ENABLED` or `DISABLED` .
   */
  public open fun hookStatus(`value`: String) {
    unwrap(this).setHookStatus(`value`)
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
   * Specifies the Lambda function for the Hook.
   *
   * You can use:.
   */
  public open fun lambdaFunction(): String = unwrap(this).getLambdaFunction()

  /**
   * Specifies the Lambda function for the Hook.
   *
   * You can use:.
   */
  public open fun lambdaFunction(`value`: String) {
    unwrap(this).setLambdaFunction(`value`)
  }

  /**
   * Specifies the stack level filters for the Hook.
   */
  public open fun stackFilters(): Any? = unwrap(this).getStackFilters()

  /**
   * Specifies the stack level filters for the Hook.
   */
  public open fun stackFilters(`value`: IResolvable) {
    unwrap(this).setStackFilters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the stack level filters for the Hook.
   */
  public open fun stackFilters(`value`: StackFiltersProperty) {
    unwrap(this).setStackFilters(`value`.let(StackFiltersProperty.Companion::unwrap))
  }

  /**
   * Specifies the stack level filters for the Hook.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ebb2b7033c53816d8ce18f29eccbd5ea3e40d98d526a4ae354e4f6d014433be")
  public open fun stackFilters(`value`: StackFiltersProperty.Builder.() -> Unit): Unit =
      stackFilters(StackFiltersProperty(`value`))

  /**
   * Specifies the target filters for the Hook.
   */
  public open fun targetFilters(): Any? = unwrap(this).getTargetFilters()

  /**
   * Specifies the target filters for the Hook.
   */
  public open fun targetFilters(`value`: IResolvable) {
    unwrap(this).setTargetFilters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the target filters for the Hook.
   */
  public open fun targetFilters(`value`: TargetFiltersProperty) {
    unwrap(this).setTargetFilters(`value`.let(TargetFiltersProperty.Companion::unwrap))
  }

  /**
   * Specifies the target filters for the Hook.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("89bde24514f386fe65a7556f52d74bf0dd6e2cb166c84380e26a043f089fa404")
  public open fun targetFilters(`value`: TargetFiltersProperty.Builder.() -> Unit): Unit =
      targetFilters(TargetFiltersProperty(`value`))

  /**
   * Specifies the list of operations the Hook is run against.
   */
  public open fun targetOperations(): List<String> = unwrap(this).getTargetOperations()

  /**
   * Specifies the list of operations the Hook is run against.
   */
  public open fun targetOperations(`value`: List<String>) {
    unwrap(this).setTargetOperations(`value`)
  }

  /**
   * Specifies the list of operations the Hook is run against.
   */
  public open fun targetOperations(vararg `value`: String): Unit =
      targetOperations(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnLambdaHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Lambda::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-alias)
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     */
    public fun alias(alias: String)

    /**
     * The IAM role that the Hook assumes to invoke your Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-executionrole)
     * @param executionRole The IAM role that the Hook assumes to invoke your Lambda function. 
     */
    public fun executionRole(executionRole: String)

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
     * @param failureMode Specifies how the Hook responds when the Lambda function invoked by the
     * Hook returns a `FAILED` response. 
     */
    public fun failureMode(failureMode: String)

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-hookstatus)
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    public fun hookStatus(hookStatus: String)

    /**
     * Specifies the Lambda function for the Hook. You can use:.
     *
     * * The full Amazon Resource Name (ARN) without a suffix.
     * * A qualified ARN with a version or alias suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-lambdafunction)
     * @param lambdaFunction Specifies the Lambda function for the Hook. You can use:. 
     */
    public fun lambdaFunction(lambdaFunction: String)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    public fun stackFilters(stackFilters: IResolvable)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    public fun stackFilters(stackFilters: StackFiltersProperty)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69401f56ef357ba6f0a4cb86abc16e71f26c8a5b49daaf55d16ee5903c700e4d")
    public fun stackFilters(stackFilters: StackFiltersProperty.Builder.() -> Unit)

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    public fun targetFilters(targetFilters: IResolvable)

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    public fun targetFilters(targetFilters: TargetFiltersProperty)

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5870513a364f8411aad23c0eca831fb32a8614b19873cdfcea2f1c70a919f2f")
    public fun targetFilters(targetFilters: TargetFiltersProperty.Builder.() -> Unit)

    /**
     * Specifies the list of operations the Hook is run against.
     *
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     */
    public fun targetOperations(targetOperations: List<String>)

    /**
     * Specifies the list of operations the Hook is run against.
     *
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     */
    public fun targetOperations(vararg targetOperations: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.Builder =
        software.amazon.awscdk.services.cloudformation.CfnLambdaHook.Builder.create(scope, id)

    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Lambda::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-alias)
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * The IAM role that the Hook assumes to invoke your Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-executionrole)
     * @param executionRole The IAM role that the Hook assumes to invoke your Lambda function. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

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
     * @param failureMode Specifies how the Hook responds when the Lambda function invoked by the
     * Hook returns a `FAILED` response. 
     */
    override fun failureMode(failureMode: String) {
      cdkBuilder.failureMode(failureMode)
    }

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-hookstatus)
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    override fun hookStatus(hookStatus: String) {
      cdkBuilder.hookStatus(hookStatus)
    }

    /**
     * Specifies the Lambda function for the Hook. You can use:.
     *
     * * The full Amazon Resource Name (ARN) without a suffix.
     * * A qualified ARN with a version or alias suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-lambdafunction)
     * @param lambdaFunction Specifies the Lambda function for the Hook. You can use:. 
     */
    override fun lambdaFunction(lambdaFunction: String) {
      cdkBuilder.lambdaFunction(lambdaFunction)
    }

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    override fun stackFilters(stackFilters: IResolvable) {
      cdkBuilder.stackFilters(stackFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    override fun stackFilters(stackFilters: StackFiltersProperty) {
      cdkBuilder.stackFilters(stackFilters.let(StackFiltersProperty.Companion::unwrap))
    }

    /**
     * Specifies the stack level filters for the Hook.
     *
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69401f56ef357ba6f0a4cb86abc16e71f26c8a5b49daaf55d16ee5903c700e4d")
    override fun stackFilters(stackFilters: StackFiltersProperty.Builder.() -> Unit): Unit =
        stackFilters(StackFiltersProperty(stackFilters))

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    override fun targetFilters(targetFilters: IResolvable) {
      cdkBuilder.targetFilters(targetFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    override fun targetFilters(targetFilters: TargetFiltersProperty) {
      cdkBuilder.targetFilters(targetFilters.let(TargetFiltersProperty.Companion::unwrap))
    }

    /**
     * Specifies the target filters for the Hook.
     *
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5870513a364f8411aad23c0eca831fb32a8614b19873cdfcea2f1c70a919f2f")
    override fun targetFilters(targetFilters: TargetFiltersProperty.Builder.() -> Unit): Unit =
        targetFilters(TargetFiltersProperty(targetFilters))

    /**
     * Specifies the list of operations the Hook is run against.
     *
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     */
    override fun targetOperations(targetOperations: List<String>) {
      cdkBuilder.targetOperations(targetOperations)
    }

    /**
     * Specifies the list of operations the Hook is run against.
     *
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-lambdahook.html#cfn-cloudformation-lambdahook-targetoperations)
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     */
    override fun targetOperations(vararg targetOperations: String): Unit =
        targetOperations(targetOperations.toList())

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnLambdaHook =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnLambdaHook.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLambdaHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLambdaHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook):
        CfnLambdaHook = CfnLambdaHook(cdkObject)

    internal fun unwrap(wrapped: CfnLambdaHook):
        software.amazon.awscdk.services.cloudformation.CfnLambdaHook = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnLambdaHook
  }

  /**
   * Hook targets are the destination where hooks will be invoked against.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * HookTargetProperty hookTargetProperty = HookTargetProperty.builder()
   * .action("action")
   * .invocationPoint("invocationPoint")
   * .targetName("targetName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html)
   */
  public interface HookTargetProperty {
    /**
     * Target actions are the type of operation hooks will be executed at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-action)
     */
    public fun action(): String

    /**
     * Invocation points are the point in provisioning workflow where hooks will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-invocationpoint)
     */
    public fun invocationPoint(): String

    /**
     * Type name of hook target.
     *
     * Hook targets are the destination where hooks will be invoked against.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-targetname)
     */
    public fun targetName(): String

    /**
     * A builder for [HookTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Target actions are the type of operation hooks will be executed at. 
       */
      public fun action(action: String)

      /**
       * @param invocationPoint Invocation points are the point in provisioning workflow where hooks
       * will be executed. 
       */
      public fun invocationPoint(invocationPoint: String)

      /**
       * @param targetName Type name of hook target. 
       * Hook targets are the destination where hooks will be invoked against.
       */
      public fun targetName(targetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty.Builder =
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty.builder()

      /**
       * @param action Target actions are the type of operation hooks will be executed at. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param invocationPoint Invocation points are the point in provisioning workflow where hooks
       * will be executed. 
       */
      override fun invocationPoint(invocationPoint: String) {
        cdkBuilder.invocationPoint(invocationPoint)
      }

      /**
       * @param targetName Type name of hook target. 
       * Hook targets are the destination where hooks will be invoked against.
       */
      override fun targetName(targetName: String) {
        cdkBuilder.targetName(targetName)
      }

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty,
    ) : CdkObject(cdkObject),
        HookTargetProperty {
      /**
       * Target actions are the type of operation hooks will be executed at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * Invocation points are the point in provisioning workflow where hooks will be executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-invocationpoint)
       */
      override fun invocationPoint(): String = unwrap(this).getInvocationPoint()

      /**
       * Type name of hook target.
       *
       * Hook targets are the destination where hooks will be invoked against.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-hooktarget.html#cfn-cloudformation-lambdahook-hooktarget-targetname)
       */
      override fun targetName(): String = unwrap(this).getTargetName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HookTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty):
          HookTargetProperty = CdkObjectWrappers.wrap(cdkObject) as? HookTargetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HookTargetProperty):
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.HookTargetProperty
    }
  }

  /**
   * The `StackFilters` property type specifies stack level filters for a Hook.
   *
   * The `StackNames` or `StackRoles` properties are optional. However, you must specify at least
   * one of these properties.
   *
   * For more information, see [AWS CloudFormation Hooks stack level
   * filters](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-stack-level-filtering.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * StackFiltersProperty stackFiltersProperty = StackFiltersProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html)
   */
  public interface StackFiltersProperty {
    /**
     * The filtering criteria.
     *
     * * All stack names and stack roles ( `All` ): The Hook will only be invoked when all specified
     * filters match.
     * * Any stack names and stack roles ( `Any` ): The Hook will be invoked if at least one of the
     * specified filters match.
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-filteringcriteria)
     */
    public fun filteringCriteria(): String

    /**
     * Includes or excludes specific stacks from Hook invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-stacknames)
     */
    public fun stackNames(): Any? = unwrap(this).getStackNames()

    /**
     * Includes or excludes specific stacks from Hook invocations based on their associated IAM
     * roles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-stackroles)
     */
    public fun stackRoles(): Any? = unwrap(this).getStackRoles()

    /**
     * A builder for [StackFiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filteringCriteria The filtering criteria. 
       * * All stack names and stack roles ( `All` ): The Hook will only be invoked when all
       * specified filters match.
       * * Any stack names and stack roles ( `Any` ): The Hook will be invoked if at least one of
       * the specified filters match.
       */
      public fun filteringCriteria(filteringCriteria: String)

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      public fun stackNames(stackNames: IResolvable)

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      public fun stackNames(stackNames: StackNamesProperty)

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9cdc6f0c18ec638773a4f19e372192e9eab23a9d9222d7e254b6cac635b2fb")
      public fun stackNames(stackNames: StackNamesProperty.Builder.() -> Unit)

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      public fun stackRoles(stackRoles: IResolvable)

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      public fun stackRoles(stackRoles: StackRolesProperty)

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c016e4e9b3c2614c7eb7c15cf20930feaf137fc8b774bc6aa2319789a0a7517c")
      public fun stackRoles(stackRoles: StackRolesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty.builder()

      /**
       * @param filteringCriteria The filtering criteria. 
       * * All stack names and stack roles ( `All` ): The Hook will only be invoked when all
       * specified filters match.
       * * Any stack names and stack roles ( `Any` ): The Hook will be invoked if at least one of
       * the specified filters match.
       */
      override fun filteringCriteria(filteringCriteria: String) {
        cdkBuilder.filteringCriteria(filteringCriteria)
      }

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      override fun stackNames(stackNames: IResolvable) {
        cdkBuilder.stackNames(stackNames.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      override fun stackNames(stackNames: StackNamesProperty) {
        cdkBuilder.stackNames(stackNames.let(StackNamesProperty.Companion::unwrap))
      }

      /**
       * @param stackNames Includes or excludes specific stacks from Hook invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9cdc6f0c18ec638773a4f19e372192e9eab23a9d9222d7e254b6cac635b2fb")
      override fun stackNames(stackNames: StackNamesProperty.Builder.() -> Unit): Unit =
          stackNames(StackNamesProperty(stackNames))

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      override fun stackRoles(stackRoles: IResolvable) {
        cdkBuilder.stackRoles(stackRoles.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      override fun stackRoles(stackRoles: StackRolesProperty) {
        cdkBuilder.stackRoles(stackRoles.let(StackRolesProperty.Companion::unwrap))
      }

      /**
       * @param stackRoles Includes or excludes specific stacks from Hook invocations based on their
       * associated IAM roles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c016e4e9b3c2614c7eb7c15cf20930feaf137fc8b774bc6aa2319789a0a7517c")
      override fun stackRoles(stackRoles: StackRolesProperty.Builder.() -> Unit): Unit =
          stackRoles(StackRolesProperty(stackRoles))

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty,
    ) : CdkObject(cdkObject),
        StackFiltersProperty {
      /**
       * The filtering criteria.
       *
       * * All stack names and stack roles ( `All` ): The Hook will only be invoked when all
       * specified filters match.
       * * Any stack names and stack roles ( `Any` ): The Hook will be invoked if at least one of
       * the specified filters match.
       *
       * Default: - "ALL"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-filteringcriteria)
       */
      override fun filteringCriteria(): String = unwrap(this).getFilteringCriteria()

      /**
       * Includes or excludes specific stacks from Hook invocations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-stacknames)
       */
      override fun stackNames(): Any? = unwrap(this).getStackNames()

      /**
       * Includes or excludes specific stacks from Hook invocations based on their associated IAM
       * roles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackfilters.html#cfn-cloudformation-lambdahook-stackfilters-stackroles)
       */
      override fun stackRoles(): Any? = unwrap(this).getStackRoles()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty):
          StackFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as? StackFiltersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackFiltersProperty):
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackFiltersProperty
    }
  }

  /**
   * Specifies the stack names for the `StackFilters` property type to include or exclude specific
   * stacks from Hook invocations.
   *
   * For more information, see [AWS CloudFormation Hooks stack level
   * filters](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-stack-level-filtering.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * StackNamesProperty stackNamesProperty = StackNamesProperty.builder()
   * .exclude(List.of("exclude"))
   * .include(List.of("include"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stacknames.html)
   */
  public interface StackNamesProperty {
    /**
     * The stack names to exclude.
     *
     * All stacks except those listed here will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stacknames.html#cfn-cloudformation-lambdahook-stacknames-exclude)
     */
    public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * The stack names to include.
     *
     * Only the stacks specified in this list will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stacknames.html#cfn-cloudformation-lambdahook-stacknames-include)
     */
    public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

    /**
     * A builder for [StackNamesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exclude The stack names to exclude.
       * All stacks except those listed here will invoke the Hook.
       */
      public fun exclude(exclude: List<String>)

      /**
       * @param exclude The stack names to exclude.
       * All stacks except those listed here will invoke the Hook.
       */
      public fun exclude(vararg exclude: String)

      /**
       * @param include The stack names to include.
       * Only the stacks specified in this list will invoke the Hook.
       */
      public fun include(include: List<String>)

      /**
       * @param include The stack names to include.
       * Only the stacks specified in this list will invoke the Hook.
       */
      public fun include(vararg include: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty.Builder =
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty.builder()

      /**
       * @param exclude The stack names to exclude.
       * All stacks except those listed here will invoke the Hook.
       */
      override fun exclude(exclude: List<String>) {
        cdkBuilder.exclude(exclude)
      }

      /**
       * @param exclude The stack names to exclude.
       * All stacks except those listed here will invoke the Hook.
       */
      override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

      /**
       * @param include The stack names to include.
       * Only the stacks specified in this list will invoke the Hook.
       */
      override fun include(include: List<String>) {
        cdkBuilder.include(include)
      }

      /**
       * @param include The stack names to include.
       * Only the stacks specified in this list will invoke the Hook.
       */
      override fun include(vararg include: String): Unit = include(include.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty,
    ) : CdkObject(cdkObject),
        StackNamesProperty {
      /**
       * The stack names to exclude.
       *
       * All stacks except those listed here will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stacknames.html#cfn-cloudformation-lambdahook-stacknames-exclude)
       */
      override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

      /**
       * The stack names to include.
       *
       * Only the stacks specified in this list will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stacknames.html#cfn-cloudformation-lambdahook-stacknames-include)
       */
      override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackNamesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty):
          StackNamesProperty = CdkObjectWrappers.wrap(cdkObject) as? StackNamesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackNamesProperty):
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackNamesProperty
    }
  }

  /**
   * Specifies the stack roles for the `StackFilters` property type to include or exclude specific
   * stacks from Hook invocations based on their associated IAM roles.
   *
   * For more information, see [AWS CloudFormation Hooks stack level
   * filters](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-stack-level-filtering.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * StackRolesProperty stackRolesProperty = StackRolesProperty.builder()
   * .exclude(List.of("exclude"))
   * .include(List.of("include"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackroles.html)
   */
  public interface StackRolesProperty {
    /**
     * The IAM role ARNs for stacks you want to exclude.
     *
     * The Hook will be invoked on all stacks except those initiated by the specified roles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackroles.html#cfn-cloudformation-lambdahook-stackroles-exclude)
     */
    public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * The IAM role ARNs to target stacks associated with these roles.
     *
     * Only stack operations initiated by these roles will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackroles.html#cfn-cloudformation-lambdahook-stackroles-include)
     */
    public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

    /**
     * A builder for [StackRolesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exclude The IAM role ARNs for stacks you want to exclude.
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       */
      public fun exclude(exclude: List<String>)

      /**
       * @param exclude The IAM role ARNs for stacks you want to exclude.
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       */
      public fun exclude(vararg exclude: String)

      /**
       * @param include The IAM role ARNs to target stacks associated with these roles.
       * Only stack operations initiated by these roles will invoke the Hook.
       */
      public fun include(include: List<String>)

      /**
       * @param include The IAM role ARNs to target stacks associated with these roles.
       * Only stack operations initiated by these roles will invoke the Hook.
       */
      public fun include(vararg include: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty.Builder =
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty.builder()

      /**
       * @param exclude The IAM role ARNs for stacks you want to exclude.
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       */
      override fun exclude(exclude: List<String>) {
        cdkBuilder.exclude(exclude)
      }

      /**
       * @param exclude The IAM role ARNs for stacks you want to exclude.
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       */
      override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

      /**
       * @param include The IAM role ARNs to target stacks associated with these roles.
       * Only stack operations initiated by these roles will invoke the Hook.
       */
      override fun include(include: List<String>) {
        cdkBuilder.include(include)
      }

      /**
       * @param include The IAM role ARNs to target stacks associated with these roles.
       * Only stack operations initiated by these roles will invoke the Hook.
       */
      override fun include(vararg include: String): Unit = include(include.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty,
    ) : CdkObject(cdkObject),
        StackRolesProperty {
      /**
       * The IAM role ARNs for stacks you want to exclude.
       *
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackroles.html#cfn-cloudformation-lambdahook-stackroles-exclude)
       */
      override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

      /**
       * The IAM role ARNs to target stacks associated with these roles.
       *
       * Only stack operations initiated by these roles will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-stackroles.html#cfn-cloudformation-lambdahook-stackroles-include)
       */
      override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackRolesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty):
          StackRolesProperty = CdkObjectWrappers.wrap(cdkObject) as? StackRolesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackRolesProperty):
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.StackRolesProperty
    }
  }

  /**
   * The `TargetFilters` property type specifies the target filters for the Hook.
   *
   * For more information, see [AWS CloudFormation Hook target
   * filters](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-target-filtering.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudformation.*;
   * TargetFiltersProperty targetFiltersProperty = TargetFiltersProperty.builder()
   * .targets(List.of(HookTargetProperty.builder()
   * .action("action")
   * .invocationPoint("invocationPoint")
   * .targetName("targetName")
   * .build()))
   * // the properties below are optional
   * .actions(List.of("actions"))
   * .invocationPoints(List.of("invocationPoints"))
   * .targetNames(List.of("targetNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html)
   */
  public interface TargetFiltersProperty {
    /**
     * List of actions that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-actions)
     */
    public fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    /**
     * List of invocation points that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-invocationpoints)
     */
    public fun invocationPoints(): List<String> = unwrap(this).getInvocationPoints() ?: emptyList()

    /**
     * List of type names that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-targetnames)
     */
    public fun targetNames(): List<String> = unwrap(this).getTargetNames() ?: emptyList()

    /**
     * List of hook targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-targets)
     */
    public fun targets(): Any

    /**
     * A builder for [TargetFiltersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions List of actions that the hook is going to target.
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions List of actions that the hook is going to target.
       */
      public fun actions(vararg actions: String)

      /**
       * @param invocationPoints List of invocation points that the hook is going to target.
       */
      public fun invocationPoints(invocationPoints: List<String>)

      /**
       * @param invocationPoints List of invocation points that the hook is going to target.
       */
      public fun invocationPoints(vararg invocationPoints: String)

      /**
       * @param targetNames List of type names that the hook is going to target.
       */
      public fun targetNames(targetNames: List<String>)

      /**
       * @param targetNames List of type names that the hook is going to target.
       */
      public fun targetNames(vararg targetNames: String)

      /**
       * @param targets List of hook targets. 
       */
      public fun targets(targets: IResolvable)

      /**
       * @param targets List of hook targets. 
       */
      public fun targets(targets: List<Any>)

      /**
       * @param targets List of hook targets. 
       */
      public fun targets(vararg targets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty.Builder
          =
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty.builder()

      /**
       * @param actions List of actions that the hook is going to target.
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions List of actions that the hook is going to target.
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param invocationPoints List of invocation points that the hook is going to target.
       */
      override fun invocationPoints(invocationPoints: List<String>) {
        cdkBuilder.invocationPoints(invocationPoints)
      }

      /**
       * @param invocationPoints List of invocation points that the hook is going to target.
       */
      override fun invocationPoints(vararg invocationPoints: String): Unit =
          invocationPoints(invocationPoints.toList())

      /**
       * @param targetNames List of type names that the hook is going to target.
       */
      override fun targetNames(targetNames: List<String>) {
        cdkBuilder.targetNames(targetNames)
      }

      /**
       * @param targetNames List of type names that the hook is going to target.
       */
      override fun targetNames(vararg targetNames: String): Unit = targetNames(targetNames.toList())

      /**
       * @param targets List of hook targets. 
       */
      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targets List of hook targets. 
       */
      override fun targets(targets: List<Any>) {
        cdkBuilder.targets(targets.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param targets List of hook targets. 
       */
      override fun targets(vararg targets: Any): Unit = targets(targets.toList())

      public fun build():
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty,
    ) : CdkObject(cdkObject),
        TargetFiltersProperty {
      /**
       * List of actions that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

      /**
       * List of invocation points that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-invocationpoints)
       */
      override fun invocationPoints(): List<String> = unwrap(this).getInvocationPoints() ?:
          emptyList()

      /**
       * List of type names that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-targetnames)
       */
      override fun targetNames(): List<String> = unwrap(this).getTargetNames() ?: emptyList()

      /**
       * List of hook targets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-lambdahook-targetfilters.html#cfn-cloudformation-lambdahook-targetfilters-targets)
       */
      override fun targets(): Any = unwrap(this).getTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty):
          TargetFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetFiltersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetFiltersProperty):
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnLambdaHook.TargetFiltersProperty
    }
  }
}
