@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Sets limits for a resource with `ulimit` on linux systems.
 *
 * Used by the Docker daemon.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * Ulimit ulimit = Ulimit.builder()
 * .hardLimit(123)
 * .name(UlimitName.CORE)
 * .softLimit(123)
 * .build();
 * ```
 */
public interface Ulimit {
  /**
   * The hard limit for this resource.
   *
   * The container will
   * be terminated if it exceeds this limit.
   */
  public fun hardLimit(): Number

  /**
   * The resource to limit.
   */
  public fun name(): UlimitName

  /**
   * The reservation for this resource.
   *
   * The container will
   * not be terminated if it exceeds this limit.
   */
  public fun softLimit(): Number

  /**
   * A builder for [Ulimit]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hardLimit The hard limit for this resource. 
     * The container will
     * be terminated if it exceeds this limit.
     */
    public fun hardLimit(hardLimit: Number)

    /**
     * @param name The resource to limit. 
     */
    public fun name(name: UlimitName)

    /**
     * @param softLimit The reservation for this resource. 
     * The container will
     * not be terminated if it exceeds this limit.
     */
    public fun softLimit(softLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Ulimit.Builder =
        software.amazon.awscdk.services.batch.Ulimit.builder()

    /**
     * @param hardLimit The hard limit for this resource. 
     * The container will
     * be terminated if it exceeds this limit.
     */
    override fun hardLimit(hardLimit: Number) {
      cdkBuilder.hardLimit(hardLimit)
    }

    /**
     * @param name The resource to limit. 
     */
    override fun name(name: UlimitName) {
      cdkBuilder.name(name.let(UlimitName::unwrap))
    }

    /**
     * @param softLimit The reservation for this resource. 
     * The container will
     * not be terminated if it exceeds this limit.
     */
    override fun softLimit(softLimit: Number) {
      cdkBuilder.softLimit(softLimit)
    }

    public fun build(): software.amazon.awscdk.services.batch.Ulimit = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.Ulimit,
  ) : CdkObject(cdkObject), Ulimit {
    /**
     * The hard limit for this resource.
     *
     * The container will
     * be terminated if it exceeds this limit.
     */
    override fun hardLimit(): Number = unwrap(this).getHardLimit()

    /**
     * The resource to limit.
     */
    override fun name(): UlimitName = unwrap(this).getName().let(UlimitName::wrap)

    /**
     * The reservation for this resource.
     *
     * The container will
     * not be terminated if it exceeds this limit.
     */
    override fun softLimit(): Number = unwrap(this).getSoftLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ulimit {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Ulimit): Ulimit =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ulimit): software.amazon.awscdk.services.batch.Ulimit = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.Ulimit
  }
}
