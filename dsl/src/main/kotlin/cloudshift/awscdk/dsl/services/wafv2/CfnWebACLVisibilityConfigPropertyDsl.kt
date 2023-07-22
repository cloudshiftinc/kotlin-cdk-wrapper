@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLVisibilityConfigPropertyDsl {
  private val cdkBuilder: CfnWebACL.VisibilityConfigProperty.Builder =
      CfnWebACL.VisibilityConfigProperty.builder()

  /**
   * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
   * Amazon CloudWatch. 
   * For the list of available metrics, see [AWS WAF
   * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
   * in the *AWS WAF Developer Guide* .
   *
   * For web ACLs, the metrics are for web requests that have the web ACL default action applied.
   * AWS WAF applies the default action to web requests that pass the inspection of all rules in the
   * web ACL without being either allowed or blocked. For more information,
   * see [The web ACL default
   * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  /**
   * @param cloudWatchMetricsEnabled Indicates whether the associated resource sends metrics to
   * Amazon CloudWatch. 
   * For the list of available metrics, see [AWS WAF
   * Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics)
   * in the *AWS WAF Developer Guide* .
   *
   * For web ACLs, the metrics are for web requests that have the web ACL default action applied.
   * AWS WAF applies the default action to web requests that pass the inspection of all rules in the
   * web ACL without being either allowed or blocked. For more information,
   * see [The web ACL default
   * action](https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-default-action.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
    cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
  }

  /**
   * @param metricName A name of the Amazon CloudWatch metric dimension. 
   * The name can contain only the characters: A-Z, a-z, 0-9, - (hyphen), and _ (underscore). The
   * name can be from one to 128 characters long. It can't contain whitespace or metric names that are
   * reserved for AWS WAF , for example `All` and `Default_Action` .
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
   * requests that match the rules. 
   * You can view the sampled requests through the AWS WAF console.
   */
  public fun sampledRequestsEnabled(sampledRequestsEnabled: Boolean) {
    cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
  }

  /**
   * @param sampledRequestsEnabled Indicates whether AWS WAF should store a sampling of the web
   * requests that match the rules. 
   * You can view the sampled requests through the AWS WAF console.
   */
  public fun sampledRequestsEnabled(sampledRequestsEnabled: IResolvable) {
    cdkBuilder.sampledRequestsEnabled(sampledRequestsEnabled)
  }

  public fun build(): CfnWebACL.VisibilityConfigProperty = cdkBuilder.build()
}
