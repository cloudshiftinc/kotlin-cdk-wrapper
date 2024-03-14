package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Trail internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.Trail,
) : Resource(cdkObject) {
  public open fun addEventSelector(dataResourceType: DataResourceType,
      dataResourceValues: List<String>) {
    unwrap(this).addEventSelector(dataResourceType.let(DataResourceType::unwrap),
        dataResourceValues)
  }

  public open fun addEventSelector(
    dataResourceType: DataResourceType,
    dataResourceValues: List<String>,
    options: AddEventSelectorOptions,
  ) {
    unwrap(this).addEventSelector(dataResourceType.let(DataResourceType::unwrap),
        dataResourceValues, options.let(AddEventSelectorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b2360e8940baec24631882984976d9d6cccc814b06ab02d83903f2a5cfee17b")
  public open fun addEventSelector(
    dataResourceType: DataResourceType,
    dataResourceValues: List<String>,
    options: AddEventSelectorOptions.Builder.() -> Unit,
  ): Unit = addEventSelector(dataResourceType, dataResourceValues, AddEventSelectorOptions(options))

  public open fun addLambdaEventSelector(handlers: List<IFunction>) {
    unwrap(this).addLambdaEventSelector(handlers.map(IFunction::unwrap))
  }

  public open fun addLambdaEventSelector(handlers: List<IFunction>,
      options: AddEventSelectorOptions) {
    unwrap(this).addLambdaEventSelector(handlers.map(IFunction::unwrap),
        options.let(AddEventSelectorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("380e761b9da529f96dc712776c5250adc98a2176dfc4bcb784336f670830d05b")
  public open fun addLambdaEventSelector(handlers: List<IFunction>,
      options: AddEventSelectorOptions.Builder.() -> Unit): Unit = addLambdaEventSelector(handlers,
      AddEventSelectorOptions(options))

  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>) {
    unwrap(this).addS3EventSelector(s3Selector.map(S3EventSelector::unwrap))
  }

  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>,
      options: AddEventSelectorOptions) {
    unwrap(this).addS3EventSelector(s3Selector.map(S3EventSelector::unwrap),
        options.let(AddEventSelectorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a701d19f8f0d34b897008ae8171379131f043284f8d5ad44572f24e8dc04087a")
  public open fun addS3EventSelector(s3Selector: List<S3EventSelector>,
      options: AddEventSelectorOptions.Builder.() -> Unit): Unit = addS3EventSelector(s3Selector,
      AddEventSelectorOptions(options))

  public open fun logAllLambdaDataEvents() {
    unwrap(this).logAllLambdaDataEvents()
  }

  public open fun logAllLambdaDataEvents(options: AddEventSelectorOptions) {
    unwrap(this).logAllLambdaDataEvents(options.let(AddEventSelectorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7aaef5ada943f4116a70bac6cad3c339f1128c6317b40a85466c566db9a731eb")
  public open fun logAllLambdaDataEvents(options: AddEventSelectorOptions.Builder.() -> Unit): Unit
      = logAllLambdaDataEvents(AddEventSelectorOptions(options))

  public open fun logAllS3DataEvents() {
    unwrap(this).logAllS3DataEvents()
  }

  public open fun logAllS3DataEvents(options: AddEventSelectorOptions) {
    unwrap(this).logAllS3DataEvents(options.let(AddEventSelectorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a8855c379fe8d829f4650c449d7f82c34650323bf2a7d84530dc45a14b861b5a")
  public open fun logAllS3DataEvents(options: AddEventSelectorOptions.Builder.() -> Unit): Unit =
      logAllS3DataEvents(AddEventSelectorOptions(options))

  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public open fun trailArn(): String = unwrap(this).getTrailArn()

  public open fun trailSnsTopicArn(): String = unwrap(this).getTrailSnsTopicArn()

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays)

    public fun enableFileValidation(enableFileValidation: Boolean)

    public fun encryptionKey(encryptionKey: IKey)

    public fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean)

    public fun insightTypes(insightTypes: List<InsightType>)

    public fun isMultiRegionTrail(isMultiRegionTrail: Boolean)

    public fun isOrganizationTrail(isOrganizationTrail: Boolean)

    public fun managementEvents(managementEvents: ReadWriteType)

    public fun orgId(orgId: String)

    public fun s3KeyPrefix(s3KeyPrefix: String)

    public fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean)

    public fun snsTopic(snsTopic: ITopic)

    public fun trailName(trailName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.Trail.Builder =
        software.amazon.awscdk.services.cloudtrail.Trail.Builder.create(scope, id)

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    override fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
      cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention.let(RetentionDays::unwrap))
    }

    override fun enableFileValidation(enableFileValidation: Boolean) {
      cdkBuilder.enableFileValidation(enableFileValidation)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun includeGlobalServiceEvents(includeGlobalServiceEvents: Boolean) {
      cdkBuilder.includeGlobalServiceEvents(includeGlobalServiceEvents)
    }

    override fun insightTypes(insightTypes: List<InsightType>) {
      cdkBuilder.insightTypes(insightTypes.map(InsightType::unwrap))
    }

    override fun isMultiRegionTrail(isMultiRegionTrail: Boolean) {
      cdkBuilder.isMultiRegionTrail(isMultiRegionTrail)
    }

    override fun isOrganizationTrail(isOrganizationTrail: Boolean) {
      cdkBuilder.isOrganizationTrail(isOrganizationTrail)
    }

    override fun managementEvents(managementEvents: ReadWriteType) {
      cdkBuilder.managementEvents(managementEvents.let(ReadWriteType::unwrap))
    }

    override fun orgId(orgId: String) {
      cdkBuilder.orgId(orgId)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    override fun sendToCloudWatchLogs(sendToCloudWatchLogs: Boolean) {
      cdkBuilder.sendToCloudWatchLogs(sendToCloudWatchLogs)
    }

    override fun snsTopic(snsTopic: ITopic) {
      cdkBuilder.snsTopic(snsTopic.let(ITopic::unwrap))
    }

    override fun trailName(trailName: String) {
      cdkBuilder.trailName(trailName)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.Trail = cdkBuilder.build()
  }

  public companion object {
    public open fun onEvent(scope: CloudshiftdevConstructsConstruct, id: String): Rule =
        software.amazon.awscdk.services.cloudtrail.Trail.onEvent(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(Rule::wrap)

    public open fun onEvent(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: OnEventOptions,
    ): Rule =
        software.amazon.awscdk.services.cloudtrail.Trail.onEvent(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26c33828bad440bb6093f1c6eb92bb2fa047f5f02f6285543bf3c089a35c49d5")
    public open fun onEvent(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: OnEventOptions.Builder.() -> Unit,
    ): Rule = onEvent(scope, id, OnEventOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Trail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Trail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.Trail): Trail =
        Trail(cdkObject)

    internal fun unwrap(wrapped: Trail): software.amazon.awscdk.services.cloudtrail.Trail =
        wrapped.cdkObject
  }
}
