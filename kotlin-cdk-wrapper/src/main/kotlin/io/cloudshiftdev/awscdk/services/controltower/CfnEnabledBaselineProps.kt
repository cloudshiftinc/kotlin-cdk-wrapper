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
 * Properties for defining a `CfnEnabledBaseline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledBaselineProps cfnEnabledBaselineProps = CfnEnabledBaselineProps.builder()
 * .baselineIdentifier("baselineIdentifier")
 * .baselineVersion("baselineVersion")
 * .targetIdentifier("targetIdentifier")
 * // the properties below are optional
 * .parameters(List.of(ParameterProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html)
 */
public interface CfnEnabledBaselineProps {
  /**
   * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineidentifier)
   */
  public fun baselineIdentifier(): String

  /**
   * The enabled version of the `Baseline` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineversion)
   */
  public fun baselineVersion(): String

  /**
   * Parameters that are applied when enabling this `Baseline` .
   *
   * These parameters configure the behavior of the baseline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Tags associated with input to `EnableBaseline` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The target on which to enable the `Baseline` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-targetidentifier)
   */
  public fun targetIdentifier(): String

  /**
   * A builder for [CfnEnabledBaselineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param baselineIdentifier The specific `Baseline` enabled as part of the `EnabledBaseline`
     * resource. 
     */
    public fun baselineIdentifier(baselineIdentifier: String)

    /**
     * @param baselineVersion The enabled version of the `Baseline` . 
     */
    public fun baselineVersion(baselineVersion: String)

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    public fun parameters(parameters: List<Any>)

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    public fun parameters(vararg parameters: Any)

    /**
     * @param tags Tags associated with input to `EnableBaseline` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags associated with input to `EnableBaseline` .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetIdentifier The target on which to enable the `Baseline` . 
     */
    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps.builder()

    /**
     * @param baselineIdentifier The specific `Baseline` enabled as part of the `EnabledBaseline`
     * resource. 
     */
    override fun baselineIdentifier(baselineIdentifier: String) {
      cdkBuilder.baselineIdentifier(baselineIdentifier)
    }

    /**
     * @param baselineVersion The enabled version of the `Baseline` . 
     */
    override fun baselineVersion(baselineVersion: String) {
      cdkBuilder.baselineVersion(baselineVersion)
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` .
     * These parameters configure the behavior of the baseline.
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * @param tags Tags associated with input to `EnableBaseline` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags associated with input to `EnableBaseline` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetIdentifier The target on which to enable the `Baseline` . 
     */
    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps,
  ) : CdkObject(cdkObject), CfnEnabledBaselineProps {
    /**
     * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineidentifier)
     */
    override fun baselineIdentifier(): String = unwrap(this).getBaselineIdentifier()

    /**
     * The enabled version of the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineversion)
     */
    override fun baselineVersion(): String = unwrap(this).getBaselineVersion()

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Tags associated with input to `EnableBaseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The target on which to enable the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-targetidentifier)
     */
    override fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnabledBaselineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps):
        CfnEnabledBaselineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnabledBaselineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledBaselineProps):
        software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps
  }
}
