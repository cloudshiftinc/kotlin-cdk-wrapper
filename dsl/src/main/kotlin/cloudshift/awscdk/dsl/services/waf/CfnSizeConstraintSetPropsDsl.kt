@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps

/**
 * Properties for defining a `CfnSizeConstraintSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnSizeConstraintSetProps cfnSizeConstraintSetProps = CfnSizeConstraintSetProps.builder()
 * .name("name")
 * .sizeConstraints(List.of(SizeConstraintProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .size(123)
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html)
 */
@CdkDslMarker
public class CfnSizeConstraintSetPropsDsl {
  private val cdkBuilder: CfnSizeConstraintSetProps.Builder = CfnSizeConstraintSetProps.builder()

  private val _sizeConstraints: MutableList<Any> = mutableListOf()

  /**
   * @param name The name, if any, of the `SizeConstraintSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(vararg sizeConstraints: Any) {
    _sizeConstraints.addAll(listOf(*sizeConstraints))
  }

  /**
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(sizeConstraints: Collection<Any>) {
    _sizeConstraints.addAll(sizeConstraints)
  }

  /**
   * @param sizeConstraints The size constraint and the part of the web request to check. 
   */
  public fun sizeConstraints(sizeConstraints: IResolvable) {
    cdkBuilder.sizeConstraints(sizeConstraints)
  }

  public fun build(): CfnSizeConstraintSetProps {
    if(_sizeConstraints.isNotEmpty()) cdkBuilder.sizeConstraints(_sizeConstraints)
    return cdkBuilder.build()
  }
}
