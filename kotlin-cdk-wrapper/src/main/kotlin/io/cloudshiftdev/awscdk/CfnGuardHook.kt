@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

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
 * The `AWS::CloudFormation::GuardHook` resource creates a Guard Hook with the specified attributes
 * within your CloudFormation template.
 *
 * Using the Guard domain specific language (DSL), you can author Hooks to evaluate your resources
 * before allowing stack creation, modification, or deletion. For more information, see [Guard
 * Hooks](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/guard-hooks.html) in
 * the *AWS CloudFormation Hooks User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnGuardHook cfnGuardHook = CfnGuardHook.Builder.create(this, "MyCfnGuardHook")
 * .alias("alias")
 * .executionRole("executionRole")
 * .failureMode("failureMode")
 * .hookStatus("hookStatus")
 * .ruleLocation(S3LocationProperty.builder()
 * .uri("uri")
 * // the properties below are optional
 * .versionId("versionId")
 * .build())
 * .targetOperations(List.of("targetOperations"))
 * // the properties below are optional
 * .logBucket("logBucket")
 * .options(OptionsProperty.builder()
 * .inputParams(S3LocationProperty.builder()
 * .uri("uri")
 * // the properties below are optional
 * .versionId("versionId")
 * .build())
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html)
 */
public open class CfnGuardHook(
  cdkObject: software.amazon.awscdk.CfnGuardHook,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardHookProps,
  ) :
      this(software.amazon.awscdk.CfnGuardHook(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGuardHookProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardHookProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGuardHookProps(props)
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
   * Returns the ARN of a Guard Hook.
   */
  public open fun attrHookArn(): String = unwrap(this).getAttrHookArn()

  /**
   * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write a
   * detailed Guard output report back.
   */
  public open fun executionRole(): String = unwrap(this).getExecutionRole()

  /**
   * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write a
   * detailed Guard output report back.
   */
  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  /**
   * Specifies how the Hook responds when rules fail their evaluation.
   */
  public open fun failureMode(): String = unwrap(this).getFailureMode()

  /**
   * Specifies how the Hook responds when rules fail their evaluation.
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
   * Specifies the name of an S3 bucket to store the Guard output report.
   */
  public open fun logBucket(): String? = unwrap(this).getLogBucket()

  /**
   * Specifies the name of an S3 bucket to store the Guard output report.
   */
  public open fun logBucket(`value`: String) {
    unwrap(this).setLogBucket(`value`)
  }

  /**
   * Specifies the S3 location of your input parameters.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * Specifies the S3 location of your input parameters.
   */
  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the S3 location of your input parameters.
   */
  public open fun options(`value`: OptionsProperty) {
    unwrap(this).setOptions(`value`.let(OptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies the S3 location of your input parameters.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fb9e4683328efefd316ac7a20daaf76dd33efcaa045b70b5de0d4c876af8bad")
  public open fun options(`value`: OptionsProperty.Builder.() -> Unit): Unit =
      options(OptionsProperty(`value`))

  /**
   * Specifies the S3 location of your Guard rules.
   */
  public open fun ruleLocation(): Any = unwrap(this).getRuleLocation()

  /**
   * Specifies the S3 location of your Guard rules.
   */
  public open fun ruleLocation(`value`: IResolvable) {
    unwrap(this).setRuleLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the S3 location of your Guard rules.
   */
  public open fun ruleLocation(`value`: S3LocationProperty) {
    unwrap(this).setRuleLocation(`value`.let(S3LocationProperty.Companion::unwrap))
  }

  /**
   * Specifies the S3 location of your Guard rules.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8fe7529571a38820e39033a63c600a2f2376751254d02aff5bce3e1779ffd918")
  public open fun ruleLocation(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      ruleLocation(S3LocationProperty(`value`))

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
  @JvmName("fb9261f5da9badb6dd7f1e895d7685a44eec665ece93afa477bd9f1cedc91d79")
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
  @JvmName("a06c94d111e86d23f47b891aa3ef4ba8e26d76096ad0e4f3ca586924eef8ee7a")
  public open fun targetFilters(`value`: TargetFiltersProperty.Builder.() -> Unit): Unit =
      targetFilters(TargetFiltersProperty(`value`))

  /**
   * Specifies which type of operation the Hook is run against.
   */
  public open fun targetOperations(): List<String> = unwrap(this).getTargetOperations()

  /**
   * Specifies which type of operation the Hook is run against.
   */
  public open fun targetOperations(`value`: List<String>) {
    unwrap(this).setTargetOperations(`value`)
  }

  /**
   * Specifies which type of operation the Hook is run against.
   */
  public open fun targetOperations(vararg `value`: String): Unit =
      targetOperations(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnGuardHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Guard::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-alias)
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     */
    public fun alias(alias: String)

    /**
     * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write
     * a detailed Guard output report back.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-executionrole)
     * @param executionRole The IAM role that the Hook assumes to retrieve your Guard rules from S3
     * and optionally write a detailed Guard output report back. 
     */
    public fun executionRole(executionRole: String)

    /**
     * Specifies how the Hook responds when rules fail their evaluation.
     *
     * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict
     * compliance or security policies.
     * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
     * non-critical validations or informational checks.
     *
     * Default: - "WARN"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-failuremode)
     * @param failureMode Specifies how the Hook responds when rules fail their evaluation. 
     */
    public fun failureMode(failureMode: String)

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "DISABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-hookstatus)
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    public fun hookStatus(hookStatus: String)

    /**
     * Specifies the name of an S3 bucket to store the Guard output report.
     *
     * This report contains the results of your Guard rule validations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-logbucket)
     * @param logBucket Specifies the name of an S3 bucket to store the Guard output report. 
     */
    public fun logBucket(logBucket: String)

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    public fun options(options: IResolvable)

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    public fun options(options: OptionsProperty)

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7d627cbb9a87596e2ff8e63360ef6154b7aa9dd8aaa196cbdd8981eab6f7c51")
    public fun options(options: OptionsProperty.Builder.() -> Unit)

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    public fun ruleLocation(ruleLocation: IResolvable)

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    public fun ruleLocation(ruleLocation: S3LocationProperty)

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ac61944ff1ddaa5464c87db122a6e2f4adeb84d77a255d268de77928d0f4b2d")
    public fun ruleLocation(ruleLocation: S3LocationProperty.Builder.() -> Unit)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    public fun stackFilters(stackFilters: IResolvable)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    public fun stackFilters(stackFilters: StackFiltersProperty)

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba87c7071f9a4859492f1a7374f6df610635cff5a8ec057a4056659532a58a17")
    public fun stackFilters(stackFilters: StackFiltersProperty.Builder.() -> Unit)

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    public fun targetFilters(targetFilters: IResolvable)

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    public fun targetFilters(targetFilters: TargetFiltersProperty)

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81eb01cf08328fce7d19006fbf0f99390e76ef9ea3cb16ecf082cacce6cf4dca")
    public fun targetFilters(targetFilters: TargetFiltersProperty.Builder.() -> Unit)

    /**
     * Specifies which type of operation the Hook is run against.
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     */
    public fun targetOperations(targetOperations: List<String>)

    /**
     * Specifies which type of operation the Hook is run against.
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     */
    public fun targetOperations(vararg targetOperations: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.Builder =
        software.amazon.awscdk.CfnGuardHook.Builder.create(scope, id)

    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Guard::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-alias)
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write
     * a detailed Guard output report back.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-executionrole)
     * @param executionRole The IAM role that the Hook assumes to retrieve your Guard rules from S3
     * and optionally write a detailed Guard output report back. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * Specifies how the Hook responds when rules fail their evaluation.
     *
     * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict
     * compliance or security policies.
     * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
     * non-critical validations or informational checks.
     *
     * Default: - "WARN"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-failuremode)
     * @param failureMode Specifies how the Hook responds when rules fail their evaluation. 
     */
    override fun failureMode(failureMode: String) {
      cdkBuilder.failureMode(failureMode)
    }

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "DISABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-hookstatus)
     * @param hookStatus Specifies if the Hook is `ENABLED` or `DISABLED` . 
     */
    override fun hookStatus(hookStatus: String) {
      cdkBuilder.hookStatus(hookStatus)
    }

    /**
     * Specifies the name of an S3 bucket to store the Guard output report.
     *
     * This report contains the results of your Guard rule validations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-logbucket)
     * @param logBucket Specifies the name of an S3 bucket to store the Guard output report. 
     */
    override fun logBucket(logBucket: String) {
      cdkBuilder.logBucket(logBucket)
    }

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    override fun options(options: OptionsProperty) {
      cdkBuilder.options(options.let(OptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     * @param options Specifies the S3 location of your input parameters. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7d627cbb9a87596e2ff8e63360ef6154b7aa9dd8aaa196cbdd8981eab6f7c51")
    override fun options(options: OptionsProperty.Builder.() -> Unit): Unit =
        options(OptionsProperty(options))

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    override fun ruleLocation(ruleLocation: IResolvable) {
      cdkBuilder.ruleLocation(ruleLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    override fun ruleLocation(ruleLocation: S3LocationProperty) {
      cdkBuilder.ruleLocation(ruleLocation.let(S3LocationProperty.Companion::unwrap))
    }

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ac61944ff1ddaa5464c87db122a6e2f4adeb84d77a255d268de77928d0f4b2d")
    override fun ruleLocation(ruleLocation: S3LocationProperty.Builder.() -> Unit): Unit =
        ruleLocation(S3LocationProperty(ruleLocation))

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    override fun stackFilters(stackFilters: IResolvable) {
      cdkBuilder.stackFilters(stackFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    override fun stackFilters(stackFilters: StackFiltersProperty) {
      cdkBuilder.stackFilters(stackFilters.let(StackFiltersProperty.Companion::unwrap))
    }

    /**
     * Specifies the stack level filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     * @param stackFilters Specifies the stack level filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba87c7071f9a4859492f1a7374f6df610635cff5a8ec057a4056659532a58a17")
    override fun stackFilters(stackFilters: StackFiltersProperty.Builder.() -> Unit): Unit =
        stackFilters(StackFiltersProperty(stackFilters))

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    override fun targetFilters(targetFilters: IResolvable) {
      cdkBuilder.targetFilters(targetFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    override fun targetFilters(targetFilters: TargetFiltersProperty) {
      cdkBuilder.targetFilters(targetFilters.let(TargetFiltersProperty.Companion::unwrap))
    }

    /**
     * Specifies the target filters for the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     * @param targetFilters Specifies the target filters for the Hook. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81eb01cf08328fce7d19006fbf0f99390e76ef9ea3cb16ecf082cacce6cf4dca")
    override fun targetFilters(targetFilters: TargetFiltersProperty.Builder.() -> Unit): Unit =
        targetFilters(TargetFiltersProperty(targetFilters))

    /**
     * Specifies which type of operation the Hook is run against.
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     */
    override fun targetOperations(targetOperations: List<String>) {
      cdkBuilder.targetOperations(targetOperations)
    }

    /**
     * Specifies which type of operation the Hook is run against.
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
     * @param targetOperations Specifies which type of operation the Hook is run against. 
     */
    override fun targetOperations(vararg targetOperations: String): Unit =
        targetOperations(targetOperations.toList())

    public fun build(): software.amazon.awscdk.CfnGuardHook = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnGuardHook.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGuardHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGuardHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook): CfnGuardHook =
        CfnGuardHook(cdkObject)

    internal fun unwrap(wrapped: CfnGuardHook): software.amazon.awscdk.CfnGuardHook =
        wrapped.cdkObject as software.amazon.awscdk.CfnGuardHook
  }

  /**
   * Specifies the input parameters for a Guard Hook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * OptionsProperty optionsProperty = OptionsProperty.builder()
   * .inputParams(S3LocationProperty.builder()
   * .uri("uri")
   * // the properties below are optional
   * .versionId("versionId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-options.html)
   */
  public interface OptionsProperty {
    /**
     * Specifies the S3 location where your input parameters are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-options.html#cfn-cloudformation-guardhook-options-inputparams)
     */
    public fun inputParams(): Any? = unwrap(this).getInputParams()

    /**
     * A builder for [OptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      public fun inputParams(inputParams: IResolvable)

      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      public fun inputParams(inputParams: S3LocationProperty)

      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1d75cd85aba62aaab226fa9fbe43596abac4d15d9e5a3cd873aa8713320c01")
      public fun inputParams(inputParams: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.OptionsProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.OptionsProperty.builder()

      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      override fun inputParams(inputParams: IResolvable) {
        cdkBuilder.inputParams(inputParams.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      override fun inputParams(inputParams: S3LocationProperty) {
        cdkBuilder.inputParams(inputParams.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param inputParams Specifies the S3 location where your input parameters are located.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1d75cd85aba62aaab226fa9fbe43596abac4d15d9e5a3cd873aa8713320c01")
      override fun inputParams(inputParams: S3LocationProperty.Builder.() -> Unit): Unit =
          inputParams(S3LocationProperty(inputParams))

      public fun build(): software.amazon.awscdk.CfnGuardHook.OptionsProperty = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.OptionsProperty,
    ) : CdkObject(cdkObject),
        OptionsProperty {
      /**
       * Specifies the S3 location where your input parameters are located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-options.html#cfn-cloudformation-guardhook-options-inputparams)
       */
      override fun inputParams(): Any? = unwrap(this).getInputParams()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.OptionsProperty):
          OptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? OptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.CfnGuardHook.OptionsProperty = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.CfnGuardHook.OptionsProperty
    }
  }

  /**
   * Specifies the S3 location where your Guard rules or input parameters are located.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .uri("uri")
   * // the properties below are optional
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * Specifies the S3 path to the file containing your Guard rules or input parameters (in the
     * form `s3://&lt;bucket name&gt;/&lt;file name&gt;` ).
     *
     * For Guard rules, the object stored in S3 must have one of the following file extensions:
     * `.guard` , `.zip` , or `.tar.gz` .
     *
     * For input parameters, the object stored in S3 must have one of the following file extensions:
     * `.yaml` , `.json` , `.zip` , or `.tar.gz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-s3location.html#cfn-cloudformation-guardhook-s3location-uri)
     */
    public fun uri(): String

    /**
     * For S3 buckets with versioning enabled, specifies the unique ID of the S3 object version to
     * download your Guard rules or input parameters from.
     *
     * The Guard Hook downloads files from S3 every time the Hook is invoked. To prevent accidental
     * changes or deletions, we recommend using a version when configuring your Guard Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-s3location.html#cfn-cloudformation-guardhook-s3location-versionid)
     */
    public fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param uri Specifies the S3 path to the file containing your Guard rules or input
       * parameters (in the form `s3://&lt;bucket name&gt;/&lt;file name&gt;` ). 
       * For Guard rules, the object stored in S3 must have one of the following file extensions:
       * `.guard` , `.zip` , or `.tar.gz` .
       *
       * For input parameters, the object stored in S3 must have one of the following file
       * extensions: `.yaml` , `.json` , `.zip` , or `.tar.gz` .
       */
      public fun uri(uri: String)

      /**
       * @param versionId For S3 buckets with versioning enabled, specifies the unique ID of the S3
       * object version to download your Guard rules or input parameters from.
       * The Guard Hook downloads files from S3 every time the Hook is invoked. To prevent
       * accidental changes or deletions, we recommend using a version when configuring your Guard
       * Hook.
       */
      public fun versionId(versionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.S3LocationProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.S3LocationProperty.builder()

      /**
       * @param uri Specifies the S3 path to the file containing your Guard rules or input
       * parameters (in the form `s3://&lt;bucket name&gt;/&lt;file name&gt;` ). 
       * For Guard rules, the object stored in S3 must have one of the following file extensions:
       * `.guard` , `.zip` , or `.tar.gz` .
       *
       * For input parameters, the object stored in S3 must have one of the following file
       * extensions: `.yaml` , `.json` , `.zip` , or `.tar.gz` .
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      /**
       * @param versionId For S3 buckets with versioning enabled, specifies the unique ID of the S3
       * object version to download your Guard rules or input parameters from.
       * The Guard Hook downloads files from S3 every time the Hook is invoked. To prevent
       * accidental changes or deletions, we recommend using a version when configuring your Guard
       * Hook.
       */
      override fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
      }

      public fun build(): software.amazon.awscdk.CfnGuardHook.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * Specifies the S3 path to the file containing your Guard rules or input parameters (in the
       * form `s3://&lt;bucket name&gt;/&lt;file name&gt;` ).
       *
       * For Guard rules, the object stored in S3 must have one of the following file extensions:
       * `.guard` , `.zip` , or `.tar.gz` .
       *
       * For input parameters, the object stored in S3 must have one of the following file
       * extensions: `.yaml` , `.json` , `.zip` , or `.tar.gz` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-s3location.html#cfn-cloudformation-guardhook-s3location-uri)
       */
      override fun uri(): String = unwrap(this).getUri()

      /**
       * For S3 buckets with versioning enabled, specifies the unique ID of the S3 object version to
       * download your Guard rules or input parameters from.
       *
       * The Guard Hook downloads files from S3 every time the Hook is invoked. To prevent
       * accidental changes or deletions, we recommend using a version when configuring your Guard
       * Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-s3location.html#cfn-cloudformation-guardhook-s3location-versionid)
       */
      override fun versionId(): String? = unwrap(this).getVersionId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.CfnGuardHook.S3LocationProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.CfnGuardHook.S3LocationProperty
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
   * import io.cloudshiftdev.awscdk.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-filteringcriteria)
     */
    public fun filteringCriteria(): String

    /**
     * Includes or excludes specific stacks from Hook invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-stacknames)
     */
    public fun stackNames(): Any? = unwrap(this).getStackNames()

    /**
     * Includes or excludes specific stacks from Hook invocations based on their associated IAM
     * roles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-stackroles)
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
      @JvmName("23f9b6ba07e011954177b8c6b6921b5e233deb733b2c60ba6b932af3408f301c")
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
      @JvmName("cb9003e167c1369b3e270e99f83a5dab442a04b2f07fffcc6752dc5a106b1728")
      public fun stackRoles(stackRoles: StackRolesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.StackFiltersProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.StackFiltersProperty.builder()

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
      @JvmName("23f9b6ba07e011954177b8c6b6921b5e233deb733b2c60ba6b932af3408f301c")
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
      @JvmName("cb9003e167c1369b3e270e99f83a5dab442a04b2f07fffcc6752dc5a106b1728")
      override fun stackRoles(stackRoles: StackRolesProperty.Builder.() -> Unit): Unit =
          stackRoles(StackRolesProperty(stackRoles))

      public fun build(): software.amazon.awscdk.CfnGuardHook.StackFiltersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.StackFiltersProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-filteringcriteria)
       */
      override fun filteringCriteria(): String = unwrap(this).getFilteringCriteria()

      /**
       * Includes or excludes specific stacks from Hook invocations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-stacknames)
       */
      override fun stackNames(): Any? = unwrap(this).getStackNames()

      /**
       * Includes or excludes specific stacks from Hook invocations based on their associated IAM
       * roles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackfilters.html#cfn-cloudformation-guardhook-stackfilters-stackroles)
       */
      override fun stackRoles(): Any? = unwrap(this).getStackRoles()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.StackFiltersProperty):
          StackFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as? StackFiltersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackFiltersProperty):
          software.amazon.awscdk.CfnGuardHook.StackFiltersProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnGuardHook.StackFiltersProperty
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
   * import io.cloudshiftdev.awscdk.*;
   * StackNamesProperty stackNamesProperty = StackNamesProperty.builder()
   * .exclude(List.of("exclude"))
   * .include(List.of("include"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stacknames.html)
   */
  public interface StackNamesProperty {
    /**
     * The stack names to exclude.
     *
     * All stacks except those listed here will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stacknames.html#cfn-cloudformation-guardhook-stacknames-exclude)
     */
    public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * The stack names to include.
     *
     * Only the stacks specified in this list will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stacknames.html#cfn-cloudformation-guardhook-stacknames-include)
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
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.StackNamesProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.StackNamesProperty.builder()

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

      public fun build(): software.amazon.awscdk.CfnGuardHook.StackNamesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.StackNamesProperty,
    ) : CdkObject(cdkObject),
        StackNamesProperty {
      /**
       * The stack names to exclude.
       *
       * All stacks except those listed here will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stacknames.html#cfn-cloudformation-guardhook-stacknames-exclude)
       */
      override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

      /**
       * The stack names to include.
       *
       * Only the stacks specified in this list will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stacknames.html#cfn-cloudformation-guardhook-stacknames-include)
       */
      override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackNamesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.StackNamesProperty):
          StackNamesProperty = CdkObjectWrappers.wrap(cdkObject) as? StackNamesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackNamesProperty):
          software.amazon.awscdk.CfnGuardHook.StackNamesProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.CfnGuardHook.StackNamesProperty
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
   * import io.cloudshiftdev.awscdk.*;
   * StackRolesProperty stackRolesProperty = StackRolesProperty.builder()
   * .exclude(List.of("exclude"))
   * .include(List.of("include"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackroles.html)
   */
  public interface StackRolesProperty {
    /**
     * The IAM role ARNs for stacks you want to exclude.
     *
     * The Hook will be invoked on all stacks except those initiated by the specified roles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackroles.html#cfn-cloudformation-guardhook-stackroles-exclude)
     */
    public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * The IAM role ARNs to target stacks associated with these roles.
     *
     * Only stack operations initiated by these roles will invoke the Hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackroles.html#cfn-cloudformation-guardhook-stackroles-include)
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
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.StackRolesProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.StackRolesProperty.builder()

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

      public fun build(): software.amazon.awscdk.CfnGuardHook.StackRolesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.StackRolesProperty,
    ) : CdkObject(cdkObject),
        StackRolesProperty {
      /**
       * The IAM role ARNs for stacks you want to exclude.
       *
       * The Hook will be invoked on all stacks except those initiated by the specified roles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackroles.html#cfn-cloudformation-guardhook-stackroles-exclude)
       */
      override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

      /**
       * The IAM role ARNs to target stacks associated with these roles.
       *
       * Only stack operations initiated by these roles will invoke the Hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-stackroles.html#cfn-cloudformation-guardhook-stackroles-include)
       */
      override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StackRolesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.StackRolesProperty):
          StackRolesProperty = CdkObjectWrappers.wrap(cdkObject) as? StackRolesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackRolesProperty):
          software.amazon.awscdk.CfnGuardHook.StackRolesProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.CfnGuardHook.StackRolesProperty
    }
  }

  /**
   * The `TargetFilters` property type specifies the target filters for the Hook.
   *
   * For more information, see [AWS CloudFormation Hook target
   * filters](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/specify-hook-configuration-targetfilters.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * TargetFiltersProperty targetFiltersProperty = TargetFiltersProperty.builder()
   * .actions(List.of("actions"))
   * .invocationPoints(List.of("invocationPoints"))
   * .targetNames(List.of("targetNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html)
   */
  public interface TargetFiltersProperty {
    /**
     * List of actions that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-actions)
     */
    public fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    /**
     * List of invocation points that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-invocationpoints)
     */
    public fun invocationPoints(): List<String> = unwrap(this).getInvocationPoints() ?: emptyList()

    /**
     * List of type names that the hook is going to target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-targetnames)
     */
    public fun targetNames(): List<String> = unwrap(this).getTargetNames() ?: emptyList()

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty.Builder =
          software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty.builder()

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

      public fun build(): software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty,
    ) : CdkObject(cdkObject),
        TargetFiltersProperty {
      /**
       * List of actions that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

      /**
       * List of invocation points that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-invocationpoints)
       */
      override fun invocationPoints(): List<String> = unwrap(this).getInvocationPoints() ?:
          emptyList()

      /**
       * List of type names that the hook is going to target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-guardhook-targetfilters.html#cfn-cloudformation-guardhook-targetfilters-targetnames)
       */
      override fun targetNames(): List<String> = unwrap(this).getTargetNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetFiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty):
          TargetFiltersProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetFiltersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetFiltersProperty):
          software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnGuardHook.TargetFiltersProperty
    }
  }
}
