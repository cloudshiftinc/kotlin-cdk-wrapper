@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::LookoutMetrics::Alert` type creates an alert for an anomaly detector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
 * CfnAlert cfnAlert = CfnAlert.Builder.create(this, "MyCfnAlert")
 * .action(ActionProperty.builder()
 * .lambdaConfiguration(LambdaConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .roleArn("roleArn")
 * .build())
 * .snsConfiguration(SNSConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .snsTopicArn("snsTopicArn")
 * .build())
 * .build())
 * .alertSensitivityThreshold(123)
 * .anomalyDetectorArn("anomalyDetectorArn")
 * // the properties below are optional
 * .alertDescription("alertDescription")
 * .alertName("alertName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html)
 */
public open class CfnAlert internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAlertProps,
  ) :
      this(software.amazon.awscdk.services.lookoutmetrics.CfnAlert(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAlertProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAlertProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAlertProps(props)
  )

  /**
   * Action that will be triggered when there is an alert.
   */
  public open fun action(): Any = unwrap(this).getAction()

  /**
   * Action that will be triggered when there is an alert.
   */
  public open fun action(`value`: IResolvable) {
    unwrap(this).setAction(`value`.let(IResolvable::unwrap))
  }

  /**
   * Action that will be triggered when there is an alert.
   */
  public open fun action(`value`: ActionProperty) {
    unwrap(this).setAction(`value`.let(ActionProperty::unwrap))
  }

  /**
   * Action that will be triggered when there is an alert.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b95d6b99fb4f0256195cb6943042dccba07e9fb979866e2e1df086fbcd3fa028")
  public open fun action(`value`: ActionProperty.Builder.() -> Unit): Unit =
      action(ActionProperty(`value`))

  /**
   * A description of the alert.
   */
  public open fun alertDescription(): String? = unwrap(this).getAlertDescription()

  /**
   * A description of the alert.
   */
  public open fun alertDescription(`value`: String) {
    unwrap(this).setAlertDescription(`value`)
  }

  /**
   * The name of the alert.
   */
  public open fun alertName(): String? = unwrap(this).getAlertName()

  /**
   * The name of the alert.
   */
  public open fun alertName(`value`: String) {
    unwrap(this).setAlertName(`value`)
  }

  /**
   * An integer from 0 to 100 specifying the alert sensitivity threshold.
   */
  public open fun alertSensitivityThreshold(): Number = unwrap(this).getAlertSensitivityThreshold()

  /**
   * An integer from 0 to 100 specifying the alert sensitivity threshold.
   */
  public open fun alertSensitivityThreshold(`value`: Number) {
    unwrap(this).setAlertSensitivityThreshold(`value`)
  }

  /**
   * The ARN of the detector to which the alert is attached.
   */
  public open fun anomalyDetectorArn(): String = unwrap(this).getAnomalyDetectorArn()

  /**
   * The ARN of the detector to which the alert is attached.
   */
  public open fun anomalyDetectorArn(`value`: String) {
    unwrap(this).setAnomalyDetectorArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the alert.
   *
   * For example, `arn:aws:lookoutmetrics:us-east-2:123456789012:Alert:my-alert`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lookoutmetrics.CfnAlert].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    public fun action(action: IResolvable)

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    public fun action(action: ActionProperty)

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("278d5b12b8e89982419453ae1ea077de5bb3941638eeabea7724e0a04e604d45")
    public fun action(action: ActionProperty.Builder.() -> Unit)

    /**
     * A description of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
     * @param alertDescription A description of the alert. 
     */
    public fun alertDescription(alertDescription: String)

    /**
     * The name of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
     * @param alertName The name of the alert. 
     */
    public fun alertName(alertName: String)

    /**
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     * threshold. 
     */
    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number)

    /**
     * The ARN of the detector to which the alert is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
     * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
     */
    public fun anomalyDetectorArn(anomalyDetectorArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder.create(scope, id)

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    override fun action(action: ActionProperty) {
      cdkBuilder.action(action.let(ActionProperty::unwrap))
    }

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     * @param action Action that will be triggered when there is an alert. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("278d5b12b8e89982419453ae1ea077de5bb3941638eeabea7724e0a04e604d45")
    override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
        action(ActionProperty(action))

    /**
     * A description of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
     * @param alertDescription A description of the alert. 
     */
    override fun alertDescription(alertDescription: String) {
      cdkBuilder.alertDescription(alertDescription)
    }

    /**
     * The name of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
     * @param alertName The name of the alert. 
     */
    override fun alertName(alertName: String) {
      cdkBuilder.alertName(alertName)
    }

    /**
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     * threshold. 
     */
    override fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
      cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    /**
     * The ARN of the detector to which the alert is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
     * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
     */
    override fun anomalyDetectorArn(anomalyDetectorArn: String) {
      cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlert = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lookoutmetrics.CfnAlert.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlert {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlert(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert): CfnAlert
        = CfnAlert(cdkObject)

    internal fun unwrap(wrapped: CfnAlert): software.amazon.awscdk.services.lookoutmetrics.CfnAlert
        = wrapped.cdkObject
  }

  /**
   * A configuration that specifies the action to perform when anomalies are detected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .lambdaConfiguration(LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build())
   * .snsConfiguration(SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html)
   */
  public interface ActionProperty {
    /**
     * A configuration for an AWS Lambda channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html#cfn-lookoutmetrics-alert-action-lambdaconfiguration)
     */
    public fun lambdaConfiguration(): Any? = unwrap(this).getLambdaConfiguration()

    /**
     * A configuration for an Amazon SNS channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html#cfn-lookoutmetrics-alert-action-snsconfiguration)
     */
    public fun snsConfiguration(): Any? = unwrap(this).getSnsConfiguration()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      public fun lambdaConfiguration(lambdaConfiguration: IResolvable)

      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      public fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty)

      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a3986527e9aa6ec69402be8b4e46fed80a6999a2031ccfe032e4b81c8bdbba2")
      public
          fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty.Builder.() -> Unit)

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      public fun snsConfiguration(snsConfiguration: IResolvable)

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      public fun snsConfiguration(snsConfiguration: SNSConfigurationProperty)

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63e72e0610e94a8ffa8307fe364f6918789fc16738b62a3a110b3403b0808faa")
      public fun snsConfiguration(snsConfiguration: SNSConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty.builder()

      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      override fun lambdaConfiguration(lambdaConfiguration: IResolvable) {
        cdkBuilder.lambdaConfiguration(lambdaConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      override fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty) {
        cdkBuilder.lambdaConfiguration(lambdaConfiguration.let(LambdaConfigurationProperty::unwrap))
      }

      /**
       * @param lambdaConfiguration A configuration for an AWS Lambda channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a3986527e9aa6ec69402be8b4e46fed80a6999a2031ccfe032e4b81c8bdbba2")
      override
          fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty.Builder.() -> Unit):
          Unit = lambdaConfiguration(LambdaConfigurationProperty(lambdaConfiguration))

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      override fun snsConfiguration(snsConfiguration: IResolvable) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      override fun snsConfiguration(snsConfiguration: SNSConfigurationProperty) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(SNSConfigurationProperty::unwrap))
      }

      /**
       * @param snsConfiguration A configuration for an Amazon SNS channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63e72e0610e94a8ffa8307fe364f6918789fc16738b62a3a110b3403b0808faa")
      override fun snsConfiguration(snsConfiguration: SNSConfigurationProperty.Builder.() -> Unit):
          Unit = snsConfiguration(SNSConfigurationProperty(snsConfiguration))

      public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * A configuration for an AWS Lambda channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html#cfn-lookoutmetrics-alert-action-lambdaconfiguration)
       */
      override fun lambdaConfiguration(): Any? = unwrap(this).getLambdaConfiguration()

      /**
       * A configuration for an Amazon SNS channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-action.html#cfn-lookoutmetrics-alert-action-snsconfiguration)
       */
      override fun snsConfiguration(): Any? = unwrap(this).getSnsConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty
    }
  }

  /**
   * Contains information about a Lambda configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * LambdaConfigurationProperty lambdaConfigurationProperty = LambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html)
   */
  public interface LambdaConfigurationProperty {
    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html#cfn-lookoutmetrics-alert-lambdaconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * The ARN of an IAM role that has permission to invoke the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html#cfn-lookoutmetrics-alert-lambdaconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [LambdaConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The ARN of the Lambda function. 
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param roleArn The ARN of an IAM role that has permission to invoke the Lambda function. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.builder()

      /**
       * @param lambdaArn The ARN of the Lambda function. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param roleArn The ARN of an IAM role that has permission to invoke the Lambda function. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty,
    ) : CdkObject(cdkObject), LambdaConfigurationProperty {
      /**
       * The ARN of the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html#cfn-lookoutmetrics-alert-lambdaconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()

      /**
       * The ARN of an IAM role that has permission to invoke the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html#cfn-lookoutmetrics-alert-lambdaconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty):
          LambdaConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty
    }
  }

  /**
   * Contains information about the SNS topic to which you want to send your alerts and the IAM role
   * that has access to that topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * SNSConfigurationProperty sNSConfigurationProperty = SNSConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html)
   */
  public interface SNSConfigurationProperty {
    /**
     * The ARN of the IAM role that has access to the target SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html#cfn-lookoutmetrics-alert-snsconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the target SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html#cfn-lookoutmetrics-alert-snsconfiguration-snstopicarn)
     */
    public fun snsTopicArn(): String

    /**
     * A builder for [SNSConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of the IAM role that has access to the target SNS topic. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param snsTopicArn The ARN of the target SNS topic. 
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.builder()

      /**
       * @param roleArn The ARN of the IAM role that has access to the target SNS topic. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param snsTopicArn The ARN of the target SNS topic. 
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty,
    ) : CdkObject(cdkObject), SNSConfigurationProperty {
      /**
       * The ARN of the IAM role that has access to the target SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html#cfn-lookoutmetrics-alert-snsconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the target SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-snsconfiguration.html#cfn-lookoutmetrics-alert-snsconfiguration-snstopicarn)
       */
      override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SNSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty):
          SNSConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? SNSConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty
    }
  }
}
