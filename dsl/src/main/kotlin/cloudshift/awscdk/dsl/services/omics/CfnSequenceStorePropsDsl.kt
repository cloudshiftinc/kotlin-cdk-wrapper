@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStoreProps

@CdkDslMarker
public class CfnSequenceStorePropsDsl {
  private val cdkBuilder: CfnSequenceStoreProps.Builder = CfnSequenceStoreProps.builder()

  /**
   * @param description A description for the store.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param fallbackLocation An S3 URI representing the bucket and folder to store failed read set
   * uploads.
   */
  public fun fallbackLocation(fallbackLocation: String) {
    cdkBuilder.fallbackLocation(fallbackLocation)
  }

  /**
   * @param name A name for the store. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sseConfig Server-side encryption (SSE) settings for the store.
   */
  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * @param sseConfig Server-side encryption (SSE) settings for the store.
   */
  public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * @param tags Tags for the store.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSequenceStoreProps = cdkBuilder.build()
}
