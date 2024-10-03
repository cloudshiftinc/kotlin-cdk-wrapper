@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotthingsgraph

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlowTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotthingsgraph.*;
 * CfnFlowTemplateProps cfnFlowTemplateProps = CfnFlowTemplateProps.builder()
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
public interface CfnFlowTemplateProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
   */
  public fun compatibleNamespaceVersion(): Number? = unwrap(this).getCompatibleNamespaceVersion()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
   */
  public fun definition(): Any

  /**
   * A builder for [CfnFlowTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibleNamespaceVersion the value to be set.
     */
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number)

    /**
     * @param definition the value to be set. 
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition the value to be set. 
     */
    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty)

    /**
     * @param definition the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfe3444581bfba06dab5d1cceb485ad24772cf206999b808840c98162033af84")
    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps.Builder =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps.builder()

    /**
     * @param compatibleNamespaceVersion the value to be set.
     */
    override fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
      cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    /**
     * @param definition the value to be set. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition the value to be set. 
     */
    override fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
      cdkBuilder.definition(definition.let(CfnFlowTemplate.DefinitionDocumentProperty.Companion::unwrap))
    }

    /**
     * @param definition the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfe3444581bfba06dab5d1cceb485ad24772cf206999b808840c98162033af84")
    override
        fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty.Builder.() -> Unit):
        Unit = definition(CfnFlowTemplate.DefinitionDocumentProperty(definition))

    public fun build(): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps,
  ) : CdkObject(cdkObject),
      CfnFlowTemplateProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion)
     */
    override fun compatibleNamespaceVersion(): Number? =
        unwrap(this).getCompatibleNamespaceVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps):
        CfnFlowTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowTemplateProps):
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
  }
}
