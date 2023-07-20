@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.constructs.Construct

@CdkDslMarker
public class CfnCidrCollectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCidrCollection.Builder = CfnCidrCollection.Builder.create(scope, id)

  private val _locations: MutableList<Any> = mutableListOf()

  public fun locations(vararg locations: Any) {
    _locations.addAll(listOf(*locations))
  }

  public fun locations(locations: Collection<Any>) {
    _locations.addAll(locations)
  }

  public fun locations(locations: IResolvable) {
    cdkBuilder.locations(locations)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnCidrCollection {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
