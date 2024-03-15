@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * A CloudWatch dimension upon which to categorize your emails.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CloudWatchDimension cloudWatchDimension = CloudWatchDimension.builder()
 * .defaultValue("defaultValue")
 * .name("name")
 * .source(CloudWatchDimensionSource.EMAIL_HEADER)
 * .build();
 * ```
 */
public interface CloudWatchDimension {
  /**
   * The default value of the dimension that is published to Amazon CloudWatch if you do not provide
   * the value of the dimension when you send an email.
   */
  public fun defaultValue(): String

  /**
   * The name of an Amazon CloudWatch dimension associated with an email sending metric.
   */
  public fun name(): String

  /**
   * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch.
   */
  public fun source(): CloudWatchDimensionSource

  /**
   * A builder for [CloudWatchDimension]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultValue The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email. 
     */
    public fun defaultValue(defaultValue: String)

    /**
     * @param name The name of an Amazon CloudWatch dimension associated with an email sending
     * metric. 
     */
    public fun name(name: String)

    /**
     * @param source The place where Amazon SES finds the value of a dimension to publish to Amazon
     * CloudWatch. 
     */
    public fun source(source: CloudWatchDimensionSource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CloudWatchDimension.Builder =
        software.amazon.awscdk.services.ses.CloudWatchDimension.builder()

    /**
     * @param defaultValue The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email. 
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param name The name of an Amazon CloudWatch dimension associated with an email sending
     * metric. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param source The place where Amazon SES finds the value of a dimension to publish to Amazon
     * CloudWatch. 
     */
    override fun source(source: CloudWatchDimensionSource) {
      cdkBuilder.source(source.let(CloudWatchDimensionSource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.CloudWatchDimension = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimension,
  ) : CdkObject(cdkObject), CloudWatchDimension {
    /**
     * The default value of the dimension that is published to Amazon CloudWatch if you do not
     * provide the value of the dimension when you send an email.
     */
    override fun defaultValue(): String = unwrap(this).getDefaultValue()

    /**
     * The name of an Amazon CloudWatch dimension associated with an email sending metric.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch.
     */
    override fun source(): CloudWatchDimensionSource =
        unwrap(this).getSource().let(CloudWatchDimensionSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchDimension {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimension):
        CloudWatchDimension = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudWatchDimension):
        software.amazon.awscdk.services.ses.CloudWatchDimension = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CloudWatchDimension
  }
}
