@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a certificate in AWS Certificate Manager.
 */
public interface ICertificate : IResource {
  /**
   * The certificate's ARN.
   */
  public fun certificateArn(): String

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public fun metricDaysToExpiry(): Metric

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public fun metricDaysToExpiry(props: MetricOptions): Metric

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.ICertificate):
        ICertificate = CdkObjectWrappers.wrap(cdkObject) as ICertificate

    internal fun unwrap(wrapped: ICertificate):
        software.amazon.awscdk.services.certificatemanager.ICertificate = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.certificatemanager.ICertificate
  }
}
