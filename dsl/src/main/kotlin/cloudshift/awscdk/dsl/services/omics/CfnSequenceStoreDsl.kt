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

  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
   * @param description A description for the store. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An S3 URI representing the bucket and folder to store failed read set uploads.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-fallbacklocation)
   * @param fallbackLocation An S3 URI representing the bucket and folder to store failed read set
   * uploads. 
   */
  public fun fallbackLocation(fallbackLocation: String) {
    cdkBuilder.fallbackLocation(fallbackLocation)
  }

  /**
   * A name for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-name)
   * @param name A name for the store. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
   * @param sseConfig Server-side encryption (SSE) settings for the store. 
   */
  public fun sseConfig(sseConfig: IResolvable) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
   * @param sseConfig Server-side encryption (SSE) settings for the store. 
   */
  public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
    cdkBuilder.sseConfig(sseConfig)
  }

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-tags)
   * @param tags Tags for the store. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSequenceStore = cdkBuilder.build()
}
