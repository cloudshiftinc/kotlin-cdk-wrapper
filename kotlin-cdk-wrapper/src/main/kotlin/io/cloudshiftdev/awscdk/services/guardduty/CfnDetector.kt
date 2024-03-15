@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDetector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSources(`value`: CFNDataSourceConfigurationsProperty) {
    unwrap(this).setDataSources(`value`.let(CFNDataSourceConfigurationsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun features(vararg __idx_ac66f0: Any): Unit = features(__idx_ac66f0.toList())

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

  public open fun tagsRaw(vararg `value`: TagItemProperty): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dataSources(dataSources: IResolvable)

    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit)

    public fun enable(enable: Boolean)

    public fun enable(enable: IResolvable)

    public fun features(features: IResolvable)

    public fun features(features: List<Any>)

    public fun features(vararg features: Any)

    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    public fun tags(tags: List<TagItemProperty>)

    public fun tags(vararg tags: TagItemProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnDetector.Builder =
        software.amazon.awscdk.services.guardduty.CfnDetector.Builder.create(scope, id)

    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    override fun dataSources(dataSources: CFNDataSourceConfigurationsProperty) {
      cdkBuilder.dataSources(dataSources.let(CFNDataSourceConfigurationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    override fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit):
        Unit = dataSources(CFNDataSourceConfigurationsProperty(dataSources))

    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    override fun features(features: IResolvable) {
      cdkBuilder.features(features.let(IResolvable::unwrap))
    }

    override fun features(features: List<Any>) {
      cdkBuilder.features(features)
    }

    override fun features(vararg features: Any): Unit = features(features.toList())

    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    override fun tags(tags: List<TagItemProperty>) {
      cdkBuilder.tags(tags.map(TagItemProperty::unwrap))
    }

    override fun tags(vararg tags: TagItemProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnDetector.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun enable(enable: Boolean)

      public fun enable(enable: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.builder()

      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNS3LogsConfigurationProperty {
      override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CFNS3LogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty):
          CFNS3LogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNS3LogsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty
    }
  }

  public interface CFNDataSourceConfigurationsProperty {
    public fun kubernetes(): Any? = unwrap(this).getKubernetes()

    public fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    @CdkDslMarker
    public interface Builder {
      public fun kubernetes(kubernetes: IResolvable)

      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit)

      public fun malwareProtection(malwareProtection: IResolvable)

      public fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      public
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit)

      public fun s3Logs(s3Logs: IResolvable)

      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.builder()

      override fun kubernetes(kubernetes: IResolvable) {
        cdkBuilder.kubernetes(kubernetes.let(IResolvable::unwrap))
      }

      override fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty) {
        cdkBuilder.kubernetes(kubernetes.let(CFNKubernetesConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      override fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit):
          Unit = kubernetes(CFNKubernetesConfigurationProperty(kubernetes))

      override fun malwareProtection(malwareProtection: IResolvable) {
        cdkBuilder.malwareProtection(malwareProtection.let(IResolvable::unwrap))
      }

      override fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty) {
        cdkBuilder.malwareProtection(malwareProtection.let(CFNMalwareProtectionConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      override
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit):
          Unit = malwareProtection(CFNMalwareProtectionConfigurationProperty(malwareProtection))

      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty) {
        cdkBuilder.s3Logs(s3Logs.let(CFNS3LogsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit): Unit =
          s3Logs(CFNS3LogsConfigurationProperty(s3Logs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty,
    ) : CdkObject(cdkObject), CFNDataSourceConfigurationsProperty {
      override fun kubernetes(): Any? = unwrap(this).getKubernetes()

      override fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
    }
  }

  public interface CFNScanEc2InstanceWithFindingsConfigurationProperty {
    public fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()

    @CdkDslMarker
    public interface Builder {
      public fun ebsVolumes(ebsVolumes: Boolean)

      public fun ebsVolumes(ebsVolumes: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()

      override fun ebsVolumes(ebsVolumes: Boolean) {
        cdkBuilder.ebsVolumes(ebsVolumes)
      }

      override fun ebsVolumes(ebsVolumes: IResolvable) {
        cdkBuilder.ebsVolumes(ebsVolumes.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNScanEc2InstanceWithFindingsConfigurationProperty {
      override fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
    }
  }

  public interface TagItemProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty,
    ) : CdkObject(cdkObject), TagItemProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty):
          TagItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagItemProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty
    }
  }

  public interface CFNFeatureConfigurationProperty {
    public fun additionalConfiguration(): Any? = unwrap(this).getAdditionalConfiguration()

    public fun name(): String

    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun additionalConfiguration(additionalConfiguration: IResolvable)

      public fun additionalConfiguration(additionalConfiguration: List<Any>)

      public fun additionalConfiguration(vararg additionalConfiguration: Any)

      public fun name(name: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.builder()

      override fun additionalConfiguration(additionalConfiguration: IResolvable) {
        cdkBuilder.additionalConfiguration(additionalConfiguration.let(IResolvable::unwrap))
      }

      override fun additionalConfiguration(additionalConfiguration: List<Any>) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      override fun additionalConfiguration(vararg additionalConfiguration: Any): Unit =
          additionalConfiguration(additionalConfiguration.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty,
    ) : CdkObject(cdkObject), CFNFeatureConfigurationProperty {
      override fun additionalConfiguration(): Any? = unwrap(this).getAdditionalConfiguration()

      override fun name(): String = unwrap(this).getName()

      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CFNFeatureConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty):
          CFNFeatureConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNFeatureConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty
    }
  }

  public interface CFNKubernetesConfigurationProperty {
    public fun auditLogs(): Any

    @CdkDslMarker
    public interface Builder {
      public fun auditLogs(auditLogs: IResolvable)

      public fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      public
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.builder()

      override fun auditLogs(auditLogs: IResolvable) {
        cdkBuilder.auditLogs(auditLogs.let(IResolvable::unwrap))
      }

      override fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty) {
        cdkBuilder.auditLogs(auditLogs.let(CFNKubernetesAuditLogsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      override
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit):
          Unit = auditLogs(CFNKubernetesAuditLogsConfigurationProperty(auditLogs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty,
    ) : CdkObject(cdkObject), CFNKubernetesConfigurationProperty {
      override fun auditLogs(): Any = unwrap(this).getAuditLogs()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty
    }
  }

  public interface CFNMalwareProtectionConfigurationProperty {
    public fun scanEc2InstanceWithFindings(): Any? = unwrap(this).getScanEc2InstanceWithFindings()

    @CdkDslMarker
    public interface Builder {
      public fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable)

      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.builder()

      override fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(IResolvable::unwrap))
      }

      override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(CFNScanEc2InstanceWithFindingsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit):
          Unit =
          scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty(scanEc2InstanceWithFindings))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty,
    ) : CdkObject(cdkObject), CFNMalwareProtectionConfigurationProperty {
      override fun scanEc2InstanceWithFindings(): Any? =
          unwrap(this).getScanEc2InstanceWithFindings()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
    }
  }

  public interface CFNKubernetesAuditLogsConfigurationProperty {
    public fun enable(): Any

    @CdkDslMarker
    public interface Builder {
      public fun enable(enable: Boolean)

      public fun enable(enable: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.builder()

      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNKubernetesAuditLogsConfigurationProperty {
      override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
    }
  }

  public interface CFNFeatureAdditionalConfigurationProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun status(): String? = unwrap(this).getStatus()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty,
    ) : CdkObject(cdkObject), CFNFeatureAdditionalConfigurationProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
    }
  }
}
