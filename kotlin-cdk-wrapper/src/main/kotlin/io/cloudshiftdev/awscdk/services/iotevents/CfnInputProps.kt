@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotevents.*;
 * CfnInputProps cfnInputProps = CfnInputProps.builder()
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
public interface CfnInputProps {
  /**
   * The definition of the input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
   */
  public fun inputDefinition(): Any

  /**
   * A brief description of the input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdescription)
   */
  public fun inputDescription(): String? = unwrap(this).getInputDescription()

  /**
   * The name of the input.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputname)
   */
  public fun inputName(): String? = unwrap(this).getInputName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param inputDefinition The definition of the input. 
     */
    public fun inputDefinition(inputDefinition: IResolvable)

    /**
     * @param inputDefinition The definition of the input. 
     */
    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty)

    /**
     * @param inputDefinition The definition of the input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8afb78ab9fdc53ab6e2a745a441372dd97e0466473da9d656679745ad031e2cd")
    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty.Builder.() -> Unit)

    /**
     * @param inputDescription A brief description of the input.
     */
    public fun inputDescription(inputDescription: String)

    /**
     * @param inputName The name of the input.
     */
    public fun inputName(inputName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnInputProps.Builder =
        software.amazon.awscdk.services.iotevents.CfnInputProps.builder()

    /**
     * @param inputDefinition The definition of the input. 
     */
    override fun inputDefinition(inputDefinition: IResolvable) {
      cdkBuilder.inputDefinition(inputDefinition.let(IResolvable::unwrap))
    }

    /**
     * @param inputDefinition The definition of the input. 
     */
    override fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty) {
      cdkBuilder.inputDefinition(inputDefinition.let(CfnInput.InputDefinitionProperty::unwrap))
    }

    /**
     * @param inputDefinition The definition of the input. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8afb78ab9fdc53ab6e2a745a441372dd97e0466473da9d656679745ad031e2cd")
    override
        fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty.Builder.() -> Unit):
        Unit = inputDefinition(CfnInput.InputDefinitionProperty(inputDefinition))

    /**
     * @param inputDescription A brief description of the input.
     */
    override fun inputDescription(inputDescription: String) {
      cdkBuilder.inputDescription(inputDescription)
    }

    /**
     * @param inputName The name of the input.
     */
    override fun inputName(inputName: String) {
      cdkBuilder.inputName(inputName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnInputProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotevents.CfnInputProps,
  ) : CdkObject(cdkObject), CfnInputProps {
    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     */
    override fun inputDefinition(): Any = unwrap(this).getInputDefinition()

    /**
     * A brief description of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdescription)
     */
    override fun inputDescription(): String? = unwrap(this).getInputDescription()

    /**
     * The name of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputname)
     */
    override fun inputName(): String? = unwrap(this).getInputName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInputProps):
        CfnInputProps = CdkObjectWrappers.wrap(cdkObject) as CfnInputProps

    internal fun unwrap(wrapped: CfnInputProps):
        software.amazon.awscdk.services.iotevents.CfnInputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iotevents.CfnInputProps
  }
}
