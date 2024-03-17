@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnExtensionAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnExtensionAssociationProps cfnExtensionAssociationProps =
 * CfnExtensionAssociationProps.builder()
 * .extensionIdentifier("extensionIdentifier")
 * .extensionVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html)
 */
public interface CfnExtensionAssociationProps {
  /**
   * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionidentifier)
   */
  public fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

  /**
   * The version number of the extension.
   *
   * If not specified, AWS AppConfig uses the maximum version of the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionversionnumber)
   */
  public fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

  /**
   * The parameter names and values defined in the extensions.
   *
   * Extension parameters marked `Required` must be entered for this field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The ARN of an application, configuration profile, or environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * Adds one or more tags for the specified extension association.
   *
   * Tags are metadata that help you categorize resources in different ways, for example, by
   * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
   * you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnExtensionAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
     * extension.
     */
    public fun extensionIdentifier(extensionIdentifier: String)

    /**
     * @param extensionVersionNumber The version number of the extension.
     * If not specified, AWS AppConfig uses the maximum version of the extension.
     */
    public fun extensionVersionNumber(extensionVersionNumber: Number)

    /**
     * @param parameters The parameter names and values defined in the extensions.
     * Extension parameters marked `Required` must be entered for this field.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The parameter names and values defined in the extensions.
     * Extension parameters marked `Required` must be entered for this field.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param resourceIdentifier The ARN of an application, configuration profile, or environment.
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param tags Adds one or more tags for the specified extension association.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Adds one or more tags for the specified extension association.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps.builder()

    /**
     * @param extensionIdentifier The name, the ID, or the Amazon Resource Name (ARN) of the
     * extension.
     */
    override fun extensionIdentifier(extensionIdentifier: String) {
      cdkBuilder.extensionIdentifier(extensionIdentifier)
    }

    /**
     * @param extensionVersionNumber The version number of the extension.
     * If not specified, AWS AppConfig uses the maximum version of the extension.
     */
    override fun extensionVersionNumber(extensionVersionNumber: Number) {
      cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    /**
     * @param parameters The parameter names and values defined in the extensions.
     * Extension parameters marked `Required` must be entered for this field.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters The parameter names and values defined in the extensions.
     * Extension parameters marked `Required` must be entered for this field.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param resourceIdentifier The ARN of an application, configuration profile, or environment.
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param tags Adds one or more tags for the specified extension association.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Adds one or more tags for the specified extension association.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps,
  ) : CdkObject(cdkObject), CfnExtensionAssociationProps {
    /**
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionidentifier)
     */
    override fun extensionIdentifier(): String? = unwrap(this).getExtensionIdentifier()

    /**
     * The version number of the extension.
     *
     * If not specified, AWS AppConfig uses the maximum version of the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-extensionversionnumber)
     */
    override fun extensionVersionNumber(): Number? = unwrap(this).getExtensionVersionNumber()

    /**
     * The parameter names and values defined in the extensions.
     *
     * Extension parameters marked `Required` must be entered for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The ARN of an application, configuration profile, or environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-resourceidentifier)
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * Adds one or more tags for the specified extension association.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extensionassociation.html#cfn-appconfig-extensionassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExtensionAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps):
        CfnExtensionAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnExtensionAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExtensionAssociationProps):
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
  }
}
