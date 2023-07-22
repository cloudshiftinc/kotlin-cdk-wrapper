@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object statement;
 * IAMPolicyDocumentProperty iAMPolicyDocumentProperty = Map.of(
 * "statement", statement,
 * // the properties below are optional
 * "version", "version");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iampolicydocument.html)
 */
@CdkDslMarker
public class CfnFunctionIAMPolicyDocumentPropertyDsl {
  private val cdkBuilder: CfnFunction.IAMPolicyDocumentProperty.Builder =
      CfnFunction.IAMPolicyDocumentProperty.builder()

  /**
   * @param statement the value to be set. 
   */
  public fun statement(statement: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(statement)
    cdkBuilder.statement(builder.map)
  }

  /**
   * @param statement the value to be set. 
   */
  public fun statement(statement: Any) {
    cdkBuilder.statement(statement)
  }

  /**
   * @param version the value to be set.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnFunction.IAMPolicyDocumentProperty = cdkBuilder.build()
}
