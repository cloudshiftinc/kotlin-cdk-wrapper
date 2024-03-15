@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnADMChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnADMChannelProps cfnADMChannelProps = CfnADMChannelProps.builder()
 * .applicationId("applicationId")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html)
 */
public interface CfnADMChannelProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * The Client ID that you received from Amazon to send messages by using ADM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientid)
   */
  public fun clientId(): String

  /**
   * The Client Secret that you received from Amazon to send messages by using ADM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientsecret)
   */
  public fun clientSecret(): String

  /**
   * Specifies whether to enable the ADM channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A builder for [CfnADMChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param clientId The Client ID that you received from Amazon to send messages by using ADM. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The Client Secret that you received from Amazon to send messages by using
     * ADM. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnADMChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param clientId The Client ID that you received from Amazon to send messages by using ADM. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The Client Secret that you received from Amazon to send messages by using
     * ADM. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnADMChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps,
  ) : CdkObject(cdkObject), CfnADMChannelProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The Client ID that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientid)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The Client Secret that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientsecret)
     */
    override fun clientSecret(): String = unwrap(this).getClientSecret()

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnADMChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannelProps):
        CfnADMChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnADMChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnADMChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
  }
}
