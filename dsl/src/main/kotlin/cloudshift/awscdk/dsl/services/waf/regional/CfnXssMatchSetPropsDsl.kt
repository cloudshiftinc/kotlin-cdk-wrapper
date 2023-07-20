@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps

@CdkDslMarker
public class CfnXssMatchSetPropsDsl {
  private val cdkBuilder: CfnXssMatchSetProps.Builder = CfnXssMatchSetProps.builder()

  private val _xssMatchTuples: MutableList<Any> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun xssMatchTuples(vararg xssMatchTuples: Any) {
    _xssMatchTuples.addAll(listOf(*xssMatchTuples))
  }

  public fun xssMatchTuples(xssMatchTuples: Collection<Any>) {
    _xssMatchTuples.addAll(xssMatchTuples)
  }

  public fun xssMatchTuples(xssMatchTuples: IResolvable) {
    cdkBuilder.xssMatchTuples(xssMatchTuples)
  }

  public fun build(): CfnXssMatchSetProps {
    if(_xssMatchTuples.isNotEmpty()) cdkBuilder.xssMatchTuples(_xssMatchTuples)
    return cdkBuilder.build()
  }
}
