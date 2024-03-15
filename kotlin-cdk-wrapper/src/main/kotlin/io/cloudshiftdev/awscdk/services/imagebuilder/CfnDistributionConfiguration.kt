@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDistributionConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration,
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

  public open fun distributions(vararg __idx_ac66f0: Any): Unit =
      distributions(__idx_ac66f0.toList())

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

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun distributions(distributions: IResolvable)

    public fun distributions(distributions: List<Any>)

    public fun distributions(vararg distributions: Any)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun distributions(distributions: IResolvable) {
      cdkBuilder.distributions(distributions.let(IResolvable::unwrap))
    }

    override fun distributions(distributions: List<Any>) {
      cdkBuilder.distributions(distributions)
    }

    override fun distributions(vararg distributions: Any): Unit =
        distributions(distributions.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun accountId(accountId: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun launchTemplate(launchTemplate: IResolvable)

      public fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      public
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit)

      public fun maxParallelLaunches(maxParallelLaunches: Number)

      public fun snapshotConfiguration(snapshotConfiguration: IResolvable)

      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      override fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(FastLaunchLaunchTemplateSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      override
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit = launchTemplate(FastLaunchLaunchTemplateSpecificationProperty(launchTemplate))

      override fun maxParallelLaunches(maxParallelLaunches: Number) {
        cdkBuilder.maxParallelLaunches(maxParallelLaunches)
      }

      override fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(IResolvable::unwrap))
      }

      override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(FastLaunchSnapshotConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          snapshotConfiguration(FastLaunchSnapshotConfigurationProperty(snapshotConfiguration))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty,
    ) : CdkObject(cdkObject), FastLaunchConfigurationProperty {
      override fun accountId(): String? = unwrap(this).getAccountId()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

      override fun maxParallelLaunches(): Number? = unwrap(this).getMaxParallelLaunches()

      override fun snapshotConfiguration(): Any? = unwrap(this).getSnapshotConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FastLaunchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty):
          FastLaunchConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun amiDistributionConfiguration(amiDistributionConfiguration: Any)

      public fun containerDistributionConfiguration(containerDistributionConfiguration: Any)

      public fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable)

      public fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>)

      public fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any)

      public fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable)

      public fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>)

      public fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any)

      public fun licenseConfigurationArns(licenseConfigurationArns: List<String>)

      public fun licenseConfigurationArns(vararg licenseConfigurationArns: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.builder()

      override fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
        cdkBuilder.amiDistributionConfiguration(amiDistributionConfiguration)
      }

      override fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
        cdkBuilder.containerDistributionConfiguration(containerDistributionConfiguration)
      }

      override fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations.let(IResolvable::unwrap))
      }

      override fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations)
      }

      override fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any): Unit =
          fastLaunchConfigurations(fastLaunchConfigurations.toList())

      override fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations.let(IResolvable::unwrap))
      }

      override fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations)
      }

      override fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any): Unit =
          launchTemplateConfigurations(launchTemplateConfigurations.toList())

      override fun licenseConfigurationArns(licenseConfigurationArns: List<String>) {
        cdkBuilder.licenseConfigurationArns(licenseConfigurationArns)
      }

      override fun licenseConfigurationArns(vararg licenseConfigurationArns: String): Unit =
          licenseConfigurationArns(licenseConfigurationArns.toList())

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty,
    ) : CdkObject(cdkObject), DistributionProperty {
      override fun amiDistributionConfiguration(): Any? =
          unwrap(this).getAmiDistributionConfiguration()

      override fun containerDistributionConfiguration(): Any? =
          unwrap(this).getContainerDistributionConfiguration()

      override fun fastLaunchConfigurations(): Any? = unwrap(this).getFastLaunchConfigurations()

      override fun launchTemplateConfigurations(): Any? =
          unwrap(this).getLaunchTemplateConfigurations()

      override fun licenseConfigurationArns(): List<String> =
          unwrap(this).getLicenseConfigurationArns() ?: emptyList()

      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DistributionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty):
          DistributionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DistributionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
    }
  }

  public interface LaunchPermissionConfigurationProperty {
    public fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?: emptyList()

    public fun organizationalUnitArns(): List<String> = unwrap(this).getOrganizationalUnitArns() ?:
        emptyList()

    public fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

    public fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun organizationArns(organizationArns: List<String>)

      public fun organizationArns(vararg organizationArns: String)

      public fun organizationalUnitArns(organizationalUnitArns: List<String>)

      public fun organizationalUnitArns(vararg organizationalUnitArns: String)

      public fun userGroups(userGroups: List<String>)

      public fun userGroups(vararg userGroups: String)

      public fun userIds(userIds: List<String>)

      public fun userIds(vararg userIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.builder()

      override fun organizationArns(organizationArns: List<String>) {
        cdkBuilder.organizationArns(organizationArns)
      }

      override fun organizationArns(vararg organizationArns: String): Unit =
          organizationArns(organizationArns.toList())

      override fun organizationalUnitArns(organizationalUnitArns: List<String>) {
        cdkBuilder.organizationalUnitArns(organizationalUnitArns)
      }

      override fun organizationalUnitArns(vararg organizationalUnitArns: String): Unit =
          organizationalUnitArns(organizationalUnitArns.toList())

      override fun userGroups(userGroups: List<String>) {
        cdkBuilder.userGroups(userGroups)
      }

      override fun userGroups(vararg userGroups: String): Unit = userGroups(userGroups.toList())

      override fun userIds(userIds: List<String>) {
        cdkBuilder.userIds(userIds)
      }

      override fun userIds(vararg userIds: String): Unit = userIds(userIds.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty,
    ) : CdkObject(cdkObject), LaunchPermissionConfigurationProperty {
      override fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?:
          emptyList()

      override fun organizationalUnitArns(): List<String> = unwrap(this).getOrganizationalUnitArns()
          ?: emptyList()

      override fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

      override fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
    }
  }

  public interface ContainerDistributionConfigurationProperty {
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    public fun description(): String? = unwrap(this).getDescription()

    public fun targetRepository(): Any? = unwrap(this).getTargetRepository()

    @CdkDslMarker
    public interface Builder {
      public fun containerTags(containerTags: List<String>)

      public fun containerTags(vararg containerTags: String)

      public fun description(description: String)

      public fun targetRepository(targetRepository: IResolvable)

      public fun targetRepository(targetRepository: TargetContainerRepositoryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      public
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder()

      override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      override fun containerTags(vararg containerTags: String): Unit =
          containerTags(containerTags.toList())

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun targetRepository(targetRepository: IResolvable) {
        cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
      }

      override fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
        cdkBuilder.targetRepository(targetRepository.let(TargetContainerRepositoryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      override
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit):
          Unit = targetRepository(TargetContainerRepositoryProperty(targetRepository))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty,
    ) : CdkObject(cdkObject), ContainerDistributionConfigurationProperty {
      override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

      override fun description(): String? = unwrap(this).getDescription()

      override fun targetRepository(): Any? = unwrap(this).getTargetRepository()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
    }
  }

  public interface FastLaunchSnapshotConfigurationProperty {
    public fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()

    @CdkDslMarker
    public interface Builder {
      public fun targetResourceCount(targetResourceCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.builder()

      override fun targetResourceCount(targetResourceCount: Number) {
        cdkBuilder.targetResourceCount(targetResourceCount)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty,
    ) : CdkObject(cdkObject), FastLaunchSnapshotConfigurationProperty {
      override fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun amiTags(amiTags: IResolvable)

      public fun amiTags(amiTags: Map<String, String>)

      public fun description(description: String)

      public fun kmsKeyId(kmsKeyId: String)

      public fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable)

      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun targetAccountIds(targetAccountIds: List<String>)

      public fun targetAccountIds(vararg targetAccountIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder()

      override fun amiTags(amiTags: IResolvable) {
        cdkBuilder.amiTags(amiTags.let(IResolvable::unwrap))
      }

      override fun amiTags(amiTags: Map<String, String>) {
        cdkBuilder.amiTags(amiTags)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(LaunchPermissionConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit):
          Unit =
          launchPermissionConfiguration(LaunchPermissionConfigurationProperty(launchPermissionConfiguration))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun targetAccountIds(targetAccountIds: List<String>) {
        cdkBuilder.targetAccountIds(targetAccountIds)
      }

      override fun targetAccountIds(vararg targetAccountIds: String): Unit =
          targetAccountIds(targetAccountIds.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty,
    ) : CdkObject(cdkObject), AmiDistributionConfigurationProperty {
      override fun amiTags(): Any? = unwrap(this).getAmiTags()

      override fun description(): String? = unwrap(this).getDescription()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun launchPermissionConfiguration(): Any? =
          unwrap(this).getLaunchPermissionConfiguration()

      override fun name(): String? = unwrap(this).getName()

      override fun targetAccountIds(): List<String> = unwrap(this).getTargetAccountIds() ?:
          emptyList()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
    }
  }

  public interface LaunchTemplateConfigurationProperty {
    public fun accountId(): String? = unwrap(this).getAccountId()

    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()

    @CdkDslMarker
    public interface Builder {
      public fun accountId(accountId: String)

      public fun defaultVersion(setDefaultVersion: Boolean)

      public fun defaultVersion(setDefaultVersion: IResolvable)

      public fun launchTemplateId(launchTemplateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.builder()

      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      override fun defaultVersion(setDefaultVersion: Boolean) {
        cdkBuilder.setDefaultVersion(setDefaultVersion)
      }

      override fun defaultVersion(setDefaultVersion: IResolvable) {
        cdkBuilder.setDefaultVersion(setDefaultVersion.let(IResolvable::unwrap))
      }

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateConfigurationProperty {
      override fun accountId(): String? = unwrap(this).getAccountId()

      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
    }
  }

  public interface FastLaunchLaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()

    @CdkDslMarker
    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String)

      public fun launchTemplateName(launchTemplateName: String)

      public fun launchTemplateVersion(launchTemplateVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.builder()

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      override fun launchTemplateVersion(launchTemplateVersion: String) {
        cdkBuilder.launchTemplateVersion(launchTemplateVersion)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject), FastLaunchLaunchTemplateSpecificationProperty {
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      override fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
    }
  }

  public interface TargetContainerRepositoryProperty {
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    public fun service(): String? = unwrap(this).getService()

    @CdkDslMarker
    public interface Builder {
      public fun repositoryName(repositoryName: String)

      public fun service(service: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder()

      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      override fun service(service: String) {
        cdkBuilder.service(service)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty,
    ) : CdkObject(cdkObject), TargetContainerRepositoryProperty {
      override fun repositoryName(): String? = unwrap(this).getRepositoryName()

      override fun service(): String? = unwrap(this).getService()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
    }
  }
}
