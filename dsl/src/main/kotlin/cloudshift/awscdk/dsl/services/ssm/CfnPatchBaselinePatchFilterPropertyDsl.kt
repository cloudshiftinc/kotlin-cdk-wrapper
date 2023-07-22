@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@CdkDslMarker
public class CfnPatchBaselinePatchFilterPropertyDsl {
  private val cdkBuilder: CfnPatchBaseline.PatchFilterProperty.Builder =
      CfnPatchBaseline.PatchFilterProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key The key for the filter.
   * For information about valid keys, see
   * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
   * in the *AWS Systems Manager API Reference* .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param values The value for the filter key.
   * For information about valid values for each key based on operating system type, see
   * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
   * in the *AWS Systems Manager API Reference* .
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The value for the filter key.
   * For information about valid values for each key based on operating system type, see
   * [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
   * in the *AWS Systems Manager API Reference* .
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnPatchBaseline.PatchFilterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
