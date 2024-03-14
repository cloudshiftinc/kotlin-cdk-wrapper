package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledAudit internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAudit,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the scheduled audit.
   */
  public open fun attrScheduledAuditArn(): String = unwrap(this).getAttrScheduledAuditArn()

  /**
   * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
   */
  public open fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

  /**
   * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
   */
  public open fun dayOfMonth(`value`: String) {
    unwrap(this).setDayOfMonth(`value`)
  }

  /**
   * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
   * "BIWEEKLY").
   */
  public open fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

  /**
   * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
   * "BIWEEKLY").
   */
  public open fun dayOfWeek(`value`: String) {
    unwrap(this).setDayOfWeek(`value`)
  }

  /**
   * How often the scheduled audit occurs.
   */
  public open fun frequency(): String = unwrap(this).getFrequency()

  /**
   * How often the scheduled audit occurs.
   */
  public open fun frequency(`value`: String) {
    unwrap(this).setFrequency(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the scheduled audit.
   */
  public open fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

  /**
   * The name of the scheduled audit.
   */
  public open fun scheduledAuditName(`value`: String) {
    unwrap(this).setScheduledAuditName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the scheduled audit.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the scheduled audit.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that can be used to manage the scheduled audit.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Which checks are performed during the scheduled audit.
   */
  public open fun targetCheckNames(): List<String> = unwrap(this).getTargetCheckNames()

  /**
   * Which checks are performed during the scheduled audit.
   */
  public open fun targetCheckNames(`value`: List<String>) {
    unwrap(this).setTargetCheckNames(`value`)
  }

  /**
   * Which checks are performed during the scheduled audit.
   */
  public open fun targetCheckNames(vararg `value`: String): Unit =
      targetCheckNames(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnScheduledAudit].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
     *
     * If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofmonth)
     * @param dayOfMonth The day of the month on which the scheduled audit is run (if the
     * `frequency` is "MONTHLY"). 
     */
    public fun dayOfMonth(dayOfMonth: String)

    /**
     * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
     * "BIWEEKLY").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofweek)
     * @param dayOfWeek The day of the week on which the scheduled audit is run (if the `frequency`
     * is "WEEKLY" or "BIWEEKLY"). 
     */
    public fun dayOfWeek(dayOfWeek: String)

    /**
     * How often the scheduled audit occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-frequency)
     * @param frequency How often the scheduled audit occurs. 
     */
    public fun frequency(frequency: String)

    /**
     * The name of the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-scheduledauditname)
     * @param scheduledAuditName The name of the scheduled audit. 
     */
    public fun scheduledAuditName(scheduledAuditName: String)

    /**
     * Metadata that can be used to manage the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
     * @param tags Metadata that can be used to manage the scheduled audit. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
     * @param tags Metadata that can be used to manage the scheduled audit. 
     */
    public fun tags(vararg tags: CfnTag)

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
    public fun targetCheckNames(targetCheckNames: List<String>)

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
    public fun targetCheckNames(vararg targetCheckNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnScheduledAudit.Builder =
        software.amazon.awscdk.services.iot.CfnScheduledAudit.Builder.create(scope, id)

    /**
     * The day of the month on which the scheduled audit is run (if the `frequency` is "MONTHLY").
     *
     * If days 29-31 are specified, and the month does not have that many days, the audit takes
     * place on the "LAST" day of the month.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofmonth)
     * @param dayOfMonth The day of the month on which the scheduled audit is run (if the
     * `frequency` is "MONTHLY"). 
     */
    override fun dayOfMonth(dayOfMonth: String) {
      cdkBuilder.dayOfMonth(dayOfMonth)
    }

    /**
     * The day of the week on which the scheduled audit is run (if the `frequency` is "WEEKLY" or
     * "BIWEEKLY").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-dayofweek)
     * @param dayOfWeek The day of the week on which the scheduled audit is run (if the `frequency`
     * is "WEEKLY" or "BIWEEKLY"). 
     */
    override fun dayOfWeek(dayOfWeek: String) {
      cdkBuilder.dayOfWeek(dayOfWeek)
    }

    /**
     * How often the scheduled audit occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-frequency)
     * @param frequency How often the scheduled audit occurs. 
     */
    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    /**
     * The name of the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-scheduledauditname)
     * @param scheduledAuditName The name of the scheduled audit. 
     */
    override fun scheduledAuditName(scheduledAuditName: String) {
      cdkBuilder.scheduledAuditName(scheduledAuditName)
    }

    /**
     * Metadata that can be used to manage the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
     * @param tags Metadata that can be used to manage the scheduled audit. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata that can be used to manage the scheduled audit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-scheduledaudit.html#cfn-iot-scheduledaudit-tags)
     * @param tags Metadata that can be used to manage the scheduled audit. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun targetCheckNames(targetCheckNames: List<String>) {
      cdkBuilder.targetCheckNames(targetCheckNames)
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
    override fun targetCheckNames(vararg targetCheckNames: String): Unit =
        targetCheckNames(targetCheckNames.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnScheduledAudit = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAudit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAudit(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAudit):
        CfnScheduledAudit = CfnScheduledAudit(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAudit):
        software.amazon.awscdk.services.iot.CfnScheduledAudit = wrapped.cdkObject
  }
}
