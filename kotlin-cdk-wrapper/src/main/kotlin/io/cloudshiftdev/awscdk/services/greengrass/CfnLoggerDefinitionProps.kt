@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLoggerDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnLoggerDefinitionProps cfnLoggerDefinitionProps = CfnLoggerDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(LoggerDefinitionVersionProperty.builder()
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 */
public interface CfnLoggerDefinitionProps {
  /**
   * The logger definition version to include when the logger definition is created.
   *
   * A logger definition version contains a list of
   * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
   * property types.
   *
   *
   * To associate a logger definition version after the logger definition is created, create an
   * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
   * resource and specify the ID of this logger definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the logger definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-name)
   */
  public fun name(): String

  /**
   * Application-specific metadata to attach to the logger definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
   * the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnLoggerDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    public fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty)

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0283d0b843567426931c81eca4b9f68f6f5a61ef4ddce9fd741eb7d5f70cfdca")
    public
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the logger definition. 
     */
    public fun name(name: String)

    /**
     * @param tags Application-specific metadata to attach to the logger definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps.builder()

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    override
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnLoggerDefinition.LoggerDefinitionVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The logger definition version to include when the logger definition is
     * created.
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0283d0b843567426931c81eca4b9f68f6f5a61ef4ddce9fd741eb7d5f70cfdca")
    override
        fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnLoggerDefinition.LoggerDefinitionVersionProperty(initialVersion))

    /**
     * @param name The name of the logger definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the logger definition.
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps,
  ) : CdkObject(cdkObject), CfnLoggerDefinitionProps {
    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Application-specific metadata to attach to the logger definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps):
        CfnLoggerDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as CfnLoggerDefinitionProps

    internal fun unwrap(wrapped: CfnLoggerDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
  }
}
