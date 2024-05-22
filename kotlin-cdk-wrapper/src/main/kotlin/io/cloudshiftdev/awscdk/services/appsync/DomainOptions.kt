@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import kotlin.String
import kotlin.Unit

/**
 * Domain name configuration for AppSync.
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
public interface DomainOptions {
  /**
   * The certificate to use with the domain name.
   */
  public fun certificate(): ICertificate

  /**
   * The actual domain name.
   *
   * For example, `api.example.com`.
   */
  public fun domainName(): String

  /**
   * A builder for [DomainOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The certificate to use with the domain name. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param domainName The actual domain name. 
     * For example, `api.example.com`.
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DomainOptions.Builder =
        software.amazon.awscdk.services.appsync.DomainOptions.builder()

    /**
     * @param certificate The certificate to use with the domain name. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * @param domainName The actual domain name. 
     * For example, `api.example.com`.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DomainOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.DomainOptions,
  ) : CdkObject(cdkObject), DomainOptions {
    /**
     * The certificate to use with the domain name.
     */
    override fun certificate(): ICertificate = unwrap(this).getCertificate().let(ICertificate::wrap)

    /**
     * The actual domain name.
     *
     * For example, `api.example.com`.
     */
    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DomainOptions):
        DomainOptions = CdkObjectWrappers.wrap(cdkObject) as? DomainOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainOptions):
        software.amazon.awscdk.services.appsync.DomainOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.DomainOptions
  }
}
