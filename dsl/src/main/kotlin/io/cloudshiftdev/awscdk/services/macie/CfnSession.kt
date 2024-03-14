package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSession internal constructor(
  private val cdkObject: software.amazon.awscdk.services.macie.CfnSession,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The account ID for the AWS account in which the Amazon Macie session is created.
   */
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  /**
   * The Amazon Resource Name (ARN) of the service-linked role that allows Amazon Macie to monitor
   * and analyze data in AWS resources for the account.
   */
  public open fun attrServiceRole(): String = unwrap(this).getAttrServiceRole()

  /**
   * Specifies how often Amazon Macie publishes updates to policy findings for the account.
   */
  public open fun findingPublishingFrequency(): String? =
      unwrap(this).getFindingPublishingFrequency()

  /**
   * Specifies how often Amazon Macie publishes updates to policy findings for the account.
   */
  public open fun findingPublishingFrequency(`value`: String) {
    unwrap(this).setFindingPublishingFrequency(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The status of Amazon Macie for the account.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of Amazon Macie for the account.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.macie.CfnSession].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     * policy findings for the account. 
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    /**
     * The status of Amazon Macie for the account.
     *
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
     * @param status The status of Amazon Macie for the account. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnSession.Builder =
        software.amazon.awscdk.services.macie.CfnSession.Builder.create(scope, id)

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
     * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to
     * policy findings for the account. 
     */
    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * The status of Amazon Macie for the account.
     *
     * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
     * `PAUSED` , suspend all Macie activities for the account.
     *
     * Default: - "ENABLED"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
     * @param status The status of Amazon Macie for the account. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.macie.CfnSession = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSession {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSession(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnSession): CfnSession =
        CfnSession(cdkObject)

    internal fun unwrap(wrapped: CfnSession): software.amazon.awscdk.services.macie.CfnSession =
        wrapped.cdkObject
  }
}
