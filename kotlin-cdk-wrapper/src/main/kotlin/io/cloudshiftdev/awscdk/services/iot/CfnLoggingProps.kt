@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLogging`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnLoggingProps cfnLoggingProps = CfnLoggingProps.builder()
 * .accountId("accountId")
 * .defaultLogLevel("defaultLogLevel")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html)
 */
public interface CfnLoggingProps {
  /**
   * The account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-accountid)
   */
  public fun accountId(): String

  /**
   * The default log level.
   *
   * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-defaultloglevel)
   */
  public fun defaultLogLevel(): String

  /**
   * The role ARN used for the log.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnLoggingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The account ID. 
     */
    public fun accountId(accountId: String)

    /**
     * @param defaultLogLevel The default log level. 
     * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
     */
    public fun defaultLogLevel(defaultLogLevel: String)

    /**
     * @param roleArn The role ARN used for the log. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnLoggingProps.Builder =
        software.amazon.awscdk.services.iot.CfnLoggingProps.builder()

    /**
     * @param accountId The account ID. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param defaultLogLevel The default log level. 
     * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
     */
    override fun defaultLogLevel(defaultLogLevel: String) {
      cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    /**
     * @param roleArn The role ARN used for the log. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnLoggingProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnLoggingProps,
  ) : CdkObject(cdkObject), CfnLoggingProps {
    /**
     * The account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-accountid)
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * The default log level.
     *
     * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-defaultloglevel)
     */
    override fun defaultLogLevel(): String = unwrap(this).getDefaultLogLevel()

    /**
     * The role ARN used for the log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnLoggingProps):
        CfnLoggingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingProps):
        software.amazon.awscdk.services.iot.CfnLoggingProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnLoggingProps
  }
}
