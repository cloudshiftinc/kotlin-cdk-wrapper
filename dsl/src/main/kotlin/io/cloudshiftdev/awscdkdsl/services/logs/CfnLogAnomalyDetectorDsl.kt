@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetector
import software.constructs.Construct

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
 * For more information see
 * [Log anomaly detection](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
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
@CdkDslMarker
public class CfnLogAnomalyDetectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLogAnomalyDetector.Builder =
        CfnLogAnomalyDetector.Builder.create(scope, id)

    private val _logGroupArnList: MutableList<String> = mutableListOf()

    /**
     * The ID of the account to create the anomaly detector in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-accountid)
     *
     * @param accountId The ID of the account to create the anomaly detector in.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * The number of days to have visibility on an anomaly.
     *
     * After this time period has elapsed for an anomaly, it will be automatically baselined and the
     * anomaly detector will treat new occurrences of a similar anomaly as normal. Therefore, if you
     * do not correct the cause of an anomaly during the time period specified in
     * `AnomalyVisibilityTime` , it will be considered normal going forward and will not be detected
     * as an anomaly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-anomalyvisibilitytime)
     *
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly.
     */
    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
        cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    /**
     * A name for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-detectorname)
     *
     * @param detectorName A name for this anomaly detector.
     */
    public fun detectorName(detectorName: String) {
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
     *
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     *   anomalies.
     */
    public fun evaluationFrequency(evaluationFrequency: String) {
        cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    /**
     * You can use this parameter to limit the anomaly detection model to examine only log events
     * that match the pattern you specify here.
     *
     * For more information, see
     * [Filter and Pattern Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-filterpattern)
     *
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     *   examine only log events that match the pattern you specify here.
     */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * Optionally assigns a AWS KMS key to secure this anomaly detector and its findings.
     *
     * If a key is assigned, the anomalies found and the model used by this detector are encrypted
     * at rest with the key. If a key is assigned to an anomaly detector, a user must have
     * permissions for both this key and for the anomaly detector to retrieve information about the
     * anomalies that it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see
     * [Use a AWS KMS key with an anomaly detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-kmskeyid)
     *
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     *   findings.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     *
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     *   detector.
     */
    public fun logGroupArnList(vararg logGroupArnList: String) {
        _logGroupArnList.addAll(listOf(*logGroupArnList))
    }

    /**
     * The ARN of the log group that is associated with this anomaly detector.
     *
     * You can specify only one log group ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html#cfn-logs-loganomalydetector-loggrouparnlist)
     *
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     *   detector.
     */
    public fun logGroupArnList(logGroupArnList: Collection<String>) {
        _logGroupArnList.addAll(logGroupArnList)
    }

    public fun build(): CfnLogAnomalyDetector {
        if (_logGroupArnList.isNotEmpty()) cdkBuilder.logGroupArnList(_logGroupArnList)
        return cdkBuilder.build()
    }
}
