@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnAnnotationStore

/**
 * Server-side encryption (SSE) settings for a store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html)
 */
@CdkDslMarker
public class CfnAnnotationStoreSseConfigPropertyDsl {
  private val cdkBuilder: CfnAnnotationStore.SseConfigProperty.Builder =
      CfnAnnotationStore.SseConfigProperty.builder()

  /**
   * @param keyArn An encryption key ARN.
   */
  public fun keyArn(keyArn: String) {
    cdkBuilder.keyArn(keyArn)
  }

  /**
   * @param type The encryption type. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnnotationStore.SseConfigProperty = cdkBuilder.build()
}
