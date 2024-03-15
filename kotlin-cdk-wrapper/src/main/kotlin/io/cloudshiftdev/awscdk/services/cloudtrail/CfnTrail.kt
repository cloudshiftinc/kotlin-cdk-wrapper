@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrail internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  public open fun advancedEventSelectors(`value`: IResolvable) {
    unwrap(this).setAdvancedEventSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun advancedEventSelectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdvancedEventSelectors(__idx_ac66f0)
  }

  public open fun advancedEventSelectors(vararg __idx_ac66f0: Any): Unit =
      advancedEventSelectors(__idx_ac66f0.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSnsTopicArn(): String = unwrap(this).getAttrSnsTopicArn()

  public open fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

  public open fun cloudWatchLogsLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogsLogGroupArn(`value`)
  }

  public open fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

  public open fun cloudWatchLogsRoleArn(`value`: String) {
    unwrap(this).setCloudWatchLogsRoleArn(`value`)
  }

  public open fun enableLogFileValidation(): Any? = unwrap(this).getEnableLogFileValidation()

  public open fun enableLogFileValidation(`value`: Boolean) {
    unwrap(this).setEnableLogFileValidation(`value`)
  }

  public open fun enableLogFileValidation(`value`: IResolvable) {
    unwrap(this).setEnableLogFileValidation(`value`.let(IResolvable::unwrap))
  }

  public open fun eventSelectors(): Any? = unwrap(this).getEventSelectors()

  public open fun eventSelectors(`value`: IResolvable) {
    unwrap(this).setEventSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun eventSelectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setEventSelectors(__idx_ac66f0)
  }

  public open fun eventSelectors(vararg __idx_ac66f0: Any): Unit =
      eventSelectors(__idx_ac66f0.toList())

  public open fun includeGlobalServiceEvents(): Any? = unwrap(this).getIncludeGlobalServiceEvents()

  public open fun includeGlobalServiceEvents(`value`: Boolean) {
    unwrap(this).setIncludeGlobalServiceEvents(`value`)
  }

  public open fun includeGlobalServiceEvents(`value`: IResolvable) {
    unwrap(this).setIncludeGlobalServiceEvents(`value`.let(IResolvable::unwrap))
  }

  public open fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  public open fun insightSelectors(`value`: IResolvable) {
    unwrap(this).setInsightSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun insightSelectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setInsightSelectors(__idx_ac66f0)
  }

  public open fun insightSelectors(vararg __idx_ac66f0: Any): Unit =
      insightSelectors(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isLogging(): Any = unwrap(this).getIsLogging()

  public open fun isLogging(`value`: Boolean) {
    unwrap(this).setIsLogging(`value`)
  }

  public open fun isLogging(`value`: IResolvable) {
    unwrap(this).setIsLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun isMultiRegionTrail(): Any? = unwrap(this).getIsMultiRegionTrail()

  public open fun isMultiRegionTrail(`value`: Boolean) {
    unwrap(this).setIsMultiRegionTrail(`value`)
  }

  public open fun isMultiRegionTrail(`value`: IResolvable) {
    unwrap(this).setIsMultiRegionTrail(`value`.let(IResolvable::unwrap))
  }

  public open fun isOrganizationTrail(): Any? = unwrap(this).getIsOrganizationTrail()

  public open fun isOrganizationTrail(`value`: Boolean) {
    unwrap(this).setIsOrganizationTrail(`value`)
  }

  public open fun isOrganizationTrail(`value`: IResolvable) {
    unwrap(this).setIsOrganizationTrail(`value`.let(IResolvable::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun s3BucketName(): String = unwrap(this).getS3BucketName()

  public open fun s3BucketName(`value`: String) {
    unwrap(this).setS3BucketName(`value`)
  }

  public open fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public open fun s3KeyPrefix(`value`: String) {
    unwrap(this).setS3KeyPrefix(`value`)
  }

  public open fun snsTopicName(): String? = unwrap(this).getSnsTopicName()

  public open fun snsTopicName(`value`: String) {
    unwrap(this).setSnsTopicName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun trailName(): String? = unwrap(this).getTrailName()

  public open fun trailName(`value`: String) {
    unwrap(this).setTrailName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

    public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

    public fun enableLogFileValidation(enableLogFileValidation: Boolean)

    public fun enableLogFileValidation(enableLogFileValidation: IResolvable)

    public fun eventSelectors(eventSelectors: IResolvable)

    public fun eventSelectors(eventSelectors: List<Any>)

    public fun eventSelectors(vararg eventSelectors: Any)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable)

    public fun insightSelectors(insightSelectors: IResolvable)

    public fun insightSelectors(insightSelectors: List<Any>)

    public fun insightSelectors(vararg insightSelectors: Any)

    public fun isLogging(isLogging: Boolean)

    public fun isLogging(isLogging: IResolvable)

    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    public fun isMultiRegionTrail(isMultiRegionTrail: IResolvable)

    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    public fun isOrganizationTrail(isOrganizationTrail: IResolvable)

    public fun kmsKeyId(kmsKeyId: String)

    public fun s3BucketName(s3BucketName: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun snsTopicName(snsTopicName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trailName(trailName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnTrail.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnTrail.Builder.create(scope, id)

    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
      cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
      cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
    }

    override fun enableLogFileValidation(enableLogFileValidation: Boolean) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation)
    }

    override fun enableLogFileValidation(enableLogFileValidation: IResolvable) {
      cdkBuilder.enableLogFileValidation(enableLogFileValidation.let(IResolvable::unwrap))
    }

    override fun eventSelectors(eventSelectors: IResolvable) {
      cdkBuilder.eventSelectors(eventSelectors.let(IResolvable::unwrap))
    }

    override fun eventSelectors(eventSelectors: List<Any>) {
      cdkBuilder.eventSelectors(eventSelectors)
    }

    override fun eventSelectors(vararg eventSelectors: Any): Unit =
        eventSelectors(eventSelectors.toList())

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: IResolvable) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors)
    }

    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    override fun isLogging(isLogging: Boolean) {
      cdkBuilder.isLogging(isLogging)
    }

    override fun isLogging(isLogging: IResolvable) {
      cdkBuilder.isLogging(isLogging.let(IResolvable::unwrap))
    }

    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    override fun isMultiRegionTrail(isMultiRegionTrail: IResolvable) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail.let(IResolvable::unwrap))
    }

    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    override fun isOrganizationTrail(isOrganizationTrail: IResolvable) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail.let(IResolvable::unwrap))
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    override fun snsTopicName(snsTopicName: String) {
      cdkBuilder.snsTopicName(snsTopicName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnTrail.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail): CfnTrail =
        CfnTrail(cdkObject)

    internal fun unwrap(wrapped: CfnTrail): software.amazon.awscdk.services.cloudtrail.CfnTrail =
        wrapped.cdkObject
  }

  public interface AdvancedEventSelectorProperty {
    public fun fieldSelectors(): Any

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun fieldSelectors(fieldSelectors: IResolvable)

      public fun fieldSelectors(fieldSelectors: List<Any>)

      public fun fieldSelectors(vararg fieldSelectors: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty.builder()

      override fun fieldSelectors(fieldSelectors: IResolvable) {
        cdkBuilder.fieldSelectors(fieldSelectors.let(IResolvable::unwrap))
      }

      override fun fieldSelectors(fieldSelectors: List<Any>) {
        cdkBuilder.fieldSelectors(fieldSelectors)
      }

      override fun fieldSelectors(vararg fieldSelectors: Any): Unit =
          fieldSelectors(fieldSelectors.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedEventSelectorProperty {
      override fun fieldSelectors(): Any = unwrap(this).getFieldSelectors()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedEventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty):
          AdvancedEventSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedEventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedEventSelectorProperty
    }
  }

  public interface EventSelectorProperty {
    public fun dataResources(): Any? = unwrap(this).getDataResources()

    public fun excludeManagementEventSources(): List<String> =
        unwrap(this).getExcludeManagementEventSources() ?: emptyList()

    public fun includeManagementEvents(): Any? = unwrap(this).getIncludeManagementEvents()

    public fun readWriteType(): String? = unwrap(this).getReadWriteType()

    @CdkDslMarker
    public interface Builder {
      public fun dataResources(dataResources: IResolvable)

      public fun dataResources(dataResources: List<Any>)

      public fun dataResources(vararg dataResources: Any)

      public fun excludeManagementEventSources(excludeManagementEventSources: List<String>)

      public fun excludeManagementEventSources(vararg excludeManagementEventSources: String)

      public fun includeManagementEvents(includeManagementEvents: Boolean)

      public fun includeManagementEvents(includeManagementEvents: IResolvable)

      public fun readWriteType(readWriteType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.builder()

      override fun dataResources(dataResources: IResolvable) {
        cdkBuilder.dataResources(dataResources.let(IResolvable::unwrap))
      }

      override fun dataResources(dataResources: List<Any>) {
        cdkBuilder.dataResources(dataResources)
      }

      override fun dataResources(vararg dataResources: Any): Unit =
          dataResources(dataResources.toList())

      override fun excludeManagementEventSources(excludeManagementEventSources: List<String>) {
        cdkBuilder.excludeManagementEventSources(excludeManagementEventSources)
      }

      override fun excludeManagementEventSources(vararg excludeManagementEventSources: String): Unit
          = excludeManagementEventSources(excludeManagementEventSources.toList())

      override fun includeManagementEvents(includeManagementEvents: Boolean) {
        cdkBuilder.includeManagementEvents(includeManagementEvents)
      }

      override fun includeManagementEvents(includeManagementEvents: IResolvable) {
        cdkBuilder.includeManagementEvents(includeManagementEvents.let(IResolvable::unwrap))
      }

      override fun readWriteType(readWriteType: String) {
        cdkBuilder.readWriteType(readWriteType)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty,
    ) : CdkObject(cdkObject), EventSelectorProperty {
      override fun dataResources(): Any? = unwrap(this).getDataResources()

      override fun excludeManagementEventSources(): List<String> =
          unwrap(this).getExcludeManagementEventSources() ?: emptyList()

      override fun includeManagementEvents(): Any? = unwrap(this).getIncludeManagementEvents()

      override fun readWriteType(): String? = unwrap(this).getReadWriteType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty):
          EventSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty
    }
  }

  public interface AdvancedFieldSelectorProperty {
    public fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    public fun `field`(): String

    public fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    public fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

    public fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun endsWith(endsWith: List<String>)

      public fun endsWith(vararg endsWith: String)

      public fun equalTo(equalTo: List<String>)

      public fun equalTo(vararg equalTo: String)

      public fun `field`(`field`: String)

      public fun notEndsWith(notEndsWith: List<String>)

      public fun notEndsWith(vararg notEndsWith: String)

      public fun notEquals(notEquals: List<String>)

      public fun notEquals(vararg notEquals: String)

      public fun notStartsWith(notStartsWith: List<String>)

      public fun notStartsWith(vararg notStartsWith: String)

      public fun startsWith(startsWith: List<String>)

      public fun startsWith(vararg startsWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty.builder()

      override fun endsWith(endsWith: List<String>) {
        cdkBuilder.endsWith(endsWith)
      }

      override fun endsWith(vararg endsWith: String): Unit = endsWith(endsWith.toList())

      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun notEndsWith(notEndsWith: List<String>) {
        cdkBuilder.notEndsWith(notEndsWith)
      }

      override fun notEndsWith(vararg notEndsWith: String): Unit = notEndsWith(notEndsWith.toList())

      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      override fun notEquals(vararg notEquals: String): Unit = notEquals(notEquals.toList())

      override fun notStartsWith(notStartsWith: List<String>) {
        cdkBuilder.notStartsWith(notStartsWith)
      }

      override fun notStartsWith(vararg notStartsWith: String): Unit =
          notStartsWith(notStartsWith.toList())

      override fun startsWith(startsWith: List<String>) {
        cdkBuilder.startsWith(startsWith)
      }

      override fun startsWith(vararg startsWith: String): Unit = startsWith(startsWith.toList())

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedFieldSelectorProperty {
      override fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      override fun `field`(): String = unwrap(this).getField()

      override fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

      override fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

      override fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedFieldSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty):
          AdvancedFieldSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedFieldSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.AdvancedFieldSelectorProperty
    }
  }

  public interface DataResourceProperty {
    public fun type(): String

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty,
    ) : CdkObject(cdkObject), DataResourceProperty {
      override fun type(): String = unwrap(this).getType()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty):
          DataResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataResourceProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty
    }
  }

  public interface InsightSelectorProperty {
    public fun insightType(): String? = unwrap(this).getInsightType()

    @CdkDslMarker
    public interface Builder {
      public fun insightType(insightType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty.builder()

      override fun insightType(insightType: String) {
        cdkBuilder.insightType(insightType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty,
    ) : CdkObject(cdkObject), InsightSelectorProperty {
      override fun insightType(): String? = unwrap(this).getInsightType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty):
          InsightSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty
    }
  }
}
