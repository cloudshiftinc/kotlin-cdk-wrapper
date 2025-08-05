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
 * Properties for defining a `CfnGuardHook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnGuardHookProps cfnGuardHookProps = CfnGuardHookProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html)
 */
public interface CfnGuardHookProps {
  /**
   * The type name alias for the Hook. This alias must be unique per account and Region.
   *
   * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
   * example, `Private::Guard::MyTestHook` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-alias)
   */
  public fun alias(): String

  /**
   * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write a
   * detailed Guard output report back.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-executionrole)
   */
  public fun executionRole(): String

  /**
   * Specifies how the Hook responds when rules fail their evaluation.
   *
   * * `FAIL` : Prevents the action from proceeding. This is helpful for enforcing strict compliance
   * or security policies.
   * * `WARN` : Issues warnings to users but allows actions to continue. This is useful for
   * non-critical validations or informational checks.
   *
   * Default: - "WARN"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-failuremode)
   */
  public fun failureMode(): String

  /**
   * Specifies if the Hook is `ENABLED` or `DISABLED` .
   *
   * Default: - "DISABLED"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-hookstatus)
   */
  public fun hookStatus(): String

  /**
   * Specifies the name of an S3 bucket to store the Guard output report.
   *
   * This report contains the results of your Guard rule validations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-logbucket)
   */
  public fun logBucket(): String? = unwrap(this).getLogBucket()

  /**
   * Specifies the S3 location of your input parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * Specifies the S3 location of your Guard rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
   */
  public fun ruleLocation(): Any

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
   */
  public fun stackFilters(): Any? = unwrap(this).getStackFilters()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
   */
  public fun targetFilters(): Any? = unwrap(this).getTargetFilters()

  /**
   * Specifies the list of operations the Hook is run against.
   *
   * For more information, see [Hook
   * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
   * in the *AWS CloudFormation Hooks User Guide* .
   *
   * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
   */
  public fun targetOperations(): List<String>

  /**
   * A builder for [CfnGuardHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Guard::MyTestHook` .
     */
    public fun alias(alias: String)

    /**
     * @param executionRole The IAM role that the Hook assumes to retrieve your Guard rules from S3
     * and optionally write a detailed Guard output report back. 
     */
    public fun executionRole(executionRole: String)

    /**
     * @param failureMode Specifies how the Hook responds when rules fail their evaluation. 
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
     * @param logBucket Specifies the name of an S3 bucket to store the Guard output report.
     * This report contains the results of your Guard rule validations.
     */
    public fun logBucket(logBucket: String)

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    public fun options(options: IResolvable)

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    public fun options(options: CfnGuardHook.OptionsProperty)

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2a128f13bc3d9340d192c3b29f235a90e2e6933616af770785fc955f238cf5a")
    public fun options(options: CfnGuardHook.OptionsProperty.Builder.() -> Unit)

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    public fun ruleLocation(ruleLocation: IResolvable)

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    public fun ruleLocation(ruleLocation: CfnGuardHook.S3LocationProperty)

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d886b8e4c6002826a26b55bd3cc951151e8e3fce3db7b6fc49a256cd799edd0")
    public fun ruleLocation(ruleLocation: CfnGuardHook.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    public fun stackFilters(stackFilters: IResolvable)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    public fun stackFilters(stackFilters: CfnGuardHook.StackFiltersProperty)

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cb692f4e1f13407981f6f9b291c7efdd3aa9741a2d4c22f24050a413ef1093")
    public fun stackFilters(stackFilters: CfnGuardHook.StackFiltersProperty.Builder.() -> Unit)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    public fun targetFilters(targetFilters: IResolvable)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    public fun targetFilters(targetFilters: CfnGuardHook.TargetFiltersProperty)

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d52004ecc1f3ef252a54255d88b667abb8597a06c4ec29e600c8cc80ecf0cc84")
    public fun targetFilters(targetFilters: CfnGuardHook.TargetFiltersProperty.Builder.() -> Unit)

    /**
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    public fun targetOperations(targetOperations: List<String>)

    /**
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    public fun targetOperations(vararg targetOperations: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnGuardHookProps.Builder
        = software.amazon.awscdk.services.cloudformation.CfnGuardHookProps.builder()

    /**
     * @param alias The type name alias for the Hook. This alias must be unique per account and
     * Region. 
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Guard::MyTestHook` .
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param executionRole The IAM role that the Hook assumes to retrieve your Guard rules from S3
     * and optionally write a detailed Guard output report back. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param failureMode Specifies how the Hook responds when rules fail their evaluation. 
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
     * @param logBucket Specifies the name of an S3 bucket to store the Guard output report.
     * This report contains the results of your Guard rule validations.
     */
    override fun logBucket(logBucket: String) {
      cdkBuilder.logBucket(logBucket)
    }

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    override fun options(options: CfnGuardHook.OptionsProperty) {
      cdkBuilder.options(options.let(CfnGuardHook.OptionsProperty.Companion::unwrap))
    }

    /**
     * @param options Specifies the S3 location of your input parameters.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2a128f13bc3d9340d192c3b29f235a90e2e6933616af770785fc955f238cf5a")
    override fun options(options: CfnGuardHook.OptionsProperty.Builder.() -> Unit): Unit =
        options(CfnGuardHook.OptionsProperty(options))

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    override fun ruleLocation(ruleLocation: IResolvable) {
      cdkBuilder.ruleLocation(ruleLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    override fun ruleLocation(ruleLocation: CfnGuardHook.S3LocationProperty) {
      cdkBuilder.ruleLocation(ruleLocation.let(CfnGuardHook.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param ruleLocation Specifies the S3 location of your Guard rules. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d886b8e4c6002826a26b55bd3cc951151e8e3fce3db7b6fc49a256cd799edd0")
    override fun ruleLocation(ruleLocation: CfnGuardHook.S3LocationProperty.Builder.() -> Unit):
        Unit = ruleLocation(CfnGuardHook.S3LocationProperty(ruleLocation))

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    override fun stackFilters(stackFilters: IResolvable) {
      cdkBuilder.stackFilters(stackFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    override fun stackFilters(stackFilters: CfnGuardHook.StackFiltersProperty) {
      cdkBuilder.stackFilters(stackFilters.let(CfnGuardHook.StackFiltersProperty.Companion::unwrap))
    }

    /**
     * @param stackFilters Specifies the stack level filters for the Hook.
     * Example stack level filter in JSON:
     *
     * `"StackFilters": {"FilteringCriteria": "ALL", "StackNames": {"Exclude": [ "stack-1",
     * "stack-2"]}}`
     *
     * Example stack level filter in YAML:
     *
     * `StackFilters: FilteringCriteria: ALL StackNames: Exclude: - stack-1 - stack-2`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cb692f4e1f13407981f6f9b291c7efdd3aa9741a2d4c22f24050a413ef1093")
    override fun stackFilters(stackFilters: CfnGuardHook.StackFiltersProperty.Builder.() -> Unit):
        Unit = stackFilters(CfnGuardHook.StackFiltersProperty(stackFilters))

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    override fun targetFilters(targetFilters: IResolvable) {
      cdkBuilder.targetFilters(targetFilters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    override fun targetFilters(targetFilters: CfnGuardHook.TargetFiltersProperty) {
      cdkBuilder.targetFilters(targetFilters.let(CfnGuardHook.TargetFiltersProperty.Companion::unwrap))
    }

    /**
     * @param targetFilters Specifies the target filters for the Hook.
     * Example target filter in JSON:
     *
     * `"TargetFilters": {"Actions": [ "Create", "Update", "Delete" ]}`
     *
     * Example target filter in YAML:
     *
     * `TargetFilters: Actions: - CREATE - UPDATE - DELETE`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d52004ecc1f3ef252a54255d88b667abb8597a06c4ec29e600c8cc80ecf0cc84")
    override
        fun targetFilters(targetFilters: CfnGuardHook.TargetFiltersProperty.Builder.() -> Unit):
        Unit = targetFilters(CfnGuardHook.TargetFiltersProperty(targetFilters))

    /**
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    override fun targetOperations(targetOperations: List<String>) {
      cdkBuilder.targetOperations(targetOperations)
    }

    /**
     * @param targetOperations Specifies the list of operations the Hook is run against. 
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     */
    override fun targetOperations(vararg targetOperations: String): Unit =
        targetOperations(targetOperations.toList())

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnGuardHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnGuardHookProps,
  ) : CdkObject(cdkObject),
      CfnGuardHookProps {
    /**
     * The type name alias for the Hook. This alias must be unique per account and Region.
     *
     * The alias must be in the form `Name1::Name2::Name3` and must not begin with `AWS` . For
     * example, `Private::Guard::MyTestHook` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-alias)
     */
    override fun alias(): String = unwrap(this).getAlias()

    /**
     * The IAM role that the Hook assumes to retrieve your Guard rules from S3 and optionally write
     * a detailed Guard output report back.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-executionrole)
     */
    override fun executionRole(): String = unwrap(this).getExecutionRole()

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
     */
    override fun failureMode(): String = unwrap(this).getFailureMode()

    /**
     * Specifies if the Hook is `ENABLED` or `DISABLED` .
     *
     * Default: - "DISABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-hookstatus)
     */
    override fun hookStatus(): String = unwrap(this).getHookStatus()

    /**
     * Specifies the name of an S3 bucket to store the Guard output report.
     *
     * This report contains the results of your Guard rule validations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-logbucket)
     */
    override fun logBucket(): String? = unwrap(this).getLogBucket()

    /**
     * Specifies the S3 location of your input parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * Specifies the S3 location of your Guard rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-rulelocation)
     */
    override fun ruleLocation(): Any = unwrap(this).getRuleLocation()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-stackfilters)
     */
    override fun stackFilters(): Any? = unwrap(this).getStackFilters()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetfilters)
     */
    override fun targetFilters(): Any? = unwrap(this).getTargetFilters()

    /**
     * Specifies the list of operations the Hook is run against.
     *
     * For more information, see [Hook
     * targets](https://docs.aws.amazon.com/cloudformation-cli/latest/hooks-userguide/hooks-concepts.html#hook-terms-hook-target)
     * in the *AWS CloudFormation Hooks User Guide* .
     *
     * Valid values: `STACK` | `RESOURCE` | `CHANGE_SET` | `CLOUD_CONTROL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-guardhook.html#cfn-cloudformation-guardhook-targetoperations)
     */
    override fun targetOperations(): List<String> = unwrap(this).getTargetOperations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGuardHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnGuardHookProps):
        CfnGuardHookProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGuardHookProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGuardHookProps):
        software.amazon.awscdk.services.cloudformation.CfnGuardHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnGuardHookProps
  }
}
