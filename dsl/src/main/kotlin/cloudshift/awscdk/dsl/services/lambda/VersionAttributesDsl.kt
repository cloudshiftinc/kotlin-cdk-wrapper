@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.VersionAttributes

@CdkDslMarker
public class VersionAttributesDsl {
  private val cdkBuilder: VersionAttributes.Builder = VersionAttributes.builder()

  /**
   * @param lambda The lambda function. 
   */
  public fun lambda(lambda: IFunction) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param version The version. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): VersionAttributes = cdkBuilder.build()
}
