@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Reference to a hosted zone.
 *
 * Example:
 *
 * ```
 * App app;
 * Stack stack = Stack.Builder.create(app, "Stack")
 * .crossRegionReferences(true)
 * .env(Environment.builder()
 * .region("us-east-2")
 * .build())
 * .build();
 * HttpsRedirect.Builder.create(this, "Redirect")
 * .recordNames(List.of("foo.example.com"))
 * .targetDomain("bar.example.com")
 * .zone(HostedZone.fromHostedZoneAttributes(this, "HostedZone", HostedZoneAttributes.builder()
 * .hostedZoneId("ID")
 * .zoneName("example.com")
 * .build()))
 * .build();
 * ```
 */
public interface HostedZoneAttributes {
  /**
   * Identifier of the hosted zone.
   */
  public fun hostedZoneId(): String

  /**
   * Name of the hosted zone.
   */
  public fun zoneName(): String

  /**
   * A builder for [HostedZoneAttributes]
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
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneAttributes.Builder =
        software.amazon.awscdk.services.route53.HostedZoneAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.HostedZoneAttributes,
  ) : CdkObject(cdkObject), HostedZoneAttributes {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneAttributes):
        HostedZoneAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneAttributes):
        software.amazon.awscdk.services.route53.HostedZoneAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.HostedZoneAttributes
  }
}
