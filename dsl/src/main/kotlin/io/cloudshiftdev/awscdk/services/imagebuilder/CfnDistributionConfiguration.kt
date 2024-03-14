package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDistributionConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun distributions(): Any = unwrap(this).getDistributions()

  public open fun distributions(`value`: IResolvable) {
    unwrap(this).setDistributions(`value`.let(IResolvable::unwrap))
  }

  public open fun distributions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDistributions(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun distributions(distributions: IResolvable) {
    }

    public fun distributions(distributions: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder.create(scope,
        id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun distributions(distributions: IResolvable) {
      cdkBuilder.distributions(distributions.let(IResolvable::unwrap))
    }

    public override fun distributions(distributions: List<Any>) {
      cdkBuilder.distributions(distributions)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistributionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistributionConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration):
        CfnDistributionConfiguration = CfnDistributionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionConfiguration):
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
        wrapped.cdkObject
  }

  public interface FastLaunchConfigurationProperty {
    public fun accountId(): String? = unwrap(this).getAccountId()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    public fun maxParallelLaunches(): Number? = unwrap(this).getMaxParallelLaunches()

    public fun snapshotConfiguration(): Any? = unwrap(this).getSnapshotConfiguration()

    public interface Builder {
      public fun accountId(accountId: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun launchTemplate(launchTemplate: IResolvable) {
      }

      public fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      public
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit) {
      }

      public fun maxParallelLaunches(maxParallelLaunches: Number) {
      }

      public fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
      }

      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

      public override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      public override
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(FastLaunchLaunchTemplateSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      public override
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit = launchTemplate(FastLaunchLaunchTemplateSpecificationProperty(launchTemplate))

      public override fun maxParallelLaunches(maxParallelLaunches: Number) {
        cdkBuilder.maxParallelLaunches(maxParallelLaunches)
      }

      public override fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(FastLaunchSnapshotConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      public override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          snapshotConfiguration(FastLaunchSnapshotConfigurationProperty(snapshotConfiguration))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty,
    ) : FastLaunchConfigurationProperty {
      public override fun accountId(): String? = unwrap(this).getAccountId()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

      public override fun maxParallelLaunches(): Number? = unwrap(this).getMaxParallelLaunches()

      public override fun snapshotConfiguration(): Any? = unwrap(this).getSnapshotConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FastLaunchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty):
          FastLaunchConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DistributionProperty {
    public fun amiDistributionConfiguration(): Any? = unwrap(this).getAmiDistributionConfiguration()

    public fun containerDistributionConfiguration(): Any? =
        unwrap(this).getContainerDistributionConfiguration()

    public fun fastLaunchConfigurations(): Any? = unwrap(this).getFastLaunchConfigurations()

    public fun launchTemplateConfigurations(): Any? = unwrap(this).getLaunchTemplateConfigurations()

    public fun licenseConfigurationArns(): List<String> = unwrap(this).getLicenseConfigurationArns()
        ?: emptyList()

    public fun region(): String

    public interface Builder {
      public fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
      }

      public fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
      }

      public fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
      }

      public fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>) {
      }

      public fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
      }

      public fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>) {
      }

      public fun licenseConfigurationArns(licenseConfigurationArns: List<String>) {
      }

      public fun region(region: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.builder()

      public override fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
        cdkBuilder.amiDistributionConfiguration(amiDistributionConfiguration)
      }

      public override
          fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
        cdkBuilder.containerDistributionConfiguration(containerDistributionConfiguration)
      }

      public override fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations.let(IResolvable::unwrap))
      }

      public override fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations)
      }

      public override fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations.let(IResolvable::unwrap))
      }

      public override fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations)
      }

      public override fun licenseConfigurationArns(licenseConfigurationArns: List<String>) {
        cdkBuilder.licenseConfigurationArns(licenseConfigurationArns)
      }

      public override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty,
    ) : DistributionProperty {
      public override fun amiDistributionConfiguration(): Any? =
          unwrap(this).getAmiDistributionConfiguration()

      public override fun containerDistributionConfiguration(): Any? =
          unwrap(this).getContainerDistributionConfiguration()

      public override fun fastLaunchConfigurations(): Any? =
          unwrap(this).getFastLaunchConfigurations()

      public override fun launchTemplateConfigurations(): Any? =
          unwrap(this).getLaunchTemplateConfigurations()

      public override fun licenseConfigurationArns(): List<String> =
          unwrap(this).getLicenseConfigurationArns() ?: emptyList()

      public override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DistributionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty):
          DistributionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DistributionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchPermissionConfigurationProperty {
    public fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?: emptyList()

    public fun organizationalUnitArns(): List<String> = unwrap(this).getOrganizationalUnitArns() ?:
        emptyList()

    public fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

    public fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()

    public interface Builder {
      public fun organizationArns(organizationArns: List<String>) {
      }

      public fun organizationalUnitArns(organizationalUnitArns: List<String>) {
      }

      public fun userGroups(userGroups: List<String>) {
      }

      public fun userIds(userIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.builder()

      public override fun organizationArns(organizationArns: List<String>) {
        cdkBuilder.organizationArns(organizationArns)
      }

      public override fun organizationalUnitArns(organizationalUnitArns: List<String>) {
        cdkBuilder.organizationalUnitArns(organizationalUnitArns)
      }

      public override fun userGroups(userGroups: List<String>) {
        cdkBuilder.userGroups(userGroups)
      }

      public override fun userIds(userIds: List<String>) {
        cdkBuilder.userIds(userIds)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty,
    ) : LaunchPermissionConfigurationProperty {
      public override fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?:
          emptyList()

      public override fun organizationalUnitArns(): List<String> =
          unwrap(this).getOrganizationalUnitArns() ?: emptyList()

      public override fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

      public override fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchPermissionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty):
          LaunchPermissionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchPermissionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContainerDistributionConfigurationProperty {
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    public fun description(): String? = unwrap(this).getDescription()

    public fun targetRepository(): Any? = unwrap(this).getTargetRepository()

    public interface Builder {
      public fun containerTags(containerTags: List<String>) {
      }

      public fun description(description: String) {
      }

      public fun targetRepository(targetRepository: IResolvable) {
      }

      public fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      public
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder()

      public override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun targetRepository(targetRepository: IResolvable) {
        cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
      }

      public override fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
        cdkBuilder.targetRepository(targetRepository.let(TargetContainerRepositoryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      public override
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit):
          Unit = targetRepository(TargetContainerRepositoryProperty(targetRepository))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty,
    ) : ContainerDistributionConfigurationProperty {
      public override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?:
          emptyList()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun targetRepository(): Any? = unwrap(this).getTargetRepository()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContainerDistributionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty):
          ContainerDistributionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDistributionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FastLaunchSnapshotConfigurationProperty {
    public fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()

    public interface Builder {
      public fun targetResourceCount(targetResourceCount: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.builder()

      public override fun targetResourceCount(targetResourceCount: Number) {
        cdkBuilder.targetResourceCount(targetResourceCount)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty,
    ) : FastLaunchSnapshotConfigurationProperty {
      public override fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FastLaunchSnapshotConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty):
          FastLaunchSnapshotConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchSnapshotConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmiDistributionConfigurationProperty {
    public fun amiTags(): Any? = unwrap(this).getAmiTags()

    public fun description(): String? = unwrap(this).getDescription()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun launchPermissionConfiguration(): Any? =
        unwrap(this).getLaunchPermissionConfiguration()

    public fun name(): String? = unwrap(this).getName()

    public fun targetAccountIds(): List<String> = unwrap(this).getTargetAccountIds() ?: emptyList()

    public interface Builder {
      public fun amiTags(amiTags: IResolvable) {
      }

      public fun amiTags(amiTags: Map<String, String>) {
      }

      public fun description(description: String) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
      }

      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }

      public fun targetAccountIds(targetAccountIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder()

      public override fun amiTags(amiTags: IResolvable) {
        cdkBuilder.amiTags(amiTags.let(IResolvable::unwrap))
      }

      public override fun amiTags(amiTags: Map<String, String>) {
        cdkBuilder.amiTags(amiTags)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override
          fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(LaunchPermissionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      public override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit):
          Unit =
          launchPermissionConfiguration(LaunchPermissionConfigurationProperty(launchPermissionConfiguration))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun targetAccountIds(targetAccountIds: List<String>) {
        cdkBuilder.targetAccountIds(targetAccountIds)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty,
    ) : AmiDistributionConfigurationProperty {
      public override fun amiTags(): Any? = unwrap(this).getAmiTags()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun launchPermissionConfiguration(): Any? =
          unwrap(this).getLaunchPermissionConfiguration()

      public override fun name(): String? = unwrap(this).getName()

      public override fun targetAccountIds(): List<String> = unwrap(this).getTargetAccountIds() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmiDistributionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty):
          AmiDistributionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmiDistributionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateConfigurationProperty {
    public fun accountId(): String? = unwrap(this).getAccountId()

    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()

    public interface Builder {
      public fun accountId(accountId: String) {
      }

      public fun defaultVersion(setDefaultVersion: Boolean) {
      }

      public fun defaultVersion(setDefaultVersion: IResolvable) {
      }

      public fun launchTemplateId(launchTemplateId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.builder()

      public override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      public override fun defaultVersion(setDefaultVersion: Boolean) {
        cdkBuilder.setDefaultVersion(setDefaultVersion)
      }

      public override fun defaultVersion(setDefaultVersion: IResolvable) {
        cdkBuilder.setDefaultVersion(setDefaultVersion.let(IResolvable::unwrap))
      }

      public override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty,
    ) : LaunchTemplateConfigurationProperty {
      public override fun accountId(): String? = unwrap(this).getAccountId()

      public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      public override fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty):
          LaunchTemplateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FastLaunchLaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String) {
      }

      public fun launchTemplateName(launchTemplateName: String) {
      }

      public fun launchTemplateVersion(launchTemplateVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.builder()

      public override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      public override fun launchTemplateVersion(launchTemplateVersion: String) {
        cdkBuilder.launchTemplateVersion(launchTemplateVersion)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty,
    ) : FastLaunchLaunchTemplateSpecificationProperty {
      public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      public override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      public override fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FastLaunchLaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty):
          FastLaunchLaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchLaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetContainerRepositoryProperty {
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    public fun service(): String? = unwrap(this).getService()

    public interface Builder {
      public fun repositoryName(repositoryName: String) {
      }

      public fun service(service: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder()

      public override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      public override fun service(service: String) {
        cdkBuilder.service(service)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty,
    ) : TargetContainerRepositoryProperty {
      public override fun repositoryName(): String? = unwrap(this).getRepositoryName()

      public override fun service(): String? = unwrap(this).getService()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetContainerRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty):
          TargetContainerRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetContainerRepositoryProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
