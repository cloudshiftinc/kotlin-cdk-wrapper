@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A group of versioned models in the model registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object modelPackageGroupPolicy;
 * CfnModelPackageGroup cfnModelPackageGroup = CfnModelPackageGroup.Builder.create(this,
 * "MyCfnModelPackageGroup")
 * .modelPackageGroupName("modelPackageGroupName")
 * // the properties below are optional
 * .modelPackageGroupDescription("modelPackageGroupDescription")
 * .modelPackageGroupPolicy(modelPackageGroupPolicy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html)
 */
public open class CfnModelPackageGroup(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelPackageGroupProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnModelPackageGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelPackageGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelPackageGroupProps(props)
  )

  /**
   * The time when the model group was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The Amazon Resource Name (ARN) of the model group.
   */
  public open fun attrModelPackageGroupArn(): String = unwrap(this).getAttrModelPackageGroupArn()

  /**
   * The status of the model group.
   */
  public open fun attrModelPackageGroupStatus(): String =
      unwrap(this).getAttrModelPackageGroupStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The description for the model group.
   */
  public open fun modelPackageGroupDescription(): String? =
      unwrap(this).getModelPackageGroupDescription()

  /**
   * The description for the model group.
   */
  public open fun modelPackageGroupDescription(`value`: String) {
    unwrap(this).setModelPackageGroupDescription(`value`)
  }

  /**
   * The name of the model group.
   */
  public open fun modelPackageGroupName(): String = unwrap(this).getModelPackageGroupName()

  /**
   * The name of the model group.
   */
  public open fun modelPackageGroupName(`value`: String) {
    unwrap(this).setModelPackageGroupName(`value`)
  }

  /**
   * A resouce policy to control access to a model group.
   */
  public open fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

  /**
   * A resouce policy to control access to a model group.
   */
  public open fun modelPackageGroupPolicy(`value`: Any) {
    unwrap(this).setModelPackageGroupPolicy(`value`)
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnModelPackageGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description for the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupdescription)
     * @param modelPackageGroupDescription The description for the model group. 
     */
    public fun modelPackageGroupDescription(modelPackageGroupDescription: String)

    /**
     * The name of the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupname)
     * @param modelPackageGroupName The name of the model group. 
     */
    public fun modelPackageGroupName(modelPackageGroupName: String)

    /**
     * A resouce policy to control access to a model group.
     *
     * For information about resoure policies, see [Identity-based policies and resource-based
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group. 
     */
    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.Builder.create(scope, id)

    /**
     * The description for the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupdescription)
     * @param modelPackageGroupDescription The description for the model group. 
     */
    override fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
      cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
    }

    /**
     * The name of the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupname)
     * @param modelPackageGroupName The name of the model group. 
     */
    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * A resouce policy to control access to a model group.
     *
     * For information about resoure policies, see [Identity-based policies and resource-based
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group. 
     */
    override fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
      cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelPackageGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelPackageGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup):
        CfnModelPackageGroup = CfnModelPackageGroup(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackageGroup):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
  }
}
