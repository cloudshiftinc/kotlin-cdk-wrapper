@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDNSSEC`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnDNSSECProps cfnDNSSECProps = CfnDNSSECProps.builder()
 * .hostedZoneId("hostedZoneId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html)
 */
public interface CfnDNSSECProps {
  /**
   * A unique string (ID) that is used to identify a hosted zone.
   *
   * For example: `Z00001111A1ABCaaABC11` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html#cfn-route53-dnssec-hostedzoneid)
   */
  public fun hostedZoneId(): String

  /**
   * A builder for [CfnDNSSECProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. 
     * For example: `Z00001111A1ABCaaABC11` .
     */
    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnDNSSECProps.Builder =
        software.amazon.awscdk.services.route53.CfnDNSSECProps.builder()

    /**
     * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. 
     * For example: `Z00001111A1ABCaaABC11` .
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnDNSSECProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.CfnDNSSECProps,
  ) : CdkObject(cdkObject),
      CfnDNSSECProps {
    /**
     * A unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html#cfn-route53-dnssec-hostedzoneid)
     */
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDNSSECProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnDNSSECProps):
        CfnDNSSECProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDNSSECProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDNSSECProps):
        software.amazon.awscdk.services.route53.CfnDNSSECProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CfnDNSSECProps
  }
}
