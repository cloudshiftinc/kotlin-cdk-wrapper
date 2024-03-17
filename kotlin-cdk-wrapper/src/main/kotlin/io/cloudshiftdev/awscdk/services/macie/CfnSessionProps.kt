@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSession`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
 * CfnSessionProps cfnSessionProps = CfnSessionProps.builder()
 * .findingPublishingFrequency("findingPublishingFrequency")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html)
 */
public interface CfnSessionProps {
  /**
   * Specifies how often Amazon Macie publishes updates to policy findings for the account.
   *
   * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
   * CloudWatch Events ). Valid values are:
   *
   * * FIFTEEN_MINUTES
   * * ONE_HOUR
   * * SIX_HOURS
   *
   * Default: - "SIX_HOURS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-findingpublishingfrequency)
   */
  public fun findingPublishingFrequency(): String? = unwrap(this).getFindingPublishingFrequency()

  /**
   * The status of Amazon Macie for the account.
   *
   * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
   * `PAUSED` , suspend all Macie activities for the account.
   *
   * Default: - "ENABLED"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnSessionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     * policy findings for the account.
     * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
     * CloudWatch Events ). Valid values are:
     *
     * * FIFTEEN_MINUTES
     * * ONE_HOUR
     * * SIX_HOURS
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    /**
     * @param status The status of Amazon Macie for the account.
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnSessionProps.Builder =
        software.amazon.awscdk.services.macie.CfnSessionProps.builder()

    /**
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     * policy findings for the account.
     * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
     * CloudWatch Events ). Valid values are:
     *
     * * FIFTEEN_MINUTES
     * * ONE_HOUR
     * * SIX_HOURS
     */
    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * @param status The status of Amazon Macie for the account.
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.macie.CfnSessionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnSessionProps,
  ) : CdkObject(cdkObject), CfnSessionProps {
    /**
     * Specifies how often Amazon Macie publishes updates to policy findings for the account.
     *
     * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
     * CloudWatch Events ). Valid values are:
     *
     * * FIFTEEN_MINUTES
     * * ONE_HOUR
     * * SIX_HOURS
     *
     * Default: - "SIX_HOURS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-findingpublishingfrequency)
     */
    override fun findingPublishingFrequency(): String? =
        unwrap(this).getFindingPublishingFrequency()

    /**
     * The status of Amazon Macie for the account.
     *
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSessionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnSessionProps):
        CfnSessionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSessionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSessionProps):
        software.amazon.awscdk.services.macie.CfnSessionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.macie.CfnSessionProps
  }
}
