@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.amazon.awscdk.pipelines.DockerCredential
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class CodePipelinePropsDsl {
  private val cdkBuilder: CodePipelineProps.Builder = CodePipelineProps.builder()

  private val _dockerCredentials: MutableList<DockerCredential> = mutableListOf()

  public fun artifactBucket(artifactBucket: IBucket) {
    cdkBuilder.artifactBucket(artifactBucket)
  }

  public fun assetPublishingCodeBuildDefaults(block: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(block)
    cdkBuilder.assetPublishingCodeBuildDefaults(builder.build())
  }

  public fun assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.assetPublishingCodeBuildDefaults(assetPublishingCodeBuildDefaults)
  }

  public fun cliVersion(cliVersion: String) {
    cdkBuilder.cliVersion(cliVersion)
  }

  public fun codeBuildDefaults(block: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(block)
    cdkBuilder.codeBuildDefaults(builder.build())
  }

  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.codeBuildDefaults(codeBuildDefaults)
  }

  public fun codePipeline(codePipeline: Pipeline) {
    cdkBuilder.codePipeline(codePipeline)
  }

  public fun crossAccountKeys(crossAccountKeys: Boolean) {
    cdkBuilder.crossAccountKeys(crossAccountKeys)
  }

  public fun dockerCredentials(vararg dockerCredentials: DockerCredential) {
    _dockerCredentials.addAll(listOf(*dockerCredentials))
  }

  public fun dockerCredentials(dockerCredentials: Collection<DockerCredential>) {
    _dockerCredentials.addAll(dockerCredentials)
  }

  public fun dockerEnabledForSelfMutation(dockerEnabledForSelfMutation: Boolean) {
    cdkBuilder.dockerEnabledForSelfMutation(dockerEnabledForSelfMutation)
  }

  public fun dockerEnabledForSynth(dockerEnabledForSynth: Boolean) {
    cdkBuilder.dockerEnabledForSynth(dockerEnabledForSynth)
  }

  public fun enableKeyRotation(enableKeyRotation: Boolean) {
    cdkBuilder.enableKeyRotation(enableKeyRotation)
  }

  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  public fun publishAssetsInParallel(publishAssetsInParallel: Boolean) {
    cdkBuilder.publishAssetsInParallel(publishAssetsInParallel)
  }

  public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
    cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun selfMutation(selfMutation: Boolean) {
    cdkBuilder.selfMutation(selfMutation)
  }

  public fun selfMutationCodeBuildDefaults(block: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(block)
    cdkBuilder.selfMutationCodeBuildDefaults(builder.build())
  }

  public fun selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.selfMutationCodeBuildDefaults(selfMutationCodeBuildDefaults)
  }

  public fun synth(synth: IFileSetProducer) {
    cdkBuilder.synth(synth)
  }

  public fun synthCodeBuildDefaults(block: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(block)
    cdkBuilder.synthCodeBuildDefaults(builder.build())
  }

  public fun synthCodeBuildDefaults(synthCodeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.synthCodeBuildDefaults(synthCodeBuildDefaults)
  }

  public fun useChangeSets(useChangeSets: Boolean) {
    cdkBuilder.useChangeSets(useChangeSets)
  }

  public fun build(): CodePipelineProps {
    if(_dockerCredentials.isNotEmpty()) cdkBuilder.dockerCredentials(_dockerCredentials)
    return cdkBuilder.build()
  }
}
