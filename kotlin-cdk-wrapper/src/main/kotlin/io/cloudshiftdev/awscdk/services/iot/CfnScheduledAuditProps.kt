@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnScheduledAudit`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnScheduledAuditProps cfnScheduledAuditProps = CfnScheduledAuditProps.builder()
 * .frequency("frequency")
 * .targetCheckNames(List.of("targetCheckNames"))
 * // the properties below are optional
 * .dayOfMonth("dayOfMonth")
 * .dayOfWeek("dayOfWeek")
 * .scheduledAuditName("scheduledAuditName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html)
 */
public interface CfnScheduledAuditProps {
  /**
   * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
   *
   * If days 29-31 are specified, and the month does not have that many days, the audit takes place
   * on the "LAST" day of the month.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofmonth)
   */
  public fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

  /**
   * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
   * "BIWEEKLY").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofweek)
   */
  public fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

  /**
   * How often the scheduled audit occurs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-frequency)
   */
  public fun frequency(): String

  /**
   * The name of the scheduled audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-scheduledauditname)
   */
  public fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

  /**
   * Metadata that can be used to manage the scheduled audit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun targetCheckNames(): List<String>

  /**
   * A builder for [CfnScheduledAuditProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dayOfMonth The day of the month on which the scheduled audit is run (if the
     * `frequency` is "MONTHLY").
     * If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     */
    public fun dayOfMonth(dayOfMonth: String)

    /**
     * @param dayOfWeek The day of the week on which the scheduled audit is run (if the `frequency`
     * is "WEEKLY" or "BIWEEKLY").
     */
    public fun dayOfWeek(dayOfWeek: String)

    /**
     * @param frequency How often the scheduled audit occurs. 
     */
    public fun frequency(frequency: String)

    /**
     * @param scheduledAuditName The name of the scheduled audit.
     */
    public fun scheduledAuditName(scheduledAuditName: String)

    /**
     * @param tags Metadata that can be used to manage the scheduled audit.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the scheduled audit.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetCheckNames Which checks are performed during the scheduled audit. 
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
     */
    public fun targetCheckNames(targetCheckNames: List<String>)

    /**
     * @param targetCheckNames Which checks are performed during the scheduled audit. 
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
     */
    public fun targetCheckNames(vararg targetCheckNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnScheduledAuditProps.Builder =
        software.amazon.awscdk.services.iot.CfnScheduledAuditProps.builder()

    /**
     * @param dayOfMonth The day of the month on which the scheduled audit is run (if the
     * `frequency` is "MONTHLY").
     * If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     */
    override fun dayOfMonth(dayOfMonth: String) {
      cdkBuilder.dayOfMonth(dayOfMonth)
    }

    /**
     * @param dayOfWeek The day of the week on which the scheduled audit is run (if the `frequency`
     * is "WEEKLY" or "BIWEEKLY").
     */
    override fun dayOfWeek(dayOfWeek: String) {
      cdkBuilder.dayOfWeek(dayOfWeek)
    }

    /**
     * @param frequency How often the scheduled audit occurs. 
     */
    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    /**
     * @param scheduledAuditName The name of the scheduled audit.
     */
    override fun scheduledAuditName(scheduledAuditName: String) {
      cdkBuilder.scheduledAuditName(scheduledAuditName)
    }

    /**
     * @param tags Metadata that can be used to manage the scheduled audit.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the scheduled audit.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetCheckNames Which checks are performed during the scheduled audit. 
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
     */
    override fun targetCheckNames(targetCheckNames: List<String>) {
      cdkBuilder.targetCheckNames(targetCheckNames)
    }

    /**
     * @param targetCheckNames Which checks are performed during the scheduled audit. 
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
     */
    override fun targetCheckNames(vararg targetCheckNames: String): Unit =
        targetCheckNames(targetCheckNames.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnScheduledAuditProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAuditProps,
  ) : CdkObject(cdkObject), CfnScheduledAuditProps {
    /**
     * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
     *
     * If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofmonth)
     */
    override fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

    /**
     * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
     * "BIWEEKLY").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofweek)
     */
    override fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

    /**
     * How often the scheduled audit occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-frequency)
     */
    override fun frequency(): String = unwrap(this).getFrequency()

    /**
     * The name of the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-scheduledauditname)
     */
    override fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

    /**
     * Metadata that can be used to manage the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun targetCheckNames(): List<String> = unwrap(this).getTargetCheckNames()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledAuditProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAuditProps):
        CfnScheduledAuditProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScheduledAuditProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAuditProps):
        software.amazon.awscdk.services.iot.CfnScheduledAuditProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnScheduledAuditProps
  }
}
