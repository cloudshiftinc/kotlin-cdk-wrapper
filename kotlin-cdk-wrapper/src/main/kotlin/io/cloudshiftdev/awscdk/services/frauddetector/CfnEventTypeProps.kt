@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

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
 * Properties for defining a `CfnEventType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnEventTypeProps cfnEventTypeProps = CfnEventTypeProps.builder()
 * .entityTypes(List.of(EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .eventVariables(List.of(EventVariableProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build()))
 * .labels(List.of(LabelProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html)
 */
public interface CfnEventTypeProps {
  /**
   * The event type description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The event type entity types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
   */
  public fun entityTypes(): Any

  /**
   * The event type event variables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
   */
  public fun eventVariables(): Any

  /**
   * The event type labels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
   */
  public fun labels(): Any

  /**
   * The event type name.
   *
   * Pattern : `^[0-9a-z_-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The event type description.
     */
    public fun description(description: String)

    /**
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(entityTypes: IResolvable)

    /**
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(entityTypes: List<Any>)

    /**
     * @param entityTypes The event type entity types. 
     */
    public fun entityTypes(vararg entityTypes: Any)

    /**
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(eventVariables: IResolvable)

    /**
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(eventVariables: List<Any>)

    /**
     * @param eventVariables The event type event variables. 
     */
    public fun eventVariables(vararg eventVariables: Any)

    /**
     * @param labels The event type labels. 
     */
    public fun labels(labels: IResolvable)

    /**
     * @param labels The event type labels. 
     */
    public fun labels(labels: List<Any>)

    /**
     * @param labels The event type labels. 
     */
    public fun labels(vararg labels: Any)

    /**
     * @param name The event type name. 
     * Pattern : `^[0-9a-z_-]+$`
     */
    public fun name(name: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps.Builder
        = software.amazon.awscdk.services.frauddetector.CfnEventTypeProps.builder()

    /**
     * @param description The event type description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(entityTypes: IResolvable) {
      cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
    }

    /**
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(entityTypes: List<Any>) {
      cdkBuilder.entityTypes(entityTypes)
    }

    /**
     * @param entityTypes The event type entity types. 
     */
    override fun entityTypes(vararg entityTypes: Any): Unit = entityTypes(entityTypes.toList())

    /**
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(eventVariables: IResolvable) {
      cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
    }

    /**
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(eventVariables: List<Any>) {
      cdkBuilder.eventVariables(eventVariables)
    }

    /**
     * @param eventVariables The event type event variables. 
     */
    override fun eventVariables(vararg eventVariables: Any): Unit =
        eventVariables(eventVariables.toList())

    /**
     * @param labels The event type labels. 
     */
    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    /**
     * @param labels The event type labels. 
     */
    override fun labels(labels: List<Any>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param labels The event type labels. 
     */
    override fun labels(vararg labels: Any): Unit = labels(labels.toList())

    /**
     * @param name The event type name. 
     * Pattern : `^[0-9a-z_-]+$`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
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

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps,
  ) : CdkObject(cdkObject), CfnEventTypeProps {
    /**
     * The event type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     */
    override fun entityTypes(): Any = unwrap(this).getEntityTypes()

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     */
    override fun eventVariables(): Any = unwrap(this).getEventVariables()

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     */
    override fun labels(): Any = unwrap(this).getLabels()

    /**
     * The event type name.
     *
     * Pattern : `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps):
        CfnEventTypeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventTypeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventTypeProps):
        software.amazon.awscdk.services.frauddetector.CfnEventTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
  }
}
