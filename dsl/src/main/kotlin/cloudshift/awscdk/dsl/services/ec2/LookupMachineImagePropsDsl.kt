@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.LookupMachineImageProps
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class LookupMachineImagePropsDsl {
  private val cdkBuilder: LookupMachineImageProps.Builder = LookupMachineImageProps.builder()

  private val _owners: MutableList<String> = mutableListOf()

  public fun filters(filters: Map<String, List<String>>) {
    cdkBuilder.filters(filters)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun owners(vararg owners: String) {
    _owners.addAll(listOf(*owners))
  }

  public fun owners(owners: Collection<String>) {
    _owners.addAll(owners)
  }

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun windows(windows: Boolean) {
    cdkBuilder.windows(windows)
  }

  public fun build(): LookupMachineImageProps {
    if(_owners.isNotEmpty()) cdkBuilder.owners(_owners)
    return cdkBuilder.build()
  }
}
