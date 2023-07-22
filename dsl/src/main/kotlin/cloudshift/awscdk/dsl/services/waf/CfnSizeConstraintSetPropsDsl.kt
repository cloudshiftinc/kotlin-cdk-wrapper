@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps

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
