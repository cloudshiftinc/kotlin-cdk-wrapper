@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Kernel parameters to set in the container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * SystemControl systemControl = SystemControl.builder()
 * .namespace("namespace")
 * .value("value")
 * .build();
 * ```
 */
public interface SystemControl {
  /**
   * The namespaced kernel parameter for which to set a value.
   */
  public fun namespace(): String

  /**
   * The value for the namespaced kernel parameter specified in namespace.
   */
  public fun `value`(): String

  /**
   * A builder for [SystemControl]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespace The namespaced kernel parameter for which to set a value. 
     */
    public fun namespace(namespace: String)

    /**
     * @param value The value for the namespaced kernel parameter specified in namespace. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SystemControl.Builder =
        software.amazon.awscdk.services.ecs.SystemControl.builder()

    /**
     * @param namespace The namespaced kernel parameter for which to set a value. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param value The value for the namespaced kernel parameter specified in namespace. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SystemControl = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.SystemControl,
  ) : CdkObject(cdkObject), SystemControl {
    /**
     * The namespaced kernel parameter for which to set a value.
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * The value for the namespaced kernel parameter specified in namespace.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SystemControl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SystemControl): SystemControl =
        CdkObjectWrappers.wrap(cdkObject) as? SystemControl ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemControl): software.amazon.awscdk.services.ecs.SystemControl =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.SystemControl
  }
}
