@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.constructs.Construct

@CdkDslMarker
public class CfnSqlInjectionMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSqlInjectionMatchSet.Builder =
      CfnSqlInjectionMatchSet.Builder.create(scope, id)

  private val _sqlInjectionMatchTuples: MutableList<Any> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any) {
    _sqlInjectionMatchTuples.addAll(listOf(*sqlInjectionMatchTuples))
  }

  public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: Collection<Any>) {
    _sqlInjectionMatchTuples.addAll(sqlInjectionMatchTuples)
  }

  public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
    cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
  }

  public fun build(): CfnSqlInjectionMatchSet {
    if(_sqlInjectionMatchTuples.isNotEmpty())
        cdkBuilder.sqlInjectionMatchTuples(_sqlInjectionMatchTuples)
    return cdkBuilder.build()
  }
}
