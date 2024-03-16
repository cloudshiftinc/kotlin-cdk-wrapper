@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * BaseNamespaceProps baseNamespaceProps = BaseNamespaceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 */
public interface BaseNamespaceProps {
  /**
   * A description of the Namespace.
   *
   * Default: none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the Namespace.
   */
  public fun name(): String

  /**
   * A builder for [BaseNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the Namespace.
     */
    public fun description(description: String)

    /**
     * @param name A name for the Namespace. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps.builder()

    /**
     * @param description A description of the Namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the Namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps,
  ) : CdkObject(cdkObject), BaseNamespaceProps {
    /**
     * A description of the Namespace.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the Namespace.
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps):
        BaseNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as BaseNamespaceProps

    internal fun unwrap(wrapped: BaseNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.BaseNamespaceProps
  }
}
