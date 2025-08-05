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
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * AppSyncAuthProvider apiKeyProvider = AppSyncAuthProvider.builder()
 * .authorizationType(AppSyncAuthorizationType.API_KEY)
 * .build();
 * EventApi api = EventApi.Builder.create(this, "api")
 * .apiName("Api")
 * .ownerContact("OwnerContact")
 * .authorizationConfig(EventApiAuthConfig.builder()
 * .authProviders(List.of(apiKeyProvider))
 * .connectionAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultPublishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultSubscribeAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .build())
 * // Custom Domain Settings
 * .domainName(AppSyncDomainOptions.builder()
 * .certificate(certificate)
 * .domainName(myDomainName)
 * .build())
 * .build();
 * api.addChannelNamespace("default");
 * // You can get custom HTTP/Realtime endpoint
 * // You can get custom HTTP/Realtime endpoint
 * CfnOutput.Builder.create(this, "AWS AppSync Events HTTP
 * endpoint").value(api.getCustomHttpEndpoint()).build();
 * CfnOutput.Builder.create(this, "AWS AppSync Events Realtime
 * endpoint").value(api.getCustomRealtimeEndpoint()).build();
 * ```
 */
public interface AppSyncDomainOptions {
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
   * A builder for [AppSyncDomainOptions]
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncDomainOptions.Builder =
        software.amazon.awscdk.services.appsync.AppSyncDomainOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncDomainOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncDomainOptions,
  ) : CdkObject(cdkObject),
      AppSyncDomainOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncDomainOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncDomainOptions):
        AppSyncDomainOptions = CdkObjectWrappers.wrap(cdkObject) as? AppSyncDomainOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncDomainOptions):
        software.amazon.awscdk.services.appsync.AppSyncDomainOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncDomainOptions
  }
}
