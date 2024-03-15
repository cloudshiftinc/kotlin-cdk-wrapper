@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  public fun artifacts(): Any

  public fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

  public fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

  public fun cache(): Any? = unwrap(this).getCache()

  public fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

  public fun description(): String? = unwrap(this).getDescription()

  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public fun environment(): Any

  public fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  public fun logsConfig(): Any? = unwrap(this).getLogsConfig()

  public fun name(): String? = unwrap(this).getName()

  public fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

  public fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

  public fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

  public fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

  public fun secondarySources(): Any? = unwrap(this).getSecondarySources()

  public fun serviceRole(): String

  public fun source(): Any

  public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  public fun triggers(): Any? = unwrap(this).getTriggers()

  public fun visibility(): String? = unwrap(this).getVisibility()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun artifacts(artifacts: IResolvable)

    public fun artifacts(artifacts: CfnProject.ArtifactsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85703c5a858300e67fa209c09cf6a9af69098429d94cbe4fc75683956b91eb73")
    public fun artifacts(artifacts: CfnProject.ArtifactsProperty.Builder.() -> Unit)

    public fun badgeEnabled(badgeEnabled: Boolean)

    public fun badgeEnabled(badgeEnabled: IResolvable)

    public fun buildBatchConfig(buildBatchConfig: IResolvable)

    public fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3da73b7c1d6f111b6fdbde193162aa946babb5ff702ad03cf5f018c871a6329")
    public
        fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty.Builder.() -> Unit)

    public fun cache(cache: IResolvable)

    public fun cache(cache: CfnProject.ProjectCacheProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d4d09eb6547b5c5accd5ad8ad4a4a7fe0db4974c7ad2d68a3d3946975706d66")
    public fun cache(cache: CfnProject.ProjectCacheProperty.Builder.() -> Unit)

    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    public fun description(description: String)

    public fun encryptionKey(encryptionKey: String)

    public fun environment(environment: IResolvable)

    public fun environment(environment: CfnProject.EnvironmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9cdf398c035540468d5c71e86b9feb3487f52705d1e593aaa65d5469416ec28")
    public fun environment(environment: CfnProject.EnvironmentProperty.Builder.() -> Unit)

    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    public fun logsConfig(logsConfig: IResolvable)

    public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1358491d9a40ea508895c9c69d5000456da043c7be9a6ff51c658e62a10abe94")
    public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty.Builder.() -> Unit)

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

    public fun source(source: CfnProject.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1b4991468e05b21ec848e4a3d0b464f352235fe406e2a0bd807f7e9523a497")
    public fun source(source: CfnProject.SourceProperty.Builder.() -> Unit)

    public fun sourceVersion(sourceVersion: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutInMinutes(timeoutInMinutes: Number)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: CfnProject.ProjectTriggersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1db824e687ec2a29c01ae49dd4541a953684017d73ebae18ee88e77548f89a")
    public fun triggers(triggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit)

    public fun visibility(visibility: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f8eb6c366745be13332c59b83ddfeae643d8f7a801656936456577814b4bdf")
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnProjectProps.builder()

    override fun artifacts(artifacts: IResolvable) {
      cdkBuilder.artifacts(artifacts.let(IResolvable::unwrap))
    }

    override fun artifacts(artifacts: CfnProject.ArtifactsProperty) {
      cdkBuilder.artifacts(artifacts.let(CfnProject.ArtifactsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85703c5a858300e67fa209c09cf6a9af69098429d94cbe4fc75683956b91eb73")
    override fun artifacts(artifacts: CfnProject.ArtifactsProperty.Builder.() -> Unit): Unit =
        artifacts(CfnProject.ArtifactsProperty(artifacts))

    override fun badgeEnabled(badgeEnabled: Boolean) {
      cdkBuilder.badgeEnabled(badgeEnabled)
    }

    override fun badgeEnabled(badgeEnabled: IResolvable) {
      cdkBuilder.badgeEnabled(badgeEnabled.let(IResolvable::unwrap))
    }

    override fun buildBatchConfig(buildBatchConfig: IResolvable) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(IResolvable::unwrap))
    }

    override fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(CfnProject.ProjectBuildBatchConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3da73b7c1d6f111b6fdbde193162aa946babb5ff702ad03cf5f018c871a6329")
    override
        fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty.Builder.() -> Unit):
        Unit = buildBatchConfig(CfnProject.ProjectBuildBatchConfigProperty(buildBatchConfig))

    override fun cache(cache: IResolvable) {
      cdkBuilder.cache(cache.let(IResolvable::unwrap))
    }

    override fun cache(cache: CfnProject.ProjectCacheProperty) {
      cdkBuilder.cache(cache.let(CfnProject.ProjectCacheProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d4d09eb6547b5c5accd5ad8ad4a4a7fe0db4974c7ad2d68a3d3946975706d66")
    override fun cache(cache: CfnProject.ProjectCacheProperty.Builder.() -> Unit): Unit =
        cache(CfnProject.ProjectCacheProperty(cache))

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

    override fun environment(environment: CfnProject.EnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnProject.EnvironmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9cdf398c035540468d5c71e86b9feb3487f52705d1e593aaa65d5469416ec28")
    override fun environment(environment: CfnProject.EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(CfnProject.EnvironmentProperty(environment))

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

    override fun logsConfig(logsConfig: CfnProject.LogsConfigProperty) {
      cdkBuilder.logsConfig(logsConfig.let(CfnProject.LogsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1358491d9a40ea508895c9c69d5000456da043c7be9a6ff51c658e62a10abe94")
    override fun logsConfig(logsConfig: CfnProject.LogsConfigProperty.Builder.() -> Unit): Unit =
        logsConfig(CfnProject.LogsConfigProperty(logsConfig))

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

    override fun source(source: CfnProject.SourceProperty) {
      cdkBuilder.source(source.let(CfnProject.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1b4991468e05b21ec848e4a3d0b464f352235fe406e2a0bd807f7e9523a497")
    override fun source(source: CfnProject.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnProject.SourceProperty(source))

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

    override fun triggers(triggers: CfnProject.ProjectTriggersProperty) {
      cdkBuilder.triggers(triggers.let(CfnProject.ProjectTriggersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1db824e687ec2a29c01ae49dd4541a953684017d73ebae18ee88e77548f89a")
    override fun triggers(triggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit): Unit =
        triggers(CfnProject.ProjectTriggersProperty(triggers))

    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnProject.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f8eb6c366745be13332c59b83ddfeae643d8f7a801656936456577814b4bdf")
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnProject.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.codebuild.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun artifacts(): Any = unwrap(this).getArtifacts()

    override fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

    override fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

    override fun cache(): Any? = unwrap(this).getCache()

    override fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

    override fun description(): String? = unwrap(this).getDescription()

    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    override fun environment(): Any = unwrap(this).getEnvironment()

    override fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

    override fun logsConfig(): Any? = unwrap(this).getLogsConfig()

    override fun name(): String? = unwrap(this).getName()

    override fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

    override fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

    override fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

    override fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

    override fun secondarySources(): Any? = unwrap(this).getSecondarySources()

    override fun serviceRole(): String = unwrap(this).getServiceRole()

    override fun source(): Any = unwrap(this).getSource()

    override fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

    override fun triggers(): Any? = unwrap(this).getTriggers()

    override fun visibility(): String? = unwrap(this).getVisibility()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.codebuild.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.CfnProjectProps
  }
}
