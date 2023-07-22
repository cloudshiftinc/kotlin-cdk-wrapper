@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnScheduledAudit
import software.constructs.Construct

@CdkDslMarker
public class CfnScheduledAuditDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScheduledAudit.Builder = CfnScheduledAudit.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetCheckNames: MutableList<String> = mutableListOf()

  /**
   * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
   *
   * If days 29-31 are specified, and the month does not have that many days, the audit takes place
   * on the "LAST" day of the month.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofmonth)
   * @param dayOfMonth The day of the month on which the scheduled audit is run (if the `frequency`
   * is "MONTHLY"). 
   */
  public fun dayOfMonth(dayOfMonth: String) {
    cdkBuilder.dayOfMonth(dayOfMonth)
  }

  /**
   * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
   * "BIWEEKLY").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofweek)
   * @param dayOfWeek The day of the week on which the scheduled audit is run (if the `frequency` is
   * "WEEKLY" or "BIWEEKLY"). 
   */
  public fun dayOfWeek(dayOfWeek: String) {
    cdkBuilder.dayOfWeek(dayOfWeek)
  }

  /**
   * How often the scheduled audit occurs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-frequency)
   * @param frequency How often the scheduled audit occurs. 
   */
  public fun frequency(frequency: String) {
    cdkBuilder.frequency(frequency)
  }

  /**
   * The name of the scheduled audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-scheduledauditname)
   * @param scheduledAuditName The name of the scheduled audit. 
   */
  public fun scheduledAuditName(scheduledAuditName: String) {
    cdkBuilder.scheduledAuditName(scheduledAuditName)
  }

  /**
   * Metadata that can be used to manage the scheduled audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
   * @param tags Metadata that can be used to manage the scheduled audit. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the scheduled audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
   * @param tags Metadata that can be used to manage the scheduled audit. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Which checks are performed during the scheduled audit.
   *
   * Checks must be enabled for your account. (Use `DescribeAccountAuditConfiguration` to see the
   * list of all checks, including those that are enabled or use `UpdateAccountAuditConfiguration` to
   * select which checks are enabled.)
   *
   * The following checks are currently aviable:
   *
   * * `AUTHENTICATED_COGNITO_ROLE_OVERLY_PERMISSIVE_CHECK`
   * * `CA_CERTIFICATE_EXPIRING_CHECK`
   * * `CA_CERTIFICATE_KEY_QUALITY_CHECK`
   * * `CONFLICTING_CLIENT_IDS_CHECK`
   * * `DEVICE_CERTIFICATE_EXPIRING_CHECK`
   * * `DEVICE_CERTIFICATE_KEY_QUALITY_CHECK`
   * * `DEVICE_CERTIFICATE_SHARED_CHECK`
   * * `IOT_POLICY_OVERLY_PERMISSIVE_CHECK`
   * * `IOT_ROLE_ALIAS_ALLOWS_ACCESS_TO_UNUSED_SERVICES_CHECK`
   * * `IOT_ROLE_ALIAS_OVERLY_PERMISSIVE_CHECK`
   * * `LOGGING_DISABLED_CHECK`
   * * `REVOKED_CA_CERTIFICATE_STILL_ACTIVE_CHECK`
   * * `REVOKED_DEVICE_CERTIFICATE_STILL_ACTIVE_CHECK`
   * * `UNAUTHENTICATED_COGNITO_ROLE_OVERLY_PERMISSIVE_CHECK`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-targetchecknames)
   * @param targetCheckNames Which checks are performed during the scheduled audit. 
   */
  public fun targetCheckNames(vararg targetCheckNames: String) {
    _targetCheckNames.addAll(listOf(*targetCheckNames))
  }

  /**
   * Which checks are performed during the scheduled audit.
   *
   * Checks must be enabled for your account. (Use `DescribeAccountAuditConfiguration` to see the
   * list of all checks, including those that are enabled or use `UpdateAccountAuditConfiguration` to
   * select which checks are enabled.)
   *
   * The following checks are currently aviable:
   *
   * * `AUTHENTICATED_COGNITO_ROLE_OVERLY_PERMISSIVE_CHECK`
   * * `CA_CERTIFICATE_EXPIRING_CHECK`
   * * `CA_CERTIFICATE_KEY_QUALITY_CHECK`
   * * `CONFLICTING_CLIENT_IDS_CHECK`
   * * `DEVICE_CERTIFICATE_EXPIRING_CHECK`
   * * `DEVICE_CERTIFICATE_KEY_QUALITY_CHECK`
   * * `DEVICE_CERTIFICATE_SHARED_CHECK`
   * * `IOT_POLICY_OVERLY_PERMISSIVE_CHECK`
   * * `IOT_ROLE_ALIAS_ALLOWS_ACCESS_TO_UNUSED_SERVICES_CHECK`
   * * `IOT_ROLE_ALIAS_OVERLY_PERMISSIVE_CHECK`
   * * `LOGGING_DISABLED_CHECK`
   * * `REVOKED_CA_CERTIFICATE_STILL_ACTIVE_CHECK`
   * * `REVOKED_DEVICE_CERTIFICATE_STILL_ACTIVE_CHECK`
   * * `UNAUTHENTICATED_COGNITO_ROLE_OVERLY_PERMISSIVE_CHECK`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-targetchecknames)
   * @param targetCheckNames Which checks are performed during the scheduled audit. 
   */
  public fun targetCheckNames(targetCheckNames: Collection<String>) {
    _targetCheckNames.addAll(targetCheckNames)
  }

  public fun build(): CfnScheduledAudit {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetCheckNames.isNotEmpty()) cdkBuilder.targetCheckNames(_targetCheckNames)
    return cdkBuilder.build()
  }
}
