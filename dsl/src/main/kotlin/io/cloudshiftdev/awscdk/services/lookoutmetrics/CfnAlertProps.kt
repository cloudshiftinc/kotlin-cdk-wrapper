package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAlertProps {
  /**
   * Action that will be triggered when there is an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
   */
  public fun action(): Any

  /**
   * A description of the alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
   */
  public fun alertDescription(): String? = unwrap(this).getAlertDescription()

  /**
   * The name of the alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
   */
  public fun alertName(): String? = unwrap(this).getAlertName()

  /**
   * An integer from 0 to 100 specifying the alert sensitivity threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
   */
  public fun alertSensitivityThreshold(): Number

  /**
   * The ARN of the detector to which the alert is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
   */
  public fun anomalyDetectorArn(): String

  /**
   * A builder for [CfnAlertProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    public fun action(action: IResolvable)

    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    public fun action(action: CfnAlert.ActionProperty)

    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("494f3cedb4887c86a44f8656b9aa726dee3d7e02a83082d5e50187568dfda58b")
    public fun action(action: CfnAlert.ActionProperty.Builder.() -> Unit)

    /**
     * @param alertDescription A description of the alert.
     */
    public fun alertDescription(alertDescription: String)

    /**
     * @param alertName The name of the alert.
     */
    public fun alertName(alertName: String)

    /**
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     * threshold. 
     */
    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number)

    /**
     * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
     */
    public fun anomalyDetectorArn(anomalyDetectorArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.builder()

    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    override fun action(action: CfnAlert.ActionProperty) {
      cdkBuilder.action(action.let(CfnAlert.ActionProperty::unwrap))
    }

    /**
     * @param action Action that will be triggered when there is an alert. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("494f3cedb4887c86a44f8656b9aa726dee3d7e02a83082d5e50187568dfda58b")
    override fun action(action: CfnAlert.ActionProperty.Builder.() -> Unit): Unit =
        action(CfnAlert.ActionProperty(action))

    /**
     * @param alertDescription A description of the alert.
     */
    override fun alertDescription(alertDescription: String) {
      cdkBuilder.alertDescription(alertDescription)
    }

    /**
     * @param alertName The name of the alert.
     */
    override fun alertName(alertName: String) {
      cdkBuilder.alertName(alertName)
    }

    /**
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     * threshold. 
     */
    override fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
      cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    /**
     * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
     */
    override fun anomalyDetectorArn(anomalyDetectorArn: String) {
      cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps,
  ) : CdkObject(cdkObject), CfnAlertProps {
    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     */
    override fun action(): Any = unwrap(this).getAction()

    /**
     * A description of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
     */
    override fun alertDescription(): String? = unwrap(this).getAlertDescription()

    /**
     * The name of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
     */
    override fun alertName(): String? = unwrap(this).getAlertName()

    /**
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
     */
    override fun alertSensitivityThreshold(): Number = unwrap(this).getAlertSensitivityThreshold()

    /**
     * The ARN of the detector to which the alert is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
     */
    override fun anomalyDetectorArn(): String = unwrap(this).getAnomalyDetectorArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlertProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps):
        CfnAlertProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlertProps):
        software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
  }
}
