package io.cloudshiftdev.awscdk.services.s3

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

public open class CfnStorageLens internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrStorageLensConfigurationStorageLensArn(): String =
      unwrap(this).getAttrStorageLensConfigurationStorageLensArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun storageLensConfiguration(): Any = unwrap(this).getStorageLensConfiguration()

  public open fun storageLensConfiguration(`value`: IResolvable) {
    unwrap(this).setStorageLensConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun storageLensConfiguration(`value`: StorageLensConfigurationProperty) {
    unwrap(this).setStorageLensConfiguration(`value`.let(StorageLensConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af36521c63e87fc8f57727080acc348121bfed0249356bfe17b3ee745c672ce0")
  public open
      fun storageLensConfiguration(`value`: StorageLensConfigurationProperty.Builder.() -> Unit):
      Unit = storageLensConfiguration(StorageLensConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
    }

    public
        fun storageLensConfiguration(storageLensConfiguration: StorageLensConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("960366e56cfb52b7b29fd2fe98258961a06b76e64d2fd998fb4c2e2682a0338e")
    public
        fun storageLensConfiguration(storageLensConfiguration: StorageLensConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLens.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLens.Builder.create(scope, id)

    public override fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun storageLensConfiguration(storageLensConfiguration: StorageLensConfigurationProperty) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(StorageLensConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("960366e56cfb52b7b29fd2fe98258961a06b76e64d2fd998fb4c2e2682a0338e")
    public override
        fun storageLensConfiguration(storageLensConfiguration: StorageLensConfigurationProperty.Builder.() -> Unit):
        Unit = storageLensConfiguration(StorageLensConfigurationProperty(storageLensConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageLens {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageLens(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens): CfnStorageLens
        = CfnStorageLens(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLens): software.amazon.awscdk.services.s3.CfnStorageLens
        = wrapped.cdkObject
  }

  public interface SelectionCriteriaProperty {
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun maxDepth(): Number? = unwrap(this).getMaxDepth()

    public fun minStorageBytesPercentage(): Number? = unwrap(this).getMinStorageBytesPercentage()

    public interface Builder {
      public fun delimiter(delimiter: String) {
      }

      public fun maxDepth(maxDepth: Number) {
      }

      public fun minStorageBytesPercentage(minStorageBytesPercentage: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty.builder()

      public override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      public override fun maxDepth(maxDepth: Number) {
        cdkBuilder.maxDepth(maxDepth)
      }

      public override fun minStorageBytesPercentage(minStorageBytesPercentage: Number) {
        cdkBuilder.minStorageBytesPercentage(minStorageBytesPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty,
    ) : SelectionCriteriaProperty {
      public override fun delimiter(): String? = unwrap(this).getDelimiter()

      public override fun maxDepth(): Number? = unwrap(this).getMaxDepth()

      public override fun minStorageBytesPercentage(): Number? =
          unwrap(this).getMinStorageBytesPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SelectionCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty):
          SelectionCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelectionCriteriaProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BucketLevelProperty {
    public fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

    public fun advancedCostOptimizationMetrics(): Any? =
        unwrap(this).getAdvancedCostOptimizationMetrics()

    public fun advancedDataProtectionMetrics(): Any? =
        unwrap(this).getAdvancedDataProtectionMetrics()

    public fun detailedStatusCodesMetrics(): Any? = unwrap(this).getDetailedStatusCodesMetrics()

    public fun prefixLevel(): Any? = unwrap(this).getPrefixLevel()

    public interface Builder {
      public fun activityMetrics(activityMetrics: IResolvable) {
      }

      public fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe47765aadaaea41205a15bf3a06dbc19951c9ad9203f4a144e6f6c7d80b9f14")
      public fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit) {
      }

      public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
      }

      public
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80440846b1119c591429c7efdb10b1bc3cc2f6054f9781a4895937003bbf37c")
      public
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit) {
      }

      public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
      }

      public
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20e86db47d0fc896c602d9a348093d28716c0dd641fa66a8f6caa23fcc964f21")
      public
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty.Builder.() -> Unit) {
      }

      public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
      }

      public
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f53994ad2c2a46cb8ab31926fca9652e25fce1b2fb07336c4ac0b5193e28ea2")
      public
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit) {
      }

      public fun prefixLevel(prefixLevel: IResolvable) {
      }

      public fun prefixLevel(prefixLevel: PrefixLevelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98aa57ca324ca3366fb37329b78060f5a9aaf872aa86b82233a116215da6f19c")
      public fun prefixLevel(prefixLevel: PrefixLevelProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty.builder()

      public override fun activityMetrics(activityMetrics: IResolvable) {
        cdkBuilder.activityMetrics(activityMetrics.let(IResolvable::unwrap))
      }

      public override fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
        cdkBuilder.activityMetrics(activityMetrics.let(ActivityMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe47765aadaaea41205a15bf3a06dbc19951c9ad9203f4a144e6f6c7d80b9f14")
      public override
          fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit): Unit =
          activityMetrics(ActivityMetricsProperty(activityMetrics))

      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics.let(IResolvable::unwrap))
      }

      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics.let(AdvancedCostOptimizationMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80440846b1119c591429c7efdb10b1bc3cc2f6054f9781a4895937003bbf37c")
      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit):
          Unit =
          advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty(advancedCostOptimizationMetrics))

      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics.let(IResolvable::unwrap))
      }

      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics.let(AdvancedDataProtectionMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20e86db47d0fc896c602d9a348093d28716c0dd641fa66a8f6caa23fcc964f21")
      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty.Builder.() -> Unit):
          Unit =
          advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty(advancedDataProtectionMetrics))

      public override fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics.let(IResolvable::unwrap))
      }

      public override
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics.let(DetailedStatusCodesMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f53994ad2c2a46cb8ab31926fca9652e25fce1b2fb07336c4ac0b5193e28ea2")
      public override
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit):
          Unit =
          detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty(detailedStatusCodesMetrics))

      public override fun prefixLevel(prefixLevel: IResolvable) {
        cdkBuilder.prefixLevel(prefixLevel.let(IResolvable::unwrap))
      }

      public override fun prefixLevel(prefixLevel: PrefixLevelProperty) {
        cdkBuilder.prefixLevel(prefixLevel.let(PrefixLevelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98aa57ca324ca3366fb37329b78060f5a9aaf872aa86b82233a116215da6f19c")
      public override fun prefixLevel(prefixLevel: PrefixLevelProperty.Builder.() -> Unit): Unit =
          prefixLevel(PrefixLevelProperty(prefixLevel))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty,
    ) : BucketLevelProperty {
      public override fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

      public override fun advancedCostOptimizationMetrics(): Any? =
          unwrap(this).getAdvancedCostOptimizationMetrics()

      public override fun advancedDataProtectionMetrics(): Any? =
          unwrap(this).getAdvancedDataProtectionMetrics()

      public override fun detailedStatusCodesMetrics(): Any? =
          unwrap(this).getDetailedStatusCodesMetrics()

      public override fun prefixLevel(): Any? = unwrap(this).getPrefixLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BucketLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty):
          BucketLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketLevelProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketLevelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StorageLensGroupLevelProperty {
    public fun storageLensGroupSelectionCriteria(): Any? =
        unwrap(this).getStorageLensGroupSelectionCriteria()

    public interface Builder {
      public fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: IResolvable) {
      }

      public
          fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e83137ab128c7708bbd78104bb20f96d86b6b0a15ebd055f7b3c5eb356ca77b")
      public
          fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty.builder()

      public override
          fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: IResolvable) {
        cdkBuilder.storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria.let(IResolvable::unwrap))
      }

      public override
          fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty) {
        cdkBuilder.storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria.let(StorageLensGroupSelectionCriteriaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e83137ab128c7708bbd78104bb20f96d86b6b0a15ebd055f7b3c5eb356ca77b")
      public override
          fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: StorageLensGroupSelectionCriteriaProperty.Builder.() -> Unit):
          Unit =
          storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty(storageLensGroupSelectionCriteria))

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty,
    ) : StorageLensGroupLevelProperty {
      public override fun storageLensGroupSelectionCriteria(): Any? =
          unwrap(this).getStorageLensGroupSelectionCriteria()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLensGroupLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty):
          StorageLensGroupLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageLensGroupLevelProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupLevelProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AdvancedCostOptimizationMetricsProperty {
    public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty,
    ) : AdvancedCostOptimizationMetricsProperty {
      public override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedCostOptimizationMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty):
          AdvancedCostOptimizationMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedCostOptimizationMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedCostOptimizationMetricsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SSEKMSProperty {
    public fun keyId(): String

    public interface Builder {
      public fun keyId(keyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty.builder()

      public override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty,
    ) : SSEKMSProperty {
      public override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SSEKMSProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty):
          SSEKMSProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSEKMSProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.SSEKMSProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AdvancedDataProtectionMetricsProperty {
    public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty,
    ) : AdvancedDataProtectionMetricsProperty {
      public override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedDataProtectionMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty):
          AdvancedDataProtectionMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedDataProtectionMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.AdvancedDataProtectionMetricsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrefixLevelStorageMetricsProperty {
    public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    public fun selectionCriteria(): Any? = unwrap(this).getSelectionCriteria()

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }

      public fun selectionCriteria(selectionCriteria: IResolvable) {
      }

      public fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c8d88fa709aba8706e56b8e607183d0292254c2baef744b2fd6f14e96d6d8b")
      public
          fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public override fun selectionCriteria(selectionCriteria: IResolvable) {
        cdkBuilder.selectionCriteria(selectionCriteria.let(IResolvable::unwrap))
      }

      public override fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty) {
        cdkBuilder.selectionCriteria(selectionCriteria.let(SelectionCriteriaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c8d88fa709aba8706e56b8e607183d0292254c2baef744b2fd6f14e96d6d8b")
      public override
          fun selectionCriteria(selectionCriteria: SelectionCriteriaProperty.Builder.() -> Unit):
          Unit = selectionCriteria(SelectionCriteriaProperty(selectionCriteria))

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty,
    ) : PrefixLevelStorageMetricsProperty {
      public override fun isEnabled(): Any? = unwrap(this).getIsEnabled()

      public override fun selectionCriteria(): Any? = unwrap(this).getSelectionCriteria()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrefixLevelStorageMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty):
          PrefixLevelStorageMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrefixLevelStorageMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelStorageMetricsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrefixLevelProperty {
    public fun storageMetrics(): Any

    public interface Builder {
      public fun storageMetrics(storageMetrics: IResolvable) {
      }

      public fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b53e4593b4de08a727bbfc35d8c653d951035cfff8de33c89ba9366c5fcdbe2d")
      public
          fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty.builder()

      public override fun storageMetrics(storageMetrics: IResolvable) {
        cdkBuilder.storageMetrics(storageMetrics.let(IResolvable::unwrap))
      }

      public override fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty) {
        cdkBuilder.storageMetrics(storageMetrics.let(PrefixLevelStorageMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b53e4593b4de08a727bbfc35d8c653d951035cfff8de33c89ba9366c5fcdbe2d")
      public override
          fun storageMetrics(storageMetrics: PrefixLevelStorageMetricsProperty.Builder.() -> Unit):
          Unit = storageMetrics(PrefixLevelStorageMetricsProperty(storageMetrics))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty,
    ) : PrefixLevelProperty {
      public override fun storageMetrics(): Any = unwrap(this).getStorageMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrefixLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty):
          PrefixLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrefixLevelProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.PrefixLevelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ActivityMetricsProperty {
    public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty,
    ) : ActivityMetricsProperty {
      public override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActivityMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty):
          ActivityMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActivityMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.ActivityMetricsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StorageLensGroupSelectionCriteriaProperty {
    public fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    public fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()

    public interface Builder {
      public fun exclude(exclude: List<String>) {
      }

      public fun include(include: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty.builder()

      public override fun exclude(exclude: List<String>) {
        cdkBuilder.exclude(exclude)
      }

      public override fun include(include: List<String>) {
        cdkBuilder.include(include)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty,
    ) : StorageLensGroupSelectionCriteriaProperty {
      public override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

      public override fun include(): List<String> = unwrap(this).getInclude() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageLensGroupSelectionCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty):
          StorageLensGroupSelectionCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageLensGroupSelectionCriteriaProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensGroupSelectionCriteriaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BucketsAndRegionsProperty {
    public fun buckets(): List<String> = unwrap(this).getBuckets() ?: emptyList()

    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    public interface Builder {
      public fun buckets(buckets: List<String>) {
      }

      public fun regions(regions: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty.builder()

      public override fun buckets(buckets: List<String>) {
        cdkBuilder.buckets(buckets)
      }

      public override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty,
    ) : BucketsAndRegionsProperty {
      public override fun buckets(): List<String> = unwrap(this).getBuckets() ?: emptyList()

      public override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BucketsAndRegionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty):
          BucketsAndRegionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketsAndRegionsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccountLevelProperty {
    public fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

    public fun advancedCostOptimizationMetrics(): Any? =
        unwrap(this).getAdvancedCostOptimizationMetrics()

    public fun advancedDataProtectionMetrics(): Any? =
        unwrap(this).getAdvancedDataProtectionMetrics()

    public fun bucketLevel(): Any

    public fun detailedStatusCodesMetrics(): Any? = unwrap(this).getDetailedStatusCodesMetrics()

    public fun storageLensGroupLevel(): Any? = unwrap(this).getStorageLensGroupLevel()

    public interface Builder {
      public fun activityMetrics(activityMetrics: IResolvable) {
      }

      public fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c753da8c1499bab4608b76b75409143dfb6df167e20cbb4df62b339f757b81dd")
      public fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit) {
      }

      public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
      }

      public
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11082772bf9ec4343aa28ca772aead33719712918f194cf48855269228a3fa93")
      public
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit) {
      }

      public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
      }

      public
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6aa4a354f094e4899274f79dcd5f32ac802065a881b6196fa91b6984d5ca5ee")
      public
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty.Builder.() -> Unit) {
      }

      public fun bucketLevel(bucketLevel: IResolvable) {
      }

      public fun bucketLevel(bucketLevel: BucketLevelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637ed525a35ec747caf0fa5ed4fa1c294d734be664c6fc7489df2ae4313fabe9")
      public fun bucketLevel(bucketLevel: BucketLevelProperty.Builder.() -> Unit) {
      }

      public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
      }

      public
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1c9653a59e592134bf33dd01f74f580784fe169b9732ecf7e6222b1be5cc932")
      public
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit) {
      }

      public fun storageLensGroupLevel(storageLensGroupLevel: IResolvable) {
      }

      public fun storageLensGroupLevel(storageLensGroupLevel: StorageLensGroupLevelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab5bf1092f8ab38d9f93eb9a9428395c16003309590c45b6be670e290f91fcf3")
      public
          fun storageLensGroupLevel(storageLensGroupLevel: StorageLensGroupLevelProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty.builder()

      public override fun activityMetrics(activityMetrics: IResolvable) {
        cdkBuilder.activityMetrics(activityMetrics.let(IResolvable::unwrap))
      }

      public override fun activityMetrics(activityMetrics: ActivityMetricsProperty) {
        cdkBuilder.activityMetrics(activityMetrics.let(ActivityMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c753da8c1499bab4608b76b75409143dfb6df167e20cbb4df62b339f757b81dd")
      public override
          fun activityMetrics(activityMetrics: ActivityMetricsProperty.Builder.() -> Unit): Unit =
          activityMetrics(ActivityMetricsProperty(activityMetrics))

      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics.let(IResolvable::unwrap))
      }

      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics.let(AdvancedCostOptimizationMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11082772bf9ec4343aa28ca772aead33719712918f194cf48855269228a3fa93")
      public override
          fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: AdvancedCostOptimizationMetricsProperty.Builder.() -> Unit):
          Unit =
          advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty(advancedCostOptimizationMetrics))

      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics.let(IResolvable::unwrap))
      }

      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics.let(AdvancedDataProtectionMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6aa4a354f094e4899274f79dcd5f32ac802065a881b6196fa91b6984d5ca5ee")
      public override
          fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: AdvancedDataProtectionMetricsProperty.Builder.() -> Unit):
          Unit =
          advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty(advancedDataProtectionMetrics))

      public override fun bucketLevel(bucketLevel: IResolvable) {
        cdkBuilder.bucketLevel(bucketLevel.let(IResolvable::unwrap))
      }

      public override fun bucketLevel(bucketLevel: BucketLevelProperty) {
        cdkBuilder.bucketLevel(bucketLevel.let(BucketLevelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637ed525a35ec747caf0fa5ed4fa1c294d734be664c6fc7489df2ae4313fabe9")
      public override fun bucketLevel(bucketLevel: BucketLevelProperty.Builder.() -> Unit): Unit =
          bucketLevel(BucketLevelProperty(bucketLevel))

      public override fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics.let(IResolvable::unwrap))
      }

      public override
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics.let(DetailedStatusCodesMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1c9653a59e592134bf33dd01f74f580784fe169b9732ecf7e6222b1be5cc932")
      public override
          fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: DetailedStatusCodesMetricsProperty.Builder.() -> Unit):
          Unit =
          detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty(detailedStatusCodesMetrics))

      public override fun storageLensGroupLevel(storageLensGroupLevel: IResolvable) {
        cdkBuilder.storageLensGroupLevel(storageLensGroupLevel.let(IResolvable::unwrap))
      }

      public override
          fun storageLensGroupLevel(storageLensGroupLevel: StorageLensGroupLevelProperty) {
        cdkBuilder.storageLensGroupLevel(storageLensGroupLevel.let(StorageLensGroupLevelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab5bf1092f8ab38d9f93eb9a9428395c16003309590c45b6be670e290f91fcf3")
      public override
          fun storageLensGroupLevel(storageLensGroupLevel: StorageLensGroupLevelProperty.Builder.() -> Unit):
          Unit = storageLensGroupLevel(StorageLensGroupLevelProperty(storageLensGroupLevel))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty,
    ) : AccountLevelProperty {
      public override fun activityMetrics(): Any? = unwrap(this).getActivityMetrics()

      public override fun advancedCostOptimizationMetrics(): Any? =
          unwrap(this).getAdvancedCostOptimizationMetrics()

      public override fun advancedDataProtectionMetrics(): Any? =
          unwrap(this).getAdvancedDataProtectionMetrics()

      public override fun bucketLevel(): Any = unwrap(this).getBucketLevel()

      public override fun detailedStatusCodesMetrics(): Any? =
          unwrap(this).getDetailedStatusCodesMetrics()

      public override fun storageLensGroupLevel(): Any? = unwrap(this).getStorageLensGroupLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccountLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty):
          AccountLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountLevelProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.AccountLevelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchMetricsProperty {
    public fun isEnabled(): Any

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty,
    ) : CloudWatchMetricsProperty {
      public override fun isEnabled(): Any = unwrap(this).getIsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty):
          CloudWatchMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.CloudWatchMetricsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3BucketDestinationProperty {
    public fun accountId(): String

    public fun arn(): String

    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun format(): String

    public fun outputSchemaVersion(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun accountId(accountId: String) {
      }

      public fun arn(arn: String) {
      }

      public fun encryption(encryption: IResolvable) {
      }

      public fun encryption(encryption: EncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0945f4ea100f7f0afba60c5c581bee34da6fe72613e9874a8e38a558900a11e9")
      public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit) {
      }

      public fun format(format: String) {
      }

      public fun outputSchemaVersion(outputSchemaVersion: String) {
      }

      public fun prefix(prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty.builder()

      public override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      public override fun encryption(encryption: EncryptionProperty) {
        cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0945f4ea100f7f0afba60c5c581bee34da6fe72613e9874a8e38a558900a11e9")
      public override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
          encryption(EncryptionProperty(encryption))

      public override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public override fun outputSchemaVersion(outputSchemaVersion: String) {
        cdkBuilder.outputSchemaVersion(outputSchemaVersion)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty,
    ) : S3BucketDestinationProperty {
      public override fun accountId(): String = unwrap(this).getAccountId()

      public override fun arn(): String = unwrap(this).getArn()

      public override fun encryption(): Any? = unwrap(this).getEncryption()

      public override fun format(): String = unwrap(this).getFormat()

      public override fun outputSchemaVersion(): String = unwrap(this).getOutputSchemaVersion()

      public override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty):
          S3BucketDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketDestinationProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StorageLensConfigurationProperty {
    public fun accountLevel(): Any

    public fun awsOrg(): Any? = unwrap(this).getAwsOrg()

    public fun dataExport(): Any? = unwrap(this).getDataExport()

    public fun exclude(): Any? = unwrap(this).getExclude()

    public fun id(): String

    public fun include(): Any? = unwrap(this).getInclude()

    public fun isEnabled(): Any

    public fun storageLensArn(): String? = unwrap(this).getStorageLensArn()

    public interface Builder {
      public fun accountLevel(accountLevel: IResolvable) {
      }

      public fun accountLevel(accountLevel: AccountLevelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0807eb92fcdddb493fce3abc97addc932e6816cef49abc0b1a9f00458917c4e8")
      public fun accountLevel(accountLevel: AccountLevelProperty.Builder.() -> Unit) {
      }

      public fun awsOrg(awsOrg: IResolvable) {
      }

      public fun awsOrg(awsOrg: AwsOrgProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eaa0ff74f96182ad188b3f6540403d17699e5f24ec47e0c6ba10605f7b7ea0")
      public fun awsOrg(awsOrg: AwsOrgProperty.Builder.() -> Unit) {
      }

      public fun dataExport(dataExport: IResolvable) {
      }

      public fun dataExport(dataExport: DataExportProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06f80e4a5158e2a7840c0143dc26a9dbd649377a8dc4641dc86ba34d2148a103")
      public fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit) {
      }

      public fun exclude(exclude: IResolvable) {
      }

      public fun exclude(exclude: BucketsAndRegionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c8b157f5db4d745521ff3c4e29e1d96b53466eed813ef198f58795ad945b8f6")
      public fun exclude(exclude: BucketsAndRegionsProperty.Builder.() -> Unit) {
      }

      public fun id(id: String) {
      }

      public fun include(include: IResolvable) {
      }

      public fun include(include: BucketsAndRegionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db071429d2dfb561bf71302098586cbdfcc6b0e12bcac5ed7a809c4a46ccb122")
      public fun include(include: BucketsAndRegionsProperty.Builder.() -> Unit) {
      }

      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }

      public fun storageLensArn(storageLensArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty.builder()

      public override fun accountLevel(accountLevel: IResolvable) {
        cdkBuilder.accountLevel(accountLevel.let(IResolvable::unwrap))
      }

      public override fun accountLevel(accountLevel: AccountLevelProperty) {
        cdkBuilder.accountLevel(accountLevel.let(AccountLevelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0807eb92fcdddb493fce3abc97addc932e6816cef49abc0b1a9f00458917c4e8")
      public override fun accountLevel(accountLevel: AccountLevelProperty.Builder.() -> Unit): Unit
          = accountLevel(AccountLevelProperty(accountLevel))

      public override fun awsOrg(awsOrg: IResolvable) {
        cdkBuilder.awsOrg(awsOrg.let(IResolvable::unwrap))
      }

      public override fun awsOrg(awsOrg: AwsOrgProperty) {
        cdkBuilder.awsOrg(awsOrg.let(AwsOrgProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eaa0ff74f96182ad188b3f6540403d17699e5f24ec47e0c6ba10605f7b7ea0")
      public override fun awsOrg(awsOrg: AwsOrgProperty.Builder.() -> Unit): Unit =
          awsOrg(AwsOrgProperty(awsOrg))

      public override fun dataExport(dataExport: IResolvable) {
        cdkBuilder.dataExport(dataExport.let(IResolvable::unwrap))
      }

      public override fun dataExport(dataExport: DataExportProperty) {
        cdkBuilder.dataExport(dataExport.let(DataExportProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06f80e4a5158e2a7840c0143dc26a9dbd649377a8dc4641dc86ba34d2148a103")
      public override fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit): Unit =
          dataExport(DataExportProperty(dataExport))

      public override fun exclude(exclude: IResolvable) {
        cdkBuilder.exclude(exclude.let(IResolvable::unwrap))
      }

      public override fun exclude(exclude: BucketsAndRegionsProperty) {
        cdkBuilder.exclude(exclude.let(BucketsAndRegionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c8b157f5db4d745521ff3c4e29e1d96b53466eed813ef198f58795ad945b8f6")
      public override fun exclude(exclude: BucketsAndRegionsProperty.Builder.() -> Unit): Unit =
          exclude(BucketsAndRegionsProperty(exclude))

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun include(include: IResolvable) {
        cdkBuilder.include(include.let(IResolvable::unwrap))
      }

      public override fun include(include: BucketsAndRegionsProperty) {
        cdkBuilder.include(include.let(BucketsAndRegionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db071429d2dfb561bf71302098586cbdfcc6b0e12bcac5ed7a809c4a46ccb122")
      public override fun include(include: BucketsAndRegionsProperty.Builder.() -> Unit): Unit =
          include(BucketsAndRegionsProperty(include))

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public override fun storageLensArn(storageLensArn: String) {
        cdkBuilder.storageLensArn(storageLensArn)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty,
    ) : StorageLensConfigurationProperty {
      public override fun accountLevel(): Any = unwrap(this).getAccountLevel()

      public override fun awsOrg(): Any? = unwrap(this).getAwsOrg()

      public override fun dataExport(): Any? = unwrap(this).getDataExport()

      public override fun exclude(): Any? = unwrap(this).getExclude()

      public override fun id(): String = unwrap(this).getId()

      public override fun include(): Any? = unwrap(this).getInclude()

      public override fun isEnabled(): Any = unwrap(this).getIsEnabled()

      public override fun storageLensArn(): String? = unwrap(this).getStorageLensArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLensConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty):
          StorageLensConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageLensConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionProperty {
    public fun ssekms(): Any? = unwrap(this).getSsekms()

    public fun sses3(): Any? = unwrap(this).getSses3()

    public interface Builder {
      public fun ssekms(ssekms: IResolvable) {
      }

      public fun ssekms(ssekms: SSEKMSProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7b40a828125a6eee81f9b1e9d2bb02613804337fb7754b55771795ea8a863")
      public fun ssekms(ssekms: SSEKMSProperty.Builder.() -> Unit) {
      }

      public fun sses3(sses3: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty.builder()

      public override fun ssekms(ssekms: IResolvable) {
        cdkBuilder.ssekms(ssekms.let(IResolvable::unwrap))
      }

      public override fun ssekms(ssekms: SSEKMSProperty) {
        cdkBuilder.ssekms(ssekms.let(SSEKMSProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1f7b40a828125a6eee81f9b1e9d2bb02613804337fb7754b55771795ea8a863")
      public override fun ssekms(ssekms: SSEKMSProperty.Builder.() -> Unit): Unit =
          ssekms(SSEKMSProperty(ssekms))

      public override fun sses3(sses3: Any) {
        cdkBuilder.sses3(sses3)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty,
    ) : EncryptionProperty {
      public override fun ssekms(): Any? = unwrap(this).getSsekms()

      public override fun sses3(): Any? = unwrap(this).getSses3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.EncryptionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AwsOrgProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty,
    ) : AwsOrgProperty {
      public override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsOrgProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty):
          AwsOrgProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsOrgProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DetailedStatusCodesMetricsProperty {
    public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    public interface Builder {
      public fun isEnabled(isEnabled: Boolean) {
      }

      public fun isEnabled(isEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty.builder()

      public override fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
      }

      public override fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty,
    ) : DetailedStatusCodesMetricsProperty {
      public override fun isEnabled(): Any? = unwrap(this).getIsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DetailedStatusCodesMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty):
          DetailedStatusCodesMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DetailedStatusCodesMetricsProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.DetailedStatusCodesMetricsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataExportProperty {
    public fun cloudWatchMetrics(): Any? = unwrap(this).getCloudWatchMetrics()

    public fun s3BucketDestination(): Any? = unwrap(this).getS3BucketDestination()

    public interface Builder {
      public fun cloudWatchMetrics(cloudWatchMetrics: IResolvable) {
      }

      public fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("467a369691b5fe770301e5dbd21eec4ef8b36d60331c37c6bf16ddf66f927ec6")
      public
          fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty.Builder.() -> Unit) {
      }

      public fun s3BucketDestination(s3BucketDestination: IResolvable) {
      }

      public fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f029381afe0b426630e6f1402634bca1d91ecb86c94084967768609ec5aa9a")
      public
          fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty.Builder =
          software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty.builder()

      public override fun cloudWatchMetrics(cloudWatchMetrics: IResolvable) {
        cdkBuilder.cloudWatchMetrics(cloudWatchMetrics.let(IResolvable::unwrap))
      }

      public override fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty) {
        cdkBuilder.cloudWatchMetrics(cloudWatchMetrics.let(CloudWatchMetricsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("467a369691b5fe770301e5dbd21eec4ef8b36d60331c37c6bf16ddf66f927ec6")
      public override
          fun cloudWatchMetrics(cloudWatchMetrics: CloudWatchMetricsProperty.Builder.() -> Unit):
          Unit = cloudWatchMetrics(CloudWatchMetricsProperty(cloudWatchMetrics))

      public override fun s3BucketDestination(s3BucketDestination: IResolvable) {
        cdkBuilder.s3BucketDestination(s3BucketDestination.let(IResolvable::unwrap))
      }

      public override fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty) {
        cdkBuilder.s3BucketDestination(s3BucketDestination.let(S3BucketDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f029381afe0b426630e6f1402634bca1d91ecb86c94084967768609ec5aa9a")
      public override
          fun s3BucketDestination(s3BucketDestination: S3BucketDestinationProperty.Builder.() -> Unit):
          Unit = s3BucketDestination(S3BucketDestinationProperty(s3BucketDestination))

      public fun build(): software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty,
    ) : DataExportProperty {
      public override fun cloudWatchMetrics(): Any? = unwrap(this).getCloudWatchMetrics()

      public override fun s3BucketDestination(): Any? = unwrap(this).getS3BucketDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataExportProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty):
          DataExportProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataExportProperty):
          software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
