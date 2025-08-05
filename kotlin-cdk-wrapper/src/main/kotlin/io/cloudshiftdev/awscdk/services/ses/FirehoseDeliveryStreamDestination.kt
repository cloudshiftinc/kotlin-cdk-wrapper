@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kinesisfirehose.IDeliveryStream
import kotlin.Unit

/**
 * An object that defines an Amazon Data Firehose destination for email events.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * ConfigurationSet myConfigurationSet;
 * IDeliveryStream firehoseDeliveryStream;
 * IRole iamRole;
 * // Create IAM Role automatically
 * myConfigurationSet.addEventDestination("ToFirehose",
 * ConfigurationSetEventDestinationOptions.builder()
 * .destination(EventDestination.firehoseDeliveryStream(FirehoseDeliveryStreamDestination.builder()
 * .deliveryStream(firehoseDeliveryStream)
 * .build()))
 * .build());
 * // Specify your IAM Role
 * myConfigurationSet.addEventDestination("ToFirehose",
 * ConfigurationSetEventDestinationOptions.builder()
 * .destination(EventDestination.firehoseDeliveryStream(FirehoseDeliveryStreamDestination.builder()
 * .deliveryStream(firehoseDeliveryStream)
 * .role(iamRole)
 * .build()))
 * .build());
 * ```
 */
public interface FirehoseDeliveryStreamDestination {
  /**
   * The Amazon Data Firehose stream that the Amazon SES API v2 sends email events to.
   */
  public fun deliveryStream(): IDeliveryStream

  /**
   * The IAM role that the Amazon SES API v2 uses to send email events to the Amazon Data Firehose
   * stream.
   *
   * Default: - Create IAM Role for Amazon Data Firehose Delivery stream
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [FirehoseDeliveryStreamDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryStream The Amazon Data Firehose stream that the Amazon SES API v2 sends email
     * events to. 
     */
    public fun deliveryStream(deliveryStream: IDeliveryStream)

    /**
     * @param role The IAM role that the Amazon SES API v2 uses to send email events to the Amazon
     * Data Firehose stream.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination.Builder =
        software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination.builder()

    /**
     * @param deliveryStream The Amazon Data Firehose stream that the Amazon SES API v2 sends email
     * events to. 
     */
    override fun deliveryStream(deliveryStream: IDeliveryStream) {
      cdkBuilder.deliveryStream(deliveryStream.let(IDeliveryStream.Companion::unwrap))
    }

    /**
     * @param role The IAM role that the Amazon SES API v2 uses to send email events to the Amazon
     * Data Firehose stream.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination,
  ) : CdkObject(cdkObject),
      FirehoseDeliveryStreamDestination {
    /**
     * The Amazon Data Firehose stream that the Amazon SES API v2 sends email events to.
     */
    override fun deliveryStream(): IDeliveryStream =
        unwrap(this).getDeliveryStream().let(IDeliveryStream::wrap)

    /**
     * The IAM role that the Amazon SES API v2 uses to send email events to the Amazon Data Firehose
     * stream.
     *
     * Default: - Create IAM Role for Amazon Data Firehose Delivery stream
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseDeliveryStreamDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination):
        FirehoseDeliveryStreamDestination = CdkObjectWrappers.wrap(cdkObject) as?
        FirehoseDeliveryStreamDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirehoseDeliveryStreamDestination):
        software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.FirehoseDeliveryStreamDestination
  }
}
