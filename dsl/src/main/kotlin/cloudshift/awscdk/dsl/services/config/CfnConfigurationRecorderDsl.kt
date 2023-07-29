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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.constructs.Construct

/**
 * The AWS::Config::ConfigurationRecorder resource describes the AWS resource types for which AWS
 * Config records configuration changes.
 *
 * The configuration recorder stores the configurations of the supported resources in your account
 * as configuration items.
 *
 * To enable AWS Config , you must create a configuration recorder and a delivery channel. AWS
 * Config uses the delivery channel to deliver the configuration changes to your Amazon S3 bucket or
 * Amazon SNS topic. For more information, see
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
 * .includeGlobalResourceTypes(false)
 * .resourceTypes(List.of("resourceTypes"))
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
     * A name for the configuration recorder.
     *
     * If you don't specify a name, AWS CloudFormation CloudFormation generates a unique physical ID
     * and uses that ID for the configuration recorder name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * After you create a configuration recorder, you cannot rename it. If you don't want a name
     * that AWS CloudFormation generates, specify a value for this property.
     *
     * Updates are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
     *
     * @param name A name for the configuration recorder.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Indicates whether to record configurations for all supported resources or for a list of
     * resource types.
     *
     * The resource types that you list must be supported by AWS Config .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     *
     * @param recordingGroup Indicates whether to record configurations for all supported resources
     *   or for a list of resource types.
     */
    public fun recordingGroup(recordingGroup: IResolvable) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * Indicates whether to record configurations for all supported resources or for a list of
     * resource types.
     *
     * The resource types that you list must be supported by AWS Config .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     *
     * @param recordingGroup Indicates whether to record configurations for all supported resources
     *   or for a list of resource types.
     */
    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM (IAM) role that is used to make read or write
     * requests to the delivery channel that you specify and to get configuration details for
     * supported AWS resources.
     *
     * For more information, see
     * [Permissions for the IAM Role Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html)
     * to AWS Config in the AWS Config Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM (IAM) role that is used to make read
     *   or write requests to the delivery channel that you specify and to get configuration details
     *   for supported AWS resources.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnConfigurationRecorder = cdkBuilder.build()
}
