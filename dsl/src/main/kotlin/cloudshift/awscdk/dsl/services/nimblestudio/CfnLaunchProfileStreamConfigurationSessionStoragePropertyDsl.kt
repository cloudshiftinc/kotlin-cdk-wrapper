@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl {
  private val cdkBuilder: CfnLaunchProfile.StreamConfigurationSessionStorageProperty.Builder =
      CfnLaunchProfile.StreamConfigurationSessionStorageProperty.builder()

  private val _mode: MutableList<String> = mutableListOf()

  public fun mode(vararg mode: String) {
    _mode.addAll(listOf(*mode))
  }

  public fun mode(mode: Collection<String>) {
    _mode.addAll(mode)
  }

  public fun root(root: IResolvable) {
    cdkBuilder.root(root)
  }

  public fun root(root: CfnLaunchProfile.StreamingSessionStorageRootProperty) {
    cdkBuilder.root(root)
  }

  public fun build(): CfnLaunchProfile.StreamConfigurationSessionStorageProperty {
    if(_mode.isNotEmpty()) cdkBuilder.mode(_mode)
    return cdkBuilder.build()
  }
}
