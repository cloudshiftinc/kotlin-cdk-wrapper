@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnectorDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object parameters;
 * Object tags;
 * CfnConnectorDefinitionProps cfnConnectorDefinitionProps = CfnConnectorDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(ConnectorDefinitionVersionProperty.builder()
 * .connectors(List.of(ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
 */
public interface CfnConnectorDefinitionProps {
  /**
   * The connector definition version to include when the connector definition is created.
   *
   * A connector definition version contains a list of
   * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
   * property types.
   *
   *
   * To associate a connector definition version after the connector definition is created, create
   * an
   * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
   * resource and specify the ID of this connector definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the connector definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name)
   */
  public fun name(): String

  /**
   * Application-specific metadata to attach to the connector definition.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnConnectorDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    public
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty)

    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5ac19e80b4d53be9291bac9410a56b0853e6f8f03c25b8bf40ae0c36431d34")
    public
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the connector definition. 
     */
    public fun name(name: String)

    /**
     * @param tags Application-specific metadata to attach to the connector definition.
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
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps.builder()

    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    override
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnConnectorDefinition.ConnectorDefinitionVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The connector definition version to include when the connector
     * definition is created.
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5ac19e80b4d53be9291bac9410a56b0853e6f8f03c25b8bf40ae0c36431d34")
    override
        fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnConnectorDefinition.ConnectorDefinitionVersionProperty(initialVersion))

    /**
     * @param name The name of the connector definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the connector definition.
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

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps,
  ) : CdkObject(cdkObject), CfnConnectorDefinitionProps {
    /**
     * The connector definition version to include when the connector definition is created.
     *
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-initialversion)
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Application-specific metadata to attach to the connector definition.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps):
        CfnConnectorDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
  }
}
