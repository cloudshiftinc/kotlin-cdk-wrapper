@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import software.constructs.Construct

@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  private val _fileSystemLocations: MutableList<Any> = mutableListOf()

  private val _secondaryArtifacts: MutableList<Any> = mutableListOf()

  private val _secondarySourceVersions: MutableList<Any> = mutableListOf()

  private val _secondarySources: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun artifacts(artifacts: IResolvable) {
    cdkBuilder.artifacts(artifacts)
  }

  public fun artifacts(artifacts: CfnProject.ArtifactsProperty) {
    cdkBuilder.artifacts(artifacts)
  }

  public fun badgeEnabled(badgeEnabled: Boolean) {
    cdkBuilder.badgeEnabled(badgeEnabled)
  }

  public fun badgeEnabled(badgeEnabled: IResolvable) {
    cdkBuilder.badgeEnabled(badgeEnabled)
  }

  public fun buildBatchConfig(buildBatchConfig: IResolvable) {
    cdkBuilder.buildBatchConfig(buildBatchConfig)
  }

  public fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty) {
    cdkBuilder.buildBatchConfig(buildBatchConfig)
  }

  public fun cache(cache: IResolvable) {
    cdkBuilder.cache(cache)
  }

  public fun cache(cache: CfnProject.ProjectCacheProperty) {
    cdkBuilder.cache(cache)
  }

  public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
    cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun encryptionKey(encryptionKey: String) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun environment(environment: CfnProject.EnvironmentProperty) {
    cdkBuilder.environment(environment)
  }

  public fun fileSystemLocations(vararg fileSystemLocations: Any) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  public fun fileSystemLocations(fileSystemLocations: Collection<Any>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  public fun fileSystemLocations(fileSystemLocations: IResolvable) {
    cdkBuilder.fileSystemLocations(fileSystemLocations)
  }

  public fun logsConfig(logsConfig: IResolvable) {
    cdkBuilder.logsConfig(logsConfig)
  }

  public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty) {
    cdkBuilder.logsConfig(logsConfig)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number) {
    cdkBuilder.queuedTimeoutInMinutes(queuedTimeoutInMinutes)
  }

  public fun resourceAccessRole(resourceAccessRole: String) {
    cdkBuilder.resourceAccessRole(resourceAccessRole)
  }

  public fun secondaryArtifacts(vararg secondaryArtifacts: Any) {
    _secondaryArtifacts.addAll(listOf(*secondaryArtifacts))
  }

  public fun secondaryArtifacts(secondaryArtifacts: Collection<Any>) {
    _secondaryArtifacts.addAll(secondaryArtifacts)
  }

  public fun secondaryArtifacts(secondaryArtifacts: IResolvable) {
    cdkBuilder.secondaryArtifacts(secondaryArtifacts)
  }

  public fun secondarySourceVersions(vararg secondarySourceVersions: Any) {
    _secondarySourceVersions.addAll(listOf(*secondarySourceVersions))
  }

  public fun secondarySourceVersions(secondarySourceVersions: Collection<Any>) {
    _secondarySourceVersions.addAll(secondarySourceVersions)
  }

  public fun secondarySourceVersions(secondarySourceVersions: IResolvable) {
    cdkBuilder.secondarySourceVersions(secondarySourceVersions)
  }

  public fun secondarySources(vararg secondarySources: Any) {
    _secondarySources.addAll(listOf(*secondarySources))
  }

  public fun secondarySources(secondarySources: Collection<Any>) {
    _secondarySources.addAll(secondarySources)
  }

  public fun secondarySources(secondarySources: IResolvable) {
    cdkBuilder.secondarySources(secondarySources)
  }

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  public fun source(source: CfnProject.SourceProperty) {
    cdkBuilder.source(source)
  }

  public fun sourceVersion(sourceVersion: String) {
    cdkBuilder.sourceVersion(sourceVersion)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun timeoutInMinutes(timeoutInMinutes: Number) {
    cdkBuilder.timeoutInMinutes(timeoutInMinutes)
  }

  public fun triggers(triggers: IResolvable) {
    cdkBuilder.triggers(triggers)
  }

  public fun triggers(triggers: CfnProject.ProjectTriggersProperty) {
    cdkBuilder.triggers(triggers)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnProject {
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_secondaryArtifacts.isNotEmpty()) cdkBuilder.secondaryArtifacts(_secondaryArtifacts)
    if(_secondarySourceVersions.isNotEmpty())
        cdkBuilder.secondarySourceVersions(_secondarySourceVersions)
    if(_secondarySources.isNotEmpty()) cdkBuilder.secondarySources(_secondarySources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
