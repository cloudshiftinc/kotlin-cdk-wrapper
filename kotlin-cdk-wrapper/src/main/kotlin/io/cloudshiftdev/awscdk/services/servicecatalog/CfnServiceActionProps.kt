@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnServiceAction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnServiceActionProps cfnServiceActionProps = CfnServiceActionProps.builder()
 * .definition(List.of(DefinitionParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .definitionType("definitionType")
 * .name("name")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html)
 */
public interface CfnServiceActionProps {
  /**
   * The language code.
   *
   * * `en` - English (default)
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * A map that defines the self-service action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
   */
  public fun definition(): Any

  /**
   * The self-service action definition type.
   *
   * For example, `SSM_AUTOMATION` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definitiontype)
   */
  public fun definitionType(): String

  /**
   * The self-service action description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The self-service action name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnServiceActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(definition: List<Any>)

    /**
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(vararg definition: Any)

    /**
     * @param definitionType The self-service action definition type. 
     * For example, `SSM_AUTOMATION` .
     */
    public fun definitionType(definitionType: String)

    /**
     * @param description The self-service action description.
     */
    public fun description(description: String)

    /**
     * @param name The self-service action name. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(definition: List<Any>) {
      cdkBuilder.definition(definition)
    }

    /**
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(vararg definition: Any): Unit = definition(definition.toList())

    /**
     * @param definitionType The self-service action definition type. 
     * For example, `SSM_AUTOMATION` .
     */
    override fun definitionType(definitionType: String) {
      cdkBuilder.definitionType(definitionType)
    }

    /**
     * @param description The self-service action description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The self-service action name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps,
  ) : CdkObject(cdkObject), CfnServiceActionProps {
    /**
     * The language code.
     *
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * The self-service action definition type.
     *
     * For example, `SSM_AUTOMATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definitiontype)
     */
    override fun definitionType(): String = unwrap(this).getDefinitionType()

    /**
     * The self-service action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The self-service action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps):
        CfnServiceActionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServiceActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionProps):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps
  }
}
