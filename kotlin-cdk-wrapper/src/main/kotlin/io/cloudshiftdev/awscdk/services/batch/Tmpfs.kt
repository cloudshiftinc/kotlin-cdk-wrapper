@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The details of a tmpfs mount for a container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * Size size;
 * Tmpfs tmpfs = Tmpfs.builder()
 * .containerPath("containerPath")
 * .size(size)
 * // the properties below are optional
 * .mountOptions(List.of(TmpfsMountOption.DEFAULTS))
 * .build();
 * ```
 */
public interface Tmpfs {
  /**
   * The absolute file path where the tmpfs volume is to be mounted.
   */
  public fun containerPath(): String

  /**
   * The list of tmpfs volume mount options.
   *
   * For more information, see
   * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
   *
   * Default: none
   */
  public fun mountOptions(): List<TmpfsMountOption> =
      unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

  /**
   * The size (in MiB) of the tmpfs volume.
   */
  public fun size(): Size

  /**
   * A builder for [Tmpfs]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath The absolute file path where the tmpfs volume is to be mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param mountOptions The list of tmpfs volume mount options.
     * For more information, see
     * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
     */
    public fun mountOptions(mountOptions: List<TmpfsMountOption>)

    /**
     * @param mountOptions The list of tmpfs volume mount options.
     * For more information, see
     * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
     */
    public fun mountOptions(vararg mountOptions: TmpfsMountOption)

    /**
     * @param size The size (in MiB) of the tmpfs volume. 
     */
    public fun size(size: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Tmpfs.Builder =
        software.amazon.awscdk.services.batch.Tmpfs.builder()

    /**
     * @param containerPath The absolute file path where the tmpfs volume is to be mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param mountOptions The list of tmpfs volume mount options.
     * For more information, see
     * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
     */
    override fun mountOptions(mountOptions: List<TmpfsMountOption>) {
      cdkBuilder.mountOptions(mountOptions.map(TmpfsMountOption.Companion::unwrap))
    }

    /**
     * @param mountOptions The list of tmpfs volume mount options.
     * For more information, see
     * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
     */
    override fun mountOptions(vararg mountOptions: TmpfsMountOption): Unit =
        mountOptions(mountOptions.toList())

    /**
     * @param size The size (in MiB) of the tmpfs volume. 
     */
    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.Tmpfs = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.Tmpfs,
  ) : CdkObject(cdkObject), Tmpfs {
    /**
     * The absolute file path where the tmpfs volume is to be mounted.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * The list of tmpfs volume mount options.
     *
     * For more information, see
     * [TmpfsMountOptions](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Tmpfs.html).
     *
     * Default: none
     */
    override fun mountOptions(): List<TmpfsMountOption> =
        unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

    /**
     * The size (in MiB) of the tmpfs volume.
     */
    override fun size(): Size = unwrap(this).getSize().let(Size::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tmpfs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Tmpfs): Tmpfs =
        CdkObjectWrappers.wrap(cdkObject) as? Tmpfs ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tmpfs): software.amazon.awscdk.services.batch.Tmpfs = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.Tmpfs
  }
}
