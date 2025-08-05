@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationsignals

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for defining a `CfnDiscovery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationsignals.*;
 * CfnDiscoveryProps cfnDiscoveryProps = CfnDiscoveryProps.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationsignals-discovery.html)
 */
public interface CfnDiscoveryProps {
  /**
   * A builder for [CfnDiscoveryProps]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps.Builder =
        software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps.builder()

    public fun build(): software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps,
  ) : CdkObject(cdkObject),
      CfnDiscoveryProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDiscoveryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps):
        CfnDiscoveryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDiscoveryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDiscoveryProps):
        software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps
  }
}
