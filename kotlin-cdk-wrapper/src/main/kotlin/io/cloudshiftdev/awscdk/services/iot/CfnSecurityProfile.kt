@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::SecurityProfile` resource to create a Device Defender security profile.
 *
 * For API reference, see
 * [CreateSecurityProfile](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateSecurityProfile.html)
 * and for general information, see
 * [Detect](https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSecurityProfile cfnSecurityProfile = CfnSecurityProfile.Builder.create(this,
 * "MyCfnSecurityProfile")
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
public open class CfnSecurityProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A list of metrics whose data is retained (stored).
   */
  public open fun additionalMetricsToRetainV2(): Any? =
      unwrap(this).getAdditionalMetricsToRetainV2()

  /**
   * A list of metrics whose data is retained (stored).
   */
  public open fun additionalMetricsToRetainV2(`value`: IResolvable) {
    unwrap(this).setAdditionalMetricsToRetainV2(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of metrics whose data is retained (stored).
   */
  public open fun additionalMetricsToRetainV2(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalMetricsToRetainV2(__idx_ac66f0)
  }

  /**
   * A list of metrics whose data is retained (stored).
   */
  public open fun additionalMetricsToRetainV2(vararg __idx_ac66f0: Any): Unit =
      additionalMetricsToRetainV2(__idx_ac66f0.toList())

  /**
   * Specifies the destinations to which alerts are sent.
   */
  public open fun alertTargets(): Any? = unwrap(this).getAlertTargets()

  /**
   * Specifies the destinations to which alerts are sent.
   */
  public open fun alertTargets(`value`: IResolvable) {
    unwrap(this).setAlertTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the destinations to which alerts are sent.
   */
  public open fun alertTargets(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setAlertTargets(__item_ac66f0)
  }

  /**
   * The Amazon Resource Name (ARN) of the security profile.
   */
  public open fun attrSecurityProfileArn(): String = unwrap(this).getAttrSecurityProfileArn()

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   */
  public open fun behaviors(): Any? = unwrap(this).getBehaviors()

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   */
  public open fun behaviors(`value`: IResolvable) {
    unwrap(this).setBehaviors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   */
  public open fun behaviors(__idx_ac66f0: List<Any>) {
    unwrap(this).setBehaviors(__idx_ac66f0)
  }

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   */
  public open fun behaviors(vararg __idx_ac66f0: Any): Unit = behaviors(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   */
  public open fun metricsExportConfig(): Any? = unwrap(this).getMetricsExportConfig()

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   */
  public open fun metricsExportConfig(`value`: IResolvable) {
    unwrap(this).setMetricsExportConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   */
  public open fun metricsExportConfig(`value`: MetricsExportConfigProperty) {
    unwrap(this).setMetricsExportConfig(`value`.let(MetricsExportConfigProperty::unwrap))
  }

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7651716e3815530ad69fa0c2afcf79ae76517774102ef9eae1a7f0087cd980ed")
  public open fun metricsExportConfig(`value`: MetricsExportConfigProperty.Builder.() -> Unit): Unit
      = metricsExportConfig(MetricsExportConfigProperty(`value`))

  /**
   * A description of the security profile.
   */
  public open fun securityProfileDescription(): String? =
      unwrap(this).getSecurityProfileDescription()

  /**
   * A description of the security profile.
   */
  public open fun securityProfileDescription(`value`: String) {
    unwrap(this).setSecurityProfileDescription(`value`)
  }

  /**
   * The name you gave to the security profile.
   */
  public open fun securityProfileName(): String? = unwrap(this).getSecurityProfileName()

  /**
   * The name you gave to the security profile.
   */
  public open fun securityProfileName(`value`: String) {
    unwrap(this).setSecurityProfileName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the security profile.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the security profile.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the security profile.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   */
  public open fun targetArns(): List<String> = unwrap(this).getTargetArns() ?: emptyList()

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   */
  public open fun targetArns(`value`: List<String>) {
    unwrap(this).setTargetArns(`value`)
  }

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   */
  public open fun targetArns(vararg `value`: String): Unit = targetArns(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnSecurityProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable)

    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>)

    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    public fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any)

    /**
     * Specifies the destinations to which alerts are sent.
     *
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
     * @param alertTargets Specifies the destinations to which alerts are sent. 
     */
    public fun alertTargets(alertTargets: IResolvable)

    /**
     * Specifies the destinations to which alerts are sent.
     *
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
     * @param alertTargets Specifies the destinations to which alerts are sent. 
     */
    public fun alertTargets(alertTargets: Map<String, Any>)

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    public fun behaviors(behaviors: IResolvable)

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    public fun behaviors(behaviors: List<Any>)

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    public fun behaviors(vararg behaviors: Any)

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    public fun metricsExportConfig(metricsExportConfig: IResolvable)

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    public fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty)

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cbc29ffb850f6001e77db0596c11a4d7ad56587a1ae37ee40a9e2345b81d962")
    public
        fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty.Builder.() -> Unit)

    /**
     * A description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofiledescription)
     * @param securityProfileDescription A description of the security profile. 
     */
    public fun securityProfileDescription(securityProfileDescription: String)

    /**
     * The name you gave to the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofilename)
     * @param securityProfileName The name you gave to the security profile. 
     */
    public fun securityProfileName(securityProfileName: String)

    /**
     * Metadata that can be used to manage the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
     * @param tags Metadata that can be used to manage the security profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
     * @param tags Metadata that can be used to manage the security profile. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the target (thing group) to which the security profile is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached. 
     */
    public fun targetArns(targetArns: List<String>)

    /**
     * The ARN of the target (thing group) to which the security profile is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached. 
     */
    public fun targetArns(vararg targetArns: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSecurityProfile.Builder =
        software.amazon.awscdk.services.iot.CfnSecurityProfile.Builder.create(scope, id)

    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2.let(IResolvable::unwrap))
    }

    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    override fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: List<Any>) {
      cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
    }

    /**
     * A list of metrics whose data is retained (stored).
     *
     * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
     * retained for any metric specified here. Can be used with custom metrics; can't be used with
     * dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
     * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
     */
    override fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any): Unit =
        additionalMetricsToRetainV2(additionalMetricsToRetainV2.toList())

    /**
     * Specifies the destinations to which alerts are sent.
     *
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
     * @param alertTargets Specifies the destinations to which alerts are sent. 
     */
    override fun alertTargets(alertTargets: IResolvable) {
      cdkBuilder.alertTargets(alertTargets.let(IResolvable::unwrap))
    }

    /**
     * Specifies the destinations to which alerts are sent.
     *
     * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates
     * a behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
     * @param alertTargets Specifies the destinations to which alerts are sent. 
     */
    override fun alertTargets(alertTargets: Map<String, Any>) {
      cdkBuilder.alertTargets(alertTargets)
    }

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    override fun behaviors(behaviors: IResolvable) {
      cdkBuilder.behaviors(behaviors.let(IResolvable::unwrap))
    }

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    override fun behaviors(behaviors: List<Any>) {
      cdkBuilder.behaviors(behaviors)
    }

    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
     * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
     * alert. 
     */
    override fun behaviors(vararg behaviors: Any): Unit = behaviors(behaviors.toList())

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    override fun metricsExportConfig(metricsExportConfig: IResolvable) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    override fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty) {
      cdkBuilder.metricsExportConfig(metricsExportConfig.let(MetricsExportConfigProperty::unwrap))
    }

    /**
     * Specifies the MQTT topic and role ARN required for metric export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-metricsexportconfig)
     * @param metricsExportConfig Specifies the MQTT topic and role ARN required for metric export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cbc29ffb850f6001e77db0596c11a4d7ad56587a1ae37ee40a9e2345b81d962")
    override
        fun metricsExportConfig(metricsExportConfig: MetricsExportConfigProperty.Builder.() -> Unit):
        Unit = metricsExportConfig(MetricsExportConfigProperty(metricsExportConfig))

    /**
     * A description of the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofiledescription)
     * @param securityProfileDescription A description of the security profile. 
     */
    override fun securityProfileDescription(securityProfileDescription: String) {
      cdkBuilder.securityProfileDescription(securityProfileDescription)
    }

    /**
     * The name you gave to the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofilename)
     * @param securityProfileName The name you gave to the security profile. 
     */
    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    /**
     * Metadata that can be used to manage the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
     * @param tags Metadata that can be used to manage the security profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the security profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
     * @param tags Metadata that can be used to manage the security profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the target (thing group) to which the security profile is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached. 
     */
    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    /**
     * The ARN of the target (thing group) to which the security profile is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
     * @param targetArns The ARN of the target (thing group) to which the security profile is
     * attached. 
     */
    override fun targetArns(vararg targetArns: String): Unit = targetArns(targetArns.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnSecurityProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile):
        CfnSecurityProfile = CfnSecurityProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfile):
        software.amazon.awscdk.services.iot.CfnSecurityProfile = wrapped.cdkObject
  }

  /**
   * The metric you want to retain.
   *
   * Dimensions are optional.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MetricToRetainProperty metricToRetainProperty = MetricToRetainProperty.builder()
   * .metric("metric")
   * // the properties below are optional
   * .exportMetric(false)
   * .metricDimension(MetricDimensionProperty.builder()
   * .dimensionName("dimensionName")
   * // the properties below are optional
   * .operator("operator")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html)
   */
  public interface MetricToRetainProperty {
    /**
     * The value indicates exporting metrics related to the `MetricToRetain` when it's true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-exportmetric)
     */
    public fun exportMetric(): Any? = unwrap(this).getExportMetric()

    /**
     * A standard of measurement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-metric)
     */
    public fun metric(): String

    /**
     * The dimension of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-metricdimension)
     */
    public fun metricDimension(): Any? = unwrap(this).getMetricDimension()

    /**
     * A builder for [MetricToRetainProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exportMetric The value indicates exporting metrics related to the `MetricToRetain`
       * when it's true.
       */
      public fun exportMetric(exportMetric: Boolean)

      /**
       * @param exportMetric The value indicates exporting metrics related to the `MetricToRetain`
       * when it's true.
       */
      public fun exportMetric(exportMetric: IResolvable)

      /**
       * @param metric A standard of measurement. 
       */
      public fun metric(metric: String)

      /**
       * @param metricDimension The dimension of the metric.
       */
      public fun metricDimension(metricDimension: IResolvable)

      /**
       * @param metricDimension The dimension of the metric.
       */
      public fun metricDimension(metricDimension: MetricDimensionProperty)

      /**
       * @param metricDimension The dimension of the metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42fbcc014135a946c198cee5e55192f746f1dab620d0f495364fd034d5a9fee")
      public fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty.builder()

      /**
       * @param exportMetric The value indicates exporting metrics related to the `MetricToRetain`
       * when it's true.
       */
      override fun exportMetric(exportMetric: Boolean) {
        cdkBuilder.exportMetric(exportMetric)
      }

      /**
       * @param exportMetric The value indicates exporting metrics related to the `MetricToRetain`
       * when it's true.
       */
      override fun exportMetric(exportMetric: IResolvable) {
        cdkBuilder.exportMetric(exportMetric.let(IResolvable::unwrap))
      }

      /**
       * @param metric A standard of measurement. 
       */
      override fun metric(metric: String) {
        cdkBuilder.metric(metric)
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      override fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension.let(IResolvable::unwrap))
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      override fun metricDimension(metricDimension: MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension.let(MetricDimensionProperty::unwrap))
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f42fbcc014135a946c198cee5e55192f746f1dab620d0f495364fd034d5a9fee")
      override fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit):
          Unit = metricDimension(MetricDimensionProperty(metricDimension))

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty,
    ) : CdkObject(cdkObject), MetricToRetainProperty {
      /**
       * The value indicates exporting metrics related to the `MetricToRetain` when it's true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-exportmetric)
       */
      override fun exportMetric(): Any? = unwrap(this).getExportMetric()

      /**
       * A standard of measurement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-metric)
       */
      override fun metric(): String = unwrap(this).getMetric()

      /**
       * The dimension of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html#cfn-iot-securityprofile-metrictoretain-metricdimension)
       */
      override fun metricDimension(): Any? = unwrap(this).getMetricDimension()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricToRetainProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty):
          MetricToRetainProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricToRetainProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricToRetainProperty
    }
  }

  /**
   * Specifies the MQTT topic and role ARN required for metric export.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MetricsExportConfigProperty metricsExportConfigProperty = MetricsExportConfigProperty.builder()
   * .mqttTopic("mqttTopic")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html)
   */
  public interface MetricsExportConfigProperty {
    /**
     * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html#cfn-iot-securityprofile-metricsexportconfig-mqtttopic)
     */
    public fun mqttTopic(): String

    /**
     * This role ARN has permission to publish MQTT messages, after which Device Defender Detect can
     * assume the role and publish messages on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html#cfn-iot-securityprofile-metricsexportconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [MetricsExportConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqttTopic The MQTT topic that Device Defender Detect should publish messages to for
       * metrics export. 
       */
      public fun mqttTopic(mqttTopic: String)

      /**
       * @param roleArn This role ARN has permission to publish MQTT messages, after which Device
       * Defender Detect can assume the role and publish messages on your behalf. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty.builder()

      /**
       * @param mqttTopic The MQTT topic that Device Defender Detect should publish messages to for
       * metrics export. 
       */
      override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      /**
       * @param roleArn This role ARN has permission to publish MQTT messages, after which Device
       * Defender Detect can assume the role and publish messages on your behalf. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty,
    ) : CdkObject(cdkObject), MetricsExportConfigProperty {
      /**
       * The MQTT topic that Device Defender Detect should publish messages to for metrics export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html#cfn-iot-securityprofile-metricsexportconfig-mqtttopic)
       */
      override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      /**
       * This role ARN has permission to publish MQTT messages, after which Device Defender Detect
       * can assume the role and publish messages on your behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricsexportconfig.html#cfn-iot-securityprofile-metricsexportconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsExportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty):
          MetricsExportConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsExportConfigProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricsExportConfigProperty
    }
  }

  /**
   * The `MachineLearningDetectionConfig` property type controls confidence of the machine learning
   * model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MachineLearningDetectionConfigProperty machineLearningDetectionConfigProperty =
   * MachineLearningDetectionConfigProperty.builder()
   * .confidenceLevel("confidenceLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-machinelearningdetectionconfig.html)
   */
  public interface MachineLearningDetectionConfigProperty {
    /**
     * The model confidence level.
     *
     * There are three levels of confidence, `"high"` , `"medium"` , and `"low"` .
     *
     * The higher the confidence level, the lower the sensitivity, and the lower the alarm frequency
     * will be.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-machinelearningdetectionconfig.html#cfn-iot-securityprofile-machinelearningdetectionconfig-confidencelevel)
     */
    public fun confidenceLevel(): String? = unwrap(this).getConfidenceLevel()

    /**
     * A builder for [MachineLearningDetectionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param confidenceLevel The model confidence level.
       * There are three levels of confidence, `"high"` , `"medium"` , and `"low"` .
       *
       * The higher the confidence level, the lower the sensitivity, and the lower the alarm
       * frequency will be.
       */
      public fun confidenceLevel(confidenceLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.builder()

      /**
       * @param confidenceLevel The model confidence level.
       * There are three levels of confidence, `"high"` , `"medium"` , and `"low"` .
       *
       * The higher the confidence level, the lower the sensitivity, and the lower the alarm
       * frequency will be.
       */
      override fun confidenceLevel(confidenceLevel: String) {
        cdkBuilder.confidenceLevel(confidenceLevel)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty,
    ) : CdkObject(cdkObject), MachineLearningDetectionConfigProperty {
      /**
       * The model confidence level.
       *
       * There are three levels of confidence, `"high"` , `"medium"` , and `"low"` .
       *
       * The higher the confidence level, the lower the sensitivity, and the lower the alarm
       * frequency will be.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-machinelearningdetectionconfig.html#cfn-iot-securityprofile-machinelearningdetectionconfig-confidencelevel)
       */
      override fun confidenceLevel(): String? = unwrap(this).getConfidenceLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MachineLearningDetectionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty):
          MachineLearningDetectionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MachineLearningDetectionConfigProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty
    }
  }

  /**
   * A statistical ranking (percentile) that indicates a threshold value by which a behavior is
   * determined to be in compliance or in violation of the behavior.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * StatisticalThresholdProperty statisticalThresholdProperty =
   * StatisticalThresholdProperty.builder()
   * .statistic("statistic")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-statisticalthreshold.html)
   */
  public interface StatisticalThresholdProperty {
    /**
     * The percentile that resolves to a threshold value by which compliance with a behavior is
     * determined.
     *
     * Metrics are collected over the specified period ( `durationSeconds` ) from all reporting
     * devices in your account and statistical ranks are calculated. Then, the measurements from a
     * device are collected over the same period. If the accumulated measurements from the device fall
     * above or below ( `comparisonOperator` ) the value associated with the percentile specified, then
     * the device is considered to be in compliance with the behavior, otherwise a violation occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-statisticalthreshold.html#cfn-iot-securityprofile-statisticalthreshold-statistic)
     */
    public fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * A builder for [StatisticalThresholdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statistic The percentile that resolves to a threshold value by which compliance with
       * a behavior is determined.
       * Metrics are collected over the specified period ( `durationSeconds` ) from all reporting
       * devices in your account and statistical ranks are calculated. Then, the measurements from a
       * device are collected over the same period. If the accumulated measurements from the device
       * fall above or below ( `comparisonOperator` ) the value associated with the percentile
       * specified, then the device is considered to be in compliance with the behavior, otherwise a
       * violation occurs.
       */
      public fun statistic(statistic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty.builder()

      /**
       * @param statistic The percentile that resolves to a threshold value by which compliance with
       * a behavior is determined.
       * Metrics are collected over the specified period ( `durationSeconds` ) from all reporting
       * devices in your account and statistical ranks are calculated. Then, the measurements from a
       * device are collected over the same period. If the accumulated measurements from the device
       * fall above or below ( `comparisonOperator` ) the value associated with the percentile
       * specified, then the device is considered to be in compliance with the behavior, otherwise a
       * violation occurs.
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty,
    ) : CdkObject(cdkObject), StatisticalThresholdProperty {
      /**
       * The percentile that resolves to a threshold value by which compliance with a behavior is
       * determined.
       *
       * Metrics are collected over the specified period ( `durationSeconds` ) from all reporting
       * devices in your account and statistical ranks are calculated. Then, the measurements from a
       * device are collected over the same period. If the accumulated measurements from the device
       * fall above or below ( `comparisonOperator` ) the value associated with the percentile
       * specified, then the device is considered to be in compliance with the behavior, otherwise a
       * violation occurs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-statisticalthreshold.html#cfn-iot-securityprofile-statisticalthreshold-statistic)
       */
      override fun statistic(): String? = unwrap(this).getStatistic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticalThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty):
          StatisticalThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticalThresholdProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty
    }
  }

  /**
   * A Device Defender security profile behavior.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * BehaviorProperty behaviorProperty = BehaviorProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html)
   */
  public interface BehaviorProperty {
    /**
     * The criteria that determine if a device is behaving normally in regard to the `metric` .
     *
     *
     * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
     * Device Defender detects that a device is behaving anomalously.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-criteria)
     */
    public fun criteria(): Any? = unwrap(this).getCriteria()

    /**
     * Value indicates exporting metrics related to the behavior when it is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-exportmetric)
     */
    public fun exportMetric(): Any? = unwrap(this).getExportMetric()

    /**
     * What is measured by the behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-metric)
     */
    public fun metric(): String? = unwrap(this).getMetric()

    /**
     * The dimension of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-metricdimension)
     */
    public fun metricDimension(): Any? = unwrap(this).getMetricDimension()

    /**
     * The name you've given to the behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-name)
     */
    public fun name(): String

    /**
     * The alert status.
     *
     * If you set the value to `true` , alerts will be suppressed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-suppressalerts)
     */
    public fun suppressAlerts(): Any? = unwrap(this).getSuppressAlerts()

    /**
     * A builder for [BehaviorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      public fun criteria(criteria: IResolvable)

      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      public fun criteria(criteria: BehaviorCriteriaProperty)

      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923295a66c6b757449cc7bbeccf2bc2b5809f43996a2f210cfa2621272a0a723")
      public fun criteria(criteria: BehaviorCriteriaProperty.Builder.() -> Unit)

      /**
       * @param exportMetric Value indicates exporting metrics related to the behavior when it is
       * true.
       */
      public fun exportMetric(exportMetric: Boolean)

      /**
       * @param exportMetric Value indicates exporting metrics related to the behavior when it is
       * true.
       */
      public fun exportMetric(exportMetric: IResolvable)

      /**
       * @param metric What is measured by the behavior.
       */
      public fun metric(metric: String)

      /**
       * @param metricDimension The dimension of the metric.
       */
      public fun metricDimension(metricDimension: IResolvable)

      /**
       * @param metricDimension The dimension of the metric.
       */
      public fun metricDimension(metricDimension: MetricDimensionProperty)

      /**
       * @param metricDimension The dimension of the metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("868af0845e1172ec28d523bceb97a29abc045a639a9b0846a7e8318b271c74e2")
      public fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit)

      /**
       * @param name The name you've given to the behavior. 
       */
      public fun name(name: String)

      /**
       * @param suppressAlerts The alert status.
       * If you set the value to `true` , alerts will be suppressed.
       */
      public fun suppressAlerts(suppressAlerts: Boolean)

      /**
       * @param suppressAlerts The alert status.
       * If you set the value to `true` , alerts will be suppressed.
       */
      public fun suppressAlerts(suppressAlerts: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty.builder()

      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      override fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria.let(IResolvable::unwrap))
      }

      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      override fun criteria(criteria: BehaviorCriteriaProperty) {
        cdkBuilder.criteria(criteria.let(BehaviorCriteriaProperty::unwrap))
      }

      /**
       * @param criteria The criteria that determine if a device is behaving normally in regard to
       * the `metric` .
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923295a66c6b757449cc7bbeccf2bc2b5809f43996a2f210cfa2621272a0a723")
      override fun criteria(criteria: BehaviorCriteriaProperty.Builder.() -> Unit): Unit =
          criteria(BehaviorCriteriaProperty(criteria))

      /**
       * @param exportMetric Value indicates exporting metrics related to the behavior when it is
       * true.
       */
      override fun exportMetric(exportMetric: Boolean) {
        cdkBuilder.exportMetric(exportMetric)
      }

      /**
       * @param exportMetric Value indicates exporting metrics related to the behavior when it is
       * true.
       */
      override fun exportMetric(exportMetric: IResolvable) {
        cdkBuilder.exportMetric(exportMetric.let(IResolvable::unwrap))
      }

      /**
       * @param metric What is measured by the behavior.
       */
      override fun metric(metric: String) {
        cdkBuilder.metric(metric)
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      override fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension.let(IResolvable::unwrap))
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      override fun metricDimension(metricDimension: MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension.let(MetricDimensionProperty::unwrap))
      }

      /**
       * @param metricDimension The dimension of the metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("868af0845e1172ec28d523bceb97a29abc045a639a9b0846a7e8318b271c74e2")
      override fun metricDimension(metricDimension: MetricDimensionProperty.Builder.() -> Unit):
          Unit = metricDimension(MetricDimensionProperty(metricDimension))

      /**
       * @param name The name you've given to the behavior. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param suppressAlerts The alert status.
       * If you set the value to `true` , alerts will be suppressed.
       */
      override fun suppressAlerts(suppressAlerts: Boolean) {
        cdkBuilder.suppressAlerts(suppressAlerts)
      }

      /**
       * @param suppressAlerts The alert status.
       * If you set the value to `true` , alerts will be suppressed.
       */
      override fun suppressAlerts(suppressAlerts: IResolvable) {
        cdkBuilder.suppressAlerts(suppressAlerts.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty,
    ) : CdkObject(cdkObject), BehaviorProperty {
      /**
       * The criteria that determine if a device is behaving normally in regard to the `metric` .
       *
       *
       * In the AWS IoT console, you can choose to be sent an alert through Amazon SNS when AWS IoT
       * Device Defender detects that a device is behaving anomalously.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-criteria)
       */
      override fun criteria(): Any? = unwrap(this).getCriteria()

      /**
       * Value indicates exporting metrics related to the behavior when it is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-exportmetric)
       */
      override fun exportMetric(): Any? = unwrap(this).getExportMetric()

      /**
       * What is measured by the behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-metric)
       */
      override fun metric(): String? = unwrap(this).getMetric()

      /**
       * The dimension of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-metricdimension)
       */
      override fun metricDimension(): Any? = unwrap(this).getMetricDimension()

      /**
       * The name you've given to the behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The alert status.
       *
       * If you set the value to `true` , alerts will be suppressed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html#cfn-iot-securityprofile-behavior-suppressalerts)
       */
      override fun suppressAlerts(): Any? = unwrap(this).getSuppressAlerts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty):
          BehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BehaviorProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorProperty
    }
  }

  /**
   * The dimension of the metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .dimensionName("dimensionName")
   * // the properties below are optional
   * .operator("operator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * The name of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html#cfn-iot-securityprofile-metricdimension-dimensionname)
     */
    public fun dimensionName(): String

    /**
     * Operators are constructs that perform logical operations.
     *
     * Valid values are `IN` and `NOT_IN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html#cfn-iot-securityprofile-metricdimension-operator)
     */
    public fun `operator`(): String? = unwrap(this).getOperator()

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionName The name of the dimension. 
       */
      public fun dimensionName(dimensionName: String)

      /**
       * @param operator Operators are constructs that perform logical operations.
       * Valid values are `IN` and `NOT_IN` .
       */
      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.builder()

      /**
       * @param dimensionName The name of the dimension. 
       */
      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      /**
       * @param operator Operators are constructs that perform logical operations.
       * Valid values are `IN` and `NOT_IN` .
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The name of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html#cfn-iot-securityprofile-metricdimension-dimensionname)
       */
      override fun dimensionName(): String = unwrap(this).getDimensionName()

      /**
       * Operators are constructs that perform logical operations.
       *
       * Valid values are `IN` and `NOT_IN` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html#cfn-iot-securityprofile-metricdimension-operator)
       */
      override fun `operator`(): String? = unwrap(this).getOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty
    }
  }

  /**
   * The value to be compared with the `metric` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * MetricValueProperty metricValueProperty = MetricValueProperty.builder()
   * .cidrs(List.of("cidrs"))
   * .count("count")
   * .number(123)
   * .numbers(List.of(123))
   * .ports(List.of(123))
   * .strings(List.of("strings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html)
   */
  public interface MetricValueProperty {
    /**
     * If the `comparisonOperator` calls for a set of CIDRs, use this to specify that set to be
     * compared with the `metric` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-cidrs)
     */
    public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

    /**
     * If the `comparisonOperator` calls for a numeric value, use this to specify that numeric value
     * to be compared with the `metric` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-count)
     */
    public fun count(): String? = unwrap(this).getCount()

    /**
     * The numeric values of a metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-number)
     */
    public fun number(): Number? = unwrap(this).getNumber()

    /**
     * The numeric value of a metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-numbers)
     */
    public fun numbers(): Any? = unwrap(this).getNumbers()

    /**
     * If the `comparisonOperator` calls for a set of ports, use this to specify that set to be
     * compared with the `metric` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-ports)
     */
    public fun ports(): Any? = unwrap(this).getPorts()

    /**
     * The string values of a metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-strings)
     */
    public fun strings(): List<String> = unwrap(this).getStrings() ?: emptyList()

    /**
     * A builder for [MetricValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that
       * set to be compared with the `metric` .
       */
      public fun cidrs(cidrs: List<String>)

      /**
       * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that
       * set to be compared with the `metric` .
       */
      public fun cidrs(vararg cidrs: String)

      /**
       * @param count If the `comparisonOperator` calls for a numeric value, use this to specify
       * that numeric value to be compared with the `metric` .
       */
      public fun count(count: String)

      /**
       * @param number The numeric values of a metric.
       */
      public fun number(number: Number)

      /**
       * @param numbers The numeric value of a metric.
       */
      public fun numbers(numbers: IResolvable)

      /**
       * @param numbers The numeric value of a metric.
       */
      public fun numbers(numbers: List<Number>)

      /**
       * @param numbers The numeric value of a metric.
       */
      public fun numbers(vararg numbers: Number)

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      public fun ports(ports: IResolvable)

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      public fun ports(ports: List<Number>)

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      public fun ports(vararg ports: Number)

      /**
       * @param strings The string values of a metric.
       */
      public fun strings(strings: List<String>)

      /**
       * @param strings The string values of a metric.
       */
      public fun strings(vararg strings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty.builder()

      /**
       * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that
       * set to be compared with the `metric` .
       */
      override fun cidrs(cidrs: List<String>) {
        cdkBuilder.cidrs(cidrs)
      }

      /**
       * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that
       * set to be compared with the `metric` .
       */
      override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

      /**
       * @param count If the `comparisonOperator` calls for a numeric value, use this to specify
       * that numeric value to be compared with the `metric` .
       */
      override fun count(count: String) {
        cdkBuilder.count(count)
      }

      /**
       * @param number The numeric values of a metric.
       */
      override fun number(number: Number) {
        cdkBuilder.number(number)
      }

      /**
       * @param numbers The numeric value of a metric.
       */
      override fun numbers(numbers: IResolvable) {
        cdkBuilder.numbers(numbers.let(IResolvable::unwrap))
      }

      /**
       * @param numbers The numeric value of a metric.
       */
      override fun numbers(numbers: List<Number>) {
        cdkBuilder.numbers(numbers)
      }

      /**
       * @param numbers The numeric value of a metric.
       */
      override fun numbers(vararg numbers: Number): Unit = numbers(numbers.toList())

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable::unwrap))
      }

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      override fun ports(ports: List<Number>) {
        cdkBuilder.ports(ports)
      }

      /**
       * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that
       * set to be compared with the `metric` .
       */
      override fun ports(vararg ports: Number): Unit = ports(ports.toList())

      /**
       * @param strings The string values of a metric.
       */
      override fun strings(strings: List<String>) {
        cdkBuilder.strings(strings)
      }

      /**
       * @param strings The string values of a metric.
       */
      override fun strings(vararg strings: String): Unit = strings(strings.toList())

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty,
    ) : CdkObject(cdkObject), MetricValueProperty {
      /**
       * If the `comparisonOperator` calls for a set of CIDRs, use this to specify that set to be
       * compared with the `metric` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-cidrs)
       */
      override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

      /**
       * If the `comparisonOperator` calls for a numeric value, use this to specify that numeric
       * value to be compared with the `metric` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-count)
       */
      override fun count(): String? = unwrap(this).getCount()

      /**
       * The numeric values of a metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-number)
       */
      override fun number(): Number? = unwrap(this).getNumber()

      /**
       * The numeric value of a metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-numbers)
       */
      override fun numbers(): Any? = unwrap(this).getNumbers()

      /**
       * If the `comparisonOperator` calls for a set of ports, use this to specify that set to be
       * compared with the `metric` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-ports)
       */
      override fun ports(): Any? = unwrap(this).getPorts()

      /**
       * The string values of a metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html#cfn-iot-securityprofile-metricvalue-strings)
       */
      override fun strings(): List<String> = unwrap(this).getStrings() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty):
          MetricValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricValueProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty
    }
  }

  /**
   * The criteria by which the behavior is determined to be normal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * BehaviorCriteriaProperty behaviorCriteriaProperty = BehaviorCriteriaProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html)
   */
  public interface BehaviorCriteriaProperty {
    /**
     * The operator that relates the thing measured ( `metric` ) to the criteria (containing a
     * `value` or `statisticalThreshold` ).
     *
     * Valid operators include:
     *
     * * `string-list` : `in-set` and `not-in-set`
     * * `number-list` : `in-set` and `not-in-set`
     * * `ip-address-list` : `in-cidr-set` and `not-in-cidr-set`
     * * `number` : `less-than` , `less-than-equals` , `greater-than` , and `greater-than-equals`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-comparisonoperator)
     */
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    /**
     * If a device is in violation of the behavior for the specified number of consecutive
     * datapoints, an alarm occurs.
     *
     * If not specified, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-consecutivedatapointstoalarm)
     */
    public fun consecutiveDatapointsToAlarm(): Number? =
        unwrap(this).getConsecutiveDatapointsToAlarm()

    /**
     * If an alarm has occurred and the offending device is no longer in violation of the behavior
     * for the specified number of consecutive datapoints, the alarm is cleared.
     *
     * If not specified, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-consecutivedatapointstoclear)
     */
    public fun consecutiveDatapointsToClear(): Number? =
        unwrap(this).getConsecutiveDatapointsToClear()

    /**
     * Use this to specify the time duration over which the behavior is evaluated, for those
     * criteria that have a time dimension (for example, `NUM_MESSAGES_SENT` ).
     *
     * For a `statisticalThreshhold` metric comparison, measurements from all devices are
     * accumulated over this time duration before being used to calculate percentiles, and later,
     * measurements from an individual device are also accumulated over this time duration before being
     * given a percentile rank. Cannot be used with list-based metric datatypes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-durationseconds)
     */
    public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    /**
     * The confidence level of the detection model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-mldetectionconfig)
     */
    public fun mlDetectionConfig(): Any? = unwrap(this).getMlDetectionConfig()

    /**
     * A statistical ranking (percentile)that indicates a threshold value by which a behavior is
     * determined to be in compliance or in violation of the behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-statisticalthreshold)
     */
    public fun statisticalThreshold(): Any? = unwrap(this).getStatisticalThreshold()

    /**
     * The value to be compared with the `metric` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [BehaviorCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The operator that relates the thing measured ( `metric` ) to the
       * criteria (containing a `value` or `statisticalThreshold` ).
       * Valid operators include:
       *
       * * `string-list` : `in-set` and `not-in-set`
       * * `number-list` : `in-set` and `not-in-set`
       * * `ip-address-list` : `in-cidr-set` and `not-in-cidr-set`
       * * `number` : `less-than` , `less-than-equals` , `greater-than` , and `greater-than-equals`
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param consecutiveDatapointsToAlarm If a device is in violation of the behavior for the
       * specified number of consecutive datapoints, an alarm occurs.
       * If not specified, the default is 1.
       */
      public fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number)

      /**
       * @param consecutiveDatapointsToClear If an alarm has occurred and the offending device is no
       * longer in violation of the behavior for the specified number of consecutive datapoints, the
       * alarm is cleared.
       * If not specified, the default is 1.
       */
      public fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number)

      /**
       * @param durationSeconds Use this to specify the time duration over which the behavior is
       * evaluated, for those criteria that have a time dimension (for example, `NUM_MESSAGES_SENT` ).
       * For a `statisticalThreshhold` metric comparison, measurements from all devices are
       * accumulated over this time duration before being used to calculate percentiles, and later,
       * measurements from an individual device are also accumulated over this time duration before
       * being given a percentile rank. Cannot be used with list-based metric datatypes.
       */
      public fun durationSeconds(durationSeconds: Number)

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      public fun mlDetectionConfig(mlDetectionConfig: IResolvable)

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      public fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty)

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cd2d5111c19a294521ca6163251ee244151a8a4140303c76b7200049648cc8e")
      public
          fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty.Builder.() -> Unit)

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      public fun statisticalThreshold(statisticalThreshold: IResolvable)

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      public fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty)

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48bd43ae4d94c9effa2f5e601060c3ae79f58c795c643f724d9d70185de348f2")
      public
          fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty.Builder.() -> Unit)

      /**
       * @param value The value to be compared with the `metric` .
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value to be compared with the `metric` .
       */
      public fun `value`(`value`: MetricValueProperty)

      /**
       * @param value The value to be compared with the `metric` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16cdb95a8068773e469f1bd6dddbcef70a331a68cb980a342cb7ee6d137f5cf3")
      public fun `value`(`value`: MetricValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty.builder()

      /**
       * @param comparisonOperator The operator that relates the thing measured ( `metric` ) to the
       * criteria (containing a `value` or `statisticalThreshold` ).
       * Valid operators include:
       *
       * * `string-list` : `in-set` and `not-in-set`
       * * `number-list` : `in-set` and `not-in-set`
       * * `ip-address-list` : `in-cidr-set` and `not-in-cidr-set`
       * * `number` : `less-than` , `less-than-equals` , `greater-than` , and `greater-than-equals`
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param consecutiveDatapointsToAlarm If a device is in violation of the behavior for the
       * specified number of consecutive datapoints, an alarm occurs.
       * If not specified, the default is 1.
       */
      override fun consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm: Number) {
        cdkBuilder.consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm)
      }

      /**
       * @param consecutiveDatapointsToClear If an alarm has occurred and the offending device is no
       * longer in violation of the behavior for the specified number of consecutive datapoints, the
       * alarm is cleared.
       * If not specified, the default is 1.
       */
      override fun consecutiveDatapointsToClear(consecutiveDatapointsToClear: Number) {
        cdkBuilder.consecutiveDatapointsToClear(consecutiveDatapointsToClear)
      }

      /**
       * @param durationSeconds Use this to specify the time duration over which the behavior is
       * evaluated, for those criteria that have a time dimension (for example, `NUM_MESSAGES_SENT` ).
       * For a `statisticalThreshhold` metric comparison, measurements from all devices are
       * accumulated over this time duration before being used to calculate percentiles, and later,
       * measurements from an individual device are also accumulated over this time duration before
       * being given a percentile rank. Cannot be used with list-based metric datatypes.
       */
      override fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
      }

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      override fun mlDetectionConfig(mlDetectionConfig: IResolvable) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      override fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty) {
        cdkBuilder.mlDetectionConfig(mlDetectionConfig.let(MachineLearningDetectionConfigProperty::unwrap))
      }

      /**
       * @param mlDetectionConfig The confidence level of the detection model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0cd2d5111c19a294521ca6163251ee244151a8a4140303c76b7200049648cc8e")
      override
          fun mlDetectionConfig(mlDetectionConfig: MachineLearningDetectionConfigProperty.Builder.() -> Unit):
          Unit = mlDetectionConfig(MachineLearningDetectionConfigProperty(mlDetectionConfig))

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      override fun statisticalThreshold(statisticalThreshold: IResolvable) {
        cdkBuilder.statisticalThreshold(statisticalThreshold.let(IResolvable::unwrap))
      }

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      override fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty) {
        cdkBuilder.statisticalThreshold(statisticalThreshold.let(StatisticalThresholdProperty::unwrap))
      }

      /**
       * @param statisticalThreshold A statistical ranking (percentile)that indicates a threshold
       * value by which a behavior is determined to be in compliance or in violation of the behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48bd43ae4d94c9effa2f5e601060c3ae79f58c795c643f724d9d70185de348f2")
      override
          fun statisticalThreshold(statisticalThreshold: StatisticalThresholdProperty.Builder.() -> Unit):
          Unit = statisticalThreshold(StatisticalThresholdProperty(statisticalThreshold))

      /**
       * @param value The value to be compared with the `metric` .
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value to be compared with the `metric` .
       */
      override fun `value`(`value`: MetricValueProperty) {
        cdkBuilder.`value`(`value`.let(MetricValueProperty::unwrap))
      }

      /**
       * @param value The value to be compared with the `metric` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16cdb95a8068773e469f1bd6dddbcef70a331a68cb980a342cb7ee6d137f5cf3")
      override fun `value`(`value`: MetricValueProperty.Builder.() -> Unit): Unit =
          `value`(MetricValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty,
    ) : CdkObject(cdkObject), BehaviorCriteriaProperty {
      /**
       * The operator that relates the thing measured ( `metric` ) to the criteria (containing a
       * `value` or `statisticalThreshold` ).
       *
       * Valid operators include:
       *
       * * `string-list` : `in-set` and `not-in-set`
       * * `number-list` : `in-set` and `not-in-set`
       * * `ip-address-list` : `in-cidr-set` and `not-in-cidr-set`
       * * `number` : `less-than` , `less-than-equals` , `greater-than` , and `greater-than-equals`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-comparisonoperator)
       */
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      /**
       * If a device is in violation of the behavior for the specified number of consecutive
       * datapoints, an alarm occurs.
       *
       * If not specified, the default is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-consecutivedatapointstoalarm)
       */
      override fun consecutiveDatapointsToAlarm(): Number? =
          unwrap(this).getConsecutiveDatapointsToAlarm()

      /**
       * If an alarm has occurred and the offending device is no longer in violation of the behavior
       * for the specified number of consecutive datapoints, the alarm is cleared.
       *
       * If not specified, the default is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-consecutivedatapointstoclear)
       */
      override fun consecutiveDatapointsToClear(): Number? =
          unwrap(this).getConsecutiveDatapointsToClear()

      /**
       * Use this to specify the time duration over which the behavior is evaluated, for those
       * criteria that have a time dimension (for example, `NUM_MESSAGES_SENT` ).
       *
       * For a `statisticalThreshhold` metric comparison, measurements from all devices are
       * accumulated over this time duration before being used to calculate percentiles, and later,
       * measurements from an individual device are also accumulated over this time duration before
       * being given a percentile rank. Cannot be used with list-based metric datatypes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-durationseconds)
       */
      override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

      /**
       * The confidence level of the detection model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-mldetectionconfig)
       */
      override fun mlDetectionConfig(): Any? = unwrap(this).getMlDetectionConfig()

      /**
       * A statistical ranking (percentile)that indicates a threshold value by which a behavior is
       * determined to be in compliance or in violation of the behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-statisticalthreshold)
       */
      override fun statisticalThreshold(): Any? = unwrap(this).getStatisticalThreshold()

      /**
       * The value to be compared with the `metric` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behaviorcriteria.html#cfn-iot-securityprofile-behaviorcriteria-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty):
          BehaviorCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BehaviorCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty
    }
  }

  /**
   * A structure containing the alert target ARN and the role ARN.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AlertTargetProperty alertTargetProperty = AlertTargetProperty.builder()
   * .alertTargetArn("alertTargetArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html)
   */
  public interface AlertTargetProperty {
    /**
     * The Amazon Resource Name (ARN) of the notification target to which alerts are sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html#cfn-iot-securityprofile-alerttarget-alerttargetarn)
     */
    public fun alertTargetArn(): String

    /**
     * The ARN of the role that grants permission to send alerts to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html#cfn-iot-securityprofile-alerttarget-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [AlertTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alertTargetArn The Amazon Resource Name (ARN) of the notification target to which
       * alerts are sent. 
       */
      public fun alertTargetArn(alertTargetArn: String)

      /**
       * @param roleArn The ARN of the role that grants permission to send alerts to the
       * notification target. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty.builder()

      /**
       * @param alertTargetArn The Amazon Resource Name (ARN) of the notification target to which
       * alerts are sent. 
       */
      override fun alertTargetArn(alertTargetArn: String) {
        cdkBuilder.alertTargetArn(alertTargetArn)
      }

      /**
       * @param roleArn The ARN of the role that grants permission to send alerts to the
       * notification target. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty,
    ) : CdkObject(cdkObject), AlertTargetProperty {
      /**
       * The Amazon Resource Name (ARN) of the notification target to which alerts are sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html#cfn-iot-securityprofile-alerttarget-alerttargetarn)
       */
      override fun alertTargetArn(): String = unwrap(this).getAlertTargetArn()

      /**
       * The ARN of the role that grants permission to send alerts to the notification target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-alerttarget.html#cfn-iot-securityprofile-alerttarget-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlertTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty):
          AlertTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlertTargetProperty):
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSecurityProfile.AlertTargetProperty
    }
  }
}
