@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Reference to a hosted zone.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * // hosted zone and route53 features
 * String hostedZoneId;
 * String zoneName = "example.com";
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("myApi")
 * .definition(Definition.fromSchema(schema))
 * .domainName(DomainOptions.builder()
 * .certificate(certificate)
 * .domainName(myDomainName)
 * .build())
 * .build();
 * // hosted zone for adding appsync domain
 * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
 * HostedZoneAttributes.builder()
 * .hostedZoneId(hostedZoneId)
 * .zoneName(zoneName)
 * .build());
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * CnameRecord.Builder.create(this, "CnameApiRecord")
 * .recordName("api")
 * .zone(zone)
 * .domainName(api.getAppSyncDomainName())
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
    cdkObject: software.amazon.awscdk.services.route53.HostedZoneAttributes,
  ) : CdkObject(cdkObject),
      HostedZoneAttributes {
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
        HostedZoneAttributes = CdkObjectWrappers.wrap(cdkObject) as? HostedZoneAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneAttributes):
        software.amazon.awscdk.services.route53.HostedZoneAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.HostedZoneAttributes
  }
}
