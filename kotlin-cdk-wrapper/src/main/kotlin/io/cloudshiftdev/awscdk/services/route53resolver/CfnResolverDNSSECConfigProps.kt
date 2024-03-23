@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResolverDNSSECConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverDNSSECConfigProps cfnResolverDNSSECConfigProps =
 * CfnResolverDNSSECConfigProps.builder()
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
 */
public interface CfnResolverDNSSECConfigProps {
  /**
   * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status
   * for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
   */
  public fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * A builder for [CfnResolverDNSSECConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     * DNSSEC validation status for.
     */
    public fun resourceId(resourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps.builder()

    /**
     * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the
     * DNSSEC validation status for.
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps,
  ) : CdkObject(cdkObject), CfnResolverDNSSECConfigProps {
    /**
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation
     * status for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
     */
    override fun resourceId(): String? = unwrap(this).getResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverDNSSECConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps):
        CfnResolverDNSSECConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResolverDNSSECConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverDNSSECConfigProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
  }
}
