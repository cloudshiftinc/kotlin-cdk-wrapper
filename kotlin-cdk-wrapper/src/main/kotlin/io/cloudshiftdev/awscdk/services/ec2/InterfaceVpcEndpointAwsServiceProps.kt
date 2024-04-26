@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Optional properties for the InterfaceVpcEndpointAwsService class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * InterfaceVpcEndpointAwsServiceProps interfaceVpcEndpointAwsServiceProps =
 * InterfaceVpcEndpointAwsServiceProps.builder()
 * .global(false)
 * .build();
 * ```
 */
public interface InterfaceVpcEndpointAwsServiceProps {
  /**
   * If true, the service is a global endpoint and its name will not be prefixed with the stack's
   * region.
   *
   * Default: false
   */
  public fun global(): Boolean? = unwrap(this).getGlobal()

  /**
   * A builder for [InterfaceVpcEndpointAwsServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param global If true, the service is a global endpoint and its name will not be prefixed
     * with the stack's region.
     */
    public fun global(global: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps.builder()

    /**
     * @param global If true, the service is a global endpoint and its name will not be prefixed
     * with the stack's region.
     */
    override fun global(global: Boolean) {
      cdkBuilder.global(global)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps,
  ) : CdkObject(cdkObject), InterfaceVpcEndpointAwsServiceProps {
    /**
     * If true, the service is a global endpoint and its name will not be prefixed with the stack's
     * region.
     *
     * Default: false
     */
    override fun global(): Boolean? = unwrap(this).getGlobal()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        InterfaceVpcEndpointAwsServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps):
        InterfaceVpcEndpointAwsServiceProps = CdkObjectWrappers.wrap(cdkObject) as?
        InterfaceVpcEndpointAwsServiceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointAwsServiceProps):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAwsServiceProps
  }
}
