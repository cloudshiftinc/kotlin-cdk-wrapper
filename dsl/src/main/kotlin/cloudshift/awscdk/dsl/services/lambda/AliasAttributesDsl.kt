@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.AliasAttributes
import software.amazon.awscdk.services.lambda.IVersion

@CdkDslMarker
public class AliasAttributesDsl {
  private val cdkBuilder: AliasAttributes.Builder = AliasAttributes.builder()

  /**
   * @param aliasName the value to be set. 
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * @param aliasVersion the value to be set. 
   */
  public fun aliasVersion(aliasVersion: IVersion) {
    cdkBuilder.aliasVersion(aliasVersion)
  }

  public fun build(): AliasAttributes = cdkBuilder.build()
}
