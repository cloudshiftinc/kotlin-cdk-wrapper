@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResourceSpecificLogging`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnResourceSpecificLoggingProps cfnResourceSpecificLoggingProps =
 * CfnResourceSpecificLoggingProps.builder()
 * .logLevel("logLevel")
 * .targetName("targetName")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html)
 */
public interface CfnResourceSpecificLoggingProps {
  /**
   * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-loglevel)
   */
  public fun logLevel(): String

  /**
   * The target name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targetname)
   */
  public fun targetName(): String

  /**
   * The target type.
   *
   * Valid Values: `DEFAULT | THING_GROUP`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targettype)
   */
  public fun targetType(): String

  /**
   * A builder for [CfnResourceSpecificLoggingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     * 
     */
    public fun logLevel(logLevel: String)

    /**
     * @param targetName The target name. 
     */
    public fun targetName(targetName: String)

    /**
     * @param targetType The target type. 
     * Valid Values: `DEFAULT | THING_GROUP`
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.Builder =
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.builder()

    /**
     * @param logLevel The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     * 
     */
    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    /**
     * @param targetName The target name. 
     */
    override fun targetName(targetName: String) {
      cdkBuilder.targetName(targetName)
    }

    /**
     * @param targetType The target type. 
     * Valid Values: `DEFAULT | THING_GROUP`
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps,
  ) : CdkObject(cdkObject), CfnResourceSpecificLoggingProps {
    /**
     * The default log level.Valid Values: `DEBUG | INFO | ERROR | WARN | DISABLED`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-loglevel)
     */
    override fun logLevel(): String = unwrap(this).getLogLevel()

    /**
     * The target name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targetname)
     */
    override fun targetName(): String = unwrap(this).getTargetName()

    /**
     * The target type.
     *
     * Valid Values: `DEFAULT | THING_GROUP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-resourcespecificlogging.html#cfn-iot-resourcespecificlogging-targettype)
     */
    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSpecificLoggingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps):
        CfnResourceSpecificLoggingProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnResourceSpecificLoggingProps

    internal fun unwrap(wrapped: CfnResourceSpecificLoggingProps):
        software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
  }
}
