@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53.patterns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.patterns.HttpsRedirect
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps
import software.constructs.Construct

public object patterns {
  /**
   * Allows creating a domainA -&gt; domainB redirect using CloudFront and S3.
   *
   * You can specify multiple domains to be redirected.
   *
   * Example:
   *
   * ```
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
  public inline fun httpsRedirect(
    scope: Construct,
    id: String,
    block: HttpsRedirectDsl.() -> Unit = {},
  ): HttpsRedirect {
    val builder = HttpsRedirectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to configure an HTTPS Redirect.
   *
   * Example:
   *
   * ```
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
  public inline fun httpsRedirectProps(block: HttpsRedirectPropsDsl.() -> Unit = {}):
      HttpsRedirectProps {
    val builder = HttpsRedirectPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
