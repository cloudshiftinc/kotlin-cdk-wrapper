@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource represents a `Baseline` that has been applied to a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledBaseline cfnEnabledBaseline = CfnEnabledBaseline.Builder.create(this,
 * "MyCfnEnabledBaseline")
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
public open class CfnEnabledBaseline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ARN of the `EnabledBaseline` resource.
   */
  public open fun attrEnabledBaselineIdentifier(): String =
      unwrap(this).getAttrEnabledBaselineIdentifier()

  /**
   * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
   */
  public open fun baselineIdentifier(): String = unwrap(this).getBaselineIdentifier()

  /**
   * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
   */
  public open fun baselineIdentifier(`value`: String) {
    unwrap(this).setBaselineIdentifier(`value`)
  }

  /**
   * The enabled version of the `Baseline` .
   */
  public open fun baselineVersion(): String = unwrap(this).getBaselineVersion()

  /**
   * The enabled version of the `Baseline` .
   */
  public open fun baselineVersion(`value`: String) {
    unwrap(this).setBaselineVersion(`value`)
  }

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Parameters that are applied when enabling this `Baseline` .
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Parameters that are applied when enabling this `Baseline` .
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters that are applied when enabling this `Baseline` .
   */
  public open fun parameters(_idx_ac66f0: List<Any>) {
    unwrap(this).setParameters(_idx_ac66f0)
  }

  /**
   * Parameters that are applied when enabling this `Baseline` .
   */
  public open fun parameters(vararg _idx_ac66f0: Any): Unit = parameters(_idx_ac66f0.toList())

  /**
   * Tags associated with input to `EnableBaseline` .
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags associated with input to `EnableBaseline` .
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags associated with input to `EnableBaseline` .
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The target on which to enable the `Baseline` .
   */
  public open fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()

  /**
   * The target on which to enable the `Baseline` .
   */
  public open fun targetIdentifier(`value`: String) {
    unwrap(this).setTargetIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.controltower.CfnEnabledBaseline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineidentifier)
     * @param baselineIdentifier The specific `Baseline` enabled as part of the `EnabledBaseline`
     * resource. 
     */
    public fun baselineIdentifier(baselineIdentifier: String)

    /**
     * The enabled version of the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineversion)
     * @param baselineVersion The enabled version of the `Baseline` . 
     */
    public fun baselineVersion(baselineVersion: String)

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    public fun parameters(parameters: List<Any>)

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    public fun parameters(vararg parameters: Any)

    /**
     * Tags associated with input to `EnableBaseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
     * @param tags Tags associated with input to `EnableBaseline` . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags associated with input to `EnableBaseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
     * @param tags Tags associated with input to `EnableBaseline` . 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The target on which to enable the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-targetidentifier)
     * @param targetIdentifier The target on which to enable the `Baseline` . 
     */
    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnEnabledBaseline.Builder
        = software.amazon.awscdk.services.controltower.CfnEnabledBaseline.Builder.create(scope, id)

    /**
     * The specific `Baseline` enabled as part of the `EnabledBaseline` resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineidentifier)
     * @param baselineIdentifier The specific `Baseline` enabled as part of the `EnabledBaseline`
     * resource. 
     */
    override fun baselineIdentifier(baselineIdentifier: String) {
      cdkBuilder.baselineIdentifier(baselineIdentifier)
    }

    /**
     * The enabled version of the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-baselineversion)
     * @param baselineVersion The enabled version of the `Baseline` . 
     */
    override fun baselineVersion(baselineVersion: String) {
      cdkBuilder.baselineVersion(baselineVersion)
    }

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Parameters that are applied when enabling this `Baseline` .
     *
     * These parameters configure the behavior of the baseline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-parameters)
     * @param parameters Parameters that are applied when enabling this `Baseline` . 
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * Tags associated with input to `EnableBaseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
     * @param tags Tags associated with input to `EnableBaseline` . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags associated with input to `EnableBaseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-tags)
     * @param tags Tags associated with input to `EnableBaseline` . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The target on which to enable the `Baseline` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html#cfn-controltower-enabledbaseline-targetidentifier)
     * @param targetIdentifier The target on which to enable the `Baseline` . 
     */
    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledBaseline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.controltower.CfnEnabledBaseline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnabledBaseline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnabledBaseline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline):
        CfnEnabledBaseline = CfnEnabledBaseline(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledBaseline):
        software.amazon.awscdk.services.controltower.CfnEnabledBaseline = wrapped.cdkObject
  }

  /**
   * A key-value parameter to an `EnabledBaseline` resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.controltower.*;
   * Object value;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .key("key")
   * .value(value)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html)
   */
  public interface ParameterProperty {
    /**
     * A string denoting the parameter key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html#cfn-controltower-enabledbaseline-parameter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A low-level `Document` object of any type (for example, a Java Object).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html#cfn-controltower-enabledbaseline-parameter-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A string denoting the parameter key.
       */
      public fun key(key: String)

      /**
       * @param value A low-level `Document` object of any type (for example, a Java Object).
       */
      public fun `value`(`value`: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty.Builder
          =
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty.builder()

      /**
       * @param key A string denoting the parameter key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value A low-level `Document` object of any type (for example, a Java Object).
       */
      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty,
    ) : CdkObject(cdkObject), ParameterProperty {
      /**
       * A string denoting the parameter key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html#cfn-controltower-enabledbaseline-parameter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * A low-level `Document` object of any type (for example, a Java Object).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html#cfn-controltower-enabledbaseline-parameter-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty
    }
  }
}
