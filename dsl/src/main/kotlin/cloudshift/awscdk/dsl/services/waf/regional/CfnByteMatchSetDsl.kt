@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.constructs.Construct

@CdkDslMarker
public class CfnByteMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnByteMatchSet.Builder = CfnByteMatchSet.Builder.create(scope, id)

  private val _byteMatchTuples: MutableList<Any> = mutableListOf()

  public fun byteMatchTuples(vararg byteMatchTuples: Any) {
    _byteMatchTuples.addAll(listOf(*byteMatchTuples))
  }

  public fun byteMatchTuples(byteMatchTuples: Collection<Any>) {
    _byteMatchTuples.addAll(byteMatchTuples)
  }

  public fun byteMatchTuples(byteMatchTuples: IResolvable) {
    cdkBuilder.byteMatchTuples(byteMatchTuples)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnByteMatchSet {
    if(_byteMatchTuples.isNotEmpty()) cdkBuilder.byteMatchTuples(_byteMatchTuples)
    return cdkBuilder.build()
  }
}
