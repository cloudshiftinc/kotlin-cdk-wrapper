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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps

/**
 * Properties for defining a `CfnApplicationCloudWatchLoggingOption`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationCloudWatchLoggingOptionProps cfnApplicationCloudWatchLoggingOptionProps =
 * CfnApplicationCloudWatchLoggingOptionProps.builder()
 * .applicationName("applicationName")
 * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
 * .logStreamArn("logStreamArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
 */
@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionPropsDsl {
    private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionProps.Builder =
        CfnApplicationCloudWatchLoggingOptionProps.builder()

    /** @param applicationName The name of the application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     *   including the log stream Amazon Resource Name (ARN).
     */
    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    /**
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     *   including the log stream Amazon Resource Name (ARN).
     */
    public fun cloudWatchLoggingOption(
        cloudWatchLoggingOption:
            CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty
    ) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOptionProps = cdkBuilder.build()
}
