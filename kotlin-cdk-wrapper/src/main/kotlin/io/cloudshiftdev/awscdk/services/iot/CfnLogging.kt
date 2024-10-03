@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configure logging.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnLogging cfnLogging = CfnLogging.Builder.create(this, "MyCfnLogging")
 * .accountId("accountId")
 * .defaultLogLevel("defaultLogLevel")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html)
 */
public open class CfnLogging(
  cdkObject: software.amazon.awscdk.services.iot.CfnLogging,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggingProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnLogging(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLoggingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLoggingProps(props)
  )

  /**
   * The account ID.
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   * The account ID.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * The default log level.
   */
  public open fun defaultLogLevel(): String = unwrap(this).getDefaultLogLevel()

  /**
   * The default log level.
   */
  public open fun defaultLogLevel(`value`: String) {
    unwrap(this).setDefaultLogLevel(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The role ARN used for the log.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The role ARN used for the log.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnLogging].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-accountid)
     * @param accountId The account ID. 
     */
    public fun accountId(accountId: String)

    /**
     * The default log level.
     *
     * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-defaultloglevel)
     * @param defaultLogLevel The default log level. 
     */
    public fun defaultLogLevel(defaultLogLevel: String)

    /**
     * The role ARN used for the log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-rolearn)
     * @param roleArn The role ARN used for the log. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnLogging.Builder =
        software.amazon.awscdk.services.iot.CfnLogging.Builder.create(scope, id)

    /**
     * The account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-accountid)
     * @param accountId The account ID. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The default log level.
     *
     * Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-defaultloglevel)
     * @param defaultLogLevel The default log level. 
     */
    override fun defaultLogLevel(defaultLogLevel: String) {
      cdkBuilder.defaultLogLevel(defaultLogLevel)
    }

    /**
     * The role ARN used for the log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-logging.html#cfn-iot-logging-rolearn)
     * @param roleArn The role ARN used for the log. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnLogging = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnLogging.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogging {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogging(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnLogging): CfnLogging =
        CfnLogging(cdkObject)

    internal fun unwrap(wrapped: CfnLogging): software.amazon.awscdk.services.iot.CfnLogging =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnLogging
  }
}
