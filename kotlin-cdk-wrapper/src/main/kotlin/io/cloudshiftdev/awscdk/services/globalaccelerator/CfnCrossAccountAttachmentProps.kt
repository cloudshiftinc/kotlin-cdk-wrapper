@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCrossAccountAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnCrossAccountAttachmentProps cfnCrossAccountAttachmentProps =
 * CfnCrossAccountAttachmentProps.builder()
 * .name("name")
 * // the properties below are optional
 * .principals(List.of("principals"))
 * .resources(List.of(ResourceProperty.builder()
 * .cidr("cidr")
 * .endpointId("endpointId")
 * .region("region")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html)
 */
public interface CfnCrossAccountAttachmentProps {
  /**
   * The name of the cross-account attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-name)
   */
  public fun name(): String

  /**
   * The principals included in the cross-account attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
   */
  public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * The resources included in the cross-account attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
   */
  public fun resources(): Any? = unwrap(this).getResources()

  /**
   * Add tags for a cross-account attachment.
   *
   * For more information, see [Tagging in AWS Global
   * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
   * in the *AWS Global Accelerator Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCrossAccountAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the cross-account attachment. 
     */
    public fun name(name: String)

    /**
     * @param principals The principals included in the cross-account attachment.
     */
    public fun principals(principals: List<String>)

    /**
     * @param principals The principals included in the cross-account attachment.
     */
    public fun principals(vararg principals: String)

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    public fun resources(resources: IResolvable)

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    public fun resources(resources: List<Any>)

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    public fun resources(vararg resources: Any)

    /**
     * @param tags Add tags for a cross-account attachment.
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Add tags for a cross-account attachment.
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps.builder()

    /**
     * @param name The name of the cross-account attachment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param principals The principals included in the cross-account attachment.
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * @param principals The principals included in the cross-account attachment.
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param resources The resources included in the cross-account attachment.
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    /**
     * @param tags Add tags for a cross-account attachment.
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Add tags for a cross-account attachment.
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnCrossAccountAttachmentProps {
    /**
     * The name of the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The principals included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
     */
    override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     */
    override fun resources(): Any? = unwrap(this).getResources()

    /**
     * Add tags for a cross-account attachment.
     *
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCrossAccountAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps):
        CfnCrossAccountAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCrossAccountAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCrossAccountAttachmentProps):
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps
  }
}
