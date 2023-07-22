@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Tmpfs
import software.amazon.awscdk.services.ecs.TmpfsMountOption

/**
 * The details of a tmpfs mount for a container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Tmpfs tmpfs = Tmpfs.builder()
 * .containerPath("containerPath")
 * .size(123)
 * // the properties below are optional
 * .mountOptions(List.of(TmpfsMountOption.DEFAULTS))
 * .build();
 * ```
 */
@CdkDslMarker
public class TmpfsDsl {
  private val cdkBuilder: Tmpfs.Builder = Tmpfs.builder()

  private val _mountOptions: MutableList<TmpfsMountOption> = mutableListOf()

  /**
   * @param containerPath The absolute file path where the tmpfs volume is to be mounted. 
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param mountOptions The list of tmpfs volume mount options.
   * For more information, see
   * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
   */
  public fun mountOptions(vararg mountOptions: TmpfsMountOption) {
    _mountOptions.addAll(listOf(*mountOptions))
  }

  /**
   * @param mountOptions The list of tmpfs volume mount options.
   * For more information, see
   * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
   */
  public fun mountOptions(mountOptions: Collection<TmpfsMountOption>) {
    _mountOptions.addAll(mountOptions)
  }

  /**
   * @param size The size (in MiB) of the tmpfs volume. 
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): Tmpfs {
    if(_mountOptions.isNotEmpty()) cdkBuilder.mountOptions(_mountOptions)
    return cdkBuilder.build()
  }
}
