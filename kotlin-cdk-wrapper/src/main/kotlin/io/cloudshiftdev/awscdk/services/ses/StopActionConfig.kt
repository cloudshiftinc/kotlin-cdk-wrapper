@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * StopAction configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * StopActionConfig stopActionConfig = StopActionConfig.builder()
 * .scope("scope")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 */
public interface StopActionConfig {
  /**
   * The scope of the StopAction.
   *
   * The only acceptable value is RuleSet.
   */
  public fun scope(): String

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is taken.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [StopActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scope The scope of the StopAction. 
     * The only acceptable value is RuleSet.
     */
    public fun scope(scope: String)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.StopActionConfig.Builder =
        software.amazon.awscdk.services.ses.StopActionConfig.builder()

    /**
     * @param scope The scope of the StopAction. 
     * The only acceptable value is RuleSet.
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * stop action is taken.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.StopActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.StopActionConfig,
  ) : CdkObject(cdkObject), StopActionConfig {
    /**
     * The scope of the StopAction.
     *
     * The only acceptable value is RuleSet.
     */
    override fun scope(): String = unwrap(this).getScope()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is
     * taken.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StopActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.StopActionConfig):
        StopActionConfig = CdkObjectWrappers.wrap(cdkObject) as? StopActionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StopActionConfig):
        software.amazon.awscdk.services.ses.StopActionConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.StopActionConfig
  }
}
