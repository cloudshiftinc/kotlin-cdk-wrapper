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
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps

/**
 * Properties for defining a `CfnConfigurationRecorder`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnConfigurationRecorderProps cfnConfigurationRecorderProps =
 * CfnConfigurationRecorderProps.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
@CdkDslMarker
public class CfnConfigurationRecorderPropsDsl {
    private val cdkBuilder: CfnConfigurationRecorderProps.Builder =
        CfnConfigurationRecorderProps.builder()

    /**
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     *   of "default" when creating the configuration recorder. You cannot change the name of the
     *   configuration recorder after it has been created. To change the configuration recorder
     *   name, you must delete it and create a new configuration recorder with a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     *   changes.
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
     */
    public fun recordingGroup(recordingGroup: IResolvable) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     *   changes.
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
     */
    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     *   the configuration recorder. For more information, see
     *   [Permissions for the IAM Role Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html)
     *   to AWS Config in the AWS Config Developer Guide.
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
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnConfigurationRecorderProps = cdkBuilder.build()
}
