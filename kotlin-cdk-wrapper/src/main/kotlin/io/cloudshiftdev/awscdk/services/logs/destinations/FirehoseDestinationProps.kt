@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs.destinations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

/**
 * Customize the Amazon Data Firehose Logs Destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.destinations.*;
 * Role role;
 * FirehoseDestinationProps firehoseDestinationProps = FirehoseDestinationProps.builder()
 * .role(role)
 * .build();
 * ```
 */
public interface FirehoseDestinationProps {
  /**
   * The role to assume to write log events to the destination.
   *
   * Default: - A new Role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [FirehoseDestinationProps]
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
        software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps.Builder =
        software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps.builder()

    /**
     * @param role The role to assume to write log events to the destination.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps,
  ) : CdkObject(cdkObject),
      FirehoseDestinationProps {
    /**
     * The role to assume to write log events to the destination.
     *
     * Default: - A new Role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps):
        FirehoseDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? FirehoseDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirehoseDestinationProps):
        software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps
  }
}
