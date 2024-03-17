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
 * .logLevel("logLevel")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html)
 */
public interface CfnLogDeliveryConfigurationProps {
  /**
   * The detailed activity logging destination of a user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
   */
  public fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  /**
   * The ID of the user pool where you configured detailed activity logging.
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
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    public fun logConfigurations(logConfigurations: IResolvable)

    /**
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    public fun logConfigurations(logConfigurations: List<Any>)

    /**
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    public fun logConfigurations(vararg logConfigurations: Any)

    /**
     * @param userPoolId The ID of the user pool where you configured detailed activity logging. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.Builder =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps.builder()

    /**
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations)
    }

    /**
     * @param logConfigurations The detailed activity logging destination of a user pool.
     */
    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    /**
     * @param userPoolId The ID of the user pool where you configured detailed activity logging. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfigurationProps,
  ) : CdkObject(cdkObject), CfnLogDeliveryConfigurationProps {
    /**
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     */
    override fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

    /**
     * The ID of the user pool where you configured detailed activity logging.
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
