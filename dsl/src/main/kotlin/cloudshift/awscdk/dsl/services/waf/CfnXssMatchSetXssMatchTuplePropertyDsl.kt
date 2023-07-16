@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnXssMatchSet

@CdkDslMarker
public class CfnXssMatchSetXssMatchTuplePropertyDsl {
  private val cdkBuilder: CfnXssMatchSet.XssMatchTupleProperty.Builder =
      CfnXssMatchSet.XssMatchTupleProperty.builder()

  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun fieldToMatch(fieldToMatch: CfnXssMatchSet.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun textTransformation(textTransformation: String) {
    cdkBuilder.textTransformation(textTransformation)
  }

  public fun build(): CfnXssMatchSet.XssMatchTupleProperty = cdkBuilder.build()
}
