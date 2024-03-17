@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * WorkmailAction configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * WorkmailActionConfig workmailActionConfig = WorkmailActionConfig.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 */
public interface WorkmailActionConfig {
  /**
   * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
   */
  public fun organizationArn(): String

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is
   * called.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [WorkmailActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization. 
     */
    public fun organizationArn(organizationArn: String)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.WorkmailActionConfig.Builder =
        software.amazon.awscdk.services.ses.WorkmailActionConfig.builder()

    /**
     * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization. 
     */
    override fun organizationArn(organizationArn: String) {
      cdkBuilder.organizationArn(organizationArn)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * WorkMail action is called.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.WorkmailActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig,
  ) : CdkObject(cdkObject), WorkmailActionConfig {
    /**
     * The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     */
    override fun organizationArn(): String = unwrap(this).getOrganizationArn()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is
     * called.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WorkmailActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig):
        WorkmailActionConfig = CdkObjectWrappers.wrap(cdkObject) as? WorkmailActionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WorkmailActionConfig):
        software.amazon.awscdk.services.ses.WorkmailActionConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.WorkmailActionConfig
  }
}
