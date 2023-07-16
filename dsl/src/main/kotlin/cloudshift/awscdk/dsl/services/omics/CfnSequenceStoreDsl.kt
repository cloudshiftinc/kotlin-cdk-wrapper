@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.constructs.Construct

@CdkDslMarker
public class CfnSequenceStoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSequenceStore.Builder = CfnSequenceStore.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fallbackLocation(fallbackLocation: String) {
    cdkBuilder.fallbackLocation(fallbackLocation)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSequenceStore = cdkBuilder.build()
}
