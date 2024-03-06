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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.constructs.Construct

/**
 * The `AWS::Config::ConfigurationRecorder` resource type describes the AWS resource types that AWS
 * Config records for configuration changes.
 *
 * The configuration recorder stores the configuration changes of the specified resources in your
 * account as configuration items.
 *
 * To enable AWS Config , you must create a configuration recorder and a delivery channel.
 *
 * AWS Config uses the delivery channel to deliver the configuration changes to your Amazon S3
 * bucket or Amazon SNS topic. For more information, see
 * [AWS::Config::DeliveryChannel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 * .
 *
 * AWS CloudFormation starts the recorder as soon as the delivery channel is available.
 *
 * To stop the recorder and delete it, delete the configuration recorder from your stack. To stop
 * the recorder without deleting it, call the
 * [StopConfigurationRecorder](https://docs.aws.amazon.com/config/latest/APIReference/API_StopConfigurationRecorder.html)
 * action of the AWS Config API directly.
 *
 * For more information, see
 * [Configuration Recorder](https://docs.aws.amazon.com/config/latest/developerguide/config-concepts.html#config-recorder)
 * in the AWS Config Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnConfigurationRecorder cfnConfigurationRecorder = CfnConfigurationRecorder.Builder.create(this,
 * "MyCfnConfigurationRecorder")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .name("name")
 * .recordingGroup(RecordingGroupProperty.builder()
 * .allSupported(false)
 * .exclusionByResourceTypes(ExclusionByResourceTypesProperty.builder()
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .includeGlobalResourceTypes(false)
 * .recordingStrategy(RecordingStrategyProperty.builder()
 * .useOnly("useOnly")
 * .build())
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .recordingMode(RecordingModeProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * // the properties below are optional
 * .recordingModeOverrides(List.of(RecordingModeOverrideProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * .resourceTypes(List.of("resourceTypes"))
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationRecorder.Builder =
        CfnConfigurationRecorder.Builder.create(scope, id)

    /**
     * The name of the configuration recorder. AWS Config automatically assigns the name of
     * "default" when creating the configuration recorder.
     *
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder
     * with a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
     *
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     *   of "default" when creating the configuration recorder.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary
     * resources. An *ephemeral workload* is a temporary use of computing resources that are loaded
     * and run when needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot
     * Instances, Amazon EMR jobs, and AWS Auto Scaling . If you want to avoid the increased
     * activity from running ephemeral workloads, you can run these types of workloads in a separate
     * account with AWS Config turned off to avoid increased configuration recording and rule
     * evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     *
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     *   changes.
     */
    public fun recordingGroup(recordingGroup: IResolvable) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary
     * resources. An *ephemeral workload* is a temporary use of computing resources that are loaded
     * and run when needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot
     * Instances, Amazon EMR jobs, and AWS Auto Scaling . If you want to avoid the increased
     * activity from running ephemeral workloads, you can run these types of workloads in a separate
     * account with AWS Config turned off to avoid increased configuration recording and rule
     * evaluations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     *
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     *   changes.
     */
    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     * * Continuous recording allows you to record configuration changes continuously whenever a
     *   change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     *   recent state of your resources over the last 24-hour period, only if it’s different from
     *   the previous CI recorded.
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     *
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     *   configuration changes.
     */
    public fun recordingMode(recordingMode: IResolvable) {
        cdkBuilder.recordingMode(recordingMode)
    }

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     * * Continuous recording allows you to record configuration changes continuously whenever a
     *   change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     *   recent state of your resources over the last 24-hour period, only if it’s different from
     *   the previous CI recorded.
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     *
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     *   configuration changes.
     */
    public fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty) {
        cdkBuilder.recordingMode(recordingMode)
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the
     * configuration recorder.
     *
     * For more information, see
     * [Permissions for the IAM Role Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html)
     * to AWS Config in the AWS Config Developer Guide.
     *
     * *Pre-existing AWS Config role*
     *
     * If you have used an AWS service that uses AWS Config , such as AWS Security Hub or AWS
     * Control Tower , and an AWS Config role has already been created, make sure that the IAM role
     * that you use when setting up AWS Config keeps the same minimum permissions as the already
     * created AWS Config role. You must do this so that the other AWS service continues to run as
     * expected.
     *
     * For example, if AWS Control Tower has an IAM role that allows AWS Config to read Amazon
     * Simple Storage Service ( Amazon S3 ) objects, make sure that the same permissions are granted
     * within the IAM role you use when setting up AWS Config . Otherwise, it may interfere with how
     * AWS Control Tower operates. For more information about IAM roles for AWS Config , see
     * [*Identity and Access Management for AWS Config*](https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html)
     * in the *AWS Config Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
     *
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     *   the configuration recorder.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnConfigurationRecorder = cdkBuilder.build()
}
