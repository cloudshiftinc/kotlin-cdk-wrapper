@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnLogging
import software.constructs.Construct

@CdkDslMarker
public class CfnLoggingDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLogging.Builder = CfnLogging.Builder.create(scope, id)

  /**
   * The account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-accountid)
   * @param accountId The account ID. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * The default log level.
   *
   * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-defaultloglevel)
   * @param defaultLogLevel The default log level. 
   */
  public fun defaultLogLevel(defaultLogLevel: String) {
    cdkBuilder.defaultLogLevel(defaultLogLevel)
  }

  /**
   * The role ARN used for the log.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-rolearn)
   * @param roleArn The role ARN used for the log. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLogging = cdkBuilder.build()
}
