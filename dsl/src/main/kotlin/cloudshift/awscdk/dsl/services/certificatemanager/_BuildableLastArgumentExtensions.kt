@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.amazon.awscdk.services.cloudwatch.Metric

/**
 * Object containing expiration events options associated with an AWS account .
 */
public inline
    fun CfnAccount.setExpiryEventsConfiguration(block: CfnAccountExpiryEventsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountExpiryEventsConfigurationPropertyDsl()
  builder.apply(block)
  return setExpiryEventsConfiguration(builder.build())
}

/**
 * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this is
 * the minimum value over 1 day.
 *
 * This metric is no longer emitted once the certificate has effectively
 * expired, so alarms configured on this metric should probably treat missing
 * data as "breaching".
 *
 * @param props
 */
public inline fun Certificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

/**
 * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this is
 * the minimum value over 1 day.
 *
 * This metric is no longer emitted once the certificate has effectively
 * expired, so alarms configured on this metric should probably treat missing
 * data as "breaching".
 *
 * @param props
 */
public inline fun ICertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

/**
 * (deprecated) Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By
 * default, this is the minimum value over 1 day.
 *
 * This metric is no longer emitted once the certificate has effectively
 * expired, so alarms configured on this metric should probably treat missing
 * data as "breaching".
 *
 * @param props
 */
public inline fun DnsValidatedCertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

/**
 * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this is
 * the minimum value over 1 day.
 *
 * This metric is no longer emitted once the certificate has effectively
 * expired, so alarms configured on this metric should probably treat missing
 * data as "breaching".
 *
 * @param props
 */
public inline fun PrivateCertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}
