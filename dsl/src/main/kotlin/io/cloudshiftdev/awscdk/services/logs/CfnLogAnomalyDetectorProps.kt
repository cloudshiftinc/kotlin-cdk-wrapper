package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLogAnomalyDetectorProps {
  /**
   * The ID of the account to create the anomaly detector in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-accountid)
   */
  public fun accountId(): String? = unwrap(this).getAccountId()

  /**
   * The number of days to have visibility on an anomaly.
   *
   * After this time period has elapsed for an anomaly, it will be automatically baselined and the
   * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
   * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime` ,
   * it will be considered normal going forward and will not be detected as an anomaly.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-anomalyvisibilitytime)
   */
  public fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

  /**
   * A name for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-detectorname)
   */
  public fun detectorName(): String? = unwrap(this).getDetectorName()

  /**
   * Specifies how often the anomaly detector is to run and look for anomalies.
   *
   * Set this value according to the frequency that the log group receives new logs. For example, if
   * the log group receives new log events every 10 minutes, then 15 minutes might be a good setting
   * for `EvaluationFrequency` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-evaluationfrequency)
   */
  public fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

  /**
   * You can use this parameter to limit the anomaly detection model to examine only log events that
   * match the pattern you specify here.
   *
   * For more information, see [Filter and Pattern
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-filterpattern)
   */
  public fun filterPattern(): String? = unwrap(this).getFilterPattern()

  /**
   * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
   *
   * If a key is assigned, the anomalies found and the model used by this detector are encrypted at
   * rest with the key. If a key is assigned to an anomaly detector, a user must have permissions for
   * both this key and for the anomaly detector to retrieve information about the anomalies that it
   * finds.
   *
   * For more information about using a AWS KMS key and to see the required IAM policy, see [Use a
   * AWS KMS key with an anomaly
   * detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ARN of the log group that is associated with this anomaly detector.
   *
   * You can specify only one log group ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
   */
  public fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()

  /**
   * A builder for [CfnLogAnomalyDetectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The ID of the account to create the anomaly detector in.
     */
    public fun accountId(accountId: String)

    /**
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly.
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime`
     * , it will be considered normal going forward and will not be detected as an anomaly.
     */
    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number)

    /**
     * @param detectorName A name for this anomaly detector.
     */
    public fun detectorName(detectorName: String)

    /**
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     * anomalies.
     * Set this value according to the frequency that the log group receives new logs. For example,
     * if the log group receives new log events every 10 minutes, then 15 minutes might be a good
     * setting for `EvaluationFrequency` .
     */
    public fun evaluationFrequency(evaluationFrequency: String)

    /**
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     * examine only log events that match the pattern you specify here.
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    public fun filterPattern(filterPattern: String)

    /**
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     * findings.
     * If a key is assigned, the anomalies found and the model used by this detector are encrypted
     * at rest with the key. If a key is assigned to an anomaly detector, a user must have permissions
     * for both this key and for the anomaly detector to retrieve information about the anomalies that
     * it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see [Use a
     * AWS KMS key with an anomaly
     * detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector.
     * You can specify only one log group ARN.
     */
    public fun logGroupArnList(logGroupArnList: List<String>)

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector.
     * You can specify only one log group ARN.
     */
    public fun logGroupArnList(vararg logGroupArnList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps.Builder
        = software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps.builder()

    /**
     * @param accountId The ID of the account to create the anomaly detector in.
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly.
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime`
     * , it will be considered normal going forward and will not be detected as an anomaly.
     */
    override fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
      cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    /**
     * @param detectorName A name for this anomaly detector.
     */
    override fun detectorName(detectorName: String) {
      cdkBuilder.detectorName(detectorName)
    }

    /**
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     * anomalies.
     * Set this value according to the frequency that the log group receives new logs. For example,
     * if the log group receives new log events every 10 minutes, then 15 minutes might be a good
     * setting for `EvaluationFrequency` .
     */
    override fun evaluationFrequency(evaluationFrequency: String) {
      cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    /**
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     * examine only log events that match the pattern you specify here.
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     * findings.
     * If a key is assigned, the anomalies found and the model used by this detector are encrypted
     * at rest with the key. If a key is assigned to an anomaly detector, a user must have permissions
     * for both this key and for the anomaly detector to retrieve information about the anomalies that
     * it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see [Use a
     * AWS KMS key with an anomaly
     * detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector.
     * You can specify only one log group ARN.
     */
    override fun logGroupArnList(logGroupArnList: List<String>) {
      cdkBuilder.logGroupArnList(logGroupArnList)
    }

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     * detector.
     * You can specify only one log group ARN.
     */
    override fun logGroupArnList(vararg logGroupArnList: String): Unit =
        logGroupArnList(logGroupArnList.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnLogAnomalyDetectorProps {
    /**
     * The ID of the account to create the anomaly detector in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-accountid)
     */
    override fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * The number of days to have visibility on an anomaly.
     *
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     * not correct the cause of an anomaly during the time period specified in `AnomalyVisibilityTime`
     * , it will be considered normal going forward and will not be detected as an anomaly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-anomalyvisibilitytime)
     */
    override fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

    /**
     * A name for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-detectorname)
     */
    override fun detectorName(): String? = unwrap(this).getDetectorName()

    /**
     * Specifies how often the anomaly detector is to run and look for anomalies.
     *
     * Set this value according to the frequency that the log group receives new logs. For example,
     * if the log group receives new log events every 10 minutes, then 15 minutes might be a good
     * setting for `EvaluationFrequency` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-evaluationfrequency)
     */
    override fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

    /**
     * You can use this parameter to limit the anomaly detection model to examine only log events
     * that match the pattern you specify here.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-filterpattern)
     */
    override fun filterPattern(): String? = unwrap(this).getFilterPattern()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     */
    override fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps):
        CfnLogAnomalyDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetectorProps):
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps
  }
}
