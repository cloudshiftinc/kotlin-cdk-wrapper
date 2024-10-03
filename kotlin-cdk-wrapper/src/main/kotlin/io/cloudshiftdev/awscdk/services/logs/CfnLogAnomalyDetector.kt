@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates an *anomaly detector* that regularly scans one or more log groups and look for
 * patterns and anomalies in the logs.
 *
 * An anomaly detector can help surface issues by automatically discovering anomalies in your log
 * event traffic. An anomaly detector uses machine learning algorithms to scan log events and find
 * *patterns* . A pattern is a shared text structure that recurs among your log fields. Patterns
 * provide a useful tool for analyzing large sets of logs because a large number of log events can
 * often be compressed into a few patterns.
 *
 * The anomaly detector uses pattern recognition to find `anomalies` , which are unusual log events.
 * It compares current log events and patterns with trained baselines.
 *
 * Fields within a pattern are called *tokens* . Fields that vary within a pattern, such as a
 * request ID or timestamp, are referred to as *dynamic tokens* and represented by `&lt;*&gt;` .
 *
 * For more information see [Log anomaly
 * detection](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnLogAnomalyDetector cfnLogAnomalyDetector = CfnLogAnomalyDetector.Builder.create(this,
 * "MyCfnLogAnomalyDetector")
 * .accountId("accountId")
 * .anomalyVisibilityTime(123)
 * .detectorName("detectorName")
 * .evaluationFrequency("evaluationFrequency")
 * .filterPattern("filterPattern")
 * .kmsKeyId("kmsKeyId")
 * .logGroupArnList(List.of("logGroupArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html)
 */
public open class CfnLogAnomalyDetector(
  cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.logs.CfnLogAnomalyDetector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogAnomalyDetectorProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnLogAnomalyDetector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLogAnomalyDetectorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogAnomalyDetectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLogAnomalyDetectorProps(props)
  )

  /**
   * The ID of the account to create the anomaly detector in.
   */
  public open fun accountId(): String? = unwrap(this).getAccountId()

  /**
   * The ID of the account to create the anomaly detector in.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * The number of days to have visibility on an anomaly.
   */
  public open fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

  /**
   * The number of days to have visibility on an anomaly.
   */
  public open fun anomalyVisibilityTime(`value`: Number) {
    unwrap(this).setAnomalyVisibilityTime(`value`)
  }

  /**
   * The ARN of the anomaly detector.
   */
  public open fun attrAnomalyDetectorArn(): String = unwrap(this).getAttrAnomalyDetectorArn()

  /**
   * Specifies whether the anomaly detector is currently active.
   */
  public open fun attrAnomalyDetectorStatus(): String = unwrap(this).getAttrAnomalyDetectorStatus()

  /**
   * The time that the anomaly detector was created.
   */
  public open fun attrCreationTimeStamp(): IResolvable =
      unwrap(this).getAttrCreationTimeStamp().let(IResolvable::wrap)

  /**
   * The time that the anomaly detector was most recently modified.
   */
  public open fun attrLastModifiedTimeStamp(): IResolvable =
      unwrap(this).getAttrLastModifiedTimeStamp().let(IResolvable::wrap)

  /**
   * A name for this anomaly detector.
   */
  public open fun detectorName(): String? = unwrap(this).getDetectorName()

  /**
   * A name for this anomaly detector.
   */
  public open fun detectorName(`value`: String) {
    unwrap(this).setDetectorName(`value`)
  }

  /**
   * Specifies how often the anomaly detector is to run and look for anomalies.
   */
  public open fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

  /**
   * Specifies how often the anomaly detector is to run and look for anomalies.
   */
  public open fun evaluationFrequency(`value`: String) {
    unwrap(this).setEvaluationFrequency(`value`)
  }

  /**
   * You can use this parameter to limit the anomaly detection model to examine only log events that
   * match the pattern you specify here.
   */
  public open fun filterPattern(): String? = unwrap(this).getFilterPattern()

  /**
   * You can use this parameter to limit the anomaly detection model to examine only log events that
   * match the pattern you specify here.
   */
  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
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
   * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The ARN of the log group that is associated with this anomaly detector.
   */
  public open fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()

  /**
   * The ARN of the log group that is associated with this anomaly detector.
   */
  public open fun logGroupArnList(`value`: List<String>) {
    unwrap(this).setLogGroupArnList(`value`)
  }

  /**
   * The ARN of the log group that is associated with this anomaly detector.
   */
  public open fun logGroupArnList(vararg `value`: String): Unit = logGroupArnList(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnLogAnomalyDetector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the account to create the anomaly detector in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-accountid)
     * @param accountId The ID of the account to create the anomaly detector in. 
     */
    public fun accountId(accountId: String)

    /**
     * The number of days to have visibility on an anomaly.
     *
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime`
     * , it will be considered normal going forward and will not be detected as an anomaly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-anomalyvisibilitytime)
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly. 
     */
    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number)

    /**
     * A name for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-detectorname)
     * @param detectorName A name for this anomaly detector. 
     */
    public fun detectorName(detectorName: String)

    /**
     * Specifies how often the anomaly detector is to run and look for anomalies.
     *
     * Set this value according to the frequency that the log group receives new logs. For example,
     * if the log group receives new log events every 10 minutes, then 15 minutes might be a good
     * setting for `EvaluationFrequency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-evaluationfrequency)
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     * anomalies. 
     */
    public fun evaluationFrequency(evaluationFrequency: String)

    /**
     * You can use this parameter to limit the anomaly detection model to examine only log events
     * that match the pattern you specify here.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-filterpattern)
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     * examine only log events that match the pattern you specify here. 
     */
    public fun filterPattern(filterPattern: String)

    /**
     * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
     *
     * If a key is assigned, the anomalies found and the model used by this detector are encrypted
     * at rest with the key. If a key is assigned to an anomaly detector, a user must have permissions
     * for both this key and for the anomaly detector to retrieve information about the anomalies that
     * it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see [Use a
     * AWS KMS key with an anomaly
     * detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-kmskeyid)
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     * findings. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector. 
     */
    public fun logGroupArnList(logGroupArnList: List<String>)

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector. 
     */
    public fun logGroupArnList(vararg logGroupArnList: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.Builder =
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.Builder.create(scope, id)

    /**
     * The ID of the account to create the anomaly detector in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-accountid)
     * @param accountId The ID of the account to create the anomaly detector in. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The number of days to have visibility on an anomaly.
     *
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime`
     * , it will be considered normal going forward and will not be detected as an anomaly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-anomalyvisibilitytime)
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly. 
     */
    override fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
      cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    /**
     * A name for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-detectorname)
     * @param detectorName A name for this anomaly detector. 
     */
    override fun detectorName(detectorName: String) {
      cdkBuilder.detectorName(detectorName)
    }

    /**
     * Specifies how often the anomaly detector is to run and look for anomalies.
     *
     * Set this value according to the frequency that the log group receives new logs. For example,
     * if the log group receives new log events every 10 minutes, then 15 minutes might be a good
     * setting for `EvaluationFrequency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-evaluationfrequency)
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     * anomalies. 
     */
    override fun evaluationFrequency(evaluationFrequency: String) {
      cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    /**
     * You can use this parameter to limit the anomaly detection model to examine only log events
     * that match the pattern you specify here.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-filterpattern)
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     * examine only log events that match the pattern you specify here. 
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
     *
     * If a key is assigned, the anomalies found and the model used by this detector are encrypted
     * at rest with the key. If a key is assigned to an anomaly detector, a user must have permissions
     * for both this key and for the anomaly detector to retrieve information about the anomalies that
     * it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see [Use a
     * AWS KMS key with an anomaly
     * detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-kmskeyid)
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     * findings. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector. 
     */
    override fun logGroupArnList(logGroupArnList: List<String>) {
      cdkBuilder.logGroupArnList(logGroupArnList)
    }

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector. 
     */
    override fun logGroupArnList(vararg logGroupArnList: String): Unit =
        logGroupArnList(logGroupArnList.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogAnomalyDetector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogAnomalyDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogAnomalyDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector):
        CfnLogAnomalyDetector = CfnLogAnomalyDetector(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetector):
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector
  }
}
