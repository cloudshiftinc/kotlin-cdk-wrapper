package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  public open fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

  public open fun attributeDefinitions(`value`: IResolvable) {
    unwrap(this).setAttributeDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun attributeDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttributeDefinitions(__idx_ac66f0)
  }

  public open fun attributeDefinitions(vararg __idx_ac66f0: Any): Unit =
      attributeDefinitions(__idx_ac66f0.toList())

  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  public open fun contributorInsightsSpecification(): Any? =
      unwrap(this).getContributorInsightsSpecification()

  public open fun contributorInsightsSpecification(`value`: IResolvable) {
    unwrap(this).setContributorInsightsSpecification(`value`.let(IResolvable::unwrap))
  }

  public open
      fun contributorInsightsSpecification(`value`: ContributorInsightsSpecificationProperty) {
    unwrap(this).setContributorInsightsSpecification(`value`.let(ContributorInsightsSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77beaec09fac479cad9e8894bb89ec8c1db94a8821b6c6f2af2a2345d6ddfb24")
  public open
      fun contributorInsightsSpecification(`value`: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
      Unit = contributorInsightsSpecification(ContributorInsightsSpecificationProperty(`value`))

  public open fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  public open fun deletionProtectionEnabled(`value`: Boolean) {
    unwrap(this).setDeletionProtectionEnabled(`value`)
  }

  public open fun deletionProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setDeletionProtectionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  public open fun globalSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setGlobalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  public open fun globalSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setGlobalSecondaryIndexes(__idx_ac66f0)
  }

  public open fun globalSecondaryIndexes(vararg __idx_ac66f0: Any): Unit =
      globalSecondaryIndexes(__idx_ac66f0.toList())

  public open fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

  public open fun importSourceSpecification(`value`: IResolvable) {
    unwrap(this).setImportSourceSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun importSourceSpecification(`value`: ImportSourceSpecificationProperty) {
    unwrap(this).setImportSourceSpecification(`value`.let(ImportSourceSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("884ed0605874e87b65400a7af7d40744c9719400be4c548fcd07b2bd0d39cfa5")
  public open
      fun importSourceSpecification(`value`: ImportSourceSpecificationProperty.Builder.() -> Unit):
      Unit = importSourceSpecification(ImportSourceSpecificationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keySchema(): Any = unwrap(this).getKeySchema()

  public open fun keySchema(`value`: IResolvable) {
    unwrap(this).setKeySchema(`value`.let(IResolvable::unwrap))
  }

  public open fun keySchema(__idx_ac66f0: List<Any>) {
    unwrap(this).setKeySchema(__idx_ac66f0)
  }

  public open fun keySchema(vararg __idx_ac66f0: Any): Unit = keySchema(__idx_ac66f0.toList())

  public open fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

  public open fun kinesisStreamSpecification(`value`: IResolvable) {
    unwrap(this).setKinesisStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisStreamSpecification(`value`: KinesisStreamSpecificationProperty) {
    unwrap(this).setKinesisStreamSpecification(`value`.let(KinesisStreamSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67f3055a35d99211eb661364b036467d89570de32d09668f4c1518a0be43b4d2")
  public open
      fun kinesisStreamSpecification(`value`: KinesisStreamSpecificationProperty.Builder.() -> Unit):
      Unit = kinesisStreamSpecification(KinesisStreamSpecificationProperty(`value`))

  public open fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  public open fun localSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setLocalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  public open fun localSecondaryIndexes(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocalSecondaryIndexes(__idx_ac66f0)
  }

  public open fun localSecondaryIndexes(vararg __idx_ac66f0: Any): Unit =
      localSecondaryIndexes(__idx_ac66f0.toList())

  public open fun pointInTimeRecoverySpecification(): Any? =
      unwrap(this).getPointInTimeRecoverySpecification()

  public open fun pointInTimeRecoverySpecification(`value`: IResolvable) {
    unwrap(this).setPointInTimeRecoverySpecification(`value`.let(IResolvable::unwrap))
  }

  public open
      fun pointInTimeRecoverySpecification(`value`: PointInTimeRecoverySpecificationProperty) {
    unwrap(this).setPointInTimeRecoverySpecification(`value`.let(PointInTimeRecoverySpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51a9e0b9428e8e61e7f17743e285631f199b57aac952134c394864c81b4491ca")
  public open
      fun pointInTimeRecoverySpecification(`value`: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
      Unit = pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(`value`))

  public open fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  public open fun provisionedThroughput(`value`: IResolvable) {
    unwrap(this).setProvisionedThroughput(`value`.let(IResolvable::unwrap))
  }

  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty) {
    unwrap(this).setProvisionedThroughput(`value`.let(ProvisionedThroughputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f76359fdd2cc9391562c12c627346dd5b270f1716c442655ba4259cf6377dcd5")
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty.Builder.() -> Unit):
      Unit = provisionedThroughput(ProvisionedThroughputProperty(`value`))

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0736ca2fbc2ff4f8c1593cda995d79147be04c9842f05b699b140baf61e13e1")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  public open fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  public open fun streamSpecification(`value`: IResolvable) {
    unwrap(this).setStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun streamSpecification(`value`: StreamSpecificationProperty) {
    unwrap(this).setStreamSpecification(`value`.let(StreamSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3351e6c1ff22506ab5a6bd06873964f946aaf4c06d21308861bb80a550df3c8c")
  public open fun streamSpecification(`value`: StreamSpecificationProperty.Builder.() -> Unit): Unit
      = streamSpecification(StreamSpecificationProperty(`value`))

  public open fun tableClass(): String? = unwrap(this).getTableClass()

  public open fun tableClass(`value`: String) {
    unwrap(this).setTableClass(`value`)
  }

  public open fun tableName(): String? = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  public open fun timeToLiveSpecification(`value`: IResolvable) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(TimeToLiveSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("943fa5e7184ee285ced77265fc818927acac317769e30c18837b25103d18ae79")
  public open
      fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty.Builder.() -> Unit): Unit
      = timeToLiveSpecification(TimeToLiveSpecificationProperty(`value`))

  public interface Builder {
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    public fun billingMode(billingMode: String)

    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6b0005fd6dda990da56422cb152b0eb236be848bd7d4e3c82aee5268f97b8b")
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    public fun importSourceSpecification(importSourceSpecification: IResolvable)

    public
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7642cd516d9ff1a9255c21eb0837bc31f5a39045d847d7ce3d17a9c10a93b988")
    public
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty.Builder.() -> Unit)

    public fun keySchema(keySchema: IResolvable)

    public fun keySchema(keySchema: List<Any>)

    public fun keySchema(vararg keySchema: Any)

    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e3070174596433409b29ee0d4f850f9f23013a50963b7ae8954db93c5709c")
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit)

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9d3b3f1cfdd30b35983e8595334380b221841bf19737c9b2c6743908651417")
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2af10868690ca846d0ef0b377adf5d30a2d1e276444f5ccc298395c8896292d8")
    public
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f25f660b107112377a3e4d81825a2bdd36c3cc8c272a6ee97340560ec4a5e61a")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    public fun streamSpecification(streamSpecification: IResolvable)

    public fun streamSpecification(streamSpecification: StreamSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c7f3227b4f41970244541632a7379086be8371e45664633a3b433c81badf83")
    public
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit)

    public fun tableClass(tableClass: String)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    public fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40800600d9946bf6a3b0916179f54c5a80b8ebcfda7b6263fda607a3883cb87")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTable.Builder =
        software.amazon.awscdk.services.dynamodb.CfnTable.Builder.create(scope, id)

    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
    }

    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6b0005fd6dda990da56422cb152b0eb236be848bd7d4e3c82aee5268f97b8b")
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
        Unit =
        contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

    override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable::unwrap))
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

    override fun importSourceSpecification(importSourceSpecification: IResolvable) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(IResolvable::unwrap))
    }

    override
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(ImportSourceSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7642cd516d9ff1a9255c21eb0837bc31f5a39045d847d7ce3d17a9c10a93b988")
    override
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty.Builder.() -> Unit):
        Unit =
        importSourceSpecification(ImportSourceSpecificationProperty(importSourceSpecification))

    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema)
    }

    override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

    override fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(IResolvable::unwrap))
    }

    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(KinesisStreamSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e3070174596433409b29ee0d4f850f9f23013a50963b7ae8954db93c5709c")
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSpecification(KinesisStreamSpecificationProperty(kinesisStreamSpecification))

    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    override fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(IResolvable::unwrap))
    }

    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(PointInTimeRecoverySpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9d3b3f1cfdd30b35983e8595334380b221841bf19737c9b2c6743908651417")
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
        Unit =
        pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2af10868690ca846d0ef0b377adf5d30a2d1e276444f5ccc298395c8896292d8")
    override
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f25f660b107112377a3e4d81825a2bdd36c3cc8c272a6ee97340560ec4a5e61a")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    override fun streamSpecification(streamSpecification: StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(StreamSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c7f3227b4f41970244541632a7379086be8371e45664633a3b433c81badf83")
    override
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(StreamSpecificationProperty(streamSpecification))

    override fun tableClass(tableClass: String) {
      cdkBuilder.tableClass(tableClass)
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

    override fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(TimeToLiveSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40800600d9946bf6a3b0916179f54c5a80b8ebcfda7b6263fda607a3883cb87")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit = timeToLiveSpecification(TimeToLiveSpecificationProperty(timeToLiveSpecification))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.dynamodb.CfnTable =
        wrapped.cdkObject
  }

  public interface AttributeDefinitionProperty {
    public fun attributeName(): String

    public fun attributeType(): String

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty,
    ) : AttributeDefinitionProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun attributeType(): String = unwrap(this).getAttributeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty):
          AttributeDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDefinitionProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeySchemaProperty {
    public fun attributeName(): String

    public fun keyType(): String

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty,
    ) : KeySchemaProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeySchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty):
          KeySchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySchemaProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ContributorInsightsSpecificationProperty {
    public fun enabled(): Any

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty,
    ) : ContributorInsightsSpecificationProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContributorInsightsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty):
          ContributorInsightsSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContributorInsightsSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SSESpecificationProperty {
    public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    public fun sseEnabled(): Any

    public fun sseType(): String? = unwrap(this).getSseType()

    public interface Builder {
      public fun kmsMasterKeyId(kmsMasterKeyId: String)

      public fun sseEnabled(sseEnabled: Boolean)

      public fun sseEnabled(sseEnabled: IResolvable)

      public fun sseType(sseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.builder()

      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      override fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty,
    ) : SSESpecificationProperty {
      override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

      override fun sseEnabled(): Any = unwrap(this).getSseEnabled()

      override fun sseType(): String? = unwrap(this).getSseType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty):
          SSESpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CsvProperty {
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

    public interface Builder {
      public fun delimiter(delimiter: String)

      public fun headerList(headerList: List<String>)

      public fun headerList(vararg headerList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty.Builder
          = software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty.builder()

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun headerList(headerList: List<String>) {
        cdkBuilder.headerList(headerList)
      }

      override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty,
    ) : CsvProperty {
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LocalSecondaryIndexProperty {
    public fun indexName(): String

    public fun keySchema(): Any

    public fun projection(): Any

    public interface Builder {
      public fun indexName(indexName: String)

      public fun keySchema(keySchema: IResolvable)

      public fun keySchema(keySchema: List<Any>)

      public fun keySchema(vararg keySchema: Any)

      public fun projection(projection: IResolvable)

      public fun projection(projection: ProjectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b85a812f7623bfeeb38995e51a834bd28e7c73b3a1102f3a8e803dd165a2872")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.builder()

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b85a812f7623bfeeb38995e51a834bd28e7c73b3a1102f3a8e803dd165a2872")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty,
    ) : LocalSecondaryIndexProperty {
      override fun indexName(): String = unwrap(this).getIndexName()

      override fun keySchema(): Any = unwrap(this).getKeySchema()

      override fun projection(): Any = unwrap(this).getProjection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty):
          LocalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ImportSourceSpecificationProperty {
    public fun inputCompressionType(): String? = unwrap(this).getInputCompressionType()

    public fun inputFormat(): String

    public fun inputFormatOptions(): Any? = unwrap(this).getInputFormatOptions()

    public fun s3BucketSource(): Any

    public interface Builder {
      public fun inputCompressionType(inputCompressionType: String)

      public fun inputFormat(inputFormat: String)

      public fun inputFormatOptions(inputFormatOptions: IResolvable)

      public fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecc38bd30337caf76434b9f40f26e805f90d4539959d977a544930de7283d782")
      public
          fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty.Builder.() -> Unit)

      public fun s3BucketSource(s3BucketSource: IResolvable)

      public fun s3BucketSource(s3BucketSource: S3BucketSourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94d435bd52f7706069f0d2179a5912e53195e97d44c42e855d5b7cd8f690bc1")
      public fun s3BucketSource(s3BucketSource: S3BucketSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty.builder()

      override fun inputCompressionType(inputCompressionType: String) {
        cdkBuilder.inputCompressionType(inputCompressionType)
      }

      override fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
      }

      override fun inputFormatOptions(inputFormatOptions: IResolvable) {
        cdkBuilder.inputFormatOptions(inputFormatOptions.let(IResolvable::unwrap))
      }

      override fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty) {
        cdkBuilder.inputFormatOptions(inputFormatOptions.let(InputFormatOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecc38bd30337caf76434b9f40f26e805f90d4539959d977a544930de7283d782")
      override
          fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty.Builder.() -> Unit):
          Unit = inputFormatOptions(InputFormatOptionsProperty(inputFormatOptions))

      override fun s3BucketSource(s3BucketSource: IResolvable) {
        cdkBuilder.s3BucketSource(s3BucketSource.let(IResolvable::unwrap))
      }

      override fun s3BucketSource(s3BucketSource: S3BucketSourceProperty) {
        cdkBuilder.s3BucketSource(s3BucketSource.let(S3BucketSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94d435bd52f7706069f0d2179a5912e53195e97d44c42e855d5b7cd8f690bc1")
      override fun s3BucketSource(s3BucketSource: S3BucketSourceProperty.Builder.() -> Unit): Unit =
          s3BucketSource(S3BucketSourceProperty(s3BucketSource))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty,
    ) : ImportSourceSpecificationProperty {
      override fun inputCompressionType(): String? = unwrap(this).getInputCompressionType()

      override fun inputFormat(): String = unwrap(this).getInputFormat()

      override fun inputFormatOptions(): Any? = unwrap(this).getInputFormatOptions()

      override fun s3BucketSource(): Any = unwrap(this).getS3BucketSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImportSourceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty):
          ImportSourceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImportSourceSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProjectionProperty {
    public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

    public fun projectionType(): String? = unwrap(this).getProjectionType()

    public interface Builder {
      public fun nonKeyAttributes(nonKeyAttributes: List<String>)

      public fun nonKeyAttributes(vararg nonKeyAttributes: String)

      public fun projectionType(projectionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.builder()

      override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
        cdkBuilder.nonKeyAttributes(nonKeyAttributes)
      }

      override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
          nonKeyAttributes(nonKeyAttributes.toList())

      override fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty,
    ) : ProjectionProperty {
      override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
          emptyList()

      override fun projectionType(): String? = unwrap(this).getProjectionType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty):
          ProjectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectionProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KinesisStreamSpecificationProperty {
    public fun approximateCreationDateTimePrecision(): String? =
        unwrap(this).getApproximateCreationDateTimePrecision()

    public fun streamArn(): String

    public interface Builder {
      public fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String)

      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.builder()

      override
          fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String) {
        cdkBuilder.approximateCreationDateTimePrecision(approximateCreationDateTimePrecision)
      }

      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty,
    ) : KinesisStreamSpecificationProperty {
      override fun approximateCreationDateTimePrecision(): String? =
          unwrap(this).getApproximateCreationDateTimePrecision()

      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty):
          KinesisStreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StreamSpecificationProperty {
    public fun streamViewType(): String

    public interface Builder {
      public fun streamViewType(streamViewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.builder()

      override fun streamViewType(streamViewType: String) {
        cdkBuilder.streamViewType(streamViewType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty,
    ) : StreamSpecificationProperty {
      override fun streamViewType(): String = unwrap(this).getStreamViewType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty):
          StreamSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputFormatOptionsProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4c5457956849bb4ae15c4c0406bea8f935360000062eb45e0c1cbcb96dd98f5")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4c5457956849bb4ae15c4c0406bea8f935360000062eb45e0c1cbcb96dd98f5")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty,
    ) : InputFormatOptionsProperty {
      override fun csv(): Any? = unwrap(this).getCsv()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty):
          InputFormatOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFormatOptionsProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PointInTimeRecoverySpecificationProperty {
    public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    public interface Builder {
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.builder()

      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
      }

      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty,
    ) : PointInTimeRecoverySpecificationProperty {
      override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PointInTimeRecoverySpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty):
          PointInTimeRecoverySpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PointInTimeRecoverySpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeToLiveSpecificationProperty {
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    public fun enabled(): Any

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty,
    ) : TimeToLiveSpecificationProperty {
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeToLiveSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty):
          TimeToLiveSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeToLiveSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProvisionedThroughputProperty {
    public fun readCapacityUnits(): Number

    public fun writeCapacityUnits(): Number

    public interface Builder {
      public fun readCapacityUnits(readCapacityUnits: Number)

      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.builder()

      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty,
    ) : ProvisionedThroughputProperty {
      override fun readCapacityUnits(): Number = unwrap(this).getReadCapacityUnits()

      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GlobalSecondaryIndexProperty {
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    public fun indexName(): String

    public fun keySchema(): Any

    public fun projection(): Any

    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    public interface Builder {
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96aaf0e53afdf2008e3bab5ed0472ff865f8718a9f091086a3c7d06569c838e5")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      public fun indexName(indexName: String)

      public fun keySchema(keySchema: IResolvable)

      public fun keySchema(keySchema: List<Any>)

      public fun keySchema(vararg keySchema: Any)

      public fun projection(projection: IResolvable)

      public fun projection(projection: ProjectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a320a0d74803ebff018f88b81b33b1d49b807f9a0d83ae90e432deb42f1221d")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)

      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c7b56ca1f0d8c0ead31155d94c0a7ac4c420ab8569c28acb313b53298c9d4a4")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.builder()

      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96aaf0e53afdf2008e3bab5ed0472ff865f8718a9f091086a3c7d06569c838e5")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a320a0d74803ebff018f88b81b33b1d49b807f9a0d83ae90e432deb42f1221d")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
      }

      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c7b56ca1f0d8c0ead31155d94c0a7ac4c420ab8569c28acb313b53298c9d4a4")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty,
    ) : GlobalSecondaryIndexProperty {
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      override fun indexName(): String = unwrap(this).getIndexName()

      override fun keySchema(): Any = unwrap(this).getKeySchema()

      override fun projection(): Any = unwrap(this).getProjection()

      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty):
          GlobalSecondaryIndexProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface S3BucketSourceProperty {
    public fun s3Bucket(): String

    public fun s3BucketOwner(): String? = unwrap(this).getS3BucketOwner()

    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3BucketOwner(s3BucketOwner: String)

      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3BucketOwner(s3BucketOwner: String) {
        cdkBuilder.s3BucketOwner(s3BucketOwner)
      }

      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty,
    ) : S3BucketSourceProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3BucketOwner(): String? = unwrap(this).getS3BucketOwner()

      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty):
          S3BucketSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketSourceProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
