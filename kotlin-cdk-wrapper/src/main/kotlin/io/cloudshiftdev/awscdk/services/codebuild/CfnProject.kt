@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun artifacts(): Any = unwrap(this).getArtifacts()

  public open fun artifacts(`value`: IResolvable) {
    unwrap(this).setArtifacts(`value`.let(IResolvable::unwrap))
  }

  public open fun artifacts(`value`: ArtifactsProperty) {
    unwrap(this).setArtifacts(`value`.let(ArtifactsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71f3dbc989f533890d9328c639ebdf9d629fb1fb0713fd5cedeae05658d048cf")
  public open fun artifacts(`value`: ArtifactsProperty.Builder.() -> Unit): Unit =
      artifacts(ArtifactsProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

  public open fun badgeEnabled(`value`: Boolean) {
    unwrap(this).setBadgeEnabled(`value`)
  }

  public open fun badgeEnabled(`value`: IResolvable) {
    unwrap(this).setBadgeEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

  public open fun buildBatchConfig(`value`: IResolvable) {
    unwrap(this).setBuildBatchConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun buildBatchConfig(`value`: ProjectBuildBatchConfigProperty) {
    unwrap(this).setBuildBatchConfig(`value`.let(ProjectBuildBatchConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("484f75feba2cbc64318c2acb155a207ecb46c2b14edd0d60f3ffe37d9ada0f0a")
  public open fun buildBatchConfig(`value`: ProjectBuildBatchConfigProperty.Builder.() -> Unit):
      Unit = buildBatchConfig(ProjectBuildBatchConfigProperty(`value`))

  public open fun cache(): Any? = unwrap(this).getCache()

  public open fun cache(`value`: IResolvable) {
    unwrap(this).setCache(`value`.let(IResolvable::unwrap))
  }

  public open fun cache(`value`: ProjectCacheProperty) {
    unwrap(this).setCache(`value`.let(ProjectCacheProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a25e4b68b4cbdad7a87c238aafd1fba1069f634fa898b23a0780c7c42339d009")
  public open fun cache(`value`: ProjectCacheProperty.Builder.() -> Unit): Unit =
      cache(ProjectCacheProperty(`value`))

  public open fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

  public open fun concurrentBuildLimit(`value`: Number) {
    unwrap(this).setConcurrentBuildLimit(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  public open fun environment(): Any = unwrap(this).getEnvironment()

  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  public open fun environment(`value`: EnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(EnvironmentProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("339139e6c33d66fce22ac58657966e5402f26c47d0d1f37450bfdd537854ff75")
  public open fun environment(`value`: EnvironmentProperty.Builder.() -> Unit): Unit =
      environment(EnvironmentProperty(`value`))

  public open fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  public open fun fileSystemLocations(`value`: IResolvable) {
    unwrap(this).setFileSystemLocations(`value`.let(IResolvable::unwrap))
  }

  public open fun fileSystemLocations(__idx_ac66f0: List<Any>) {
    unwrap(this).setFileSystemLocations(__idx_ac66f0)
  }

  public open fun fileSystemLocations(vararg __idx_ac66f0: Any): Unit =
      fileSystemLocations(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logsConfig(): Any? = unwrap(this).getLogsConfig()

  public open fun logsConfig(`value`: IResolvable) {
    unwrap(this).setLogsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun logsConfig(`value`: LogsConfigProperty) {
    unwrap(this).setLogsConfig(`value`.let(LogsConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3533f3baf314fa98525c8d3c2ac4173dfb49df27f0a7f282e45472c10587e10")
  public open fun logsConfig(`value`: LogsConfigProperty.Builder.() -> Unit): Unit =
      logsConfig(LogsConfigProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

  public open fun queuedTimeoutInMinutes(`value`: Number) {
    unwrap(this).setQueuedTimeoutInMinutes(`value`)
  }

  public open fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

  public open fun resourceAccessRole(`value`: String) {
    unwrap(this).setResourceAccessRole(`value`)
  }

  public open fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

  public open fun secondaryArtifacts(`value`: IResolvable) {
    unwrap(this).setSecondaryArtifacts(`value`.let(IResolvable::unwrap))
  }

  public open fun secondaryArtifacts(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecondaryArtifacts(__idx_ac66f0)
  }

  public open fun secondaryArtifacts(vararg __idx_ac66f0: Any): Unit =
      secondaryArtifacts(__idx_ac66f0.toList())

  public open fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

  public open fun secondarySourceVersions(`value`: IResolvable) {
    unwrap(this).setSecondarySourceVersions(`value`.let(IResolvable::unwrap))
  }

  public open fun secondarySourceVersions(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecondarySourceVersions(__idx_ac66f0)
  }

  public open fun secondarySourceVersions(vararg __idx_ac66f0: Any): Unit =
      secondarySourceVersions(__idx_ac66f0.toList())

  public open fun secondarySources(): Any? = unwrap(this).getSecondarySources()

  public open fun secondarySources(`value`: IResolvable) {
    unwrap(this).setSecondarySources(`value`.let(IResolvable::unwrap))
  }

  public open fun secondarySources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecondarySources(__idx_ac66f0)
  }

  public open fun secondarySources(vararg __idx_ac66f0: Any): Unit =
      secondarySources(__idx_ac66f0.toList())

  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28b8bfc3cef42f27acf96c159ffd29a62d746a7024d5a36166d72768dd036bbe")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  public open fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  public open fun sourceVersion(`value`: String) {
    unwrap(this).setSourceVersion(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  public open fun triggers(): Any? = unwrap(this).getTriggers()

  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  public open fun triggers(`value`: ProjectTriggersProperty) {
    unwrap(this).setTriggers(`value`.let(ProjectTriggersProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("62ce3f06737317e4a4a80cd4bc4039899696dd05ca537a31b764543a1d3c1817")
  public open fun triggers(`value`: ProjectTriggersProperty.Builder.() -> Unit): Unit =
      triggers(ProjectTriggersProperty(`value`))

  public open fun visibility(): String? = unwrap(this).getVisibility()

  public open fun visibility(`value`: String) {
    unwrap(this).setVisibility(`value`)
  }

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da399bcc50712221cb5eff394014b7165bcf6832355e8ca81992ca62492cf15d")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun artifacts(artifacts: IResolvable)

    public fun artifacts(artifacts: ArtifactsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("459b334499b8df6cc300cd5cb1d97e853af8edaa43b90f827dae7dd63c489098")
    public fun artifacts(artifacts: ArtifactsProperty.Builder.() -> Unit)

    public fun badgeEnabled(badgeEnabled: Boolean)

    public fun badgeEnabled(badgeEnabled: IResolvable)

    public fun buildBatchConfig(buildBatchConfig: IResolvable)

    public fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a99374d660e9ee6cf2fb9800fd16273ab4eefa9fe56510b3ca8938e81cc823c2")
    public
        fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty.Builder.() -> Unit)

    public fun cache(cache: IResolvable)

    public fun cache(cache: ProjectCacheProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87e43351c2449e4d419f7c2b3068ef4e251d4838bbed64849d05a69198f5ec75")
    public fun cache(cache: ProjectCacheProperty.Builder.() -> Unit)

    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    public fun description(description: String)

    public fun encryptionKey(encryptionKey: String)

    public fun environment(environment: IResolvable)

    public fun environment(environment: EnvironmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17fa6e8915386f41fd25a1f78bacf242ffcc47f74961a5f760c62f79a6046b31")
    public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    public fun logsConfig(logsConfig: IResolvable)

    public fun logsConfig(logsConfig: LogsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3caea299a6117c080eaf244e0c9266864386388512f206a3e2be71df3fe17565")
    public fun logsConfig(logsConfig: LogsConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number)

    public fun resourceAccessRole(resourceAccessRole: String)

    public fun secondaryArtifacts(secondaryArtifacts: IResolvable)

    public fun secondaryArtifacts(secondaryArtifacts: List<Any>)

    public fun secondaryArtifacts(vararg secondaryArtifacts: Any)

    public fun secondarySourceVersions(secondarySourceVersions: IResolvable)

    public fun secondarySourceVersions(secondarySourceVersions: List<Any>)

    public fun secondarySourceVersions(vararg secondarySourceVersions: Any)

    public fun secondarySources(secondarySources: IResolvable)

    public fun secondarySources(secondarySources: List<Any>)

    public fun secondarySources(vararg secondarySources: Any)

    public fun serviceRole(serviceRole: String)

    public fun source(source: IResolvable)

    public fun source(source: SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("418cfd1c63a6c94fc6abd6b21ba2eea2769b2997ac24a51f4464397a24e0e412")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    public fun sourceVersion(sourceVersion: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutInMinutes(timeoutInMinutes: Number)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: ProjectTriggersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6989486a850294b2ed92ef6b257e8ed01cff283d6163bdc1ccd27ee4c4b7a753")
    public fun triggers(triggers: ProjectTriggersProperty.Builder.() -> Unit)

    public fun visibility(visibility: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78a3ddc4357c4f9c956f386a567a0303a2f89eff23a28547bc3546f98d3d0a49")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnProject.Builder =
        software.amazon.awscdk.services.codebuild.CfnProject.Builder.create(scope, id)

    override fun artifacts(artifacts: IResolvable) {
      cdkBuilder.artifacts(artifacts.let(IResolvable::unwrap))
    }

    override fun artifacts(artifacts: ArtifactsProperty) {
      cdkBuilder.artifacts(artifacts.let(ArtifactsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("459b334499b8df6cc300cd5cb1d97e853af8edaa43b90f827dae7dd63c489098")
    override fun artifacts(artifacts: ArtifactsProperty.Builder.() -> Unit): Unit =
        artifacts(ArtifactsProperty(artifacts))

    override fun badgeEnabled(badgeEnabled: Boolean) {
      cdkBuilder.badgeEnabled(badgeEnabled)
    }

    override fun badgeEnabled(badgeEnabled: IResolvable) {
      cdkBuilder.badgeEnabled(badgeEnabled.let(IResolvable::unwrap))
    }

    override fun buildBatchConfig(buildBatchConfig: IResolvable) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(IResolvable::unwrap))
    }

    override fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(ProjectBuildBatchConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a99374d660e9ee6cf2fb9800fd16273ab4eefa9fe56510b3ca8938e81cc823c2")
    override
        fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty.Builder.() -> Unit):
        Unit = buildBatchConfig(ProjectBuildBatchConfigProperty(buildBatchConfig))

    override fun cache(cache: IResolvable) {
      cdkBuilder.cache(cache.let(IResolvable::unwrap))
    }

    override fun cache(cache: ProjectCacheProperty) {
      cdkBuilder.cache(cache.let(ProjectCacheProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87e43351c2449e4d419f7c2b3068ef4e251d4838bbed64849d05a69198f5ec75")
    override fun cache(cache: ProjectCacheProperty.Builder.() -> Unit): Unit =
        cache(ProjectCacheProperty(cache))

    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    override fun environment(environment: EnvironmentProperty) {
      cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17fa6e8915386f41fd25a1f78bacf242ffcc47f74961a5f760c62f79a6046b31")
    override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(EnvironmentProperty(environment))

    override fun fileSystemLocations(fileSystemLocations: IResolvable) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.let(IResolvable::unwrap))
    }

    override fun fileSystemLocations(fileSystemLocations: List<Any>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations)
    }

    override fun fileSystemLocations(vararg fileSystemLocations: Any): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    override fun logsConfig(logsConfig: IResolvable) {
      cdkBuilder.logsConfig(logsConfig.let(IResolvable::unwrap))
    }

    override fun logsConfig(logsConfig: LogsConfigProperty) {
      cdkBuilder.logsConfig(logsConfig.let(LogsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3caea299a6117c080eaf244e0c9266864386388512f206a3e2be71df3fe17565")
    override fun logsConfig(logsConfig: LogsConfigProperty.Builder.() -> Unit): Unit =
        logsConfig(LogsConfigProperty(logsConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number) {
      cdkBuilder.queuedTimeoutInMinutes(queuedTimeoutInMinutes)
    }

    override fun resourceAccessRole(resourceAccessRole: String) {
      cdkBuilder.resourceAccessRole(resourceAccessRole)
    }

    override fun secondaryArtifacts(secondaryArtifacts: IResolvable) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.let(IResolvable::unwrap))
    }

    override fun secondaryArtifacts(secondaryArtifacts: List<Any>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts)
    }

    override fun secondaryArtifacts(vararg secondaryArtifacts: Any): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    override fun secondarySourceVersions(secondarySourceVersions: IResolvable) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions.let(IResolvable::unwrap))
    }

    override fun secondarySourceVersions(secondarySourceVersions: List<Any>) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions)
    }

    override fun secondarySourceVersions(vararg secondarySourceVersions: Any): Unit =
        secondarySourceVersions(secondarySourceVersions.toList())

    override fun secondarySources(secondarySources: IResolvable) {
      cdkBuilder.secondarySources(secondarySources.let(IResolvable::unwrap))
    }

    override fun secondarySources(secondarySources: List<Any>) {
      cdkBuilder.secondarySources(secondarySources)
    }

    override fun secondarySources(vararg secondarySources: Any): Unit =
        secondarySources(secondarySources.toList())

    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("418cfd1c63a6c94fc6abd6b21ba2eea2769b2997ac24a51f4464397a24e0e412")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: ProjectTriggersProperty) {
      cdkBuilder.triggers(triggers.let(ProjectTriggersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6989486a850294b2ed92ef6b257e8ed01cff283d6163bdc1ccd27ee4c4b7a753")
    override fun triggers(triggers: ProjectTriggersProperty.Builder.() -> Unit): Unit =
        triggers(ProjectTriggersProperty(triggers))

    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78a3ddc4357c4f9c956f386a567a0303a2f89eff23a28547bc3546f98d3d0a49")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.codebuild.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.codebuild.CfnProject =
        wrapped.cdkObject
  }

  public interface ProjectCacheProperty {
    public fun location(): String? = unwrap(this).getLocation()

    public fun modes(): List<String> = unwrap(this).getModes() ?: emptyList()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun location(location: String)

      public fun modes(modes: List<String>)

      public fun modes(vararg modes: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.builder()

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun modes(modes: List<String>) {
        cdkBuilder.modes(modes)
      }

      override fun modes(vararg modes: String): Unit = modes(modes.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty,
    ) : CdkObject(cdkObject), ProjectCacheProperty {
      override fun location(): String? = unwrap(this).getLocation()

      override fun modes(): List<String> = unwrap(this).getModes() ?: emptyList()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectCacheProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty):
          ProjectCacheProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectCacheProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty
    }
  }

  public interface CloudWatchLogsConfigProperty {
    public fun groupName(): String? = unwrap(this).getGroupName()

    public fun status(): String

    public fun streamName(): String? = unwrap(this).getStreamName()

    @CdkDslMarker
    public interface Builder {
      public fun groupName(groupName: String)

      public fun status(status: String)

      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.builder()

      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsConfigProperty {
      override fun groupName(): String? = unwrap(this).getGroupName()

      override fun status(): String = unwrap(this).getStatus()

      override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty):
          CloudWatchLogsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty
    }
  }

  public interface ArtifactsProperty {
    public fun artifactIdentifier(): String? = unwrap(this).getArtifactIdentifier()

    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    public fun location(): String? = unwrap(this).getLocation()

    public fun name(): String? = unwrap(this).getName()

    public fun namespaceType(): String? = unwrap(this).getNamespaceType()

    public fun overrideArtifactName(): Any? = unwrap(this).getOverrideArtifactName()

    public fun packaging(): String? = unwrap(this).getPackaging()

    public fun path(): String? = unwrap(this).getPath()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun artifactIdentifier(artifactIdentifier: String)

      public fun encryptionDisabled(encryptionDisabled: Boolean)

      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      public fun location(location: String)

      public fun name(name: String)

      public fun namespaceType(namespaceType: String)

      public fun overrideArtifactName(overrideArtifactName: Boolean)

      public fun overrideArtifactName(overrideArtifactName: IResolvable)

      public fun packaging(packaging: String)

      public fun path(path: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.builder()

      override fun artifactIdentifier(artifactIdentifier: String) {
        cdkBuilder.artifactIdentifier(artifactIdentifier)
      }

      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun namespaceType(namespaceType: String) {
        cdkBuilder.namespaceType(namespaceType)
      }

      override fun overrideArtifactName(overrideArtifactName: Boolean) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
      }

      override fun overrideArtifactName(overrideArtifactName: IResolvable) {
        cdkBuilder.overrideArtifactName(overrideArtifactName.let(IResolvable::unwrap))
      }

      override fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty,
    ) : CdkObject(cdkObject), ArtifactsProperty {
      override fun artifactIdentifier(): String? = unwrap(this).getArtifactIdentifier()

      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      override fun location(): String? = unwrap(this).getLocation()

      override fun name(): String? = unwrap(this).getName()

      override fun namespaceType(): String? = unwrap(this).getNamespaceType()

      override fun overrideArtifactName(): Any? = unwrap(this).getOverrideArtifactName()

      override fun packaging(): String? = unwrap(this).getPackaging()

      override fun path(): String? = unwrap(this).getPath()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty):
          ArtifactsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactsProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty
    }
  }

  public interface BuildStatusConfigProperty {
    public fun context(): String? = unwrap(this).getContext()

    public fun targetUrl(): String? = unwrap(this).getTargetUrl()

    @CdkDslMarker
    public interface Builder {
      public fun context(context: String)

      public fun targetUrl(targetUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty.builder()

      override fun context(context: String) {
        cdkBuilder.context(context)
      }

      override fun targetUrl(targetUrl: String) {
        cdkBuilder.targetUrl(targetUrl)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty,
    ) : CdkObject(cdkObject), BuildStatusConfigProperty {
      override fun context(): String? = unwrap(this).getContext()

      override fun targetUrl(): String? = unwrap(this).getTargetUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BuildStatusConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty):
          BuildStatusConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BuildStatusConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty
    }
  }

  public interface BatchRestrictionsProperty {
    public fun computeTypesAllowed(): List<String> = unwrap(this).getComputeTypesAllowed() ?:
        emptyList()

    public fun maximumBuildsAllowed(): Number? = unwrap(this).getMaximumBuildsAllowed()

    @CdkDslMarker
    public interface Builder {
      public fun computeTypesAllowed(computeTypesAllowed: List<String>)

      public fun computeTypesAllowed(vararg computeTypesAllowed: String)

      public fun maximumBuildsAllowed(maximumBuildsAllowed: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty.builder()

      override fun computeTypesAllowed(computeTypesAllowed: List<String>) {
        cdkBuilder.computeTypesAllowed(computeTypesAllowed)
      }

      override fun computeTypesAllowed(vararg computeTypesAllowed: String): Unit =
          computeTypesAllowed(computeTypesAllowed.toList())

      override fun maximumBuildsAllowed(maximumBuildsAllowed: Number) {
        cdkBuilder.maximumBuildsAllowed(maximumBuildsAllowed)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty,
    ) : CdkObject(cdkObject), BatchRestrictionsProperty {
      override fun computeTypesAllowed(): List<String> = unwrap(this).getComputeTypesAllowed() ?:
          emptyList()

      override fun maximumBuildsAllowed(): Number? = unwrap(this).getMaximumBuildsAllowed()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty):
          BatchRestrictionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRestrictionsProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty
    }
  }

  public interface ProjectBuildBatchConfigProperty {
    public fun batchReportMode(): String? = unwrap(this).getBatchReportMode()

    public fun combineArtifacts(): Any? = unwrap(this).getCombineArtifacts()

    public fun restrictions(): Any? = unwrap(this).getRestrictions()

    public fun serviceRole(): String? = unwrap(this).getServiceRole()

    public fun timeoutInMins(): Number? = unwrap(this).getTimeoutInMins()

    @CdkDslMarker
    public interface Builder {
      public fun batchReportMode(batchReportMode: String)

      public fun combineArtifacts(combineArtifacts: Boolean)

      public fun combineArtifacts(combineArtifacts: IResolvable)

      public fun restrictions(restrictions: IResolvable)

      public fun restrictions(restrictions: BatchRestrictionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01751331ef50dd769676487deeb1add0406ffad963fdd1b3b38d0f20bbbdcf0d")
      public fun restrictions(restrictions: BatchRestrictionsProperty.Builder.() -> Unit)

      public fun serviceRole(serviceRole: String)

      public fun timeoutInMins(timeoutInMins: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty.builder()

      override fun batchReportMode(batchReportMode: String) {
        cdkBuilder.batchReportMode(batchReportMode)
      }

      override fun combineArtifacts(combineArtifacts: Boolean) {
        cdkBuilder.combineArtifacts(combineArtifacts)
      }

      override fun combineArtifacts(combineArtifacts: IResolvable) {
        cdkBuilder.combineArtifacts(combineArtifacts.let(IResolvable::unwrap))
      }

      override fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
      }

      override fun restrictions(restrictions: BatchRestrictionsProperty) {
        cdkBuilder.restrictions(restrictions.let(BatchRestrictionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01751331ef50dd769676487deeb1add0406ffad963fdd1b3b38d0f20bbbdcf0d")
      override fun restrictions(restrictions: BatchRestrictionsProperty.Builder.() -> Unit): Unit =
          restrictions(BatchRestrictionsProperty(restrictions))

      override fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
      }

      override fun timeoutInMins(timeoutInMins: Number) {
        cdkBuilder.timeoutInMins(timeoutInMins)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty,
    ) : CdkObject(cdkObject), ProjectBuildBatchConfigProperty {
      override fun batchReportMode(): String? = unwrap(this).getBatchReportMode()

      override fun combineArtifacts(): Any? = unwrap(this).getCombineArtifacts()

      override fun restrictions(): Any? = unwrap(this).getRestrictions()

      override fun serviceRole(): String? = unwrap(this).getServiceRole()

      override fun timeoutInMins(): Number? = unwrap(this).getTimeoutInMins()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectBuildBatchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty):
          ProjectBuildBatchConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectBuildBatchConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty
    }
  }

  public interface EnvironmentProperty {
    public fun certificate(): String? = unwrap(this).getCertificate()

    public fun computeType(): String

    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    public fun fleet(): Any? = unwrap(this).getFleet()

    public fun image(): String

    public fun imagePullCredentialsType(): String? = unwrap(this).getImagePullCredentialsType()

    public fun privilegedMode(): Any? = unwrap(this).getPrivilegedMode()

    public fun registryCredential(): Any? = unwrap(this).getRegistryCredential()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun certificate(certificate: String)

      public fun computeType(computeType: String)

      public fun environmentVariables(environmentVariables: IResolvable)

      public fun environmentVariables(environmentVariables: List<Any>)

      public fun environmentVariables(vararg environmentVariables: Any)

      public fun fleet(fleet: IResolvable)

      public fun fleet(fleet: ProjectFleetProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e963a710db9474248bb2903fa7622db7928685abf8e7f265afbddcc84e65f8d1")
      public fun fleet(fleet: ProjectFleetProperty.Builder.() -> Unit)

      public fun image(image: String)

      public fun imagePullCredentialsType(imagePullCredentialsType: String)

      public fun privilegedMode(privilegedMode: Boolean)

      public fun privilegedMode(privilegedMode: IResolvable)

      public fun registryCredential(registryCredential: IResolvable)

      public fun registryCredential(registryCredential: RegistryCredentialProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("550b36dfb3bd161ec105f2283a291b87853a40432119e8c4f5a2eb853bcf69be")
      public
          fun registryCredential(registryCredential: RegistryCredentialProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.builder()

      override fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
      }

      override fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
      }

      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      override fun environmentVariables(environmentVariables: List<Any>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      override fun environmentVariables(vararg environmentVariables: Any): Unit =
          environmentVariables(environmentVariables.toList())

      override fun fleet(fleet: IResolvable) {
        cdkBuilder.fleet(fleet.let(IResolvable::unwrap))
      }

      override fun fleet(fleet: ProjectFleetProperty) {
        cdkBuilder.fleet(fleet.let(ProjectFleetProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e963a710db9474248bb2903fa7622db7928685abf8e7f265afbddcc84e65f8d1")
      override fun fleet(fleet: ProjectFleetProperty.Builder.() -> Unit): Unit =
          fleet(ProjectFleetProperty(fleet))

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun imagePullCredentialsType(imagePullCredentialsType: String) {
        cdkBuilder.imagePullCredentialsType(imagePullCredentialsType)
      }

      override fun privilegedMode(privilegedMode: Boolean) {
        cdkBuilder.privilegedMode(privilegedMode)
      }

      override fun privilegedMode(privilegedMode: IResolvable) {
        cdkBuilder.privilegedMode(privilegedMode.let(IResolvable::unwrap))
      }

      override fun registryCredential(registryCredential: IResolvable) {
        cdkBuilder.registryCredential(registryCredential.let(IResolvable::unwrap))
      }

      override fun registryCredential(registryCredential: RegistryCredentialProperty) {
        cdkBuilder.registryCredential(registryCredential.let(RegistryCredentialProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("550b36dfb3bd161ec105f2283a291b87853a40432119e8c4f5a2eb853bcf69be")
      override
          fun registryCredential(registryCredential: RegistryCredentialProperty.Builder.() -> Unit):
          Unit = registryCredential(RegistryCredentialProperty(registryCredential))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty,
    ) : CdkObject(cdkObject), EnvironmentProperty {
      override fun certificate(): String? = unwrap(this).getCertificate()

      override fun computeType(): String = unwrap(this).getComputeType()

      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      override fun fleet(): Any? = unwrap(this).getFleet()

      override fun image(): String = unwrap(this).getImage()

      override fun imagePullCredentialsType(): String? = unwrap(this).getImagePullCredentialsType()

      override fun privilegedMode(): Any? = unwrap(this).getPrivilegedMode()

      override fun registryCredential(): Any? = unwrap(this).getRegistryCredential()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty):
          EnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty
    }
  }

  public interface ProjectFleetProperty {
    public fun fleetArn(): String? = unwrap(this).getFleetArn()

    @CdkDslMarker
    public interface Builder {
      public fun fleetArn(fleetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty.builder()

      override fun fleetArn(fleetArn: String) {
        cdkBuilder.fleetArn(fleetArn)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty,
    ) : CdkObject(cdkObject), ProjectFleetProperty {
      override fun fleetArn(): String? = unwrap(this).getFleetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectFleetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty):
          ProjectFleetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectFleetProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty
    }
  }

  public interface EnvironmentVariableProperty {
    public fun name(): String

    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      override fun name(): String = unwrap(this).getName()

      override fun type(): String? = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty
    }
  }

  public interface LogsConfigProperty {
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb07b1006eeaa9210d3b3ae015fc0b6a3453a558c71c5111539baed39c17e28")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty.Builder.() -> Unit)

      public fun s3Logs(s3Logs: IResolvable)

      public fun s3Logs(s3Logs: S3LogsConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618f8f82e94a6b7f187397fb3469167fa5390128d214ea66723fcd602bc277f1")
      public fun s3Logs(s3Logs: S3LogsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.builder()

      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb07b1006eeaa9210d3b3ae015fc0b6a3453a558c71c5111539baed39c17e28")
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsConfigProperty(cloudWatchLogs))

      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      override fun s3Logs(s3Logs: S3LogsConfigProperty) {
        cdkBuilder.s3Logs(s3Logs.let(S3LogsConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618f8f82e94a6b7f187397fb3469167fa5390128d214ea66723fcd602bc277f1")
      override fun s3Logs(s3Logs: S3LogsConfigProperty.Builder.() -> Unit): Unit =
          s3Logs(S3LogsConfigProperty(s3Logs))

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty,
    ) : CdkObject(cdkObject), LogsConfigProperty {
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty):
          LogsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty
    }
  }

  public interface RegistryCredentialProperty {
    public fun credential(): String

    public fun credentialProvider(): String

    @CdkDslMarker
    public interface Builder {
      public fun credential(credential: String)

      public fun credentialProvider(credentialProvider: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.builder()

      override fun credential(credential: String) {
        cdkBuilder.credential(credential)
      }

      override fun credentialProvider(credentialProvider: String) {
        cdkBuilder.credentialProvider(credentialProvider)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty,
    ) : CdkObject(cdkObject), RegistryCredentialProperty {
      override fun credential(): String = unwrap(this).getCredential()

      override fun credentialProvider(): String = unwrap(this).getCredentialProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegistryCredentialProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty):
          RegistryCredentialProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistryCredentialProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty
    }
  }

  public interface ProjectTriggersProperty {
    public fun buildType(): String? = unwrap(this).getBuildType()

    public fun filterGroups(): Any? = unwrap(this).getFilterGroups()

    public fun webhook(): Any? = unwrap(this).getWebhook()

    @CdkDslMarker
    public interface Builder {
      public fun buildType(buildType: String)

      public fun filterGroups(filterGroups: IResolvable)

      public fun filterGroups(filterGroups: List<Any>)

      public fun filterGroups(vararg filterGroups: Any)

      public fun webhook(webhook: Boolean)

      public fun webhook(webhook: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.builder()

      override fun buildType(buildType: String) {
        cdkBuilder.buildType(buildType)
      }

      override fun filterGroups(filterGroups: IResolvable) {
        cdkBuilder.filterGroups(filterGroups.let(IResolvable::unwrap))
      }

      override fun filterGroups(filterGroups: List<Any>) {
        cdkBuilder.filterGroups(filterGroups)
      }

      override fun filterGroups(vararg filterGroups: Any): Unit =
          filterGroups(filterGroups.toList())

      override fun webhook(webhook: Boolean) {
        cdkBuilder.webhook(webhook)
      }

      override fun webhook(webhook: IResolvable) {
        cdkBuilder.webhook(webhook.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty,
    ) : CdkObject(cdkObject), ProjectTriggersProperty {
      override fun buildType(): String? = unwrap(this).getBuildType()

      override fun filterGroups(): Any? = unwrap(this).getFilterGroups()

      override fun webhook(): Any? = unwrap(this).getWebhook()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectTriggersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty):
          ProjectTriggersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectTriggersProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty
    }
  }

  public interface GitSubmodulesConfigProperty {
    public fun fetchSubmodules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun fetchSubmodules(fetchSubmodules: Boolean)

      public fun fetchSubmodules(fetchSubmodules: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.builder()

      override fun fetchSubmodules(fetchSubmodules: Boolean) {
        cdkBuilder.fetchSubmodules(fetchSubmodules)
      }

      override fun fetchSubmodules(fetchSubmodules: IResolvable) {
        cdkBuilder.fetchSubmodules(fetchSubmodules.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty,
    ) : CdkObject(cdkObject), GitSubmodulesConfigProperty {
      override fun fetchSubmodules(): Any = unwrap(this).getFetchSubmodules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitSubmodulesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty):
          GitSubmodulesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitSubmodulesConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty
    }
  }

  public interface S3LogsConfigProperty {
    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    public fun location(): String? = unwrap(this).getLocation()

    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun encryptionDisabled(encryptionDisabled: Boolean)

      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      public fun location(location: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.builder()

      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty,
    ) : CdkObject(cdkObject), S3LogsConfigProperty {
      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      override fun location(): String? = unwrap(this).getLocation()

      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty):
          S3LogsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty
    }
  }

  public interface ProjectFileSystemLocationProperty {
    public fun identifier(): String

    public fun location(): String

    public fun mountOptions(): String? = unwrap(this).getMountOptions()

    public fun mountPoint(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun identifier(identifier: String)

      public fun location(location: String)

      public fun mountOptions(mountOptions: String)

      public fun mountPoint(mountPoint: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.builder()

      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun mountOptions(mountOptions: String) {
        cdkBuilder.mountOptions(mountOptions)
      }

      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty,
    ) : CdkObject(cdkObject), ProjectFileSystemLocationProperty {
      override fun identifier(): String = unwrap(this).getIdentifier()

      override fun location(): String = unwrap(this).getLocation()

      override fun mountOptions(): String? = unwrap(this).getMountOptions()

      override fun mountPoint(): String = unwrap(this).getMountPoint()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProjectFileSystemLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty):
          ProjectFileSystemLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectFileSystemLocationProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty
    }
  }

  public interface SourceAuthProperty {
    public fun resource(): String? = unwrap(this).getResource()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun resource(resource: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.builder()

      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty,
    ) : CdkObject(cdkObject), SourceAuthProperty {
      override fun resource(): String? = unwrap(this).getResource()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty):
          SourceAuthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAuthProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty
    }
  }

  public interface ProjectSourceVersionProperty {
    public fun sourceIdentifier(): String

    public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    @CdkDslMarker
    public interface Builder {
      public fun sourceIdentifier(sourceIdentifier: String)

      public fun sourceVersion(sourceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.builder()

      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      override fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty,
    ) : CdkObject(cdkObject), ProjectSourceVersionProperty {
      override fun sourceIdentifier(): String = unwrap(this).getSourceIdentifier()

      override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectSourceVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty):
          ProjectSourceVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectSourceVersionProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty
    }
  }

  public interface WebhookFilterProperty {
    public fun excludeMatchedPattern(): Any? = unwrap(this).getExcludeMatchedPattern()

    public fun pattern(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun excludeMatchedPattern(excludeMatchedPattern: Boolean)

      public fun excludeMatchedPattern(excludeMatchedPattern: IResolvable)

      public fun pattern(pattern: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.builder()

      override fun excludeMatchedPattern(excludeMatchedPattern: Boolean) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
      }

      override fun excludeMatchedPattern(excludeMatchedPattern: IResolvable) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern.let(IResolvable::unwrap))
      }

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty,
    ) : CdkObject(cdkObject), WebhookFilterProperty {
      override fun excludeMatchedPattern(): Any? = unwrap(this).getExcludeMatchedPattern()

      override fun pattern(): String = unwrap(this).getPattern()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebhookFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty):
          WebhookFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebhookFilterProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)

      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty
    }
  }

  public interface SourceProperty {
    public fun auth(): Any? = unwrap(this).getAuth()

    public fun buildSpec(): String? = unwrap(this).getBuildSpec()

    public fun buildStatusConfig(): Any? = unwrap(this).getBuildStatusConfig()

    public fun gitCloneDepth(): Number? = unwrap(this).getGitCloneDepth()

    public fun gitSubmodulesConfig(): Any? = unwrap(this).getGitSubmodulesConfig()

    public fun insecureSsl(): Any? = unwrap(this).getInsecureSsl()

    public fun location(): String? = unwrap(this).getLocation()

    public fun reportBuildStatus(): Any? = unwrap(this).getReportBuildStatus()

    public fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun auth(auth: IResolvable)

      public fun auth(auth: SourceAuthProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01b1a50446487485d9436e692397d44744f4240c10d85d6e14283a7bc9a2de4")
      public fun auth(auth: SourceAuthProperty.Builder.() -> Unit)

      public fun buildSpec(buildSpec: String)

      public fun buildStatusConfig(buildStatusConfig: IResolvable)

      public fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ae6a4677b24efcacc3648f76cb5e8ef8aa5495620f6f2e32b0258d57d687a47")
      public fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty.Builder.() -> Unit)

      public fun gitCloneDepth(gitCloneDepth: Number)

      public fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable)

      public fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("648c0ad47d51754c0470a5118c7f95052d27f7158fd3e8aa306fdcd60e3ad2b2")
      public
          fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty.Builder.() -> Unit)

      public fun insecureSsl(insecureSsl: Boolean)

      public fun insecureSsl(insecureSsl: IResolvable)

      public fun location(location: String)

      public fun reportBuildStatus(reportBuildStatus: Boolean)

      public fun reportBuildStatus(reportBuildStatus: IResolvable)

      public fun sourceIdentifier(sourceIdentifier: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.builder()

      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      override fun auth(auth: SourceAuthProperty) {
        cdkBuilder.auth(auth.let(SourceAuthProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01b1a50446487485d9436e692397d44744f4240c10d85d6e14283a7bc9a2de4")
      override fun auth(auth: SourceAuthProperty.Builder.() -> Unit): Unit =
          auth(SourceAuthProperty(auth))

      override fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
      }

      override fun buildStatusConfig(buildStatusConfig: IResolvable) {
        cdkBuilder.buildStatusConfig(buildStatusConfig.let(IResolvable::unwrap))
      }

      override fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty) {
        cdkBuilder.buildStatusConfig(buildStatusConfig.let(BuildStatusConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ae6a4677b24efcacc3648f76cb5e8ef8aa5495620f6f2e32b0258d57d687a47")
      override
          fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty.Builder.() -> Unit):
          Unit = buildStatusConfig(BuildStatusConfigProperty(buildStatusConfig))

      override fun gitCloneDepth(gitCloneDepth: Number) {
        cdkBuilder.gitCloneDepth(gitCloneDepth)
      }

      override fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig.let(IResolvable::unwrap))
      }

      override fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig.let(GitSubmodulesConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("648c0ad47d51754c0470a5118c7f95052d27f7158fd3e8aa306fdcd60e3ad2b2")
      override
          fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty.Builder.() -> Unit):
          Unit = gitSubmodulesConfig(GitSubmodulesConfigProperty(gitSubmodulesConfig))

      override fun insecureSsl(insecureSsl: Boolean) {
        cdkBuilder.insecureSsl(insecureSsl)
      }

      override fun insecureSsl(insecureSsl: IResolvable) {
        cdkBuilder.insecureSsl(insecureSsl.let(IResolvable::unwrap))
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun reportBuildStatus(reportBuildStatus: Boolean) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
      }

      override fun reportBuildStatus(reportBuildStatus: IResolvable) {
        cdkBuilder.reportBuildStatus(reportBuildStatus.let(IResolvable::unwrap))
      }

      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      override fun auth(): Any? = unwrap(this).getAuth()

      override fun buildSpec(): String? = unwrap(this).getBuildSpec()

      override fun buildStatusConfig(): Any? = unwrap(this).getBuildStatusConfig()

      override fun gitCloneDepth(): Number? = unwrap(this).getGitCloneDepth()

      override fun gitSubmodulesConfig(): Any? = unwrap(this).getGitSubmodulesConfig()

      override fun insecureSsl(): Any? = unwrap(this).getInsecureSsl()

      override fun location(): String? = unwrap(this).getLocation()

      override fun reportBuildStatus(): Any? = unwrap(this).getReportBuildStatus()

      override fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty
    }
  }
}
