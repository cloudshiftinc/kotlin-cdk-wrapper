@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a WorkMail action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic;
 * WorkMailProps workMailProps = WorkMailProps.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topic(topic)
 * .build();
 * ```
 */
public interface WorkMailProps {
  /**
   * The WorkMail organization ARN.
   *
   * Amazon WorkMail organization ARNs are in the form
   * `arn:aws:workmail:region:account_ID:organization/organization_ID`
   *
   * Example:
   *
   * ```
   * "arn:aws:workmail:us-east-1:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7";
   * ```
   */
  public fun organizationArn(): String

  /**
   * The SNS topic to notify when the WorkMail action is taken.
   *
   * Default: - no topic will be attached to the action
   */
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  /**
   * A builder for [WorkMailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param organizationArn The WorkMail organization ARN. 
     * Amazon WorkMail organization ARNs are in the form
     * `arn:aws:workmail:region:account_ID:organization/organization_ID`
     */
    public fun organizationArn(organizationArn: String)

    /**
     * @param topic The SNS topic to notify when the WorkMail action is taken.
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.WorkMailProps.Builder =
        software.amazon.awscdk.services.ses.actions.WorkMailProps.builder()

    /**
     * @param organizationArn The WorkMail organization ARN. 
     * Amazon WorkMail organization ARNs are in the form
     * `arn:aws:workmail:region:account_ID:organization/organization_ID`
     */
    override fun organizationArn(organizationArn: String) {
      cdkBuilder.organizationArn(organizationArn)
    }

    /**
     * @param topic The SNS topic to notify when the WorkMail action is taken.
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.WorkMailProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.actions.WorkMailProps,
  ) : CdkObject(cdkObject), WorkMailProps {
    /**
     * The WorkMail organization ARN.
     *
     * Amazon WorkMail organization ARNs are in the form
     * `arn:aws:workmail:region:account_ID:organization/organization_ID`
     *
     * Example:
     *
     * ```
     * "arn:aws:workmail:us-east-1:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7";
     * ```
     */
    override fun organizationArn(): String = unwrap(this).getOrganizationArn()

    /**
     * The SNS topic to notify when the WorkMail action is taken.
     *
     * Default: - no topic will be attached to the action
     */
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WorkMailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.WorkMailProps):
        WorkMailProps = CdkObjectWrappers.wrap(cdkObject) as? WorkMailProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WorkMailProps):
        software.amazon.awscdk.services.ses.actions.WorkMailProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.actions.WorkMailProps
  }
}
