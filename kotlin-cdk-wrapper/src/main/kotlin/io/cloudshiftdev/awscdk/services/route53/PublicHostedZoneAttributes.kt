@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Reference to a public hosted zone.
 *
 * Example:
 *
 * ```
 * IPublicHostedZone zoneFromAttributes = PublicHostedZone.fromPublicHostedZoneAttributes(this,
 * "MyZone", PublicHostedZoneAttributes.builder()
 * .zoneName("example.com")
 * .hostedZoneId("ZOJJZC49E0EPZ")
 * .build());
 * // Does not know zoneName
 * IPublicHostedZone zoneFromId = PublicHostedZone.fromPublicHostedZoneId(this, "MyZone",
 * "ZOJJZC49E0EPZ");
 * ```
 */
public interface PublicHostedZoneAttributes : HostedZoneAttributes {
  /**
   * A builder for [PublicHostedZoneAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedZoneId Identifier of the hosted zone. 
     */
    public fun hostedZoneId(hostedZoneId: String)

    /**
     * @param zoneName Name of the hosted zone. 
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes.builder()

    /**
     * @param hostedZoneId Identifier of the hosted zone. 
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /**
     * @param zoneName Name of the hosted zone. 
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZoneAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneAttributes,
  ) : CdkObject(cdkObject),
      PublicHostedZoneAttributes {
    /**
     * Identifier of the hosted zone.
     */
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    /**
     * Name of the hosted zone.
     */
    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicHostedZoneAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneAttributes):
        PublicHostedZoneAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        PublicHostedZoneAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZoneAttributes):
        software.amazon.awscdk.services.route53.PublicHostedZoneAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PublicHostedZoneAttributes
  }
}
