@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJobTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun abortConfig(): Any? = unwrap(this).getAbortConfig()

  public open fun abortConfig(`value`: Any) {
    unwrap(this).setAbortConfig(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationPackageVersions(): List<String> =
      unwrap(this).getDestinationPackageVersions() ?: emptyList()

  public open fun destinationPackageVersions(`value`: List<String>) {
    unwrap(this).setDestinationPackageVersions(`value`)
  }

  public open fun destinationPackageVersions(vararg `value`: String): Unit =
      destinationPackageVersions(`value`.toList())

  public open fun document(): String? = unwrap(this).getDocument()

  public open fun document(`value`: String) {
    unwrap(this).setDocument(`value`)
  }

  public open fun documentSource(): String? = unwrap(this).getDocumentSource()

  public open fun documentSource(`value`: String) {
    unwrap(this).setDocumentSource(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobArn(): String? = unwrap(this).getJobArn()

  public open fun jobArn(`value`: String) {
    unwrap(this).setJobArn(`value`)
  }

  public open fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

  public open fun jobExecutionsRetryConfig(`value`: IResolvable) {
    unwrap(this).setJobExecutionsRetryConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun jobExecutionsRetryConfig(`value`: JobExecutionsRetryConfigProperty) {
    unwrap(this).setJobExecutionsRetryConfig(`value`.let(JobExecutionsRetryConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("587ee1bebb4160b831e3a9c3ad3bf8a0ac25a736f62ecefff71478b4a1173066")
  public open
      fun jobExecutionsRetryConfig(`value`: JobExecutionsRetryConfigProperty.Builder.() -> Unit):
      Unit = jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty(`value`))

  public open fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

  public open fun jobExecutionsRolloutConfig(`value`: Any) {
    unwrap(this).setJobExecutionsRolloutConfig(`value`)
  }

  public open fun jobTemplateId(): String = unwrap(this).getJobTemplateId()

  public open fun jobTemplateId(`value`: String) {
    unwrap(this).setJobTemplateId(`value`)
  }

  public open fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

  public open fun maintenanceWindows(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindows(`value`.let(IResolvable::unwrap))
  }

  public open fun maintenanceWindows(__idx_ac66f0: List<Any>) {
    unwrap(this).setMaintenanceWindows(__idx_ac66f0)
  }

  public open fun maintenanceWindows(vararg __idx_ac66f0: Any): Unit =
      maintenanceWindows(__idx_ac66f0.toList())

  public open fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

  public open fun presignedUrlConfig(`value`: Any) {
    unwrap(this).setPresignedUrlConfig(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

  public open fun timeoutConfig(`value`: Any) {
    unwrap(this).setTimeoutConfig(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun abortConfig(abortConfig: Any)

    public fun description(description: String)

    public fun destinationPackageVersions(destinationPackageVersions: List<String>)

    public fun destinationPackageVersions(vararg destinationPackageVersions: String)

    public fun document(document: String)

    public fun documentSource(documentSource: String)

    public fun jobArn(jobArn: String)

    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable)

    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f07507e82a08fa344ea7db45333affff37b9c3f56a1162931589454f3e071196")
    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty.Builder.() -> Unit)

    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any)

    public fun jobTemplateId(jobTemplateId: String)

    public fun maintenanceWindows(maintenanceWindows: IResolvable)

    public fun maintenanceWindows(maintenanceWindows: List<Any>)

    public fun maintenanceWindows(vararg maintenanceWindows: Any)

    public fun presignedUrlConfig(presignedUrlConfig: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutConfig(timeoutConfig: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnJobTemplate.Builder =
        software.amazon.awscdk.services.iot.CfnJobTemplate.Builder.create(scope, id)

    override fun abortConfig(abortConfig: Any) {
      cdkBuilder.abortConfig(abortConfig)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationPackageVersions(destinationPackageVersions: List<String>) {
      cdkBuilder.destinationPackageVersions(destinationPackageVersions)
    }

    override fun destinationPackageVersions(vararg destinationPackageVersions: String): Unit =
        destinationPackageVersions(destinationPackageVersions.toList())

    override fun document(document: String) {
      cdkBuilder.document(document)
    }

    override fun documentSource(documentSource: String) {
      cdkBuilder.documentSource(documentSource)
    }

    override fun jobArn(jobArn: String) {
      cdkBuilder.jobArn(jobArn)
    }

    override fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(IResolvable::unwrap))
    }

    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(JobExecutionsRetryConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f07507e82a08fa344ea7db45333affff37b9c3f56a1162931589454f3e071196")
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: JobExecutionsRetryConfigProperty.Builder.() -> Unit):
        Unit = jobExecutionsRetryConfig(JobExecutionsRetryConfigProperty(jobExecutionsRetryConfig))

    override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
      cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    override fun jobTemplateId(jobTemplateId: String) {
      cdkBuilder.jobTemplateId(jobTemplateId)
    }

    override fun maintenanceWindows(maintenanceWindows: IResolvable) {
      cdkBuilder.maintenanceWindows(maintenanceWindows.let(IResolvable::unwrap))
    }

    override fun maintenanceWindows(maintenanceWindows: List<Any>) {
      cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    override fun maintenanceWindows(vararg maintenanceWindows: Any): Unit =
        maintenanceWindows(maintenanceWindows.toList())

    override fun presignedUrlConfig(presignedUrlConfig: Any) {
      cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeoutConfig(timeoutConfig: Any) {
      cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnJobTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate): CfnJobTemplate
        = CfnJobTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplate): software.amazon.awscdk.services.iot.CfnJobTemplate
        = wrapped.cdkObject
  }

  public interface JobExecutionsRolloutConfigProperty {
    public fun exponentialRolloutRate(): Any? = unwrap(this).getExponentialRolloutRate()

    public fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()

    @CdkDslMarker
    public interface Builder {
      public fun exponentialRolloutRate(exponentialRolloutRate: IResolvable)

      public fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee8f5419cc352070c35fa37873e10c1fc11252f5336d82a87ac177eca125449")
      public
          fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty.Builder.() -> Unit)

      public fun maximumPerMinute(maximumPerMinute: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty.builder()

      override fun exponentialRolloutRate(exponentialRolloutRate: IResolvable) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate.let(IResolvable::unwrap))
      }

      override fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate.let(ExponentialRolloutRateProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fee8f5419cc352070c35fa37873e10c1fc11252f5336d82a87ac177eca125449")
      override
          fun exponentialRolloutRate(exponentialRolloutRate: ExponentialRolloutRateProperty.Builder.() -> Unit):
          Unit = exponentialRolloutRate(ExponentialRolloutRateProperty(exponentialRolloutRate))

      override fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty,
    ) : CdkObject(cdkObject), JobExecutionsRolloutConfigProperty {
      override fun exponentialRolloutRate(): Any? = unwrap(this).getExponentialRolloutRate()

      override fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          JobExecutionsRolloutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty):
          JobExecutionsRolloutConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobExecutionsRolloutConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRolloutConfigProperty
    }
  }

  public interface AbortCriteriaProperty {
    public fun action(): String

    public fun failureType(): String

    public fun minNumberOfExecutedThings(): Number

    public fun thresholdPercentage(): Number

    @CdkDslMarker
    public interface Builder {
      public fun action(action: String)

      public fun failureType(failureType: String)

      public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number)

      public fun thresholdPercentage(thresholdPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      override fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
      }

      override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty,
    ) : CdkObject(cdkObject), AbortCriteriaProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun failureType(): String = unwrap(this).getFailureType()

      override fun minNumberOfExecutedThings(): Number = unwrap(this).getMinNumberOfExecutedThings()

      override fun thresholdPercentage(): Number = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbortCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty):
          AbortCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortCriteriaProperty
    }
  }

  public interface TimeoutConfigProperty {
    public fun inProgressTimeoutInMinutes(): Number

    @CdkDslMarker
    public interface Builder {
      public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty.builder()

      override fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty,
    ) : CdkObject(cdkObject), TimeoutConfigProperty {
      override fun inProgressTimeoutInMinutes(): Number =
          unwrap(this).getInProgressTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty):
          TimeoutConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.TimeoutConfigProperty
    }
  }

  public interface PresignedUrlConfigProperty {
    public fun expiresInSec(): Number? = unwrap(this).getExpiresInSec()

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun expiresInSec(expiresInSec: Number)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty.builder()

      override fun expiresInSec(expiresInSec: Number) {
        cdkBuilder.expiresInSec(expiresInSec)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty,
    ) : CdkObject(cdkObject), PresignedUrlConfigProperty {
      override fun expiresInSec(): Number? = unwrap(this).getExpiresInSec()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PresignedUrlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty):
          PresignedUrlConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PresignedUrlConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.PresignedUrlConfigProperty
    }
  }

  public interface JobExecutionsRetryConfigProperty {
    public fun retryCriteriaList(): Any? = unwrap(this).getRetryCriteriaList()

    @CdkDslMarker
    public interface Builder {
      public fun retryCriteriaList(retryCriteriaList: IResolvable)

      public fun retryCriteriaList(retryCriteriaList: List<Any>)

      public fun retryCriteriaList(vararg retryCriteriaList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty.builder()

      override fun retryCriteriaList(retryCriteriaList: IResolvable) {
        cdkBuilder.retryCriteriaList(retryCriteriaList.let(IResolvable::unwrap))
      }

      override fun retryCriteriaList(retryCriteriaList: List<Any>) {
        cdkBuilder.retryCriteriaList(retryCriteriaList)
      }

      override fun retryCriteriaList(vararg retryCriteriaList: Any): Unit =
          retryCriteriaList(retryCriteriaList.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty,
    ) : CdkObject(cdkObject), JobExecutionsRetryConfigProperty {
      override fun retryCriteriaList(): Any? = unwrap(this).getRetryCriteriaList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JobExecutionsRetryConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty):
          JobExecutionsRetryConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobExecutionsRetryConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.JobExecutionsRetryConfigProperty
    }
  }

  public interface RateIncreaseCriteriaProperty {
    public fun numberOfNotifiedThings(): Number? = unwrap(this).getNumberOfNotifiedThings()

    public fun numberOfSucceededThings(): Number? = unwrap(this).getNumberOfSucceededThings()

    @CdkDslMarker
    public interface Builder {
      public fun numberOfNotifiedThings(numberOfNotifiedThings: Number)

      public fun numberOfSucceededThings(numberOfSucceededThings: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty.builder()

      override fun numberOfNotifiedThings(numberOfNotifiedThings: Number) {
        cdkBuilder.numberOfNotifiedThings(numberOfNotifiedThings)
      }

      override fun numberOfSucceededThings(numberOfSucceededThings: Number) {
        cdkBuilder.numberOfSucceededThings(numberOfSucceededThings)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty,
    ) : CdkObject(cdkObject), RateIncreaseCriteriaProperty {
      override fun numberOfNotifiedThings(): Number? = unwrap(this).getNumberOfNotifiedThings()

      override fun numberOfSucceededThings(): Number? = unwrap(this).getNumberOfSucceededThings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RateIncreaseCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty):
          RateIncreaseCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RateIncreaseCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.RateIncreaseCriteriaProperty
    }
  }

  public interface MaintenanceWindowProperty {
    public fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

    public fun startTime(): String? = unwrap(this).getStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun durationInMinutes(durationInMinutes: Number)

      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty.builder()

      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowProperty {
      override fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty):
          MaintenanceWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.MaintenanceWindowProperty
    }
  }

  public interface AbortConfigProperty {
    public fun criteriaList(): Any

    @CdkDslMarker
    public interface Builder {
      public fun criteriaList(criteriaList: IResolvable)

      public fun criteriaList(criteriaList: List<Any>)

      public fun criteriaList(vararg criteriaList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty.builder()

      override fun criteriaList(criteriaList: IResolvable) {
        cdkBuilder.criteriaList(criteriaList.let(IResolvable::unwrap))
      }

      override fun criteriaList(criteriaList: List<Any>) {
        cdkBuilder.criteriaList(criteriaList)
      }

      override fun criteriaList(vararg criteriaList: Any): Unit =
          criteriaList(criteriaList.toList())

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty,
    ) : CdkObject(cdkObject), AbortConfigProperty {
      override fun criteriaList(): Any = unwrap(this).getCriteriaList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AbortConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty):
          AbortConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortConfigProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.AbortConfigProperty
    }
  }

  public interface ExponentialRolloutRateProperty {
    public fun baseRatePerMinute(): Number

    public fun incrementFactor(): Number

    public fun rateIncreaseCriteria(): Any

    @CdkDslMarker
    public interface Builder {
      public fun baseRatePerMinute(baseRatePerMinute: Number)

      public fun incrementFactor(incrementFactor: Number)

      public fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable)

      public fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edd0b24b3eb5a02d63c072c1c5088f14930c44fdb725bef7353a97719ebbf811")
      public
          fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty.builder()

      override fun baseRatePerMinute(baseRatePerMinute: Number) {
        cdkBuilder.baseRatePerMinute(baseRatePerMinute)
      }

      override fun incrementFactor(incrementFactor: Number) {
        cdkBuilder.incrementFactor(incrementFactor)
      }

      override fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria.let(IResolvable::unwrap))
      }

      override fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria.let(RateIncreaseCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edd0b24b3eb5a02d63c072c1c5088f14930c44fdb725bef7353a97719ebbf811")
      override
          fun rateIncreaseCriteria(rateIncreaseCriteria: RateIncreaseCriteriaProperty.Builder.() -> Unit):
          Unit = rateIncreaseCriteria(RateIncreaseCriteriaProperty(rateIncreaseCriteria))

      public fun build():
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty,
    ) : CdkObject(cdkObject), ExponentialRolloutRateProperty {
      override fun baseRatePerMinute(): Number = unwrap(this).getBaseRatePerMinute()

      override fun incrementFactor(): Number = unwrap(this).getIncrementFactor()

      override fun rateIncreaseCriteria(): Any = unwrap(this).getRateIncreaseCriteria()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExponentialRolloutRateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty):
          ExponentialRolloutRateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExponentialRolloutRateProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.ExponentialRolloutRateProperty
    }
  }

  public interface RetryCriteriaProperty {
    public fun failureType(): String? = unwrap(this).getFailureType()

    public fun numberOfRetries(): Number? = unwrap(this).getNumberOfRetries()

    @CdkDslMarker
    public interface Builder {
      public fun failureType(failureType: String)

      public fun numberOfRetries(numberOfRetries: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty.Builder =
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty.builder()

      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      override fun numberOfRetries(numberOfRetries: Number) {
        cdkBuilder.numberOfRetries(numberOfRetries)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty,
    ) : CdkObject(cdkObject), RetryCriteriaProperty {
      override fun failureType(): String? = unwrap(this).getFailureType()

      override fun numberOfRetries(): Number? = unwrap(this).getNumberOfRetries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty):
          RetryCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryCriteriaProperty):
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnJobTemplate.RetryCriteriaProperty
    }
  }
}
