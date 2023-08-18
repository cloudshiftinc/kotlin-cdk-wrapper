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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.constructs.Construct

/**
 * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
 *
 * Only one *ApplicationCloudWatchLoggingOption* resource can be attached per application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationCloudWatchLoggingOptionV2 cfnApplicationCloudWatchLoggingOptionV2 =
 * CfnApplicationCloudWatchLoggingOptionV2.Builder.create(this,
 * "MyCfnApplicationCloudWatchLoggingOptionV2")
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
public class CfnApplicationCloudWatchLoggingOptionV2Dsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionV2.Builder =
        CfnApplicationCloudWatchLoggingOptionV2.Builder.create(scope, id)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
     *
     * @param applicationName The name of the application.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     *
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     *   including the log stream Amazon Resource Name (ARN).
     */
    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
     *
     * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging options,
     *   including the log stream Amazon Resource Name (ARN).
     */
    public fun cloudWatchLoggingOption(
        cloudWatchLoggingOption:
            CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty
    ) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOptionV2 = cdkBuilder.build()
}
