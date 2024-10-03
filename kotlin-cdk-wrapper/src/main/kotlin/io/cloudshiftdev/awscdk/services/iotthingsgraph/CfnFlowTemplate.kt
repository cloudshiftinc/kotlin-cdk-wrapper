@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotthingsgraph

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotthingsgraph.*;
 * CfnFlowTemplate cfnFlowTemplate = CfnFlowTemplate.Builder.create(this, "MyCfnFlowTemplate")
 * .definition(DefinitionDocumentProperty.builder()
 * .language("language")
 * .text("text")
 * .build())
 * // the properties below are optional
 * .compatibleNamespaceVersion(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html)
 */
public open class CfnFlowTemplate(
  cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowTemplateProps,
  ) :
      this(software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowTemplateProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun compatibleNamespaceVersion(): Number? =
      unwrap(this).getCompatibleNamespaceVersion()

  /**
   *
   */
  public open fun compatibleNamespaceVersion(`value`: Number) {
    unwrap(this).setCompatibleNamespaceVersion(`value`)
  }

  /**
   *
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   *
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun definition(`value`: DefinitionDocumentProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionDocumentProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbfb4b5ded281f72a03b165e90c15dd3990685e549d89f205bfaa093b6442958")
  public open fun definition(`value`: DefinitionDocumentProperty.Builder.() -> Unit): Unit =
      definition(DefinitionDocumentProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotthingsgraph.CfnFlowTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
     * @param compatibleNamespaceVersion 
     */
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    public fun definition(definition: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    public fun definition(definition: DefinitionDocumentProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c331c8943b5b6668ac1676353f38fa58f716cbc4897b8c585183210d19ddbbc")
    public fun definition(definition: DefinitionDocumentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
     * @param compatibleNamespaceVersion 
     */
    override fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
      cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    override fun definition(definition: DefinitionDocumentProperty) {
      cdkBuilder.definition(definition.let(DefinitionDocumentProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     * @param definition 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c331c8943b5b6668ac1676353f38fa58f716cbc4897b8c585183210d19ddbbc")
    override fun definition(definition: DefinitionDocumentProperty.Builder.() -> Unit): Unit =
        definition(DefinitionDocumentProperty(definition))

    public fun build(): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate):
        CfnFlowTemplate = CfnFlowTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnFlowTemplate):
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotthingsgraph.*;
   * DefinitionDocumentProperty definitionDocumentProperty = DefinitionDocumentProperty.builder()
   * .language("language")
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html)
   */
  public interface DefinitionDocumentProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language)
     */
    public fun language(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text)
     */
    public fun text(): String

    /**
     * A builder for [DefinitionDocumentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param language the value to be set. 
       */
      public fun language(language: String)

      /**
       * @param text the value to be set. 
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.Builder
          =
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.builder()

      /**
       * @param language the value to be set. 
       */
      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      /**
       * @param text the value to be set. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty,
    ) : CdkObject(cdkObject),
        DefinitionDocumentProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language)
       */
      override fun language(): String = unwrap(this).getLanguage()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty):
          DefinitionDocumentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefinitionDocumentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionDocumentProperty):
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
    }
  }
}
