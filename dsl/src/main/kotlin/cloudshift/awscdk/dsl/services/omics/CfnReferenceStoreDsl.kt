@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.constructs.Construct

@CdkDslMarker
public class CfnReferenceStoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReferenceStore.Builder = CfnReferenceStore.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnReferenceStore = cdkBuilder.build()
}
