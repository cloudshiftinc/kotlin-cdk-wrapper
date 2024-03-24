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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::CoreDefinition` resource represents a core definition for AWS IoT
 * Greengrass .
 *
 * Core definitions are used to organize your core definition versions.
 *
 * Core definitions can reference multiple core definition versions. All core definition versions
 * must be associated with a core definition. Each core definition version can contain one Greengrass
 * core.
 *
 *
 * When you create a core definition, you can optionally include an initial core definition version.
 * To associate a core definition version later, create an
 * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
 * resource and specify the ID of this core definition.
 *
 * After you create the core definition version that contains the core you want to deploy, you must
 * add it to your group version. For more information, see
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
 * Object tags;
 * CfnCoreDefinition cfnCoreDefinition = CfnCoreDefinition.Builder.create(this,
 * "MyCfnCoreDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(CoreDefinitionVersionProperty.builder()
 * .cores(List.of(CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
 */
public open class CfnCoreDefinition(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCoreDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnCoreDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCoreDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCoreDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCoreDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `CoreDefinition` , such as `arn:aws:greengrass:us-east-1:
   *  :/greengrass/definition/cores/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `CoreDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `CoreDefinitionVersion` that was added to the `CoreDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/cores/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `CoreDefinition` , such as `MyCoreDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The core definition version to include when the core definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The core definition version to include when the core definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The core definition version to include when the core definition is created.
   */
  public open fun initialVersion(`value`: CoreDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(CoreDefinitionVersionProperty::unwrap))
  }

  /**
   * The core definition version to include when the core definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79d267ca4351c7f75793d2116483a930b2f5ecfc3b5a6ec3bce685dd34058b9a")
  public open fun initialVersion(`value`: CoreDefinitionVersionProperty.Builder.() -> Unit): Unit =
      initialVersion(CoreDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the core definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the core definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the core definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the core definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnCoreDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    public fun initialVersion(initialVersion: CoreDefinitionVersionProperty)

    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11db1e40fce099e2d02543e66dd51666e8eb4a4c6f3fc2ae6c4be023853fcb2c")
    public fun initialVersion(initialVersion: CoreDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the core definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-name)
     * @param name The name of the core definition. 
     */
    public fun name(name: String)

    /**
     * Application-specific metadata to attach to the core definition.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-tags)
     * @param tags Application-specific metadata to attach to the core definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition.Builder.create(scope, id)

    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    override fun initialVersion(initialVersion: CoreDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CoreDefinitionVersionProperty::unwrap))
    }

    /**
     * The core definition version to include when the core definition is created.
     *
     * Currently, a core definition version can contain only one
     * [`core`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     *
     * To associate a core definition version after the core definition is created, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-initialversion)
     * @param initialVersion The core definition version to include when the core definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11db1e40fce099e2d02543e66dd51666e8eb4a4c6f3fc2ae6c4be023853fcb2c")
    override fun initialVersion(initialVersion: CoreDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CoreDefinitionVersionProperty(initialVersion))

    /**
     * The name of the core definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-name)
     * @param name The name of the core definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the core definition.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html#cfn-greengrass-coredefinition-tags)
     * @param tags Application-specific metadata to attach to the core definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition):
        CfnCoreDefinition = CfnCoreDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinition):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrass.CfnCoreDefinition
  }

  /**
   * A core definition version contains a Greengrass
   * [core](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
   * .
   *
   *
   * After you create a core definition version that contains the core you want to deploy, you must
   * add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `CoreDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::CoreDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * CoreDefinitionVersionProperty coreDefinitionVersionProperty =
   * CoreDefinitionVersionProperty.builder()
   * .cores(List.of(CoreProperty.builder()
   * .certificateArn("certificateArn")
   * .id("id")
   * .thingArn("thingArn")
   * // the properties below are optional
   * .syncShadow(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
   */
  public interface CoreDefinitionVersionProperty {
    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores)
     */
    public fun cores(): Any

    /**
     * A builder for [CoreDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      public fun cores(cores: IResolvable)

      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      public fun cores(cores: List<Any>)

      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      public fun cores(vararg cores: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty.builder()

      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      override fun cores(cores: IResolvable) {
        cdkBuilder.cores(cores.let(IResolvable::unwrap))
      }

      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      override fun cores(cores: List<Any>) {
        cdkBuilder.cores(cores.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param cores The Greengrass core in this version. 
       * Currently, the `Cores` property for a core definition version can contain only one core.
       */
      override fun cores(vararg cores: Any): Unit = cores(cores.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty,
    ) : CdkObject(cdkObject), CoreDefinitionVersionProperty {
      /**
       * The Greengrass core in this version.
       *
       * Currently, the `Cores` property for a core definition version can contain only one core.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html#cfn-greengrass-coredefinition-coredefinitionversion-cores)
       */
      override fun cores(): Any = unwrap(this).getCores()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty):
          CoreDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CoreDefinitionVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty
    }
  }

  /**
   * A core is an AWS IoT device that runs the AWS IoT Greengrass core software and manages local
   * processes for a Greengrass group.
   *
   * For more information, see [What Is AWS IoT Greengrass
   * ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) in the *Developer
   * Guide* .
   *
   * In an AWS CloudFormation template, the `Cores` property of the
   * [`CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
   * property type contains a list of `Core` property types. Currently, the list can contain only one
   * core.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * CoreProperty coreProperty = CoreProperty.builder()
   * .certificateArn("certificateArn")
   * .id("id")
   * .thingArn("thingArn")
   * // the properties below are optional
   * .syncShadow(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
   */
  public interface CoreProperty {
    /**
     * The Amazon Resource Name (ARN) of the device certificate for the core.
     *
     * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * A descriptive or arbitrary ID for the core.
     *
     * This value must be unique within the core definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id)
     */
    public fun id(): String

    /**
     * Indicates whether the core's local shadow is synced with the cloud automatically.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow)
     */
    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    /**
     * The ARN of the core, which is an AWS IoT device (thing).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn)
     */
    public fun thingArn(): String

    /**
     * A builder for [CoreProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the
       * core. 
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param id A descriptive or arbitrary ID for the core. 
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      public fun syncShadow(syncShadow: Boolean)

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      public fun syncShadow(syncShadow: IResolvable)

      /**
       * @param thingArn The ARN of the core, which is an AWS IoT device (thing). 
       */
      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the
       * core. 
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param id A descriptive or arbitrary ID for the core. 
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      /**
       * @param thingArn The ARN of the core, which is an AWS IoT device (thing). 
       */
      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty,
    ) : CdkObject(cdkObject), CoreProperty {
      /**
       * The Amazon Resource Name (ARN) of the device certificate for the core.
       *
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * A descriptive or arbitrary ID for the core.
       *
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Indicates whether the core's local shadow is synced with the cloud automatically.
       *
       * The default is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-syncshadow)
       */
      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      /**
       * The ARN of the core, which is an AWS IoT device (thing).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html#cfn-greengrass-coredefinition-core-thingarn)
       */
      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty):
          CoreProperty = CdkObjectWrappers.wrap(cdkObject) as? CoreProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreProperty
    }
  }
}
