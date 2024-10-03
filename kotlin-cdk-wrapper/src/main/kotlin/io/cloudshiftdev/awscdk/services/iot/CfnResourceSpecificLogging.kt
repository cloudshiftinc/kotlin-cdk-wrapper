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
 * Configure resource-specific logging.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnResourceSpecificLogging cfnResourceSpecificLogging =
 * CfnResourceSpecificLogging.Builder.create(this, "MyCfnResourceSpecificLogging")
 * .logLevel("logLevel")
 * .targetName("targetName")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
 */
public open class CfnResourceSpecificLogging(
  cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceSpecificLoggingProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnResourceSpecificLogging(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceSpecificLoggingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceSpecificLoggingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceSpecificLoggingProps(props)
  )

  /**
   * The target Id.
   */
  public open fun attrTargetId(): String = unwrap(this).getAttrTargetId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
   */
  public open fun logLevel(): String = unwrap(this).getLogLevel()

  /**
   * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
   */
  public open fun logLevel(`value`: String) {
    unwrap(this).setLogLevel(`value`)
  }

  /**
   * The target name.
   */
  public open fun targetName(): String = unwrap(this).getTargetName()

  /**
   * The target name.
   */
  public open fun targetName(`value`: String) {
    unwrap(this).setTargetName(`value`)
  }

  /**
   * The target type.
   */
  public open fun targetType(): String = unwrap(this).getTargetType()

  /**
   * The target type.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnResourceSpecificLogging].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-loglevel)
     * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     * 
     */
    public fun logLevel(logLevel: String)

    /**
     * The target name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targetname)
     * @param targetName The target name. 
     */
    public fun targetName(targetName: String)

    /**
     * The target type.
     *
     * Valid Values: `DEFAULT | THING_GROUP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targettype)
     * @param targetType The target type. 
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder =
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder.create(scope, id)

    /**
     * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-loglevel)
     * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     * 
     */
    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    /**
     * The target name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targetname)
     * @param targetName The target name. 
     */
    override fun targetName(targetName: String) {
      cdkBuilder.targetName(targetName)
    }

    /**
     * The target type.
     *
     * Valid Values: `DEFAULT | THING_GROUP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targettype)
     * @param targetType The target type. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnResourceSpecificLogging =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceSpecificLogging {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceSpecificLogging(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging):
        CfnResourceSpecificLogging = CfnResourceSpecificLogging(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSpecificLogging):
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
  }
}
