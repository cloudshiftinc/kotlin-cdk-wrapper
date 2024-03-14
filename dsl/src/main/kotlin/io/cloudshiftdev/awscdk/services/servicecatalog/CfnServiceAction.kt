package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   * The self-service action identifier.
   *
   * For example, `act-fs7abcd89wxyz` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A map that defines the self-service action.
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   * A map that defines the self-service action.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map that defines the self-service action.
   */
  public open fun definition(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefinition(__idx_ac66f0)
  }

  /**
   * A map that defines the self-service action.
   */
  public open fun definition(vararg __idx_ac66f0: Any): Unit = definition(__idx_ac66f0.toList())

  /**
   * The self-service action definition type.
   */
  public open fun definitionType(): String = unwrap(this).getDefinitionType()

  /**
   * The self-service action definition type.
   */
  public open fun definitionType(`value`: String) {
    unwrap(this).setDefinitionType(`value`)
  }

  /**
   * The self-service action description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The self-service action description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The self-service action name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The self-service action name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnServiceAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(definition: IResolvable)

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(definition: List<Any>)

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    public fun definition(vararg definition: Any)

    /**
     * The self-service action definition type.
     *
     * For example, `SSM_AUTOMATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definitiontype)
     * @param definitionType The self-service action definition type. 
     */
    public fun definitionType(definitionType: String)

    /**
     * The self-service action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-description)
     * @param description The self-service action description. 
     */
    public fun description(description: String)

    /**
     * The self-service action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-name)
     * @param name The self-service action name. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder.create(scope, id)

    /**
     * The language code.
     *
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(definition: List<Any>) {
      cdkBuilder.definition(definition)
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     * @param definition A map that defines the self-service action. 
     */
    override fun definition(vararg definition: Any): Unit = definition(definition.toList())

    /**
     * The self-service action definition type.
     *
     * For example, `SSM_AUTOMATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definitiontype)
     * @param definitionType The self-service action definition type. 
     */
    override fun definitionType(definitionType: String) {
      cdkBuilder.definitionType(definitionType)
    }

    /**
     * The self-service action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-description)
     * @param description The self-service action description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The self-service action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-name)
     * @param name The self-service action name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction):
        CfnServiceAction = CfnServiceAction(cdkObject)

    internal fun unwrap(wrapped: CfnServiceAction):
        software.amazon.awscdk.services.servicecatalog.CfnServiceAction = wrapped.cdkObject
  }

  public interface DefinitionParameterProperty {
    /**
     * The parameter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html#cfn-servicecatalog-serviceaction-definitionparameter-key)
     */
    public fun key(): String

    /**
     * The value of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html#cfn-servicecatalog-serviceaction-definitionparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [DefinitionParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The parameter key. 
       */
      public fun key(key: String)

      /**
       * @param value The value of the parameter. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.builder()

      /**
       * @param key The parameter key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the parameter. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty,
    ) : CdkObject(cdkObject), DefinitionParameterProperty {
      /**
       * The parameter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html#cfn-servicecatalog-serviceaction-definitionparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html#cfn-servicecatalog-serviceaction-definitionparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty):
          DefinitionParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionParameterProperty):
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty
    }
  }
}
