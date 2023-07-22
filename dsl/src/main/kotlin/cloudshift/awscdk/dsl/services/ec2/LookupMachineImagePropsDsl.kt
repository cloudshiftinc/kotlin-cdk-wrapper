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

  /**
   * @param filters Additional filters on the AMI.
   */
  public fun filters(filters: Map<String, List<String>>) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param name Name of the image (may contain wildcards). 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param owners Owner account IDs or aliases.
   */
  public fun owners(vararg owners: String) {
    _owners.addAll(listOf(*owners))
  }

  /**
   * @param owners Owner account IDs or aliases.
   */
  public fun owners(owners: Collection<String>) {
    _owners.addAll(owners)
  }

  /**
   * @param userData Custom userdata for this image.
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  /**
   * @param windows Look for Windows images.
   */
  public fun windows(windows: Boolean) {
    cdkBuilder.windows(windows)
  }

  public fun build(): LookupMachineImageProps {
    if(_owners.isNotEmpty()) cdkBuilder.owners(_owners)
    return cdkBuilder.build()
  }
}
