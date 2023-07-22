@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexValueImportanceItemPropertyDsl {
  private val cdkBuilder: CfnIndex.ValueImportanceItemProperty.Builder =
      CfnIndex.ValueImportanceItemProperty.builder()

  /**
   * @param key The document metadata value used for the search boost.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The boost value for a document when the key is part of the metadata of a document.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIndex.ValueImportanceItemProperty = cdkBuilder.build()
}
