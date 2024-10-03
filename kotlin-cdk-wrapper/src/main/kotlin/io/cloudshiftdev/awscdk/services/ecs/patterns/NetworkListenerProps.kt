@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to define an network listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * NetworkListenerProps networkListenerProps = NetworkListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .port(123)
 * .build();
 * ```
 */
public interface NetworkListenerProps {
  /**
   * Name of the listener.
   */
  public fun name(): String

  /**
   * The port on which the listener listens for requests.
   *
   * Default: 80
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * A builder for [NetworkListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the listener. 
     */
    public fun name(name: String)

    /**
     * @param port The port on which the listener listens for requests.
     */
    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps.builder()

    /**
     * @param name Name of the listener. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param port The port on which the listener listens for requests.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps,
  ) : CdkObject(cdkObject),
      NetworkListenerProps {
    /**
     * Name of the listener.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The port on which the listener listens for requests.
     *
     * Default: 80
     */
    override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps):
        NetworkListenerProps = CdkObjectWrappers.wrap(cdkObject) as? NetworkListenerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps
  }
}
