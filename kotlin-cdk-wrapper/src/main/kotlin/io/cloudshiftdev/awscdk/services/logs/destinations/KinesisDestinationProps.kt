@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

/**
 * Customize the Kinesis Logs Destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * Role role;
 * KinesisDestinationProps kinesisDestinationProps = KinesisDestinationProps.builder()
 * .role(role)
 * .build();
 * ```
 */
public interface KinesisDestinationProps {
  /**
   * The role to assume to write log events to the destination.
   *
   * Default: - A new Role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [KinesisDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param role The role to assume to write log events to the destination.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps.Builder =
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps.builder()

    /**
     * @param role The role to assume to write log events to the destination.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps,
  ) : CdkObject(cdkObject), KinesisDestinationProps {
    /**
     * The role to assume to write log events to the destination.
     *
     * Default: - A new Role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps):
        KinesisDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? KinesisDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisDestinationProps):
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps
  }
}
