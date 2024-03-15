@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

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

public open class CfnTask internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDestinationNetworkInterfaceArns(): List<String> =
      unwrap(this).getAttrDestinationNetworkInterfaceArns()

  public open fun attrSourceNetworkInterfaceArns(): List<String> =
      unwrap(this).getAttrSourceNetworkInterfaceArns()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrTaskArn(): String = unwrap(this).getAttrTaskArn()

  public open fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  public open fun cloudWatchLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogGroupArn(`value`)
  }

  public open fun destinationLocationArn(): String = unwrap(this).getDestinationLocationArn()

  public open fun destinationLocationArn(`value`: String) {
    unwrap(this).setDestinationLocationArn(`value`)
  }

  public open fun excludes(): Any? = unwrap(this).getExcludes()

  public open fun excludes(`value`: IResolvable) {
    unwrap(this).setExcludes(`value`.let(IResolvable::unwrap))
  }

  public open fun excludes(__idx_ac66f0: List<Any>) {
    unwrap(this).setExcludes(__idx_ac66f0)
  }

  public open fun excludes(vararg __idx_ac66f0: Any): Unit = excludes(__idx_ac66f0.toList())

  public open fun includes(): Any? = unwrap(this).getIncludes()

  public open fun includes(`value`: IResolvable) {
    unwrap(this).setIncludes(`value`.let(IResolvable::unwrap))
  }

  public open fun includes(__idx_ac66f0: List<Any>) {
    unwrap(this).setIncludes(__idx_ac66f0)
  }

  public open fun includes(vararg __idx_ac66f0: Any): Unit = includes(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun options(): Any? = unwrap(this).getOptions()

  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun options(`value`: OptionsProperty) {
    unwrap(this).setOptions(`value`.let(OptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0cb73a6986b6a2eab6684e9cc43938f794e75585cce4f517dfd62a17d2fe2b76")
  public open fun options(`value`: OptionsProperty.Builder.() -> Unit): Unit =
      options(OptionsProperty(`value`))

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: TaskScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(TaskScheduleProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("618247c359dbc42271d0d4fff1b9a15f8cd3b3f3d1ad0966e97a9590fe51a050")
  public open fun schedule(`value`: TaskScheduleProperty.Builder.() -> Unit): Unit =
      schedule(TaskScheduleProperty(`value`))

  public open fun sourceLocationArn(): String = unwrap(this).getSourceLocationArn()

  public open fun sourceLocationArn(`value`: String) {
    unwrap(this).setSourceLocationArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun taskReportConfig(): Any? = unwrap(this).getTaskReportConfig()

  public open fun taskReportConfig(`value`: IResolvable) {
    unwrap(this).setTaskReportConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun taskReportConfig(`value`: TaskReportConfigProperty) {
    unwrap(this).setTaskReportConfig(`value`.let(TaskReportConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9703490283b3a1cc2736578162b15b5832eeb2283c5e3d073cac56246de9aae5")
  public open fun taskReportConfig(`value`: TaskReportConfigProperty.Builder.() -> Unit): Unit =
      taskReportConfig(TaskReportConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    public fun destinationLocationArn(destinationLocationArn: String)

    public fun excludes(excludes: IResolvable)

    public fun excludes(excludes: List<Any>)

    public fun excludes(vararg excludes: Any)

    public fun includes(includes: IResolvable)

    public fun includes(includes: List<Any>)

    public fun includes(vararg includes: Any)

    public fun name(name: String)

    public fun options(options: IResolvable)

    public fun options(options: OptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72305d8f86064d3c2e00f3c3ac30d4951c2ad22f68f689c764cd4ac5db235abc")
    public fun options(options: OptionsProperty.Builder.() -> Unit)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: TaskScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc570e5121b77db56ad8465e2e4b2bca206399256c4c7ca3af30554a5dfe7e3c")
    public fun schedule(schedule: TaskScheduleProperty.Builder.() -> Unit)

    public fun sourceLocationArn(sourceLocationArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskReportConfig(taskReportConfig: IResolvable)

    public fun taskReportConfig(taskReportConfig: TaskReportConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be882d8209e6a0c57067438e1607b0d0fe8570513ca4471839eb30502477f1ca")
    public fun taskReportConfig(taskReportConfig: TaskReportConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTask.Builder =
        software.amazon.awscdk.services.datasync.CfnTask.Builder.create(scope, id)

    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    override fun destinationLocationArn(destinationLocationArn: String) {
      cdkBuilder.destinationLocationArn(destinationLocationArn)
    }

    override fun excludes(excludes: IResolvable) {
      cdkBuilder.excludes(excludes.let(IResolvable::unwrap))
    }

    override fun excludes(excludes: List<Any>) {
      cdkBuilder.excludes(excludes)
    }

    override fun excludes(vararg excludes: Any): Unit = excludes(excludes.toList())

    override fun includes(includes: IResolvable) {
      cdkBuilder.includes(includes.let(IResolvable::unwrap))
    }

    override fun includes(includes: List<Any>) {
      cdkBuilder.includes(includes)
    }

    override fun includes(vararg includes: Any): Unit = includes(includes.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: OptionsProperty) {
      cdkBuilder.options(options.let(OptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72305d8f86064d3c2e00f3c3ac30d4951c2ad22f68f689c764cd4ac5db235abc")
    override fun options(options: OptionsProperty.Builder.() -> Unit): Unit =
        options(OptionsProperty(options))

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: TaskScheduleProperty) {
      cdkBuilder.schedule(schedule.let(TaskScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc570e5121b77db56ad8465e2e4b2bca206399256c4c7ca3af30554a5dfe7e3c")
    override fun schedule(schedule: TaskScheduleProperty.Builder.() -> Unit): Unit =
        schedule(TaskScheduleProperty(schedule))

    override fun sourceLocationArn(sourceLocationArn: String) {
      cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskReportConfig(taskReportConfig: IResolvable) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(IResolvable::unwrap))
    }

    override fun taskReportConfig(taskReportConfig: TaskReportConfigProperty) {
      cdkBuilder.taskReportConfig(taskReportConfig.let(TaskReportConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be882d8209e6a0c57067438e1607b0d0fe8570513ca4471839eb30502477f1ca")
    override fun taskReportConfig(taskReportConfig: TaskReportConfigProperty.Builder.() -> Unit):
        Unit = taskReportConfig(TaskReportConfigProperty(taskReportConfig))

    public fun build(): software.amazon.awscdk.services.datasync.CfnTask = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask): CfnTask =
        CfnTask(cdkObject)

    internal fun unwrap(wrapped: CfnTask): software.amazon.awscdk.services.datasync.CfnTask =
        wrapped.cdkObject
  }

  public interface DeletedProperty {
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    @CdkDslMarker
    public interface Builder {
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty.builder()

      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty,
    ) : CdkObject(cdkObject), DeletedProperty {
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeletedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty):
          DeletedProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeletedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.DeletedProperty
    }
  }

  public interface FilterRuleProperty {
    public fun filterType(): String? = unwrap(this).getFilterType()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun filterType(filterType: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty.builder()

      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty,
    ) : CdkObject(cdkObject), FilterRuleProperty {
      override fun filterType(): String? = unwrap(this).getFilterType()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty):
          FilterRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterRuleProperty):
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.FilterRuleProperty
    }
  }

  public interface OverridesProperty {
    public fun deleted(): Any? = unwrap(this).getDeleted()

    public fun skipped(): Any? = unwrap(this).getSkipped()

    public fun transferred(): Any? = unwrap(this).getTransferred()

    public fun verified(): Any? = unwrap(this).getVerified()

    @CdkDslMarker
    public interface Builder {
      public fun deleted(deleted: IResolvable)

      public fun deleted(deleted: DeletedProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("178ba2b5cf2ea2064355ea97986f3eb26a133c25410c0cd8a534e038d634e103")
      public fun deleted(deleted: DeletedProperty.Builder.() -> Unit)

      public fun skipped(skipped: IResolvable)

      public fun skipped(skipped: SkippedProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8634100c7e7679d1298a9e8c62ef0e782009db9965eb037d9f30f19f4dec76")
      public fun skipped(skipped: SkippedProperty.Builder.() -> Unit)

      public fun transferred(transferred: IResolvable)

      public fun transferred(transferred: TransferredProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867ccf2419e9301cde6a783a341d38eb0896e2ac7c58c19f1fb9e34a7bc656f3")
      public fun transferred(transferred: TransferredProperty.Builder.() -> Unit)

      public fun verified(verified: IResolvable)

      public fun verified(verified: VerifiedProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6de5119e7772a304c44a8d224fb786e3b2b3c6fb013deaf42c69720fd3212640")
      public fun verified(verified: VerifiedProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty.builder()

      override fun deleted(deleted: IResolvable) {
        cdkBuilder.deleted(deleted.let(IResolvable::unwrap))
      }

      override fun deleted(deleted: DeletedProperty) {
        cdkBuilder.deleted(deleted.let(DeletedProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("178ba2b5cf2ea2064355ea97986f3eb26a133c25410c0cd8a534e038d634e103")
      override fun deleted(deleted: DeletedProperty.Builder.() -> Unit): Unit =
          deleted(DeletedProperty(deleted))

      override fun skipped(skipped: IResolvable) {
        cdkBuilder.skipped(skipped.let(IResolvable::unwrap))
      }

      override fun skipped(skipped: SkippedProperty) {
        cdkBuilder.skipped(skipped.let(SkippedProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8634100c7e7679d1298a9e8c62ef0e782009db9965eb037d9f30f19f4dec76")
      override fun skipped(skipped: SkippedProperty.Builder.() -> Unit): Unit =
          skipped(SkippedProperty(skipped))

      override fun transferred(transferred: IResolvable) {
        cdkBuilder.transferred(transferred.let(IResolvable::unwrap))
      }

      override fun transferred(transferred: TransferredProperty) {
        cdkBuilder.transferred(transferred.let(TransferredProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867ccf2419e9301cde6a783a341d38eb0896e2ac7c58c19f1fb9e34a7bc656f3")
      override fun transferred(transferred: TransferredProperty.Builder.() -> Unit): Unit =
          transferred(TransferredProperty(transferred))

      override fun verified(verified: IResolvable) {
        cdkBuilder.verified(verified.let(IResolvable::unwrap))
      }

      override fun verified(verified: VerifiedProperty) {
        cdkBuilder.verified(verified.let(VerifiedProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6de5119e7772a304c44a8d224fb786e3b2b3c6fb013deaf42c69720fd3212640")
      override fun verified(verified: VerifiedProperty.Builder.() -> Unit): Unit =
          verified(VerifiedProperty(verified))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty,
    ) : CdkObject(cdkObject), OverridesProperty {
      override fun deleted(): Any? = unwrap(this).getDeleted()

      override fun skipped(): Any? = unwrap(this).getSkipped()

      override fun transferred(): Any? = unwrap(this).getTransferred()

      override fun verified(): Any? = unwrap(this).getVerified()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty):
          OverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverridesProperty):
          software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.OverridesProperty
    }
  }

  public interface TaskScheduleProperty {
    public fun scheduleExpression(): String

    @CdkDslMarker
    public interface Builder {
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.builder()

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty,
    ) : CdkObject(cdkObject), TaskScheduleProperty {
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty):
          TaskScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskScheduleProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty
    }
  }

  public interface S3Property {
    public fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

    public fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

    public fun subdirectory(): String? = unwrap(this).getSubdirectory()

    @CdkDslMarker
    public interface Builder {
      public fun bucketAccessRoleArn(bucketAccessRoleArn: String)

      public fun s3BucketArn(s3BucketArn: String)

      public fun subdirectory(subdirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnTask.S3Property.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.S3Property.builder()

      override fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
      }

      override fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
      }

      override fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      override fun bucketAccessRoleArn(): String? = unwrap(this).getBucketAccessRoleArn()

      override fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

      override fun subdirectory(): String? = unwrap(this).getSubdirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.S3Property):
          S3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.datasync.CfnTask.S3Property = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.S3Property
    }
  }

  public interface DestinationProperty {
    public fun s3(): Any? = unwrap(this).getS3()

    @CdkDslMarker
    public interface Builder {
      public fun s3(s3: IResolvable)

      public fun s3(s3: S3Property)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeda5b4004520bfe4b68bdf0e8efea7feea712d87baf6b70181bdd6ffd01dc2")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty.builder()

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeda5b4004520bfe4b68bdf0e8efea7feea712d87baf6b70181bdd6ffd01dc2")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.DestinationProperty
    }
  }

  public interface OptionsProperty {
    public fun atime(): String? = unwrap(this).getAtime()

    public fun bytesPerSecond(): Number? = unwrap(this).getBytesPerSecond()

    public fun gid(): String? = unwrap(this).getGid()

    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public fun mtime(): String? = unwrap(this).getMtime()

    public fun objectTags(): String? = unwrap(this).getObjectTags()

    public fun overwriteMode(): String? = unwrap(this).getOverwriteMode()

    public fun posixPermissions(): String? = unwrap(this).getPosixPermissions()

    public fun preserveDeletedFiles(): String? = unwrap(this).getPreserveDeletedFiles()

    public fun preserveDevices(): String? = unwrap(this).getPreserveDevices()

    public fun securityDescriptorCopyFlags(): String? =
        unwrap(this).getSecurityDescriptorCopyFlags()

    public fun taskQueueing(): String? = unwrap(this).getTaskQueueing()

    public fun transferMode(): String? = unwrap(this).getTransferMode()

    public fun uid(): String? = unwrap(this).getUid()

    public fun verifyMode(): String? = unwrap(this).getVerifyMode()

    @CdkDslMarker
    public interface Builder {
      public fun atime(atime: String)

      public fun bytesPerSecond(bytesPerSecond: Number)

      public fun gid(gid: String)

      public fun logLevel(logLevel: String)

      public fun mtime(mtime: String)

      public fun objectTags(objectTags: String)

      public fun overwriteMode(overwriteMode: String)

      public fun posixPermissions(posixPermissions: String)

      public fun preserveDeletedFiles(preserveDeletedFiles: String)

      public fun preserveDevices(preserveDevices: String)

      public fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String)

      public fun taskQueueing(taskQueueing: String)

      public fun transferMode(transferMode: String)

      public fun uid(uid: String)

      public fun verifyMode(verifyMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty.builder()

      override fun atime(atime: String) {
        cdkBuilder.atime(atime)
      }

      override fun bytesPerSecond(bytesPerSecond: Number) {
        cdkBuilder.bytesPerSecond(bytesPerSecond)
      }

      override fun gid(gid: String) {
        cdkBuilder.gid(gid)
      }

      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      override fun mtime(mtime: String) {
        cdkBuilder.mtime(mtime)
      }

      override fun objectTags(objectTags: String) {
        cdkBuilder.objectTags(objectTags)
      }

      override fun overwriteMode(overwriteMode: String) {
        cdkBuilder.overwriteMode(overwriteMode)
      }

      override fun posixPermissions(posixPermissions: String) {
        cdkBuilder.posixPermissions(posixPermissions)
      }

      override fun preserveDeletedFiles(preserveDeletedFiles: String) {
        cdkBuilder.preserveDeletedFiles(preserveDeletedFiles)
      }

      override fun preserveDevices(preserveDevices: String) {
        cdkBuilder.preserveDevices(preserveDevices)
      }

      override fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String) {
        cdkBuilder.securityDescriptorCopyFlags(securityDescriptorCopyFlags)
      }

      override fun taskQueueing(taskQueueing: String) {
        cdkBuilder.taskQueueing(taskQueueing)
      }

      override fun transferMode(transferMode: String) {
        cdkBuilder.transferMode(transferMode)
      }

      override fun uid(uid: String) {
        cdkBuilder.uid(uid)
      }

      override fun verifyMode(verifyMode: String) {
        cdkBuilder.verifyMode(verifyMode)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty,
    ) : CdkObject(cdkObject), OptionsProperty {
      override fun atime(): String? = unwrap(this).getAtime()

      override fun bytesPerSecond(): Number? = unwrap(this).getBytesPerSecond()

      override fun gid(): String? = unwrap(this).getGid()

      override fun logLevel(): String? = unwrap(this).getLogLevel()

      override fun mtime(): String? = unwrap(this).getMtime()

      override fun objectTags(): String? = unwrap(this).getObjectTags()

      override fun overwriteMode(): String? = unwrap(this).getOverwriteMode()

      override fun posixPermissions(): String? = unwrap(this).getPosixPermissions()

      override fun preserveDeletedFiles(): String? = unwrap(this).getPreserveDeletedFiles()

      override fun preserveDevices(): String? = unwrap(this).getPreserveDevices()

      override fun securityDescriptorCopyFlags(): String? =
          unwrap(this).getSecurityDescriptorCopyFlags()

      override fun taskQueueing(): String? = unwrap(this).getTaskQueueing()

      override fun transferMode(): String? = unwrap(this).getTransferMode()

      override fun uid(): String? = unwrap(this).getUid()

      override fun verifyMode(): String? = unwrap(this).getVerifyMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty):
          OptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty
    }
  }

  public interface TaskReportConfigProperty {
    public fun destination(): Any

    public fun objectVersionIds(): String? = unwrap(this).getObjectVersionIds()

    public fun outputType(): String

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: DestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdbf726fa76d94dfb1383ff714be978466c41118561c38e153b56fe0d20ba16e")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      public fun objectVersionIds(objectVersionIds: String)

      public fun outputType(outputType: String)

      public fun overrides(overrides: IResolvable)

      public fun overrides(overrides: OverridesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b8097e5cf74692b3a83ff4b60e489d9346bdc0905c80d77b375ef9d1deecbc")
      public fun overrides(overrides: OverridesProperty.Builder.() -> Unit)

      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdbf726fa76d94dfb1383ff714be978466c41118561c38e153b56fe0d20ba16e")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      override fun objectVersionIds(objectVersionIds: String) {
        cdkBuilder.objectVersionIds(objectVersionIds)
      }

      override fun outputType(outputType: String) {
        cdkBuilder.outputType(outputType)
      }

      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      override fun overrides(overrides: OverridesProperty) {
        cdkBuilder.overrides(overrides.let(OverridesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b8097e5cf74692b3a83ff4b60e489d9346bdc0905c80d77b375ef9d1deecbc")
      override fun overrides(overrides: OverridesProperty.Builder.() -> Unit): Unit =
          overrides(OverridesProperty(overrides))

      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty,
    ) : CdkObject(cdkObject), TaskReportConfigProperty {
      override fun destination(): Any = unwrap(this).getDestination()

      override fun objectVersionIds(): String? = unwrap(this).getObjectVersionIds()

      override fun outputType(): String = unwrap(this).getOutputType()

      override fun overrides(): Any? = unwrap(this).getOverrides()

      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskReportConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty):
          TaskReportConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskReportConfigProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TaskReportConfigProperty
    }
  }

  public interface SkippedProperty {
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    @CdkDslMarker
    public interface Builder {
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty.builder()

      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty,
    ) : CdkObject(cdkObject), SkippedProperty {
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkippedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty):
          SkippedProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkippedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.SkippedProperty
    }
  }

  public interface VerifiedProperty {
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    @CdkDslMarker
    public interface Builder {
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty.builder()

      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty,
    ) : CdkObject(cdkObject), VerifiedProperty {
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VerifiedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty):
          VerifiedProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedProperty):
          software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnTask.VerifiedProperty
    }
  }

  public interface TransferredProperty {
    public fun reportLevel(): String? = unwrap(this).getReportLevel()

    @CdkDslMarker
    public interface Builder {
      public fun reportLevel(reportLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty.builder()

      override fun reportLevel(reportLevel: String) {
        cdkBuilder.reportLevel(reportLevel)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty,
    ) : CdkObject(cdkObject), TransferredProperty {
      override fun reportLevel(): String? = unwrap(this).getReportLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransferredProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty):
          TransferredProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransferredProperty):
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnTask.TransferredProperty
    }
  }
}
