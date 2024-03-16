@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
 * The AWS::IoTEvents::Input resource creates an input.
 *
 * To monitor your devices and processes, they must have a way to get telemetry data into AWS IoT
 * Events . This is done by sending messages as *inputs* to AWS IoT Events . For more information, see
 * [How to Use AWS IoT
 * Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in
 * the *AWS IoT Events Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotevents.*;
 * CfnInput cfnInput = CfnInput.Builder.create(this, "MyCfnInput")
 * .inputDefinition(InputDefinitionProperty.builder()
 * .attributes(List.of(AttributeProperty.builder()
 * .jsonPath("jsonPath")
 * .build()))
 * .build())
 * // the properties below are optional
 * .inputDescription("inputDescription")
 * .inputName("inputName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html)
 */
public open class CfnInput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotevents.CfnInput,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The definition of the input.
   */
  public open fun inputDefinition(): Any = unwrap(this).getInputDefinition()

  /**
   * The definition of the input.
   */
  public open fun inputDefinition(`value`: IResolvable) {
    unwrap(this).setInputDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * The definition of the input.
   */
  public open fun inputDefinition(`value`: InputDefinitionProperty) {
    unwrap(this).setInputDefinition(`value`.let(InputDefinitionProperty::unwrap))
  }

  /**
   * The definition of the input.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("744a31907899d79c25d1bcfde3cd85ac503a5ff0244bca6aeeddf776fdbab4e5")
  public open fun inputDefinition(`value`: InputDefinitionProperty.Builder.() -> Unit): Unit =
      inputDefinition(InputDefinitionProperty(`value`))

  /**
   * A brief description of the input.
   */
  public open fun inputDescription(): String? = unwrap(this).getInputDescription()

  /**
   * A brief description of the input.
   */
  public open fun inputDescription(`value`: String) {
    unwrap(this).setInputDescription(`value`)
  }

  /**
   * The name of the input.
   */
  public open fun inputName(): String? = unwrap(this).getInputName()

  /**
   * The name of the input.
   */
  public open fun inputName(`value`: String) {
    unwrap(this).setInputName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotevents.CfnInput].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    public fun inputDefinition(inputDefinition: IResolvable)

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    public fun inputDefinition(inputDefinition: InputDefinitionProperty)

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e29149db2e0b6786b9737a01c465fc73f7fd99ee7ba077b14a1716b68649e11f")
    public fun inputDefinition(inputDefinition: InputDefinitionProperty.Builder.() -> Unit)

    /**
     * A brief description of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdescription)
     * @param inputDescription A brief description of the input. 
     */
    public fun inputDescription(inputDescription: String)

    /**
     * The name of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputname)
     * @param inputName The name of the input. 
     */
    public fun inputName(inputName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnInput.Builder =
        software.amazon.awscdk.services.iotevents.CfnInput.Builder.create(scope, id)

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    override fun inputDefinition(inputDefinition: IResolvable) {
      cdkBuilder.inputDefinition(inputDefinition.let(IResolvable::unwrap))
    }

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    override fun inputDefinition(inputDefinition: InputDefinitionProperty) {
      cdkBuilder.inputDefinition(inputDefinition.let(InputDefinitionProperty::unwrap))
    }

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     * @param inputDefinition The definition of the input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e29149db2e0b6786b9737a01c465fc73f7fd99ee7ba077b14a1716b68649e11f")
    override fun inputDefinition(inputDefinition: InputDefinitionProperty.Builder.() -> Unit): Unit
        = inputDefinition(InputDefinitionProperty(inputDefinition))

    /**
     * A brief description of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdescription)
     * @param inputDescription A brief description of the input. 
     */
    override fun inputDescription(inputDescription: String) {
      cdkBuilder.inputDescription(inputDescription)
    }

    /**
     * The name of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputname)
     * @param inputName The name of the input. 
     */
    override fun inputName(inputName: String) {
      cdkBuilder.inputName(inputName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnInput = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotevents.CfnInput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput): CfnInput =
        CfnInput(cdkObject)

    internal fun unwrap(wrapped: CfnInput): software.amazon.awscdk.services.iotevents.CfnInput =
        wrapped.cdkObject
  }

  /**
   * The attributes from the JSON payload that are made available by the input.
   *
   * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
   * Each such message contains a JSON payload. Those attributes (and their paired values) specified
   * here are available for use in the `condition` expressions used by detectors.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AttributeProperty attributeProperty = AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html)
   */
  public interface AttributeProperty {
    /**
     * An expression that specifies an attribute-value pair in a JSON structure.
     *
     * Use this to specify an attribute from the JSON payload that is made available by the input.
     * Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such message
     * contains a JSON payload. The attribute (and its paired value) specified here are available for
     * use in the `condition` expressions used by detectors.
     *
     * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath)
     */
    public fun jsonPath(): String

    /**
     * A builder for [AttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jsonPath An expression that specifies an attribute-value pair in a JSON structure. 
       * Use this to specify an attribute from the JSON payload that is made available by the input.
       * Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such
       * message contains a JSON payload. The attribute (and its paired value) specified here are
       * available for use in the `condition` expressions used by detectors.
       *
       * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
       */
      public fun jsonPath(jsonPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty.builder()

      /**
       * @param jsonPath An expression that specifies an attribute-value pair in a JSON structure. 
       * Use this to specify an attribute from the JSON payload that is made available by the input.
       * Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such
       * message contains a JSON payload. The attribute (and its paired value) specified here are
       * available for use in the `condition` expressions used by detectors.
       *
       * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
       */
      override fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty,
    ) : CdkObject(cdkObject), AttributeProperty {
      /**
       * An expression that specifies an attribute-value pair in a JSON structure.
       *
       * Use this to specify an attribute from the JSON payload that is made available by the input.
       * Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such
       * message contains a JSON payload. The attribute (and its paired value) specified here are
       * available for use in the `condition` expressions used by detectors.
       *
       * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html#cfn-iotevents-input-attribute-jsonpath)
       */
      override fun jsonPath(): String = unwrap(this).getJsonPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty):
          AttributeProperty = CdkObjectWrappers.wrap(cdkObject) as AttributeProperty

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty
    }
  }

  /**
   * The definition of the input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * InputDefinitionProperty inputDefinitionProperty = InputDefinitionProperty.builder()
   * .attributes(List.of(AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-inputdefinition.html)
   */
  public interface InputDefinitionProperty {
    /**
     * The attributes from the JSON payload that are made available by the input.
     *
     * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
     * Each such message contains a JSON payload, and those attributes (and their paired values)
     * specified here are available for use in the `condition` expressions used by detectors that
     * monitor this input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-inputdefinition.html#cfn-iotevents-input-inputdefinition-attributes)
     */
    public fun attributes(): Any

    /**
     * A builder for [InputDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      public fun attributes(vararg attributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.builder()

      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes The attributes from the JSON payload that are made available by the
       * input. 
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty,
    ) : CdkObject(cdkObject), InputDefinitionProperty {
      /**
       * The attributes from the JSON payload that are made available by the input.
       *
       * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`
       * . Each such message contains a JSON payload, and those attributes (and their paired values)
       * specified here are available for use in the `condition` expressions used by detectors that
       * monitor this input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-inputdefinition.html#cfn-iotevents-input-inputdefinition-attributes)
       */
      override fun attributes(): Any = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty):
          InputDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as InputDefinitionProperty

      internal fun unwrap(wrapped: InputDefinitionProperty):
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty
    }
  }
}
