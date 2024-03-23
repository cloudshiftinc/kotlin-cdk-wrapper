@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The struct returned from `IOrigin.bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * IOrigin origin;
 * OriginBindConfig originBindConfig = OriginBindConfig.builder()
 * .failoverConfig(OriginFailoverConfig.builder()
 * .failoverOrigin(origin)
 * // the properties below are optional
 * .statusCodes(List.of(123))
 * .build())
 * .originProperty(OriginProperty.builder()
 * .domainName("domainName")
 * .id("id")
 * // the properties below are optional
 * .connectionAttempts(123)
 * .connectionTimeout(123)
 * .customOriginConfig(CustomOriginConfigProperty.builder()
 * .originProtocolPolicy("originProtocolPolicy")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originKeepaliveTimeout(123)
 * .originReadTimeout(123)
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build())
 * .originAccessControlId("originAccessControlId")
 * .originCustomHeaders(List.of(OriginCustomHeaderProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build()))
 * .originPath("originPath")
 * .originShield(OriginShieldProperty.builder()
 * .enabled(false)
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .s3OriginConfig(S3OriginConfigProperty.builder()
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface OriginBindConfig {
  /**
   * The failover configuration for this Origin.
   *
   * Default: - nothing is returned
   */
  public fun failoverConfig(): OriginFailoverConfig? =
      unwrap(this).getFailoverConfig()?.let(OriginFailoverConfig::wrap)

  /**
   * The CloudFormation OriginProperty configuration for this Origin.
   *
   * Default: - nothing is returned
   */
  public fun originProperty(): CfnDistribution.OriginProperty? =
      unwrap(this).getOriginProperty()?.let(CfnDistribution.OriginProperty::wrap)

  /**
   * A builder for [OriginBindConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failoverConfig The failover configuration for this Origin.
     */
    public fun failoverConfig(failoverConfig: OriginFailoverConfig)

    /**
     * @param failoverConfig The failover configuration for this Origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae315b8281a79a4bc381de8614be42096b2d585c260939331ae386e5b96c2c76")
    public fun failoverConfig(failoverConfig: OriginFailoverConfig.Builder.() -> Unit)

    /**
     * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
     */
    public fun originProperty(originProperty: CfnDistribution.OriginProperty)

    /**
     * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f7c474fb3a60fea18965bccda8e808015483f54b24fbafb80d5ece2e8b035e")
    public fun originProperty(originProperty: CfnDistribution.OriginProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginBindConfig.Builder =
        software.amazon.awscdk.services.cloudfront.OriginBindConfig.builder()

    /**
     * @param failoverConfig The failover configuration for this Origin.
     */
    override fun failoverConfig(failoverConfig: OriginFailoverConfig) {
      cdkBuilder.failoverConfig(failoverConfig.let(OriginFailoverConfig::unwrap))
    }

    /**
     * @param failoverConfig The failover configuration for this Origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae315b8281a79a4bc381de8614be42096b2d585c260939331ae386e5b96c2c76")
    override fun failoverConfig(failoverConfig: OriginFailoverConfig.Builder.() -> Unit): Unit =
        failoverConfig(OriginFailoverConfig(failoverConfig))

    /**
     * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
     */
    override fun originProperty(originProperty: CfnDistribution.OriginProperty) {
      cdkBuilder.originProperty(originProperty.let(CfnDistribution.OriginProperty::unwrap))
    }

    /**
     * @param originProperty The CloudFormation OriginProperty configuration for this Origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f7c474fb3a60fea18965bccda8e808015483f54b24fbafb80d5ece2e8b035e")
    override fun originProperty(originProperty: CfnDistribution.OriginProperty.Builder.() -> Unit):
        Unit = originProperty(CfnDistribution.OriginProperty(originProperty))

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginBindConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindConfig,
  ) : CdkObject(cdkObject), OriginBindConfig {
    /**
     * The failover configuration for this Origin.
     *
     * Default: - nothing is returned
     */
    override fun failoverConfig(): OriginFailoverConfig? =
        unwrap(this).getFailoverConfig()?.let(OriginFailoverConfig::wrap)

    /**
     * The CloudFormation OriginProperty configuration for this Origin.
     *
     * Default: - nothing is returned
     */
    override fun originProperty(): CfnDistribution.OriginProperty? =
        unwrap(this).getOriginProperty()?.let(CfnDistribution.OriginProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginBindConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindConfig):
        OriginBindConfig = CdkObjectWrappers.wrap(cdkObject) as? OriginBindConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBindConfig):
        software.amazon.awscdk.services.cloudfront.OriginBindConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBindConfig
  }
}
