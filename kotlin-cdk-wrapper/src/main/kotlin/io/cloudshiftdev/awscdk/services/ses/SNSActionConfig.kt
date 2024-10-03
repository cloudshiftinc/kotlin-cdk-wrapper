@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * SNSAction configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * SNSActionConfig sNSActionConfig = SNSActionConfig.builder()
 * .encoding("encoding")
 * .topicArn("topicArn")
 * .build();
 * ```
 */
public interface SNSActionConfig {
  /**
   * The encoding to use for the email within the Amazon SNS notification.
   *
   * Default: 'UTF-8'
   */
  public fun encoding(): String? = unwrap(this).getEncoding()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [SNSActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encoding The encoding to use for the email within the Amazon SNS notification.
     */
    public fun encoding(encoding: String)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.SNSActionConfig.Builder =
        software.amazon.awscdk.services.ses.SNSActionConfig.builder()

    /**
     * @param encoding The encoding to use for the email within the Amazon SNS notification.
     */
    override fun encoding(encoding: String) {
      cdkBuilder.encoding(encoding)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.SNSActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.SNSActionConfig,
  ) : CdkObject(cdkObject),
      SNSActionConfig {
    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * Default: 'UTF-8'
     */
    override fun encoding(): String? = unwrap(this).getEncoding()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SNSActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.SNSActionConfig):
        SNSActionConfig = CdkObjectWrappers.wrap(cdkObject) as? SNSActionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SNSActionConfig):
        software.amazon.awscdk.services.ses.SNSActionConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.SNSActionConfig
  }
}
