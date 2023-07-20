@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Tmpfs
import software.amazon.awscdk.services.ecs.TmpfsMountOption

@CdkDslMarker
public class TmpfsDsl {
  private val cdkBuilder: Tmpfs.Builder = Tmpfs.builder()

  private val _mountOptions: MutableList<TmpfsMountOption> = mutableListOf()

  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  public fun mountOptions(vararg mountOptions: TmpfsMountOption) {
    _mountOptions.addAll(listOf(*mountOptions))
  }

  public fun mountOptions(mountOptions: Collection<TmpfsMountOption>) {
    _mountOptions.addAll(mountOptions)
  }

  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): Tmpfs {
    if(_mountOptions.isNotEmpty()) cdkBuilder.mountOptions(_mountOptions)
    return cdkBuilder.build()
  }
}
