@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.KeyLookupOptions

@CdkDslMarker
public class KeyLookupOptionsDsl {
  private val cdkBuilder: KeyLookupOptions.Builder = KeyLookupOptions.builder()

  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  public fun build(): KeyLookupOptions = cdkBuilder.build()
}
