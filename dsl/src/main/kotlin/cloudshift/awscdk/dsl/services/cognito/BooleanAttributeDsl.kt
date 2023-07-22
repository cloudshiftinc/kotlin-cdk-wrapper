@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.BooleanAttribute

@CdkDslMarker
public class BooleanAttributeDsl {
  private val cdkBuilder: BooleanAttribute.Builder = BooleanAttribute.Builder.create()

  /**
   * Specifies whether the value of the attribute can be changed.
   *
   * For any user pool attribute that's mapped to an identity provider attribute, you must set this
   * parameter to true.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   *
   * Default: false
   *
   * @param mutable Specifies whether the value of the attribute can be changed. 
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): BooleanAttribute = cdkBuilder.build()
}
