@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTableProps {
  public fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

  public fun billingMode(): String? = unwrap(this).getBillingMode()

  public fun contributorInsightsSpecification(): Any? =
      unwrap(this).getContributorInsightsSpecification()

  public fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  public fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

  public fun keySchema(): Any

  public fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

  public fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  public fun pointInTimeRecoverySpecification(): Any? =
      unwrap(this).getPointInTimeRecoverySpecification()

  public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  public fun tableClass(): String? = unwrap(this).getTableClass()

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  @CdkDslMarker
  public interface Builder {
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    public fun billingMode(billingMode: String)

    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1644175a1c61b50768b3c763c697b7e8547a4ca008ed780d5a622061281063d")
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty.Builder.() -> Unit)

    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    public fun importSourceSpecification(importSourceSpecification: IResolvable)

    public
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcfa4b8b3fb01671f8a472422d5bd789be1593d7487e0f98b1d617e0645a214e")
    public
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty.Builder.() -> Unit)

    public fun keySchema(keySchema: IResolvable)

    public fun keySchema(keySchema: List<Any>)

    public fun keySchema(vararg keySchema: Any)

    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5545f2eff26e32d19027ab689ca7eaf9191a4441f9db3ea3cb083a8c2f56d")
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit)

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2250375551145bd7288d51c1502890121e3bcf6df7830522d1458980b0ebe40")
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    public fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9a9a02708658c9ae241699a945ae841cd09bf4fe303863b1431bdcfc7edcf5c")
    public
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a481891b9640fd468b95afe711468471315e15742dd89b43ecfd37efbf8554")
    public
        fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty.Builder.() -> Unit)

    public fun streamSpecification(streamSpecification: IResolvable)

    public fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d2f865f7c33aa163d77d7474b75c0a467e6d3e662eef7765229b5c6e8d8951")
    public
        fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty.Builder.() -> Unit)

    public fun tableClass(tableClass: String)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("538d06314b2d8f6c9f1ad9a4139ade75fa91cbf0137fb6283ebc5f4aabeae1d6")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.CfnTableProps.builder()

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
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(CfnTable.ContributorInsightsSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1644175a1c61b50768b3c763c697b7e8547a4ca008ed780d5a622061281063d")
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty.Builder.() -> Unit):
        Unit =
        contributorInsightsSpecification(CfnTable.ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

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
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(CfnTable.ImportSourceSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcfa4b8b3fb01671f8a472422d5bd789be1593d7487e0f98b1d617e0645a214e")
    override
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty.Builder.() -> Unit):
        Unit =
        importSourceSpecification(CfnTable.ImportSourceSpecificationProperty(importSourceSpecification))

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
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(CfnTable.KinesisStreamSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5545f2eff26e32d19027ab689ca7eaf9191a4441f9db3ea3cb083a8c2f56d")
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSpecification(CfnTable.KinesisStreamSpecificationProperty(kinesisStreamSpecification))

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
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(CfnTable.PointInTimeRecoverySpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2250375551145bd7288d51c1502890121e3bcf6df7830522d1458980b0ebe40")
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
        Unit =
        pointInTimeRecoverySpecification(CfnTable.PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

    override
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(CfnTable.ProvisionedThroughputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9a9a02708658c9ae241699a945ae841cd09bf4fe303863b1431bdcfc7edcf5c")
    override
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(CfnTable.ProvisionedThroughputProperty(provisionedThroughput))

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnTable.SSESpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a481891b9640fd468b95afe711468471315e15742dd89b43ecfd37efbf8554")
    override
        fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnTable.SSESpecificationProperty(sseSpecification))

    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    override fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(CfnTable.StreamSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d2f865f7c33aa163d77d7474b75c0a467e6d3e662eef7765229b5c6e8d8951")
    override
        fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(CfnTable.StreamSpecificationProperty(streamSpecification))

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

    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(CfnTable.TimeToLiveSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("538d06314b2d8f6c9f1ad9a4139ade75fa91cbf0137fb6283ebc5f4aabeae1d6")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit =
        timeToLiveSpecification(CfnTable.TimeToLiveSpecificationProperty(timeToLiveSpecification))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    override fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

    override fun billingMode(): String? = unwrap(this).getBillingMode()

    override fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    override fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

    override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    override fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

    override fun keySchema(): Any = unwrap(this).getKeySchema()

    override fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

    override fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

    override fun pointInTimeRecoverySpecification(): Any? =
        unwrap(this).getPointInTimeRecoverySpecification()

    override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    override fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

    override fun tableClass(): String? = unwrap(this).getTableClass()

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTableProps):
        CfnTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.dynamodb.CfnTableProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.CfnTableProps
  }
}
