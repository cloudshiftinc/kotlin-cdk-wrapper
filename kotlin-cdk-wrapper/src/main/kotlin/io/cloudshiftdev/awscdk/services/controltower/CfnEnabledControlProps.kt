@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

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
 * Properties for defining a `CfnEnabledControl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledControlProps cfnEnabledControlProps = CfnEnabledControlProps.builder()
 * .controlIdentifier("controlIdentifier")
 * .targetIdentifier("targetIdentifier")
 * // the properties below are optional
 * .parameters(List.of(EnabledControlParameterProperty.builder()
 * .key("key")
 * .value(value)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
 */
public interface CfnEnabledControlProps {
  /**
   * The ARN of the control.
   *
   * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
   * *Region deny* control. For information on how to find the `controlIdentifier` , see [the overview
   * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
   */
  public fun controlIdentifier(): String

  /**
   * Array of `EnabledControlParameter` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Tags to be applied to the enabled control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the organizational unit.
   *
   * For information on how to find the `targetIdentifier` , see [the overview
   * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
   */
  public fun targetIdentifier(): String

  /**
   * A builder for [CfnEnabledControlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param controlIdentifier The ARN of the control. 
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see [the
     * overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     */
    public fun controlIdentifier(controlIdentifier: String)

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(parameters: List<Any>)

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(vararg parameters: Any)

    /**
     * @param tags Tags to be applied to the enabled control.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to be applied to the enabled control.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetIdentifier The ARN of the organizational unit. 
     * For information on how to find the `targetIdentifier` , see [the overview
     * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     */
    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps.builder()

    /**
     * @param controlIdentifier The ARN of the control. 
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see [the
     * overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     */
    override fun controlIdentifier(controlIdentifier: String) {
      cdkBuilder.controlIdentifier(controlIdentifier)
    }

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * @param tags Tags to be applied to the enabled control.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to be applied to the enabled control.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetIdentifier The ARN of the organizational unit. 
     * For information on how to find the `targetIdentifier` , see [the overview
     * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     */
    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControlProps,
  ) : CdkObject(cdkObject), CfnEnabledControlProps {
    /**
     * The ARN of the control.
     *
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see [the
     * overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
     */
    override fun controlIdentifier(): String = unwrap(this).getControlIdentifier()

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the organizational unit.
     *
     * For information on how to find the `targetIdentifier` , see [the overview
     * page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
     */
    override fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnabledControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControlProps):
        CfnEnabledControlProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnabledControlProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledControlProps):
        software.amazon.awscdk.services.controltower.CfnEnabledControlProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnEnabledControlProps
  }
}
