@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnByteMatchSet

@CdkDslMarker
public class CfnByteMatchSetByteMatchTuplePropertyDsl {
  private val cdkBuilder: CfnByteMatchSet.ByteMatchTupleProperty.Builder =
      CfnByteMatchSet.ByteMatchTupleProperty.builder()

  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun fieldToMatch(fieldToMatch: CfnByteMatchSet.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  public fun positionalConstraint(positionalConstraint: String) {
    cdkBuilder.positionalConstraint(positionalConstraint)
  }

  public fun targetString(targetString: String) {
    cdkBuilder.targetString(targetString)
  }

  public fun targetStringBase64(targetStringBase64: String) {
    cdkBuilder.targetStringBase64(targetStringBase64)
  }

  public fun textTransformation(textTransformation: String) {
    cdkBuilder.textTransformation(textTransformation)
  }

  public fun build(): CfnByteMatchSet.ByteMatchTupleProperty = cdkBuilder.build()
}
