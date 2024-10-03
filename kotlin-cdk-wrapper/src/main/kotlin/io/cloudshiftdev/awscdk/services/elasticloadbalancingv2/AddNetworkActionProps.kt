@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for adding a new action to a listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * NetworkListenerAction networkListenerAction;
 * AddNetworkActionProps addNetworkActionProps = AddNetworkActionProps.builder()
 * .action(networkListenerAction)
 * .build();
 * ```
 */
public interface AddNetworkActionProps {
  /**
   * Action to perform.
   */
  public fun action(): NetworkListenerAction

  /**
   * A builder for [AddNetworkActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Action to perform. 
     */
    public fun action(action: NetworkListenerAction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.builder()

    /**
     * @param action Action to perform. 
     */
    override fun action(action: NetworkListenerAction) {
      cdkBuilder.action(action.let(NetworkListenerAction.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps,
  ) : CdkObject(cdkObject),
      AddNetworkActionProps {
    /**
     * Action to perform.
     */
    override fun action(): NetworkListenerAction =
        unwrap(this).getAction().let(NetworkListenerAction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddNetworkActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps):
        AddNetworkActionProps = CdkObjectWrappers.wrap(cdkObject) as? AddNetworkActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddNetworkActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
  }
}
