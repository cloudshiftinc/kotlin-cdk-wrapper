@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScheduledQueryProps {
  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun errorReportConfiguration(): Any

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun notificationConfiguration(): Any

  public fun queryString(): String

  public fun scheduleConfiguration(): Any

  public fun scheduledQueryExecutionRoleArn(): String

  public fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun errorReportConfiguration(errorReportConfiguration: IResolvable)

    public
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66613b4494fcb0944e056033083d7e6098621e6d5595b2c6807bd68774b83481")
    public
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32e9ddb76512f6f65e2b921bf96913d2ba2e86b2f9a575bd7f1c043ac7fc3104")
    public
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit)

    public fun queryString(queryString: String)

    public fun scheduleConfiguration(scheduleConfiguration: IResolvable)

    public
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b9af623bbfed6921fddc7f8ba59d52063675b5ad9f37e8d3f8df7cea11d4ba")
    public
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty.Builder.() -> Unit)

    public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String)

    public fun scheduledQueryName(scheduledQueryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetConfiguration(targetConfiguration: IResolvable)

    public
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a333ec5f573b7b405ac9b85af819f1fdfbe303fe725d10bf4cb221fa20644ff1")
    public
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps.Builder =
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps.builder()

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(IResolvable::unwrap))
    }

    override
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(CfnScheduledQuery.ErrorReportConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66613b4494fcb0944e056033083d7e6098621e6d5595b2c6807bd68774b83481")
    override
        fun errorReportConfiguration(errorReportConfiguration: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder.() -> Unit):
        Unit =
        errorReportConfiguration(CfnScheduledQuery.ErrorReportConfigurationProperty(errorReportConfiguration))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnScheduledQuery.NotificationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32e9ddb76512f6f65e2b921bf96913d2ba2e86b2f9a575bd7f1c043ac7fc3104")
    override
        fun notificationConfiguration(notificationConfiguration: CfnScheduledQuery.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnScheduledQuery.NotificationConfigurationProperty(notificationConfiguration))

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(IResolvable::unwrap))
    }

    override
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(CfnScheduledQuery.ScheduleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98b9af623bbfed6921fddc7f8ba59d52063675b5ad9f37e8d3f8df7cea11d4ba")
    override
        fun scheduleConfiguration(scheduleConfiguration: CfnScheduledQuery.ScheduleConfigurationProperty.Builder.() -> Unit):
        Unit =
        scheduleConfiguration(CfnScheduledQuery.ScheduleConfigurationProperty(scheduleConfiguration))

    override fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
      cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
    }

    override fun scheduledQueryName(scheduledQueryName: String) {
      cdkBuilder.scheduledQueryName(scheduledQueryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetConfiguration(targetConfiguration: IResolvable) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable::unwrap))
    }

    override
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(CfnScheduledQuery.TargetConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a333ec5f573b7b405ac9b85af819f1fdfbe303fe725d10bf4cb221fa20644ff1")
    override
        fun targetConfiguration(targetConfiguration: CfnScheduledQuery.TargetConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetConfiguration(CfnScheduledQuery.TargetConfigurationProperty(targetConfiguration))

    public fun build(): software.amazon.awscdk.services.timestream.CfnScheduledQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQueryProps,
  ) : CdkObject(cdkObject), CfnScheduledQueryProps {
    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun errorReportConfiguration(): Any = unwrap(this).getErrorReportConfiguration()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

    override fun queryString(): String = unwrap(this).getQueryString()

    override fun scheduleConfiguration(): Any = unwrap(this).getScheduleConfiguration()

    override fun scheduledQueryExecutionRoleArn(): String =
        unwrap(this).getScheduledQueryExecutionRoleArn()

    override fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQueryProps):
        CfnScheduledQueryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledQueryProps):
        software.amazon.awscdk.services.timestream.CfnScheduledQueryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.timestream.CfnScheduledQueryProps
  }
}
