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

public inline fun Certificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

public inline fun ICertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

public inline
    fun CfnAccount.setExpiryEventsConfiguration(block: CfnAccountExpiryEventsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccountExpiryEventsConfigurationPropertyDsl()
  builder.apply(block)
  return setExpiryEventsConfiguration(builder.build())
}

public inline fun PrivateCertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}

public inline fun DnsValidatedCertificate.metricDaysToExpiry(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDaysToExpiry(builder.build())
}
