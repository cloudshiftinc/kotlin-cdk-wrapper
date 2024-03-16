@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An object that represents the details about the remediation configuration that includes the
 * remediation action, parameters, and data to execute the action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * Object parameters;
 * CfnRemediationConfiguration cfnRemediationConfiguration =
 * CfnRemediationConfiguration.Builder.create(this, "MyCfnRemediationConfiguration")
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
public open class CfnRemediationConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.config.CfnRemediationConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The remediation is triggered automatically.
   */
  public open fun automatic(): Any? = unwrap(this).getAutomatic()

  /**
   * The remediation is triggered automatically.
   */
  public open fun automatic(`value`: Boolean) {
    unwrap(this).setAutomatic(`value`)
  }

  /**
   * The remediation is triggered automatically.
   */
  public open fun automatic(`value`: IResolvable) {
    unwrap(this).setAutomatic(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the AWS Config rule.
   */
  public open fun configRuleName(): String = unwrap(this).getConfigRuleName()

  /**
   * The name of the AWS Config rule.
   */
  public open fun configRuleName(`value`: String) {
    unwrap(this).setConfigRuleName(`value`)
  }

  /**
   * An ExecutionControls object.
   */
  public open fun executionControls(): Any? = unwrap(this).getExecutionControls()

  /**
   * An ExecutionControls object.
   */
  public open fun executionControls(`value`: IResolvable) {
    unwrap(this).setExecutionControls(`value`.let(IResolvable::unwrap))
  }

  /**
   * An ExecutionControls object.
   */
  public open fun executionControls(`value`: ExecutionControlsProperty) {
    unwrap(this).setExecutionControls(`value`.let(ExecutionControlsProperty::unwrap))
  }

  /**
   * An ExecutionControls object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b16899e776e943e7366d05ee8e1a8f09b2a85804caad30354c16b882731fe0")
  public open fun executionControls(`value`: ExecutionControlsProperty.Builder.() -> Unit): Unit =
      executionControls(ExecutionControlsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum number of failed attempts for auto-remediation.
   *
   * If you do not select a number, the default is 5.
   */
  public open fun maximumAutomaticAttempts(): Number? = unwrap(this).getMaximumAutomaticAttempts()

  /**
   * The maximum number of failed attempts for auto-remediation.
   *
   * If you do not select a number, the default is 5.
   */
  public open fun maximumAutomaticAttempts(`value`: Number) {
    unwrap(this).setMaximumAutomaticAttempts(`value`)
  }

  /**
   * An object of the RemediationParameterValue.
   *
   * For more information, see
   * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
   * .
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * An object of the RemediationParameterValue.
   *
   * For more information, see
   * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
   * .
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * The type of a resource.
   */
  public open fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * The type of a resource.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Time window to determine whether or not to add a remediation exception to prevent infinite
   * remediation attempts.
   */
  public open fun retryAttemptSeconds(): Number? = unwrap(this).getRetryAttemptSeconds()

  /**
   * Time window to determine whether or not to add a remediation exception to prevent infinite
   * remediation attempts.
   */
  public open fun retryAttemptSeconds(`value`: Number) {
    unwrap(this).setRetryAttemptSeconds(`value`)
  }

  /**
   * Target ID is the name of the SSM document.
   */
  public open fun targetId(): String = unwrap(this).getTargetId()

  /**
   * Target ID is the name of the SSM document.
   */
  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  /**
   * The type of the target.
   */
  public open fun targetType(): String = unwrap(this).getTargetType()

  /**
   * The type of the target.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * Version of the target.
   *
   * For example, version of the SSM document.
   */
  public open fun targetVersion(): String? = unwrap(this).getTargetVersion()

  /**
   * Version of the target.
   *
   * For example, version of the SSM document.
   */
  public open fun targetVersion(`value`: String) {
    unwrap(this).setTargetVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnRemediationConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     * @param automatic The remediation is triggered automatically. 
     */
    public fun automatic(automatic: Boolean)

    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     * @param automatic The remediation is triggered automatically. 
     */
    public fun automatic(automatic: IResolvable)

    /**
     * The name of the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename)
     * @param configRuleName The name of the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    public fun executionControls(executionControls: IResolvable)

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    public fun executionControls(executionControls: ExecutionControlsProperty)

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3a45ce517b58c86588a47a50ae3f6fff75472adb1a9bb29cbe4bd2da29274f")
    public fun executionControls(executionControls: ExecutionControlsProperty.Builder.() -> Unit)

    /**
     * The maximum number of failed attempts for auto-remediation. If you do not select a number,
     * the default is 5.
     *
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts)
     * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation.
     * If you do not select a number, the default is 5. 
     */
    public fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number)

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
     * @param parameters An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * . 
     */
    public fun parameters(parameters: Any)

    /**
     * The type of a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype)
     * @param resourceType The type of a resource. 
     */
    public fun resourceType(resourceType: String)

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
     * @param retryAttemptSeconds Time window to determine whether or not to add a remediation
     * exception to prevent infinite remediation attempts. 
     */
    public fun retryAttemptSeconds(retryAttemptSeconds: Number)

    /**
     * Target ID is the name of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid)
     * @param targetId Target ID is the name of the SSM document. 
     */
    public fun targetId(targetId: String)

    /**
     * The type of the target.
     *
     * Target executes remediation. For example, SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype)
     * @param targetType The type of the target. 
     */
    public fun targetType(targetType: String)

    /**
     * Version of the target. For example, version of the SSM document.
     *
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion)
     * @param targetVersion Version of the target. For example, version of the SSM document. 
     */
    public fun targetVersion(targetVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnRemediationConfiguration.Builder =
        software.amazon.awscdk.services.config.CfnRemediationConfiguration.Builder.create(scope, id)

    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     * @param automatic The remediation is triggered automatically. 
     */
    override fun automatic(automatic: Boolean) {
      cdkBuilder.automatic(automatic)
    }

    /**
     * The remediation is triggered automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-automatic)
     * @param automatic The remediation is triggered automatically. 
     */
    override fun automatic(automatic: IResolvable) {
      cdkBuilder.automatic(automatic.let(IResolvable::unwrap))
    }

    /**
     * The name of the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-configrulename)
     * @param configRuleName The name of the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    override fun executionControls(executionControls: IResolvable) {
      cdkBuilder.executionControls(executionControls.let(IResolvable::unwrap))
    }

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    override fun executionControls(executionControls: ExecutionControlsProperty) {
      cdkBuilder.executionControls(executionControls.let(ExecutionControlsProperty::unwrap))
    }

    /**
     * An ExecutionControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-executioncontrols)
     * @param executionControls An ExecutionControls object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3a45ce517b58c86588a47a50ae3f6fff75472adb1a9bb29cbe4bd2da29274f")
    override fun executionControls(executionControls: ExecutionControlsProperty.Builder.() -> Unit):
        Unit = executionControls(ExecutionControlsProperty(executionControls))

    /**
     * The maximum number of failed attempts for auto-remediation. If you do not select a number,
     * the default is 5.
     *
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50
     * seconds, AWS Config will put a RemediationException on your behalf for the failing resource
     * after the 5th failed attempt within 50 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-maximumautomaticattempts)
     * @param maximumAutomaticAttempts The maximum number of failed attempts for auto-remediation.
     * If you do not select a number, the default is 5. 
     */
    override fun maximumAutomaticAttempts(maximumAutomaticAttempts: Number) {
      cdkBuilder.maximumAutomaticAttempts(maximumAutomaticAttempts)
    }

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
     * @param parameters An object of the RemediationParameterValue. For more information, see
     * [RemediationParameterValue](https://docs.aws.amazon.com/config/latest/APIReference/API_RemediationParameterValue.html)
     * . 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The type of a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-resourcetype)
     * @param resourceType The type of a resource. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

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
     * @param retryAttemptSeconds Time window to determine whether or not to add a remediation
     * exception to prevent infinite remediation attempts. 
     */
    override fun retryAttemptSeconds(retryAttemptSeconds: Number) {
      cdkBuilder.retryAttemptSeconds(retryAttemptSeconds)
    }

    /**
     * Target ID is the name of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetid)
     * @param targetId Target ID is the name of the SSM document. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * The type of the target.
     *
     * Target executes remediation. For example, SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targettype)
     * @param targetType The type of the target. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * Version of the target. For example, version of the SSM document.
     *
     *
     * If you make backward incompatible changes to the SSM document, you must call
     * PutRemediationConfiguration API again to ensure the remediations can run.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html#cfn-config-remediationconfiguration-targetversion)
     * @param targetVersion Version of the target. For example, version of the SSM document. 
     */
    override fun targetVersion(targetVersion: String) {
      cdkBuilder.targetVersion(targetVersion)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnRemediationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnRemediationConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRemediationConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRemediationConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration):
        CfnRemediationConfiguration = CfnRemediationConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnRemediationConfiguration):
        software.amazon.awscdk.services.config.CfnRemediationConfiguration = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * ResourceValueProperty resourceValueProperty = ResourceValueProperty.builder()
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html)
   */
  public interface ResourceValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html#cfn-config-remediationconfiguration-resourcevalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ResourceValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty.builder()

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty,
    ) : CdkObject(cdkObject), ResourceValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html#cfn-config-remediationconfiguration-resourcevalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty):
          ResourceValueProperty = CdkObjectWrappers.wrap(cdkObject) as ResourceValueProperty

      internal fun unwrap(wrapped: ResourceValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ResourceValueProperty
    }
  }

  /**
   * An ExecutionControls object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * ExecutionControlsProperty executionControlsProperty = ExecutionControlsProperty.builder()
   * .ssmControls(SsmControlsProperty.builder()
   * .concurrentExecutionRatePercentage(123)
   * .errorPercentage(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html)
   */
  public interface ExecutionControlsProperty {
    /**
     * A SsmControls object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html#cfn-config-remediationconfiguration-executioncontrols-ssmcontrols)
     */
    public fun ssmControls(): Any? = unwrap(this).getSsmControls()

    /**
     * A builder for [ExecutionControlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ssmControls A SsmControls object.
       */
      public fun ssmControls(ssmControls: IResolvable)

      /**
       * @param ssmControls A SsmControls object.
       */
      public fun ssmControls(ssmControls: SsmControlsProperty)

      /**
       * @param ssmControls A SsmControls object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b4b643ffb4f3a16cf00c0244f3bd7a404fc2d41a89b02ab4615003c0613676c")
      public fun ssmControls(ssmControls: SsmControlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.builder()

      /**
       * @param ssmControls A SsmControls object.
       */
      override fun ssmControls(ssmControls: IResolvable) {
        cdkBuilder.ssmControls(ssmControls.let(IResolvable::unwrap))
      }

      /**
       * @param ssmControls A SsmControls object.
       */
      override fun ssmControls(ssmControls: SsmControlsProperty) {
        cdkBuilder.ssmControls(ssmControls.let(SsmControlsProperty::unwrap))
      }

      /**
       * @param ssmControls A SsmControls object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b4b643ffb4f3a16cf00c0244f3bd7a404fc2d41a89b02ab4615003c0613676c")
      override fun ssmControls(ssmControls: SsmControlsProperty.Builder.() -> Unit): Unit =
          ssmControls(SsmControlsProperty(ssmControls))

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty,
    ) : CdkObject(cdkObject), ExecutionControlsProperty {
      /**
       * A SsmControls object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html#cfn-config-remediationconfiguration-executioncontrols-ssmcontrols)
       */
      override fun ssmControls(): Any? = unwrap(this).getSsmControls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionControlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty):
          ExecutionControlsProperty = CdkObjectWrappers.wrap(cdkObject) as ExecutionControlsProperty

      internal fun unwrap(wrapped: ExecutionControlsProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty
    }
  }

  /**
   * AWS Systems Manager (SSM) specific remediation controls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * SsmControlsProperty ssmControlsProperty = SsmControlsProperty.builder()
   * .concurrentExecutionRatePercentage(123)
   * .errorPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html)
   */
  public interface SsmControlsProperty {
    /**
     * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant
     * resources for that specific rule.
     *
     * You can specify a percentage, such as 10%. The default value is 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage)
     */
    public fun concurrentExecutionRatePercentage(): Number? =
        unwrap(this).getConcurrentExecutionRatePercentage()

    /**
     * The percentage of errors that are allowed before SSM stops running automations on
     * non-compliant resources for that specific rule.
     *
     * You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage,
     * the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant
     * resources, then SSM stops running the automations when the fifth error is received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage)
     */
    public fun errorPercentage(): Number? = unwrap(this).getErrorPercentage()

    /**
     * A builder for [SsmControlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param concurrentExecutionRatePercentage The maximum percentage of remediation actions
       * allowed to run in parallel on the non-compliant resources for that specific rule.
       * You can specify a percentage, such as 10%. The default value is 10.
       */
      public fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number)

      /**
       * @param errorPercentage The percentage of errors that are allowed before SSM stops running
       * automations on non-compliant resources for that specific rule.
       * You can specify a percentage of errors, for example 10%. If you do not specifiy a
       * percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10
       * non-compliant resources, then SSM stops running the automations when the fifth error is
       * received.
       */
      public fun errorPercentage(errorPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty.builder()

      /**
       * @param concurrentExecutionRatePercentage The maximum percentage of remediation actions
       * allowed to run in parallel on the non-compliant resources for that specific rule.
       * You can specify a percentage, such as 10%. The default value is 10.
       */
      override fun concurrentExecutionRatePercentage(concurrentExecutionRatePercentage: Number) {
        cdkBuilder.concurrentExecutionRatePercentage(concurrentExecutionRatePercentage)
      }

      /**
       * @param errorPercentage The percentage of errors that are allowed before SSM stops running
       * automations on non-compliant resources for that specific rule.
       * You can specify a percentage of errors, for example 10%. If you do not specifiy a
       * percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10
       * non-compliant resources, then SSM stops running the automations when the fifth error is
       * received.
       */
      override fun errorPercentage(errorPercentage: Number) {
        cdkBuilder.errorPercentage(errorPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty,
    ) : CdkObject(cdkObject), SsmControlsProperty {
      /**
       * The maximum percentage of remediation actions allowed to run in parallel on the
       * non-compliant resources for that specific rule.
       *
       * You can specify a percentage, such as 10%. The default value is 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage)
       */
      override fun concurrentExecutionRatePercentage(): Number? =
          unwrap(this).getConcurrentExecutionRatePercentage()

      /**
       * The percentage of errors that are allowed before SSM stops running automations on
       * non-compliant resources for that specific rule.
       *
       * You can specify a percentage of errors, for example 10%. If you do not specifiy a
       * percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10
       * non-compliant resources, then SSM stops running the automations when the fifth error is
       * received.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage)
       */
      override fun errorPercentage(): Number? = unwrap(this).getErrorPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SsmControlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty):
          SsmControlsProperty = CdkObjectWrappers.wrap(cdkObject) as SsmControlsProperty

      internal fun unwrap(wrapped: SsmControlsProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * StaticValueProperty staticValueProperty = StaticValueProperty.builder()
   * .value(List.of("value"))
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html)
   */
  public interface StaticValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html#cfn-config-remediationconfiguration-staticvalue-value)
     */
    public fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html#cfn-config-remediationconfiguration-staticvalue-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [StaticValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: List<String>)

      /**
       * @param value the value to be set.
       */
      public fun `value`(vararg `value`: String)

      /**
       * @param values the value to be set.
       */
      public fun values(values: List<String>)

      /**
       * @param values the value to be set.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.builder()

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      /**
       * @param values the value to be set.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values the value to be set.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty,
    ) : CdkObject(cdkObject), StaticValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html#cfn-config-remediationconfiguration-staticvalue-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html#cfn-config-remediationconfiguration-staticvalue-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StaticValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty):
          StaticValueProperty = CdkObjectWrappers.wrap(cdkObject) as StaticValueProperty

      internal fun unwrap(wrapped: StaticValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty
    }
  }

  /**
   * The value is either a dynamic (resource) value or a static value.
   *
   * You must select either a dynamic value or a static value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * RemediationParameterValueProperty remediationParameterValueProperty =
   * RemediationParameterValueProperty.builder()
   * .resourceValue(ResourceValueProperty.builder()
   * .value("value")
   * .build())
   * .staticValue(StaticValueProperty.builder()
   * .value(List.of("value"))
   * .values(List.of("values"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html)
   */
  public interface RemediationParameterValueProperty {
    /**
     * The value is dynamic and changes at run-time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html#cfn-config-remediationconfiguration-remediationparametervalue-resourcevalue)
     */
    public fun resourceValue(): Any? = unwrap(this).getResourceValue()

    /**
     * The value is static and does not change at run-time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html#cfn-config-remediationconfiguration-remediationparametervalue-staticvalue)
     */
    public fun staticValue(): Any? = unwrap(this).getStaticValue()

    /**
     * A builder for [RemediationParameterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      public fun resourceValue(resourceValue: IResolvable)

      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      public fun resourceValue(resourceValue: ResourceValueProperty)

      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1446444839d26f366a9c554c7dad27fe1feaef75c5dbb0601c8b3d433e992f")
      public fun resourceValue(resourceValue: ResourceValueProperty.Builder.() -> Unit)

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      public fun staticValue(staticValue: IResolvable)

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      public fun staticValue(staticValue: StaticValueProperty)

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f05fed1261a019c0caa131c0722b34f856f69966d834f444b31a673c861ea26")
      public fun staticValue(staticValue: StaticValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty.builder()

      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      override fun resourceValue(resourceValue: IResolvable) {
        cdkBuilder.resourceValue(resourceValue.let(IResolvable::unwrap))
      }

      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      override fun resourceValue(resourceValue: ResourceValueProperty) {
        cdkBuilder.resourceValue(resourceValue.let(ResourceValueProperty::unwrap))
      }

      /**
       * @param resourceValue The value is dynamic and changes at run-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1446444839d26f366a9c554c7dad27fe1feaef75c5dbb0601c8b3d433e992f")
      override fun resourceValue(resourceValue: ResourceValueProperty.Builder.() -> Unit): Unit =
          resourceValue(ResourceValueProperty(resourceValue))

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      override fun staticValue(staticValue: IResolvable) {
        cdkBuilder.staticValue(staticValue.let(IResolvable::unwrap))
      }

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      override fun staticValue(staticValue: StaticValueProperty) {
        cdkBuilder.staticValue(staticValue.let(StaticValueProperty::unwrap))
      }

      /**
       * @param staticValue The value is static and does not change at run-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f05fed1261a019c0caa131c0722b34f856f69966d834f444b31a673c861ea26")
      override fun staticValue(staticValue: StaticValueProperty.Builder.() -> Unit): Unit =
          staticValue(StaticValueProperty(staticValue))

      public fun build():
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty,
    ) : CdkObject(cdkObject), RemediationParameterValueProperty {
      /**
       * The value is dynamic and changes at run-time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html#cfn-config-remediationconfiguration-remediationparametervalue-resourcevalue)
       */
      override fun resourceValue(): Any? = unwrap(this).getResourceValue()

      /**
       * The value is static and does not change at run-time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html#cfn-config-remediationconfiguration-remediationparametervalue-staticvalue)
       */
      override fun staticValue(): Any? = unwrap(this).getStaticValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RemediationParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty):
          RemediationParameterValueProperty = CdkObjectWrappers.wrap(cdkObject) as
          RemediationParameterValueProperty

      internal fun unwrap(wrapped: RemediationParameterValueProperty):
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnRemediationConfiguration.RemediationParameterValueProperty
    }
  }
}
