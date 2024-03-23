@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLoggerDefinitionVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnLoggerDefinitionVersionProps cfnLoggerDefinitionVersionProps =
 * CfnLoggerDefinitionVersionProps.builder()
 * .loggerDefinitionId("loggerDefinitionId")
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
 */
public interface CfnLoggerDefinitionVersionProps {
  /**
   * The ID of the logger definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
   */
  public fun loggerDefinitionId(): String

  /**
   * The loggers in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
   */
  public fun loggers(): Any

  /**
   * A builder for [CfnLoggerDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loggerDefinitionId The ID of the logger definition associated with this version. 
     * This value is a GUID.
     */
    public fun loggerDefinitionId(loggerDefinitionId: String)

    /**
     * @param loggers The loggers in this version. 
     */
    public fun loggers(loggers: IResolvable)

    /**
     * @param loggers The loggers in this version. 
     */
    public fun loggers(loggers: List<Any>)

    /**
     * @param loggers The loggers in this version. 
     */
    public fun loggers(vararg loggers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.builder()

    /**
     * @param loggerDefinitionId The ID of the logger definition associated with this version. 
     * This value is a GUID.
     */
    override fun loggerDefinitionId(loggerDefinitionId: String) {
      cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    /**
     * @param loggers The loggers in this version. 
     */
    override fun loggers(loggers: IResolvable) {
      cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
    }

    /**
     * @param loggers The loggers in this version. 
     */
    override fun loggers(loggers: List<Any>) {
      cdkBuilder.loggers(loggers)
    }

    /**
     * @param loggers The loggers in this version. 
     */
    override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnLoggerDefinitionVersionProps {
    /**
     * The ID of the logger definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
     */
    override fun loggerDefinitionId(): String = unwrap(this).getLoggerDefinitionId()

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     */
    override fun loggers(): Any = unwrap(this).getLoggers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggerDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps):
        CfnLoggerDefinitionVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLoggerDefinitionVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
  }
}
