@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents an SNS topic defined outside of this stack.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * TopicAttributes topicAttributes = TopicAttributes.builder()
 * .topicArn("topicArn")
 * // the properties below are optional
 * .contentBasedDeduplication(false)
 * .build();
 * ```
 */
public interface TopicAttributes {
  /**
   * Whether content-based deduplication is enabled.
   *
   * Only applicable for FIFO topics.
   *
   * Default: false
   */
  public fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

  /**
   * The ARN of the SNS topic.
   */
  public fun topicArn(): String

  /**
   * A builder for [TopicAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentBasedDeduplication Whether content-based deduplication is enabled.
     * Only applicable for FIFO topics.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * @param topicArn The ARN of the SNS topic. 
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicAttributes.Builder =
        software.amazon.awscdk.services.sns.TopicAttributes.builder()

    /**
     * @param contentBasedDeduplication Whether content-based deduplication is enabled.
     * Only applicable for FIFO topics.
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param topicArn The ARN of the SNS topic. 
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.TopicAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.TopicAttributes,
  ) : CdkObject(cdkObject),
      TopicAttributes {
    /**
     * Whether content-based deduplication is enabled.
     *
     * Only applicable for FIFO topics.
     *
     * Default: false
     */
    override fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

    /**
     * The ARN of the SNS topic.
     */
    override fun topicArn(): String = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicAttributes):
        TopicAttributes = CdkObjectWrappers.wrap(cdkObject) as? TopicAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicAttributes):
        software.amazon.awscdk.services.sns.TopicAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.TopicAttributes
  }
}
