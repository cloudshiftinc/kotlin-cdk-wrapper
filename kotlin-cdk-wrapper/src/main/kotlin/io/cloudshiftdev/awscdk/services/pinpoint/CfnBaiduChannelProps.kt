@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnBaiduChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnBaiduChannelProps cfnBaiduChannelProps = CfnBaiduChannelProps.builder()
 * .apiKey("apiKey")
 * .applicationId("applicationId")
 * .secretKey("secretKey")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html)
 */
public interface CfnBaiduChannelProps {
  /**
   * The API key that you received from the Baidu Cloud Push service to communicate with the
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
   */
  public fun apiKey(): String

  /**
   * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
   * channel for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * Specifies whether to enable the Baidu channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The secret key that you received from the Baidu Cloud Push service to communicate with the
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
   */
  public fun secretKey(): String

  /**
   * A builder for [CfnBaiduChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKey The API key that you received from the Baidu Cloud Push service to communicate
     * with the service. 
     */
    public fun apiKey(apiKey: String)

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     * configuring the Baidu channel for. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param secretKey The secret key that you received from the Baidu Cloud Push service to
     * communicate with the service. 
     */
    public fun secretKey(secretKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.builder()

    /**
     * @param apiKey The API key that you received from the Baidu Cloud Push service to communicate
     * with the service. 
     */
    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     * configuring the Baidu channel for. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the Baidu channel for the application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param secretKey The secret key that you received from the Baidu Cloud Push service to
     * communicate with the service. 
     */
    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps,
  ) : CdkObject(cdkObject), CfnBaiduChannelProps {
    /**
     * The API key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
     */
    override fun apiKey(): String = unwrap(this).getApiKey()

    /**
     * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
     * channel for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Specifies whether to enable the Baidu channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The secret key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
     */
    override fun secretKey(): String = unwrap(this).getSecretKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBaiduChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps):
        CfnBaiduChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBaiduChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBaiduChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
  }
}
