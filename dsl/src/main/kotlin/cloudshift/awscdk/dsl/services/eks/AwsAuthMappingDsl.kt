@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eks.AwsAuthMapping

@CdkDslMarker
public class AwsAuthMappingDsl {
  private val cdkBuilder: AwsAuthMapping.Builder = AwsAuthMapping.builder()

  private val _groups: MutableList<String> = mutableListOf()

  public fun groups(vararg groups: String) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<String>) {
    _groups.addAll(groups)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): AwsAuthMapping {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    return cdkBuilder.build()
  }
}
