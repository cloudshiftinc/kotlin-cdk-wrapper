@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnAccountAuditConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccountAuditConfiguration.Builder =
      CfnAccountAuditConfiguration.Builder.create(scope, id)

  /**
   * The ID of the account.
   *
   * You can use the expression `!Sub "${AWS::AccountId}"` to use your account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-accountid)
   * @param accountId The ID of the account. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   *
   * Some data collection might start immediately when certain checks are enabled. When a check is
   * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
   * the value of the `Enabled:` key to `false` .
   *
   * If an enabled check is removed from the template, it will also be disabled.
   *
   * You can't disable a check if it's used by any scheduled audit. You must delete the check from
   * the scheduled audit or delete the scheduled audit itself to disable the check.
   *
   * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
   * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
   * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for this
   * account. 
   */
  public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
    cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
  }

  /**
   * Specifies which audit checks are enabled and disabled for this account.
   *
   * Some data collection might start immediately when certain checks are enabled. When a check is
   * disabled, any data collected so far in relation to the check is deleted. To disable a check, set
   * the value of the `Enabled:` key to `false` .
   *
   * If an enabled check is removed from the template, it will also be disabled.
   *
   * You can't disable a check if it's used by any scheduled audit. You must delete the check from
   * the scheduled audit or delete the scheduled audit itself to disable the check.
   *
   * For more information on avialbe auidt checks see [AWS::IoT::AccountAuditConfiguration
   * AuditCheckConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditcheckconfigurations.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditcheckconfigurations)
   * @param auditCheckConfigurations Specifies which audit checks are enabled and disabled for this
   * account. 
   */
  public
      fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty) {
    cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
  }

  /**
   * Information about the targets to which audit notifications are sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
   * @param auditNotificationTargetConfigurations Information about the targets to which audit
   * notifications are sent. 
   */
  public
      fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
    cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
  }

  /**
   * Information about the targets to which audit notifications are sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-auditnotificationtargetconfigurations)
   * @param auditNotificationTargetConfigurations Information about the targets to which audit
   * notifications are sent. 
   */
  public
      fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty) {
    cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
  }

  /**
   * The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to access
   * information about your devices, policies, certificates, and other items as required when
   * performing an audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-accountauditconfiguration.html#cfn-iot-accountauditconfiguration-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the role that grants permission to AWS IoT to
   * access information about your devices, policies, certificates, and other items as required when
   * performing an audit. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAccountAuditConfiguration = cdkBuilder.build()
}
