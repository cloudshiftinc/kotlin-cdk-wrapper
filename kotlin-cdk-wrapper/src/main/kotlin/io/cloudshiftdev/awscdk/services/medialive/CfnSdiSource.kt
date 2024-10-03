@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::SdiSource Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnSdiSource cfnSdiSource = CfnSdiSource.Builder.create(this, "MyCfnSdiSource")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .mode("mode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html)
 */
public open class CfnSdiSource(
  cdkObject: software.amazon.awscdk.services.medialive.CfnSdiSource,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSdiSourceProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnSdiSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSdiSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSdiSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSdiSourceProps(props)
  )

  /**
   * The unique arn of the SdiSource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the SdiSource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The list of inputs currently using this SDI source.
   */
  public open fun attrInputs(): List<String> = unwrap(this).getAttrInputs()

  /**
   * The current state of the SdiSource.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The current state of the SdiSource.
   */
  public open fun mode(): String? = unwrap(this).getMode()

  /**
   * The current state of the SdiSource.
   */
  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  /**
   * The name of the SdiSource.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the SdiSource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The interface mode of the SdiSource.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The interface mode of the SdiSource.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnSdiSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current state of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-mode)
     * @param mode The current state of the SdiSource. 
     */
    public fun mode(mode: String)

    /**
     * The name of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-name)
     * @param name The name of the SdiSource. 
     */
    public fun name(name: String)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The interface mode of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-type)
     * @param type The interface mode of the SdiSource. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnSdiSource.Builder =
        software.amazon.awscdk.services.medialive.CfnSdiSource.Builder.create(scope, id)

    /**
     * The current state of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-mode)
     * @param mode The current state of the SdiSource. 
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * The name of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-name)
     * @param name The name of the SdiSource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The interface mode of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-type)
     * @param type The interface mode of the SdiSource. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnSdiSource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnSdiSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSdiSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSdiSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSdiSource):
        CfnSdiSource = CfnSdiSource(cdkObject)

    internal fun unwrap(wrapped: CfnSdiSource):
        software.amazon.awscdk.services.medialive.CfnSdiSource = wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnSdiSource
  }
}
