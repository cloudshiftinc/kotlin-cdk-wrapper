@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.constructs.Construct

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
   * and uses that ID for the configuration recorder name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * After you create a configuration recorder, you cannot rename it. If you don't want a name that
   * AWS CloudFormation generates, specify a value for this property.
   *
   *
   * Updates are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
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
   * @param recordingGroup Indicates whether to record configurations for all supported resources or
   * for a list of resource types. 
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
   * @param recordingGroup Indicates whether to record configurations for all supported resources or
   * for a list of resource types. 
   */
  public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
    cdkBuilder.recordingGroup(recordingGroup)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM (IAM) role that is used to make read or write
   * requests to the delivery channel that you specify and to get configuration details for supported
   * AWS resources.
   *
   * For more information, see [Permissions for the IAM Role
   * Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) to
   * AWS Config in the AWS Config Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the IAM (IAM) role that is used to make read
   * or write requests to the delivery channel that you specify and to get configuration details for
   * supported AWS resources. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnConfigurationRecorder = cdkBuilder.build()
}
