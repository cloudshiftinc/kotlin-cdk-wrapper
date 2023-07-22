@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.ResourceBindOptions

@CdkDslMarker
public class ResourceBindOptionsDsl {
  private val cdkBuilder: ResourceBindOptions.Builder = ResourceBindOptions.builder()

  /**
   * @param resourceProperty The name of the CloudFormation property to annotate with asset
   * metadata.
   */
  public fun resourceProperty(resourceProperty: String) {
    cdkBuilder.resourceProperty(resourceProperty)
  }

  public fun build(): ResourceBindOptions = cdkBuilder.build()
}
