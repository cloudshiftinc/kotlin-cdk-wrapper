@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy
import software.amazon.awscdk.services.ses.IDedicatedIpPool
import software.amazon.awscdk.services.ses.SuppressionReasons
import software.constructs.Construct

/**
 * A configuration set.
 *
 * Example:
 *
 * ```
 * IDedicatedIpPool myPool;
 * ConfigurationSet.Builder.create(this, "ConfigurationSet")
 * .customTrackingRedirectDomain("track.cdk.dev")
 * .suppressionReasons(SuppressionReasons.COMPLAINTS_ONLY)
 * .tlsPolicy(ConfigurationSetTlsPolicy.REQUIRE)
 * .dedicatedIpPool(myPool)
 * .build();
 * ```
 */
@CdkDslMarker
public class ConfigurationSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ConfigurationSet.Builder = ConfigurationSet.Builder.create(scope, id)

  /**
   * A name for the configuration set.
   *
   * Default: - a CloudFormation generated name
   *
   * @param configurationSetName A name for the configuration set. 
   */
  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  /**
   * The custom subdomain that is used to redirect email recipients to the Amazon SES event tracking
   * domain.
   *
   * Default: - use the default awstrack.me domain
   *
   * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
   * recipients to the Amazon SES event tracking domain. 
   */
  public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
    cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
  }

  /**
   * The dedicated IP pool to associate with the configuration set.
   *
   * Default: - do not use a dedicated IP pool
   *
   * @param dedicatedIpPool The dedicated IP pool to associate with the configuration set. 
   */
  public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
    cdkBuilder.dedicatedIpPool(dedicatedIpPool)
  }

  /**
   * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
   * rates, to Amazon CloudWatch.
   *
   * Default: false
   *
   * @param reputationMetrics Whether to publish reputation metrics for the configuration set, such
   * as bounce and complaint rates, to Amazon CloudWatch. 
   */
  public fun reputationMetrics(reputationMetrics: Boolean) {
    cdkBuilder.reputationMetrics(reputationMetrics)
  }

  /**
   * Whether email sending is enabled.
   *
   * Default: true
   *
   * @param sendingEnabled Whether email sending is enabled. 
   */
  public fun sendingEnabled(sendingEnabled: Boolean) {
    cdkBuilder.sendingEnabled(sendingEnabled)
  }

  /**
   * The reasons for which recipient email addresses should be automatically added to your account's
   * suppression list.
   *
   * Default: - use account level settings
   *
   * @param suppressionReasons The reasons for which recipient email addresses should be
   * automatically added to your account's suppression list. 
   */
  public fun suppressionReasons(suppressionReasons: SuppressionReasons) {
    cdkBuilder.suppressionReasons(suppressionReasons)
  }

  /**
   * Specifies whether messages that use the configuration set are required to use Transport Layer
   * Security (TLS).
   *
   * Default: ConfigurationSetTlsPolicy.OPTIONAL
   *
   * @param tlsPolicy Specifies whether messages that use the configuration set are required to use
   * Transport Layer Security (TLS). 
   */
  public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
    cdkBuilder.tlsPolicy(tlsPolicy)
  }

  public fun build(): ConfigurationSet = cdkBuilder.build()
}
