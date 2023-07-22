@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.AliasAttributes
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class AliasAttributesDsl {
  private val cdkBuilder: AliasAttributes.Builder = AliasAttributes.builder()

  /**
   * @param aliasName Specifies the alias name. 
   * This value must begin with alias/ followed by a name (i.e. alias/ExampleAlias)
   */
  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  /**
   * @param aliasTargetKey The customer master key (CMK) to which the Alias refers. 
   */
  public fun aliasTargetKey(aliasTargetKey: IKey) {
    cdkBuilder.aliasTargetKey(aliasTargetKey)
  }

  public fun build(): AliasAttributes = cdkBuilder.build()
}
