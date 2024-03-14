package io.cloudshiftdev.awscdk.services.internetmonitor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMonitor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun attrMonitorArn(): String = unwrap(this).getAttrMonitorArn()

  public open fun attrProcessingStatus(): String = unwrap(this).getAttrProcessingStatus()

  public open fun attrProcessingStatusInfo(): String = unwrap(this).getAttrProcessingStatusInfo()

  public open fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

  public open fun healthEventsConfig(`value`: IResolvable) {
    unwrap(this).setHealthEventsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty) {
    unwrap(this).setHealthEventsConfig(`value`.let(HealthEventsConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac37fd3ad16b9a64a08b44b4f8bc327af787af9733c8ce04e49b4f569e603904")
  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty.Builder.() -> Unit): Unit =
      healthEventsConfig(HealthEventsConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun internetMeasurementsLogDelivery(): Any? =
      unwrap(this).getInternetMeasurementsLogDelivery()

  public open fun internetMeasurementsLogDelivery(`value`: IResolvable) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(IResolvable::unwrap))
  }

  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(InternetMeasurementsLogDeliveryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3728d57b5a81cc142b977d9c1fabe327859a9d47dbb2864ae42e1f477331df9")
  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
      Unit = internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(`value`))

  public open fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

  public open fun maxCityNetworksToMonitor(`value`: Number) {
    unwrap(this).setMaxCityNetworksToMonitor(`value`)
  }

  public open fun monitorName(): String = unwrap(this).getMonitorName()

  public open fun monitorName(`value`: String) {
    unwrap(this).setMonitorName(`value`)
  }

  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  public open fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

  public open fun resourcesToAdd(`value`: List<String>) {
    unwrap(this).setResourcesToAdd(`value`)
  }

  public open fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?:
      emptyList()

  public open fun resourcesToRemove(`value`: List<String>) {
    unwrap(this).setResourcesToRemove(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun trafficPercentageToMonitor(): Number? =
      unwrap(this).getTrafficPercentageToMonitor()

  public open fun trafficPercentageToMonitor(`value`: Number) {
    unwrap(this).setTrafficPercentageToMonitor(`value`)
  }

  public interface Builder {
    public fun healthEventsConfig(healthEventsConfig: IResolvable) {
    }

    public fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    public
        fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit) {
    }

    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
    }

    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit) {
    }

    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
    }

    public fun monitorName(monitorName: String) {
    }

    public fun resources(resources: List<String>) {
    }

    public fun resourcesToAdd(resourcesToAdd: List<String>) {
    }

    public fun resourcesToRemove(resourcesToRemove: List<String>) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder =
        software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder.create(scope, id)

    public override fun healthEventsConfig(healthEventsConfig: IResolvable) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(IResolvable::unwrap))
    }

    public override fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(HealthEventsConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    public override
        fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit):
        Unit = healthEventsConfig(HealthEventsConfigProperty(healthEventsConfig))

    public override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(IResolvable::unwrap))
    }

    public override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(InternetMeasurementsLogDeliveryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    public override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
        Unit =
        internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(internetMeasurementsLogDelivery))

    public override fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
      cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    public override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    public override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    public override fun resourcesToAdd(resourcesToAdd: List<String>) {
      cdkBuilder.resourcesToAdd(resourcesToAdd)
    }

    public override fun resourcesToRemove(resourcesToRemove: List<String>) {
      cdkBuilder.resourcesToRemove(resourcesToRemove)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
      cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): software.amazon.awscdk.services.internetmonitor.CfnMonitor =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor):
        CfnMonitor = CfnMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnMonitor):
        software.amazon.awscdk.services.internetmonitor.CfnMonitor = wrapped.cdkObject
  }

  public interface InternetMeasurementsLogDeliveryProperty {
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    public interface Builder {
      public fun s3Config(s3Config: IResolvable) {
      }

      public fun s3Config(s3Config: S3ConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

      public override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
      }

      public override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      public override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty,
    ) : InternetMeasurementsLogDeliveryProperty {
      public override fun s3Config(): Any? = unwrap(this).getS3Config()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternetMeasurementsLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty):
          InternetMeasurementsLogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternetMeasurementsLogDeliveryProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HealthEventsConfigProperty {
    public fun availabilityLocalHealthEventsConfig(): Any? =
        unwrap(this).getAvailabilityLocalHealthEventsConfig()

    public fun availabilityScoreThreshold(): Number? = unwrap(this).getAvailabilityScoreThreshold()

    public fun performanceLocalHealthEventsConfig(): Any? =
        unwrap(this).getPerformanceLocalHealthEventsConfig()

    public fun performanceScoreThreshold(): Number? = unwrap(this).getPerformanceScoreThreshold()

    public interface Builder {
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable) {
      }

      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit) {
      }

      public fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
      }

      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable) {
      }

      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit) {
      }

      public fun performanceScoreThreshold(performanceScoreThreshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.builder()

      public override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      public override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      public override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty(availabilityLocalHealthEventsConfig))

      public override fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
      }

      public override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      public override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      public override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty(performanceLocalHealthEventsConfig))

      public override fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty,
    ) : HealthEventsConfigProperty {
      public override fun availabilityLocalHealthEventsConfig(): Any? =
          unwrap(this).getAvailabilityLocalHealthEventsConfig()

      public override fun availabilityScoreThreshold(): Number? =
          unwrap(this).getAvailabilityScoreThreshold()

      public override fun performanceLocalHealthEventsConfig(): Any? =
          unwrap(this).getPerformanceLocalHealthEventsConfig()

      public override fun performanceScoreThreshold(): Number? =
          unwrap(this).getPerformanceScoreThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty):
          HealthEventsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LocalHealthEventsConfigProperty {
    public fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

    public fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun healthScoreThreshold(healthScoreThreshold: Number) {
      }

      public fun minTrafficImpact(minTrafficImpact: Number) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.builder()

      public override fun healthScoreThreshold(healthScoreThreshold: Number) {
        cdkBuilder.healthScoreThreshold(healthScoreThreshold)
      }

      public override fun minTrafficImpact(minTrafficImpact: Number) {
        cdkBuilder.minTrafficImpact(minTrafficImpact)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty,
    ) : LocalHealthEventsConfigProperty {
      public override fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

      public override fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

      public override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocalHealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty):
          LocalHealthEventsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalHealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun logDeliveryStatus(logDeliveryStatus: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty,
    ) : S3ConfigProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
