@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLogDeliveryConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnLogDeliveryConfigurationProps cfnLogDeliveryConfigurationProps =
 * CfnLogDeliveryConfigurationProps.builder()
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .logConfigurations(List.of(LogConfigurationProperty.builder()
 * .cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .eventSource("eventSource")
 * .firehoseConfiguration(FirehoseConfigurationProperty.builder()
 * .streamArn("streamArn")
 * .build())
 * .logLevel("logLevel")
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html)
 */
public interface CfnLogDeliveryConfigurationProps {
  /**
   * A logging destination of a user pool.
   *
   * User pools can have multiple logging destinations for message-delivery and user-activity logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
   */
  public fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  /**
   * The ID of the user pool where you configured logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnLogDeliveryConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    public fun logConfigurations(logConfigurations: IResolvable)

    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    public fun logConfigurations(logConfigurations: List<Any>)

    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    public fun logConfigurations(vararg logConfigurations: Any)

    /**
     * @param userPoolId The ID of the user pool where you configured logging. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.Builder =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.builder()

    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param logConfigurations A logging destination of a user pool.
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     */
    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    /**
     * @param userPoolId The ID of the user pool where you configured logging. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnLogDeliveryConfigurationProps {
    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     */
    override fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

    /**
     * The ID of the user pool where you configured logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogDeliveryConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps):
        CfnLogDeliveryConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLogDeliveryConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogDeliveryConfigurationProps):
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps
  }
}
