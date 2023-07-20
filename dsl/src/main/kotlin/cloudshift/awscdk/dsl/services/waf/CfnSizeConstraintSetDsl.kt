@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import software.constructs.Construct

@CdkDslMarker
public class CfnSizeConstraintSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSizeConstraintSet.Builder = CfnSizeConstraintSet.Builder.create(scope,
      id)

  private val _sizeConstraints: MutableList<Any> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sizeConstraints(vararg sizeConstraints: Any) {
    _sizeConstraints.addAll(listOf(*sizeConstraints))
  }

  public fun sizeConstraints(sizeConstraints: Collection<Any>) {
    _sizeConstraints.addAll(sizeConstraints)
  }

  public fun sizeConstraints(sizeConstraints: IResolvable) {
    cdkBuilder.sizeConstraints(sizeConstraints)
  }

  public fun build(): CfnSizeConstraintSet {
    if(_sizeConstraints.isNotEmpty()) cdkBuilder.sizeConstraints(_sizeConstraints)
    return cdkBuilder.build()
  }
}
