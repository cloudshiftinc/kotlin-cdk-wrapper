@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::ConnectorDefinition` resource represents a connector definition for AWS IoT
 * Greengrass .
 *
 * Connector definitions are used to organize your connector definition versions.
 *
 * Connector definitions can reference multiple connector definition versions. All connector
 * definition versions must be associated with a connector definition. Each connector definition
 * version can contain one or more connectors.
 *
 *
 * When you create a connector definition, you can optionally include an initial connector
 * definition version. To associate a connector definition version later, create an
 * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
 * resource and specify the ID of this connector definition.
 *
 * After you create the connector definition version that contains the connectors you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object parameters;
 * Object tags;
 * CfnConnectorDefinition cfnConnectorDefinition = CfnConnectorDefinition.Builder.create(this,
 * "MyCfnConnectorDefinition")
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
public open class CfnConnectorDefinition(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnConnectorDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectorDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectorDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `ConnectorDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/connectors/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `ConnectorDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `ConnectorDefinitionVersion` that was added to the `ConnectorDefinition` ,
   * such as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/connectors/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `ConnectorDefinition` , such as `MyConnectorDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The connector definition version to include when the connector definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The connector definition version to include when the connector definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connector definition version to include when the connector definition is created.
   */
  public open fun initialVersion(`value`: ConnectorDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(ConnectorDefinitionVersionProperty.Companion::unwrap))
  }

  /**
   * The connector definition version to include when the connector definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2b68da37f6052c80ca9ba4025714739b14c81f8740c8601827fefb826347765")
  public open fun initialVersion(`value`: ConnectorDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(ConnectorDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the connector definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the connector definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the connector definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the connector definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnConnectorDefinition].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    public fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty)

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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c0c4a9d9fbc3e55af357aacd2c5a4c550b4a16d3bba813adfe8297c0bec8a85")
    public fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name)
     * @param name The name of the connector definition. 
     */
    public fun name(name: String)

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
     * @param tags Application-specific metadata to attach to the connector definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.Builder.create(scope, id)

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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable.Companion::unwrap))
    }

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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    override fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(ConnectorDefinitionVersionProperty.Companion::unwrap))
    }

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
     * @param initialVersion The connector definition version to include when the connector
     * definition is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c0c4a9d9fbc3e55af357aacd2c5a4c550b4a16d3bba813adfe8297c0bec8a85")
    override
        fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(ConnectorDefinitionVersionProperty(initialVersion))

    /**
     * The name of the connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name)
     * @param name The name of the connector definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags Application-specific metadata to attach to the connector definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition):
        CfnConnectorDefinition = CfnConnectorDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinition):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
  }

  /**
   * A connector definition version contains a list of connectors.
   *
   *
   * After you create a connector definition version that contains the connectors you want to
   * deploy, you must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `ConnectorDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::ConnectorDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object parameters;
   * ConnectorDefinitionVersionProperty connectorDefinitionVersionProperty =
   * ConnectorDefinitionVersionProperty.builder()
   * .connectors(List.of(ConnectorProperty.builder()
   * .connectorArn("connectorArn")
   * .id("id")
   * // the properties below are optional
   * .parameters(parameters)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html)
   */
  public interface ConnectorDefinitionVersionProperty {
    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to a connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors)
     */
    public fun connectors(): Any

    /**
     * A builder for [ConnectorDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      public fun connectors(connectors: IResolvable)

      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      public fun connectors(connectors: List<Any>)

      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      public fun connectors(vararg connectors: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty.builder()

      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      override fun connectors(connectors: IResolvable) {
        cdkBuilder.connectors(connectors.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      override fun connectors(connectors: List<Any>) {
        cdkBuilder.connectors(connectors.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param connectors The connectors in this version. 
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       */
      override fun connectors(vararg connectors: Any): Unit = connectors(connectors.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty,
    ) : CdkObject(cdkObject),
        ConnectorDefinitionVersionProperty {
      /**
       * The connectors in this version.
       *
       * Only one instance of a given connector can be added to a connector definition version at a
       * time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html#cfn-greengrass-connectordefinition-connectordefinitionversion-connectors)
       */
      override fun connectors(): Any = unwrap(this).getConnectors()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty):
          ConnectorDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectorDefinitionVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty
    }
  }

  /**
   * Connectors are modules that provide built-in integration with local infrastructure, device
   * protocols, AWS , and other cloud services.
   *
   * For more information, see [Integrate with Services and Protocols Using Greengrass
   * Connectors](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors.html) in the
   * *Developer Guide* .
   *
   * In an AWS CloudFormation template, the `Connectors` property of the
   * [`ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html)
   * property type contains a list of `Connector` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * Object parameters;
   * ConnectorProperty connectorProperty = ConnectorProperty.builder()
   * .connectorArn("connectorArn")
   * .id("id")
   * // the properties below are optional
   * .parameters(parameters)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
   */
  public interface ConnectorProperty {
    /**
     * The Amazon Resource Name (ARN) of the connector.
     *
     * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
     * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-connectorarn)
     */
    public fun connectorArn(): String

    /**
     * A descriptive or arbitrary ID for the connector.
     *
     * This value must be unique within the connector definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-id)
     */
    public fun id(): String

    /**
     * The parameters or configuration used by the connector.
     *
     * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
     * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [ConnectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      public fun connectorArn(connectorArn: String)

      /**
       * @param id A descriptive or arbitrary ID for the connector. 
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param parameters The parameters or configuration used by the connector.
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      public fun parameters(parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty.builder()

      /**
       * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      override fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
      }

      /**
       * @param id A descriptive or arbitrary ID for the connector. 
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param parameters The parameters or configuration used by the connector.
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty,
    ) : CdkObject(cdkObject),
        ConnectorProperty {
      /**
       * The Amazon Resource Name (ARN) of the connector.
       *
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-connectorarn)
       */
      override fun connectorArn(): String = unwrap(this).getConnectorArn()

      /**
       * A descriptive or arbitrary ID for the connector.
       *
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The parameters or configuration used by the connector.
       *
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html#cfn-greengrass-connectordefinition-connector-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty):
          ConnectorProperty = CdkObjectWrappers.wrap(cdkObject) as? ConnectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty
    }
  }
}
