@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet

@CdkDslMarker
public class CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl {
  private val cdkBuilder: CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder =
      CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder()

  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun fieldToMatch(fieldToMatch: CfnSqlInjectionMatchSet.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun textTransformation(textTransformation: String) {
    cdkBuilder.textTransformation(textTransformation)
  }

  public fun build(): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty = cdkBuilder.build()
}
