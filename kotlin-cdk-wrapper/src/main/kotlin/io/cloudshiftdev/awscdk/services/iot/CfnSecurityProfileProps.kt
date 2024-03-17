@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSecurityProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSecurityProfileProps cfnSecurityProfileProps = CfnSecurityProfileProps.builder()
 * .additionalMetricsToRetainV2(List.of(MetricToRetainProperty.builder()
 * .metric("metric")
 * // the properties below are optional
 * .exportMetric(false)
 * .metricDimension(MetricDimensionProperty.builder()
 * .dimensionName("dimensionName")
 * // the properties below are optional
 * .operator("operator")
 * .build())
 * .build()))
 * .alertTargets(Map.of(
 * "alertTargetsKey", AlertTargetProperty.builder()
 * .alertTargetArn("alertTargetArn")
 * .roleArn("roleArn")
 * .build()))
 * .behaviors(List.of(BehaviorProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .criteria(BehaviorCriteriaProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .consecutiveDatapointsToAlarm(123)
 * .consecutiveDatapointsToClear(123)
 * .durationSeconds(123)
 * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
 * .confidenceLevel("confidenceLevel")
 * .build())
 * .statisticalThreshold(StatisticalThresholdProperty.builder()
 * .statistic("statistic")
 * .build())
 * .value(MetricValueProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .count("count")
 * .number(123)
 * .numbers(List.of(123))
 * .ports(List.of(123))
 * .strings(List.of("strings"))
 * .build())
 * .build())
 * .exportMetric(false)
 * .metric("metric")
 * .metricDimension(MetricDimensionProperty.builder()
 * .dimensionName("dimensionName")
 * // the properties below are optional
 * .operator("operator")
 * .build())
 * .suppressAlerts(false)
 * .build()))
 * .metricsExportConfig(MetricsExportConfigProperty.builder()
 * .mqttTopic("mqttTopic")
 * .roleArn("roleArn")
 * .build())
 * .securityProfileDescription("securityProfileDescription")
 * .securityProfileName("securityProfileName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetArns(List.of("targetArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html)
 */
public interface CfnSecurityProfileProps {
  /**
   * A list of metrics whose data is retained (stored).
   *
   * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
   * retained for any metric specified here. Can be used with custom metrics; can't be used with
   * dimensions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
   */
  public fun additionalMetricsToRetainV2(): Any? = unwrap(this).getAdditionalMetricsToRetainV2()

  /**
   * Specifies the destinations to which alerts are sent.
   *
   * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a
   * behavior.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
   */
  public fun alertTargets(): Any? = unwrap(this).getAlertTargets()

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
   */
  public fun behaviors(): Any? = unwrap(this).getBehaviors()

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
   */
  public fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

  /**
   * A description of the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofiledescription)
   */
  public fun securityProfileDescription(): String? = unwrap(this).getSecurityProfileDescription()

  /**
   * The name you gave to the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofilename)
   */
  public fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

  /**
   * Metadata that can be used to manage the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
   */
  public fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()

  /**
   * A builder for [CfnSecurityProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable)

    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>)

    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    public fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any)

    /**
     * @param alertTargets Specifies the destinations to which alerts are sent.
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     */
    public fun alertTargets(alertTargets: IResolvable)

    /**
     * @param alertTargets Specifies the destinations to which alerts are sent.
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     */
    public fun alertTargets(alertTargets: Map<String, Any>)

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    public fun behaviors(behaviors: IResolvable)

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    public fun behaviors(behaviors: List<Any>)

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    public fun behaviors(vararg behaviors: Any)

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    public fun metricsExportConfig(metricsExportConfig: IResolvable)

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    public
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty)

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0cb1b8775cdde8c710743dfc462f63545ea39c87190a767cbb57a1799cf19c")
    public
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty.Builder.() -> Unit)

    /**
     * @param securityProfileDescription A description of the security profile.
     */
    public fun securityProfileDescription(securityProfileDescription: String)

    /**
     * @param securityProfileName The name you gave to the security profile.
     */
    public fun securityProfileName(securityProfileName: String)

    /**
     * @param tags Metadata that can be used to manage the security profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the security profile.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached.
     */
    public fun targetArns(targetArns: List<String>)

    /**
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached.
     */
    public fun targetArns(vararg targetArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSecurityProfileProps.Builder =
        software.amazon.awscdk.services.iot.CfnSecurityProfileProps.builder()

    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2.let(IResolvable::unwrap))
    }

    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
    }

    /**
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored).
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     */
    override fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any): Unit =
        additionalMetricsToRetainV2(additionalMetricsToRetainV2.toList())

    /**
     * @param alertTargets Specifies the destinations to which alerts are sent.
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     */
    override fun alertTargets(alertTargets: IResolvable) {
      cdkBuilder.alertTargets(alertTargets.let(IResolvable::unwrap))
    }

    /**
     * @param alertTargets Specifies the destinations to which alerts are sent.
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     */
    override fun alertTargets(alertTargets: Map<String, Any>) {
      cdkBuilder.alertTargets(alertTargets)
    }

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    override fun behaviors(behaviors: IResolvable) {
      cdkBuilder.behaviors(behaviors.let(IResolvable::unwrap))
    }

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    override fun behaviors(behaviors: List<Any>) {
      cdkBuilder.behaviors(behaviors)
    }

    /**
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     */
    override fun behaviors(vararg behaviors: Any): Unit = behaviors(behaviors.toList())

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    override fun metricsExportConfig(metricsExportConfig: IResolvable) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(IResolvable::unwrap))
    }

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    override
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(CfnSecurityProfile.MetricsExportConfigProperty::unwrap))
    }

    /**
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0cb1b8775cdde8c710743dfc462f63545ea39c87190a767cbb57a1799cf19c")
    override
        fun metricsExportConfig(metricsExportConfig: CfnSecurityProfile.MetricsExportConfigProperty.Builder.() -> Unit):
        Unit =
        metricsExportConfig(CfnSecurityProfile.MetricsExportConfigProperty(metricsExportConfig))

    /**
     * @param securityProfileDescription A description of the security profile.
     */
    override fun securityProfileDescription(securityProfileDescription: String) {
      cdkBuilder.securityProfileDescription(securityProfileDescription)
    }

    /**
     * @param securityProfileName The name you gave to the security profile.
     */
    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    /**
     * @param tags Metadata that can be used to manage the security profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the security profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached.
     */
    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    /**
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached.
     */
    override fun targetArns(vararg targetArns: String): Unit = targetArns(targetArns.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfileProps,
  ) : CdkObject(cdkObject), CfnSecurityProfileProps {
    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     */
    override fun additionalMetricsToRetainV2(): Any? = unwrap(this).getAdditionalMetricsToRetainV2()

    /**
     * Specifies the destinations to which alerts are sent.
     *
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
     */
    override fun alertTargets(): Any? = unwrap(this).getAlertTargets()

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     */
    override fun behaviors(): Any? = unwrap(this).getBehaviors()

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     */
    override fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

    /**
     * A description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofiledescription)
     */
    override fun securityProfileDescription(): String? =
        unwrap(this).getSecurityProfileDescription()

    /**
     * The name you gave to the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofilename)
     */
    override fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

    /**
     * Metadata that can be used to manage the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the target (thing group) to which the security profile is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
     */
    override fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfileProps):
        CfnSecurityProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSecurityProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfileProps):
        software.amazon.awscdk.services.iot.CfnSecurityProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSecurityProfileProps
  }
}
