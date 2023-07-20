@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.AliasAttributes
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class AliasAttributesDsl {
  private val cdkBuilder: AliasAttributes.Builder = AliasAttributes.builder()

  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  public fun aliasTargetKey(aliasTargetKey: IKey) {
    cdkBuilder.aliasTargetKey(aliasTargetKey)
  }

  public fun build(): AliasAttributes = cdkBuilder.build()
}
