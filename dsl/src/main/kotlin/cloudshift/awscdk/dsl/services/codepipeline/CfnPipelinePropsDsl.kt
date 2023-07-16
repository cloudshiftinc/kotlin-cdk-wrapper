@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps

@CdkDslMarker
public class CfnPipelinePropsDsl {
  private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

  private val _artifactStores: MutableList<Any> = mutableListOf()

  private val _disableInboundStageTransitions: MutableList<Any> = mutableListOf()

  private val _stages: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun artifactStore(artifactStore: IResolvable) {
    cdkBuilder.artifactStore(artifactStore)
  }

  public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
    cdkBuilder.artifactStore(artifactStore)
  }

  public fun artifactStores(vararg artifactStores: Any) {
    _artifactStores.addAll(listOf(*artifactStores))
  }

  public fun artifactStores(artifactStores: Collection<Any>) {
    _artifactStores.addAll(artifactStores)
  }

  public fun artifactStores(artifactStores: IResolvable) {
    cdkBuilder.artifactStores(artifactStores)
  }

  public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any) {
    _disableInboundStageTransitions.addAll(listOf(*disableInboundStageTransitions))
  }

  public fun disableInboundStageTransitions(disableInboundStageTransitions: Collection<Any>) {
    _disableInboundStageTransitions.addAll(disableInboundStageTransitions)
  }

  public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
    cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
    cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
  }

  public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
    cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stages(vararg stages: Any) {
    _stages.addAll(listOf(*stages))
  }

  public fun stages(stages: Collection<Any>) {
    _stages.addAll(stages)
  }

  public fun stages(stages: IResolvable) {
    cdkBuilder.stages(stages)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPipelineProps {
    if(_artifactStores.isNotEmpty()) cdkBuilder.artifactStores(_artifactStores)
    if(_disableInboundStageTransitions.isNotEmpty())
        cdkBuilder.disableInboundStageTransitions(_disableInboundStageTransitions)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
