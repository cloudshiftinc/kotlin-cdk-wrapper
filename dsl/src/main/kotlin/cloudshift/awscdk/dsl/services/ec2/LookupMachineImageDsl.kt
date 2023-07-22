@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.LookupMachineImage
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class LookupMachineImageDsl {
  private val cdkBuilder: LookupMachineImage.Builder = LookupMachineImage.Builder.create()

  private val _owners: MutableList<String> = mutableListOf()

  /**
   * Additional filters on the AMI.
   *
   * Default: - No additional filters
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
   * @param filters Additional filters on the AMI. 
   */
  public fun filters(filters: Map<String, List<String>>) {
    cdkBuilder.filters(filters)
  }

  /**
   * Name of the image (may contain wildcards).
   *
   * @param name Name of the image (may contain wildcards). 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Owner account IDs or aliases.
   *
   * Default: - All owners
   *
   * @param owners Owner account IDs or aliases. 
   */
  public fun owners(vararg owners: String) {
    _owners.addAll(listOf(*owners))
  }

  /**
   * Owner account IDs or aliases.
   *
   * Default: - All owners
   *
   * @param owners Owner account IDs or aliases. 
   */
  public fun owners(owners: Collection<String>) {
    _owners.addAll(owners)
  }

  /**
   * Custom userdata for this image.
   *
   * Default: - Empty user data appropriate for the platform type
   *
   * @param userData Custom userdata for this image. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  /**
   * Look for Windows images.
   *
   * Default: false
   *
   * @param windows Look for Windows images. 
   */
  public fun windows(windows: Boolean) {
    cdkBuilder.windows(windows)
  }

  public fun build(): LookupMachineImage {
    if(_owners.isNotEmpty()) cdkBuilder.owners(_owners)
    return cdkBuilder.build()
  }
}
