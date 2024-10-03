@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRemediationConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * Object parameters;
 * CfnRemediationConfigurationProps cfnRemediationConfigurationProps =
 * CfnRemediationConfigurationProps.builder()
 * .configRuleName("configRuleName")
 * .targetId("targetId")
 * .targetType("targetType")
 * // the properties below are optional
 * .automatic(false)
 * .executionControls(ExecutionControlsProperty.builder()
 * .ssmControls(SsmControlsProperty.builder()
 * .concurrentExecutionRatePercentage(123)
 * .errorPercentage(123)
 * .build())
 * .build())
 * .maximumAutomaticAttempts(123)
 * .parameters(parameters)
 * .resourceType("resourceType")
 * .retryAttemptSeconds(123)
 * .targetVersion("targetVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html)
 */
public interface CfnRemediationConfigurationProps {
  /**
   * The remediation is triggered automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
   */
  public fun automatic(): Any? = unwrap(this).getAutomatic()

  /**
   * The name of the AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename)
   */
  public fun configRuleName(): String

  /**
   * An ExecutionControls object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
   */
  public fun executionControls(): Any? = unwrap(this).getExecutionControls()

  /**
   * The maximum number of failed attempts for auto-remediation. If you do not select a number, the
   * default is 5.
   *
   * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
   * seconds, AWS Config will put a RemediationException on your behalf for the failing resource after
   * the 5th failed attempt within 50 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts)
   */
  public fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

  /**
   * An object of the RemediationParameterValue. For more information, see
   * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
   * .
   *
   *
   * The type is a map of strings to RemediationParameterValue.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The type of a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype)
   */
  public fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * Time window to determine whether or not to add a remediation exception to prevent infinite
   * remediation attempts.
   *
   * If `MaximumAutomaticAttempts` remediation attempts have been made under `RetryAttemptSeconds` ,
   * a remediation exception will be added to the resource. If you do not select a number, the default
   * is 60 seconds.
   *
   * For example, if you specify `RetryAttemptSeconds` as 50 seconds and `MaximumAutomaticAttempts`
   * as 5, AWS Config will run auto-remediations 5 times within 50 seconds before adding a remediation
   * exception to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds)
   */
  public fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

  /**
   * Target ID is the name of the SSM document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid)
   */
  public fun targetId(): String

  /**
   * The type of the target.
   *
   * Target executes remediation. For example, SSM document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype)
   */
  public fun targetType(): String

  /**
   * Version of the target. For example, version of the SSM document.
   *
   *
   * If you make backward incompatible changes to the SSM document, you must call
   * PutRemediationConfiguration API again to ensure the remediations can run.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion)
   */
  public fun targetVersion(): String? = unwrap(this).getTargetVersion()

  /**
   * A builder for [CfnRemediationConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param automatic The remediation is triggered automatically.
     */
    public fun automatic(automatic: Boolean)

    /**
     * @param automatic The remediation is triggered automatically.
     */
    public fun automatic(automatic: IResolvable)

    /**
     * @param configRuleName The name of the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * @param executionControls An ExecutionControls object.
     */
    public fun executionControls(executionControls: IResolvable)

    /**
     * @param executionControls An ExecutionControls object.
     */
    public
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty)

    /**
     * @param executionControls An ExecutionControls object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e20cdb25e82ee7bf91f5e29212f08cdf4f58a08a209868dccf0cfd2dca7cd236")
    public
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty.Builder.() -> Unit)

    /**
     * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation.
     * If you do not select a number, the default is 5.
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     */
    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number)

    /**
     * @param parameters An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * .
     *
     * The type is a map of strings to RemediationParameterValue.
     */
    public fun parameters(parameters: Any)

    /**
     * @param resourceType The type of a resource.
     */
    public fun resourceType(resourceType: String)

    /**
     * @param retryAttemptSeconds Time window to determine whether or not to add a remediation
     * exception to prevent infinite remediation attempts.
     * If `MaximumAutomaticAttempts` remediation attempts have been made under `RetryAttemptSeconds`
     * , a remediation exception will be added to the resource. If you do not select a number, the
     * default is 60 seconds.
     *
     * For example, if you specify `RetryAttemptSeconds` as 50 seconds and
     * `MaximumAutomaticAttempts` as 5, AWS Config will run auto-remediations 5 times within 50 seconds
     * before adding a remediation exception to the resource.
     */
    public fun retryAttemptSeconds(retryAttemptSeconds: Number)

    /**
     * @param targetId Target ID is the name of the SSM document. 
     */
    public fun targetId(targetId: String)

    /**
     * @param targetType The type of the target. 
     * Target executes remediation. For example, SSM document.
     */
    public fun targetType(targetType: String)

    /**
     * @param targetVersion Version of the target. For example, version of the SSM document.
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     */
    public fun targetVersion(targetVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps.Builder =
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps.builder()

    /**
     * @param automatic The remediation is triggered automatically.
     */
    override fun automatic(automatic: Boolean) {
      cdkBuilder.automatic(automatic)
    }

    /**
     * @param automatic The remediation is triggered automatically.
     */
    override fun automatic(automatic: IResolvable) {
      cdkBuilder.automatic(automatic.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configRuleName The name of the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * @param executionControls An ExecutionControls object.
     */
    override fun executionControls(executionControls: IResolvable) {
      cdkBuilder.executionControls(executionControls.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param executionControls An ExecutionControls object.
     */
    override
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty) {
      cdkBuilder.executionControls(executionControls.let(CfnRemediationConfiguration.ExecutionControlsProperty.Companion::unwrap))
    }

    /**
     * @param executionControls An ExecutionControls object.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e20cdb25e82ee7bf91f5e29212f08cdf4f58a08a209868dccf0cfd2dca7cd236")
    override
        fun executionControls(executionControls: CfnRemediationConfiguration.ExecutionControlsProperty.Builder.() -> Unit):
        Unit =
        executionControls(CfnRemediationConfiguration.ExecutionControlsProperty(executionControls))

    /**
     * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation.
     * If you do not select a number, the default is 5.
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     */
    override fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
      cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

    /**
     * @param parameters An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * .
     *
     * The type is a map of strings to RemediationParameterValue.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param resourceType The type of a resource.
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param retryAttemptSeconds Time window to determine whether or not to add a remediation
     * exception to prevent infinite remediation attempts.
     * If `MaximumAutomaticAttempts` remediation attempts have been made under `RetryAttemptSeconds`
     * , a remediation exception will be added to the resource. If you do not select a number, the
     * default is 60 seconds.
     *
     * For example, if you specify `RetryAttemptSeconds` as 50 seconds and
     * `MaximumAutomaticAttempts` as 5, AWS Config will run auto-remediations 5 times within 50 seconds
     * before adding a remediation exception to the resource.
     */
    override fun retryAttemptSeconds(retryAttemptSeconds: Number) {
      cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    /**
     * @param targetId Target ID is the name of the SSM document. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * @param targetType The type of the target. 
     * Target executes remediation. For example, SSM document.
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * @param targetVersion Version of the target. For example, version of the SSM document.
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     */
    override fun targetVersion(targetVersion: String) {
      cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnRemediationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnRemediationConfigurationProps {
    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     */
    override fun automatic(): Any? = unwrap(this).getAutomatic()

    /**
     * The name of the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename)
     */
    override fun configRuleName(): String = unwrap(this).getConfigRuleName()

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     */
    override fun executionControls(): Any? = unwrap(this).getExecutionControls()

    /**
     * The maximum number of failed attempts for auto-remediation. If you do not select a number,
     * the default is 5.
     *
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts)
     */
    override fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

    /**
     * An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * .
     *
     *
     * The type is a map of strings to RemediationParameterValue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The type of a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype)
     */
    override fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * Time window to determine whether or not to add a remediation exception to prevent infinite
     * remediation attempts.
     *
     * If `MaximumAutomaticAttempts` remediation attempts have been made under `RetryAttemptSeconds`
     * , a remediation exception will be added to the resource. If you do not select a number, the
     * default is 60 seconds.
     *
     * For example, if you specify `RetryAttemptSeconds` as 50 seconds and
     * `MaximumAutomaticAttempts` as 5, AWS Config will run auto-remediations 5 times within 50 seconds
     * before adding a remediation exception to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-retryattemptseconds)
     */
    override fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

    /**
     * Target ID is the name of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid)
     */
    override fun targetId(): String = unwrap(this).getTargetId()

    /**
     * The type of the target.
     *
     * Target executes remediation. For example, SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype)
     */
    override fun targetType(): String = unwrap(this).getTargetType()

    /**
     * Version of the target. For example, version of the SSM document.
     *
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion)
     */
    override fun targetVersion(): String? = unwrap(this).getTargetVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRemediationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfigurationProps):
        CfnRemediationConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRemediationConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRemediationConfigurationProps):
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
  }
}
