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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The Amazon CloudWatch configuration for monitoring logs.
 *
 * You can configure your jobs to send log information to CloudWatch .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * CloudWatchLoggingConfigurationProperty cloudWatchLoggingConfigurationProperty =
 * CloudWatchLoggingConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .logGroupName("logGroupName")
 * .logStreamNamePrefix("logStreamNamePrefix")
 * .logTypeMap(List.of(LogTypeMapKeyValuePairProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-cloudwatchloggingconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationCloudWatchLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.CloudWatchLoggingConfigurationProperty.Builder =
        CfnApplication.CloudWatchLoggingConfigurationProperty.builder()

    private val _logTypeMap: MutableList<Any> = mutableListOf()

    /** @param enabled Enables CloudWatch logging. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Enables CloudWatch logging. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param encryptionKeyArn The AWS Key Management Service (KMS) key ARN to encrypt the logs that
     *   you store in CloudWatch Logs .
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param logGroupName The name of the log group in Amazon CloudWatch Logs where you want to
     *   publish your logs.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /** @param logStreamNamePrefix Prefix for the CloudWatch log stream name. */
    public fun logStreamNamePrefix(logStreamNamePrefix: String) {
        cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
    }

    /** @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch. */
    public fun logTypeMap(vararg logTypeMap: Any) {
        _logTypeMap.addAll(listOf(*logTypeMap))
    }

    /** @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch. */
    public fun logTypeMap(logTypeMap: Collection<Any>) {
        _logTypeMap.addAll(logTypeMap)
    }

    /** @param logTypeMap The specific log-streams which need to be uploaded to CloudWatch. */
    public fun logTypeMap(logTypeMap: IResolvable) {
        cdkBuilder.logTypeMap(logTypeMap)
    }

    public fun build(): CfnApplication.CloudWatchLoggingConfigurationProperty {
        if (_logTypeMap.isNotEmpty()) cdkBuilder.logTypeMap(_logTypeMap)
        return cdkBuilder.build()
    }
}
