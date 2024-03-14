package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetector internal constructor(
  private val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSources(`value`: CFNDataSourceConfigurationsProperty) {
    unwrap(this).setDataSources(`value`.let(CFNDataSourceConfigurationsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be9e86ad5386be027b3227e094662ddd4d1acbfa1767cd75833e0f2379799b35")
  public open fun dataSources(`value`: CFNDataSourceConfigurationsProperty.Builder.() -> Unit): Unit
      = dataSources(CFNDataSourceConfigurationsProperty(`value`))

  public open fun enable(): Any = unwrap(this).getEnable()

  public open fun enable(`value`: Boolean) {
    unwrap(this).setEnable(`value`)
  }

  public open fun enable(`value`: IResolvable) {
    unwrap(this).setEnable(`value`.let(IResolvable::unwrap))
  }

  public open fun features(): Any? = unwrap(this).getFeatures()

  public open fun features(`value`: IResolvable) {
    unwrap(this).setFeatures(`value`.let(IResolvable::unwrap))
  }

  public open fun features(__idx_ac66f0: List<Any>) {
    unwrap(this).setFeatures(__idx_ac66f0)
  }

  public open fun findingPublishingFrequency(): String? =
      unwrap(this).getFindingPublishingFrequency()

  public open fun findingPublishingFrequency(`value`: String) {
    unwrap(this).setFindingPublishingFrequency(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagItemProperty> =
      unwrap(this).getTagsRaw()?.map(TagItemProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagItemProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagItemProperty::unwrap))
  }

  public interface Builder {
    public fun dataSources(dataSources: IResolvable) {
    }

    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit) {
    }

    public fun enable(enable: Boolean) {
    }

    public fun enable(enable: IResolvable) {
    }

    public fun features(features: IResolvable) {
    }

    public fun features(features: List<Any>) {
    }

    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
    }

    public fun tags(tags: List<TagItemProperty>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnDetector.Builder =
        software.amazon.awscdk.services.guardduty.CfnDetector.Builder.create(scope, id)

    public override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    public override fun dataSources(dataSources: CFNDataSourceConfigurationsProperty) {
      cdkBuilder.dataSources(dataSources.let(CFNDataSourceConfigurationsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    public override
        fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit): Unit =
        dataSources(CFNDataSourceConfigurationsProperty(dataSources))

    public override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    public override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    public override fun features(features: IResolvable) {
      cdkBuilder.features(features.let(IResolvable::unwrap))
    }

    public override fun features(features: List<Any>) {
      cdkBuilder.features(features)
    }

    public override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    public override fun tags(tags: List<TagItemProperty>) {
      cdkBuilder.tags(tags.map(TagItemProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector): CfnDetector
        = CfnDetector(cdkObject)

    internal fun unwrap(wrapped: CfnDetector): software.amazon.awscdk.services.guardduty.CfnDetector
        = wrapped.cdkObject
  }

  public interface CFNS3LogsConfigurationProperty {
    public fun enable(): Any

    public interface Builder {
      public fun enable(enable: Boolean) {
      }

      public fun enable(enable: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.builder()

      public override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      public override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty,
    ) : CFNS3LogsConfigurationProperty {
      public override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CFNS3LogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty):
          CFNS3LogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNS3LogsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNDataSourceConfigurationsProperty {
    public fun kubernetes(): Any? = unwrap(this).getKubernetes()

    public fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    public interface Builder {
      public fun kubernetes(kubernetes: IResolvable) {
      }

      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit) {
      }

      public fun malwareProtection(malwareProtection: IResolvable) {
      }

      public fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      public
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun s3Logs(s3Logs: IResolvable) {
      }

      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.builder()

      public override fun kubernetes(kubernetes: IResolvable) {
        cdkBuilder.kubernetes(kubernetes.let(IResolvable::unwrap))
      }

      public override fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty) {
        cdkBuilder.kubernetes(kubernetes.let(CFNKubernetesConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      public override
          fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit): Unit =
          kubernetes(CFNKubernetesConfigurationProperty(kubernetes))

      public override fun malwareProtection(malwareProtection: IResolvable) {
        cdkBuilder.malwareProtection(malwareProtection.let(IResolvable::unwrap))
      }

      public override
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty) {
        cdkBuilder.malwareProtection(malwareProtection.let(CFNMalwareProtectionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      public override
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit):
          Unit = malwareProtection(CFNMalwareProtectionConfigurationProperty(malwareProtection))

      public override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      public override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty) {
        cdkBuilder.s3Logs(s3Logs.let(CFNS3LogsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      public override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit): Unit =
          s3Logs(CFNS3LogsConfigurationProperty(s3Logs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty,
    ) : CFNDataSourceConfigurationsProperty {
      public override fun kubernetes(): Any? = unwrap(this).getKubernetes()

      public override fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

      public override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNDataSourceConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty):
          CFNDataSourceConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNDataSourceConfigurationsProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNScanEc2InstanceWithFindingsConfigurationProperty {
    public fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()

    public interface Builder {
      public fun ebsVolumes(ebsVolumes: Boolean) {
      }

      public fun ebsVolumes(ebsVolumes: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()

      public override fun ebsVolumes(ebsVolumes: Boolean) {
        cdkBuilder.ebsVolumes(ebsVolumes)
      }

      public override fun ebsVolumes(ebsVolumes: IResolvable) {
        cdkBuilder.ebsVolumes(ebsVolumes.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty,
    ) : CFNScanEc2InstanceWithFindingsConfigurationProperty {
      public override fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNScanEc2InstanceWithFindingsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty):
          CFNScanEc2InstanceWithFindingsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNScanEc2InstanceWithFindingsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagItemProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty,
    ) : TagItemProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty):
          TagItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagItemProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CFNFeatureConfigurationProperty {
    public fun additionalConfiguration(): Any? = unwrap(this).getAdditionalConfiguration()

    public fun name(): String

    public fun status(): String

    public interface Builder {
      public fun additionalConfiguration(additionalConfiguration: IResolvable) {
      }

      public fun additionalConfiguration(additionalConfiguration: List<Any>) {
      }

      public fun name(name: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.builder()

      public override fun additionalConfiguration(additionalConfiguration: IResolvable) {
        cdkBuilder.additionalConfiguration(additionalConfiguration.let(IResolvable::unwrap))
      }

      public override fun additionalConfiguration(additionalConfiguration: List<Any>) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty,
    ) : CFNFeatureConfigurationProperty {
      public override fun additionalConfiguration(): Any? =
          unwrap(this).getAdditionalConfiguration()

      public override fun name(): String = unwrap(this).getName()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CFNFeatureConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty):
          CFNFeatureConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNFeatureConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNKubernetesConfigurationProperty {
    public fun auditLogs(): Any

    public interface Builder {
      public fun auditLogs(auditLogs: IResolvable) {
      }

      public fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      public
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.builder()

      public override fun auditLogs(auditLogs: IResolvable) {
        cdkBuilder.auditLogs(auditLogs.let(IResolvable::unwrap))
      }

      public override fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty) {
        cdkBuilder.auditLogs(auditLogs.let(CFNKubernetesAuditLogsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      public override
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit):
          Unit = auditLogs(CFNKubernetesAuditLogsConfigurationProperty(auditLogs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty,
    ) : CFNKubernetesConfigurationProperty {
      public override fun auditLogs(): Any = unwrap(this).getAuditLogs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNKubernetesConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty):
          CFNKubernetesConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNKubernetesConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNMalwareProtectionConfigurationProperty {
    public fun scanEc2InstanceWithFindings(): Any? = unwrap(this).getScanEc2InstanceWithFindings()

    public interface Builder {
      public fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable) {
      }

      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.builder()

      public override fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(IResolvable::unwrap))
      }

      public override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(CFNScanEc2InstanceWithFindingsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      public override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit):
          Unit =
          scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty(scanEc2InstanceWithFindings))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty,
    ) : CFNMalwareProtectionConfigurationProperty {
      public override fun scanEc2InstanceWithFindings(): Any? =
          unwrap(this).getScanEc2InstanceWithFindings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNMalwareProtectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty):
          CFNMalwareProtectionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNMalwareProtectionConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNKubernetesAuditLogsConfigurationProperty {
    public fun enable(): Any

    public interface Builder {
      public fun enable(enable: Boolean) {
      }

      public fun enable(enable: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.builder()

      public override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      public override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty,
    ) : CFNKubernetesAuditLogsConfigurationProperty {
      public override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNKubernetesAuditLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty):
          CFNKubernetesAuditLogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNKubernetesAuditLogsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CFNFeatureAdditionalConfigurationProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty,
    ) : CFNFeatureAdditionalConfigurationProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNFeatureAdditionalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty):
          CFNFeatureAdditionalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNFeatureAdditionalConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
