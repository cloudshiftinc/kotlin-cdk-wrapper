@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnIdentityPool

/**
 * `CognitoStreams` is a property of the
 * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 * resource that defines configuration options for Amazon Cognito streams.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CognitoStreamsProperty cognitoStreamsProperty = CognitoStreamsProperty.builder()
 * .roleArn("roleArn")
 * .streamingStatus("streamingStatus")
 * .streamName("streamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html)
 */
@CdkDslMarker
public class CfnIdentityPoolCognitoStreamsPropertyDsl {
  private val cdkBuilder: CfnIdentityPool.CognitoStreamsProperty.Builder =
      CfnIdentityPool.CognitoStreamsProperty.builder()

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role Amazon Cognito can assume to publish
   * to the stream.
   * This role must grant access to Amazon Cognito (cognito-sync) to invoke `PutRecord` on your
   * Amazon Cognito stream.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param streamName The name of the Amazon Cognito stream to receive updates.
   * This stream must be in the developer's account and in the same Region as the identity pool.
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  /**
   * @param streamingStatus Status of the Amazon Cognito streams.
   * Valid values are: `ENABLED` or `DISABLED` .
   */
  public fun streamingStatus(streamingStatus: String) {
    cdkBuilder.streamingStatus(streamingStatus)
  }

  public fun build(): CfnIdentityPool.CognitoStreamsProperty = cdkBuilder.build()
}
