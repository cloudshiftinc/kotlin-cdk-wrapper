@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps

@CdkDslMarker
public class CfnPipePropsDsl {
  private val cdkBuilder: CfnPipeProps.Builder = CfnPipeProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  public fun enrichment(enrichment: String) {
    cdkBuilder.enrichment(enrichment)
  }

  public fun enrichmentParameters(enrichmentParameters: IResolvable) {
    cdkBuilder.enrichmentParameters(enrichmentParameters)
  }

  public fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty) {
    cdkBuilder.enrichmentParameters(enrichmentParameters)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun sourceParameters(sourceParameters: IResolvable) {
    cdkBuilder.sourceParameters(sourceParameters)
  }

  public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
    cdkBuilder.sourceParameters(sourceParameters)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun targetParameters(targetParameters: IResolvable) {
    cdkBuilder.targetParameters(targetParameters)
  }

  public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
    cdkBuilder.targetParameters(targetParameters)
  }

  public fun build(): CfnPipeProps = cdkBuilder.build()
}
